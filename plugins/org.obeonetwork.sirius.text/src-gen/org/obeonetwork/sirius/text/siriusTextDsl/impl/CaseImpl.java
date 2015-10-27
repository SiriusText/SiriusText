/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.sirius.text.siriusTextDsl.Case;
import org.obeonetwork.sirius.text.siriusTextDsl.Operation;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CaseImpl#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CaseImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseImpl extends MinimalEObjectImpl.Container implements Case
{
  /**
   * The default value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionExpression()
   * @generated
   * @ordered
   */
  protected static final String CONDITION_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionExpression()
   * @generated
   * @ordered
   */
  protected String conditionExpression = CONDITION_EXPRESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected EList<Operation> body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseImpl()
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
    return SiriusTextDslPackage.Literals.CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConditionExpression()
  {
    return conditionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionExpression(String newConditionExpression)
  {
    String oldConditionExpression = conditionExpression;
    conditionExpression = newConditionExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CASE__CONDITION_EXPRESSION, oldConditionExpression, conditionExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getBody()
  {
    if (body == null)
    {
      body = new EObjectContainmentEList<Operation>(Operation.class, this, SiriusTextDslPackage.CASE__BODY);
    }
    return body;
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
      case SiriusTextDslPackage.CASE__BODY:
        return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
      case SiriusTextDslPackage.CASE__CONDITION_EXPRESSION:
        return getConditionExpression();
      case SiriusTextDslPackage.CASE__BODY:
        return getBody();
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
      case SiriusTextDslPackage.CASE__CONDITION_EXPRESSION:
        setConditionExpression((String)newValue);
        return;
      case SiriusTextDslPackage.CASE__BODY:
        getBody().clear();
        getBody().addAll((Collection<? extends Operation>)newValue);
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
      case SiriusTextDslPackage.CASE__CONDITION_EXPRESSION:
        setConditionExpression(CONDITION_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.CASE__BODY:
        getBody().clear();
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
      case SiriusTextDslPackage.CASE__CONDITION_EXPRESSION:
        return CONDITION_EXPRESSION_EDEFAULT == null ? conditionExpression != null : !CONDITION_EXPRESSION_EDEFAULT.equals(conditionExpression);
      case SiriusTextDslPackage.CASE__BODY:
        return body != null && !body.isEmpty();
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
    result.append(" (conditionExpression: ");
    result.append(conditionExpression);
    result.append(')');
    return result.toString();
  }

} //CaseImpl
