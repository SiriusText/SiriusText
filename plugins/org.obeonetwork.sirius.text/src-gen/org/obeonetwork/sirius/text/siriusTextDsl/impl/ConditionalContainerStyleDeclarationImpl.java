/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration;
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Container Style Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ConditionalContainerStyleDeclarationImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ConditionalContainerStyleDeclarationImpl#getConditionalStyleExpression <em>Conditional Style Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalContainerStyleDeclarationImpl extends MinimalEObjectImpl.Container implements ConditionalContainerStyleDeclaration
{
  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected ContainerStyle style;

  /**
   * The default value of the '{@link #getConditionalStyleExpression() <em>Conditional Style Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionalStyleExpression()
   * @generated
   * @ordered
   */
  protected static final String CONDITIONAL_STYLE_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConditionalStyleExpression() <em>Conditional Style Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionalStyleExpression()
   * @generated
   * @ordered
   */
  protected String conditionalStyleExpression = CONDITIONAL_STYLE_EXPRESSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalContainerStyleDeclarationImpl()
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
    return SiriusTextDslPackage.Literals.CONDITIONAL_CONTAINER_STYLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerStyle getStyle()
  {
    if (style != null && style.eIsProxy())
    {
      InternalEObject oldStyle = (InternalEObject)style;
      style = (ContainerStyle)eResolveProxy(oldStyle);
      if (style != oldStyle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION__STYLE, oldStyle, style));
      }
    }
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerStyle basicGetStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(ContainerStyle newStyle)
  {
    ContainerStyle oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConditionalStyleExpression()
  {
    return conditionalStyleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionalStyleExpression(String newConditionalStyleExpression)
  {
    String oldConditionalStyleExpression = conditionalStyleExpression;
    conditionalStyleExpression = newConditionalStyleExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION__CONDITIONAL_STYLE_EXPRESSION, oldConditionalStyleExpression, conditionalStyleExpression));
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
      case SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION__STYLE:
        if (resolve) return getStyle();
        return basicGetStyle();
      case SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION__CONDITIONAL_STYLE_EXPRESSION:
        return getConditionalStyleExpression();
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
      case SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION__STYLE:
        setStyle((ContainerStyle)newValue);
        return;
      case SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION__CONDITIONAL_STYLE_EXPRESSION:
        setConditionalStyleExpression((String)newValue);
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
      case SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION__STYLE:
        setStyle((ContainerStyle)null);
        return;
      case SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION__CONDITIONAL_STYLE_EXPRESSION:
        setConditionalStyleExpression(CONDITIONAL_STYLE_EXPRESSION_EDEFAULT);
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
      case SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION__STYLE:
        return style != null;
      case SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION__CONDITIONAL_STYLE_EXPRESSION:
        return CONDITIONAL_STYLE_EXPRESSION_EDEFAULT == null ? conditionalStyleExpression != null : !CONDITIONAL_STYLE_EXPRESSION_EDEFAULT.equals(conditionalStyleExpression);
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
    result.append(" (conditionalStyleExpression: ");
    result.append(conditionalStyleExpression);
    result.append(')');
    return result.toString();
  }

} //ConditionalContainerStyleDeclarationImpl
