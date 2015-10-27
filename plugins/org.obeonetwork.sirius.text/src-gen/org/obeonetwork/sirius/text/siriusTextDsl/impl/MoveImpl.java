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

import org.obeonetwork.sirius.text.siriusTextDsl.Move;
import org.obeonetwork.sirius.text.siriusTextDsl.Operation;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MoveImpl#getNewContainerExpression <em>New Container Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MoveImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MoveImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveImpl extends OperationImpl implements Move
{
  /**
   * The default value of the '{@link #getNewContainerExpression() <em>New Container Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewContainerExpression()
   * @generated
   * @ordered
   */
  protected static final String NEW_CONTAINER_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNewContainerExpression() <em>New Container Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewContainerExpression()
   * @generated
   * @ordered
   */
  protected String newContainerExpression = NEW_CONTAINER_EXPRESSION_EDEFAULT;

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
  protected MoveImpl()
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
    return SiriusTextDslPackage.Literals.MOVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNewContainerExpression()
  {
    return newContainerExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewContainerExpression(String newNewContainerExpression)
  {
    String oldNewContainerExpression = newContainerExpression;
    newContainerExpression = newNewContainerExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.MOVE__NEW_CONTAINER_EXPRESSION, oldNewContainerExpression, newContainerExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.MOVE__FEATURE_NAME, oldFeatureName, featureName));
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
      body = new EObjectContainmentEList<Operation>(Operation.class, this, SiriusTextDslPackage.MOVE__BODY);
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
      case SiriusTextDslPackage.MOVE__BODY:
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
      case SiriusTextDslPackage.MOVE__NEW_CONTAINER_EXPRESSION:
        return getNewContainerExpression();
      case SiriusTextDslPackage.MOVE__FEATURE_NAME:
        return getFeatureName();
      case SiriusTextDslPackage.MOVE__BODY:
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
      case SiriusTextDslPackage.MOVE__NEW_CONTAINER_EXPRESSION:
        setNewContainerExpression((String)newValue);
        return;
      case SiriusTextDslPackage.MOVE__FEATURE_NAME:
        setFeatureName((String)newValue);
        return;
      case SiriusTextDslPackage.MOVE__BODY:
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
      case SiriusTextDslPackage.MOVE__NEW_CONTAINER_EXPRESSION:
        setNewContainerExpression(NEW_CONTAINER_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.MOVE__FEATURE_NAME:
        setFeatureName(FEATURE_NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.MOVE__BODY:
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
      case SiriusTextDslPackage.MOVE__NEW_CONTAINER_EXPRESSION:
        return NEW_CONTAINER_EXPRESSION_EDEFAULT == null ? newContainerExpression != null : !NEW_CONTAINER_EXPRESSION_EDEFAULT.equals(newContainerExpression);
      case SiriusTextDslPackage.MOVE__FEATURE_NAME:
        return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
      case SiriusTextDslPackage.MOVE__BODY:
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
    result.append(" (newContainerExpression: ");
    result.append(newContainerExpression);
    result.append(", featureName: ");
    result.append(featureName);
    result.append(')');
    return result.toString();
  }

} //MoveImpl
