/*
 * generated by Xtext
 */
package org.obeonetwork.sirius.text.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SiriusTextDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/obeonetwork/sirius/text/parser/antlr/internal/InternalSiriusTextDsl.tokens");
	}
}