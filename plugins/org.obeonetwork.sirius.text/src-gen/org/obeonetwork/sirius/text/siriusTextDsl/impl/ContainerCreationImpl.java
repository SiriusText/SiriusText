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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation;
import org.obeonetwork.sirius.text.siriusTextDsl.Mapping;
import org.obeonetwork.sirius.text.siriusTextDsl.Operation;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Creation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl#isForceRefresh <em>Force Refresh</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl#getIconPath <em>Icon Path</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl#getNodeCreationVariable <em>Node Creation Variable</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl#getContainerViewVariable <em>Container View Variable</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl#getPreconditionExpression <em>Precondition Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl#getContainerMappings <em>Container Mappings</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl#getExtraMappings <em>Extra Mappings</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerCreationImpl extends ToolImpl implements ContainerCreation
{
  /**
   * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected String documentation = DOCUMENTATION_EDEFAULT;

  /**
   * The default value of the '{@link #isForceRefresh() <em>Force Refresh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForceRefresh()
   * @generated
   * @ordered
   */
  protected static final boolean FORCE_REFRESH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isForceRefresh() <em>Force Refresh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForceRefresh()
   * @generated
   * @ordered
   */
  protected boolean forceRefresh = FORCE_REFRESH_EDEFAULT;

  /**
   * The default value of the '{@link #getIconPath() <em>Icon Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIconPath()
   * @generated
   * @ordered
   */
  protected static final String ICON_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIconPath() <em>Icon Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIconPath()
   * @generated
   * @ordered
   */
  protected String iconPath = ICON_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getNodeCreationVariable() <em>Node Creation Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeCreationVariable()
   * @generated
   * @ordered
   */
  protected static final String NODE_CREATION_VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNodeCreationVariable() <em>Node Creation Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeCreationVariable()
   * @generated
   * @ordered
   */
  protected String nodeCreationVariable = NODE_CREATION_VARIABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getContainerViewVariable() <em>Container View Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerViewVariable()
   * @generated
   * @ordered
   */
  protected static final String CONTAINER_VIEW_VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContainerViewVariable() <em>Container View Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerViewVariable()
   * @generated
   * @ordered
   */
  protected String containerViewVariable = CONTAINER_VIEW_VARIABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getPreconditionExpression() <em>Precondition Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreconditionExpression()
   * @generated
   * @ordered
   */
  protected static final String PRECONDITION_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPreconditionExpression() <em>Precondition Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreconditionExpression()
   * @generated
   * @ordered
   */
  protected String preconditionExpression = PRECONDITION_EXPRESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getContainerMappings() <em>Container Mappings</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerMappings()
   * @generated
   * @ordered
   */
  protected EList<Mapping> containerMappings;

  /**
   * The cached value of the '{@link #getExtraMappings() <em>Extra Mappings</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtraMappings()
   * @generated
   * @ordered
   */
  protected EList<Mapping> extraMappings;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Operation body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerCreationImpl()
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
    return SiriusTextDslPackage.Literals.CONTAINER_CREATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocumentation()
  {
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocumentation(String newDocumentation)
  {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER_CREATION__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isForceRefresh()
  {
    return forceRefresh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForceRefresh(boolean newForceRefresh)
  {
    boolean oldForceRefresh = forceRefresh;
    forceRefresh = newForceRefresh;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER_CREATION__FORCE_REFRESH, oldForceRefresh, forceRefresh));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIconPath()
  {
    return iconPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIconPath(String newIconPath)
  {
    String oldIconPath = iconPath;
    iconPath = newIconPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER_CREATION__ICON_PATH, oldIconPath, iconPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNodeCreationVariable()
  {
    return nodeCreationVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeCreationVariable(String newNodeCreationVariable)
  {
    String oldNodeCreationVariable = nodeCreationVariable;
    nodeCreationVariable = newNodeCreationVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER_CREATION__NODE_CREATION_VARIABLE, oldNodeCreationVariable, nodeCreationVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContainerViewVariable()
  {
    return containerViewVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainerViewVariable(String newContainerViewVariable)
  {
    String oldContainerViewVariable = containerViewVariable;
    containerViewVariable = newContainerViewVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER_CREATION__CONTAINER_VIEW_VARIABLE, oldContainerViewVariable, containerViewVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER_CREATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER_CREATION__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPreconditionExpression()
  {
    return preconditionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreconditionExpression(String newPreconditionExpression)
  {
    String oldPreconditionExpression = preconditionExpression;
    preconditionExpression = newPreconditionExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER_CREATION__PRECONDITION_EXPRESSION, oldPreconditionExpression, preconditionExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mapping> getContainerMappings()
  {
    if (containerMappings == null)
    {
      containerMappings = new EObjectResolvingEList<Mapping>(Mapping.class, this, SiriusTextDslPackage.CONTAINER_CREATION__CONTAINER_MAPPINGS);
    }
    return containerMappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mapping> getExtraMappings()
  {
    if (extraMappings == null)
    {
      extraMappings = new EObjectResolvingEList<Mapping>(Mapping.class, this, SiriusTextDslPackage.CONTAINER_CREATION__EXTRA_MAPPINGS);
    }
    return extraMappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Operation newBody, NotificationChain msgs)
  {
    Operation oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER_CREATION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Operation newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiriusTextDslPackage.CONTAINER_CREATION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiriusTextDslPackage.CONTAINER_CREATION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER_CREATION__BODY, newBody, newBody));
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
      case SiriusTextDslPackage.CONTAINER_CREATION__BODY:
        return basicSetBody(null, msgs);
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
      case SiriusTextDslPackage.CONTAINER_CREATION__DOCUMENTATION:
        return getDocumentation();
      case SiriusTextDslPackage.CONTAINER_CREATION__FORCE_REFRESH:
        return isForceRefresh();
      case SiriusTextDslPackage.CONTAINER_CREATION__ICON_PATH:
        return getIconPath();
      case SiriusTextDslPackage.CONTAINER_CREATION__NODE_CREATION_VARIABLE:
        return getNodeCreationVariable();
      case SiriusTextDslPackage.CONTAINER_CREATION__CONTAINER_VIEW_VARIABLE:
        return getContainerViewVariable();
      case SiriusTextDslPackage.CONTAINER_CREATION__NAME:
        return getName();
      case SiriusTextDslPackage.CONTAINER_CREATION__LABEL:
        return getLabel();
      case SiriusTextDslPackage.CONTAINER_CREATION__PRECONDITION_EXPRESSION:
        return getPreconditionExpression();
      case SiriusTextDslPackage.CONTAINER_CREATION__CONTAINER_MAPPINGS:
        return getContainerMappings();
      case SiriusTextDslPackage.CONTAINER_CREATION__EXTRA_MAPPINGS:
        return getExtraMappings();
      case SiriusTextDslPackage.CONTAINER_CREATION__BODY:
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
      case SiriusTextDslPackage.CONTAINER_CREATION__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__FORCE_REFRESH:
        setForceRefresh((Boolean)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__ICON_PATH:
        setIconPath((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__NODE_CREATION_VARIABLE:
        setNodeCreationVariable((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__CONTAINER_VIEW_VARIABLE:
        setContainerViewVariable((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__NAME:
        setName((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__LABEL:
        setLabel((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__PRECONDITION_EXPRESSION:
        setPreconditionExpression((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__CONTAINER_MAPPINGS:
        getContainerMappings().clear();
        getContainerMappings().addAll((Collection<? extends Mapping>)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__EXTRA_MAPPINGS:
        getExtraMappings().clear();
        getExtraMappings().addAll((Collection<? extends Mapping>)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__BODY:
        setBody((Operation)newValue);
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
      case SiriusTextDslPackage.CONTAINER_CREATION__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__FORCE_REFRESH:
        setForceRefresh(FORCE_REFRESH_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__ICON_PATH:
        setIconPath(ICON_PATH_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__NODE_CREATION_VARIABLE:
        setNodeCreationVariable(NODE_CREATION_VARIABLE_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__CONTAINER_VIEW_VARIABLE:
        setContainerViewVariable(CONTAINER_VIEW_VARIABLE_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__PRECONDITION_EXPRESSION:
        setPreconditionExpression(PRECONDITION_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__CONTAINER_MAPPINGS:
        getContainerMappings().clear();
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__EXTRA_MAPPINGS:
        getExtraMappings().clear();
        return;
      case SiriusTextDslPackage.CONTAINER_CREATION__BODY:
        setBody((Operation)null);
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
      case SiriusTextDslPackage.CONTAINER_CREATION__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SiriusTextDslPackage.CONTAINER_CREATION__FORCE_REFRESH:
        return forceRefresh != FORCE_REFRESH_EDEFAULT;
      case SiriusTextDslPackage.CONTAINER_CREATION__ICON_PATH:
        return ICON_PATH_EDEFAULT == null ? iconPath != null : !ICON_PATH_EDEFAULT.equals(iconPath);
      case SiriusTextDslPackage.CONTAINER_CREATION__NODE_CREATION_VARIABLE:
        return NODE_CREATION_VARIABLE_EDEFAULT == null ? nodeCreationVariable != null : !NODE_CREATION_VARIABLE_EDEFAULT.equals(nodeCreationVariable);
      case SiriusTextDslPackage.CONTAINER_CREATION__CONTAINER_VIEW_VARIABLE:
        return CONTAINER_VIEW_VARIABLE_EDEFAULT == null ? containerViewVariable != null : !CONTAINER_VIEW_VARIABLE_EDEFAULT.equals(containerViewVariable);
      case SiriusTextDslPackage.CONTAINER_CREATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SiriusTextDslPackage.CONTAINER_CREATION__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case SiriusTextDslPackage.CONTAINER_CREATION__PRECONDITION_EXPRESSION:
        return PRECONDITION_EXPRESSION_EDEFAULT == null ? preconditionExpression != null : !PRECONDITION_EXPRESSION_EDEFAULT.equals(preconditionExpression);
      case SiriusTextDslPackage.CONTAINER_CREATION__CONTAINER_MAPPINGS:
        return containerMappings != null && !containerMappings.isEmpty();
      case SiriusTextDslPackage.CONTAINER_CREATION__EXTRA_MAPPINGS:
        return extraMappings != null && !extraMappings.isEmpty();
      case SiriusTextDslPackage.CONTAINER_CREATION__BODY:
        return body != null;
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
    result.append(" (documentation: ");
    result.append(documentation);
    result.append(", forceRefresh: ");
    result.append(forceRefresh);
    result.append(", iconPath: ");
    result.append(iconPath);
    result.append(", nodeCreationVariable: ");
    result.append(nodeCreationVariable);
    result.append(", containerViewVariable: ");
    result.append(containerViewVariable);
    result.append(", name: ");
    result.append(name);
    result.append(", label: ");
    result.append(label);
    result.append(", preconditionExpression: ");
    result.append(preconditionExpression);
    result.append(')');
    return result.toString();
  }

} //ContainerCreationImpl
