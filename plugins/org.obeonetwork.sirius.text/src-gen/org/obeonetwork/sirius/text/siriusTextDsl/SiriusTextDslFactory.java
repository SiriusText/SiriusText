/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage
 * @generated
 */
public interface SiriusTextDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SiriusTextDslFactory eINSTANCE = org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Sirius File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sirius File</em>'.
   * @generated
   */
  SiriusFile createSiriusFile();

  /**
   * Returns a new object of class '<em>Sirius File Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sirius File Body</em>'.
   * @generated
   */
  SiriusFileBody createSiriusFileBody();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Designer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Designer</em>'.
   * @generated
   */
  Designer createDesigner();

  /**
   * Returns a new object of class '<em>Viewpoint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Viewpoint</em>'.
   * @generated
   */
  Viewpoint createViewpoint();

  /**
   * Returns a new object of class '<em>Representation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Representation</em>'.
   * @generated
   */
  Representation createRepresentation();

  /**
   * Returns a new object of class '<em>Diagram</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diagram</em>'.
   * @generated
   */
  Diagram createDiagram();

  /**
   * Returns a new object of class '<em>Layer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Layer</em>'.
   * @generated
   */
  Layer createLayer();

  /**
   * Returns a new object of class '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping</em>'.
   * @generated
   */
  Mapping createMapping();

  /**
   * Returns a new object of class '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container</em>'.
   * @generated
   */
  Container createContainer();

  /**
   * Returns a new object of class '<em>Conditional Container Style Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Container Style Declaration</em>'.
   * @generated
   */
  ConditionalContainerStyleDeclaration createConditionalContainerStyleDeclaration();

  /**
   * Returns a new object of class '<em>Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style</em>'.
   * @generated
   */
  Style createStyle();

  /**
   * Returns a new object of class '<em>Container Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Style</em>'.
   * @generated
   */
  ContainerStyle createContainerStyle();

  /**
   * Returns a new object of class '<em>Gradient</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gradient</em>'.
   * @generated
   */
  Gradient createGradient();

  /**
   * Returns a new object of class '<em>Palette</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Palette</em>'.
   * @generated
   */
  Palette createPalette();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns a new object of class '<em>Color Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Value</em>'.
   * @generated
   */
  ColorValue createColorValue();

  /**
   * Returns a new object of class '<em>RGB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RGB</em>'.
   * @generated
   */
  RGB createRGB();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SiriusTextDslPackage getSiriusTextDslPackage();

} //SiriusTextDslFactory
