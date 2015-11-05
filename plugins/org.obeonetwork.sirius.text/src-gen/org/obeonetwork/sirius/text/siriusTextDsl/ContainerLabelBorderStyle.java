/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Container Label Border Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerLabelBorderStyle()
 * @model
 * @generated
 */
public enum ContainerLabelBorderStyle implements Enumerator
{
  /**
   * The '<em><b>Label Border Style With Beveled Corner</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LABEL_BORDER_STYLE_WITH_BEVELED_CORNER_VALUE
   * @generated
   * @ordered
   */
  LABEL_BORDER_STYLE_WITH_BEVELED_CORNER(0, "labelBorderStyleWithBeveledCorner", "labelBorderStyleWithBeveledCorner"),

  /**
   * The '<em><b>Label Border For Container</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LABEL_BORDER_FOR_CONTAINER_VALUE
   * @generated
   * @ordered
   */
  LABEL_BORDER_FOR_CONTAINER(1, "labelBorderForContainer", "labelBorderForContainer"),

  /**
   * The '<em><b>No Label Border For List</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NO_LABEL_BORDER_FOR_LIST_VALUE
   * @generated
   * @ordered
   */
  NO_LABEL_BORDER_FOR_LIST(2, "noLabelBorderForList", "noLabelBorderForList");

  /**
   * The '<em><b>Label Border Style With Beveled Corner</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Label Border Style With Beveled Corner</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LABEL_BORDER_STYLE_WITH_BEVELED_CORNER
   * @model name="labelBorderStyleWithBeveledCorner"
   * @generated
   * @ordered
   */
  public static final int LABEL_BORDER_STYLE_WITH_BEVELED_CORNER_VALUE = 0;

  /**
   * The '<em><b>Label Border For Container</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Label Border For Container</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LABEL_BORDER_FOR_CONTAINER
   * @model name="labelBorderForContainer"
   * @generated
   * @ordered
   */
  public static final int LABEL_BORDER_FOR_CONTAINER_VALUE = 1;

  /**
   * The '<em><b>No Label Border For List</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>No Label Border For List</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NO_LABEL_BORDER_FOR_LIST
   * @model name="noLabelBorderForList"
   * @generated
   * @ordered
   */
  public static final int NO_LABEL_BORDER_FOR_LIST_VALUE = 2;

  /**
   * An array of all the '<em><b>Container Label Border Style</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ContainerLabelBorderStyle[] VALUES_ARRAY =
    new ContainerLabelBorderStyle[]
    {
      LABEL_BORDER_STYLE_WITH_BEVELED_CORNER,
      LABEL_BORDER_FOR_CONTAINER,
      NO_LABEL_BORDER_FOR_LIST,
    };

  /**
   * A public read-only list of all the '<em><b>Container Label Border Style</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ContainerLabelBorderStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Container Label Border Style</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ContainerLabelBorderStyle get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ContainerLabelBorderStyle result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Container Label Border Style</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ContainerLabelBorderStyle getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ContainerLabelBorderStyle result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Container Label Border Style</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ContainerLabelBorderStyle get(int value)
  {
    switch (value)
    {
      case LABEL_BORDER_STYLE_WITH_BEVELED_CORNER_VALUE: return LABEL_BORDER_STYLE_WITH_BEVELED_CORNER;
      case LABEL_BORDER_FOR_CONTAINER_VALUE: return LABEL_BORDER_FOR_CONTAINER;
      case NO_LABEL_BORDER_FOR_LIST_VALUE: return NO_LABEL_BORDER_FOR_LIST;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ContainerLabelBorderStyle(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ContainerLabelBorderStyle
