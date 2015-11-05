/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator;
import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel;
import org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering;
import org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.LineStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl#getRoutingStyle <em>Routing Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl#getSourceArrow <em>Source Arrow</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl#getTargetArrow <em>Target Arrow</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl#getSizeComputationExpression <em>Size Computation Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl#getFoldingStyle <em>Folding Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl#getEndsCentering <em>Ends Centering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeStyleImpl extends StyleImpl implements EdgeStyle
{
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
   * The cached value of the '{@link #getStrokeColor() <em>Stroke Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrokeColor()
   * @generated
   * @ordered
   */
  protected Color strokeColor;

  /**
   * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineStyle()
   * @generated
   * @ordered
   */
  protected static final LineStyle LINE_STYLE_EDEFAULT = LineStyle.SOLID;

  /**
   * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineStyle()
   * @generated
   * @ordered
   */
  protected LineStyle lineStyle = LINE_STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #getRoutingStyle() <em>Routing Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoutingStyle()
   * @generated
   * @ordered
   */
  protected static final RoutingStyle ROUTING_STYLE_EDEFAULT = RoutingStyle.STRAIGHT;

  /**
   * The cached value of the '{@link #getRoutingStyle() <em>Routing Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoutingStyle()
   * @generated
   * @ordered
   */
  protected RoutingStyle routingStyle = ROUTING_STYLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected EdgeLabel label;

  /**
   * The default value of the '{@link #getSourceArrow() <em>Source Arrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceArrow()
   * @generated
   * @ordered
   */
  protected static final ArrowDecorator SOURCE_ARROW_EDEFAULT = ArrowDecorator.NO_DECORATION;

  /**
   * The cached value of the '{@link #getSourceArrow() <em>Source Arrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceArrow()
   * @generated
   * @ordered
   */
  protected ArrowDecorator sourceArrow = SOURCE_ARROW_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetArrow() <em>Target Arrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetArrow()
   * @generated
   * @ordered
   */
  protected static final ArrowDecorator TARGET_ARROW_EDEFAULT = ArrowDecorator.NO_DECORATION;

  /**
   * The cached value of the '{@link #getTargetArrow() <em>Target Arrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetArrow()
   * @generated
   * @ordered
   */
  protected ArrowDecorator targetArrow = TARGET_ARROW_EDEFAULT;

  /**
   * The default value of the '{@link #getSizeComputationExpression() <em>Size Computation Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizeComputationExpression()
   * @generated
   * @ordered
   */
  protected static final String SIZE_COMPUTATION_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSizeComputationExpression() <em>Size Computation Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizeComputationExpression()
   * @generated
   * @ordered
   */
  protected String sizeComputationExpression = SIZE_COMPUTATION_EXPRESSION_EDEFAULT;

  /**
   * The default value of the '{@link #getFoldingStyle() <em>Folding Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoldingStyle()
   * @generated
   * @ordered
   */
  protected static final FoldingStyle FOLDING_STYLE_EDEFAULT = FoldingStyle.NONE;

  /**
   * The cached value of the '{@link #getFoldingStyle() <em>Folding Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoldingStyle()
   * @generated
   * @ordered
   */
  protected FoldingStyle foldingStyle = FOLDING_STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #getEndsCentering() <em>Ends Centering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndsCentering()
   * @generated
   * @ordered
   */
  protected static final EndsCentering ENDS_CENTERING_EDEFAULT = EndsCentering.NONE;

  /**
   * The cached value of the '{@link #getEndsCentering() <em>Ends Centering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndsCentering()
   * @generated
   * @ordered
   */
  protected EndsCentering endsCentering = ENDS_CENTERING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EdgeStyleImpl()
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
    return SiriusTextDslPackage.Literals.EDGE_STYLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_STYLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getStrokeColor()
  {
    if (strokeColor != null && strokeColor.eIsProxy())
    {
      InternalEObject oldStrokeColor = (InternalEObject)strokeColor;
      strokeColor = (Color)eResolveProxy(oldStrokeColor);
      if (strokeColor != oldStrokeColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.EDGE_STYLE__STROKE_COLOR, oldStrokeColor, strokeColor));
      }
    }
    return strokeColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetStrokeColor()
  {
    return strokeColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrokeColor(Color newStrokeColor)
  {
    Color oldStrokeColor = strokeColor;
    strokeColor = newStrokeColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_STYLE__STROKE_COLOR, oldStrokeColor, strokeColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineStyle getLineStyle()
  {
    return lineStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLineStyle(LineStyle newLineStyle)
  {
    LineStyle oldLineStyle = lineStyle;
    lineStyle = newLineStyle == null ? LINE_STYLE_EDEFAULT : newLineStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_STYLE__LINE_STYLE, oldLineStyle, lineStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoutingStyle getRoutingStyle()
  {
    return routingStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoutingStyle(RoutingStyle newRoutingStyle)
  {
    RoutingStyle oldRoutingStyle = routingStyle;
    routingStyle = newRoutingStyle == null ? ROUTING_STYLE_EDEFAULT : newRoutingStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_STYLE__ROUTING_STYLE, oldRoutingStyle, routingStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdgeLabel getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(EdgeLabel newLabel, NotificationChain msgs)
  {
    EdgeLabel oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_STYLE__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(EdgeLabel newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiriusTextDslPackage.EDGE_STYLE__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiriusTextDslPackage.EDGE_STYLE__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_STYLE__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowDecorator getSourceArrow()
  {
    return sourceArrow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceArrow(ArrowDecorator newSourceArrow)
  {
    ArrowDecorator oldSourceArrow = sourceArrow;
    sourceArrow = newSourceArrow == null ? SOURCE_ARROW_EDEFAULT : newSourceArrow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_STYLE__SOURCE_ARROW, oldSourceArrow, sourceArrow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowDecorator getTargetArrow()
  {
    return targetArrow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetArrow(ArrowDecorator newTargetArrow)
  {
    ArrowDecorator oldTargetArrow = targetArrow;
    targetArrow = newTargetArrow == null ? TARGET_ARROW_EDEFAULT : newTargetArrow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_STYLE__TARGET_ARROW, oldTargetArrow, targetArrow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSizeComputationExpression()
  {
    return sizeComputationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSizeComputationExpression(String newSizeComputationExpression)
  {
    String oldSizeComputationExpression = sizeComputationExpression;
    sizeComputationExpression = newSizeComputationExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_STYLE__SIZE_COMPUTATION_EXPRESSION, oldSizeComputationExpression, sizeComputationExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FoldingStyle getFoldingStyle()
  {
    return foldingStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFoldingStyle(FoldingStyle newFoldingStyle)
  {
    FoldingStyle oldFoldingStyle = foldingStyle;
    foldingStyle = newFoldingStyle == null ? FOLDING_STYLE_EDEFAULT : newFoldingStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_STYLE__FOLDING_STYLE, oldFoldingStyle, foldingStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndsCentering getEndsCentering()
  {
    return endsCentering;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndsCentering(EndsCentering newEndsCentering)
  {
    EndsCentering oldEndsCentering = endsCentering;
    endsCentering = newEndsCentering == null ? ENDS_CENTERING_EDEFAULT : newEndsCentering;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.EDGE_STYLE__ENDS_CENTERING, oldEndsCentering, endsCentering));
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
      case SiriusTextDslPackage.EDGE_STYLE__LABEL:
        return basicSetLabel(null, msgs);
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
      case SiriusTextDslPackage.EDGE_STYLE__NAME:
        return getName();
      case SiriusTextDslPackage.EDGE_STYLE__STROKE_COLOR:
        if (resolve) return getStrokeColor();
        return basicGetStrokeColor();
      case SiriusTextDslPackage.EDGE_STYLE__LINE_STYLE:
        return getLineStyle();
      case SiriusTextDslPackage.EDGE_STYLE__ROUTING_STYLE:
        return getRoutingStyle();
      case SiriusTextDslPackage.EDGE_STYLE__LABEL:
        return getLabel();
      case SiriusTextDslPackage.EDGE_STYLE__SOURCE_ARROW:
        return getSourceArrow();
      case SiriusTextDslPackage.EDGE_STYLE__TARGET_ARROW:
        return getTargetArrow();
      case SiriusTextDslPackage.EDGE_STYLE__SIZE_COMPUTATION_EXPRESSION:
        return getSizeComputationExpression();
      case SiriusTextDslPackage.EDGE_STYLE__FOLDING_STYLE:
        return getFoldingStyle();
      case SiriusTextDslPackage.EDGE_STYLE__ENDS_CENTERING:
        return getEndsCentering();
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
      case SiriusTextDslPackage.EDGE_STYLE__NAME:
        setName((String)newValue);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__STROKE_COLOR:
        setStrokeColor((Color)newValue);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__LINE_STYLE:
        setLineStyle((LineStyle)newValue);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__ROUTING_STYLE:
        setRoutingStyle((RoutingStyle)newValue);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__LABEL:
        setLabel((EdgeLabel)newValue);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__SOURCE_ARROW:
        setSourceArrow((ArrowDecorator)newValue);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__TARGET_ARROW:
        setTargetArrow((ArrowDecorator)newValue);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__SIZE_COMPUTATION_EXPRESSION:
        setSizeComputationExpression((String)newValue);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__FOLDING_STYLE:
        setFoldingStyle((FoldingStyle)newValue);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__ENDS_CENTERING:
        setEndsCentering((EndsCentering)newValue);
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
      case SiriusTextDslPackage.EDGE_STYLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__STROKE_COLOR:
        setStrokeColor((Color)null);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__LINE_STYLE:
        setLineStyle(LINE_STYLE_EDEFAULT);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__ROUTING_STYLE:
        setRoutingStyle(ROUTING_STYLE_EDEFAULT);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__LABEL:
        setLabel((EdgeLabel)null);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__SOURCE_ARROW:
        setSourceArrow(SOURCE_ARROW_EDEFAULT);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__TARGET_ARROW:
        setTargetArrow(TARGET_ARROW_EDEFAULT);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__SIZE_COMPUTATION_EXPRESSION:
        setSizeComputationExpression(SIZE_COMPUTATION_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__FOLDING_STYLE:
        setFoldingStyle(FOLDING_STYLE_EDEFAULT);
        return;
      case SiriusTextDslPackage.EDGE_STYLE__ENDS_CENTERING:
        setEndsCentering(ENDS_CENTERING_EDEFAULT);
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
      case SiriusTextDslPackage.EDGE_STYLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SiriusTextDslPackage.EDGE_STYLE__STROKE_COLOR:
        return strokeColor != null;
      case SiriusTextDslPackage.EDGE_STYLE__LINE_STYLE:
        return lineStyle != LINE_STYLE_EDEFAULT;
      case SiriusTextDslPackage.EDGE_STYLE__ROUTING_STYLE:
        return routingStyle != ROUTING_STYLE_EDEFAULT;
      case SiriusTextDslPackage.EDGE_STYLE__LABEL:
        return label != null;
      case SiriusTextDslPackage.EDGE_STYLE__SOURCE_ARROW:
        return sourceArrow != SOURCE_ARROW_EDEFAULT;
      case SiriusTextDslPackage.EDGE_STYLE__TARGET_ARROW:
        return targetArrow != TARGET_ARROW_EDEFAULT;
      case SiriusTextDslPackage.EDGE_STYLE__SIZE_COMPUTATION_EXPRESSION:
        return SIZE_COMPUTATION_EXPRESSION_EDEFAULT == null ? sizeComputationExpression != null : !SIZE_COMPUTATION_EXPRESSION_EDEFAULT.equals(sizeComputationExpression);
      case SiriusTextDslPackage.EDGE_STYLE__FOLDING_STYLE:
        return foldingStyle != FOLDING_STYLE_EDEFAULT;
      case SiriusTextDslPackage.EDGE_STYLE__ENDS_CENTERING:
        return endsCentering != ENDS_CENTERING_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", lineStyle: ");
    result.append(lineStyle);
    result.append(", routingStyle: ");
    result.append(routingStyle);
    result.append(", sourceArrow: ");
    result.append(sourceArrow);
    result.append(", targetArrow: ");
    result.append(targetArrow);
    result.append(", sizeComputationExpression: ");
    result.append(sizeComputationExpression);
    result.append(", foldingStyle: ");
    result.append(foldingStyle);
    result.append(", endsCentering: ");
    result.append(endsCentering);
    result.append(')');
    return result.toString();
  }

} //EdgeStyleImpl
