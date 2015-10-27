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

import org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext;
import org.obeonetwork.sirius.text.siriusTextDsl.Operation;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ChangeContextImpl#getBrowseExpression <em>Browse Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ChangeContextImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeContextImpl extends OperationImpl implements ChangeContext
{
  /**
   * The default value of the '{@link #getBrowseExpression() <em>Browse Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrowseExpression()
   * @generated
   * @ordered
   */
  protected static final String BROWSE_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBrowseExpression() <em>Browse Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrowseExpression()
   * @generated
   * @ordered
   */
  protected String browseExpression = BROWSE_EXPRESSION_EDEFAULT;

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
  protected ChangeContextImpl()
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
    return SiriusTextDslPackage.Literals.CHANGE_CONTEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBrowseExpression()
  {
    return browseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBrowseExpression(String newBrowseExpression)
  {
    String oldBrowseExpression = browseExpression;
    browseExpression = newBrowseExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CHANGE_CONTEXT__BROWSE_EXPRESSION, oldBrowseExpression, browseExpression));
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
      body = new EObjectContainmentEList<Operation>(Operation.class, this, SiriusTextDslPackage.CHANGE_CONTEXT__BODY);
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
      case SiriusTextDslPackage.CHANGE_CONTEXT__BODY:
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
      case SiriusTextDslPackage.CHANGE_CONTEXT__BROWSE_EXPRESSION:
        return getBrowseExpression();
      case SiriusTextDslPackage.CHANGE_CONTEXT__BODY:
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
      case SiriusTextDslPackage.CHANGE_CONTEXT__BROWSE_EXPRESSION:
        setBrowseExpression((String)newValue);
        return;
      case SiriusTextDslPackage.CHANGE_CONTEXT__BODY:
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
      case SiriusTextDslPackage.CHANGE_CONTEXT__BROWSE_EXPRESSION:
        setBrowseExpression(BROWSE_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.CHANGE_CONTEXT__BODY:
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
      case SiriusTextDslPackage.CHANGE_CONTEXT__BROWSE_EXPRESSION:
        return BROWSE_EXPRESSION_EDEFAULT == null ? browseExpression != null : !BROWSE_EXPRESSION_EDEFAULT.equals(browseExpression);
      case SiriusTextDslPackage.CHANGE_CONTEXT__BODY:
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
    result.append(" (browseExpression: ");
    result.append(browseExpression);
    result.append(')');
    return result.toString();
  }

} //ChangeContextImpl
