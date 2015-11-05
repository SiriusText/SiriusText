/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Node#getStyle <em>Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Node#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Mapping
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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getNode_Style()
   * @model
   * @generated
   */
  NodeStyle getStyle();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Node#getStyle <em>Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(NodeStyle value);

  /**
   * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional Styles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional Styles</em>' containment reference list.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getNode_ConditionalStyles()
   * @model containment="true"
   * @generated
   */
  EList<ConditionalNodeStyleDeclaration> getConditionalStyles();

} // Node
