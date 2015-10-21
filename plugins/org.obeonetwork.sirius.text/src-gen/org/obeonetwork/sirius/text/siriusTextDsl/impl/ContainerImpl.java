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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration;
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl#isList <em>List</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl#getSemanticCanditatesExpression <em>Semantic Canditates Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MappingImpl implements org.obeonetwork.sirius.text.siriusTextDsl.Container
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
   * The default value of the '{@link #isList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isList()
   * @generated
   * @ordered
   */
  protected static final boolean LIST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isList()
   * @generated
   * @ordered
   */
  protected boolean list = LIST_EDEFAULT;

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
   * The default value of the '{@link #getDomainClass() <em>Domain Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainClass()
   * @generated
   * @ordered
   */
  protected static final String DOMAIN_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDomainClass() <em>Domain Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainClass()
   * @generated
   * @ordered
   */
  protected String domainClass = DOMAIN_CLASS_EDEFAULT;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected EList<ContainerStyle> style;

  /**
   * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecondition()
   * @generated
   * @ordered
   */
  protected static final String PRECONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecondition()
   * @generated
   * @ordered
   */
  protected String precondition = PRECONDITION_EDEFAULT;

  /**
   * The default value of the '{@link #getSemanticCanditatesExpression() <em>Semantic Canditates Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemanticCanditatesExpression()
   * @generated
   * @ordered
   */
  protected static final String SEMANTIC_CANDITATES_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSemanticCanditatesExpression() <em>Semantic Canditates Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemanticCanditatesExpression()
   * @generated
   * @ordered
   */
  protected String semanticCanditatesExpression = SEMANTIC_CANDITATES_EXPRESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionalStyles()
   * @generated
   * @ordered
   */
  protected EList<ConditionalContainerStyleDeclaration> conditionalStyles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerImpl()
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
    return SiriusTextDslPackage.Literals.CONTAINER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(boolean newList)
  {
    boolean oldList = list;
    list = newList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER__LIST, oldList, list));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDomainClass()
  {
    return domainClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomainClass(String newDomainClass)
  {
    String oldDomainClass = domainClass;
    domainClass = newDomainClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER__DOMAIN_CLASS, oldDomainClass, domainClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContainerStyle> getStyle()
  {
    if (style == null)
    {
      style = new EObjectResolvingEList<ContainerStyle>(ContainerStyle.class, this, SiriusTextDslPackage.CONTAINER__STYLE);
    }
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrecondition()
  {
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecondition(String newPrecondition)
  {
    String oldPrecondition = precondition;
    precondition = newPrecondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER__PRECONDITION, oldPrecondition, precondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSemanticCanditatesExpression()
  {
    return semanticCanditatesExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSemanticCanditatesExpression(String newSemanticCanditatesExpression)
  {
    String oldSemanticCanditatesExpression = semanticCanditatesExpression;
    semanticCanditatesExpression = newSemanticCanditatesExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER__SEMANTIC_CANDITATES_EXPRESSION, oldSemanticCanditatesExpression, semanticCanditatesExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConditionalContainerStyleDeclaration> getConditionalStyles()
  {
    if (conditionalStyles == null)
    {
      conditionalStyles = new EObjectContainmentEList<ConditionalContainerStyleDeclaration>(ConditionalContainerStyleDeclaration.class, this, SiriusTextDslPackage.CONTAINER__CONDITIONAL_STYLES);
    }
    return conditionalStyles;
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
      case SiriusTextDslPackage.CONTAINER__CONDITIONAL_STYLES:
        return ((InternalEList<?>)getConditionalStyles()).basicRemove(otherEnd, msgs);
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
      case SiriusTextDslPackage.CONTAINER__DOCUMENTATION:
        return getDocumentation();
      case SiriusTextDslPackage.CONTAINER__LIST:
        return isList();
      case SiriusTextDslPackage.CONTAINER__NAME:
        return getName();
      case SiriusTextDslPackage.CONTAINER__LABEL:
        return getLabel();
      case SiriusTextDslPackage.CONTAINER__DOMAIN_CLASS:
        return getDomainClass();
      case SiriusTextDslPackage.CONTAINER__STYLE:
        return getStyle();
      case SiriusTextDslPackage.CONTAINER__PRECONDITION:
        return getPrecondition();
      case SiriusTextDslPackage.CONTAINER__SEMANTIC_CANDITATES_EXPRESSION:
        return getSemanticCanditatesExpression();
      case SiriusTextDslPackage.CONTAINER__CONDITIONAL_STYLES:
        return getConditionalStyles();
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
      case SiriusTextDslPackage.CONTAINER__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER__LIST:
        setList((Boolean)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER__NAME:
        setName((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER__LABEL:
        setLabel((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER__DOMAIN_CLASS:
        setDomainClass((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER__STYLE:
        getStyle().clear();
        getStyle().addAll((Collection<? extends ContainerStyle>)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER__PRECONDITION:
        setPrecondition((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER__SEMANTIC_CANDITATES_EXPRESSION:
        setSemanticCanditatesExpression((String)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER__CONDITIONAL_STYLES:
        getConditionalStyles().clear();
        getConditionalStyles().addAll((Collection<? extends ConditionalContainerStyleDeclaration>)newValue);
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
      case SiriusTextDslPackage.CONTAINER__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER__LIST:
        setList(LIST_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER__DOMAIN_CLASS:
        setDomainClass(DOMAIN_CLASS_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER__STYLE:
        getStyle().clear();
        return;
      case SiriusTextDslPackage.CONTAINER__PRECONDITION:
        setPrecondition(PRECONDITION_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER__SEMANTIC_CANDITATES_EXPRESSION:
        setSemanticCanditatesExpression(SEMANTIC_CANDITATES_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER__CONDITIONAL_STYLES:
        getConditionalStyles().clear();
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
      case SiriusTextDslPackage.CONTAINER__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SiriusTextDslPackage.CONTAINER__LIST:
        return list != LIST_EDEFAULT;
      case SiriusTextDslPackage.CONTAINER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SiriusTextDslPackage.CONTAINER__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case SiriusTextDslPackage.CONTAINER__DOMAIN_CLASS:
        return DOMAIN_CLASS_EDEFAULT == null ? domainClass != null : !DOMAIN_CLASS_EDEFAULT.equals(domainClass);
      case SiriusTextDslPackage.CONTAINER__STYLE:
        return style != null && !style.isEmpty();
      case SiriusTextDslPackage.CONTAINER__PRECONDITION:
        return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
      case SiriusTextDslPackage.CONTAINER__SEMANTIC_CANDITATES_EXPRESSION:
        return SEMANTIC_CANDITATES_EXPRESSION_EDEFAULT == null ? semanticCanditatesExpression != null : !SEMANTIC_CANDITATES_EXPRESSION_EDEFAULT.equals(semanticCanditatesExpression);
      case SiriusTextDslPackage.CONTAINER__CONDITIONAL_STYLES:
        return conditionalStyles != null && !conditionalStyles.isEmpty();
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
    result.append(", list: ");
    result.append(list);
    result.append(", name: ");
    result.append(name);
    result.append(", label: ");
    result.append(label);
    result.append(", domainClass: ");
    result.append(domainClass);
    result.append(", precondition: ");
    result.append(precondition);
    result.append(", semanticCanditatesExpression: ");
    result.append(semanticCanditatesExpression);
    result.append(')');
    return result.toString();
  }

} //ContainerImpl
