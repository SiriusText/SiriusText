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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.sirius.text.siriusTextDsl.Operation;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;
import org.obeonetwork.sirius.text.siriusTextDsl.Unset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.UnsetImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.UnsetImpl#getElementExpression <em>Element Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.UnsetImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnsetImpl extends OperationImpl implements Unset
{
  /**
   * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureName()
   * @generated
   * @ordered
   */
  protected static final String FEATURE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureName()
   * @generated
   * @ordered
   */
  protected String featureName = FEATURE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getElementExpression() <em>Element Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementExpression()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElementExpression() <em>Element Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementExpression()
   * @generated
   * @ordered
   */
  protected String elementExpression = ELEMENT_EXPRESSION_EDEFAULT;

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
  protected UnsetImpl()
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
    return SiriusTextDslPackage.Literals.UNSET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFeatureName()
  {
    return featureName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureName(String newFeatureName)
  {
    String oldFeatureName = featureName;
    featureName = newFeatureName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.UNSET__FEATURE_NAME, oldFeatureName, featureName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElementExpression()
  {
    return elementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementExpression(String newElementExpression)
  {
    String oldElementExpression = elementExpression;
    elementExpression = newElementExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.UNSET__ELEMENT_EXPRESSION, oldElementExpression, elementExpression));
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
      body = new EObjectContainmentEList<Operation>(Operation.class, this, SiriusTextDslPackage.UNSET__BODY);
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
      case SiriusTextDslPackage.UNSET__BODY:
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
      case SiriusTextDslPackage.UNSET__FEATURE_NAME:
        return getFeatureName();
      case SiriusTextDslPackage.UNSET__ELEMENT_EXPRESSION:
        return getElementExpression();
      case SiriusTextDslPackage.UNSET__BODY:
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
      case SiriusTextDslPackage.UNSET__FEATURE_NAME:
        setFeatureName((String)newValue);
        return;
      case SiriusTextDslPackage.UNSET__ELEMENT_EXPRESSION:
        setElementExpression((String)newValue);
        return;
      case SiriusTextDslPackage.UNSET__BODY:
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
      case SiriusTextDslPackage.UNSET__FEATURE_NAME:
        setFeatureName(FEATURE_NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.UNSET__ELEMENT_EXPRESSION:
        setElementExpression(ELEMENT_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.UNSET__BODY:
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
      case SiriusTextDslPackage.UNSET__FEATURE_NAME:
        return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
      case SiriusTextDslPackage.UNSET__ELEMENT_EXPRESSION:
        return ELEMENT_EXPRESSION_EDEFAULT == null ? elementExpression != null : !ELEMENT_EXPRESSION_EDEFAULT.equals(elementExpression);
      case SiriusTextDslPackage.UNSET__BODY:
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
    result.append(" (featureName: ");
    result.append(featureName);
    result.append(", elementExpression: ");
    result.append(elementExpression);
    result.append(')');
    return result.toString();
  }

} //UnsetImpl
