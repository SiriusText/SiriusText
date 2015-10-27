package org.obeonetwork.sirius.text.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage

class SiriusOutlinePage extends OutlinePage {
	
	override protected getDefaultExpansionLevel() {
		return Integer.MAX_VALUE
	}
	
}