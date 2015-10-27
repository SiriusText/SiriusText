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

import org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView;
import org.obeonetwork.sirius.text.siriusTextDsl.Edge;
import org.obeonetwork.sirius.text.siriusTextDsl.Operation;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Edge View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateEdgeViewImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateEdgeViewImpl#getSourceExpression <em>Source Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateEdgeViewImpl#getTargetExpression <em>Target Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateEdgeViewImpl#getContainerViewExpression <em>Container View Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateEdgeViewImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateEdgeViewImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateEdgeViewImpl extends OperationImpl implements CreateEdgeView
{
  /**
   * The cached value of the '{@link #getEdge() <em>Edge</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdge()
   * @generated
   * @ordered
   */
  protected Edge edge;

  /**
   * The default value of the '{@link #getSourceExpression() <em>Source Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceExpression()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceExpression() <em>Source Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceExpression()
   * @generated
   * @ordered
   */
  protected String sourceExpression = SOURCE_EXPRESSION_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetExpression() <em>Target Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetExpression()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetExpression() <em>Target Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetExpression()
   * @generated
   * @ordered
   */
  protected String targetExpression = TARGET_EXPRESSION_EDEFAULT;

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
  protected CreateEdgeViewImpl()
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
    return SiriusTextDslPackage.Literals.CREATE_EDGE_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Edge getEdge()
  {
    if (edge != null && edge.eIsProxy())
    {
      InternalEObject oldEdge = (InternalEObject)edge;
      edge = (Edge)eResolveProxy(oldEdge);
      if (edge != oldEdge)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.CREATE_EDGE_VIEW__EDGE, oldEdge, edge));
      }
    }
    return edge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Edge basicGetEdge()
  {
    return edge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEdge(Edge newEdge)
  {
    Edge oldEdge = edge;
    edge = newEdge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CREATE_EDGE_VIEW__EDGE, oldEdge, edge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourceExpression()
  {
    return sourceExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceExpression(String newSourceExpression)
  {
    String oldSourceExpression = sourceExpression;
    sourceExpression = newSourceExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CREATE_EDGE_VIEW__SOURCE_EXPRESSION, oldSourceExpression, sourceExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetExpression()
  {
    return targetExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetExpression(String newTargetExpression)
  {
    String oldTargetExpression = targetExpression;
    targetExpression = newTargetExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CREATE_EDGE_VIEW__TARGET_EXPRESSION, oldTargetExpression, targetExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CREATE_EDGE_VIEW__CONTAINER_VIEW_EXPRESSION, oldContainerViewExpression, containerViewExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CREATE_EDGE_VIEW__VARIABLE_NAME, oldVariableName, variableName));
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
      body = new EObjectContainmentEList<Operation>(Operation.class, this, SiriusTextDslPackage.CREATE_EDGE_VIEW__BODY);
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
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__BODY:
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
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__EDGE:
        if (resolve) return getEdge();
        return basicGetEdge();
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__SOURCE_EXPRESSION:
        return getSourceExpression();
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__TARGET_EXPRESSION:
        return getTargetExpression();
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__CONTAINER_VIEW_EXPRESSION:
        return getContainerViewExpression();
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__VARIABLE_NAME:
        return getVariableName();
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__BODY:
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
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__EDGE:
        setEdge((Edge)newValue);
        return;
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__SOURCE_EXPRESSION:
        setSourceExpression((String)newValue);
        return;
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__TARGET_EXPRESSION:
        setTargetExpression((String)newValue);
        return;
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__CONTAINER_VIEW_EXPRESSION:
        setContainerViewExpression((String)newValue);
        return;
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__VARIABLE_NAME:
        setVariableName((String)newValue);
        return;
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__BODY:
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
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__EDGE:
        setEdge((Edge)null);
        return;
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__SOURCE_EXPRESSION:
        setSourceExpression(SOURCE_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__TARGET_EXPRESSION:
        setTargetExpression(TARGET_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__CONTAINER_VIEW_EXPRESSION:
        setContainerViewExpression(CONTAINER_VIEW_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__VARIABLE_NAME:
        setVariableName(VARIABLE_NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__BODY:
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
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__EDGE:
        return edge != null;
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__SOURCE_EXPRESSION:
        return SOURCE_EXPRESSION_EDEFAULT == null ? sourceExpression != null : !SOURCE_EXPRESSION_EDEFAULT.equals(sourceExpression);
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__TARGET_EXPRESSION:
        return TARGET_EXPRESSION_EDEFAULT == null ? targetExpression != null : !TARGET_EXPRESSION_EDEFAULT.equals(targetExpression);
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__CONTAINER_VIEW_EXPRESSION:
        return CONTAINER_VIEW_EXPRESSION_EDEFAULT == null ? containerViewExpression != null : !CONTAINER_VIEW_EXPRESSION_EDEFAULT.equals(containerViewExpression);
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__VARIABLE_NAME:
        return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
      case SiriusTextDslPackage.CREATE_EDGE_VIEW__BODY:
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
    result.append(" (sourceExpression: ");
    result.append(sourceExpression);
    result.append(", targetExpression: ");
    result.append(targetExpression);
    result.append(", containerViewExpression: ");
    result.append(containerViewExpression);
    result.append(", variableName: ");
    result.append(variableName);
    result.append(')');
    return result.toString();
  }

} //CreateEdgeViewImpl
