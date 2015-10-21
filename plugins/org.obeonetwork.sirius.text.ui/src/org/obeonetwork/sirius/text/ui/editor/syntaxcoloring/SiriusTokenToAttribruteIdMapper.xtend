package org.obeonetwork.sirius.text.ui.editor.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper

class SiriusTokenToAttribruteIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	override protected calculateId(String tokenName, int tokenType) {
		if("RULE_DOCUMENTATION".equals(tokenName)) {
			return SiriusHighlightingConfiguration.DOCUMENTATION_ID
		} else if("RULE_STRING".equals(tokenName)) {
			return SiriusHighlightingConfiguration.STRING_ID
		} else if("RULE_EXPRESSION".equals(tokenName)) {
			return SiriusHighlightingConfiguration.EXPRESSION_ID
		}
		return super.calculateId(tokenName, tokenType)
	}
	
}