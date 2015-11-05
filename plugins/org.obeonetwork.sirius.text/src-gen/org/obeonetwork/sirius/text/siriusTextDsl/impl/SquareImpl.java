/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.sirius.text.siriusTextDsl.Border;
import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.Label;
import org.obeonetwork.sirius.text.siriusTextDsl.NodeLabelBorderStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;
import org.obeonetwork.sirius.text.siriusTextDsl.Square;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl#isAllowVerticalResizing <em>Allow Vertical Resizing</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl#isAllowHorizontalResizing <em>Allow Horizontal Resizing</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl#getLabelBorderStyle <em>Label Border Style</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl#getSizeComputationExpression <em>Size Computation Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl#getTooltipExpression <em>Tooltip Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquareImpl extends NodeStyleImpl implements Square
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
   * The default value of the '{@link #isAllowVerticalResizing() <em>Allow Vertical Resizing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllowVerticalResizing()
   * @generated
   * @ordered
   */
  protected static final boolean ALLOW_VERTICAL_RESIZING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAllowVerticalResizing() <em>Allow Vertical Resizing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllowVerticalResizing()
   * @generated
   * @ordered
   */
  protected boolean allowVerticalResizing = ALLOW_VERTICAL_RESIZING_EDEFAULT;

  /**
   * The default value of the '{@link #isAllowHorizontalResizing() <em>Allow Horizontal Resizing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllowHorizontalResizing()
   * @generated
   * @ordered
   */
  protected static final boolean ALLOW_HORIZONTAL_RESIZING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAllowHorizontalResizing() <em>Allow Horizontal Resizing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllowHorizontalResizing()
   * @generated
   * @ordered
   */
  protected boolean allowHorizontalResizing = ALLOW_HORIZONTAL_RESIZING_EDEFAULT;

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
   * The cached value of the '{@link #getColor() <em>Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected Label label;

  /**
   * The default value of the '{@link #getLabelBorderStyle() <em>Label Border Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelBorderStyle()
   * @generated
   * @ordered
   */
  protected static final NodeLabelBorderStyle LABEL_BORDER_STYLE_EDEFAULT = NodeLabelBorderStyle.NODE;

  /**
   * The cached value of the '{@link #getLabelBorderStyle() <em>Label Border Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelBorderStyle()
   * @generated
   * @ordered
   */
  protected NodeLabelBorderStyle labelBorderStyle = LABEL_BORDER_STYLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBorder() <em>Border</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorder()
   * @generated
   * @ordered
   */
  protected Border border;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final int HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected int height = HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected int width = WIDTH_EDEFAULT;

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
   * The default value of the '{@link #getTooltipExpression() <em>Tooltip Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooltipExpression()
   * @generated
   * @ordered
   */
  protected static final String TOOLTIP_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTooltipExpression() <em>Tooltip Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooltipExpression()
   * @generated
   * @ordered
   */
  protected String tooltipExpression = TOOLTIP_EXPRESSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SquareImpl()
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
    return SiriusTextDslPackage.Literals.SQUARE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAllowVerticalResizing()
  {
    return allowVerticalResizing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllowVerticalResizing(boolean newAllowVerticalResizing)
  {
    boolean oldAllowVerticalResizing = allowVerticalResizing;
    allowVerticalResizing = newAllowVerticalResizing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__ALLOW_VERTICAL_RESIZING, oldAllowVerticalResizing, allowVerticalResizing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAllowHorizontalResizing()
  {
    return allowHorizontalResizing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllowHorizontalResizing(boolean newAllowHorizontalResizing)
  {
    boolean oldAllowHorizontalResizing = allowHorizontalResizing;
    allowHorizontalResizing = newAllowHorizontalResizing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__ALLOW_HORIZONTAL_RESIZING, oldAllowHorizontalResizing, allowHorizontalResizing));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColor()
  {
    if (color != null && color.eIsProxy())
    {
      InternalEObject oldColor = (InternalEObject)color;
      color = (Color)eResolveProxy(oldColor);
      if (color != oldColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusTextDslPackage.SQUARE__COLOR, oldColor, color));
      }
    }
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(Color newColor)
  {
    Color oldColor = color;
    color = newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__COLOR, oldColor, color));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs)
  {
    Label oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(Label newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiriusTextDslPackage.SQUARE__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiriusTextDslPackage.SQUARE__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeLabelBorderStyle getLabelBorderStyle()
  {
    return labelBorderStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelBorderStyle(NodeLabelBorderStyle newLabelBorderStyle)
  {
    NodeLabelBorderStyle oldLabelBorderStyle = labelBorderStyle;
    labelBorderStyle = newLabelBorderStyle == null ? LABEL_BORDER_STYLE_EDEFAULT : newLabelBorderStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__LABEL_BORDER_STYLE, oldLabelBorderStyle, labelBorderStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Border getBorder()
  {
    return border;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBorder(Border newBorder, NotificationChain msgs)
  {
    Border oldBorder = border;
    border = newBorder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__BORDER, oldBorder, newBorder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorder(Border newBorder)
  {
    if (newBorder != border)
    {
      NotificationChain msgs = null;
      if (border != null)
        msgs = ((InternalEObject)border).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiriusTextDslPackage.SQUARE__BORDER, null, msgs);
      if (newBorder != null)
        msgs = ((InternalEObject)newBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiriusTextDslPackage.SQUARE__BORDER, null, msgs);
      msgs = basicSetBorder(newBorder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__BORDER, newBorder, newBorder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(int newHeight)
  {
    int oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(int newWidth)
  {
    int oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__WIDTH, oldWidth, width));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__SIZE_COMPUTATION_EXPRESSION, oldSizeComputationExpression, sizeComputationExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTooltipExpression()
  {
    return tooltipExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTooltipExpression(String newTooltipExpression)
  {
    String oldTooltipExpression = tooltipExpression;
    tooltipExpression = newTooltipExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiriusTextDslPackage.SQUARE__TOOLTIP_EXPRESSION, oldTooltipExpression, tooltipExpression));
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
      case SiriusTextDslPackage.SQUARE__LABEL:
        return basicSetLabel(null, msgs);
      case SiriusTextDslPackage.SQUARE__BORDER:
        return basicSetBorder(null, msgs);
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
      case SiriusTextDslPackage.SQUARE__DOCUMENTATION:
        return getDocumentation();
      case SiriusTextDslPackage.SQUARE__ALLOW_VERTICAL_RESIZING:
        return isAllowVerticalResizing();
      case SiriusTextDslPackage.SQUARE__ALLOW_HORIZONTAL_RESIZING:
        return isAllowHorizontalResizing();
      case SiriusTextDslPackage.SQUARE__NAME:
        return getName();
      case SiriusTextDslPackage.SQUARE__COLOR:
        if (resolve) return getColor();
        return basicGetColor();
      case SiriusTextDslPackage.SQUARE__LABEL:
        return getLabel();
      case SiriusTextDslPackage.SQUARE__LABEL_BORDER_STYLE:
        return getLabelBorderStyle();
      case SiriusTextDslPackage.SQUARE__BORDER:
        return getBorder();
      case SiriusTextDslPackage.SQUARE__HEIGHT:
        return getHeight();
      case SiriusTextDslPackage.SQUARE__WIDTH:
        return getWidth();
      case SiriusTextDslPackage.SQUARE__SIZE_COMPUTATION_EXPRESSION:
        return getSizeComputationExpression();
      case SiriusTextDslPackage.SQUARE__TOOLTIP_EXPRESSION:
        return getTooltipExpression();
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
      case SiriusTextDslPackage.SQUARE__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SiriusTextDslPackage.SQUARE__ALLOW_VERTICAL_RESIZING:
        setAllowVerticalResizing((Boolean)newValue);
        return;
      case SiriusTextDslPackage.SQUARE__ALLOW_HORIZONTAL_RESIZING:
        setAllowHorizontalResizing((Boolean)newValue);
        return;
      case SiriusTextDslPackage.SQUARE__NAME:
        setName((String)newValue);
        return;
      case SiriusTextDslPackage.SQUARE__COLOR:
        setColor((Color)newValue);
        return;
      case SiriusTextDslPackage.SQUARE__LABEL:
        setLabel((Label)newValue);
        return;
      case SiriusTextDslPackage.SQUARE__LABEL_BORDER_STYLE:
        setLabelBorderStyle((NodeLabelBorderStyle)newValue);
        return;
      case SiriusTextDslPackage.SQUARE__BORDER:
        setBorder((Border)newValue);
        return;
      case SiriusTextDslPackage.SQUARE__HEIGHT:
        setHeight((Integer)newValue);
        return;
      case SiriusTextDslPackage.SQUARE__WIDTH:
        setWidth((Integer)newValue);
        return;
      case SiriusTextDslPackage.SQUARE__SIZE_COMPUTATION_EXPRESSION:
        setSizeComputationExpression((String)newValue);
        return;
      case SiriusTextDslPackage.SQUARE__TOOLTIP_EXPRESSION:
        setTooltipExpression((String)newValue);
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
      case SiriusTextDslPackage.SQUARE__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SiriusTextDslPackage.SQUARE__ALLOW_VERTICAL_RESIZING:
        setAllowVerticalResizing(ALLOW_VERTICAL_RESIZING_EDEFAULT);
        return;
      case SiriusTextDslPackage.SQUARE__ALLOW_HORIZONTAL_RESIZING:
        setAllowHorizontalResizing(ALLOW_HORIZONTAL_RESIZING_EDEFAULT);
        return;
      case SiriusTextDslPackage.SQUARE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SiriusTextDslPackage.SQUARE__COLOR:
        setColor((Color)null);
        return;
      case SiriusTextDslPackage.SQUARE__LABEL:
        setLabel((Label)null);
        return;
      case SiriusTextDslPackage.SQUARE__LABEL_BORDER_STYLE:
        setLabelBorderStyle(LABEL_BORDER_STYLE_EDEFAULT);
        return;
      case SiriusTextDslPackage.SQUARE__BORDER:
        setBorder((Border)null);
        return;
      case SiriusTextDslPackage.SQUARE__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case SiriusTextDslPackage.SQUARE__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case SiriusTextDslPackage.SQUARE__SIZE_COMPUTATION_EXPRESSION:
        setSizeComputationExpression(SIZE_COMPUTATION_EXPRESSION_EDEFAULT);
        return;
      case SiriusTextDslPackage.SQUARE__TOOLTIP_EXPRESSION:
        setTooltipExpression(TOOLTIP_EXPRESSION_EDEFAULT);
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
      case SiriusTextDslPackage.SQUARE__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SiriusTextDslPackage.SQUARE__ALLOW_VERTICAL_RESIZING:
        return allowVerticalResizing != ALLOW_VERTICAL_RESIZING_EDEFAULT;
      case SiriusTextDslPackage.SQUARE__ALLOW_HORIZONTAL_RESIZING:
        return allowHorizontalResizing != ALLOW_HORIZONTAL_RESIZING_EDEFAULT;
      case SiriusTextDslPackage.SQUARE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SiriusTextDslPackage.SQUARE__COLOR:
        return color != null;
      case SiriusTextDslPackage.SQUARE__LABEL:
        return label != null;
      case SiriusTextDslPackage.SQUARE__LABEL_BORDER_STYLE:
        return labelBorderStyle != LABEL_BORDER_STYLE_EDEFAULT;
      case SiriusTextDslPackage.SQUARE__BORDER:
        return border != null;
      case SiriusTextDslPackage.SQUARE__HEIGHT:
        return height != HEIGHT_EDEFAULT;
      case SiriusTextDslPackage.SQUARE__WIDTH:
        return width != WIDTH_EDEFAULT;
      case SiriusTextDslPackage.SQUARE__SIZE_COMPUTATION_EXPRESSION:
        return SIZE_COMPUTATION_EXPRESSION_EDEFAULT == null ? sizeComputationExpression != null : !SIZE_COMPUTATION_EXPRESSION_EDEFAULT.equals(sizeComputationExpression);
      case SiriusTextDslPackage.SQUARE__TOOLTIP_EXPRESSION:
        return TOOLTIP_EXPRESSION_EDEFAULT == null ? tooltipExpression != null : !TOOLTIP_EXPRESSION_EDEFAULT.equals(tooltipExpression);
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
    result.append(", allowVerticalResizing: ");
    result.append(allowVerticalResizing);
    result.append(", allowHorizontalResizing: ");
    result.append(allowHorizontalResizing);
    result.append(", name: ");
    result.append(name);
    result.append(", labelBorderStyle: ");
    result.append(labelBorderStyle);
    result.append(", height: ");
    result.append(height);
    result.append(", width: ");
    result.append(width);
    result.append(", sizeComputationExpression: ");
    result.append(sizeComputationExpression);
    result.append(", tooltipExpression: ");
    result.append(tooltipExpression);
    result.append(')');
    return result.toString();
  }

} //SquareImpl
