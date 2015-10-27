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

import org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance;
import org.obeonetwork.sirius.text.siriusTextDsl.Operation;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateInstanceImpl#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateInstanceImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateInstanceImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateInstanceImpl extends OperationImpl implements CreateInstance
{
  /**
   * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceName()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceName()
   * @generated
   * @ordered
   */
  protected String referenceName = REFERENCE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableName()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableName()
   * @generated
   * @ordered
   */
  protected String variableName = VARIABLE_NAME_EDEFAULT;

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
  protected CreateInstanceImpl()
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
    return SiriusTextDslPackage.Literals.CREATE_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReferenceName()
  {
    return referenceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceName(String newReferenceName)
  {
    String oldReferenceName = referenceName;
    referenceName = newReferenceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CREATE_INSTANCE__REFERENCE_NAME, oldReferenceName, referenceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CREATE_INSTANCE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariableName()
  {
    return variableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableName(String newVariableName)
  {
    String oldVariableName = variableName;
    variableName = newVariableName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CREATE_INSTANCE__VARIABLE_NAME, oldVariableName, variableName));
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
      body = new EObjectContainmentEList<Operation>(Operation.class, this, SiriusTextDslPackage.CREATE_INSTANCE__BODY);
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
      case SiriusTextDslPackage.CREATE_INSTANCE__BODY:
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
      case SiriusTextDslPackage.CREATE_INSTANCE__REFERENCE_NAME:
        return getReferenceName();
      case SiriusTextDslPackage.CREATE_INSTANCE__TYPE:
        return getType();
      case SiriusTextDslPackage.CREATE_INSTANCE__VARIABLE_NAME:
        return getVariableName();
      case SiriusTextDslPackage.CREATE_INSTANCE__BODY:
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
      case SiriusTextDslPackage.CREATE_INSTANCE__REFERENCE_NAME:
        setReferenceName((String)newValue);
        return;
      case SiriusTextDslPackage.CREATE_INSTANCE__TYPE:
        setType((String)newValue);
        return;
      case SiriusTextDslPackage.CREATE_INSTANCE__VARIABLE_NAME:
        setVariableName((String)newValue);
        return;
      case SiriusTextDslPackage.CREATE_INSTANCE__BODY:
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
      case SiriusTextDslPackage.CREATE_INSTANCE__REFERENCE_NAME:
        setReferenceName(REFERENCE_NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.CREATE_INSTANCE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case SiriusTextDslPackage.CREATE_INSTANCE__VARIABLE_NAME:
        setVariableName(VARIABLE_NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.CREATE_INSTANCE__BODY:
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
      case SiriusTextDslPackage.CREATE_INSTANCE__REFERENCE_NAME:
        return REFERENCE_NAME_EDEFAULT == null ? referenceName != null : !REFERENCE_NAME_EDEFAULT.equals(referenceName);
      case SiriusTextDslPackage.CREATE_INSTANCE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case SiriusTextDslPackage.CREATE_INSTANCE__VARIABLE_NAME:
        return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
      case SiriusTextDslPackage.CREATE_INSTANCE__BODY:
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
    result.append(" (referenceName: ");
    result.append(referenceName);
    result.append(", type: ");
    result.append(type);
    result.append(", variableName: ");
    result.append(variableName);
    result.append(')');
    return result.toString();
  }

} //CreateInstanceImpl
