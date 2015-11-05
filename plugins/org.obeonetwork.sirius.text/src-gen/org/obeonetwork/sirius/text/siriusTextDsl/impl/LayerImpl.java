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
import org.obeonetwork.sirius.text.siriusTextDsl.Section;
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
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl#getIconPath <em>Icon Path</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl#getSections <em>Sections</em>}</li>
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
   * The cached value of the '{@link #getSections() <em>Sections</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSections()
   * @generated
   * @ordered
   */
  protected EList<Section> sections;

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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.LAYER__ICON_PATH, oldIconPath, iconPath));
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
  public EList<Section> getSections()
  {
    if (sections == null)
    {
      sections = new EObjectResolvingEList<Section>(Section.class, this, SiriusTextDslPackage.LAYER__SECTIONS);
    }
    return sections;
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
      case SiriusTextDslPackage.LAYER__ICON_PATH:
        return getIconPath();
      case SiriusTextDslPackage.LAYER__NAME:
        return getName();
      case SiriusTextDslPackage.LAYER__MAPPINGS:
        return getMappings();
      case SiriusTextDslPackage.LAYER__EDGES:
        return getEdges();
      case SiriusTextDslPackage.LAYER__SECTIONS:
        return getSections();
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
      case SiriusTextDslPackage.LAYER__ICON_PATH:
        setIconPath((String)newValue);
        return;
      case SiriusTextDslPackage.LAYER__NAME:
        setName((String)newValue);
        return;
      case SiriusTextDslPackage.LAYER__MAPPINGS:
        getMappings().clear();
        getMappings().addAll((Collection<? extends Mapping>)newValue);
        return;
      case SiriusTextDslPackage.LAYER__EDGES:
        getEdges().clear();
        getEdges().addAll((Collection<? extends Edge>)newValue);
        return;
      case SiriusTextDslPackage.LAYER__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends Section>)newValue);
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
      case SiriusTextDslPackage.LAYER__ICON_PATH:
        setIconPath(ICON_PATH_EDEFAULT);
        return;
      case SiriusTextDslPackage.LAYER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.LAYER__MAPPINGS:
        getMappings().clear();
        return;
      case SiriusTextDslPackage.LAYER__EDGES:
        getEdges().clear();
        return;
      case SiriusTextDslPackage.LAYER__SECTIONS:
        getSections().clear();
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
      case SiriusTextDslPackage.LAYER__ICON_PATH:
        return ICON_PATH_EDEFAULT == null ? iconPath != null : !ICON_PATH_EDEFAULT.equals(iconPath);
      case SiriusTextDslPackage.LAYER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SiriusTextDslPackage.LAYER__MAPPINGS:
        return mappings != null && !mappings.isEmpty();
      case SiriusTextDslPackage.LAYER__EDGES:
        return edges != null && !edges.isEmpty();
      case SiriusTextDslPackage.LAYER__SECTIONS:
        return sections != null && !sections.isEmpty();
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
    result.append(", iconPath: ");
    result.append(iconPath);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LayerImpl
