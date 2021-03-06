/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.sirius.text.siriusTextDsl.Border;
import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerLabelBorderStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.Gradient;
import org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection;
import org.obeonetwork.sirius.text.siriusTextDsl.Label;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gradient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getLabelBorderStyle <em>Label Border Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getHeightComputationExpression <em>Height Computation Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getWidthComputationExpression <em>Width Computation Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getArcHeight <em>Arc Height</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getArcWidth <em>Arc Width</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getTooltipExpression <em>Tooltip Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GradientImpl extends ContainerStyleImpl implements Gradient
{
  /**
   * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected String documentation = DOCUMENTATION_EDEFAULT;

  /**
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final GradientDirection DIRECTION_EDEFAULT = GradientDirection.OBLIQUE;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected GradientDirection direction = DIRECTION_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackgroundColor()
   * @generated
   * @ordered
   */
  protected Color backgroundColor;

  /**
   * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForegroundColor()
   * @generated
   * @ordered
   */
  protected Color foregroundColor;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected Label label;

  /**
   * The default value of the '{@link #getLabelBorderStyle() <em>Label Border Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelBorderStyle()
   * @generated
   * @ordered
   */
  protected static final ContainerLabelBorderStyle LABEL_BORDER_STYLE_EDEFAULT = ContainerLabelBorderStyle.LABEL_BORDER_STYLE_WITH_BEVELED_CORNER;

  /**
   * The cached value of the '{@link #getLabelBorderStyle() <em>Label Border Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelBorderStyle()
   * @generated
   * @ordered
   */
  protected ContainerLabelBorderStyle labelBorderStyle = LABEL_BORDER_STYLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBorder() <em>Border</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorder()
   * @generated
   * @ordered
   */
  protected Border border;

  /**
   * The default value of the '{@link #getHeightComputationExpression() <em>Height Computation Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeightComputationExpression()
   * @generated
   * @ordered
   */
  protected static final String HEIGHT_COMPUTATION_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeightComputationExpression() <em>Height Computation Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeightComputationExpression()
   * @generated
   * @ordered
   */
  protected String heightComputationExpression = HEIGHT_COMPUTATION_EXPRESSION_EDEFAULT;

  /**
   * The default value of the '{@link #getWidthComputationExpression() <em>Width Computation Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidthComputationExpression()
   * @generated
   * @ordered
   */
  protected static final String WIDTH_COMPUTATION_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWidthComputationExpression() <em>Width Computation Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidthComputationExpression()
   * @generated
   * @ordered
   */
  protected String widthComputationExpression = WIDTH_COMPUTATION_EXPRESSION_EDEFAULT;

  /**
   * The default value of the '{@link #getArcHeight() <em>Arc Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArcHeight()
   * @generated
   * @ordered
   */
  protected static final int ARC_HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArcHeight() <em>Arc Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArcHeight()
   * @generated
   * @ordered
   */
  protected int arcHeight = ARC_HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getArcWidth() <em>Arc Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArcWidth()
   * @generated
   * @ordered
   */
  protected static final int ARC_WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArcWidth() <em>Arc Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArcWidth()
   * @generated
   * @ordered
   */
  protected int arcWidth = ARC_WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getTooltipExpression() <em>Tooltip Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooltipExpression()
   * @generated
   * @ordered
   */
  protected static final String TOOLTIP_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTooltipExpression() <em>Tooltip Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooltipExpression()
   * @generated
   * @ordered
   */
  protected String tooltipExpression = TOOLTIP_EXPRESSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GradientImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SiriusTextDslPackage.Literals.GRADIENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocumentation()
  {
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocumentation(String newDocumentation)
  {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GradientDirection getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(GradientDirection newDirection)
  {
    GradientDirection oldDirection = direction;
    direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__DIRECTION, oldDirection, direction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getBackgroundColor()
  {
    if (backgroundColor != null && backgroundColor.eIsProxy())
    {
      InternalEObject oldBackgroundColor = (InternalEObject)backgroundColor;
      backgroundColor = (Color)eResolveProxy(oldBackgroundColor);
      if (backgroundColor != oldBackgroundColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.GRADIENT__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
      }
    }
    return backgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetBackgroundColor()
  {
    return backgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackgroundColor(Color newBackgroundColor)
  {
    Color oldBackgroundColor = backgroundColor;
    backgroundColor = newBackgroundColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getForegroundColor()
  {
    if (foregroundColor != null && foregroundColor.eIsProxy())
    {
      InternalEObject oldForegroundColor = (InternalEObject)foregroundColor;
      foregroundColor = (Color)eResolveProxy(oldForegroundColor);
      if (foregroundColor != oldForegroundColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.GRADIENT__FOREGROUND_COLOR, oldForegroundColor, foregroundColor));
      }
    }
    return foregroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetForegroundColor()
  {
    return foregroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForegroundColor(Color newForegroundColor)
  {
    Color oldForegroundColor = foregroundColor;
    foregroundColor = newForegroundColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__FOREGROUND_COLOR, oldForegroundColor, foregroundColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs)
  {
    Label oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(Label newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiriusTextDslPackage.GRADIENT__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiriusTextDslPackage.GRADIENT__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerLabelBorderStyle getLabelBorderStyle()
  {
    return labelBorderStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelBorderStyle(ContainerLabelBorderStyle newLabelBorderStyle)
  {
    ContainerLabelBorderStyle oldLabelBorderStyle = labelBorderStyle;
    labelBorderStyle = newLabelBorderStyle == null ? LABEL_BORDER_STYLE_EDEFAULT : newLabelBorderStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__LABEL_BORDER_STYLE, oldLabelBorderStyle, labelBorderStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Border getBorder()
  {
    return border;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBorder(Border newBorder, NotificationChain msgs)
  {
    Border oldBorder = border;
    border = newBorder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__BORDER, oldBorder, newBorder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorder(Border newBorder)
  {
    if (newBorder != border)
    {
      NotificationChain msgs = null;
      if (border != null)
        msgs = ((InternalEObject)border).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiriusTextDslPackage.GRADIENT__BORDER, null, msgs);
      if (newBorder != null)
        msgs = ((InternalEObject)newBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiriusTextDslPackage.GRADIENT__BORDER, null, msgs);
      msgs = basicSetBorder(newBorder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__BORDER, newBorder, newBorder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHeightComputationExpression()
  {
    return heightComputationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeightComputationExpression(String newHeightComputationExpression)
  {
    String oldHeightComputationExpression = heightComputationExpression;
    heightComputationExpression = newHeightComputationExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__HEIGHT_COMPUTATION_EXPRESSION, oldHeightComputationExpression, heightComputationExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWidthComputationExpression()
  {
    return widthComputationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidthComputationExpression(String newWidthComputationExpression)
  {
    String oldWidthComputationExpression = widthComputationExpression;
    widthComputationExpression = newWidthComputationExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__WIDTH_COMPUTATION_EXPRESSION, oldWidthComputationExpression, widthComputationExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArcHeight()
  {
    return arcHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArcHeight(int newArcHeight)
  {
    int oldArcHeight = arcHeight;
    arcHeight = newArcHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__ARC_HEIGHT, oldArcHeight, arcHeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArcWidth()
  {
    return arcWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArcWidth(int newArcWidth)
  {
    int oldArcWidth = arcWidth;
    arcWidth = newArcWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__ARC_WIDTH, oldArcWidth, arcWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTooltipExpression()
  {
    return tooltipExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTooltipExpression(String newTooltipExpression)
  {
    String oldTooltipExpression = tooltipExpression;
    tooltipExpression = newTooltipExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__TOOLTIP_EXPRESSION, oldTooltipExpression, tooltipExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SiriusTextDslPackage.GRADIENT__LABEL:
        return basicSetLabel(null, msgs);
      case SiriusTextDslPackage.GRADIENT__BORDER:
        return basicSetBorder(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SiriusTextDslPackage.GRADIENT__DOCUMENTATION:
        return getDocumentation();
      case SiriusTextDslPackage.GRADIENT__DIRECTION:
        return getDirection();
      case SiriusTextDslPackage.GRADIENT__NAME:
        return getName();
      case SiriusTextDslPackage.GRADIENT__BACKGROUND_COLOR:
        if (resolve) return getBackgroundColor();
        return basicGetBackgroundColor();
      case SiriusTextDslPackage.GRADIENT__FOREGROUND_COLOR:
        if (resolve) return getForegroundColor();
        return basicGetForegroundColor();
      case SiriusTextDslPackage.GRADIENT__LABEL:
        return getLabel();
      case SiriusTextDslPackage.GRADIENT__LABEL_BORDER_STYLE:
        return getLabelBorderStyle();
      case SiriusTextDslPackage.GRADIENT__BORDER:
        return getBorder();
      case SiriusTextDslPackage.GRADIENT__HEIGHT_COMPUTATION_EXPRESSION:
        return getHeightComputationExpression();
      case SiriusTextDslPackage.GRADIENT__WIDTH_COMPUTATION_EXPRESSION:
        return getWidthComputationExpression();
      case SiriusTextDslPackage.GRADIENT__ARC_HEIGHT:
        return getArcHeight();
      case SiriusTextDslPackage.GRADIENT__ARC_WIDTH:
        return getArcWidth();
      case SiriusTextDslPackage.GRADIENT__TOOLTIP_EXPRESSION:
        return getTooltipExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SiriusTextDslPackage.GRADIENT__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__DIRECTION:
        setDirection((GradientDirection)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__NAME:
        setName((String)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__BACKGROUND_COLOR:
        setBackgroundColor((Color)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__FOREGROUND_COLOR:
        setForegroundColor((Color)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__LABEL:
        setLabel((Label)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__LABEL_BORDER_STYLE:
        setLabelBorderStyle((ContainerLabelBorderStyle)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__BORDER:
        setBorder((Border)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__HEIGHT_COMPUTATION_EXPRESSION:
        setHeightComputationExpression((String)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__WIDTH_COMPUTATION_EXPRESSION:
        setWidthComputationExpression((String)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__ARC_HEIGHT:
        setArcHeight((Integer)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__ARC_WIDTH:
        setArcWidth((Integer)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__TOOLTIP_EXPRESSION:
        setTooltipExpression((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SiriusTextDslPackage.GRADIENT__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__BACKGROUND_COLOR:
        setBackgroundColor((Color)null);
        return;
      case SiriusTextDslPackage.GRADIENT__FOREGROUND_COLOR:
        setForegroundColor((Color)null);
        return;
      case SiriusTextDslPackage.GRADIENT__LABEL:
        setLabel((Label)null);
        return;
      case SiriusTextDslPackage.GRADIENT__LABEL_BORDER_STYLE:
        setLabelBorderStyle(LABEL_BORDER_STYLE_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__BORDER:
        setBorder((Border)null);
        return;
      case SiriusTextDslPackage.GRADIENT__HEIGHT_COMPUTATION_EXPRESSION:
        setHeightComputationExpression(HEIGHT_COMPUTATION_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__WIDTH_COMPUTATION_EXPRESSION:
        setWidthComputationExpression(WIDTH_COMPUTATION_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__ARC_HEIGHT:
        setArcHeight(ARC_HEIGHT_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__ARC_WIDTH:
        setArcWidth(ARC_WIDTH_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__TOOLTIP_EXPRESSION:
        setTooltipExpression(TOOLTIP_EXPRESSION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SiriusTextDslPackage.GRADIENT__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SiriusTextDslPackage.GRADIENT__DIRECTION:
        return direction != DIRECTION_EDEFAULT;
      case SiriusTextDslPackage.GRADIENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SiriusTextDslPackage.GRADIENT__BACKGROUND_COLOR:
        return backgroundColor != null;
      case SiriusTextDslPackage.GRADIENT__FOREGROUND_COLOR:
        return foregroundColor != null;
      case SiriusTextDslPackage.GRADIENT__LABEL:
        return label != null;
      case SiriusTextDslPackage.GRADIENT__LABEL_BORDER_STYLE:
        return labelBorderStyle != LABEL_BORDER_STYLE_EDEFAULT;
      case SiriusTextDslPackage.GRADIENT__BORDER:
        return border != null;
      case SiriusTextDslPackage.GRADIENT__HEIGHT_COMPUTATION_EXPRESSION:
        return HEIGHT_COMPUTATION_EXPRESSION_EDEFAULT == null ? heightComputationExpression != null : !HEIGHT_COMPUTATION_EXPRESSION_EDEFAULT.equals(heightComputationExpression);
      case SiriusTextDslPackage.GRADIENT__WIDTH_COMPUTATION_EXPRESSION:
        return WIDTH_COMPUTATION_EXPRESSION_EDEFAULT == null ? widthComputationExpression != null : !WIDTH_COMPUTATION_EXPRESSION_EDEFAULT.equals(widthComputationExpression);
      case SiriusTextDslPackage.GRADIENT__ARC_HEIGHT:
        return arcHeight != ARC_HEIGHT_EDEFAULT;
      case SiriusTextDslPackage.GRADIENT__ARC_WIDTH:
        return arcWidth != ARC_WIDTH_EDEFAULT;
      case SiriusTextDslPackage.GRADIENT__TOOLTIP_EXPRESSION:
        return TOOLTIP_EXPRESSION_EDEFAULT == null ? tooltipExpression != null : !TOOLTIP_EXPRESSION_EDEFAULT.equals(tooltipExpression);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (documentation: ");
    result.append(documentation);
    result.append(", direction: ");
    result.append(direction);
    result.append(", name: ");
    result.append(name);
    result.append(", labelBorderStyle: ");
    result.append(labelBorderStyle);
    result.append(", heightComputationExpression: ");
    result.append(heightComputationExpression);
    result.append(", widthComputationExpression: ");
    result.append(widthComputationExpression);
    result.append(", arcHeight: ");
    result.append(arcHeight);
    result.append(", arcWidth: ");
    result.append(arcWidth);
    result.append(", tooltipExpression: ");
    result.append(tooltipExpression);
    result.append(')');
    return result.toString();
  }

} //GradientImpl
