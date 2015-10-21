/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelAlignment <em>Label Alignment</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelColor <em>Label Color</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBorderSize <em>Border Size</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getHeightComputationExpression <em>Height Computation Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getWidthComputationExpression <em>Width Computation Expression</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient()
 * @model
 * @generated
 */
public interface Gradient extends ContainerStyle
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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection
   * @see #setDirection(GradientDirection)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_Direction()
   * @model
   * @generated
   */
  GradientDirection getDirection();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection
   * @see #getDirection()
   * @generated
   */
  void setDirection(GradientDirection value);

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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Background Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Background Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Background Color</em>' reference.
   * @see #setBackgroundColor(Color)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_BackgroundColor()
   * @model
   * @generated
   */
  Color getBackgroundColor();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBackgroundColor <em>Background Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Background Color</em>' reference.
   * @see #getBackgroundColor()
   * @generated
   */
  void setBackgroundColor(Color value);

  /**
   * Returns the value of the '<em><b>Foreground Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreground Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreground Color</em>' reference.
   * @see #setForegroundColor(Color)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_ForegroundColor()
   * @model
   * @generated
   */
  Color getForegroundColor();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getForegroundColor <em>Foreground Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreground Color</em>' reference.
   * @see #getForegroundColor()
   * @generated
   */
  void setForegroundColor(Color value);

  /**
   * Returns the value of the '<em><b>Label Alignment</b></em>' attribute.
   * The literals are from the enumeration {@link org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Alignment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Alignment</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment
   * @see #setLabelAlignment(LabelAlignment)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_LabelAlignment()
   * @model
   * @generated
   */
  LabelAlignment getLabelAlignment();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelAlignment <em>Label Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Alignment</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment
   * @see #getLabelAlignment()
   * @generated
   */
  void setLabelAlignment(LabelAlignment value);

  /**
   * Returns the value of the '<em><b>Label Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Expression</em>' attribute.
   * @see #setLabelExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_LabelExpression()
   * @model
   * @generated
   */
  String getLabelExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelExpression <em>Label Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Expression</em>' attribute.
   * @see #getLabelExpression()
   * @generated
   */
  void setLabelExpression(String value);

  /**
   * Returns the value of the '<em><b>Label Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Color</em>' reference.
   * @see #setLabelColor(Color)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_LabelColor()
   * @model
   * @generated
   */
  Color getLabelColor();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelColor <em>Label Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Color</em>' reference.
   * @see #getLabelColor()
   * @generated
   */
  void setLabelColor(Color value);

  /**
   * Returns the value of the '<em><b>Border Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Border Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Border Size</em>' attribute.
   * @see #setBorderSize(int)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_BorderSize()
   * @model
   * @generated
   */
  int getBorderSize();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBorderSize <em>Border Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border Size</em>' attribute.
   * @see #getBorderSize()
   * @generated
   */
  void setBorderSize(int value);

  /**
   * Returns the value of the '<em><b>Border Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Border Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Border Color</em>' reference.
   * @see #setBorderColor(Color)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_BorderColor()
   * @model
   * @generated
   */
  Color getBorderColor();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBorderColor <em>Border Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border Color</em>' reference.
   * @see #getBorderColor()
   * @generated
   */
  void setBorderColor(Color value);

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
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_Icon()
   * @model
   * @generated
   */
  String getIcon();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getIcon <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon</em>' attribute.
   * @see #getIcon()
   * @generated
   */
  void setIcon(String value);

  /**
   * Returns the value of the '<em><b>Height Computation Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height Computation Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height Computation Expression</em>' attribute.
   * @see #setHeightComputationExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_HeightComputationExpression()
   * @model
   * @generated
   */
  String getHeightComputationExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getHeightComputationExpression <em>Height Computation Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height Computation Expression</em>' attribute.
   * @see #getHeightComputationExpression()
   * @generated
   */
  void setHeightComputationExpression(String value);

  /**
   * Returns the value of the '<em><b>Width Computation Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width Computation Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width Computation Expression</em>' attribute.
   * @see #setWidthComputationExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_WidthComputationExpression()
   * @model
   * @generated
   */
  String getWidthComputationExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getWidthComputationExpression <em>Width Computation Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width Computation Expression</em>' attribute.
   * @see #getWidthComputationExpression()
   * @generated
   */
  void setWidthComputationExpression(String value);

} // Gradient
