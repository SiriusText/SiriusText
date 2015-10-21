package org.obeonetwork.sirius.text.ui.editor.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.SWT

class SiriusHighlightingConfiguration implements IHighlightingConfiguration {
	public static final String DEFAULT_ID = "default"
	public static final String INVALID_ID = "invalid"
	public static final String DOCUMENTATION_ID = "documentation"
	public static final String KEYWORD_ID = "keyword"
	public static final String STRING_ID = "string"
	public static final String EXPRESSION_ID = "expression"
	
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle)
		acceptor.acceptDefaultHighlighting(INVALID_ID, "Invalid Symbol", invalidTextStyle)
		acceptor.acceptDefaultHighlighting(DOCUMENTATION_ID, "Documentation", documentationTextStyle)
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle)
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle)
		acceptor.acceptDefaultHighlighting(EXPRESSION_ID, "Expression", expressionTextStyle)
	}
	
	def TextStyle defaultTextStyle() {
		val textStyle = new TextStyle()
		return textStyle
	}
	
	def TextStyle invalidTextStyle() {
		val textStyle = defaultTextStyle.copy
		return textStyle
	}
	
	def TextStyle documentationTextStyle() {
		val textStyle = defaultTextStyle.copy
		textStyle.setColor(new RGB(63, 95, 191))
		return textStyle
	}
	
	def TextStyle keywordTextStyle() {
		val textStyle = defaultTextStyle.copy
		textStyle.setColor(new RGB(127, 0, 85))
		textStyle.setStyle(SWT.BOLD)
		return textStyle
	}
	
	def TextStyle stringTextStyle() {
		val textStyle = defaultTextStyle.copy
		textStyle.setColor(new RGB(42, 0, 255));
		return textStyle
	}
	
	def TextStyle expressionTextStyle() {
		val textStyle = defaultTextStyle.copy
		textStyle.setColor(new RGB(22, 147, 165))
		return textStyle
	}
}