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
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#isList <em>List</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getStyle <em>Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getSemanticCanditatesExpression <em>Semantic Canditates Expression</em>}</li>
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
   * Returns the value of the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute.
   * @see #setDocumentation(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainer_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

  /**
   * Returns the value of the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute.
   * @see #setList(boolean)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainer_List()
   * @model
   * @generated
   */
  boolean isList();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#isList <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' attribute.
   * @see #isList()
   * @generated
   */
  void setList(boolean value);

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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainer_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Domain Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Class</em>' attribute.
   * @see #setDomainClass(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainer_DomainClass()
   * @model
   * @generated
   */
  String getDomainClass();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getDomainClass <em>Domain Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain Class</em>' attribute.
   * @see #getDomainClass()
   * @generated
   */
  void setDomainClass(String value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerStyle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' reference list.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainer_Style()
   * @model
   * @generated
   */
  EList<ContainerStyle> getStyle();

  /**
   * Returns the value of the '<em><b>Precondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Precondition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precondition</em>' attribute.
   * @see #setPrecondition(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainer_Precondition()
   * @model
   * @generated
   */
  String getPrecondition();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getPrecondition <em>Precondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precondition</em>' attribute.
   * @see #getPrecondition()
   * @generated
   */
  void setPrecondition(String value);

  /**
   * Returns the value of the '<em><b>Semantic Canditates Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semantic Canditates Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semantic Canditates Expression</em>' attribute.
   * @see #setSemanticCanditatesExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainer_SemanticCanditatesExpression()
   * @model
   * @generated
   */
  String getSemanticCanditatesExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getSemanticCanditatesExpression <em>Semantic Canditates Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic Canditates Expression</em>' attribute.
   * @see #getSemanticCanditatesExpression()
   * @generated
   */
  void setSemanticCanditatesExpression(String value);

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
