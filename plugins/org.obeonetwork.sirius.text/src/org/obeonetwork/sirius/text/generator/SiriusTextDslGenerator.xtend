/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.sirius.text.generator

import java.io.ByteArrayOutputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.sirius.diagram.BackgroundStyle
import org.eclipse.sirius.diagram.ContainerLayout
import org.eclipse.sirius.diagram.EdgeArrows
import org.eclipse.sirius.diagram.EdgeRouting
import org.eclipse.sirius.diagram.description.AbstractNodeMapping
import org.eclipse.sirius.diagram.description.AdditionalLayer
import org.eclipse.sirius.diagram.description.CenteringStyle
import org.eclipse.sirius.diagram.description.ContainerMapping
import org.eclipse.sirius.diagram.description.DescriptionFactory
import org.eclipse.sirius.diagram.description.DiagramDescription
import org.eclipse.sirius.diagram.description.DiagramElementMapping
import org.eclipse.sirius.diagram.description.EdgeMapping
import org.eclipse.sirius.diagram.description.style.EdgeStyleDescription
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription
import org.eclipse.sirius.diagram.description.style.StyleFactory
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription
import org.eclipse.sirius.diagram.description.tool.ToolFactory
import org.eclipse.sirius.diagram.description.tool.ToolSection
import org.eclipse.sirius.viewpoint.LabelAlignment
import org.eclipse.sirius.viewpoint.description.ColorDescription
import org.eclipse.sirius.viewpoint.description.DescriptionPackage
import org.eclipse.sirius.viewpoint.description.Group
import org.eclipse.sirius.viewpoint.description.UserColorsPalette
import org.eclipse.sirius.viewpoint.description.UserFixedColor
import org.eclipse.xtext.generator.AbstractFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess
import org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator
import org.obeonetwork.sirius.text.siriusTextDsl.Color
import org.obeonetwork.sirius.text.siriusTextDsl.Container
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation
import org.obeonetwork.sirius.text.siriusTextDsl.Designer
import org.obeonetwork.sirius.text.siriusTextDsl.Diagram
import org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle
import org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering
import org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle
import org.obeonetwork.sirius.text.siriusTextDsl.Gradient
import org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection
import org.obeonetwork.sirius.text.siriusTextDsl.Layer
import org.obeonetwork.sirius.text.siriusTextDsl.LineStyle
import org.obeonetwork.sirius.text.siriusTextDsl.Palette
import org.obeonetwork.sirius.text.siriusTextDsl.RGB
import org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge
import org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle
import org.obeonetwork.sirius.text.siriusTextDsl.Section
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile
import org.obeonetwork.sirius.text.siriusTextDsl.Tool
import org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint
import org.obeonetwork.sirius.text.siriusTextDsl.Operation
import org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation
import org.obeonetwork.sirius.text.siriusTextDsl.For
import org.obeonetwork.sirius.text.siriusTextDsl.If
import org.obeonetwork.sirius.text.siriusTextDsl.Set
import org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance
import org.obeonetwork.sirius.text.siriusTextDsl.CreateView
import org.obeonetwork.sirius.text.siriusTextDsl.Unset
import org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView
import org.obeonetwork.sirius.text.siriusTextDsl.DeleteView
import org.obeonetwork.sirius.text.siriusTextDsl.Remove
import org.obeonetwork.sirius.text.siriusTextDsl.Move
import org.obeonetwork.sirius.text.siriusTextDsl.Switch
import org.eclipse.sirius.viewpoint.description.tool.ToolPackage
import org.obeonetwork.sirius.text.siriusTextDsl.Default

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SiriusTextDslGenerator implements IMultipleResourcesGenerator {
	
	val cache = newHashMap
	
	val elementsToResolve = newHashMap
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		// do nothing we will always use a full generation
	}
	
	override doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa) {
		if (fsa instanceof AbstractFileSystemAccess) {
			val fileSystemAccess = fsa as AbstractFileSystemAccess;
			fileSystemAccess.outputPath = "./"
		}
		
		val siriusResources = resourceSet.resources.filter[r | "sirius".equals(r.URI.fileExtension)]
		val siriusFiles = siriusResources.filter[r | r.contents.size > 0 && r.contents.get(0) instanceof SiriusFile].map[r | r.contents.get(0) as SiriusFile]
		val mainFile = siriusFiles.findFirst[siriusFile | siriusFile.body instanceof Designer]
		if (mainFile != null && mainFile.body instanceof Designer) {
			val designer = mainFile.body as Designer
			
			val group = DescriptionPackage.eINSTANCE.descriptionFactory.createGroup
			this.populateGroupForDesigner(group, designer)
			this.resolveLinks()

			val outputResourceSet = new ResourceSetImpl();
			val oDesignResource = outputResourceSet.createResource(URI.createURI(""))
			oDesignResource.contents.add(group);
			
			val outputStream = new ByteArrayOutputStream()
			oDesignResource.save(outputStream, newHashMap())
			
			val content = outputStream.toString
			fsa.generateFile('description/designer.odesign', content)
		}
	}
	
	def private resolveLinks() {
		this.resolveMappingsForEdges()
		this.resolveMappingsForTools()
		this.resolveMappingsForOperations()
		cache.clear()
		elementsToResolve.clear()
	}
	
	def private resolveMappingsForOperations() {
		elementsToResolve.entrySet.filter[e | e.key instanceof CreateView].forEach[e |
			if (e.key instanceof CreateView && e.value instanceof org.eclipse.sirius.diagram.description.tool.CreateView) {
				val createView = e.key as CreateView
				val siriusCreateView = e.value as org.eclipse.sirius.diagram.description.tool.CreateView
				
				val mapping = cache.get(createView.mapping)
				if (mapping instanceof DiagramElementMapping) {
					siriusCreateView.mapping = mapping
				}
			}
		]
		
		elementsToResolve.entrySet.filter[e | e.key instanceof CreateEdgeView].forEach[e |
			if (e.key instanceof CreateEdgeView && e.value instanceof org.eclipse.sirius.diagram.description.tool.CreateEdgeView) {
				val createEdgeView = e.key as CreateEdgeView
				val siriusCreateEdgeView = e.value as org.eclipse.sirius.diagram.description.tool.CreateEdgeView
				
				val edge = cache.get(createEdgeView.edge)
				if (edge instanceof DiagramElementMapping) {
					siriusCreateEdgeView.mapping = edge
				}
			}
		]
	}
	
	def private resolveMappingsForEdges() {
		elementsToResolve.entrySet.filter[e | e.key instanceof RelationBasedEdge].forEach[e |
			if (e.key instanceof RelationBasedEdge && e.value instanceof EdgeMapping) {
				val relationBasedEdge = e.key as RelationBasedEdge
				val edgeMapping = e.value as EdgeMapping
				
				relationBasedEdge.sourceMappings.forEach[s |
					val sourceMapping = cache.get(s)
					if (sourceMapping instanceof DiagramElementMapping) {
						edgeMapping.sourceMapping.add(sourceMapping as DiagramElementMapping)
					}
				]
				
				relationBasedEdge.targetMappings.forEach[s |
					val targetMapping = cache.get(s)
					if (targetMapping instanceof DiagramElementMapping) {
						edgeMapping.targetMapping.add(targetMapping as DiagramElementMapping)
					}
				]
			}
		]
	}
	
	def private resolveMappingsForTools() {
		elementsToResolve.entrySet.filter[e | e.key instanceof Tool].forEach[t |
			if (t.key instanceof ContainerCreation && t.value instanceof ContainerCreationDescription) {
				val containerCreation = t.key as ContainerCreation
				val containerCreationDescription = t.value as ContainerCreationDescription
				
				containerCreation.containerMappings.forEach[m |
					val mapping = cache.get(m)
					if (mapping instanceof ContainerMapping) {
						containerCreationDescription.containerMappings.add(mapping)
					}
				]
				
				containerCreation.extraMappings.forEach[m |
					val mapping = cache.get(m)
					if (mapping instanceof AbstractNodeMapping) {
						containerCreationDescription.extraMappings.add(mapping)
					}
				]
			}
		]
	}
	
	def private populateGroupForDesigner(Group group, Designer designer) {
		group.name = designer.label
		group.documentation = designer.documentation
		
		designer.viewpoints.forEach[v |
			val siriusViewpoint = DescriptionPackage.eINSTANCE.descriptionFactory.createViewpoint
			group.ownedViewpoints.addAll(siriusViewpoint)
			populateViewpoint(siriusViewpoint, v)
		]
	}
	
	def private populateViewpoint(org.eclipse.sirius.viewpoint.description.Viewpoint siriusViewpoint, Viewpoint viewpoint) {
		siriusViewpoint.name = viewpoint.name
		siriusViewpoint.label = viewpoint.label
		siriusViewpoint.documentation = viewpoint.documentation
		siriusViewpoint.icon = viewpoint.icon
		siriusViewpoint.modelFileExtension = viewpoint.modelFileExtensions.reduce[a, b | a + ", " + b]
		
		viewpoint.representations.forEach[r |
			if (r instanceof Diagram) {
				val diagram = r as Diagram
				val diagramDescription = DescriptionFactory.eINSTANCE.createDiagramDescription
				siriusViewpoint.ownedRepresentations.add(diagramDescription)
				populateDiagram(diagramDescription, diagram)
			}
		]
	}
	
	def private populateDiagram(DiagramDescription diagramDescription, Diagram diagram) {
		diagramDescription.name = diagram.name
		diagramDescription.label = diagram.label
		diagramDescription.domainClass = diagram.domainClass
		diagramDescription.showOnStartup = diagram.showOnStartup
		diagramDescription.initialisation = diagram.initialized
		diagramDescription.enablePopupBars = diagram.enablePopupBars
		
		val defaultLayer = diagram.defaultLayer
		if (defaultLayer != null) {
			val siriusLayer = DescriptionFactory.eINSTANCE.createLayer
			diagramDescription.defaultLayer = siriusLayer
			this.populateDefaultLayer(siriusLayer, defaultLayer)
		}
		
		diagram.additionalLayers.forEach[l |
			val siriusLayer = DescriptionFactory.eINSTANCE.createAdditionalLayer
			diagramDescription.additionalLayers.add(siriusLayer)
			this.populateAdditionalLayer(siriusLayer, l)
		]
	}
	
	def private populateDefaultLayer(org.eclipse.sirius.diagram.description.Layer siriusLayer, Layer layer) {
		siriusLayer.name = layer.name
		layer.mappings.filter(Container).forEach[c |
			val containerMapping = DescriptionFactory.eINSTANCE.createContainerMapping
			siriusLayer.containerMappings.add(containerMapping)
			cache.put(c, containerMapping)
			this.populateContainerMapping(containerMapping, c)
		]
		
		layer.edges.filter(RelationBasedEdge).forEach[r |
			val edgeMapping = DescriptionFactory.eINSTANCE.createEdgeMapping
			siriusLayer.edgeMappings.add(edgeMapping)
			elementsToResolve.put(r, edgeMapping)
			this.populateRelationBasedEdgeMapping(edgeMapping, r)
		]
		
		layer.sections.forEach[s |
			val toolSection = ToolFactory.eINSTANCE.createToolSection
			siriusLayer.toolSections.add(toolSection)
			this.populateToolSection(toolSection, s)
		]
	}
	
	def private populateAdditionalLayer(AdditionalLayer siriusLayer, Layer layer) {
		// TODO
	}
	
	def private populateToolSection(ToolSection toolSection, Section section) {
		toolSection.name = section.name
		toolSection.label = section.label
		section.tools.forEach[t |
			if (t instanceof ContainerCreation) {
				val containerCreationDescription = ToolFactory.eINSTANCE.createContainerCreationDescription
				toolSection.ownedTools.add(containerCreationDescription)
				this.populateContainerCreationDescription(containerCreationDescription, t as ContainerCreation)
			}
		]
	}
	
	def private populateContainerCreationDescription(ContainerCreationDescription containerCreationDescription, ContainerCreation containerCreation) {
		containerCreationDescription.name = containerCreation.name
		containerCreationDescription.label = containerCreation.label
		
		val body = containerCreation.body;
		if (body != null) {
			val initialOperation = containerCreationDescription.initialOperation
			initialOperation.firstModelOperations = this.createModelOperation(body)
		}
		
		this.elementsToResolve.put(containerCreation, containerCreationDescription)
	}
	
	def private ModelOperation createModelOperation(Operation operation) {
		var ModelOperation modelOperation = null
		
		if (operation instanceof ChangeContext) {
			val changeContext = operation as ChangeContext
			val siriusChangeContext = ToolPackage.eINSTANCE.toolFactory.createChangeContext
			
			siriusChangeContext.browseExpression = this.trimQuotes(changeContext.browseExpression)
			changeContext.body.forEach[o |
				val childOperation = this.createModelOperation(o)
				siriusChangeContext.subModelOperations.add(childOperation)
			]
			
			modelOperation = siriusChangeContext
		} else if (operation instanceof For) {
			val forOperation = operation as For
			val siriusForOperation = ToolPackage.eINSTANCE.toolFactory.createFor
			
			siriusForOperation.iteratorName = this.trimQuotes(forOperation.iteratorName)
			siriusForOperation.expression = this.trimQuotes(forOperation.expression)
			forOperation.body.forEach[o |
				val childOperation = this.createModelOperation(o)
				siriusForOperation.subModelOperations.add(childOperation)
			]
			
			modelOperation = siriusForOperation
		} else if (operation instanceof If) {
			val ifOperation = operation as If
			val siriusIfOperation = ToolPackage.eINSTANCE.toolFactory.createIf
			
			siriusIfOperation.conditionExpression = this.trimQuotes(ifOperation.conditionExpression)
			ifOperation.body.forEach[o |
				val childOperation = this.createModelOperation(o)
				siriusIfOperation.subModelOperations.add(childOperation)
			]
			
			modelOperation = siriusIfOperation
		} else if (operation instanceof Set) {
			val setOperation = operation as Set
			val siriusSetOperation = ToolPackage.eINSTANCE.toolFactory.createSetValue
			
			siriusSetOperation.featureName = this.trimQuotes(setOperation.featureName)
			siriusSetOperation.valueExpression = this.trimQuotes(setOperation.valueExpression)
			setOperation.body.forEach[o |
				val childOperation = this.createModelOperation(o)
				siriusSetOperation.subModelOperations.add(childOperation)
			]
			
			modelOperation = siriusSetOperation
		} else if (operation instanceof CreateInstance) {
			val createInstance = operation as CreateInstance
			val siriusCreateInstance = ToolPackage.eINSTANCE.toolFactory.createCreateInstance
			
			siriusCreateInstance.referenceName = this.trimQuotes(createInstance.referenceName)
			siriusCreateInstance.typeName = this.trimQuotes(createInstance.type)
			siriusCreateInstance.variableName = this.trimQuotes(createInstance.variableName)
			createInstance.body.forEach[o |
				val childOperation = this.createModelOperation(o)
				siriusCreateInstance.subModelOperations.add(childOperation)
			]
			
			modelOperation = siriusCreateInstance
		} else if (operation instanceof CreateView) {
			val createView = operation as CreateView
			val siriusCreateView = ToolFactory.eINSTANCE.createCreateView
			
			siriusCreateView.containerViewExpression = this.trimQuotes(createView.containerViewExpression)
			siriusCreateView.variableName = this.trimQuotes(createView.variableName)
			createView.body.forEach[o |
				val childOperation = this.createModelOperation(o)
				siriusCreateView.subModelOperations.add(childOperation)
			]
			this.elementsToResolve.put(createView, siriusCreateView)
			
			modelOperation = siriusCreateView
		} else if (operation instanceof Unset) {
			val unset = operation as Unset
			val siriusUnset = ToolPackage.eINSTANCE.toolFactory.createUnset
			
			siriusUnset.elementExpression = this.trimQuotes(unset.elementExpression)
			siriusUnset.featureName = this.trimQuotes(unset.featureName)
			unset.body.forEach[o |
				val childOperation = this.createModelOperation(o)
				siriusUnset.subModelOperations.add(childOperation)
			]
			
			modelOperation = siriusUnset
		} else if (operation instanceof CreateEdgeView) {
			val createEdgeView = operation as CreateEdgeView
			val siriusCreateEdgeView = ToolFactory.eINSTANCE.createCreateEdgeView
			
			siriusCreateEdgeView.containerViewExpression = this.trimQuotes(createEdgeView.containerViewExpression)
			siriusCreateEdgeView.sourceExpression = this.trimQuotes(createEdgeView.sourceExpression)
			siriusCreateEdgeView.targetExpression = this.trimQuotes(createEdgeView.targetExpression)
			createEdgeView.body.forEach[o |
				val childOperation = this.createModelOperation(o)
				siriusCreateEdgeView.subModelOperations.add(childOperation)
			]
			this.elementsToResolve.put(createEdgeView, siriusCreateEdgeView)
			
			modelOperation = siriusCreateEdgeView
		} else if (operation instanceof DeleteView) {
			val deleteView = operation as DeleteView
			val siriusDeleteView = ToolPackage.eINSTANCE.toolFactory.createDeleteView
			
			deleteView.body.forEach[o |
				val childOperation = this.createModelOperation(o)
				siriusDeleteView.subModelOperations.add(childOperation)
			]
			
			modelOperation = siriusDeleteView
		} else if (operation instanceof Remove) {
			val remove = operation as Remove
			val siriusRemove = ToolPackage.eINSTANCE.toolFactory.createRemoveElement
			
			remove.body.forEach[o |
				val childOperation = this.createModelOperation(o)
				siriusRemove.subModelOperations.add(childOperation)
			]
			
			modelOperation = siriusRemove
		} else if (operation instanceof Move) {
			val move = operation as Move
			val siriusMove = ToolPackage.eINSTANCE.toolFactory.createMoveElement
			
			siriusMove.featureName = this.trimQuotes(move.featureName)
			siriusMove.newContainerExpression = this.trimQuotes(move.newContainerExpression)
			move.body.forEach[o |
				val childOperation = this.createModelOperation(o)
				siriusMove.subModelOperations.add(childOperation)
			]
			
			modelOperation = siriusMove
		} else if (operation instanceof Switch) {
			val switchOperation = operation as Switch
			val siriusSwitchOperation = ToolPackage.eINSTANCE.toolFactory.createSwitch
			
			switchOperation.cases.forEach[c |
				val siriusCase = ToolPackage.eINSTANCE.toolFactory.createCase
				siriusCase.conditionExpression = this.trimQuotes(c.conditionExpression)
				c.body.forEach[o |
					val childOperation = this.createModelOperation(o)
					siriusCase.subModelOperations.add(childOperation)
				]
				
				siriusSwitchOperation.cases.add(siriusCase)
			]
			
			if (switchOperation.^default != null) {
				val defaultOperation = switchOperation.^default as Default
				val siriusDefaultOperation = ToolPackage.eINSTANCE.toolFactory.createDefault
				
				defaultOperation.body.forEach[o |
					val childOperation = this.createModelOperation(o)
					siriusDefaultOperation.subModelOperations.add(childOperation)
				]
				
				siriusSwitchOperation.^default = siriusDefaultOperation
			}
			
			modelOperation = siriusSwitchOperation
		}
		
		return modelOperation
	}
	
	def private populateRelationBasedEdgeMapping(EdgeMapping edgeMapping, RelationBasedEdge relationBasedEdge) {
		edgeMapping.name = relationBasedEdge.name
		edgeMapping.label = relationBasedEdge.label
		edgeMapping.targetFinderExpression = this.trimQuotes(relationBasedEdge.targetFinderExpression)
		
		val style = relationBasedEdge.style
		if (style != null) {
			val edgeStyleDescription = StyleFactory.eINSTANCE.createEdgeStyleDescription
			edgeMapping.style = edgeStyleDescription
			this.populateEdgeStyleDescription(edgeStyleDescription, style)
		}
	}
	
	def private populateEdgeStyleDescription(EdgeStyleDescription edgeStyleDescription, EdgeStyle edgeStyle) {
		edgeStyleDescription.sizeComputationExpression = this.trimQuotes(edgeStyle.sizeComputationExpression)
		
		val group = this.getGroup(edgeStyleDescription)
		if (group != null && edgeStyle.strokeColor != null) {
			val colorDescription = this.getColorDescription(group, edgeStyle.strokeColor)
			edgeStyleDescription.strokeColor = colorDescription
		}
		
		edgeStyleDescription.lineStyle = this.getLineStyle(edgeStyle.lineStyle)
		edgeStyleDescription.routingStyle = this.getRoutingStyle(edgeStyle.routingStyle)
		edgeStyleDescription.sourceArrow = this.getEdgeArrows(edgeStyle.sourceArrow)
		edgeStyleDescription.targetArrow = this.getEdgeArrows(edgeStyle.targetArrow)
		edgeStyleDescription.foldingStyle = this.getFoldingStyle(edgeStyle.foldingStyle)
		edgeStyleDescription.endsCentering = this.getEndsCentering(edgeStyle.endsCentering)
	}
	
	def private org.eclipse.sirius.diagram.LineStyle getLineStyle(LineStyle lineStyle) {
		var siriusLineStyle = org.eclipse.sirius.diagram.LineStyle.SOLID_LITERAL
		if (lineStyle.equals(LineStyle.DASH_DOT)) {
			siriusLineStyle = org.eclipse.sirius.diagram.LineStyle.DASH_DOT_LITERAL
		} else if (lineStyle.equals(LineStyle.DOT)) {
			siriusLineStyle = org.eclipse.sirius.diagram.LineStyle.DOT_LITERAL
		} else if (lineStyle.equals(LineStyle.DASH)) {
			siriusLineStyle = org.eclipse.sirius.diagram.LineStyle.DASH_LITERAL
		}
		return siriusLineStyle
	}
	
	def private EdgeRouting getRoutingStyle(RoutingStyle routingStyle) {
		var edgeRouting = EdgeRouting.STRAIGHT_LITERAL
		if (routingStyle.equals(RoutingStyle.MANHATTAN)) {
			edgeRouting = EdgeRouting.MANHATTAN_LITERAL
		} else if (routingStyle.equals(RoutingStyle.TREE)) {
			edgeRouting = EdgeRouting.TREE_LITERAL
		}
		return edgeRouting
	}
	
	def private EdgeArrows getEdgeArrows(ArrowDecorator arrowDecorator) {
		var edgeArrows = EdgeArrows.NO_DECORATION_LITERAL
		if (arrowDecorator.equals(ArrowDecorator.DIAMOND)) {
			edgeArrows = EdgeArrows.DIAMOND_LITERAL
		} else if (arrowDecorator.equals(ArrowDecorator.FILL_DIAMOND)) {
			edgeArrows = EdgeArrows.FILL_DIAMOND_LITERAL
		} else if (arrowDecorator.equals(ArrowDecorator.INPUT_ARROW)) {
			edgeArrows = EdgeArrows.INPUT_ARROW_LITERAL
		} else if (arrowDecorator.equals(ArrowDecorator.INPUT_ARROW_WITH_DIAMOND)) {
			edgeArrows = EdgeArrows.INPUT_ARROW_WITH_DIAMOND_LITERAL
		} else if (arrowDecorator.equals(ArrowDecorator.INPUT_ARROW_WITH_FILL_DIAMOND)) {
			edgeArrows = EdgeArrows.INPUT_ARROW_WITH_FILL_DIAMOND_LITERAL
		} else if (arrowDecorator.equals(ArrowDecorator.INPUT_CLOSED_ARROW)) {
			edgeArrows = EdgeArrows.INPUT_CLOSED_ARROW_LITERAL
		} else if (arrowDecorator.equals(ArrowDecorator.INPUT_FILL_CLOSED_ARROW)) {
			edgeArrows = EdgeArrows.INPUT_FILL_CLOSED_ARROW_LITERAL
		} else if (arrowDecorator.equals(ArrowDecorator.OUTPUT_ARROW)) {
			edgeArrows = EdgeArrows.OUTPUT_ARROW_LITERAL
		} else if (arrowDecorator.equals(ArrowDecorator.OUTPUT_CLOSED_ARROW)) {
			edgeArrows = EdgeArrows.OUTPUT_CLOSED_ARROW_LITERAL
		} else if (arrowDecorator.equals(ArrowDecorator.OUTPUT_FILL_CLOSED_ARROW)) {
			edgeArrows = EdgeArrows.OUTPUT_FILL_CLOSED_ARROW_LITERAL
		}
		return edgeArrows
	}
	
	def private org.eclipse.sirius.diagram.description.FoldingStyle getFoldingStyle(FoldingStyle foldingStyle) {
		var siriusFoldingStyle = org.eclipse.sirius.diagram.description.FoldingStyle.NONE_LITERAL
		if (foldingStyle.equals(FoldingStyle.SOURCE)) {
			siriusFoldingStyle = org.eclipse.sirius.diagram.description.FoldingStyle.SOURCE_LITERAL
		} else if (foldingStyle.equals(FoldingStyle.TARGET)) {
			siriusFoldingStyle = org.eclipse.sirius.diagram.description.FoldingStyle.TARGET_LITERAL
		}
		return siriusFoldingStyle
	}
	
	def private CenteringStyle getEndsCentering(EndsCentering endsCentering) {
		var centeringStyle = CenteringStyle.NONE
		if (endsCentering.equals(EndsCentering.SOURCE)) {
			centeringStyle = CenteringStyle.SOURCE
		} else if (endsCentering.equals(EndsCentering.TARGET)) {
			centeringStyle = CenteringStyle.TARGET
		} else if (endsCentering.equals(EndsCentering.BOTH)) {
			centeringStyle = CenteringStyle.BOTH
		}
		return centeringStyle
	}
	
	def private populateContainerMapping(ContainerMapping containerMapping, Container container) {
		containerMapping.name = container.name
		containerMapping.label = container.label
		containerMapping.domainClass = container.domainClass
		if (container.list) {
			containerMapping.childrenPresentation = ContainerLayout.LIST
		}
		containerMapping.semanticCandidatesExpression = this.trimQuotes(container.semanticCanditatesExpression)
		
		if (container.style instanceof Gradient) {
			val gradient = container.style as Gradient
			val gradientStyle = StyleFactory.eINSTANCE.createFlatContainerStyleDescription
			containerMapping.style = gradientStyle
			this.populateGradientStyle(gradientStyle, gradient)
		}
	}
	
	def private String trimQuotes(String expressionOrLabel) {
		var result = expressionOrLabel
		if (result != null) {
			if ((result.startsWith("\"") && result.endsWith("\"")) || (result.startsWith("'") && result.endsWith("'"))) {
				result = result.substring(1)
				result = result.substring(0, result.length - 1)
			}
		}
		return result
	}
	
	def private populateGradientStyle(FlatContainerStyleDescription gradientStyle, Gradient gradient) {
		gradientStyle.labelExpression = this.trimQuotes(gradient.labelExpression)
		if (gradient.heightComputationExpression != null) {
			gradientStyle.heightComputationExpression = this.trimQuotes(gradient.heightComputationExpression)
		}
		if (gradient.widthComputationExpression != null) {
			gradientStyle.widthComputationExpression = this.trimQuotes(gradient.widthComputationExpression)
		}
		
		if (gradient.direction == GradientDirection.LEFTTORIGHT) {
			gradientStyle.backgroundStyle = BackgroundStyle.GRADIENT_LEFT_TO_RIGHT_LITERAL
		} else if (gradient.direction == GradientDirection.OBLIQUE) {
			gradientStyle.backgroundStyle = BackgroundStyle.LIQUID_LITERAL
		} else if (gradient.direction == GradientDirection.TOPTOBOTTOM) {
			gradientStyle.backgroundStyle = BackgroundStyle.GRADIENT_TOP_TO_BOTTOM_LITERAL
		}
		
		if (gradient.labelAlignment == LabelAlignment.LEFT) {
			gradientStyle.labelAlignment = LabelAlignment.LEFT
		} else if (gradient.labelAlignment == LabelAlignment.CENTER) {
			gradientStyle.labelAlignment = LabelAlignment.CENTER
		} else if (gradient.labelAlignment == LabelAlignment.RIGHT) {
			gradientStyle.labelAlignment = LabelAlignment.RIGHT
		}
		
		val group = this.getGroup(gradientStyle)
		if (gradient.backgroundColor != null && group != null) {
			gradientStyle.backgroundColor = this.getColorDescription(group, gradient.backgroundColor)	
		}
		
		if (gradient.foregroundColor != null && group != null) {
			gradientStyle.foregroundColor = this.getColorDescription(group, gradient.foregroundColor)
		}
	}
	
	def private Group getGroup(EObject eObject) {
		var tempEObject = eObject
		var Group group
		while (group == null && tempEObject != null) {
			if (tempEObject instanceof Group) {
				group = tempEObject as Group
			} else {
				tempEObject = tempEObject.eContainer
			}
		}
		return group
	}
	
	def private ColorDescription getColorDescription(Group group, Color color) {
		var ColorDescription colorDescription
		
		val eContainer = color.eContainer
		if (eContainer instanceof Palette) {
			val palette = eContainer as Palette
			
			val userPalette = group.userColorsPalettes.findFirst[p | p.name.equals(palette.name)]
			if (userPalette == null) {
				val userColorsPalette = DescriptionPackage.eINSTANCE.descriptionFactory.createUserColorsPalette
				group.userColorsPalettes.add(userColorsPalette)
				userColorsPalette.name = palette.name
				
				colorDescription = getColorInPalette(userColorsPalette, color)
			} else {
				var userColor = userPalette.entries.findFirst[c | c.name.equals(color.name)]
				if (userColor == null) {
					colorDescription = getColorInPalette(userPalette, color)
				} else if (userColor instanceof ColorDescription) {
					colorDescription = userColor as ColorDescription
				}
			}
		}
		return colorDescription;
	}
	
	def private ColorDescription getColorInPalette(UserColorsPalette userColorsPalette, Color color) {
		val userColor = DescriptionPackage.eINSTANCE.descriptionFactory.createUserFixedColor
		userColorsPalette.entries.add(userColor)
		
		populateUserFixedColor(userColor, color)
		
		return userColor
	}
	
	def private populateUserFixedColor(UserFixedColor userFixedColor, Color color) {
		userFixedColor.name = color.name
		if (color.value instanceof RGB) {
			val rgb = color.value as RGB
			userFixedColor.red = rgb.red
			userFixedColor.green = rgb.green
			userFixedColor.blue = rgb.blue
		}
	}
	
}
