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
import org.eclipse.sirius.diagram.description.AdditionalLayer
import org.eclipse.sirius.diagram.description.ContainerMapping
import org.eclipse.sirius.diagram.description.DescriptionFactory
import org.eclipse.sirius.diagram.description.DiagramDescription
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
import org.obeonetwork.sirius.text.siriusTextDsl.Color
import org.obeonetwork.sirius.text.siriusTextDsl.Container
import org.obeonetwork.sirius.text.siriusTextDsl.Designer
import org.obeonetwork.sirius.text.siriusTextDsl.Diagram
import org.obeonetwork.sirius.text.siriusTextDsl.Gradient
import org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection
import org.obeonetwork.sirius.text.siriusTextDsl.Layer
import org.obeonetwork.sirius.text.siriusTextDsl.Palette
import org.obeonetwork.sirius.text.siriusTextDsl.RGB
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile
import org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SiriusTextDslGenerator implements IMultipleResourcesGenerator {
	
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

			val outputResourceSet = new ResourceSetImpl();
			val oDesignResource = outputResourceSet.createResource(URI.createURI(""))
			oDesignResource.contents.add(group);
			
			val outputStream = new ByteArrayOutputStream()
			oDesignResource.save(outputStream, newHashMap())
			
			val content = outputStream.toString
			fsa.generateFile('description/designer.odesign', content)
		}
	}
	
	def populateGroupForDesigner(Group group, Designer designer) {
		group.name = designer.label
		group.documentation = designer.documentation
		
		designer.viewpoints.forEach[v |
			val siriusViewpoint = DescriptionPackage.eINSTANCE.descriptionFactory.createViewpoint
			group.ownedViewpoints.addAll(siriusViewpoint)
			populateViewpoint(siriusViewpoint, v)
		]
	}
	
	def populateViewpoint(org.eclipse.sirius.viewpoint.description.Viewpoint siriusViewpoint, Viewpoint viewpoint) {
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
	
	def populateDiagram(DiagramDescription diagramDescription, Diagram diagram) {
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
	
	def populateDefaultLayer(org.eclipse.sirius.diagram.description.Layer siriusLayer, Layer layer) {
		siriusLayer.name = layer.name
		layer.mappings.filter(Container).forEach[c |
			val containerMapping = DescriptionFactory.eINSTANCE.createContainerMapping
			siriusLayer.containerMappings.add(containerMapping)
			populateContainerMapping(containerMapping, c)
		]
	}
	
	def populateAdditionalLayer(AdditionalLayer siriusLayer, Layer layer) {
		// TODO
	}
	
	def populateContainerMapping(ContainerMapping containerMapping, Container container) {
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
	
	def String trimQuotes(String expressionOrLabel) {
		var result = expressionOrLabel
		if (result != null) {
			if ((result.startsWith("\"") && result.endsWith("\"")) || (result.startsWith("'") && result.endsWith("'"))) {
				result = result.substring(1)
				result = result.substring(0, result.length - 1)
			}
		}
		return result
	}
	
	def populateGradientStyle(FlatContainerStyleDescription gradientStyle, Gradient gradient) {
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
	
	def ColorDescription getColorDescription(Group group, Color color) {
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
	
	def ColorDescription getColorInPalette(UserColorsPalette userColorsPalette, Color color) {
		val userColor = DescriptionPackage.eINSTANCE.descriptionFactory.createUserFixedColor
		userColorsPalette.entries.add(userColor)
		
		populateUserFixedColor(userColor, color)
		
		return userColor
	}
	
	def populateUserFixedColor(UserFixedColor userFixedColor, Color color) {
		userFixedColor.name = color.name
		if (color.value instanceof RGB) {
			val rgb = color.value as RGB
			userFixedColor.red = rgb.red
			userFixedColor.green = rgb.green
			userFixedColor.blue = rgb.blue
		}
	}
	
}
