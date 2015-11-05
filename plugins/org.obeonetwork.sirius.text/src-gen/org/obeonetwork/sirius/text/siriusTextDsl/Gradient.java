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
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelBorderStyle <em>Label Border Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBorder <em>Border</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getHeightComputationExpression <em>Height Computation Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getWidthComputationExpression <em>Width Computation Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getArcHeight <em>Arc Height</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getArcWidth <em>Arc Width</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getTooltipExpression <em>Tooltip Expression</em>}</li>
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
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(Label)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_Label()
   * @model containment="true"
   * @generated
   */
  Label getLabel();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(Label value);

  /**
   * Returns the value of the '<em><b>Label Border Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerLabelBorderStyle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Border Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Border Style</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerLabelBorderStyle
   * @see #setLabelBorderStyle(ContainerLabelBorderStyle)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_LabelBorderStyle()
   * @model
   * @generated
   */
  ContainerLabelBorderStyle getLabelBorderStyle();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelBorderStyle <em>Label Border Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Border Style</em>' attribute.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerLabelBorderStyle
   * @see #getLabelBorderStyle()
   * @generated
   */
  void setLabelBorderStyle(ContainerLabelBorderStyle value);

  /**
   * Returns the value of the '<em><b>Border</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Border</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Border</em>' containment reference.
   * @see #setBorder(Border)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_Border()
   * @model containment="true"
   * @generated
   */
  Border getBorder();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBorder <em>Border</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border</em>' containment reference.
   * @see #getBorder()
   * @generated
   */
  void setBorder(Border value);

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

  /**
   * Returns the value of the '<em><b>Arc Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arc Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arc Height</em>' attribute.
   * @see #setArcHeight(int)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_ArcHeight()
   * @model
   * @generated
   */
  int getArcHeight();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getArcHeight <em>Arc Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arc Height</em>' attribute.
   * @see #getArcHeight()
   * @generated
   */
  void setArcHeight(int value);

  /**
   * Returns the value of the '<em><b>Arc Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arc Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arc Width</em>' attribute.
   * @see #setArcWidth(int)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_ArcWidth()
   * @model
   * @generated
   */
  int getArcWidth();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getArcWidth <em>Arc Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arc Width</em>' attribute.
   * @see #getArcWidth()
   * @generated
   */
  void setArcWidth(int value);

  /**
   * Returns the value of the '<em><b>Tooltip Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tooltip Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tooltip Expression</em>' attribute.
   * @see #setTooltipExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradient_TooltipExpression()
   * @model
   * @generated
   */
  String getTooltipExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getTooltipExpression <em>Tooltip Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tooltip Expression</em>' attribute.
   * @see #getTooltipExpression()
   * @generated
   */
  void setTooltipExpression(String value);

} // Gradient
