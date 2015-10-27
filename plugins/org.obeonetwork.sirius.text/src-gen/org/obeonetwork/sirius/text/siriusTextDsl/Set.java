/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Set#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Set#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Set#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends Operation
{
  /**
   * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Name</em>' attribute.
   * @see #setFeatureName(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getSet_FeatureName()
   * @model
   * @generated
   */
  String getFeatureName();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Set#getFeatureName <em>Feature Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Name</em>' attribute.
   * @see #getFeatureName()
   * @generated
   */
  void setFeatureName(String value);

  /**
   * Returns the value of the '<em><b>Value Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Expression</em>' attribute.
   * @see #setValueExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getSet_ValueExpression()
   * @model
   * @generated
   */
  String getValueExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Set#getValueExpression <em>Value Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Expression</em>' attribute.
   * @see #getValueExpression()
   * @generated
   */
  void setValueExpression(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.sirius.text.siriusTextDsl.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getSet_Body()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getBody();

} // Set
