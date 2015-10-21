/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.sirius.text.siriusTextDsl.RGB;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RGB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RGBImpl#getRed <em>Red</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RGBImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RGBImpl#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RGBImpl extends ColorValueImpl implements RGB
{
  /**
   * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRed()
   * @generated
   * @ordered
   */
  protected static final int RED_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRed()
   * @generated
   * @ordered
   */
  protected int red = RED_EDEFAULT;

  /**
   * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreen()
   * @generated
   * @ordered
   */
  protected static final int GREEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreen()
   * @generated
   * @ordered
   */
  protected int green = GREEN_EDEFAULT;

  /**
   * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlue()
   * @generated
   * @ordered
   */
  protected static final int BLUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlue()
   * @generated
   * @ordered
   */
  protected int blue = BLUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RGBImpl()
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
    return SiriusTextDslPackage.Literals.RGB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRed()
  {
    return red;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRed(int newRed)
  {
    int oldRed = red;
    red = newRed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.RGB__RED, oldRed, red));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getGreen()
  {
    return green;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreen(int newGreen)
  {
    int oldGreen = green;
    green = newGreen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.RGB__GREEN, oldGreen, green));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBlue()
  {
    return blue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlue(int newBlue)
  {
    int oldBlue = blue;
    blue = newBlue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.RGB__BLUE, oldBlue, blue));
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
      case SiriusTextDslPackage.RGB__RED:
        return getRed();
      case SiriusTextDslPackage.RGB__GREEN:
        return getGreen();
      case SiriusTextDslPackage.RGB__BLUE:
        return getBlue();
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
      case SiriusTextDslPackage.RGB__RED:
        setRed((Integer)newValue);
        return;
      case SiriusTextDslPackage.RGB__GREEN:
        setGreen((Integer)newValue);
        return;
      case SiriusTextDslPackage.RGB__BLUE:
        setBlue((Integer)newValue);
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
      case SiriusTextDslPackage.RGB__RED:
        setRed(RED_EDEFAULT);
        return;
      case SiriusTextDslPackage.RGB__GREEN:
        setGreen(GREEN_EDEFAULT);
        return;
      case SiriusTextDslPackage.RGB__BLUE:
        setBlue(BLUE_EDEFAULT);
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
      case SiriusTextDslPackage.RGB__RED:
        return red != RED_EDEFAULT;
      case SiriusTextDslPackage.RGB__GREEN:
        return green != GREEN_EDEFAULT;
      case SiriusTextDslPackage.RGB__BLUE:
        return blue != BLUE_EDEFAULT;
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
    result.append(" (red: ");
    result.append(red);
    result.append(", green: ");
    result.append(green);
    result.append(", blue: ");
    result.append(blue);
    result.append(')');
    return result.toString();
  }

} //RGBImpl
