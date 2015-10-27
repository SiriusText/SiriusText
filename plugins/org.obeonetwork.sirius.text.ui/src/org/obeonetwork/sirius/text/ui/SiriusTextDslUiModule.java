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
package org.obeonetwork.sirius.text.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SiriusTextDslUiModule extends org.obeonetwork.sirius.text.ui.AbstractSiriusTextDslUiModule {
	public SiriusTextDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
		return org.obeonetwork.sirius.text.ui.builder.SiriusTextBuilderParticipant.class;
	}
	
	public Class<? extends IHighlightingConfiguration> bindILexicalHighlightingConfiguration() {
		return org.obeonetwork.sirius.text.ui.editor.syntaxcoloring.SiriusHighlightingConfiguration.class;
	}
	
	public Class<? extends DefaultAntlrTokenToAttributeIdMapper> bindTokenToAttributeMapper() {
		return org.obeonetwork.sirius.text.ui.editor.syntaxcoloring.SiriusTokenToAttribruteIdMapper.class;
	}
	
	@Override
	public Class<? extends IContentOutlinePage> bindIContentOutlinePage() {
		return org.obeonetwork.sirius.text.ui.outline.SiriusOutlinePage.class;
	}
	
}
