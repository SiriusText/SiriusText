/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getRoutingStyle <em>Routing Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getSourceArrow <em>Source Arrow</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getTargetArrow <em>Target Arrow</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getSizeComputationExpression <em>Size Computation Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getFoldingStyle <em>Folding Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getEndsCentering <em>Ends Centering</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeStyle()
 * @model
 * @generated
 */
public interface EdgeStyle extends Style
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeStyle_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Stroke Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stroke Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stroke Color</em>' reference.
   * @see #setStrokeColor(Color)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeStyle_StrokeColor()
   * @model
   * @generated
   */
  Color getStrokeColor();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getStrokeColor <em>Stroke Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stroke Color</em>' reference.
   * @see #getStrokeColor()
   * @generated
   */
  void setStrokeColor(Color value);

  /**
   * Returns the value of the '<em><b>Line Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.obeonetwork.sirius.text.siriusTextDsl.LineStyle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Style</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LineStyle
   * @see #setLineStyle(LineStyle)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeStyle_LineStyle()
   * @model
   * @generated
   */
  LineStyle getLineStyle();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getLineStyle <em>Line Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Style</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LineStyle
   * @see #getLineStyle()
   * @generated
   */
  void setLineStyle(LineStyle value);

  /**
   * Returns the value of the '<em><b>Routing Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Routing Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Routing Style</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle
   * @see #setRoutingStyle(RoutingStyle)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeStyle_RoutingStyle()
   * @model
   * @generated
   */
  RoutingStyle getRoutingStyle();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getRoutingStyle <em>Routing Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Routing Style</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle
   * @see #getRoutingStyle()
   * @generated
   */
  void setRoutingStyle(RoutingStyle value);

  /**
   * Returns the value of the '<em><b>Source Arrow</b></em>' attribute.
   * The literals are from the enumeration {@link org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Arrow</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Arrow</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator
   * @see #setSourceArrow(ArrowDecorator)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeStyle_SourceArrow()
   * @model
   * @generated
   */
  ArrowDecorator getSourceArrow();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getSourceArrow <em>Source Arrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Arrow</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator
   * @see #getSourceArrow()
   * @generated
   */
  void setSourceArrow(ArrowDecorator value);

  /**
   * Returns the value of the '<em><b>Target Arrow</b></em>' attribute.
   * The literals are from the enumeration {@link org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Arrow</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Arrow</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator
   * @see #setTargetArrow(ArrowDecorator)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeStyle_TargetArrow()
   * @model
   * @generated
   */
  ArrowDecorator getTargetArrow();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getTargetArrow <em>Target Arrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Arrow</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator
   * @see #getTargetArrow()
   * @generated
   */
  void setTargetArrow(ArrowDecorator value);

  /**
   * Returns the value of the '<em><b>Size Computation Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size Computation Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size Computation Expression</em>' attribute.
   * @see #setSizeComputationExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeStyle_SizeComputationExpression()
   * @model
   * @generated
   */
  String getSizeComputationExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getSizeComputationExpression <em>Size Computation Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size Computation Expression</em>' attribute.
   * @see #getSizeComputationExpression()
   * @generated
   */
  void setSizeComputationExpression(String value);

  /**
   * Returns the value of the '<em><b>Folding Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Folding Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Folding Style</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle
   * @see #setFoldingStyle(FoldingStyle)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeStyle_FoldingStyle()
   * @model
   * @generated
   */
  FoldingStyle getFoldingStyle();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getFoldingStyle <em>Folding Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Folding Style</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle
   * @see #getFoldingStyle()
   * @generated
   */
  void setFoldingStyle(FoldingStyle value);

  /**
   * Returns the value of the '<em><b>Ends Centering</b></em>' attribute.
   * The literals are from the enumeration {@link org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ends Centering</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ends Centering</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering
   * @see #setEndsCentering(EndsCentering)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeStyle_EndsCentering()
   * @model
   * @generated
   */
  EndsCentering getEndsCentering();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getEndsCentering <em>Ends Centering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ends Centering</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering
   * @see #getEndsCentering()
   * @generated
   */
  void setEndsCentering(EndsCentering value);

} // EdgeStyle
