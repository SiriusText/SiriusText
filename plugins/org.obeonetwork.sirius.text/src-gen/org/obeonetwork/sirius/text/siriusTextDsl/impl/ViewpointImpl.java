/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.common.types.JvmType;

import org.obeonetwork.sirius.text.siriusTextDsl.Representation;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;
import org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ViewpointImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ViewpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ViewpointImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ViewpointImpl#getModelFileExtensions <em>Model File Extensions</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ViewpointImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ViewpointImpl#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ViewpointImpl#getJavaExtension <em>Java Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewpointImpl extends MinimalEObjectImpl.Container implements Viewpoint
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
   * The cached value of the '{@link #getModelFileExtensions() <em>Model File Extensions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelFileExtensions()
   * @generated
   * @ordered
   */
  protected EList<String> modelFileExtensions;

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
   * The cached value of the '{@link #getRepresentations() <em>Representations</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepresentations()
   * @generated
   * @ordered
   */
  protected EList<Representation> representations;

  /**
   * The cached value of the '{@link #getJavaExtension() <em>Java Extension</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaExtension()
   * @generated
   * @ordered
   */
  protected EList<JvmType> javaExtension;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewpointImpl()
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
    return SiriusTextDslPackage.Literals.VIEWPOINT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.VIEWPOINT__DOCUMENTATION, oldDocumentation, documentation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.VIEWPOINT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.VIEWPOINT__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getModelFileExtensions()
  {
    if (modelFileExtensions == null)
    {
      modelFileExtensions = new EDataTypeEList<String>(String.class, this, SiriusTextDslPackage.VIEWPOINT__MODEL_FILE_EXTENSIONS);
    }
    return modelFileExtensions;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.VIEWPOINT__ICON, oldIcon, icon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Representation> getRepresentations()
  {
    if (representations == null)
    {
      representations = new EObjectResolvingEList<Representation>(Representation.class, this, SiriusTextDslPackage.VIEWPOINT__REPRESENTATIONS);
    }
    return representations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmType> getJavaExtension()
  {
    if (javaExtension == null)
    {
      javaExtension = new EObjectResolvingEList<JvmType>(JvmType.class, this, SiriusTextDslPackage.VIEWPOINT__JAVA_EXTENSION);
    }
    return javaExtension;
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
      case SiriusTextDslPackage.VIEWPOINT__DOCUMENTATION:
        return getDocumentation();
      case SiriusTextDslPackage.VIEWPOINT__NAME:
        return getName();
      case SiriusTextDslPackage.VIEWPOINT__LABEL:
        return getLabel();
      case SiriusTextDslPackage.VIEWPOINT__MODEL_FILE_EXTENSIONS:
        return getModelFileExtensions();
      case SiriusTextDslPackage.VIEWPOINT__ICON:
        return getIcon();
      case SiriusTextDslPackage.VIEWPOINT__REPRESENTATIONS:
        return getRepresentations();
      case SiriusTextDslPackage.VIEWPOINT__JAVA_EXTENSION:
        return getJavaExtension();
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
      case SiriusTextDslPackage.VIEWPOINT__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SiriusTextDslPackage.VIEWPOINT__NAME:
        setName((String)newValue);
        return;
      case SiriusTextDslPackage.VIEWPOINT__LABEL:
        setLabel((String)newValue);
        return;
      case SiriusTextDslPackage.VIEWPOINT__MODEL_FILE_EXTENSIONS:
        getModelFileExtensions().clear();
        getModelFileExtensions().addAll((Collection<? extends String>)newValue);
        return;
      case SiriusTextDslPackage.VIEWPOINT__ICON:
        setIcon((String)newValue);
        return;
      case SiriusTextDslPackage.VIEWPOINT__REPRESENTATIONS:
        getRepresentations().clear();
        getRepresentations().addAll((Collection<? extends Representation>)newValue);
        return;
      case SiriusTextDslPackage.VIEWPOINT__JAVA_EXTENSION:
        getJavaExtension().clear();
        getJavaExtension().addAll((Collection<? extends JvmType>)newValue);
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
      case SiriusTextDslPackage.VIEWPOINT__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SiriusTextDslPackage.VIEWPOINT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.VIEWPOINT__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case SiriusTextDslPackage.VIEWPOINT__MODEL_FILE_EXTENSIONS:
        getModelFileExtensions().clear();
        return;
      case SiriusTextDslPackage.VIEWPOINT__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case SiriusTextDslPackage.VIEWPOINT__REPRESENTATIONS:
        getRepresentations().clear();
        return;
      case SiriusTextDslPackage.VIEWPOINT__JAVA_EXTENSION:
        getJavaExtension().clear();
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
      case SiriusTextDslPackage.VIEWPOINT__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SiriusTextDslPackage.VIEWPOINT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SiriusTextDslPackage.VIEWPOINT__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case SiriusTextDslPackage.VIEWPOINT__MODEL_FILE_EXTENSIONS:
        return modelFileExtensions != null && !modelFileExtensions.isEmpty();
      case SiriusTextDslPackage.VIEWPOINT__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case SiriusTextDslPackage.VIEWPOINT__REPRESENTATIONS:
        return representations != null && !representations.isEmpty();
      case SiriusTextDslPackage.VIEWPOINT__JAVA_EXTENSION:
        return javaExtension != null && !javaExtension.isEmpty();
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
    result.append(", modelFileExtensions: ");
    result.append(modelFileExtensions);
    result.append(", icon: ");
    result.append(icon);
    result.append(')');
    return result.toString();
  }

} //ViewpointImpl
