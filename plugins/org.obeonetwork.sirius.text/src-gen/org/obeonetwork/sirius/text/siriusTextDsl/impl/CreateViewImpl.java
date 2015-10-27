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

import org.obeonetwork.sirius.text.siriusTextDsl.CreateView;
import org.obeonetwork.sirius.text.siriusTextDsl.Mapping;
import org.obeonetwork.sirius.text.siriusTextDsl.Operation;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateViewImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateViewImpl#getContainerViewExpression <em>Container View Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateViewImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateViewImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateViewImpl extends OperationImpl implements CreateView
{
  /**
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected Mapping mapping;

  /**
   * The default value of the '{@link #getContainerViewExpression() <em>Container View Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerViewExpression()
   * @generated
   * @ordered
   */
  protected static final String CONTAINER_VIEW_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContainerViewExpression() <em>Container View Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerViewExpression()
   * @generated
   * @ordered
   */
  protected String containerViewExpression = CONTAINER_VIEW_EXPRESSION_EDEFAULT;

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
  protected CreateViewImpl()
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
    return SiriusTextDslPackage.Literals.CREATE_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping getMapping()
  {
    if (mapping != null && mapping.eIsProxy())
    {
      InternalEObject oldMapping = (InternalEObject)mapping;
      mapping = (Mapping)eResolveProxy(oldMapping);
      if (mapping != oldMapping)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.CREATE_VIEW__MAPPING, oldMapping, mapping));
      }
    }
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping basicGetMapping()
  {
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapping(Mapping newMapping)
  {
    Mapping oldMapping = mapping;
    mapping = newMapping;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CREATE_VIEW__MAPPING, oldMapping, mapping));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContainerViewExpression()
  {
    return containerViewExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainerViewExpression(String newContainerViewExpression)
  {
    String oldContainerViewExpression = containerViewExpression;
    containerViewExpression = newContainerViewExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CREATE_VIEW__CONTAINER_VIEW_EXPRESSION, oldContainerViewExpression, containerViewExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CREATE_VIEW__VARIABLE_NAME, oldVariableName, variableName));
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
      body = new EObjectContainmentEList<Operation>(Operation.class, this, SiriusTextDslPackage.CREATE_VIEW__BODY);
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
      case SiriusTextDslPackage.CREATE_VIEW__BODY:
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
      case SiriusTextDslPackage.CREATE_VIEW__MAPPING:
        if (resolve) return getMapping();
        return basicGetMapping();
      case SiriusTextDslPackage.CREATE_VIEW__CONTAINER_VIEW_EXPRESSION:
        return getContainerViewExpression();
      case SiriusTextDslPackage.CREATE_VIEW__VARIABLE_NAME:
        return getVariableName();
      case SiriusTextDslPackage.CREATE_VIEW__BODY:
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
      case SiriusTextDslPackage.CREATE_VIEW__MAPPING:
        setMapping((Mapping)newValue);
        return;
      case SiriusTextDslPackage.CREATE_VIEW__CONTAINER_VIEW_EXPRESSION:
        setContainerViewExpression((String)newValue);
        return;
      case SiriusTextDslPackage.CREATE_VIEW__VARIABLE_NAME:
        setVariableName((String)newValue);
        return;
      case SiriusTextDslPackage.CREATE_VIEW__BODY:
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
      case SiriusTextDslPackage.CREATE_VIEW__MAPPING:
        setMapping((Mapping)null);
        return;
      case SiriusTextDslPackage.CREATE_VIEW__CONTAINER_VIEW_EXPRESSION:
        setContainerViewExpression(CONTAINER_VIEW_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.CREATE_VIEW__VARIABLE_NAME:
        setVariableName(VARIABLE_NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.CREATE_VIEW__BODY:
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
      case SiriusTextDslPackage.CREATE_VIEW__MAPPING:
        return mapping != null;
      case SiriusTextDslPackage.CREATE_VIEW__CONTAINER_VIEW_EXPRESSION:
        return CONTAINER_VIEW_EXPRESSION_EDEFAULT == null ? containerViewExpression != null : !CONTAINER_VIEW_EXPRESSION_EDEFAULT.equals(containerViewExpression);
      case SiriusTextDslPackage.CREATE_VIEW__VARIABLE_NAME:
        return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
      case SiriusTextDslPackage.CREATE_VIEW__BODY:
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
    result.append(" (containerViewExpression: ");
    result.append(containerViewExpression);
    result.append(", variableName: ");
    result.append(variableName);
    result.append(')');
    return result.toString();
  }

} //CreateViewImpl
