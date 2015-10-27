package org.obeonetwork.sirius.text.ui.editor.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class SiriusHighlightingConfiguration implements IHighlightingConfiguration {
  public final static String DEFAULT_ID = "default";
  
  public final static String INVALID_ID = "invalid";
  
  public final static String DOCUMENTATION_ID = "documentation";
  
  public final static String COMMENT_ID = "comment";
  
  public final static String KEYWORD_ID = "keyword";
  
  public final static String STRING_ID = "string";
  
  public final static String EXPRESSION_ID = "expression";
  
  public final static String OPERATION_ID = "operation";
  
  public final static String PARAMETER_NAME_ID = "parameter name";
  
  public final static String FOR_ID = "for";
  
  public final static String IF_ID = "if";
  
  public final static String AS_ID = "as";
  
  public final static String SWITCH_ID = "switch";
  
  public final static String ANNOTATION_ID = "annotation";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.DEFAULT_ID, "Default", _defaultTextStyle);
    TextStyle _invalidTextStyle = this.invalidTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.INVALID_ID, "Invalid Symbol", _invalidTextStyle);
    TextStyle _documentationTextStyle = this.documentationTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.DOCUMENTATION_ID, "Documentation", _documentationTextStyle);
    TextStyle _commentTextStyle = this.commentTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.COMMENT_ID, "Comment", _commentTextStyle);
    TextStyle _keywordTextStyle = this.keywordTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.KEYWORD_ID, "Keyword", _keywordTextStyle);
    TextStyle _stringTextStyle = this.stringTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.STRING_ID, "String", _stringTextStyle);
    TextStyle _expressionTextStyle = this.expressionTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.EXPRESSION_ID, "Expression", _expressionTextStyle);
    TextStyle _operationTextStyle = this.operationTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.OPERATION_ID, "Operation", _operationTextStyle);
    TextStyle _parameterNameTextStyle = this.parameterNameTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.PARAMETER_NAME_ID, "Parameter Name", _parameterNameTextStyle);
    TextStyle _forTextStyle = this.forTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.FOR_ID, "For", _forTextStyle);
    TextStyle _ifTextStyle = this.ifTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.IF_ID, "If", _ifTextStyle);
    TextStyle _asTextStyle = this.asTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.AS_ID, "As", _asTextStyle);
    TextStyle _switchTextStyle = this.switchTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.SWITCH_ID, "Switch", _switchTextStyle);
    TextStyle _annotationTextStyle = this.annotationTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.ANNOTATION_ID, "As", _annotationTextStyle);
  }
  
  public TextStyle defaultTextStyle() {
    final TextStyle textStyle = new TextStyle();
    return textStyle;
  }
  
  public TextStyle invalidTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    return textStyle;
  }
  
  public TextStyle documentationTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(63, 95, 191);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle keywordTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(127, 0, 85);
    textStyle.setColor(_rGB);
    textStyle.setStyle(SWT.BOLD);
    return textStyle;
  }
  
  public TextStyle stringTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(42, 0, 255);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle expressionTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(22, 147, 165);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle operationTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    return textStyle;
  }
  
  public TextStyle parameterNameTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(85, 98, 112);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle forTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(127, 0, 85);
    textStyle.setColor(_rGB);
    textStyle.setStyle(SWT.BOLD);
    return textStyle;
  }
  
  public TextStyle ifTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(127, 0, 85);
    textStyle.setColor(_rGB);
    textStyle.setStyle(SWT.BOLD);
    return textStyle;
  }
  
  public TextStyle asTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    return textStyle;
  }
  
  public TextStyle switchTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(127, 0, 85);
    textStyle.setColor(_rGB);
    textStyle.setStyle(SWT.BOLD);
    return textStyle;
  }
  
  public TextStyle annotationTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(85, 98, 112);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle commentTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(63, 127, 95);
    textStyle.setColor(_rGB);
    return textStyle;
  }
}
