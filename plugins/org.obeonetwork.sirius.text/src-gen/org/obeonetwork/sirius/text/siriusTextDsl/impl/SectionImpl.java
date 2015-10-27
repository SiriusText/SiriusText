/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.sirius.text.siriusTextDsl.Section;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;
import org.obeonetwork.sirius.text.siriusTextDsl.Tool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SectionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SectionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SectionImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SectionImpl#getTools <em>Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends SiriusFileBodyImpl implements Section
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
   * The cached value of the '{@link #getTools() <em>Tools</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTools()
   * @generated
   * @ordered
   */
  protected EList<Tool> tools;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SectionImpl()
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
    return SiriusTextDslPackage.Literals.SECTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SECTION__DOCUMENTATION, oldDocumentation, documentation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SECTION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SECTION__LABEL, oldLabel, label));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SECTION__ICON, oldIcon, icon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tool> getTools()
  {
    if (tools == null)
    {
      tools = new EObjectResolvingEList<Tool>(Tool.class, this, SiriusTextDslPackage.SECTION__TOOLS);
    }
    return tools;
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
      case SiriusTextDslPackage.SECTION__DOCUMENTATION:
        return getDocumentation();
      case SiriusTextDslPackage.SECTION__NAME:
        return getName();
      case SiriusTextDslPackage.SECTION__LABEL:
        return getLabel();
      case SiriusTextDslPackage.SECTION__ICON:
        return getIcon();
      case SiriusTextDslPackage.SECTION__TOOLS:
        return getTools();
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
      case SiriusTextDslPackage.SECTION__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SiriusTextDslPackage.SECTION__NAME:
        setName((String)newValue);
        return;
      case SiriusTextDslPackage.SECTION__LABEL:
        setLabel((String)newValue);
        return;
      case SiriusTextDslPackage.SECTION__ICON:
        setIcon((String)newValue);
        return;
      case SiriusTextDslPackage.SECTION__TOOLS:
        getTools().clear();
        getTools().addAll((Collection<? extends Tool>)newValue);
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
      case SiriusTextDslPackage.SECTION__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SiriusTextDslPackage.SECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.SECTION__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case SiriusTextDslPackage.SECTION__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case SiriusTextDslPackage.SECTION__TOOLS:
        getTools().clear();
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
      case SiriusTextDslPackage.SECTION__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SiriusTextDslPackage.SECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SiriusTextDslPackage.SECTION__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case SiriusTextDslPackage.SECTION__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case SiriusTextDslPackage.SECTION__TOOLS:
        return tools != null && !tools.isEmpty();
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
    result.append(", icon: ");
    result.append(icon);
    result.append(')');
    return result.toString();
  }

} //SectionImpl
