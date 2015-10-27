/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#isForceRefresh <em>Force Refresh</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getNodeCreationVariable <em>Node Creation Variable</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getContainerViewVariable <em>Container View Variable</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getContainerMappings <em>Container Mappings</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getExtraMappings <em>Extra Mappings</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerCreation()
 * @model
 * @generated
 */
public interface ContainerCreation extends Tool
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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerCreation_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

  /**
   * Returns the value of the '<em><b>Force Refresh</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Force Refresh</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Force Refresh</em>' attribute.
   * @see #setForceRefresh(boolean)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerCreation_ForceRefresh()
   * @model
   * @generated
   */
  boolean isForceRefresh();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#isForceRefresh <em>Force Refresh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Force Refresh</em>' attribute.
   * @see #isForceRefresh()
   * @generated
   */
  void setForceRefresh(boolean value);

  /**
   * Returns the value of the '<em><b>Node Creation Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Creation Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Creation Variable</em>' attribute.
   * @see #setNodeCreationVariable(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerCreation_NodeCreationVariable()
   * @model
   * @generated
   */
  String getNodeCreationVariable();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getNodeCreationVariable <em>Node Creation Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Creation Variable</em>' attribute.
   * @see #getNodeCreationVariable()
   * @generated
   */
  void setNodeCreationVariable(String value);

  /**
   * Returns the value of the '<em><b>Container View Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container View Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container View Variable</em>' attribute.
   * @see #setContainerViewVariable(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerCreation_ContainerViewVariable()
   * @model
   * @generated
   */
  String getContainerViewVariable();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getContainerViewVariable <em>Container View Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container View Variable</em>' attribute.
   * @see #getContainerViewVariable()
   * @generated
   */
  void setContainerViewVariable(String value);

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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerCreation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getName <em>Name</em>}' attribute.
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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerCreation_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerCreation_Precondition()
   * @model
   * @generated
   */
  String getPrecondition();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getPrecondition <em>Precondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precondition</em>' attribute.
   * @see #getPrecondition()
   * @generated
   */
  void setPrecondition(String value);

  /**
   * Returns the value of the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icon</em>' attribute.
   * @see #setIcon(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerCreation_Icon()
   * @model
   * @generated
   */
  String getIcon();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getIcon <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon</em>' attribute.
   * @see #getIcon()
   * @generated
   */
  void setIcon(String value);

  /**
   * Returns the value of the '<em><b>Container Mappings</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.sirius.text.siriusTextDsl.Mapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container Mappings</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container Mappings</em>' reference list.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerCreation_ContainerMappings()
   * @model
   * @generated
   */
  EList<Mapping> getContainerMappings();

  /**
   * Returns the value of the '<em><b>Extra Mappings</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.sirius.text.siriusTextDsl.Mapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extra Mappings</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extra Mappings</em>' reference list.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerCreation_ExtraMappings()
   * @model
   * @generated
   */
  EList<Mapping> getExtraMappings();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Operation)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerCreation_Body()
   * @model containment="true"
   * @generated
   */
  Operation getBody();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Operation value);

} // ContainerCreation
