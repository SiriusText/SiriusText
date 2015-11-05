/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.sirius.text.siriusTextDsl.Mapping;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl#getPreconditionExpression <em>Precondition Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl#getSemanticCandidatesExpression <em>Semantic Candidates Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl#getAssociatedElementsExpression <em>Associated Elements Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends SiriusFileBodyImpl implements Mapping
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
   * The default value of the '{@link #getSemanticCandidatesExpression() <em>Semantic Candidates Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemanticCandidatesExpression()
   * @generated
   * @ordered
   */
  protected static final String SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSemanticCandidatesExpression() <em>Semantic Candidates Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemanticCandidatesExpression()
   * @generated
   * @ordered
   */
  protected String semanticCandidatesExpression = SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT;

  /**
   * The default value of the '{@link #getAssociatedElementsExpression() <em>Associated Elements Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssociatedElementsExpression()
   * @generated
   * @ordered
   */
  protected static final String ASSOCIATED_ELEMENTS_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssociatedElementsExpression() <em>Associated Elements Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssociatedElementsExpression()
   * @generated
   * @ordered
   */
  protected String associatedElementsExpression = ASSOCIATED_ELEMENTS_EXPRESSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingImpl()
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
    return SiriusTextDslPackage.Literals.MAPPING;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.MAPPING__DOCUMENTATION, oldDocumentation, documentation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.MAPPING__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.MAPPING__LABEL, oldLabel, label));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.MAPPING__DOMAIN_CLASS, oldDomainClass, domainClass));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.MAPPING__PRECONDITION_EXPRESSION, oldPreconditionExpression, preconditionExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSemanticCandidatesExpression()
  {
    return semanticCandidatesExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSemanticCandidatesExpression(String newSemanticCandidatesExpression)
  {
    String oldSemanticCandidatesExpression = semanticCandidatesExpression;
    semanticCandidatesExpression = newSemanticCandidatesExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.MAPPING__SEMANTIC_CANDIDATES_EXPRESSION, oldSemanticCandidatesExpression, semanticCandidatesExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAssociatedElementsExpression()
  {
    return associatedElementsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssociatedElementsExpression(String newAssociatedElementsExpression)
  {
    String oldAssociatedElementsExpression = associatedElementsExpression;
    associatedElementsExpression = newAssociatedElementsExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.MAPPING__ASSOCIATED_ELEMENTS_EXPRESSION, oldAssociatedElementsExpression, associatedElementsExpression));
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
      case SiriusTextDslPackage.MAPPING__DOCUMENTATION:
        return getDocumentation();
      case SiriusTextDslPackage.MAPPING__NAME:
        return getName();
      case SiriusTextDslPackage.MAPPING__LABEL:
        return getLabel();
      case SiriusTextDslPackage.MAPPING__DOMAIN_CLASS:
        return getDomainClass();
      case SiriusTextDslPackage.MAPPING__PRECONDITION_EXPRESSION:
        return getPreconditionExpression();
      case SiriusTextDslPackage.MAPPING__SEMANTIC_CANDIDATES_EXPRESSION:
        return getSemanticCandidatesExpression();
      case SiriusTextDslPackage.MAPPING__ASSOCIATED_ELEMENTS_EXPRESSION:
        return getAssociatedElementsExpression();
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
      case SiriusTextDslPackage.MAPPING__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SiriusTextDslPackage.MAPPING__NAME:
        setName((String)newValue);
        return;
      case SiriusTextDslPackage.MAPPING__LABEL:
        setLabel((String)newValue);
        return;
      case SiriusTextDslPackage.MAPPING__DOMAIN_CLASS:
        setDomainClass((String)newValue);
        return;
      case SiriusTextDslPackage.MAPPING__PRECONDITION_EXPRESSION:
        setPreconditionExpression((String)newValue);
        return;
      case SiriusTextDslPackage.MAPPING__SEMANTIC_CANDIDATES_EXPRESSION:
        setSemanticCandidatesExpression((String)newValue);
        return;
      case SiriusTextDslPackage.MAPPING__ASSOCIATED_ELEMENTS_EXPRESSION:
        setAssociatedElementsExpression((String)newValue);
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
      case SiriusTextDslPackage.MAPPING__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SiriusTextDslPackage.MAPPING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.MAPPING__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case SiriusTextDslPackage.MAPPING__DOMAIN_CLASS:
        setDomainClass(DOMAIN_CLASS_EDEFAULT);
        return;
      case SiriusTextDslPackage.MAPPING__PRECONDITION_EXPRESSION:
        setPreconditionExpression(PRECONDITION_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.MAPPING__SEMANTIC_CANDIDATES_EXPRESSION:
        setSemanticCandidatesExpression(SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.MAPPING__ASSOCIATED_ELEMENTS_EXPRESSION:
        setAssociatedElementsExpression(ASSOCIATED_ELEMENTS_EXPRESSION_EDEFAULT);
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
      case SiriusTextDslPackage.MAPPING__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SiriusTextDslPackage.MAPPING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SiriusTextDslPackage.MAPPING__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case SiriusTextDslPackage.MAPPING__DOMAIN_CLASS:
        return DOMAIN_CLASS_EDEFAULT == null ? domainClass != null : !DOMAIN_CLASS_EDEFAULT.equals(domainClass);
      case SiriusTextDslPackage.MAPPING__PRECONDITION_EXPRESSION:
        return PRECONDITION_EXPRESSION_EDEFAULT == null ? preconditionExpression != null : !PRECONDITION_EXPRESSION_EDEFAULT.equals(preconditionExpression);
      case SiriusTextDslPackage.MAPPING__SEMANTIC_CANDIDATES_EXPRESSION:
        return SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT == null ? semanticCandidatesExpression != null : !SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT.equals(semanticCandidatesExpression);
      case SiriusTextDslPackage.MAPPING__ASSOCIATED_ELEMENTS_EXPRESSION:
        return ASSOCIATED_ELEMENTS_EXPRESSION_EDEFAULT == null ? associatedElementsExpression != null : !ASSOCIATED_ELEMENTS_EXPRESSION_EDEFAULT.equals(associatedElementsExpression);
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
    result.append(", name: ");
    result.append(name);
    result.append(", label: ");
    result.append(label);
    result.append(", domainClass: ");
    result.append(domainClass);
    result.append(", preconditionExpression: ");
    result.append(preconditionExpression);
    result.append(", semanticCandidatesExpression: ");
    result.append(semanticCandidatesExpression);
    result.append(", associatedElementsExpression: ");
    result.append(associatedElementsExpression);
    result.append(')');
    return result.toString();
  }

} //MappingImpl
