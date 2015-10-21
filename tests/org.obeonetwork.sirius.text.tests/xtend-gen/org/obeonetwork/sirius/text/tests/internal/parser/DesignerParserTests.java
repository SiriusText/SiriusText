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
package org.obeonetwork.sirius.text.tests.internal.parser;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.obeonetwork.sirius.text.SiriusTextDslInjectorProvider;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile;

@RunWith(XtextRunner.class)
@InjectWith(SiriusTextDslInjectorProvider.class)
@SuppressWarnings("all")
public class DesignerParserTests {
  @Inject
  @Extension
  private ParseHelper<SiriusFile> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  private ParseHelper<SiriusFile> parser;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Test
  public void testParseEmptyDesigner() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithFileDocumentation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Copyright Obeo 2015, All rights reserved");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithDesignerDocumentation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* The Dart Designer");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("designer DartDesigner {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithDesignerAndFileDocumentation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Copyright Obeo 2015, All rights reserved");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* The Dart Designer");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("designer DartDesigner {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithLabel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner as \'Dart Designer\' {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithEmptyViewpoint() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner as \'Dart Designer\' {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("viewpoint Architect {}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithViewpointAndDocumentation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner as \'Dart Designer\' {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* The viewpoint used to define the structure of the application");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("viewpoint Architect {}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithMultipleEmptyViewpoints() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner as \'Dart Designer\' {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("viewpoint Architect {}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("viewpoint Reviewer {}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithMultipleViewpointsAndDocumentations() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner as \'Dart Designer\' {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* The viewpoint used to define the structure of the application");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("viewpoint Architect {}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* The viewpoint used to review the details of the application");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("viewpoint Reviewer {}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithViewpointAndLabel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner as \'Dart Designer\' {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("viewpoint Architect as \'Architect Viewpoint\' {}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithViewpointAndModelFileExtensions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner as \'Dart Designer\' {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("viewpoint Architect {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("modelFileExtensions = [\'dartspec\']");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithViewpointAndIcon() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner as \'Dart Designer\' {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("viewpoint Architect {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("icon = \'platform:/resource/org.obeonetwork.sirius.text.dartdesigner/icons/obj16/viewpoints/architect.png\'");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithViewpointAndEmptyRepresentations() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner as \'Dart Designer\' {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("viewpoint Architect {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("representations = []");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithImportDeclaration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import org.obeonetwork.sirius.text.dartdesigner.classes.ClassDiagram");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner as \'Dart Designer\' {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("viewpoint Architect {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("representations = []");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithMultipleImportDeclarations() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import org.obeonetwork.sirius.text.dartdesigner.components.*");
      _builder.newLine();
      _builder.append("import org.obeonetwork.sirius.text.dartdesigner.classes.*");
      _builder.newLine();
      _builder.newLine();
      _builder.append("designer DartDesigner as \'Dart Designer\' {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("viewpoint Architect {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("representations = []");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithRepresentationImport() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@MetamodelUris({");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder.newLine();
      _builder.append("})");
      _builder.newLine();
      _builder.append("diagram ClassDiagram for \'dart.Class\' {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      URI _createURI = URI.createURI("tmp:/classdiagram.sirius");
      final SiriusFile classDiagram = this.parser.parse(_builder, _createURI, resourceSet);
      this._validationTestHelper.assertNoErrors(classDiagram);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import org.obeonetwork.sirius.text.dartdesigner.classes.*");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("designer DartDesigner as \'Dart Designer\' {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("viewpoint Architect {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("representations = [");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("ClassDiagram");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("]");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      URI _createURI_1 = URI.createURI("tmp:/DartDesigner.sirius");
      final SiriusFile designer = this.parser.parse(_builder_1, _createURI_1, resourceSet);
      this._validationTestHelper.assertNoErrors(designer);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithRepresentationImportQualifiedName() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@MetamodelUris({");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder.newLine();
      _builder.append("})");
      _builder.newLine();
      _builder.append("diagram ClassDiagram for \'dart.Class\' {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      URI _createURI = URI.createURI("tmp:/classdiagram.sirius");
      final SiriusFile classDiagram = this.parser.parse(_builder, _createURI, resourceSet);
      this._validationTestHelper.assertNoErrors(classDiagram);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("designer DartDesigner as \'Dart Designer\' {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("viewpoint Architect {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("representations = [");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("org.obeonetwork.sirius.text.dartdesigner.classes.ClassDiagram");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("]");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      URI _createURI_1 = URI.createURI("tmp:/DartDesigner.sirius");
      final SiriusFile designer = this.parser.parse(_builder_1, _createURI_1, resourceSet);
      this._validationTestHelper.assertNoErrors(designer);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDesignerWithMultipleRepresentationImports() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@MetamodelUris({");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder.newLine();
      _builder.append("})");
      _builder.newLine();
      _builder.append("diagram ClassDiagram for \'dart.Class\' {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      URI _createURI = URI.createURI("tmp:/classdiagram.sirius");
      final SiriusFile classDiagram = this.parser.parse(_builder, _createURI, resourceSet);
      this._validationTestHelper.assertNoErrors(classDiagram);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package org.obeonetwork.sirius.text.dartdesigner.components");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("@MetamodelUris({");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder_1.newLine();
      _builder_1.append("})");
      _builder_1.newLine();
      _builder_1.append("diagram ComponentDiagram for \'dart.Class\' {");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      URI _createURI_1 = URI.createURI("tmp:/componentdiagram.sirius");
      final SiriusFile componentDiagram = this.parser.parse(_builder_1, _createURI_1, resourceSet);
      this._validationTestHelper.assertNoErrors(componentDiagram);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("import org.obeonetwork.sirius.text.dartdesigner.classes.*");
      _builder_2.newLine();
      _builder_2.append("import org.obeonetwork.sirius.text.dartdesigner.components.*");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("designer DartDesigner as \'Dart Designer\' {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("viewpoint Architect {");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("representations = [");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("ClassDiagram,");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("ComponentDiagram");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("]");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      URI _createURI_2 = URI.createURI("tmp:/DartDesigner.sirius");
      final SiriusFile designer = this.parser.parse(_builder_2, _createURI_2, resourceSet);
      this._validationTestHelper.assertNoErrors(designer);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseComplexDesigner() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@MetamodelUris({");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder.newLine();
      _builder.append("})");
      _builder.newLine();
      _builder.append("diagram ClassDiagram for \'dart.Class\' {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      URI _createURI = URI.createURI("tmp:/classdiagram.sirius");
      final SiriusFile classDiagram = this.parser.parse(_builder, _createURI, resourceSet);
      this._validationTestHelper.assertNoErrors(classDiagram);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package org.obeonetwork.sirius.text.dartdesigner.components");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("@MetamodelUris({");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder_1.newLine();
      _builder_1.append("})");
      _builder_1.newLine();
      _builder_1.append("diagram ComponentDiagram for \'dart.Class\' {");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      URI _createURI_1 = URI.createURI("tmp:/componentdiagram.sirius");
      final SiriusFile componentDiagram = this.parser.parse(_builder_1, _createURI_1, resourceSet);
      this._validationTestHelper.assertNoErrors(componentDiagram);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("import org.obeonetwork.sirius.text.dartdesigner.classes.*");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("designer DartDesigner as \'Dart Designer\' {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("viewpoint Architect {");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("modelFileExtensions = [\'dartspec\']");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("icon = \'platform:/resource/org.obeonetwork.sirius.text.dartdesigner/icons/obj16/viewpoints/architect.png\'");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("representations = [");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("ClassDiagram,");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("org.obeonetwork.sirius.text.dartdesigner.components.ComponentDiagram");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("]");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      URI _createURI_2 = URI.createURI("tmp:/DartDesigner.sirius");
      final SiriusFile designer = this.parser.parse(_builder_2, _createURI_2, resourceSet);
      this._validationTestHelper.assertNoErrors(designer);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
