/*
 * generated by Xtext
 */
package org.obeonetwork.sirius.text.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.obeonetwork.sirius.text.services.SiriusTextDslGrammarAccess;

public class SiriusTextDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SiriusTextDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS");
	}
	
	@Override
	protected org.obeonetwork.sirius.text.parser.antlr.internal.InternalSiriusTextDslParser createParser(XtextTokenStream stream) {
		return new org.obeonetwork.sirius.text.parser.antlr.internal.InternalSiriusTextDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "SiriusFile";
	}
	
	public SiriusTextDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SiriusTextDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}