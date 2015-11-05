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

import org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration;
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerChildrenPresentation;
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
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl#getChildrenPresentation <em>Children Presentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MappingImpl implements org.obeonetwork.sirius.text.siriusTextDsl.Container
{
  /**
   * The default value of the '{@link #getChildrenPresentation() <em>Children Presentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildrenPresentation()
   * @generated
   * @ordered
   */
  protected static final ContainerChildrenPresentation CHILDREN_PRESENTATION_EDEFAULT = ContainerChildrenPresentation.FREE_FORM;

  /**
   * The cached value of the '{@link #getChildrenPresentation() <em>Children Presentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildrenPresentation()
   * @generated
   * @ordered
   */
  protected ContainerChildrenPresentation childrenPresentation = CHILDREN_PRESENTATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected ContainerStyle style;

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
  public ContainerChildrenPresentation getChildrenPresentation()
  {
    return childrenPresentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChildrenPresentation(ContainerChildrenPresentation newChildrenPresentation)
  {
    ContainerChildrenPresentation oldChildrenPresentation = childrenPresentation;
    childrenPresentation = newChildrenPresentation == null ? CHILDREN_PRESENTATION_EDEFAULT : newChildrenPresentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER__CHILDREN_PRESENTATION, oldChildrenPresentation, childrenPresentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerStyle getStyle()
  {
    if (style != null && style.eIsProxy())
    {
      InternalEObject oldStyle = (InternalEObject)style;
      style = (ContainerStyle)eResolveProxy(oldStyle);
      if (style != oldStyle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.CONTAINER__STYLE, oldStyle, style));
      }
    }
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerStyle basicGetStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(ContainerStyle newStyle)
  {
    ContainerStyle oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.CONTAINER__STYLE, oldStyle, style));
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
      case SiriusTextDslPackage.CONTAINER__CHILDREN_PRESENTATION:
        return getChildrenPresentation();
      case SiriusTextDslPackage.CONTAINER__STYLE:
        if (resolve) return getStyle();
        return basicGetStyle();
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
      case SiriusTextDslPackage.CONTAINER__CHILDREN_PRESENTATION:
        setChildrenPresentation((ContainerChildrenPresentation)newValue);
        return;
      case SiriusTextDslPackage.CONTAINER__STYLE:
        setStyle((ContainerStyle)newValue);
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
      case SiriusTextDslPackage.CONTAINER__CHILDREN_PRESENTATION:
        setChildrenPresentation(CHILDREN_PRESENTATION_EDEFAULT);
        return;
      case SiriusTextDslPackage.CONTAINER__STYLE:
        setStyle((ContainerStyle)null);
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
      case SiriusTextDslPackage.CONTAINER__CHILDREN_PRESENTATION:
        return childrenPresentation != CHILDREN_PRESENTATION_EDEFAULT;
      case SiriusTextDslPackage.CONTAINER__STYLE:
        return style != null;
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
    result.append(" (childrenPresentation: ");
    result.append(childrenPresentation);
    result.append(')');
    return result.toString();
  }

} //ContainerImpl
