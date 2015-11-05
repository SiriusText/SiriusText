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
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.junit.runner.RunWith
import org.obeonetwork.sirius.text.SiriusTextDslInjectorProvider
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SiriusTextDslInjectorProvider))
class DesignerParserTests {
	@Inject extension ParseHelper<SiriusFile>
	@Inject extension ValidationTestHelper
	
	@Inject ParseHelper<SiriusFile> parser
	@Inject Provider<XtextResourceSet> resourceSetProvider;
	
	@Test
	def void testParseEmptyDesigner() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			designer DartDesigner {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithFileDocumentation() {
		'''
			/**
			 * Copyright Obeo 2015, All rights reserved
			 */
			package org.obeonetwork.sirius.text.dartdesigner
			
			designer DartDesigner {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithDesignerDocumentation() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			/**
			 * The Dart Designer
			 */
			designer DartDesigner {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithDesignerAndFileDocumentation() {
		'''
			/**
			 * Copyright Obeo 2015, All rights reserved
			 */
			package org.obeonetwork.sirius.text.dartdesigner
			
			/**
			 * The Dart Designer
			 */
			designer DartDesigner {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithLabel() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			designer DartDesigner as 'Dart Designer' {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithEmptyViewpoint() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			designer DartDesigner as 'Dart Designer' {
				viewpoint Architect {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithViewpointAndDocumentation() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			designer DartDesigner as 'Dart Designer' {
				/**
				 * The viewpoint used to define the structure of the application
				 */
				viewpoint Architect {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithMultipleEmptyViewpoints() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			designer DartDesigner as 'Dart Designer' {
				viewpoint Architect {}
				viewpoint Reviewer {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithMultipleViewpointsAndDocumentations() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			designer DartDesigner as 'Dart Designer' {
				/**
				 * The viewpoint used to define the structure of the application
				 */
				viewpoint Architect {}
				
				/**
				 * The viewpoint used to review the details of the application
				 */
				viewpoint Reviewer {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithViewpointAndLabel() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			designer DartDesigner as 'Dart Designer' {
				viewpoint Architect as 'Architect Viewpoint' {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithViewpointAndModelFileExtensions() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			designer DartDesigner as 'Dart Designer' {
				
				viewpoint Architect {
					modelFileExtensions = ['dartspec']
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithViewpointAndIcon() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			designer DartDesigner as 'Dart Designer' {
				
				@IconPath('/org.obeonetwork.sirius.text.dartdesigner/icons/obj16/viewpoints/architect.png')
				viewpoint Architect {
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithViewpointAndEmptyRepresentations() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			designer DartDesigner as 'Dart Designer' {
				
				viewpoint Architect {
					representations = []
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithImportDeclaration() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			import org.obeonetwork.sirius.text.dartdesigner.classes.ClassDiagram
			
			designer DartDesigner as 'Dart Designer' {
				
				viewpoint Architect {
					representations = []
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithMultipleImportDeclarations() {
		'''
			package org.obeonetwork.sirius.text.dartdesigner
			
			import org.obeonetwork.sirius.text.dartdesigner.components.*
			import org.obeonetwork.sirius.text.dartdesigner.classes.*
			
			designer DartDesigner as 'Dart Designer' {
				
				viewpoint Architect {
					representations = []
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithRepresentationImport() {
		val resourceSet = resourceSetProvider.get;
		val classDiagram = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {
			}
		''', URI.createURI("tmp:/classdiagram.sirius"), resourceSet);
		classDiagram.assertNoErrors
		
		val designer = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner
			
			import org.obeonetwork.sirius.text.dartdesigner.classes.*
			
			designer DartDesigner as 'Dart Designer' {
				
				viewpoint Architect {
					representations = [
						ClassDiagram
					]
				}
			}
		''', URI.createURI("tmp:/DartDesigner.sirius"), resourceSet);
		designer.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithRepresentationImportQualifiedName() {
		val resourceSet = resourceSetProvider.get;
		val classDiagram = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {
			}
		''', URI.createURI("tmp:/classdiagram.sirius"), resourceSet);
		classDiagram.assertNoErrors
		
		val designer = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner
			
			designer DartDesigner as 'Dart Designer' {
				
				viewpoint Architect {
					representations = [
						org.obeonetwork.sirius.text.dartdesigner.classes.ClassDiagram
					]
				}
			}
		''', URI.createURI("tmp:/DartDesigner.sirius"), resourceSet);
		designer.assertNoErrors
	}
	
	@Test
	def void testParseDesignerWithMultipleRepresentationImports() {
		val resourceSet = resourceSetProvider.get;
		val classDiagram = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {
			}
		''', URI.createURI("tmp:/classdiagram.sirius"), resourceSet);
		classDiagram.assertNoErrors
		
		val componentDiagram = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner.components
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ComponentDiagram for 'dart.Class' {
			}
		''', URI.createURI("tmp:/componentdiagram.sirius"), resourceSet);
		componentDiagram.assertNoErrors
		
		val designer = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner
			
			import org.obeonetwork.sirius.text.dartdesigner.classes.*
			import org.obeonetwork.sirius.text.dartdesigner.components.*
			
			designer DartDesigner as 'Dart Designer' {
				
				viewpoint Architect {
					representations = [
						ClassDiagram,
						ComponentDiagram
					]
				}
			}
		''', URI.createURI("tmp:/DartDesigner.sirius"), resourceSet);
		designer.assertNoErrors
	}

	@Test
	def void testParseComplexDesigner() {
		val resourceSet = resourceSetProvider.get;
		val classDiagram = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner.classes
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ClassDiagram for 'dart.Class' {
			}
		''', URI.createURI("tmp:/classdiagram.sirius"), resourceSet);
		classDiagram.assertNoErrors
		
		val componentDiagram = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner.components
			
			@MetamodelUris({
				'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/'
			})
			diagram ComponentDiagram for 'dart.Class' {
			}
		''', URI.createURI("tmp:/componentdiagram.sirius"), resourceSet);
		componentDiagram.assertNoErrors
		
		val designer = parser.parse('''
			package org.obeonetwork.sirius.text.dartdesigner
			
			import org.obeonetwork.sirius.text.dartdesigner.classes.*
			
			designer DartDesigner as 'Dart Designer' {
				
				@IconPath('/org.obeonetwork.sirius.text.dartdesigner/icons/obj16/viewpoints/architect.png')
				viewpoint Architect {
					modelFileExtensions = ['dartspec']
					representations = [
						ClassDiagram,
						org.obeonetwork.sirius.text.dartdesigner.components.ComponentDiagram
					]
				}
				
			}
		''', URI.createURI("tmp:/DartDesigner.sirius"), resourceSet);
		designer.assertNoErrors
	}
	
}