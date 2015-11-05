/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#isShowIcon <em>Show Icon</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getIconPath <em>Icon Path</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getFormatOptions <em>Format Options</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getSize <em>Size</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeLabel()
 * @model
 * @generated
 */
public interface EdgeLabel extends EObject
{
  /**
   * Returns the value of the '<em><b>Show Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Show Icon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show Icon</em>' attribute.
   * @see #setShowIcon(boolean)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeLabel_ShowIcon()
   * @model
   * @generated
   */
  boolean isShowIcon();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#isShowIcon <em>Show Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Show Icon</em>' attribute.
   * @see #isShowIcon()
   * @generated
   */
  void setShowIcon(boolean value);

  /**
   * Returns the value of the '<em><b>Icon Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icon Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icon Path</em>' attribute.
   * @see #setIconPath(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeLabel_IconPath()
   * @model
   * @generated
   */
  String getIconPath();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getIconPath <em>Icon Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon Path</em>' attribute.
   * @see #getIconPath()
   * @generated
   */
  void setIconPath(String value);

  /**
   * Returns the value of the '<em><b>Format Options</b></em>' attribute list.
   * The list contents are of type {@link org.obeonetwork.sirius.text.siriusTextDsl.LabelFormatOption}.
   * The literals are from the enumeration {@link org.obeonetwork.sirius.text.siriusTextDsl.LabelFormatOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format Options</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format Options</em>' attribute list.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LabelFormatOption
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeLabel_FormatOptions()
   * @model unique="false"
   * @generated
   */
  EList<LabelFormatOption> getFormatOptions();

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(int)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeLabel_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' attribute.
   * @see #setExpression(String)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeLabel_Expression()
   * @model
   * @generated
   */
  String getExpression();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getExpression <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' attribute.
   * @see #getExpression()
   * @generated
   */
  void setExpression(String value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' reference.
   * @see #setColor(Color)
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getEdgeLabel_Color()
   * @model
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getColor <em>Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

} // EdgeLabel
