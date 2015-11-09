package org.obeonetwork.sirius.text.ui.editor.syntaxcoloring;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;
import org.obeonetwork.sirius.text.ui.editor.syntaxcoloring.SiriusHighlightingConfiguration;

@SuppressWarnings("all")
public class SiriusTokenToAttribruteIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
  private final static Map<String, String> KEYWORDS2STYLE = CollectionLiterals.<String, String>newHashMap(
    Pair.<String, String>of("\'changeContext\'", SiriusHighlightingConfiguration.OPERATION_ID), 
    Pair.<String, String>of("\'for\'", SiriusHighlightingConfiguration.FOR_ID), 
    Pair.<String, String>of("\'if\'", SiriusHighlightingConfiguration.IF_ID), 
    Pair.<String, String>of("\'set\'", SiriusHighlightingConfiguration.OPERATION_ID), 
    Pair.<String, String>of("\'featureName\'", SiriusHighlightingConfiguration.PARAMETER_NAME_ID), 
    Pair.<String, String>of("\'valueExpression\'", SiriusHighlightingConfiguration.PARAMETER_NAME_ID), 
    Pair.<String, String>of("\'unset\'", SiriusHighlightingConfiguration.OPERATION_ID), 
    Pair.<String, String>of("\'elementExpression\'", SiriusHighlightingConfiguration.PARAMETER_NAME_ID), 
    Pair.<String, String>of("\'createInstance\'", SiriusHighlightingConfiguration.OPERATION_ID), 
    Pair.<String, String>of("\'referenceName\'", SiriusHighlightingConfiguration.PARAMETER_NAME_ID), 
    Pair.<String, String>of("\'type\'", SiriusHighlightingConfiguration.PARAMETER_NAME_ID), 
    Pair.<String, String>of("\'createView\'", SiriusHighlightingConfiguration.OPERATION_ID), 
    Pair.<String, String>of("\'sourceExpression\'", SiriusHighlightingConfiguration.PARAMETER_NAME_ID), 
    Pair.<String, String>of("\'targetExpression\'", SiriusHighlightingConfiguration.PARAMETER_NAME_ID), 
    Pair.<String, String>of("\'deleteView\'", SiriusHighlightingConfiguration.OPERATION_ID), 
    Pair.<String, String>of("\'remove\'", SiriusHighlightingConfiguration.OPERATION_ID), 
    Pair.<String, String>of("\'move\'", SiriusHighlightingConfiguration.OPERATION_ID), 
    Pair.<String, String>of("\'newContainerExpression\'", SiriusHighlightingConfiguration.PARAMETER_NAME_ID), 
    Pair.<String, String>of("\'switch\'", SiriusHighlightingConfiguration.SWITCH_ID), 
    Pair.<String, String>of("\'case\'", SiriusHighlightingConfiguration.SWITCH_ID), 
    Pair.<String, String>of("\'default\'", SiriusHighlightingConfiguration.SWITCH_ID), 
    Pair.<String, String>of("\'@MetamodelUris\'", SiriusHighlightingConfiguration.ANNOTATION_ID), 
    Pair.<String, String>of("\'@ForceRefresh\'", SiriusHighlightingConfiguration.ANNOTATION_ID), 
    Pair.<String, String>of("\'@NodeCreationVariable\'", SiriusHighlightingConfiguration.ANNOTATION_ID), 
    Pair.<String, String>of("\'@ContainerViewVariable\'", SiriusHighlightingConfiguration.ANNOTATION_ID), 
    Pair.<String, String>of("\'@Initialized\'", SiriusHighlightingConfiguration.ANNOTATION_ID), 
    Pair.<String, String>of("\'@EnablePopupBars\'", SiriusHighlightingConfiguration.ANNOTATION_ID));
  
  @Override
  protected String calculateId(final String tokenName, final int tokenType) {
    boolean _equals = "RULE_DOCUMENTATION".equals(tokenName);
    if (_equals) {
      return SiriusHighlightingConfiguration.DOCUMENTATION_ID;
    } else {
      boolean _equals_1 = "RULE_STRING".equals(tokenName);
      if (_equals_1) {
        return SiriusHighlightingConfiguration.STRING_ID;
      } else {
        boolean _equals_2 = "RULE_EXPRESSION".equals(tokenName);
        if (_equals_2) {
          return SiriusHighlightingConfiguration.EXPRESSION_ID;
        } else {
          boolean _equals_3 = "RULE_SL_COMMENT".equals(tokenName);
          if (_equals_3) {
            return SiriusHighlightingConfiguration.COMMENT_ID;
          }
        }
      }
    }
    final String style = SiriusTokenToAttribruteIdMapper.KEYWORDS2STYLE.get(tokenName);
    boolean _notEquals = (!Objects.equal(style, null));
    if (_notEquals) {
      return style;
    }
    return super.calculateId(tokenName, tokenType);
  }
}
