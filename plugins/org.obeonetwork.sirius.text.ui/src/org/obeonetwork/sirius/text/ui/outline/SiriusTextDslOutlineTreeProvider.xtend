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
package org.obeonetwork.sirius.text.ui.outline

import org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext
import org.obeonetwork.sirius.text.ui.internal.SiriusTextDslActivator
import org.obeonetwork.sirius.text.ui.internal.SiriusTextUIPlugin
import org.obeonetwork.sirius.text.ui.utils.IconsContants
import org.eclipse.swt.graphics.Image
import org.obeonetwork.sirius.text.siriusTextDsl.Case
import org.obeonetwork.sirius.text.siriusTextDsl.Container
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation
import org.obeonetwork.sirius.text.siriusTextDsl.For
import org.obeonetwork.sirius.text.siriusTextDsl.If
import org.obeonetwork.sirius.text.siriusTextDsl.Set
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile
import org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance
import org.obeonetwork.sirius.text.siriusTextDsl.Diagram
import org.obeonetwork.sirius.text.siriusTextDsl.Section
import org.obeonetwork.sirius.text.siriusTextDsl.Switch
import org.obeonetwork.sirius.text.siriusTextDsl.Default
import org.obeonetwork.sirius.text.siriusTextDsl.Palette
import org.obeonetwork.sirius.text.siriusTextDsl.RGB
import org.obeonetwork.sirius.text.siriusTextDsl.Color
import org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration
import org.obeonetwork.sirius.text.siriusTextDsl.Import
import org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint
import org.obeonetwork.sirius.text.siriusTextDsl.Designer

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
class SiriusTextDslOutlineTreeProvider extends org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider {
	
	override protected _text(Object modelElement) {
		super._text(modelElement)
	}
	
	override protected _image(Object modelElement) {
		var Image image
		if (SiriusTextDslActivator.instance instanceof SiriusTextUIPlugin) {
			val plugin = SiriusTextDslActivator.instance as SiriusTextUIPlugin
			if (modelElement instanceof Case) {
				image = plugin.getImage(IconsContants.CASE_ICON)
			} else if (modelElement instanceof ChangeContext) {
				image = plugin.getImage(IconsContants.CHANGE_CONTEXT_ICON)
			} else if (modelElement instanceof ConditionalContainerStyleDeclaration) {
				image = plugin.getImage(IconsContants.CONDITIONAL_CONTAINER_STYLE_DESCRIPTION_ICON)
			} else if (modelElement instanceof Container) {
				image = plugin.getImage(IconsContants.CONTAINER_MAPPING_ICON)
			} else if (modelElement instanceof ContainerCreation) {
				image = plugin.getImage(IconsContants.CONTAINER_CREATION_DESCRIPTION_ICON)
			} else if (modelElement instanceof CreateInstance) {
				image = plugin.getImage(IconsContants.CREATE_INSTANCE_ICON)
			} else if (modelElement instanceof Default) {
				image = plugin.getImage(IconsContants.DEFAULT_ICON)
			} else if (modelElement instanceof Designer) {
				image = plugin.getImage(IconsContants.GROUP_ICON)
			} else if (modelElement instanceof Diagram) {
				image = plugin.getImage(IconsContants.DIAGRAM_DESCRIPTION_ICON)
			} else if (modelElement instanceof For) {
				image = plugin.getImage(IconsContants.FOR_ICON)
			} else if (modelElement instanceof If) {
				image = plugin.getImage(IconsContants.IF_ICON)
			} else if (modelElement instanceof Import) {
				image = plugin.getImage(IconsContants.IMPORT_ICON)
			} else if (modelElement instanceof Palette) {
				image = plugin.getImage(IconsContants.USER_COLORS_PALETTE_ICON)
			} else if (modelElement instanceof Color && ((modelElement as Color).value instanceof RGB)) {
				image = plugin.getImage(IconsContants.RGB_VALUES_ICON)
			} else if (modelElement instanceof Section) {
				image = plugin.getImage(IconsContants.TOOL_SECTION_ICON)
			} else if (modelElement instanceof Set) {
				image = plugin.getImage(IconsContants.SET_VALUE_ICON)
			} else if (modelElement instanceof SiriusFile) {
				image = plugin.getImage(IconsContants.PACKAGE_ICON)
			} else if (modelElement instanceof Switch) {
				image = plugin.getImage(IconsContants.SWITCH_ICON)
			} else if (modelElement instanceof Viewpoint) {
				image = plugin.getImage(IconsContants.VIEWPOINT_ICON)
			}
		}
		
		if (image == null) {
			image = super._image(modelElement)
		}
		return image
	}
	
}
