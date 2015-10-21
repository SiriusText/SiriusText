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
  
  public final static String KEYWORD_ID = "keyword";
  
  public final static String STRING_ID = "string";
  
  public final static String EXPRESSION_ID = "expression";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.DEFAULT_ID, "Default", _defaultTextStyle);
    TextStyle _invalidTextStyle = this.invalidTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.INVALID_ID, "Invalid Symbol", _invalidTextStyle);
    TextStyle _documentationTextStyle = this.documentationTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.DOCUMENTATION_ID, "Documentation", _documentationTextStyle);
    TextStyle _keywordTextStyle = this.keywordTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.KEYWORD_ID, "Keyword", _keywordTextStyle);
    TextStyle _stringTextStyle = this.stringTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.STRING_ID, "String", _stringTextStyle);
    TextStyle _expressionTextStyle = this.expressionTextStyle();
    acceptor.acceptDefaultHighlighting(SiriusHighlightingConfiguration.EXPRESSION_ID, "Expression", _expressionTextStyle);
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
}
