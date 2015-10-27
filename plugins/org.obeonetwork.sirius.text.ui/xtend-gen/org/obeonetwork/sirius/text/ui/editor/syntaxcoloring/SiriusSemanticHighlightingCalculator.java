package org.obeonetwork.sirius.text.ui.editor.syntaxcoloring;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.ITextRegion;
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFileBody;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;
import org.obeonetwork.sirius.text.ui.editor.syntaxcoloring.SiriusHighlightingConfiguration;

@SuppressWarnings("all")
public class SiriusSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {
  private final static String CHANGE_CONTEXT_KEYWORD = "changeContext";
  
  private final static String FOR_KEYWORD = "for";
  
  private final static String IF_KEYWORD = "if";
  
  private final static String SET_KEYWORD = "set";
  
  private final static String FEATURE_NAME_KEYWORD = "featureName";
  
  private final static String VALUE_EXPRESSION_KEYWORD = "valueExpression";
  
  private final static String UNSET_KEYWORD = "unset";
  
  private final static String ELEMENT_EXPRESSION_KEYWORD = "elementExpression";
  
  private final static String CREATE_INSTANCE_KEYWORD = "createInstance";
  
  private final static String REFERENCE_NAME_KEYWORD = "referenceName";
  
  private final static String TYPE_KEYWORD = "type";
  
  private final static String AS_KEYWORD = "as";
  
  private final static String CREATE_VIEW_KEYWORD = "createView";
  
  private final static String MAPPING_KEYWORD = "mapping";
  
  private final static String CONTAINER_VIEW_EXPRESSION_KEYWORD = "containerViewExpression";
  
  private final static String CREATE_EDGE_VIEW_KEYWORD = "createEdgeView";
  
  private final static String SOURCE_EXPRESSION_KEYWORD = "sourceExpression";
  
  private final static String TARGET_EXPRESSION_KEYWORD = "targetExpression";
  
  private final static String DELETE_VIEW_KEYWORD = "deleteView";
  
  private final static String REMOVE_KEYWORD = "remove";
  
  private final static String MOVE_KEYWORD = "move";
  
  private final static String NEW_CONTAINER_EXPRESSION_KEYWORD = "newContainerExpression";
  
  private final static String SWITCH_KEYWORD = "switch";
  
  private final static String CASE_KEYWORD = "case";
  
  private final static String DEFAULT_KEYWORD = "default";
  
  @Override
  public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptator, final CancelIndicator cancelIndicator) {
    final EList<EObject> contents = resource.getContents();
    boolean _and = false;
    int _size = contents.size();
    boolean _equals = (_size == 1);
    if (!_equals) {
      _and = false;
    } else {
      EObject _get = contents.get(0);
      _and = (_get instanceof SiriusFile);
    }
    if (_and) {
      EObject _get_1 = contents.get(0);
      final SiriusFile siriusFile = ((SiriusFile) _get_1);
      final SiriusFileBody body = siriusFile.getBody();
      if ((body instanceof ContainerCreation)) {
        final ContainerCreation containerCreation = ((ContainerCreation) body);
        this.provideHighlightingForContainerCreation(containerCreation, acceptator, cancelIndicator);
      }
    }
  }
  
  private void provideHighlightingForContainerCreation(final ContainerCreation containerCreation, final IHighlightedPositionAcceptor acceptator, final CancelIndicator cancelIndicator) {
    final List<INode> bodyNodes = NodeModelUtils.findNodesForFeature(containerCreation, SiriusTextDslPackage.Literals.CONTAINER_CREATION__BODY);
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(bodyNodes, null));
    if (!_notEquals) {
      _and = false;
    } else {
      int _size = bodyNodes.size();
      boolean _equals = (_size == 1);
      _and = _equals;
    }
    if (_and) {
      INode _get = bodyNodes.get(0);
      this.provideHighlightingForOperationBody(_get, acceptator, cancelIndicator);
    }
  }
  
  private void provideHighlightingForOperationBody(final INode node, final IHighlightedPositionAcceptor acceptator, final CancelIndicator cancelIndicator) {
    Iterable<ILeafNode> _leafNodes = node.getLeafNodes();
    for (final ILeafNode leafNode : _leafNodes) {
      {
        final EObject grammarElement = leafNode.getGrammarElement();
        boolean _and = false;
        if (!(grammarElement instanceof Keyword)) {
          _and = false;
        } else {
          boolean _isCanceled = cancelIndicator.isCanceled();
          boolean _not = (!_isCanceled);
          _and = _not;
        }
        if (_and) {
          final Keyword keyword = ((Keyword) grammarElement);
          final String value = keyword.getValue();
          boolean _equals = SiriusSemanticHighlightingCalculator.CHANGE_CONTEXT_KEYWORD.equals(value);
          if (_equals) {
            ITextRegion _textRegion = leafNode.getTextRegion();
            int _offset = _textRegion.getOffset();
            ITextRegion _textRegion_1 = leafNode.getTextRegion();
            int _length = _textRegion_1.getLength();
            acceptator.addPosition(_offset, _length, SiriusHighlightingConfiguration.OPERATION_ID);
          } else {
            boolean _equals_1 = SiriusSemanticHighlightingCalculator.FOR_KEYWORD.equals(value);
            if (_equals_1) {
              ITextRegion _textRegion_2 = leafNode.getTextRegion();
              int _offset_1 = _textRegion_2.getOffset();
              ITextRegion _textRegion_3 = leafNode.getTextRegion();
              int _length_1 = _textRegion_3.getLength();
              acceptator.addPosition(_offset_1, _length_1, SiriusHighlightingConfiguration.FOR_ID);
            } else {
              boolean _equals_2 = SiriusSemanticHighlightingCalculator.IF_KEYWORD.equals(value);
              if (_equals_2) {
                ITextRegion _textRegion_4 = leafNode.getTextRegion();
                int _offset_2 = _textRegion_4.getOffset();
                ITextRegion _textRegion_5 = leafNode.getTextRegion();
                int _length_2 = _textRegion_5.getLength();
                acceptator.addPosition(_offset_2, _length_2, SiriusHighlightingConfiguration.IF_ID);
              } else {
                boolean _equals_3 = SiriusSemanticHighlightingCalculator.SET_KEYWORD.equals(value);
                if (_equals_3) {
                  ITextRegion _textRegion_6 = leafNode.getTextRegion();
                  int _offset_3 = _textRegion_6.getOffset();
                  ITextRegion _textRegion_7 = leafNode.getTextRegion();
                  int _length_3 = _textRegion_7.getLength();
                  acceptator.addPosition(_offset_3, _length_3, SiriusHighlightingConfiguration.OPERATION_ID);
                } else {
                  boolean _equals_4 = SiriusSemanticHighlightingCalculator.FEATURE_NAME_KEYWORD.equals(value);
                  if (_equals_4) {
                    ITextRegion _textRegion_8 = leafNode.getTextRegion();
                    int _offset_4 = _textRegion_8.getOffset();
                    ITextRegion _textRegion_9 = leafNode.getTextRegion();
                    int _length_4 = _textRegion_9.getLength();
                    acceptator.addPosition(_offset_4, _length_4, SiriusHighlightingConfiguration.PARAMETER_NAME_ID);
                  } else {
                    boolean _equals_5 = SiriusSemanticHighlightingCalculator.VALUE_EXPRESSION_KEYWORD.equals(value);
                    if (_equals_5) {
                      ITextRegion _textRegion_10 = leafNode.getTextRegion();
                      int _offset_5 = _textRegion_10.getOffset();
                      ITextRegion _textRegion_11 = leafNode.getTextRegion();
                      int _length_5 = _textRegion_11.getLength();
                      acceptator.addPosition(_offset_5, _length_5, SiriusHighlightingConfiguration.PARAMETER_NAME_ID);
                    } else {
                      boolean _equals_6 = SiriusSemanticHighlightingCalculator.UNSET_KEYWORD.equals(value);
                      if (_equals_6) {
                        ITextRegion _textRegion_12 = leafNode.getTextRegion();
                        int _offset_6 = _textRegion_12.getOffset();
                        ITextRegion _textRegion_13 = leafNode.getTextRegion();
                        int _length_6 = _textRegion_13.getLength();
                        acceptator.addPosition(_offset_6, _length_6, SiriusHighlightingConfiguration.OPERATION_ID);
                      } else {
                        boolean _equals_7 = SiriusSemanticHighlightingCalculator.ELEMENT_EXPRESSION_KEYWORD.equals(value);
                        if (_equals_7) {
                          ITextRegion _textRegion_14 = leafNode.getTextRegion();
                          int _offset_7 = _textRegion_14.getOffset();
                          ITextRegion _textRegion_15 = leafNode.getTextRegion();
                          int _length_7 = _textRegion_15.getLength();
                          acceptator.addPosition(_offset_7, _length_7, SiriusHighlightingConfiguration.PARAMETER_NAME_ID);
                        } else {
                          boolean _equals_8 = SiriusSemanticHighlightingCalculator.CREATE_INSTANCE_KEYWORD.equals(value);
                          if (_equals_8) {
                            ITextRegion _textRegion_16 = leafNode.getTextRegion();
                            int _offset_8 = _textRegion_16.getOffset();
                            ITextRegion _textRegion_17 = leafNode.getTextRegion();
                            int _length_8 = _textRegion_17.getLength();
                            acceptator.addPosition(_offset_8, _length_8, SiriusHighlightingConfiguration.OPERATION_ID);
                          } else {
                            boolean _equals_9 = SiriusSemanticHighlightingCalculator.REFERENCE_NAME_KEYWORD.equals(value);
                            if (_equals_9) {
                              ITextRegion _textRegion_18 = leafNode.getTextRegion();
                              int _offset_9 = _textRegion_18.getOffset();
                              ITextRegion _textRegion_19 = leafNode.getTextRegion();
                              int _length_9 = _textRegion_19.getLength();
                              acceptator.addPosition(_offset_9, _length_9, SiriusHighlightingConfiguration.PARAMETER_NAME_ID);
                            } else {
                              boolean _equals_10 = SiriusSemanticHighlightingCalculator.TYPE_KEYWORD.equals(value);
                              if (_equals_10) {
                                ITextRegion _textRegion_20 = leafNode.getTextRegion();
                                int _offset_10 = _textRegion_20.getOffset();
                                ITextRegion _textRegion_21 = leafNode.getTextRegion();
                                int _length_10 = _textRegion_21.getLength();
                                acceptator.addPosition(_offset_10, _length_10, SiriusHighlightingConfiguration.PARAMETER_NAME_ID);
                              } else {
                                boolean _equals_11 = SiriusSemanticHighlightingCalculator.AS_KEYWORD.equals(value);
                                if (_equals_11) {
                                  ITextRegion _textRegion_22 = leafNode.getTextRegion();
                                  int _offset_11 = _textRegion_22.getOffset();
                                  ITextRegion _textRegion_23 = leafNode.getTextRegion();
                                  int _length_11 = _textRegion_23.getLength();
                                  acceptator.addPosition(_offset_11, _length_11, SiriusHighlightingConfiguration.PARAMETER_NAME_ID);
                                } else {
                                  boolean _equals_12 = SiriusSemanticHighlightingCalculator.CREATE_VIEW_KEYWORD.equals(value);
                                  if (_equals_12) {
                                    ITextRegion _textRegion_24 = leafNode.getTextRegion();
                                    int _offset_12 = _textRegion_24.getOffset();
                                    ITextRegion _textRegion_25 = leafNode.getTextRegion();
                                    int _length_12 = _textRegion_25.getLength();
                                    acceptator.addPosition(_offset_12, _length_12, SiriusHighlightingConfiguration.OPERATION_ID);
                                  } else {
                                    boolean _equals_13 = SiriusSemanticHighlightingCalculator.MAPPING_KEYWORD.equals(value);
                                    if (_equals_13) {
                                      ITextRegion _textRegion_26 = leafNode.getTextRegion();
                                      int _offset_13 = _textRegion_26.getOffset();
                                      ITextRegion _textRegion_27 = leafNode.getTextRegion();
                                      int _length_13 = _textRegion_27.getLength();
                                      acceptator.addPosition(_offset_13, _length_13, SiriusHighlightingConfiguration.PARAMETER_NAME_ID);
                                    } else {
                                      boolean _equals_14 = SiriusSemanticHighlightingCalculator.CONTAINER_VIEW_EXPRESSION_KEYWORD.equals(value);
                                      if (_equals_14) {
                                        ITextRegion _textRegion_28 = leafNode.getTextRegion();
                                        int _offset_14 = _textRegion_28.getOffset();
                                        ITextRegion _textRegion_29 = leafNode.getTextRegion();
                                        int _length_14 = _textRegion_29.getLength();
                                        acceptator.addPosition(_offset_14, _length_14, SiriusHighlightingConfiguration.PARAMETER_NAME_ID);
                                      } else {
                                        boolean _equals_15 = SiriusSemanticHighlightingCalculator.CREATE_EDGE_VIEW_KEYWORD.equals(value);
                                        if (_equals_15) {
                                          ITextRegion _textRegion_30 = leafNode.getTextRegion();
                                          int _offset_15 = _textRegion_30.getOffset();
                                          ITextRegion _textRegion_31 = leafNode.getTextRegion();
                                          int _length_15 = _textRegion_31.getLength();
                                          acceptator.addPosition(_offset_15, _length_15, SiriusHighlightingConfiguration.OPERATION_ID);
                                        } else {
                                          boolean _equals_16 = SiriusSemanticHighlightingCalculator.SOURCE_EXPRESSION_KEYWORD.equals(value);
                                          if (_equals_16) {
                                            ITextRegion _textRegion_32 = leafNode.getTextRegion();
                                            int _offset_16 = _textRegion_32.getOffset();
                                            ITextRegion _textRegion_33 = leafNode.getTextRegion();
                                            int _length_16 = _textRegion_33.getLength();
                                            acceptator.addPosition(_offset_16, _length_16, SiriusHighlightingConfiguration.PARAMETER_NAME_ID);
                                          } else {
                                            boolean _equals_17 = SiriusSemanticHighlightingCalculator.TARGET_EXPRESSION_KEYWORD.equals(value);
                                            if (_equals_17) {
                                              ITextRegion _textRegion_34 = leafNode.getTextRegion();
                                              int _offset_17 = _textRegion_34.getOffset();
                                              ITextRegion _textRegion_35 = leafNode.getTextRegion();
                                              int _length_17 = _textRegion_35.getLength();
                                              acceptator.addPosition(_offset_17, _length_17, SiriusHighlightingConfiguration.PARAMETER_NAME_ID);
                                            } else {
                                              boolean _equals_18 = SiriusSemanticHighlightingCalculator.DELETE_VIEW_KEYWORD.equals(value);
                                              if (_equals_18) {
                                                ITextRegion _textRegion_36 = leafNode.getTextRegion();
                                                int _offset_18 = _textRegion_36.getOffset();
                                                ITextRegion _textRegion_37 = leafNode.getTextRegion();
                                                int _length_18 = _textRegion_37.getLength();
                                                acceptator.addPosition(_offset_18, _length_18, SiriusHighlightingConfiguration.OPERATION_ID);
                                              } else {
                                                boolean _equals_19 = SiriusSemanticHighlightingCalculator.REMOVE_KEYWORD.equals(value);
                                                if (_equals_19) {
                                                  ITextRegion _textRegion_38 = leafNode.getTextRegion();
                                                  int _offset_19 = _textRegion_38.getOffset();
                                                  ITextRegion _textRegion_39 = leafNode.getTextRegion();
                                                  int _length_19 = _textRegion_39.getLength();
                                                  acceptator.addPosition(_offset_19, _length_19, SiriusHighlightingConfiguration.OPERATION_ID);
                                                } else {
                                                  boolean _equals_20 = SiriusSemanticHighlightingCalculator.MOVE_KEYWORD.equals(value);
                                                  if (_equals_20) {
                                                    ITextRegion _textRegion_40 = leafNode.getTextRegion();
                                                    int _offset_20 = _textRegion_40.getOffset();
                                                    ITextRegion _textRegion_41 = leafNode.getTextRegion();
                                                    int _length_20 = _textRegion_41.getLength();
                                                    acceptator.addPosition(_offset_20, _length_20, SiriusHighlightingConfiguration.OPERATION_ID);
                                                  } else {
                                                    boolean _equals_21 = SiriusSemanticHighlightingCalculator.NEW_CONTAINER_EXPRESSION_KEYWORD.equals(value);
                                                    if (_equals_21) {
                                                      ITextRegion _textRegion_42 = leafNode.getTextRegion();
                                                      int _offset_21 = _textRegion_42.getOffset();
                                                      ITextRegion _textRegion_43 = leafNode.getTextRegion();
                                                      int _length_21 = _textRegion_43.getLength();
                                                      acceptator.addPosition(_offset_21, _length_21, SiriusHighlightingConfiguration.PARAMETER_NAME_ID);
                                                    } else {
                                                      boolean _equals_22 = SiriusSemanticHighlightingCalculator.SWITCH_KEYWORD.equals(value);
                                                      if (_equals_22) {
                                                        ITextRegion _textRegion_44 = leafNode.getTextRegion();
                                                        int _offset_22 = _textRegion_44.getOffset();
                                                        ITextRegion _textRegion_45 = leafNode.getTextRegion();
                                                        int _length_22 = _textRegion_45.getLength();
                                                        acceptator.addPosition(_offset_22, _length_22, SiriusHighlightingConfiguration.SWITCH_ID);
                                                      } else {
                                                        boolean _equals_23 = SiriusSemanticHighlightingCalculator.CASE_KEYWORD.equals(value);
                                                        if (_equals_23) {
                                                          ITextRegion _textRegion_46 = leafNode.getTextRegion();
                                                          int _offset_23 = _textRegion_46.getOffset();
                                                          ITextRegion _textRegion_47 = leafNode.getTextRegion();
                                                          int _length_23 = _textRegion_47.getLength();
                                                          acceptator.addPosition(_offset_23, _length_23, SiriusHighlightingConfiguration.SWITCH_ID);
                                                        } else {
                                                          boolean _equals_24 = SiriusSemanticHighlightingCalculator.DEFAULT_KEYWORD.equals(value);
                                                          if (_equals_24) {
                                                            ITextRegion _textRegion_48 = leafNode.getTextRegion();
                                                            int _offset_24 = _textRegion_48.getOffset();
                                                            ITextRegion _textRegion_49 = leafNode.getTextRegion();
                                                            int _length_24 = _textRegion_49.getLength();
                                                            acceptator.addPosition(_offset_24, _length_24, SiriusHighlightingConfiguration.SWITCH_ID);
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
