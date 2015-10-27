/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getContainerViewExpression <em>Container View Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getCreateView()
 * @model
 * @generated
 */
public interface CreateView extends Operation
{
  /**
   * Returns the value of the '<em><b>Mapping</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' reference.
   * @see #setMapping(Mapping)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getCreateView_Mapping()
   * @model
   * @generated
   */
  Mapping getMapping();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getMapping <em>Mapping</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping</em>' reference.
   * @see #getMapping()
   * @generated
   */
  void setMapping(Mapping value);

  /**
   * Returns the value of the '<em><b>Container View Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container View Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container View Expression</em>' attribute.
   * @see #setContainerViewExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getCreateView_ContainerViewExpression()
   * @model
   * @generated
   */
  String getContainerViewExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getContainerViewExpression <em>Container View Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container View Expression</em>' attribute.
   * @see #getContainerViewExpression()
   * @generated
   */
  void setContainerViewExpression(String value);

  /**
   * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Name</em>' attribute.
   * @see #setVariableName(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getCreateView_VariableName()
   * @model
   * @generated
   */
  String getVariableName();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getVariableName <em>Variable Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Name</em>' attribute.
   * @see #getVariableName()
   * @generated
   */
  void setVariableName(String value);

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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getCreateView_Body()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getBody();

} // CreateView
