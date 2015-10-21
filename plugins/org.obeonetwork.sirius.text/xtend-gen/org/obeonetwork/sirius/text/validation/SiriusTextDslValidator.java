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
package org.obeonetwork.sirius.text.validation;

import org.eclipse.xtext.validation.Check;
import org.obeonetwork.sirius.text.siriusTextDsl.RGB;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;
import org.obeonetwork.sirius.text.validation.AbstractSiriusTextDslValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class SiriusTextDslValidator extends AbstractSiriusTextDslValidator {
  public final static String INVALID_COLOR_RANGE = "invalidColorRange";
  
  @Check
  public void checkRGBColorRange(final RGB rgb) {
    boolean _or = false;
    int _red = rgb.getRed();
    boolean _lessThan = (_red < 0);
    if (_lessThan) {
      _or = true;
    } else {
      int _red_1 = rgb.getRed();
      boolean _greaterThan = (_red_1 > 255);
      _or = _greaterThan;
    }
    if (_or) {
      this.error("The RGB red color should be between 0 and 255", SiriusTextDslPackage.Literals.RGB__RED, SiriusTextDslValidator.INVALID_COLOR_RANGE);
    }
    boolean _or_1 = false;
    int _green = rgb.getGreen();
    boolean _lessThan_1 = (_green < 0);
    if (_lessThan_1) {
      _or_1 = true;
    } else {
      int _green_1 = rgb.getGreen();
      boolean _greaterThan_1 = (_green_1 > 255);
      _or_1 = _greaterThan_1;
    }
    if (_or_1) {
      this.error("The RGB green color should be between 0 and 255", SiriusTextDslPackage.Literals.RGB__GREEN, SiriusTextDslValidator.INVALID_COLOR_RANGE);
    }
    boolean _or_2 = false;
    int _blue = rgb.getBlue();
    boolean _lessThan_2 = (_blue < 0);
    if (_lessThan_2) {
      _or_2 = true;
    } else {
      int _blue_1 = rgb.getBlue();
      boolean _greaterThan_2 = (_blue_1 > 255);
      _or_2 = _greaterThan_2;
    }
    if (_or_2) {
      this.error("The RGB blue color should be between 0 and 255", SiriusTextDslPackage.Literals.RGB__BLUE, SiriusTextDslValidator.INVALID_COLOR_RANGE);
    }
  }
}
