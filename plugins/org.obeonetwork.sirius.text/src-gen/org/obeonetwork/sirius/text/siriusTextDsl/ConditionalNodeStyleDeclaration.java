/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Node Style Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration#getStyle <em>Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration#getConditionalStyleExpression <em>Conditional Style Expression</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getConditionalNodeStyleDeclaration()
 * @model
 * @generated
 */
public interface ConditionalNodeStyleDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' reference.
   * @see #setStyle(NodeStyle)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getConditionalNodeStyleDeclaration_Style()
   * @model
   * @generated
   */
  NodeStyle getStyle();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration#getStyle <em>Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(NodeStyle value);

  /**
   * Returns the value of the '<em><b>Conditional Style Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional Style Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional Style Expression</em>' attribute.
   * @see #setConditionalStyleExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getConditionalNodeStyleDeclaration_ConditionalStyleExpression()
   * @model
   * @generated
   */
  String getConditionalStyleExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration#getConditionalStyleExpression <em>Conditional Style Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional Style Expression</em>' attribute.
   * @see #getConditionalStyleExpression()
   * @generated
   */
  void setConditionalStyleExpression(String value);

} // ConditionalNodeStyleDeclaration
