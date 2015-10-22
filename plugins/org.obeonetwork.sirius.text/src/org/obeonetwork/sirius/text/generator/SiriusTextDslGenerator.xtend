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
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile
import org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint

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
		cache.clear()
		elementsToResolve.clear()
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
			populateAdditionalLayer(siriusLayer, l)
		]
	}
	
	def private populateDefaultLayer(org.eclipse.sirius.diagram.description.Layer siriusLayer, Layer layer) {
		siriusLayer.name = layer.name
		layer.mappings.filter(Container).forEach[c |
			val containerMapping = DescriptionFactory.eINSTANCE.createContainerMapping
			siriusLayer.containerMappings.add(containerMapping)
			cache.put(c, containerMapping)
			populateContainerMapping(containerMapping, c)
		]
		
		layer.edges.filter(RelationBasedEdge).forEach[r |
			val edgeMapping = DescriptionFactory.eINSTANCE.createEdgeMapping
			siriusLayer.edgeMappings.add(edgeMapping)
			elementsToResolve.put(r, edgeMapping)
			populateRelationBasedEdgeMapping(edgeMapping, r)
		]
	}
	
	def private populateAdditionalLayer(AdditionalLayer siriusLayer, Layer layer) {
		// TODO
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
