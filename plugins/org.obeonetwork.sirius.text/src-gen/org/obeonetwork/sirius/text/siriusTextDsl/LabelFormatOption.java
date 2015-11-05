/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Label Format Option</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getLabelFormatOption()
 * @model
 * @generated
 */
public enum LabelFormatOption implements Enumerator
{
  /**
   * The '<em><b>Bold</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOLD_VALUE
   * @generated
   * @ordered
   */
  BOLD(0, "bold", "bold"),

  /**
   * The '<em><b>Italic</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ITALIC_VALUE
   * @generated
   * @ordered
   */
  ITALIC(1, "italic", "italic"),

  /**
   * The '<em><b>Underline</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDERLINE_VALUE
   * @generated
   * @ordered
   */
  UNDERLINE(2, "underline", "underline"),

  /**
   * The '<em><b>Strikethrought</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRIKETHROUGHT_VALUE
   * @generated
   * @ordered
   */
  STRIKETHROUGHT(3, "strikethrought", "strikethrought");

  /**
   * The '<em><b>Bold</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bold</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOLD
   * @model name="bold"
   * @generated
   * @ordered
   */
  public static final int BOLD_VALUE = 0;

  /**
   * The '<em><b>Italic</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Italic</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ITALIC
   * @model name="italic"
   * @generated
   * @ordered
   */
  public static final int ITALIC_VALUE = 1;

  /**
   * The '<em><b>Underline</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Underline</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNDERLINE
   * @model name="underline"
   * @generated
   * @ordered
   */
  public static final int UNDERLINE_VALUE = 2;

  /**
   * The '<em><b>Strikethrought</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Strikethrought</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRIKETHROUGHT
   * @model name="strikethrought"
   * @generated
   * @ordered
   */
  public static final int STRIKETHROUGHT_VALUE = 3;

  /**
   * An array of all the '<em><b>Label Format Option</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LabelFormatOption[] VALUES_ARRAY =
    new LabelFormatOption[]
    {
      BOLD,
      ITALIC,
      UNDERLINE,
      STRIKETHROUGHT,
    };

  /**
   * A public read-only list of all the '<em><b>Label Format Option</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LabelFormatOption> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Label Format Option</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LabelFormatOption get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LabelFormatOption result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Label Format Option</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LabelFormatOption getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LabelFormatOption result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Label Format Option</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LabelFormatOption get(int value)
  {
    switch (value)
    {
      case BOLD_VALUE: return BOLD;
      case ITALIC_VALUE: return ITALIC;
      case UNDERLINE_VALUE: return UNDERLINE;
      case STRIKETHROUGHT_VALUE: return STRIKETHROUGHT;
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
  private LabelFormatOption(int value, String name, String literal)
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
  
} //LabelFormatOption
