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
import org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel;
import org.obeonetwork.sirius.text.siriusTextDsl.LabelFormatOption;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeLabelImpl#isShowIcon <em>Show Icon</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeLabelImpl#getIconPath <em>Icon Path</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeLabelImpl#getFormatOptions <em>Format Options</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeLabelImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeLabelImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeLabelImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeLabelImpl extends MinimalEObjectImpl.Container implements EdgeLabel
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
  protected EdgeLabelImpl()
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
    return SiriusTextDslPackage.Literals.EDGE_LABEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_LABEL__SHOW_ICON, oldShowIcon, showIcon));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_LABEL__ICON_PATH, oldIconPath, iconPath));
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
      formatOptions = new EDataTypeEList<LabelFormatOption>(LabelFormatOption.class, this, SiriusTextDslPackage.EDGE_LABEL__FORMAT_OPTIONS);
    }
    return formatOptions;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_LABEL__SIZE, oldSize, size));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_LABEL__EXPRESSION, oldExpression, expression));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.EDGE_LABEL__COLOR, oldColor, color));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_LABEL__COLOR, oldColor, color));
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
      case SiriusTextDslPackage.EDGE_LABEL__SHOW_ICON:
        return isShowIcon();
      case SiriusTextDslPackage.EDGE_LABEL__ICON_PATH:
        return getIconPath();
      case SiriusTextDslPackage.EDGE_LABEL__FORMAT_OPTIONS:
        return getFormatOptions();
      case SiriusTextDslPackage.EDGE_LABEL__SIZE:
        return getSize();
      case SiriusTextDslPackage.EDGE_LABEL__EXPRESSION:
        return getExpression();
      case SiriusTextDslPackage.EDGE_LABEL__COLOR:
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
      case SiriusTextDslPackage.EDGE_LABEL__SHOW_ICON:
        setShowIcon((Boolean)newValue);
        return;
      case SiriusTextDslPackage.EDGE_LABEL__ICON_PATH:
        setIconPath((String)newValue);
        return;
      case SiriusTextDslPackage.EDGE_LABEL__FORMAT_OPTIONS:
        getFormatOptions().clear();
        getFormatOptions().addAll((Collection<? extends LabelFormatOption>)newValue);
        return;
      case SiriusTextDslPackage.EDGE_LABEL__SIZE:
        setSize((Integer)newValue);
        return;
      case SiriusTextDslPackage.EDGE_LABEL__EXPRESSION:
        setExpression((String)newValue);
        return;
      case SiriusTextDslPackage.EDGE_LABEL__COLOR:
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
      case SiriusTextDslPackage.EDGE_LABEL__SHOW_ICON:
        setShowIcon(SHOW_ICON_EDEFAULT);
        return;
      case SiriusTextDslPackage.EDGE_LABEL__ICON_PATH:
        setIconPath(ICON_PATH_EDEFAULT);
        return;
      case SiriusTextDslPackage.EDGE_LABEL__FORMAT_OPTIONS:
        getFormatOptions().clear();
        return;
      case SiriusTextDslPackage.EDGE_LABEL__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case SiriusTextDslPackage.EDGE_LABEL__EXPRESSION:
        setExpression(EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.EDGE_LABEL__COLOR:
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
      case SiriusTextDslPackage.EDGE_LABEL__SHOW_ICON:
        return showIcon != SHOW_ICON_EDEFAULT;
      case SiriusTextDslPackage.EDGE_LABEL__ICON_PATH:
        return ICON_PATH_EDEFAULT == null ? iconPath != null : !ICON_PATH_EDEFAULT.equals(iconPath);
      case SiriusTextDslPackage.EDGE_LABEL__FORMAT_OPTIONS:
        return formatOptions != null && !formatOptions.isEmpty();
      case SiriusTextDslPackage.EDGE_LABEL__SIZE:
        return size != SIZE_EDEFAULT;
      case SiriusTextDslPackage.EDGE_LABEL__EXPRESSION:
        return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
      case SiriusTextDslPackage.EDGE_LABEL__COLOR:
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
    result.append(", iconPath: ");
    result.append(iconPath);
    result.append(", formatOptions: ");
    result.append(formatOptions);
    result.append(", size: ");
    result.append(size);
    result.append(", expression: ");
    result.append(expression);
    result.append(')');
    return result.toString();
  }

} //EdgeLabelImpl
