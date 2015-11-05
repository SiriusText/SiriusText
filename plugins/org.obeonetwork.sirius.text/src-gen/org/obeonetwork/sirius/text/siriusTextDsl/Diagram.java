/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#isShowOnStartup <em>Show On Startup</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#isEnablePopupBars <em>Enable Popup Bars</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getMetamodelUris <em>Metamodel Uris</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getPreconditionExpression <em>Precondition Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getEndUserDocumentation <em>End User Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getTitleExpression <em>Title Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getRootExpression <em>Root Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getDefaultLayer <em>Default Layer</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getAdditionalLayers <em>Additional Layers</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends Representation
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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

  /**
   * Returns the value of the '<em><b>Initialized</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialized</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialized</em>' attribute.
   * @see #setInitialized(boolean)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_Initialized()
   * @model
   * @generated
   */
  boolean isInitialized();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#isInitialized <em>Initialized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialized</em>' attribute.
   * @see #isInitialized()
   * @generated
   */
  void setInitialized(boolean value);

  /**
   * Returns the value of the '<em><b>Show On Startup</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Show On Startup</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show On Startup</em>' attribute.
   * @see #setShowOnStartup(boolean)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_ShowOnStartup()
   * @model
   * @generated
   */
  boolean isShowOnStartup();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#isShowOnStartup <em>Show On Startup</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Show On Startup</em>' attribute.
   * @see #isShowOnStartup()
   * @generated
   */
  void setShowOnStartup(boolean value);

  /**
   * Returns the value of the '<em><b>Enable Popup Bars</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enable Popup Bars</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enable Popup Bars</em>' attribute.
   * @see #setEnablePopupBars(boolean)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_EnablePopupBars()
   * @model
   * @generated
   */
  boolean isEnablePopupBars();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#isEnablePopupBars <em>Enable Popup Bars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enable Popup Bars</em>' attribute.
   * @see #isEnablePopupBars()
   * @generated
   */
  void setEnablePopupBars(boolean value);

  /**
   * Returns the value of the '<em><b>Metamodel Uris</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel Uris</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel Uris</em>' attribute list.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_MetamodelUris()
   * @model unique="false"
   * @generated
   */
  EList<String> getMetamodelUris();

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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getName <em>Name</em>}' attribute.
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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getLabel <em>Label</em>}' attribute.
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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_DomainClass()
   * @model
   * @generated
   */
  String getDomainClass();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getDomainClass <em>Domain Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain Class</em>' attribute.
   * @see #getDomainClass()
   * @generated
   */
  void setDomainClass(String value);

  /**
   * Returns the value of the '<em><b>Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Precondition Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precondition Expression</em>' attribute.
   * @see #setPreconditionExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_PreconditionExpression()
   * @model
   * @generated
   */
  String getPreconditionExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getPreconditionExpression <em>Precondition Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precondition Expression</em>' attribute.
   * @see #getPreconditionExpression()
   * @generated
   */
  void setPreconditionExpression(String value);

  /**
   * Returns the value of the '<em><b>End User Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End User Documentation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End User Documentation</em>' attribute.
   * @see #setEndUserDocumentation(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_EndUserDocumentation()
   * @model
   * @generated
   */
  String getEndUserDocumentation();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getEndUserDocumentation <em>End User Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End User Documentation</em>' attribute.
   * @see #getEndUserDocumentation()
   * @generated
   */
  void setEndUserDocumentation(String value);

  /**
   * Returns the value of the '<em><b>Title Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title Expression</em>' attribute.
   * @see #setTitleExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_TitleExpression()
   * @model
   * @generated
   */
  String getTitleExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getTitleExpression <em>Title Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title Expression</em>' attribute.
   * @see #getTitleExpression()
   * @generated
   */
  void setTitleExpression(String value);

  /**
   * Returns the value of the '<em><b>Root Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Expression</em>' attribute.
   * @see #setRootExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_RootExpression()
   * @model
   * @generated
   */
  String getRootExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getRootExpression <em>Root Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Expression</em>' attribute.
   * @see #getRootExpression()
   * @generated
   */
  void setRootExpression(String value);

  /**
   * Returns the value of the '<em><b>Default Layer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Layer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Layer</em>' reference.
   * @see #setDefaultLayer(Layer)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_DefaultLayer()
   * @model
   * @generated
   */
  Layer getDefaultLayer();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getDefaultLayer <em>Default Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Layer</em>' reference.
   * @see #getDefaultLayer()
   * @generated
   */
  void setDefaultLayer(Layer value);

  /**
   * Returns the value of the '<em><b>Additional Layers</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.sirius.text.siriusTextDsl.Layer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additional Layers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additional Layers</em>' reference list.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getDiagram_AdditionalLayers()
   * @model
   * @generated
   */
  EList<Layer> getAdditionalLayers();

} // Diagram
