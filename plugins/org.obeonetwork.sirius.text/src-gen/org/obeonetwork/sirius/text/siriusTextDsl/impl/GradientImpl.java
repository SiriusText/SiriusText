/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.Gradient;
import org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection;
import org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment;
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
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getLabelAlignment <em>Label Alignment</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getLabelColor <em>Label Color</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getBorderSize <em>Border Size</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl#getWidth <em>Width</em>}</li>
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
   * The default value of the '{@link #getLabelAlignment() <em>Label Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelAlignment()
   * @generated
   * @ordered
   */
  protected static final LabelAlignment LABEL_ALIGNMENT_EDEFAULT = LabelAlignment.LEFT;

  /**
   * The cached value of the '{@link #getLabelAlignment() <em>Label Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelAlignment()
   * @generated
   * @ordered
   */
  protected LabelAlignment labelAlignment = LABEL_ALIGNMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelExpression()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelExpression()
   * @generated
   * @ordered
   */
  protected String labelExpression = LABEL_EXPRESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getLabelColor() <em>Label Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelColor()
   * @generated
   * @ordered
   */
  protected Color labelColor;

  /**
   * The default value of the '{@link #getBorderSize() <em>Border Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderSize()
   * @generated
   * @ordered
   */
  protected static final int BORDER_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBorderSize() <em>Border Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderSize()
   * @generated
   * @ordered
   */
  protected int borderSize = BORDER_SIZE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderColor()
   * @generated
   * @ordered
   */
  protected Color borderColor;

  /**
   * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected static final String ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected String icon = ICON_EDEFAULT;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final int HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected int height = HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected int width = WIDTH_EDEFAULT;

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
  public LabelAlignment getLabelAlignment()
  {
    return labelAlignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelAlignment(LabelAlignment newLabelAlignment)
  {
    LabelAlignment oldLabelAlignment = labelAlignment;
    labelAlignment = newLabelAlignment == null ? LABEL_ALIGNMENT_EDEFAULT : newLabelAlignment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__LABEL_ALIGNMENT, oldLabelAlignment, labelAlignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabelExpression()
  {
    return labelExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelExpression(String newLabelExpression)
  {
    String oldLabelExpression = labelExpression;
    labelExpression = newLabelExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__LABEL_EXPRESSION, oldLabelExpression, labelExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getLabelColor()
  {
    if (labelColor != null && labelColor.eIsProxy())
    {
      InternalEObject oldLabelColor = (InternalEObject)labelColor;
      labelColor = (Color)eResolveProxy(oldLabelColor);
      if (labelColor != oldLabelColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.GRADIENT__LABEL_COLOR, oldLabelColor, labelColor));
      }
    }
    return labelColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetLabelColor()
  {
    return labelColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelColor(Color newLabelColor)
  {
    Color oldLabelColor = labelColor;
    labelColor = newLabelColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__LABEL_COLOR, oldLabelColor, labelColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBorderSize()
  {
    return borderSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorderSize(int newBorderSize)
  {
    int oldBorderSize = borderSize;
    borderSize = newBorderSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__BORDER_SIZE, oldBorderSize, borderSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getBorderColor()
  {
    if (borderColor != null && borderColor.eIsProxy())
    {
      InternalEObject oldBorderColor = (InternalEObject)borderColor;
      borderColor = (Color)eResolveProxy(oldBorderColor);
      if (borderColor != oldBorderColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.GRADIENT__BORDER_COLOR, oldBorderColor, borderColor));
      }
    }
    return borderColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetBorderColor()
  {
    return borderColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorderColor(Color newBorderColor)
  {
    Color oldBorderColor = borderColor;
    borderColor = newBorderColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__BORDER_COLOR, oldBorderColor, borderColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIcon()
  {
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcon(String newIcon)
  {
    String oldIcon = icon;
    icon = newIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__ICON, oldIcon, icon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(int newHeight)
  {
    int oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(int newWidth)
  {
    int oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.GRADIENT__WIDTH, oldWidth, width));
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
      case SiriusTextDslPackage.GRADIENT__LABEL_ALIGNMENT:
        return getLabelAlignment();
      case SiriusTextDslPackage.GRADIENT__LABEL_EXPRESSION:
        return getLabelExpression();
      case SiriusTextDslPackage.GRADIENT__LABEL_COLOR:
        if (resolve) return getLabelColor();
        return basicGetLabelColor();
      case SiriusTextDslPackage.GRADIENT__BORDER_SIZE:
        return getBorderSize();
      case SiriusTextDslPackage.GRADIENT__BORDER_COLOR:
        if (resolve) return getBorderColor();
        return basicGetBorderColor();
      case SiriusTextDslPackage.GRADIENT__ICON:
        return getIcon();
      case SiriusTextDslPackage.GRADIENT__HEIGHT:
        return getHeight();
      case SiriusTextDslPackage.GRADIENT__WIDTH:
        return getWidth();
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
      case SiriusTextDslPackage.GRADIENT__LABEL_ALIGNMENT:
        setLabelAlignment((LabelAlignment)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__LABEL_EXPRESSION:
        setLabelExpression((String)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__LABEL_COLOR:
        setLabelColor((Color)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__BORDER_SIZE:
        setBorderSize((Integer)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__BORDER_COLOR:
        setBorderColor((Color)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__ICON:
        setIcon((String)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__HEIGHT:
        setHeight((Integer)newValue);
        return;
      case SiriusTextDslPackage.GRADIENT__WIDTH:
        setWidth((Integer)newValue);
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
      case SiriusTextDslPackage.GRADIENT__LABEL_ALIGNMENT:
        setLabelAlignment(LABEL_ALIGNMENT_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__LABEL_EXPRESSION:
        setLabelExpression(LABEL_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__LABEL_COLOR:
        setLabelColor((Color)null);
        return;
      case SiriusTextDslPackage.GRADIENT__BORDER_SIZE:
        setBorderSize(BORDER_SIZE_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__BORDER_COLOR:
        setBorderColor((Color)null);
        return;
      case SiriusTextDslPackage.GRADIENT__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case SiriusTextDslPackage.GRADIENT__WIDTH:
        setWidth(WIDTH_EDEFAULT);
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
      case SiriusTextDslPackage.GRADIENT__LABEL_ALIGNMENT:
        return labelAlignment != LABEL_ALIGNMENT_EDEFAULT;
      case SiriusTextDslPackage.GRADIENT__LABEL_EXPRESSION:
        return LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null : !LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
      case SiriusTextDslPackage.GRADIENT__LABEL_COLOR:
        return labelColor != null;
      case SiriusTextDslPackage.GRADIENT__BORDER_SIZE:
        return borderSize != BORDER_SIZE_EDEFAULT;
      case SiriusTextDslPackage.GRADIENT__BORDER_COLOR:
        return borderColor != null;
      case SiriusTextDslPackage.GRADIENT__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case SiriusTextDslPackage.GRADIENT__HEIGHT:
        return height != HEIGHT_EDEFAULT;
      case SiriusTextDslPackage.GRADIENT__WIDTH:
        return width != WIDTH_EDEFAULT;
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
    result.append(", labelAlignment: ");
    result.append(labelAlignment);
    result.append(", labelExpression: ");
    result.append(labelExpression);
    result.append(", borderSize: ");
    result.append(borderSize);
    result.append(", icon: ");
    result.append(icon);
    result.append(", height: ");
    result.append(height);
    result.append(", width: ");
    result.append(width);
    result.append(')');
    return result.toString();
  }

} //GradientImpl
