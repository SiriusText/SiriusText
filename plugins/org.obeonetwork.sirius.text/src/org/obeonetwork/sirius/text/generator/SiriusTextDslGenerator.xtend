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
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.sirius.diagram.description.DescriptionFactory
import org.eclipse.sirius.viewpoint.description.DescriptionPackage
import org.eclipse.sirius.viewpoint.description.Group
import org.eclipse.sirius.viewpoint.description.RepresentationDescription
import org.eclipse.xtext.generator.AbstractFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess
import org.obeonetwork.sirius.text.siriusTextDsl.Designer
import org.obeonetwork.sirius.text.siriusTextDsl.Diagram
import org.obeonetwork.sirius.text.siriusTextDsl.Representation
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile
import org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint
import org.obeonetwork.sirius.text.siriusTextDsl.Layer
import org.obeonetwork.sirius.text.siriusTextDsl.Container

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SiriusTextDslGenerator implements IMultipleResourcesGenerator {
	
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
			
			val group = this.getGroupForDesigner(designer)

			val outputResourceSet = new ResourceSetImpl();
			val oDesignResource = outputResourceSet.createResource(URI.createURI(""))
			oDesignResource.contents.add(group);
			
			val outputStream = new ByteArrayOutputStream()
			oDesignResource.save(outputStream, newHashMap())
			
			val content = outputStream.toString
			fsa.generateFile('description/designer.odesign', content)
		}
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		// do nothing we will always use a full generation
	}
	
	def Group getGroupForDesigner(Designer designer) {
		val group = DescriptionPackage.eINSTANCE.descriptionFactory.createGroup
		group.name = designer.label
		group.documentation = designer.documentation
		
		val viewpoints = designer.viewpoints.map[v|getViewpoint(v)]
		group.ownedViewpoints.addAll(viewpoints)
		
		return group
	}
	
	def org.eclipse.sirius.viewpoint.description.Viewpoint getViewpoint(Viewpoint viewpoint) {
		val siriusViewpoint = DescriptionPackage.eINSTANCE.descriptionFactory.createViewpoint
		siriusViewpoint.name = viewpoint.name
		siriusViewpoint.label = viewpoint.label
		siriusViewpoint.documentation = viewpoint.documentation
		siriusViewpoint.icon = viewpoint.icon
		siriusViewpoint.modelFileExtension = viewpoint.modelFileExtensions.reduce[a, b | a + ", " + b]
		
		val representations = viewpoint.representations.map[r|getRepresentation(r)]
		siriusViewpoint.ownedRepresentations.addAll(representations)
		
		return siriusViewpoint
	}
	
	def RepresentationDescription getRepresentation(Representation representation) {
		if (representation instanceof Diagram) {
			val representationDescription = DescriptionFactory.eINSTANCE.createDiagramDescription
			representationDescription.name = representation.name
			representationDescription.label = representation.label
			representationDescription.domainClass = representation.domainClass
			representationDescription.showOnStartup = representation.showOnStartup
			representationDescription.initialisation = representation.initialized
			representationDescription.enablePopupBars = representation.enablePopupBars
			
			val defaultLayer = representation.defaultLayer
			if (defaultLayer != null) {
				representationDescription.defaultLayer = this.getLayer(defaultLayer)
			}
			
			representationDescription.additionalLayers.addAll(representation.additionalLayers.map[l | this.getAdditionalLayer(l)])
			
			return representationDescription
		}
		return null
	}
	
	def org.eclipse.sirius.diagram.description.Layer getLayer(Layer layer) {
		val siriusLayer = DescriptionFactory.eINSTANCE.createLayer
		siriusLayer.containerMappings.addAll(layer.mappings.filter(Container).map[c | getContainerMapping(c)])
		return siriusLayer
	}
	
	def org.eclipse.sirius.diagram.description.AdditionalLayer getAdditionalLayer(Layer layer) {
		val siriusLayer = DescriptionFactory.eINSTANCE.createAdditionalLayer
		return siriusLayer
	}
	
	def org.eclipse.sirius.diagram.description.ContainerMapping getContainerMapping(Container container) {
		val containerMapping = DescriptionFactory.eINSTANCE.createContainerMapping
		
		containerMapping.name = container.name
		containerMapping.label = container.label
		containerMapping.domainClass = container.domainClass
		
		return containerMapping
	}
	
}
