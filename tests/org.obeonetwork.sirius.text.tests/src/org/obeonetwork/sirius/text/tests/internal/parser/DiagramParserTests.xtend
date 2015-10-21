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
package org.obeonetwork.sirius.text.tests.internal.parser

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.junit.runner.RunWith
import org.obeonetwork.sirius.text.SiriusTextDslInjectorProvider
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile
import org.eclipse.emf.common.util.URI

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SiriusTextDslInjectorProvider))
class DiagramParserTests {
	@Inject extension ParseHelper<SiriusFile>
	@Inject extension ValidationTestHelper
	
	@Inject ParseHelper<SiriusFile> parser
	@Inject Provider<XtextResourceSet> resourceSetProvider;
	
	@Test
	def void testParseEmptyDiagram() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithFileDocumentation() {
		'''
			/**
			 * Copyright Obeo 2015, All Rights Reserved
			 */
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithDiagramDocumentation() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			/**
			 * The Class Diagram
			 */
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithFileAndDiagramDocumentation() {
		'''
			/**
			 * Copyright Obeo 2015, All Rights Reserved
			 */
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			/**
			 * The Class Diagram
			 */
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithLabel() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram as 'Class Diagram' for 'dart.Class' {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithPrecondition() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' ? "aql:not self.abstract" {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithLabelAndPrecondition() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram as 'Class Diagram' for 'dart.Class' ? "aql:not self.abstract" {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithInitializedAnnotation() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@Initialized
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithShowOnStartupAnnotation() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@ShowOnStartup
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithEnablePopupBarsAnnotation() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@EnablePopupBars
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithAllAnnotations() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@Initialized
			@ShowOnStartup
			@EnablePopupBars
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithDocumentation() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {
				documentation = 'This is the documentation of my project'
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithMultilineDocumentation() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {
				documentation = 'This is the documentation of my project
				It is very long and it contains tons of information'
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithDomainClass() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithTitleExpression() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class'{
				titleExpression = "aql:self.newClassDiagramName()"
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithRootExpression() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class'{
				rootExpression = "aql:self"
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithDefaultLayer() {
		val resourceSet = resourceSetProvider.get;
		val defaultLayer = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner.classes.layers
			
			layer ClassLayer {
				mappings = []
				edges = []
			}
		''', URI.createURI("tmp:/defaultLayer.sirius"), resourceSet);
		defaultLayer.assertNoErrors
		
		val designer = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner
			
			import org.obeonetwork.sirius.text.dartdesigner.classes.layers.*
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class'{
				defaultLayer = ClassLayer
			}
		''', URI.createURI("tmp:/classdiagram.sirius"), resourceSet);
		designer.assertNoErrors
	}
	
	@Test
	def void testParseDiagramWithAdditionalLayers() {
		val resourceSet = resourceSetProvider.get;
		val defaultLayer = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner.classes.layers
			
			layer ClassLayer {
				mappings = []
				edges = []
			}
		''', URI.createURI("tmp:/defaultLayer.sirius"), resourceSet);
		defaultLayer.assertNoErrors
		
		val additionalLayerDiagram = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner.classes.layers
			
			layer DocumentationLayer {
				mappings = []
				edges = []
			}
		''', URI.createURI("tmp:/componentdiagram.sirius"), resourceSet);
		additionalLayerDiagram.assertNoErrors
		
		val designer = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner
			
			import org.obeonetwork.sirius.text.dartdesigner.classes.layers.*
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class'{
				additionalLayers = [
					org.obeonetwork.sirius.text.dartdesigner.classes.layers.DocumentationLayer,
					ClassLayer
				]
			}
		''', URI.createURI("tmp:/classdiagram.sirius"), resourceSet);
		designer.assertNoErrors
	}
	
	@Test
	def void testParseComplexDiagram() {
		val resourceSet = resourceSetProvider.get;
		val defaultLayer = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner.classes.layers
			
			layer ClassLayer {
				mappings = []
				edges = []
			}
		''', URI.createURI("tmp:/defaultLayer.sirius"), resourceSet);
		defaultLayer.assertNoErrors
		
		val additionalLayerDiagram = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner.classes.layers
			
			layer DocumentationLayer {
				mappings = []
				edges = []
			}
		''', URI.createURI("tmp:/componentdiagram.sirius"), resourceSet);
		additionalLayerDiagram.assertNoErrors
		
		val designer = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner
			
			import org.obeonetwork.sirius.text.dartdesigner.classes.layers.*
			
			@Initialized
			@ShowOnStartup
			@EnablePopupBars
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class'{
				titleExpression = "aql:self.newClassDiagramName()"
				rootExpression = "aql:self"
				
				defaultLayer = ClassLayer
				
				additionalLayers = [
					org.obeonetwork.sirius.text.dartdesigner.classes.layers.DocumentationLayer
				]
			}
		''', URI.createURI("tmp:/classdiagram.sirius"), resourceSet);
		designer.assertNoErrors
	}
}