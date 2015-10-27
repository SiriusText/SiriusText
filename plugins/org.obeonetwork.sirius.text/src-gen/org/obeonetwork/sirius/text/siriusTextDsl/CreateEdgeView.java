/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Edge View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getSourceExpression <em>Source Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getTargetExpression <em>Target Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getContainerViewExpression <em>Container View Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getCreateEdgeView()
 * @model
 * @generated
 */
public interface CreateEdgeView extends Operation
{
  /**
   * Returns the value of the '<em><b>Edge</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edge</em>' reference.
   * @see #setEdge(Edge)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getCreateEdgeView_Edge()
   * @model
   * @generated
   */
  Edge getEdge();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getEdge <em>Edge</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Edge</em>' reference.
   * @see #getEdge()
   * @generated
   */
  void setEdge(Edge value);

  /**
   * Returns the value of the '<em><b>Source Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Expression</em>' attribute.
   * @see #setSourceExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getCreateEdgeView_SourceExpression()
   * @model
   * @generated
   */
  String getSourceExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getSourceExpression <em>Source Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Expression</em>' attribute.
   * @see #getSourceExpression()
   * @generated
   */
  void setSourceExpression(String value);

  /**
   * Returns the value of the '<em><b>Target Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Expression</em>' attribute.
   * @see #setTargetExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getCreateEdgeView_TargetExpression()
   * @model
   * @generated
   */
  String getTargetExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getTargetExpression <em>Target Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Expression</em>' attribute.
   * @see #getTargetExpression()
   * @generated
   */
  void setTargetExpression(String value);

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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getCreateEdgeView_ContainerViewExpression()
   * @model
   * @generated
   */
  String getContainerViewExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getContainerViewExpression <em>Container View Expression</em>}' attribute.
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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getCreateEdgeView_VariableName()
   * @model
   * @generated
   */
  String getVariableName();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getVariableName <em>Variable Name</em>}' attribute.
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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getCreateEdgeView_Body()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getBody();

} // CreateEdgeView
