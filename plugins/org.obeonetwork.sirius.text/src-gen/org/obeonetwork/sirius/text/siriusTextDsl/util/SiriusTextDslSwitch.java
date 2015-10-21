/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.obeonetwork.sirius.text.siriusTextDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage
 * @generated
 */
public class SiriusTextDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SiriusTextDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiriusTextDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SiriusTextDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SiriusTextDslPackage.SIRIUS_FILE:
      {
        SiriusFile siriusFile = (SiriusFile)theEObject;
        T result = caseSiriusFile(siriusFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.SIRIUS_FILE_BODY:
      {
        SiriusFileBody siriusFileBody = (SiriusFileBody)theEObject;
        T result = caseSiriusFileBody(siriusFileBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.DESIGNER:
      {
        Designer designer = (Designer)theEObject;
        T result = caseDesigner(designer);
        if (result == null) result = caseSiriusFileBody(designer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.VIEWPOINT:
      {
        Viewpoint viewpoint = (Viewpoint)theEObject;
        T result = caseViewpoint(viewpoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.REPRESENTATION:
      {
        Representation representation = (Representation)theEObject;
        T result = caseRepresentation(representation);
        if (result == null) result = caseSiriusFileBody(representation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.DIAGRAM:
      {
        Diagram diagram = (Diagram)theEObject;
        T result = caseDiagram(diagram);
        if (result == null) result = caseRepresentation(diagram);
        if (result == null) result = caseSiriusFileBody(diagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.LAYER:
      {
        Layer layer = (Layer)theEObject;
        T result = caseLayer(layer);
        if (result == null) result = caseSiriusFileBody(layer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.MAPPING:
      {
        Mapping mapping = (Mapping)theEObject;
        T result = caseMapping(mapping);
        if (result == null) result = caseSiriusFileBody(mapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.CONTAINER:
      {
        Container container = (Container)theEObject;
        T result = caseContainer(container);
        if (result == null) result = caseMapping(container);
        if (result == null) result = caseSiriusFileBody(container);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION:
      {
        ConditionalContainerStyleDeclaration conditionalContainerStyleDeclaration = (ConditionalContainerStyleDeclaration)theEObject;
        T result = caseConditionalContainerStyleDeclaration(conditionalContainerStyleDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.STYLE:
      {
        Style style = (Style)theEObject;
        T result = caseStyle(style);
        if (result == null) result = caseSiriusFileBody(style);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.CONTAINER_STYLE:
      {
        ContainerStyle containerStyle = (ContainerStyle)theEObject;
        T result = caseContainerStyle(containerStyle);
        if (result == null) result = caseStyle(containerStyle);
        if (result == null) result = caseSiriusFileBody(containerStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.GRADIENT:
      {
        Gradient gradient = (Gradient)theEObject;
        T result = caseGradient(gradient);
        if (result == null) result = caseContainerStyle(gradient);
        if (result == null) result = caseStyle(gradient);
        if (result == null) result = caseSiriusFileBody(gradient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.PALETTE:
      {
        Palette palette = (Palette)theEObject;
        T result = casePalette(palette);
        if (result == null) result = caseSiriusFileBody(palette);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SiriusTextDslPackage.COLOR:
      {
        Color color = (Color)theEObject;
        T result = caseColor(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sirius File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sirius File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSiriusFile(SiriusFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sirius File Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sirius File Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSiriusFileBody(SiriusFileBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Designer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Designer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesigner(Designer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewpoint(Viewpoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Representation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Representation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepresentation(Representation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiagram(Diagram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayer(Layer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapping(Mapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainer(Container object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Container Style Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Container Style Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalContainerStyleDeclaration(ConditionalContainerStyleDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyle(Style object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainerStyle(ContainerStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gradient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gradient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGradient(Gradient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Palette</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Palette</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePalette(Palette object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColor(Color object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SiriusTextDslSwitch
