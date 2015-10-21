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
public class DiagramParserTests {
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
  public void testParseEmptyDiagram() {
    try {
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
      _builder.append("diagram ClassDiagram for \'dart.Class\' {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithFileDocumentation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Copyright Obeo 2015, All Rights Reserved");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
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
      _builder.append("diagram ClassDiagram for \'dart.Class\' {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithDiagramDocumentation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* The Class Diagram");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("@MetamodelUris({");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder.newLine();
      _builder.append("})");
      _builder.newLine();
      _builder.append("diagram ClassDiagram for \'dart.Class\' {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithFileAndDiagramDocumentation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Copyright Obeo 2015, All Rights Reserved");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* The Class Diagram");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("@MetamodelUris({");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder.newLine();
      _builder.append("})");
      _builder.newLine();
      _builder.append("diagram ClassDiagram for \'dart.Class\' {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithLabel() {
    try {
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
      _builder.append("diagram ClassDiagram as \'Class Diagram\' for \'dart.Class\' {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithPrecondition() {
    try {
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
      _builder.append("diagram ClassDiagram for \'dart.Class\' ? \"aql:not self.abstract\" {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithLabelAndPrecondition() {
    try {
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
      _builder.append("diagram ClassDiagram as \'Class Diagram\' for \'dart.Class\' ? \"aql:not self.abstract\" {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithInitializedAnnotation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@Initialized");
      _builder.newLine();
      _builder.append("@MetamodelUris({");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder.newLine();
      _builder.append("})");
      _builder.newLine();
      _builder.append("diagram ClassDiagram for \'dart.Class\' {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithShowOnStartupAnnotation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@ShowOnStartup");
      _builder.newLine();
      _builder.append("@MetamodelUris({");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder.newLine();
      _builder.append("})");
      _builder.newLine();
      _builder.append("diagram ClassDiagram for \'dart.Class\' {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithEnablePopupBarsAnnotation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@EnablePopupBars");
      _builder.newLine();
      _builder.append("@MetamodelUris({");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder.newLine();
      _builder.append("})");
      _builder.newLine();
      _builder.append("diagram ClassDiagram for \'dart.Class\' {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithAllAnnotations() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@Initialized");
      _builder.newLine();
      _builder.append("@ShowOnStartup");
      _builder.newLine();
      _builder.append("@EnablePopupBars");
      _builder.newLine();
      _builder.append("@MetamodelUris({");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder.newLine();
      _builder.append("})");
      _builder.newLine();
      _builder.append("diagram ClassDiagram for \'dart.Class\' {}");
      _builder.newLine();
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithDocumentation() {
    try {
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
      _builder.append("\t");
      _builder.append("documentation = \'This is the documentation of my project\'");
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
  public void testParseDiagramWithMultilineDocumentation() {
    try {
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
      _builder.append("\t");
      _builder.append("documentation = \'This is the documentation of my project");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("It is very long and it contains tons of information\'");
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
  public void testParseDiagramWithDomainClass() {
    try {
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
      SiriusFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithTitleExpression() {
    try {
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
      _builder.append("diagram ClassDiagram for \'dart.Class\'{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("titleExpression = \"aql:self.newClassDiagramName()\"");
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
  public void testParseDiagramWithRootExpression() {
    try {
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
      _builder.append("diagram ClassDiagram for \'dart.Class\'{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("rootExpression = \"aql:self\"");
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
  public void testParseDiagramWithDefaultLayer() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes.layers");
      _builder.newLine();
      _builder.newLine();
      _builder.append("layer ClassLayer {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("mappings = []");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("edges = []");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      URI _createURI = URI.createURI("tmp:/defaultLayer.sirius");
      final SiriusFile defaultLayer = this.parser.parse(_builder, _createURI, resourceSet);
      this._validationTestHelper.assertNoErrors(defaultLayer);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import org.obeonetwork.sirius.text.dartdesigner.classes.layers.*");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("@MetamodelUris({");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder_1.newLine();
      _builder_1.append("})");
      _builder_1.newLine();
      _builder_1.append("diagram ClassDiagram for \'dart.Class\'{");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("defaultLayer = ClassLayer");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      URI _createURI_1 = URI.createURI("tmp:/classdiagram.sirius");
      final SiriusFile designer = this.parser.parse(_builder_1, _createURI_1, resourceSet);
      this._validationTestHelper.assertNoErrors(designer);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseDiagramWithAdditionalLayers() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes.layers");
      _builder.newLine();
      _builder.newLine();
      _builder.append("layer ClassLayer {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("mappings = []");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("edges = []");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      URI _createURI = URI.createURI("tmp:/defaultLayer.sirius");
      final SiriusFile defaultLayer = this.parser.parse(_builder, _createURI, resourceSet);
      this._validationTestHelper.assertNoErrors(defaultLayer);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package org.obeonetwork.sirius.text.dartdesigner.classes.layers");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("layer DocumentationLayer {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("mappings = []");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("edges = []");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      URI _createURI_1 = URI.createURI("tmp:/componentdiagram.sirius");
      final SiriusFile additionalLayerDiagram = this.parser.parse(_builder_1, _createURI_1, resourceSet);
      this._validationTestHelper.assertNoErrors(additionalLayerDiagram);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("import org.obeonetwork.sirius.text.dartdesigner.classes.layers.*");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("@MetamodelUris({");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder_2.newLine();
      _builder_2.append("})");
      _builder_2.newLine();
      _builder_2.append("diagram ClassDiagram for \'dart.Class\'{");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("additionalLayers = [");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("org.obeonetwork.sirius.text.dartdesigner.classes.layers.DocumentationLayer,");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("ClassLayer");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("]");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      URI _createURI_2 = URI.createURI("tmp:/classdiagram.sirius");
      final SiriusFile designer = this.parser.parse(_builder_2, _createURI_2, resourceSet);
      this._validationTestHelper.assertNoErrors(designer);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseComplexDiagram() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.obeonetwork.sirius.text.dartdesigner.classes.layers");
      _builder.newLine();
      _builder.newLine();
      _builder.append("layer ClassLayer {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("mappings = []");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("edges = []");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      URI _createURI = URI.createURI("tmp:/defaultLayer.sirius");
      final SiriusFile defaultLayer = this.parser.parse(_builder, _createURI, resourceSet);
      this._validationTestHelper.assertNoErrors(defaultLayer);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package org.obeonetwork.sirius.text.dartdesigner.classes.layers");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("layer DocumentationLayer {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("mappings = []");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("edges = []");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      URI _createURI_1 = URI.createURI("tmp:/componentdiagram.sirius");
      final SiriusFile additionalLayerDiagram = this.parser.parse(_builder_1, _createURI_1, resourceSet);
      this._validationTestHelper.assertNoErrors(additionalLayerDiagram);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("package org.obeonetwork.sirius.text.dartdesigner");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("import org.obeonetwork.sirius.text.dartdesigner.classes.layers.*");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("@Initialized");
      _builder_2.newLine();
      _builder_2.append("@ShowOnStartup");
      _builder_2.newLine();
      _builder_2.append("@EnablePopupBars");
      _builder_2.newLine();
      _builder_2.append("@MetamodelUris({");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("\'platform:/resource/org.obeonetwork.dart/model.dart.ecore#/\'");
      _builder_2.newLine();
      _builder_2.append("})");
      _builder_2.newLine();
      _builder_2.append("diagram ClassDiagram for \'dart.Class\'{");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("titleExpression = \"aql:self.newClassDiagramName()\"");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("rootExpression = \"aql:self\"");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("defaultLayer = ClassLayer");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("additionalLayers = [");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("org.obeonetwork.sirius.text.dartdesigner.classes.layers.DocumentationLayer");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("]");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      URI _createURI_2 = URI.createURI("tmp:/classdiagram.sirius");
      final SiriusFile designer = this.parser.parse(_builder_2, _createURI_2, resourceSet);
      this._validationTestHelper.assertNoErrors(designer);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
