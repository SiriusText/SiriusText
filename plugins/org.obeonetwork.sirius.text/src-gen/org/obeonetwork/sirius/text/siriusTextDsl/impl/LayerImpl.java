/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.sirius.text.siriusTextDsl.Edge;
import org.obeonetwork.sirius.text.siriusTextDsl.Layer;
import org.obeonetwork.sirius.text.siriusTextDsl.Mapping;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerImpl extends SiriusFileBodyImpl implements Layer
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
   * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected static final String ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected String icon = ICON_EDEFAULT;

  /**
   * The cached value of the '{@link #getMappings() <em>Mappings</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappings()
   * @generated
   * @ordered
   */
  protected EList<Mapping> mappings;

  /**
   * The cached value of the '{@link #getEdges() <em>Edges</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdges()
   * @generated
   * @ordered
   */
  protected EList<Edge> edges;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayerImpl()
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
    return SiriusTextDslPackage.Literals.LAYER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.LAYER__DOCUMENTATION, oldDocumentation, documentation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.LAYER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIcon()
  {
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcon(String newIcon)
  {
    String oldIcon = icon;
    icon = newIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.LAYER__ICON, oldIcon, icon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mapping> getMappings()
  {
    if (mappings == null)
    {
      mappings = new EObjectResolvingEList<Mapping>(Mapping.class, this, SiriusTextDslPackage.LAYER__MAPPINGS);
    }
    return mappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Edge> getEdges()
  {
    if (edges == null)
    {
      edges = new EObjectResolvingEList<Edge>(Edge.class, this, SiriusTextDslPackage.LAYER__EDGES);
    }
    return edges;
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
      case SiriusTextDslPackage.LAYER__DOCUMENTATION:
        return getDocumentation();
      case SiriusTextDslPackage.LAYER__NAME:
        return getName();
      case SiriusTextDslPackage.LAYER__ICON:
        return getIcon();
      case SiriusTextDslPackage.LAYER__MAPPINGS:
        return getMappings();
      case SiriusTextDslPackage.LAYER__EDGES:
        return getEdges();
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
      case SiriusTextDslPackage.LAYER__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SiriusTextDslPackage.LAYER__NAME:
        setName((String)newValue);
        return;
      case SiriusTextDslPackage.LAYER__ICON:
        setIcon((String)newValue);
        return;
      case SiriusTextDslPackage.LAYER__MAPPINGS:
        getMappings().clear();
        getMappings().addAll((Collection<? extends Mapping>)newValue);
        return;
      case SiriusTextDslPackage.LAYER__EDGES:
        getEdges().clear();
        getEdges().addAll((Collection<? extends Edge>)newValue);
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
      case SiriusTextDslPackage.LAYER__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SiriusTextDslPackage.LAYER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.LAYER__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case SiriusTextDslPackage.LAYER__MAPPINGS:
        getMappings().clear();
        return;
      case SiriusTextDslPackage.LAYER__EDGES:
        getEdges().clear();
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
      case SiriusTextDslPackage.LAYER__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SiriusTextDslPackage.LAYER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SiriusTextDslPackage.LAYER__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case SiriusTextDslPackage.LAYER__MAPPINGS:
        return mappings != null && !mappings.isEmpty();
      case SiriusTextDslPackage.LAYER__EDGES:
        return edges != null && !edges.isEmpty();
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
    result.append(", icon: ");
    result.append(icon);
    result.append(')');
    return result.toString();
  }

} //LayerImpl
