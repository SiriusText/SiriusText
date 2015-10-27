package org.obeonetwork.sirius.text.ui.outline;

import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;

@SuppressWarnings("all")
public class SiriusOutlinePage extends OutlinePage {
  @Override
  protected int getDefaultExpansionLevel() {
    return Integer.MAX_VALUE;
  }
}
