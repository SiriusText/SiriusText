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

import org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration;
import org.obeonetwork.sirius.text.siriusTextDsl.Node;
import org.obeonetwork.sirius.text.siriusTextDsl.NodeStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.NodeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.NodeImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MappingImpl implements Node
{
  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected NodeStyle style;

  /**
   * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionalStyles()
   * @generated
   * @ordered
   */
  protected EList<ConditionalNodeStyleDeclaration> conditionalStyles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeImpl()
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
    return SiriusTextDslPackage.Literals.NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeStyle getStyle()
  {
    if (style != null && style.eIsProxy())
    {
      InternalEObject oldStyle = (InternalEObject)style;
      style = (NodeStyle)eResolveProxy(oldStyle);
      if (style != oldStyle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.NODE__STYLE, oldStyle, style));
      }
    }
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeStyle basicGetStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(NodeStyle newStyle)
  {
    NodeStyle oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.NODE__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConditionalNodeStyleDeclaration> getConditionalStyles()
  {
    if (conditionalStyles == null)
    {
      conditionalStyles = new EObjectContainmentEList<ConditionalNodeStyleDeclaration>(ConditionalNodeStyleDeclaration.class, this, SiriusTextDslPackage.NODE__CONDITIONAL_STYLES);
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
      case SiriusTextDslPackage.NODE__CONDITIONAL_STYLES:
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
      case SiriusTextDslPackage.NODE__STYLE:
        if (resolve) return getStyle();
        return basicGetStyle();
      case SiriusTextDslPackage.NODE__CONDITIONAL_STYLES:
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
      case SiriusTextDslPackage.NODE__STYLE:
        setStyle((NodeStyle)newValue);
        return;
      case SiriusTextDslPackage.NODE__CONDITIONAL_STYLES:
        getConditionalStyles().clear();
        getConditionalStyles().addAll((Collection<? extends ConditionalNodeStyleDeclaration>)newValue);
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
      case SiriusTextDslPackage.NODE__STYLE:
        setStyle((NodeStyle)null);
        return;
      case SiriusTextDslPackage.NODE__CONDITIONAL_STYLES:
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
      case SiriusTextDslPackage.NODE__STYLE:
        return style != null;
      case SiriusTextDslPackage.NODE__CONDITIONAL_STYLES:
        return conditionalStyles != null && !conditionalStyles.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NodeImpl
