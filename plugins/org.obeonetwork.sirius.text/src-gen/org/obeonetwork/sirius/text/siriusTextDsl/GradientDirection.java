/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gradient Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getGradientDirection()
 * @model
 * @generated
 */
public enum GradientDirection implements Enumerator
{
  /**
   * The '<em><b>Oblique</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OBLIQUE_VALUE
   * @generated
   * @ordered
   */
  OBLIQUE(0, "oblique", "oblique"),

  /**
   * The '<em><b>Lefttoright</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEFTTORIGHT_VALUE
   * @generated
   * @ordered
   */
  LEFTTORIGHT(1, "lefttoright", "lefttoright"),

  /**
   * The '<em><b>Toptobottom</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOPTOBOTTOM_VALUE
   * @generated
   * @ordered
   */
  TOPTOBOTTOM(2, "toptobottom", "toptobottom");

  /**
   * The '<em><b>Oblique</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Oblique</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OBLIQUE
   * @model name="oblique"
   * @generated
   * @ordered
   */
  public static final int OBLIQUE_VALUE = 0;

  /**
   * The '<em><b>Lefttoright</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lefttoright</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LEFTTORIGHT
   * @model name="lefttoright"
   * @generated
   * @ordered
   */
  public static final int LEFTTORIGHT_VALUE = 1;

  /**
   * The '<em><b>Toptobottom</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Toptobottom</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOPTOBOTTOM
   * @model name="toptobottom"
   * @generated
   * @ordered
   */
  public static final int TOPTOBOTTOM_VALUE = 2;

  /**
   * An array of all the '<em><b>Gradient Direction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final GradientDirection[] VALUES_ARRAY =
    new GradientDirection[]
    {
      OBLIQUE,
      LEFTTORIGHT,
      TOPTOBOTTOM,
    };

  /**
   * A public read-only list of all the '<em><b>Gradient Direction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<GradientDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Gradient Direction</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static GradientDirection get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GradientDirection result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Gradient Direction</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static GradientDirection getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GradientDirection result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Gradient Direction</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static GradientDirection get(int value)
  {
    switch (value)
    {
      case OBLIQUE_VALUE: return OBLIQUE;
      case LEFTTORIGHT_VALUE: return LEFTTORIGHT;
      case TOPTOBOTTOM_VALUE: return TOPTOBOTTOM;
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
  private GradientDirection(int value, String name, String literal)
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
  
} //GradientDirection
