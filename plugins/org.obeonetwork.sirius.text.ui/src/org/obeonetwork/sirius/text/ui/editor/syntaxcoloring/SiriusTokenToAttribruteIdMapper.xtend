package org.obeonetwork.sirius.text.ui.editor.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper
import java.util.Map

class SiriusTokenToAttribruteIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	private static final Map<String, String> KEYWORDS2STYLE = newHashMap(
		"'changeContext'" -> SiriusHighlightingConfiguration.OPERATION_ID,
		"'for'" -> SiriusHighlightingConfiguration.FOR_ID,
		"'if'" -> SiriusHighlightingConfiguration.IF_ID,
		"'set'" -> SiriusHighlightingConfiguration.OPERATION_ID,
		"'featureName'" -> SiriusHighlightingConfiguration.PARAMETER_NAME_ID,
		"'valueExpression'" -> SiriusHighlightingConfiguration.PARAMETER_NAME_ID,
		"'unset'" -> SiriusHighlightingConfiguration.OPERATION_ID,
		"'elementExpression'" -> SiriusHighlightingConfiguration.PARAMETER_NAME_ID,
		"'createInstance'" -> SiriusHighlightingConfiguration.OPERATION_ID,
		"'referenceName'" -> SiriusHighlightingConfiguration.PARAMETER_NAME_ID,
		"'type'" -> SiriusHighlightingConfiguration.PARAMETER_NAME_ID,
		"'as'" -> SiriusHighlightingConfiguration.AS_ID,
		"'createView'" -> SiriusHighlightingConfiguration.OPERATION_ID,
		"'sourceExpression'" -> SiriusHighlightingConfiguration.PARAMETER_NAME_ID,
		"'targetExpression'" -> SiriusHighlightingConfiguration.PARAMETER_NAME_ID,
		"'deleteView'" -> SiriusHighlightingConfiguration.OPERATION_ID,
		"'remove'" -> SiriusHighlightingConfiguration.OPERATION_ID,
		"'move'" -> SiriusHighlightingConfiguration.OPERATION_ID,
		"'newContainerExpression'" -> SiriusHighlightingConfiguration.PARAMETER_NAME_ID,
		"'switch'" -> SiriusHighlightingConfiguration.SWITCH_ID,
		"'case'" -> SiriusHighlightingConfiguration.SWITCH_ID,
		"'default'" -> SiriusHighlightingConfiguration.SWITCH_ID,
		"'@MetamodelUris'" -> SiriusHighlightingConfiguration.ANNOTATION_ID,
		"'@ForceRefresh'" -> SiriusHighlightingConfiguration.ANNOTATION_ID,
		"'@NodeCreationVariable'" -> SiriusHighlightingConfiguration.ANNOTATION_ID,
		"'@ContainerViewVariable'" -> SiriusHighlightingConfiguration.ANNOTATION_ID
	)
	
	override protected calculateId(String tokenName, int tokenType) {
		if("RULE_DOCUMENTATION".equals(tokenName)) {
			return SiriusHighlightingConfiguration.DOCUMENTATION_ID
		} else if("RULE_STRING".equals(tokenName)) {
			return SiriusHighlightingConfiguration.STRING_ID
		} else if("RULE_EXPRESSION".equals(tokenName)) {
			return SiriusHighlightingConfiguration.EXPRESSION_ID
		} else if("RULE_SL_COMMENT".equals(tokenName)) {
			return SiriusHighlightingConfiguration.COMMENT_ID
		}
		
		val style = KEYWORDS2STYLE.get(tokenName)
		if (style != null) {
			return style
		}
		
		return super.calculateId(tokenName, tokenType)
	}
	
}