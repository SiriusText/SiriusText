/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Switch#getCases <em>Cases</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Switch#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends Operation
{
  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.sirius.text.siriusTextDsl.Case}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getSwitch_Cases()
   * @model containment="true"
   * @generated
   */
  EList<Case> getCases();

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(Default)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getSwitch_Default()
   * @model containment="true"
   * @generated
   */
  Default getDefault();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Switch#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(Default value);

} // Switch
