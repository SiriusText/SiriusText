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
package org.obeonetwork.sirius.text.ui.outline;

import com.google.common.base.Objects;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.obeonetwork.sirius.text.siriusTextDsl.Case;
import org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext;
import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.ColorValue;
import org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration;
import org.obeonetwork.sirius.text.siriusTextDsl.Container;
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation;
import org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance;
import org.obeonetwork.sirius.text.siriusTextDsl.Default;
import org.obeonetwork.sirius.text.siriusTextDsl.Designer;
import org.obeonetwork.sirius.text.siriusTextDsl.Diagram;
import org.obeonetwork.sirius.text.siriusTextDsl.For;
import org.obeonetwork.sirius.text.siriusTextDsl.If;
import org.obeonetwork.sirius.text.siriusTextDsl.Import;
import org.obeonetwork.sirius.text.siriusTextDsl.Palette;
import org.obeonetwork.sirius.text.siriusTextDsl.RGB;
import org.obeonetwork.sirius.text.siriusTextDsl.Section;
import org.obeonetwork.sirius.text.siriusTextDsl.Set;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile;
import org.obeonetwork.sirius.text.siriusTextDsl.Switch;
import org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint;
import org.obeonetwork.sirius.text.ui.internal.SiriusTextDslActivator;
import org.obeonetwork.sirius.text.ui.internal.SiriusTextUIPlugin;
import org.obeonetwork.sirius.text.ui.utils.IconsContants;

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
@SuppressWarnings("all")
public class SiriusTextDslOutlineTreeProvider extends DefaultOutlineTreeProvider {
  @Override
  protected Object _text(final Object modelElement) {
    return super._text(modelElement);
  }
  
  @Override
  protected Image _image(final Object modelElement) {
    Image image = null;
    SiriusTextDslActivator _instance = SiriusTextDslActivator.getInstance();
    if ((_instance instanceof SiriusTextUIPlugin)) {
      SiriusTextDslActivator _instance_1 = SiriusTextDslActivator.getInstance();
      final SiriusTextUIPlugin plugin = ((SiriusTextUIPlugin) _instance_1);
      if ((modelElement instanceof Case)) {
        Image _image = plugin.getImage(IconsContants.CASE_ICON);
        image = _image;
      } else {
        if ((modelElement instanceof ChangeContext)) {
          Image _image_1 = plugin.getImage(IconsContants.CHANGE_CONTEXT_ICON);
          image = _image_1;
        } else {
          if ((modelElement instanceof ConditionalContainerStyleDeclaration)) {
            Image _image_2 = plugin.getImage(IconsContants.CONDITIONAL_CONTAINER_STYLE_DESCRIPTION_ICON);
            image = _image_2;
          } else {
            if ((modelElement instanceof Container)) {
              Image _image_3 = plugin.getImage(IconsContants.CONTAINER_MAPPING_ICON);
              image = _image_3;
            } else {
              if ((modelElement instanceof ContainerCreation)) {
                Image _image_4 = plugin.getImage(IconsContants.CONTAINER_CREATION_DESCRIPTION_ICON);
                image = _image_4;
              } else {
                if ((modelElement instanceof CreateInstance)) {
                  Image _image_5 = plugin.getImage(IconsContants.CREATE_INSTANCE_ICON);
                  image = _image_5;
                } else {
                  if ((modelElement instanceof Default)) {
                    Image _image_6 = plugin.getImage(IconsContants.DEFAULT_ICON);
                    image = _image_6;
                  } else {
                    if ((modelElement instanceof Designer)) {
                      Image _image_7 = plugin.getImage(IconsContants.GROUP_ICON);
                      image = _image_7;
                    } else {
                      if ((modelElement instanceof Diagram)) {
                        Image _image_8 = plugin.getImage(IconsContants.DIAGRAM_DESCRIPTION_ICON);
                        image = _image_8;
                      } else {
                        if ((modelElement instanceof For)) {
                          Image _image_9 = plugin.getImage(IconsContants.FOR_ICON);
                          image = _image_9;
                        } else {
                          if ((modelElement instanceof If)) {
                            Image _image_10 = plugin.getImage(IconsContants.IF_ICON);
                            image = _image_10;
                          } else {
                            if ((modelElement instanceof Import)) {
                              Image _image_11 = plugin.getImage(IconsContants.IMPORT_ICON);
                              image = _image_11;
                            } else {
                              if ((modelElement instanceof Palette)) {
                                Image _image_12 = plugin.getImage(IconsContants.USER_COLORS_PALETTE_ICON);
                                image = _image_12;
                              } else {
                                boolean _and = false;
                                if (!(modelElement instanceof Color)) {
                                  _and = false;
                                } else {
                                  ColorValue _value = ((Color) modelElement).getValue();
                                  _and = (_value instanceof RGB);
                                }
                                if (_and) {
                                  Image _image_13 = plugin.getImage(IconsContants.RGB_VALUES_ICON);
                                  image = _image_13;
                                } else {
                                  if ((modelElement instanceof Section)) {
                                    Image _image_14 = plugin.getImage(IconsContants.TOOL_SECTION_ICON);
                                    image = _image_14;
                                  } else {
                                    if ((modelElement instanceof Set)) {
                                      Image _image_15 = plugin.getImage(IconsContants.SET_VALUE_ICON);
                                      image = _image_15;
                                    } else {
                                      if ((modelElement instanceof SiriusFile)) {
                                        Image _image_16 = plugin.getImage(IconsContants.PACKAGE_ICON);
                                        image = _image_16;
                                      } else {
                                        if ((modelElement instanceof Switch)) {
                                          Image _image_17 = plugin.getImage(IconsContants.SWITCH_ICON);
                                          image = _image_17;
                                        } else {
                                          if ((modelElement instanceof Viewpoint)) {
                                            Image _image_18 = plugin.getImage(IconsContants.VIEWPOINT_ICON);
                                            image = _image_18;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    boolean _equals = Objects.equal(image, null);
    if (_equals) {
      Image __image = super._image(modelElement);
      image = __image;
    }
    return image;
  }
}
