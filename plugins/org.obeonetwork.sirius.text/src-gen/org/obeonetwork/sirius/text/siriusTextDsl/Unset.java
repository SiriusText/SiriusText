/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Unset#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Unset#getElementExpression <em>Element Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Unset#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getUnset()
 * @model
 * @generated
 */
public interface Unset extends Operation
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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getUnset_FeatureName()
   * @model
   * @generated
   */
  String getFeatureName();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Unset#getFeatureName <em>Feature Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Name</em>' attribute.
   * @see #getFeatureName()
   * @generated
   */
  void setFeatureName(String value);

  /**
   * Returns the value of the '<em><b>Element Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Expression</em>' attribute.
   * @see #setElementExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getUnset_ElementExpression()
   * @model
   * @generated
   */
  String getElementExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Unset#getElementExpression <em>Element Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Expression</em>' attribute.
   * @see #getElementExpression()
   * @generated
   */
  void setElementExpression(String value);

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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getUnset_Body()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getBody();

} // Unset
