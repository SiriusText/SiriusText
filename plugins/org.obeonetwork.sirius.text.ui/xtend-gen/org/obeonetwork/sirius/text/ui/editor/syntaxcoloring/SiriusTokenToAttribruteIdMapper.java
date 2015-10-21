package org.obeonetwork.sirius.text.ui.editor.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.obeonetwork.sirius.text.ui.editor.syntaxcoloring.SiriusHighlightingConfiguration;

@SuppressWarnings("all")
public class SiriusTokenToAttribruteIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
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
        }
      }
    }
    return super.calculateId(tokenName, tokenType);
  }
}
