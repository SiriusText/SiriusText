/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.sirius.text.siriusTextDsl.Diagram;
import org.obeonetwork.sirius.text.siriusTextDsl.Layer;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#isShowOnStartup <em>Show On Startup</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#isEnablePopupBars <em>Enable Popup Bars</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#getMetamodelUris <em>Metamodel Uris</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#getPreconditionExpression <em>Precondition Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#getEndUserDocumentation <em>End User Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#getTitleExpression <em>Title Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#getRootExpression <em>Root Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#getDefaultLayer <em>Default Layer</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl#getAdditionalLayers <em>Additional Layers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramImpl extends RepresentationImpl implements Diagram
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
   * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInitialized()
   * @generated
   * @ordered
   */
  protected static final boolean INITIALIZED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInitialized()
   * @generated
   * @ordered
   */
  protected boolean initialized = INITIALIZED_EDEFAULT;

  /**
   * The default value of the '{@link #isShowOnStartup() <em>Show On Startup</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowOnStartup()
   * @generated
   * @ordered
   */
  protected static final boolean SHOW_ON_STARTUP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isShowOnStartup() <em>Show On Startup</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowOnStartup()
   * @generated
   * @ordered
   */
  protected boolean showOnStartup = SHOW_ON_STARTUP_EDEFAULT;

  /**
   * The default value of the '{@link #isEnablePopupBars() <em>Enable Popup Bars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnablePopupBars()
   * @generated
   * @ordered
   */
  protected static final boolean ENABLE_POPUP_BARS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnablePopupBars() <em>Enable Popup Bars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnablePopupBars()
   * @generated
   * @ordered
   */
  protected boolean enablePopupBars = ENABLE_POPUP_BARS_EDEFAULT;

  /**
   * The cached value of the '{@link #getMetamodelUris() <em>Metamodel Uris</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodelUris()
   * @generated
   * @ordered
   */
  protected EList<String> metamodelUris;

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
   * The default value of the '{@link #getEndUserDocumentation() <em>End User Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndUserDocumentation()
   * @generated
   * @ordered
   */
  protected static final String END_USER_DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndUserDocumentation() <em>End User Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndUserDocumentation()
   * @generated
   * @ordered
   */
  protected String endUserDocumentation = END_USER_DOCUMENTATION_EDEFAULT;

  /**
   * The default value of the '{@link #getTitleExpression() <em>Title Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitleExpression()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitleExpression() <em>Title Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitleExpression()
   * @generated
   * @ordered
   */
  protected String titleExpression = TITLE_EXPRESSION_EDEFAULT;

  /**
   * The default value of the '{@link #getRootExpression() <em>Root Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootExpression()
   * @generated
   * @ordered
   */
  protected static final String ROOT_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRootExpression() <em>Root Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootExpression()
   * @generated
   * @ordered
   */
  protected String rootExpression = ROOT_EXPRESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefaultLayer() <em>Default Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultLayer()
   * @generated
   * @ordered
   */
  protected Layer defaultLayer;

  /**
   * The cached value of the '{@link #getAdditionalLayers() <em>Additional Layers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditionalLayers()
   * @generated
   * @ordered
   */
  protected EList<Layer> additionalLayers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiagramImpl()
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
    return SiriusTextDslPackage.Literals.DIAGRAM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.DIAGRAM__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInitialized()
  {
    return initialized;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialized(boolean newInitialized)
  {
    boolean oldInitialized = initialized;
    initialized = newInitialized;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.DIAGRAM__INITIALIZED, oldInitialized, initialized));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isShowOnStartup()
  {
    return showOnStartup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShowOnStartup(boolean newShowOnStartup)
  {
    boolean oldShowOnStartup = showOnStartup;
    showOnStartup = newShowOnStartup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.DIAGRAM__SHOW_ON_STARTUP, oldShowOnStartup, showOnStartup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnablePopupBars()
  {
    return enablePopupBars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnablePopupBars(boolean newEnablePopupBars)
  {
    boolean oldEnablePopupBars = enablePopupBars;
    enablePopupBars = newEnablePopupBars;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.DIAGRAM__ENABLE_POPUP_BARS, oldEnablePopupBars, enablePopupBars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getMetamodelUris()
  {
    if (metamodelUris == null)
    {
      metamodelUris = new EDataTypeEList<String>(String.class, this, SiriusTextDslPackage.DIAGRAM__METAMODEL_URIS);
    }
    return metamodelUris;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.DIAGRAM__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.DIAGRAM__LABEL, oldLabel, label));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.DIAGRAM__DOMAIN_CLASS, oldDomainClass, domainClass));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.DIAGRAM__PRECONDITION_EXPRESSION, oldPreconditionExpression, preconditionExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndUserDocumentation()
  {
    return endUserDocumentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndUserDocumentation(String newEndUserDocumentation)
  {
    String oldEndUserDocumentation = endUserDocumentation;
    endUserDocumentation = newEndUserDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.DIAGRAM__END_USER_DOCUMENTATION, oldEndUserDocumentation, endUserDocumentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitleExpression()
  {
    return titleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitleExpression(String newTitleExpression)
  {
    String oldTitleExpression = titleExpression;
    titleExpression = newTitleExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.DIAGRAM__TITLE_EXPRESSION, oldTitleExpression, titleExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRootExpression()
  {
    return rootExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootExpression(String newRootExpression)
  {
    String oldRootExpression = rootExpression;
    rootExpression = newRootExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.DIAGRAM__ROOT_EXPRESSION, oldRootExpression, rootExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layer getDefaultLayer()
  {
    if (defaultLayer != null && defaultLayer.eIsProxy())
    {
      InternalEObject oldDefaultLayer = (InternalEObject)defaultLayer;
      defaultLayer = (Layer)eResolveProxy(oldDefaultLayer);
      if (defaultLayer != oldDefaultLayer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.DIAGRAM__DEFAULT_LAYER, oldDefaultLayer, defaultLayer));
      }
    }
    return defaultLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layer basicGetDefaultLayer()
  {
    return defaultLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultLayer(Layer newDefaultLayer)
  {
    Layer oldDefaultLayer = defaultLayer;
    defaultLayer = newDefaultLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.DIAGRAM__DEFAULT_LAYER, oldDefaultLayer, defaultLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Layer> getAdditionalLayers()
  {
    if (additionalLayers == null)
    {
      additionalLayers = new EObjectResolvingEList<Layer>(Layer.class, this, SiriusTextDslPackage.DIAGRAM__ADDITIONAL_LAYERS);
    }
    return additionalLayers;
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
      case SiriusTextDslPackage.DIAGRAM__DOCUMENTATION:
        return getDocumentation();
      case SiriusTextDslPackage.DIAGRAM__INITIALIZED:
        return isInitialized();
      case SiriusTextDslPackage.DIAGRAM__SHOW_ON_STARTUP:
        return isShowOnStartup();
      case SiriusTextDslPackage.DIAGRAM__ENABLE_POPUP_BARS:
        return isEnablePopupBars();
      case SiriusTextDslPackage.DIAGRAM__METAMODEL_URIS:
        return getMetamodelUris();
      case SiriusTextDslPackage.DIAGRAM__NAME:
        return getName();
      case SiriusTextDslPackage.DIAGRAM__LABEL:
        return getLabel();
      case SiriusTextDslPackage.DIAGRAM__DOMAIN_CLASS:
        return getDomainClass();
      case SiriusTextDslPackage.DIAGRAM__PRECONDITION_EXPRESSION:
        return getPreconditionExpression();
      case SiriusTextDslPackage.DIAGRAM__END_USER_DOCUMENTATION:
        return getEndUserDocumentation();
      case SiriusTextDslPackage.DIAGRAM__TITLE_EXPRESSION:
        return getTitleExpression();
      case SiriusTextDslPackage.DIAGRAM__ROOT_EXPRESSION:
        return getRootExpression();
      case SiriusTextDslPackage.DIAGRAM__DEFAULT_LAYER:
        if (resolve) return getDefaultLayer();
        return basicGetDefaultLayer();
      case SiriusTextDslPackage.DIAGRAM__ADDITIONAL_LAYERS:
        return getAdditionalLayers();
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
      case SiriusTextDslPackage.DIAGRAM__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__INITIALIZED:
        setInitialized((Boolean)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__SHOW_ON_STARTUP:
        setShowOnStartup((Boolean)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__ENABLE_POPUP_BARS:
        setEnablePopupBars((Boolean)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__METAMODEL_URIS:
        getMetamodelUris().clear();
        getMetamodelUris().addAll((Collection<? extends String>)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__NAME:
        setName((String)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__LABEL:
        setLabel((String)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__DOMAIN_CLASS:
        setDomainClass((String)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__PRECONDITION_EXPRESSION:
        setPreconditionExpression((String)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__END_USER_DOCUMENTATION:
        setEndUserDocumentation((String)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__TITLE_EXPRESSION:
        setTitleExpression((String)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__ROOT_EXPRESSION:
        setRootExpression((String)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__DEFAULT_LAYER:
        setDefaultLayer((Layer)newValue);
        return;
      case SiriusTextDslPackage.DIAGRAM__ADDITIONAL_LAYERS:
        getAdditionalLayers().clear();
        getAdditionalLayers().addAll((Collection<? extends Layer>)newValue);
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
      case SiriusTextDslPackage.DIAGRAM__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SiriusTextDslPackage.DIAGRAM__INITIALIZED:
        setInitialized(INITIALIZED_EDEFAULT);
        return;
      case SiriusTextDslPackage.DIAGRAM__SHOW_ON_STARTUP:
        setShowOnStartup(SHOW_ON_STARTUP_EDEFAULT);
        return;
      case SiriusTextDslPackage.DIAGRAM__ENABLE_POPUP_BARS:
        setEnablePopupBars(ENABLE_POPUP_BARS_EDEFAULT);
        return;
      case SiriusTextDslPackage.DIAGRAM__METAMODEL_URIS:
        getMetamodelUris().clear();
        return;
      case SiriusTextDslPackage.DIAGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.DIAGRAM__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case SiriusTextDslPackage.DIAGRAM__DOMAIN_CLASS:
        setDomainClass(DOMAIN_CLASS_EDEFAULT);
        return;
      case SiriusTextDslPackage.DIAGRAM__PRECONDITION_EXPRESSION:
        setPreconditionExpression(PRECONDITION_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.DIAGRAM__END_USER_DOCUMENTATION:
        setEndUserDocumentation(END_USER_DOCUMENTATION_EDEFAULT);
        return;
      case SiriusTextDslPackage.DIAGRAM__TITLE_EXPRESSION:
        setTitleExpression(TITLE_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.DIAGRAM__ROOT_EXPRESSION:
        setRootExpression(ROOT_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.DIAGRAM__DEFAULT_LAYER:
        setDefaultLayer((Layer)null);
        return;
      case SiriusTextDslPackage.DIAGRAM__ADDITIONAL_LAYERS:
        getAdditionalLayers().clear();
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
      case SiriusTextDslPackage.DIAGRAM__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SiriusTextDslPackage.DIAGRAM__INITIALIZED:
        return initialized != INITIALIZED_EDEFAULT;
      case SiriusTextDslPackage.DIAGRAM__SHOW_ON_STARTUP:
        return showOnStartup != SHOW_ON_STARTUP_EDEFAULT;
      case SiriusTextDslPackage.DIAGRAM__ENABLE_POPUP_BARS:
        return enablePopupBars != ENABLE_POPUP_BARS_EDEFAULT;
      case SiriusTextDslPackage.DIAGRAM__METAMODEL_URIS:
        return metamodelUris != null && !metamodelUris.isEmpty();
      case SiriusTextDslPackage.DIAGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SiriusTextDslPackage.DIAGRAM__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case SiriusTextDslPackage.DIAGRAM__DOMAIN_CLASS:
        return DOMAIN_CLASS_EDEFAULT == null ? domainClass != null : !DOMAIN_CLASS_EDEFAULT.equals(domainClass);
      case SiriusTextDslPackage.DIAGRAM__PRECONDITION_EXPRESSION:
        return PRECONDITION_EXPRESSION_EDEFAULT == null ? preconditionExpression != null : !PRECONDITION_EXPRESSION_EDEFAULT.equals(preconditionExpression);
      case SiriusTextDslPackage.DIAGRAM__END_USER_DOCUMENTATION:
        return END_USER_DOCUMENTATION_EDEFAULT == null ? endUserDocumentation != null : !END_USER_DOCUMENTATION_EDEFAULT.equals(endUserDocumentation);
      case SiriusTextDslPackage.DIAGRAM__TITLE_EXPRESSION:
        return TITLE_EXPRESSION_EDEFAULT == null ? titleExpression != null : !TITLE_EXPRESSION_EDEFAULT.equals(titleExpression);
      case SiriusTextDslPackage.DIAGRAM__ROOT_EXPRESSION:
        return ROOT_EXPRESSION_EDEFAULT == null ? rootExpression != null : !ROOT_EXPRESSION_EDEFAULT.equals(rootExpression);
      case SiriusTextDslPackage.DIAGRAM__DEFAULT_LAYER:
        return defaultLayer != null;
      case SiriusTextDslPackage.DIAGRAM__ADDITIONAL_LAYERS:
        return additionalLayers != null && !additionalLayers.isEmpty();
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
    result.append(", initialized: ");
    result.append(initialized);
    result.append(", showOnStartup: ");
    result.append(showOnStartup);
    result.append(", enablePopupBars: ");
    result.append(enablePopupBars);
    result.append(", metamodelUris: ");
    result.append(metamodelUris);
    result.append(", name: ");
    result.append(name);
    result.append(", label: ");
    result.append(label);
    result.append(", domainClass: ");
    result.append(domainClass);
    result.append(", preconditionExpression: ");
    result.append(preconditionExpression);
    result.append(", endUserDocumentation: ");
    result.append(endUserDocumentation);
    result.append(", titleExpression: ");
    result.append(titleExpression);
    result.append(", rootExpression: ");
    result.append(rootExpression);
    result.append(')');
    return result.toString();
  }

} //DiagramImpl
