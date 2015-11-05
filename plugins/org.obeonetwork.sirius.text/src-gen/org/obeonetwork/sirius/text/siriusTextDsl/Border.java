/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Border</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Border#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Border#getBorderSizeComputationExpression <em>Border Size Computation Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Border#getBorderColor <em>Border Color</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getBorder()
 * @model
 * @generated
 */
public interface Border extends EObject
{
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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getBorder_LineStyle()
   * @model
   * @generated
   */
  LineStyle getLineStyle();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Border#getLineStyle <em>Line Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Style</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LineStyle
   * @see #getLineStyle()
   * @generated
   */
  void setLineStyle(LineStyle value);

  /**
   * Returns the value of the '<em><b>Border Size Computation Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Border Size Computation Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Border Size Computation Expression</em>' attribute.
   * @see #setBorderSizeComputationExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getBorder_BorderSizeComputationExpression()
   * @model
   * @generated
   */
  String getBorderSizeComputationExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Border#getBorderSizeComputationExpression <em>Border Size Computation Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border Size Computation Expression</em>' attribute.
   * @see #getBorderSizeComputationExpression()
   * @generated
   */
  void setBorderSizeComputationExpression(String value);

  /**
   * Returns the value of the '<em><b>Border Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Border Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Border Color</em>' reference.
   * @see #setBorderColor(Color)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getBorder_BorderColor()
   * @model
   * @generated
   */
  Color getBorderColor();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Border#getBorderColor <em>Border Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border Color</em>' reference.
   * @see #getBorderColor()
   * @generated
   */
  void setBorderColor(Color value);

} // Border
