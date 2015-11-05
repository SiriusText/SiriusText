/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getChildrenPresentation <em>Children Presentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getStyle <em>Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends Mapping
{
  /**
   * Returns the value of the '<em><b>Children Presentation</b></em>' attribute.
   * The literals are from the enumeration {@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerChildrenPresentation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children Presentation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children Presentation</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerChildrenPresentation
   * @see #setChildrenPresentation(ContainerChildrenPresentation)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainer_ChildrenPresentation()
   * @model
   * @generated
   */
  ContainerChildrenPresentation getChildrenPresentation();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getChildrenPresentation <em>Children Presentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Children Presentation</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerChildrenPresentation
   * @see #getChildrenPresentation()
   * @generated
   */
  void setChildrenPresentation(ContainerChildrenPresentation value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' reference.
   * @see #setStyle(ContainerStyle)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainer_Style()
   * @model
   * @generated
   */
  ContainerStyle getStyle();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getStyle <em>Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(ContainerStyle value);

  /**
   * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional Styles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional Styles</em>' containment reference list.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainer_ConditionalStyles()
   * @model containment="true"
   * @generated
   */
  EList<ConditionalContainerStyleDeclaration> getConditionalStyles();

} // Container
