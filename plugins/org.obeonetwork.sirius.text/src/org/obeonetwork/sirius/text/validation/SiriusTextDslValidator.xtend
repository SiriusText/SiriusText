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
package org.obeonetwork.sirius.text.validation

import org.eclipse.xtext.validation.Check
import org.obeonetwork.sirius.text.siriusTextDsl.RGB
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage

//import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SiriusTextDslValidator extends AbstractSiriusTextDslValidator {
	
	public static val INVALID_COLOR_RANGE = "invalidColorRange"
	
	@Check
	def checkRGBColorRange(RGB rgb) {
		if (rgb.red < 0 || rgb.red > 255) {
			this.error("The RGB red color should be between 0 and 255", SiriusTextDslPackage.Literals.RGB__RED, INVALID_COLOR_RANGE)
		}
		if (rgb.green< 0 || rgb.green> 255) {
			this.error("The RGB green color should be between 0 and 255", SiriusTextDslPackage.Literals.RGB__GREEN, INVALID_COLOR_RANGE)
		}
		if (rgb.blue < 0 || rgb.blue > 255) {
			this.error("The RGB blue color should be between 0 and 255", SiriusTextDslPackage.Literals.RGB__BLUE, INVALID_COLOR_RANGE)
		}
	}
}
