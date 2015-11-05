/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.obeonetwork.sirius.text.siriusTextDsl.Border;
import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.LineStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Border</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.BorderImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.BorderImpl#getBorderSizeComputationExpression <em>Border Size Computation Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.BorderImpl#getBorderColor <em>Border Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BorderImpl extends MinimalEObjectImpl.Container implements Border
{
  /**
   * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineStyle()
   * @generated
   * @ordered
   */
  protected static final LineStyle LINE_STYLE_EDEFAULT = LineStyle.SOLID;

  /**
   * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineStyle()
   * @generated
   * @ordered
   */
  protected LineStyle lineStyle = LINE_STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #getBorderSizeComputationExpression() <em>Border Size Computation Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderSizeComputationExpression()
   * @generated
   * @ordered
   */
  protected static final String BORDER_SIZE_COMPUTATION_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBorderSizeComputationExpression() <em>Border Size Computation Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderSizeComputationExpression()
   * @generated
   * @ordered
   */
  protected String borderSizeComputationExpression = BORDER_SIZE_COMPUTATION_EXPRESSION_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BorderImpl()
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
    return SiriusTextDslPackage.Literals.BORDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineStyle getLineStyle()
  {
    return lineStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLineStyle(LineStyle newLineStyle)
  {
    LineStyle oldLineStyle = lineStyle;
    lineStyle = newLineStyle == null ? LINE_STYLE_EDEFAULT : newLineStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.BORDER__LINE_STYLE, oldLineStyle, lineStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBorderSizeComputationExpression()
  {
    return borderSizeComputationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorderSizeComputationExpression(String newBorderSizeComputationExpression)
  {
    String oldBorderSizeComputationExpression = borderSizeComputationExpression;
    borderSizeComputationExpression = newBorderSizeComputationExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.BORDER__BORDER_SIZE_COMPUTATION_EXPRESSION, oldBorderSizeComputationExpression, borderSizeComputationExpression));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.BORDER__BORDER_COLOR, oldBorderColor, borderColor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.BORDER__BORDER_COLOR, oldBorderColor, borderColor));
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
      case SiriusTextDslPackage.BORDER__LINE_STYLE:
        return getLineStyle();
      case SiriusTextDslPackage.BORDER__BORDER_SIZE_COMPUTATION_EXPRESSION:
        return getBorderSizeComputationExpression();
      case SiriusTextDslPackage.BORDER__BORDER_COLOR:
        if (resolve) return getBorderColor();
        return basicGetBorderColor();
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
      case SiriusTextDslPackage.BORDER__LINE_STYLE:
        setLineStyle((LineStyle)newValue);
        return;
      case SiriusTextDslPackage.BORDER__BORDER_SIZE_COMPUTATION_EXPRESSION:
        setBorderSizeComputationExpression((String)newValue);
        return;
      case SiriusTextDslPackage.BORDER__BORDER_COLOR:
        setBorderColor((Color)newValue);
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
      case SiriusTextDslPackage.BORDER__LINE_STYLE:
        setLineStyle(LINE_STYLE_EDEFAULT);
        return;
      case SiriusTextDslPackage.BORDER__BORDER_SIZE_COMPUTATION_EXPRESSION:
        setBorderSizeComputationExpression(BORDER_SIZE_COMPUTATION_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.BORDER__BORDER_COLOR:
        setBorderColor((Color)null);
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
      case SiriusTextDslPackage.BORDER__LINE_STYLE:
        return lineStyle != LINE_STYLE_EDEFAULT;
      case SiriusTextDslPackage.BORDER__BORDER_SIZE_COMPUTATION_EXPRESSION:
        return BORDER_SIZE_COMPUTATION_EXPRESSION_EDEFAULT == null ? borderSizeComputationExpression != null : !BORDER_SIZE_COMPUTATION_EXPRESSION_EDEFAULT.equals(borderSizeComputationExpression);
      case SiriusTextDslPackage.BORDER__BORDER_COLOR:
        return borderColor != null;
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
    result.append(" (lineStyle: ");
    result.append(lineStyle);
    result.append(", borderSizeComputationExpression: ");
    result.append(borderSizeComputationExpression);
    result.append(')');
    return result.toString();
  }

} //BorderImpl
