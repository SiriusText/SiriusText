/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Container Children Presentation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#getContainerChildrenPresentation()
 * @model
 * @generated
 */
public enum ContainerChildrenPresentation implements Enumerator
{
  /**
   * The '<em><b>Free Form</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FREE_FORM_VALUE
   * @generated
   * @ordered
   */
  FREE_FORM(0, "freeForm", "freeForm"),

  /**
   * The '<em><b>List</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIST_VALUE
   * @generated
   * @ordered
   */
  LIST(1, "list", "list"),

  /**
   * The '<em><b>Horizontal Stack</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HORIZONTAL_STACK_VALUE
   * @generated
   * @ordered
   */
  HORIZONTAL_STACK(2, "horizontalStack", "horizontalStack"),

  /**
   * The '<em><b>Vertical Stack</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERTICAL_STACK_VALUE
   * @generated
   * @ordered
   */
  VERTICAL_STACK(3, "verticalStack", "verticalStack");

  /**
   * The '<em><b>Free Form</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Free Form</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FREE_FORM
   * @model name="freeForm"
   * @generated
   * @ordered
   */
  public static final int FREE_FORM_VALUE = 0;

  /**
   * The '<em><b>List</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>List</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LIST
   * @model name="list"
   * @generated
   * @ordered
   */
  public static final int LIST_VALUE = 1;

  /**
   * The '<em><b>Horizontal Stack</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Horizontal Stack</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HORIZONTAL_STACK
   * @model name="horizontalStack"
   * @generated
   * @ordered
   */
  public static final int HORIZONTAL_STACK_VALUE = 2;

  /**
   * The '<em><b>Vertical Stack</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Vertical Stack</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERTICAL_STACK
   * @model name="verticalStack"
   * @generated
   * @ordered
   */
  public static final int VERTICAL_STACK_VALUE = 3;

  /**
   * An array of all the '<em><b>Container Children Presentation</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ContainerChildrenPresentation[] VALUES_ARRAY =
    new ContainerChildrenPresentation[]
    {
      FREE_FORM,
      LIST,
      HORIZONTAL_STACK,
      VERTICAL_STACK,
    };

  /**
   * A public read-only list of all the '<em><b>Container Children Presentation</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ContainerChildrenPresentation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Container Children Presentation</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ContainerChildrenPresentation get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ContainerChildrenPresentation result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Container Children Presentation</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ContainerChildrenPresentation getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ContainerChildrenPresentation result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Container Children Presentation</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ContainerChildrenPresentation get(int value)
  {
    switch (value)
    {
      case FREE_FORM_VALUE: return FREE_FORM;
      case LIST_VALUE: return LIST;
      case HORIZONTAL_STACK_VALUE: return HORIZONTAL_STACK;
      case VERTICAL_STACK_VALUE: return VERTICAL_STACK;
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
  private ContainerChildrenPresentation(int value, String name, String literal)
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
  
} //ContainerChildrenPresentation
