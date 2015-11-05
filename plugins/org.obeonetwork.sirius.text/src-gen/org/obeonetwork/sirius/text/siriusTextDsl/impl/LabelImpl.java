/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.Label;
import org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment;
import org.obeonetwork.sirius.text.siriusTextDsl.LabelFormatOption;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LabelImpl#isShowIcon <em>Show Icon</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LabelImpl#isHideByDefault <em>Hide By Default</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LabelImpl#getIconPath <em>Icon Path</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LabelImpl#getFormatOptions <em>Format Options</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LabelImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LabelImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LabelImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LabelImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends MinimalEObjectImpl.Container implements Label
{
  /**
   * The default value of the '{@link #isShowIcon() <em>Show Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowIcon()
   * @generated
   * @ordered
   */
  protected static final boolean SHOW_ICON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isShowIcon() <em>Show Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowIcon()
   * @generated
   * @ordered
   */
  protected boolean showIcon = SHOW_ICON_EDEFAULT;

  /**
   * The default value of the '{@link #isHideByDefault() <em>Hide By Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHideByDefault()
   * @generated
   * @ordered
   */
  protected static final boolean HIDE_BY_DEFAULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHideByDefault() <em>Hide By Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHideByDefault()
   * @generated
   * @ordered
   */
  protected boolean hideByDefault = HIDE_BY_DEFAULT_EDEFAULT;

  /**
   * The default value of the '{@link #getIconPath() <em>Icon Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIconPath()
   * @generated
   * @ordered
   */
  protected static final String ICON_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIconPath() <em>Icon Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIconPath()
   * @generated
   * @ordered
   */
  protected String iconPath = ICON_PATH_EDEFAULT;

  /**
   * The cached value of the '{@link #getFormatOptions() <em>Format Options</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormatOptions()
   * @generated
   * @ordered
   */
  protected EList<LabelFormatOption> formatOptions;

  /**
   * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignment()
   * @generated
   * @ordered
   */
  protected static final LabelAlignment ALIGNMENT_EDEFAULT = LabelAlignment.LEFT;

  /**
   * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignment()
   * @generated
   * @ordered
   */
  protected LabelAlignment alignment = ALIGNMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final int SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected int size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected static final String EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected String expression = EXPRESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LabelImpl()
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
    return SiriusTextDslPackage.Literals.LABEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isShowIcon()
  {
    return showIcon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShowIcon(boolean newShowIcon)
  {
    boolean oldShowIcon = showIcon;
    showIcon = newShowIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.LABEL__SHOW_ICON, oldShowIcon, showIcon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHideByDefault()
  {
    return hideByDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHideByDefault(boolean newHideByDefault)
  {
    boolean oldHideByDefault = hideByDefault;
    hideByDefault = newHideByDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.LABEL__HIDE_BY_DEFAULT, oldHideByDefault, hideByDefault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIconPath()
  {
    return iconPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIconPath(String newIconPath)
  {
    String oldIconPath = iconPath;
    iconPath = newIconPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.LABEL__ICON_PATH, oldIconPath, iconPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LabelFormatOption> getFormatOptions()
  {
    if (formatOptions == null)
    {
      formatOptions = new EDataTypeEList<LabelFormatOption>(LabelFormatOption.class, this, SiriusTextDslPackage.LABEL__FORMAT_OPTIONS);
    }
    return formatOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelAlignment getAlignment()
  {
    return alignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignment(LabelAlignment newAlignment)
  {
    LabelAlignment oldAlignment = alignment;
    alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.LABEL__ALIGNMENT, oldAlignment, alignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(int newSize)
  {
    int oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.LABEL__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(String newExpression)
  {
    String oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.LABEL__EXPRESSION, oldExpression, expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColor()
  {
    if (color != null && color.eIsProxy())
    {
      InternalEObject oldColor = (InternalEObject)color;
      color = (Color)eResolveProxy(oldColor);
      if (color != oldColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.LABEL__COLOR, oldColor, color));
      }
    }
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(Color newColor)
  {
    Color oldColor = color;
    color = newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.LABEL__COLOR, oldColor, color));
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
      case SiriusTextDslPackage.LABEL__SHOW_ICON:
        return isShowIcon();
      case SiriusTextDslPackage.LABEL__HIDE_BY_DEFAULT:
        return isHideByDefault();
      case SiriusTextDslPackage.LABEL__ICON_PATH:
        return getIconPath();
      case SiriusTextDslPackage.LABEL__FORMAT_OPTIONS:
        return getFormatOptions();
      case SiriusTextDslPackage.LABEL__ALIGNMENT:
        return getAlignment();
      case SiriusTextDslPackage.LABEL__SIZE:
        return getSize();
      case SiriusTextDslPackage.LABEL__EXPRESSION:
        return getExpression();
      case SiriusTextDslPackage.LABEL__COLOR:
        if (resolve) return getColor();
        return basicGetColor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SiriusTextDslPackage.LABEL__SHOW_ICON:
        setShowIcon((Boolean)newValue);
        return;
      case SiriusTextDslPackage.LABEL__HIDE_BY_DEFAULT:
        setHideByDefault((Boolean)newValue);
        return;
      case SiriusTextDslPackage.LABEL__ICON_PATH:
        setIconPath((String)newValue);
        return;
      case SiriusTextDslPackage.LABEL__FORMAT_OPTIONS:
        getFormatOptions().clear();
        getFormatOptions().addAll((Collection<? extends LabelFormatOption>)newValue);
        return;
      case SiriusTextDslPackage.LABEL__ALIGNMENT:
        setAlignment((LabelAlignment)newValue);
        return;
      case SiriusTextDslPackage.LABEL__SIZE:
        setSize((Integer)newValue);
        return;
      case SiriusTextDslPackage.LABEL__EXPRESSION:
        setExpression((String)newValue);
        return;
      case SiriusTextDslPackage.LABEL__COLOR:
        setColor((Color)newValue);
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
      case SiriusTextDslPackage.LABEL__SHOW_ICON:
        setShowIcon(SHOW_ICON_EDEFAULT);
        return;
      case SiriusTextDslPackage.LABEL__HIDE_BY_DEFAULT:
        setHideByDefault(HIDE_BY_DEFAULT_EDEFAULT);
        return;
      case SiriusTextDslPackage.LABEL__ICON_PATH:
        setIconPath(ICON_PATH_EDEFAULT);
        return;
      case SiriusTextDslPackage.LABEL__FORMAT_OPTIONS:
        getFormatOptions().clear();
        return;
      case SiriusTextDslPackage.LABEL__ALIGNMENT:
        setAlignment(ALIGNMENT_EDEFAULT);
        return;
      case SiriusTextDslPackage.LABEL__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case SiriusTextDslPackage.LABEL__EXPRESSION:
        setExpression(EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.LABEL__COLOR:
        setColor((Color)null);
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
      case SiriusTextDslPackage.LABEL__SHOW_ICON:
        return showIcon != SHOW_ICON_EDEFAULT;
      case SiriusTextDslPackage.LABEL__HIDE_BY_DEFAULT:
        return hideByDefault != HIDE_BY_DEFAULT_EDEFAULT;
      case SiriusTextDslPackage.LABEL__ICON_PATH:
        return ICON_PATH_EDEFAULT == null ? iconPath != null : !ICON_PATH_EDEFAULT.equals(iconPath);
      case SiriusTextDslPackage.LABEL__FORMAT_OPTIONS:
        return formatOptions != null && !formatOptions.isEmpty();
      case SiriusTextDslPackage.LABEL__ALIGNMENT:
        return alignment != ALIGNMENT_EDEFAULT;
      case SiriusTextDslPackage.LABEL__SIZE:
        return size != SIZE_EDEFAULT;
      case SiriusTextDslPackage.LABEL__EXPRESSION:
        return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
      case SiriusTextDslPackage.LABEL__COLOR:
        return color != null;
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
    result.append(" (showIcon: ");
    result.append(showIcon);
    result.append(", hideByDefault: ");
    result.append(hideByDefault);
    result.append(", iconPath: ");
    result.append(iconPath);
    result.append(", formatOptions: ");
    result.append(formatOptions);
    result.append(", alignment: ");
    result.append(alignment);
    result.append(", size: ");
    result.append(size);
    result.append(", expression: ");
    result.append(expression);
    result.append(')');
    return result.toString();
  }

} //LabelImpl
