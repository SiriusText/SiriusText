/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.Mapping;
import org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Based Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RelationBasedEdgeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RelationBasedEdgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RelationBasedEdgeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RelationBasedEdgeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RelationBasedEdgeImpl#getPreconditionExpression <em>Precondition Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RelationBasedEdgeImpl#getSourceMappings <em>Source Mappings</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RelationBasedEdgeImpl#getTargetMappings <em>Target Mappings</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RelationBasedEdgeImpl#getTargetFinderExpression <em>Target Finder Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationBasedEdgeImpl extends EdgeImpl implements RelationBasedEdge
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
   * The cached value of the '{@link #getStyle() <em>Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected EdgeStyle style;

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
   * The cached value of the '{@link #getSourceMappings() <em>Source Mappings</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceMappings()
   * @generated
   * @ordered
   */
  protected EList<Mapping> sourceMappings;

  /**
   * The cached value of the '{@link #getTargetMappings() <em>Target Mappings</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetMappings()
   * @generated
   * @ordered
   */
  protected EList<Mapping> targetMappings;

  /**
   * The default value of the '{@link #getTargetFinderExpression() <em>Target Finder Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetFinderExpression()
   * @generated
   * @ordered
   */
  protected static final String TARGET_FINDER_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetFinderExpression() <em>Target Finder Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetFinderExpression()
   * @generated
   * @ordered
   */
  protected String targetFinderExpression = TARGET_FINDER_EXPRESSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationBasedEdgeImpl()
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
    return SiriusTextDslPackage.Literals.RELATION_BASED_EDGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.RELATION_BASED_EDGE__DOCUMENTATION, oldDocumentation, documentation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.RELATION_BASED_EDGE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.RELATION_BASED_EDGE__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdgeStyle getStyle()
  {
    if (style != null && style.eIsProxy())
    {
      InternalEObject oldStyle = (InternalEObject)style;
      style = (EdgeStyle)eResolveProxy(oldStyle);
      if (style != oldStyle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.RELATION_BASED_EDGE__STYLE, oldStyle, style));
      }
    }
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdgeStyle basicGetStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(EdgeStyle newStyle)
  {
    EdgeStyle oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.RELATION_BASED_EDGE__STYLE, oldStyle, style));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.RELATION_BASED_EDGE__PRECONDITION_EXPRESSION, oldPreconditionExpression, preconditionExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mapping> getSourceMappings()
  {
    if (sourceMappings == null)
    {
      sourceMappings = new EObjectResolvingEList<Mapping>(Mapping.class, this, SiriusTextDslPackage.RELATION_BASED_EDGE__SOURCE_MAPPINGS);
    }
    return sourceMappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mapping> getTargetMappings()
  {
    if (targetMappings == null)
    {
      targetMappings = new EObjectResolvingEList<Mapping>(Mapping.class, this, SiriusTextDslPackage.RELATION_BASED_EDGE__TARGET_MAPPINGS);
    }
    return targetMappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetFinderExpression()
  {
    return targetFinderExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetFinderExpression(String newTargetFinderExpression)
  {
    String oldTargetFinderExpression = targetFinderExpression;
    targetFinderExpression = newTargetFinderExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.RELATION_BASED_EDGE__TARGET_FINDER_EXPRESSION, oldTargetFinderExpression, targetFinderExpression));
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
      case SiriusTextDslPackage.RELATION_BASED_EDGE__DOCUMENTATION:
        return getDocumentation();
      case SiriusTextDslPackage.RELATION_BASED_EDGE__NAME:
        return getName();
      case SiriusTextDslPackage.RELATION_BASED_EDGE__LABEL:
        return getLabel();
      case SiriusTextDslPackage.RELATION_BASED_EDGE__STYLE:
        if (resolve) return getStyle();
        return basicGetStyle();
      case SiriusTextDslPackage.RELATION_BASED_EDGE__PRECONDITION_EXPRESSION:
        return getPreconditionExpression();
      case SiriusTextDslPackage.RELATION_BASED_EDGE__SOURCE_MAPPINGS:
        return getSourceMappings();
      case SiriusTextDslPackage.RELATION_BASED_EDGE__TARGET_MAPPINGS:
        return getTargetMappings();
      case SiriusTextDslPackage.RELATION_BASED_EDGE__TARGET_FINDER_EXPRESSION:
        return getTargetFinderExpression();
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
      case SiriusTextDslPackage.RELATION_BASED_EDGE__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__NAME:
        setName((String)newValue);
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__LABEL:
        setLabel((String)newValue);
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__STYLE:
        setStyle((EdgeStyle)newValue);
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__PRECONDITION_EXPRESSION:
        setPreconditionExpression((String)newValue);
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__SOURCE_MAPPINGS:
        getSourceMappings().clear();
        getSourceMappings().addAll((Collection<? extends Mapping>)newValue);
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__TARGET_MAPPINGS:
        getTargetMappings().clear();
        getTargetMappings().addAll((Collection<? extends Mapping>)newValue);
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__TARGET_FINDER_EXPRESSION:
        setTargetFinderExpression((String)newValue);
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
      case SiriusTextDslPackage.RELATION_BASED_EDGE__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__STYLE:
        setStyle((EdgeStyle)null);
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__PRECONDITION_EXPRESSION:
        setPreconditionExpression(PRECONDITION_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__SOURCE_MAPPINGS:
        getSourceMappings().clear();
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__TARGET_MAPPINGS:
        getTargetMappings().clear();
        return;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__TARGET_FINDER_EXPRESSION:
        setTargetFinderExpression(TARGET_FINDER_EXPRESSION_EDEFAULT);
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
      case SiriusTextDslPackage.RELATION_BASED_EDGE__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SiriusTextDslPackage.RELATION_BASED_EDGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SiriusTextDslPackage.RELATION_BASED_EDGE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case SiriusTextDslPackage.RELATION_BASED_EDGE__STYLE:
        return style != null;
      case SiriusTextDslPackage.RELATION_BASED_EDGE__PRECONDITION_EXPRESSION:
        return PRECONDITION_EXPRESSION_EDEFAULT == null ? preconditionExpression != null : !PRECONDITION_EXPRESSION_EDEFAULT.equals(preconditionExpression);
      case SiriusTextDslPackage.RELATION_BASED_EDGE__SOURCE_MAPPINGS:
        return sourceMappings != null && !sourceMappings.isEmpty();
      case SiriusTextDslPackage.RELATION_BASED_EDGE__TARGET_MAPPINGS:
        return targetMappings != null && !targetMappings.isEmpty();
      case SiriusTextDslPackage.RELATION_BASED_EDGE__TARGET_FINDER_EXPRESSION:
        return TARGET_FINDER_EXPRESSION_EDEFAULT == null ? targetFinderExpression != null : !TARGET_FINDER_EXPRESSION_EDEFAULT.equals(targetFinderExpression);
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
    result.append(", preconditionExpression: ");
    result.append(preconditionExpression);
    result.append(", targetFinderExpression: ");
    result.append(targetFinderExpression);
    result.append(')');
    return result.toString();
  }

} //RelationBasedEdgeImpl
