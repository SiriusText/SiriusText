/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslFactory
 * @model kind="package"
 * @generated
 */
public interface SiriusTextDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "siriusTextDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.obeonetwork.org/sirius/text/SiriusTextDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "siriusTextDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SiriusTextDslPackage eINSTANCE = org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusFileImpl <em>Sirius File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusFileImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getSiriusFile()
   * @generated
   */
  int SIRIUS_FILE = 0;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIRIUS_FILE__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIRIUS_FILE__NAME = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIRIUS_FILE__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIRIUS_FILE__BODY = 3;

  /**
   * The number of structural features of the '<em>Sirius File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIRIUS_FILE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusFileBodyImpl <em>Sirius File Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusFileBodyImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getSiriusFileBody()
   * @generated
   */
  int SIRIUS_FILE_BODY = 1;

  /**
   * The number of structural features of the '<em>Sirius File Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIRIUS_FILE_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ImportImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DesignerImpl <em>Designer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.DesignerImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getDesigner()
   * @generated
   */
  int DESIGNER = 3;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNER__DOCUMENTATION = SIRIUS_FILE_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNER__NAME = SIRIUS_FILE_BODY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNER__LABEL = SIRIUS_FILE_BODY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Viewpoints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNER__VIEWPOINTS = SIRIUS_FILE_BODY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Designer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNER_FEATURE_COUNT = SIRIUS_FILE_BODY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ViewpointImpl <em>Viewpoint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ViewpointImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getViewpoint()
   * @generated
   */
  int VIEWPOINT = 4;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__NAME = 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__LABEL = 2;

  /**
   * The feature id for the '<em><b>Model File Extensions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__MODEL_FILE_EXTENSIONS = 3;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__ICON = 4;

  /**
   * The feature id for the '<em><b>Representations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__REPRESENTATIONS = 5;

  /**
   * The number of structural features of the '<em>Viewpoint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RepresentationImpl <em>Representation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.RepresentationImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getRepresentation()
   * @generated
   */
  int REPRESENTATION = 5;

  /**
   * The number of structural features of the '<em>Representation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPRESENTATION_FEATURE_COUNT = SIRIUS_FILE_BODY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl <em>Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getDiagram()
   * @generated
   */
  int DIAGRAM = 6;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__DOCUMENTATION = REPRESENTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initialized</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__INITIALIZED = REPRESENTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Show On Startup</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__SHOW_ON_STARTUP = REPRESENTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enable Popup Bars</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__ENABLE_POPUP_BARS = REPRESENTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Metamodel Uris</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__METAMODEL_URIS = REPRESENTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__NAME = REPRESENTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__LABEL = REPRESENTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Domain Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__DOMAIN_CLASS = REPRESENTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__PRECONDITION = REPRESENTATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>End User Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__END_USER_DOCUMENTATION = REPRESENTATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Title Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__TITLE_EXPRESSION = REPRESENTATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Root Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__ROOT_EXPRESSION = REPRESENTATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Default Layer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__DEFAULT_LAYER = REPRESENTATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Additional Layers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__ADDITIONAL_LAYERS = REPRESENTATION_FEATURE_COUNT + 13;

  /**
   * The number of structural features of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_FEATURE_COUNT = REPRESENTATION_FEATURE_COUNT + 14;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl <em>Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getLayer()
   * @generated
   */
  int LAYER = 7;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__DOCUMENTATION = SIRIUS_FILE_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__NAME = SIRIUS_FILE_BODY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__ICON = SIRIUS_FILE_BODY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__MAPPINGS = SIRIUS_FILE_BODY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Edges</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__EDGES = SIRIUS_FILE_BODY_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_FEATURE_COUNT = SIRIUS_FILE_BODY_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 8;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = SIRIUS_FILE_BODY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getContainer()
   * @generated
   */
  int CONTAINER = 9;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DOCUMENTATION = MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__LIST = MAPPING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__NAME = MAPPING_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__LABEL = MAPPING_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Domain Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DOMAIN_CLASS = MAPPING_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__STYLE = MAPPING_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__PRECONDITION = MAPPING_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Semantic Canditates Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__SEMANTIC_CANDITATES_EXPRESSION = MAPPING_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CONDITIONAL_STYLES = MAPPING_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ConditionalContainerStyleDeclarationImpl <em>Conditional Container Style Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ConditionalContainerStyleDeclarationImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getConditionalContainerStyleDeclaration()
   * @generated
   */
  int CONDITIONAL_CONTAINER_STYLE_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_CONTAINER_STYLE_DECLARATION__STYLE = 0;

  /**
   * The feature id for the '<em><b>Conditional Style Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_CONTAINER_STYLE_DECLARATION__CONDITIONAL_STYLE_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Conditional Container Style Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_CONTAINER_STYLE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.StyleImpl <em>Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.StyleImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getStyle()
   * @generated
   */
  int STYLE = 11;

  /**
   * The number of structural features of the '<em>Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_FEATURE_COUNT = SIRIUS_FILE_BODY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerStyleImpl <em>Container Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerStyleImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getContainerStyle()
   * @generated
   */
  int CONTAINER_STYLE = 12;

  /**
   * The number of structural features of the '<em>Container Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl <em>Gradient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getGradient()
   * @generated
   */
  int GRADIENT = 13;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__DOCUMENTATION = CONTAINER_STYLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__DIRECTION = CONTAINER_STYLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__NAME = CONTAINER_STYLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Background Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__BACKGROUND_COLOR = CONTAINER_STYLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Foreground Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__FOREGROUND_COLOR = CONTAINER_STYLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Label Alignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__LABEL_ALIGNMENT = CONTAINER_STYLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Label Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__LABEL_EXPRESSION = CONTAINER_STYLE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Label Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__LABEL_COLOR = CONTAINER_STYLE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Border Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__BORDER_SIZE = CONTAINER_STYLE_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Border Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__BORDER_COLOR = CONTAINER_STYLE_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__ICON = CONTAINER_STYLE_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Height Computation Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__HEIGHT_COMPUTATION_EXPRESSION = CONTAINER_STYLE_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Width Computation Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__WIDTH_COMPUTATION_EXPRESSION = CONTAINER_STYLE_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Gradient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT_FEATURE_COUNT = CONTAINER_STYLE_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeImpl <em>Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getEdge()
   * @generated
   */
  int EDGE = 14;

  /**
   * The number of structural features of the '<em>Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_FEATURE_COUNT = SIRIUS_FILE_BODY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RelationBasedEdgeImpl <em>Relation Based Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.RelationBasedEdgeImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getRelationBasedEdge()
   * @generated
   */
  int RELATION_BASED_EDGE = 15;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE__DOCUMENTATION = EDGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE__NAME = EDGE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE__LABEL = EDGE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE__STYLE = EDGE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Source Mappings</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE__SOURCE_MAPPINGS = EDGE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Target Mappings</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE__TARGET_MAPPINGS = EDGE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Target Finder Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE__TARGET_FINDER_EXPRESSION = EDGE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Relation Based Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl <em>Edge Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getEdgeStyle()
   * @generated
   */
  int EDGE_STYLE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__NAME = STYLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stroke Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__STROKE_COLOR = STYLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Line Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__LINE_STYLE = STYLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Routing Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__ROUTING_STYLE = STYLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Source Arrow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__SOURCE_ARROW = STYLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Target Arrow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__TARGET_ARROW = STYLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Size Computation Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__SIZE_COMPUTATION_EXPRESSION = STYLE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Folding Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__FOLDING_STYLE = STYLE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Ends Centering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__ENDS_CENTERING = STYLE_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Edge Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.PaletteImpl <em>Palette</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.PaletteImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getPalette()
   * @generated
   */
  int PALETTE = 17;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALETTE__DOCUMENTATION = SIRIUS_FILE_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALETTE__NAME = SIRIUS_FILE_BODY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Colors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALETTE__COLORS = SIRIUS_FILE_BODY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Palette</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALETTE_FEATURE_COUNT = SIRIUS_FILE_BODY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ColorImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getColor()
   * @generated
   */
  int COLOR = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ColorValueImpl <em>Color Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ColorValueImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getColorValue()
   * @generated
   */
  int COLOR_VALUE = 19;

  /**
   * The number of structural features of the '<em>Color Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RGBImpl <em>RGB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.RGBImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getRGB()
   * @generated
   */
  int RGB = 20;

  /**
   * The feature id for the '<em><b>Red</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB__RED = COLOR_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Green</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB__GREEN = COLOR_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Blue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB__BLUE = COLOR_VALUE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>RGB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_FEATURE_COUNT = COLOR_VALUE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment <em>Label Alignment</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getLabelAlignment()
   * @generated
   */
  int LABEL_ALIGNMENT = 21;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection <em>Gradient Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getGradientDirection()
   * @generated
   */
  int GRADIENT_DIRECTION = 22;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.LineStyle <em>Line Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LineStyle
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getLineStyle()
   * @generated
   */
  int LINE_STYLE = 23;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle <em>Routing Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getRoutingStyle()
   * @generated
   */
  int ROUTING_STYLE = 24;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator <em>Arrow Decorator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getArrowDecorator()
   * @generated
   */
  int ARROW_DECORATOR = 25;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle <em>Folding Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getFoldingStyle()
   * @generated
   */
  int FOLDING_STYLE = 26;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering <em>Ends Centering</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getEndsCentering()
   * @generated
   */
  int ENDS_CENTERING = 27;


  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile <em>Sirius File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sirius File</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile
   * @generated
   */
  EClass getSiriusFile();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile#getDocumentation()
   * @see #getSiriusFile()
   * @generated
   */
  EAttribute getSiriusFile_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile#getName()
   * @see #getSiriusFile()
   * @generated
   */
  EAttribute getSiriusFile_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile#getImports()
   * @see #getSiriusFile()
   * @generated
   */
  EReference getSiriusFile_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile#getBody()
   * @see #getSiriusFile()
   * @generated
   */
  EReference getSiriusFile_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.SiriusFileBody <em>Sirius File Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sirius File Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusFileBody
   * @generated
   */
  EClass getSiriusFileBody();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Designer <em>Designer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Designer</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Designer
   * @generated
   */
  EClass getDesigner();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Designer#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Designer#getDocumentation()
   * @see #getDesigner()
   * @generated
   */
  EAttribute getDesigner_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Designer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Designer#getName()
   * @see #getDesigner()
   * @generated
   */
  EAttribute getDesigner_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Designer#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Designer#getLabel()
   * @see #getDesigner()
   * @generated
   */
  EAttribute getDesigner_Label();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Designer#getViewpoints <em>Viewpoints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Viewpoints</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Designer#getViewpoints()
   * @see #getDesigner()
   * @generated
   */
  EReference getDesigner_Viewpoints();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint <em>Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Viewpoint</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint
   * @generated
   */
  EClass getViewpoint();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getDocumentation()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getName()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getLabel()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_Label();

  /**
   * Returns the meta object for the attribute list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getModelFileExtensions <em>Model File Extensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Model File Extensions</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getModelFileExtensions()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_ModelFileExtensions();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getIcon()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_Icon();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getRepresentations <em>Representations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Representations</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getRepresentations()
   * @see #getViewpoint()
   * @generated
   */
  EReference getViewpoint_Representations();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Representation <em>Representation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Representation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Representation
   * @generated
   */
  EClass getRepresentation();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram
   * @generated
   */
  EClass getDiagram();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getDocumentation()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#isInitialized <em>Initialized</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initialized</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#isInitialized()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_Initialized();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#isShowOnStartup <em>Show On Startup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Show On Startup</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#isShowOnStartup()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_ShowOnStartup();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#isEnablePopupBars <em>Enable Popup Bars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enable Popup Bars</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#isEnablePopupBars()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_EnablePopupBars();

  /**
   * Returns the meta object for the attribute list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getMetamodelUris <em>Metamodel Uris</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Metamodel Uris</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getMetamodelUris()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_MetamodelUris();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getName()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getLabel()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_Label();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getDomainClass <em>Domain Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domain Class</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getDomainClass()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_DomainClass();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getPrecondition <em>Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precondition</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getPrecondition()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_Precondition();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getEndUserDocumentation <em>End User Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End User Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getEndUserDocumentation()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_EndUserDocumentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getTitleExpression <em>Title Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getTitleExpression()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_TitleExpression();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getRootExpression <em>Root Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Root Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getRootExpression()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_RootExpression();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getDefaultLayer <em>Default Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Default Layer</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getDefaultLayer()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_DefaultLayer();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getAdditionalLayers <em>Additional Layers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Additional Layers</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getAdditionalLayers()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_AdditionalLayers();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layer</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Layer
   * @generated
   */
  EClass getLayer();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Layer#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Layer#getDocumentation()
   * @see #getLayer()
   * @generated
   */
  EAttribute getLayer_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Layer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Layer#getName()
   * @see #getLayer()
   * @generated
   */
  EAttribute getLayer_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Layer#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Layer#getIcon()
   * @see #getLayer()
   * @generated
   */
  EAttribute getLayer_Icon();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Layer#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Mappings</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Layer#getMappings()
   * @see #getLayer()
   * @generated
   */
  EReference getLayer_Mappings();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Layer#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Edges</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Layer#getEdges()
   * @see #getLayer()
   * @generated
   */
  EReference getLayer_Edges();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Container
   * @generated
   */
  EClass getContainer();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Container#getDocumentation()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#isList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Container#isList()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_List();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Container#getName()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Container#getLabel()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Label();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getDomainClass <em>Domain Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domain Class</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Container#getDomainClass()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_DomainClass();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Container#getStyle()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Style();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getPrecondition <em>Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precondition</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Container#getPrecondition()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Precondition();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getSemanticCanditatesExpression <em>Semantic Canditates Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Semantic Canditates Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Container#getSemanticCanditatesExpression()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_SemanticCanditatesExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getConditionalStyles <em>Conditional Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Container#getConditionalStyles()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_ConditionalStyles();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration <em>Conditional Container Style Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Container Style Declaration</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration
   * @generated
   */
  EClass getConditionalContainerStyleDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration#getStyle()
   * @see #getConditionalContainerStyleDeclaration()
   * @generated
   */
  EReference getConditionalContainerStyleDeclaration_Style();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration#getConditionalStyleExpression <em>Conditional Style Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conditional Style Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration#getConditionalStyleExpression()
   * @see #getConditionalContainerStyleDeclaration()
   * @generated
   */
  EAttribute getConditionalContainerStyleDeclaration_ConditionalStyleExpression();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Style
   * @generated
   */
  EClass getStyle();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerStyle <em>Container Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerStyle
   * @generated
   */
  EClass getContainerStyle();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient <em>Gradient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gradient</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient
   * @generated
   */
  EClass getGradient();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getDocumentation()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getDirection()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_Direction();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getName()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_Name();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBackgroundColor <em>Background Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Background Color</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBackgroundColor()
   * @see #getGradient()
   * @generated
   */
  EReference getGradient_BackgroundColor();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getForegroundColor <em>Foreground Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Foreground Color</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getForegroundColor()
   * @see #getGradient()
   * @generated
   */
  EReference getGradient_ForegroundColor();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelAlignment <em>Label Alignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Alignment</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelAlignment()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_LabelAlignment();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelExpression <em>Label Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelExpression()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_LabelExpression();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelColor <em>Label Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Label Color</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelColor()
   * @see #getGradient()
   * @generated
   */
  EReference getGradient_LabelColor();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBorderSize <em>Border Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Border Size</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBorderSize()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_BorderSize();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBorderColor <em>Border Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Border Color</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBorderColor()
   * @see #getGradient()
   * @generated
   */
  EReference getGradient_BorderColor();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getIcon()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_Icon();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getHeightComputationExpression <em>Height Computation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height Computation Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getHeightComputationExpression()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_HeightComputationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getWidthComputationExpression <em>Width Computation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width Computation Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getWidthComputationExpression()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_WidthComputationExpression();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Edge <em>Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Edge
   * @generated
   */
  EClass getEdge();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge <em>Relation Based Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Based Edge</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge
   * @generated
   */
  EClass getRelationBasedEdge();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getDocumentation()
   * @see #getRelationBasedEdge()
   * @generated
   */
  EAttribute getRelationBasedEdge_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getName()
   * @see #getRelationBasedEdge()
   * @generated
   */
  EAttribute getRelationBasedEdge_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getLabel()
   * @see #getRelationBasedEdge()
   * @generated
   */
  EAttribute getRelationBasedEdge_Label();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getStyle()
   * @see #getRelationBasedEdge()
   * @generated
   */
  EReference getRelationBasedEdge_Style();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getSourceMappings <em>Source Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Source Mappings</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getSourceMappings()
   * @see #getRelationBasedEdge()
   * @generated
   */
  EReference getRelationBasedEdge_SourceMappings();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getTargetMappings <em>Target Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Target Mappings</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getTargetMappings()
   * @see #getRelationBasedEdge()
   * @generated
   */
  EReference getRelationBasedEdge_TargetMappings();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getTargetFinderExpression <em>Target Finder Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Finder Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getTargetFinderExpression()
   * @see #getRelationBasedEdge()
   * @generated
   */
  EAttribute getRelationBasedEdge_TargetFinderExpression();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle <em>Edge Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle
   * @generated
   */
  EClass getEdgeStyle();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getName()
   * @see #getEdgeStyle()
   * @generated
   */
  EAttribute getEdgeStyle_Name();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getStrokeColor <em>Stroke Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stroke Color</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getStrokeColor()
   * @see #getEdgeStyle()
   * @generated
   */
  EReference getEdgeStyle_StrokeColor();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getLineStyle <em>Line Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getLineStyle()
   * @see #getEdgeStyle()
   * @generated
   */
  EAttribute getEdgeStyle_LineStyle();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getRoutingStyle <em>Routing Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Routing Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getRoutingStyle()
   * @see #getEdgeStyle()
   * @generated
   */
  EAttribute getEdgeStyle_RoutingStyle();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getSourceArrow <em>Source Arrow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Arrow</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getSourceArrow()
   * @see #getEdgeStyle()
   * @generated
   */
  EAttribute getEdgeStyle_SourceArrow();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getTargetArrow <em>Target Arrow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Arrow</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getTargetArrow()
   * @see #getEdgeStyle()
   * @generated
   */
  EAttribute getEdgeStyle_TargetArrow();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getSizeComputationExpression <em>Size Computation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size Computation Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getSizeComputationExpression()
   * @see #getEdgeStyle()
   * @generated
   */
  EAttribute getEdgeStyle_SizeComputationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getFoldingStyle <em>Folding Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Folding Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getFoldingStyle()
   * @see #getEdgeStyle()
   * @generated
   */
  EAttribute getEdgeStyle_FoldingStyle();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getEndsCentering <em>Ends Centering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ends Centering</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getEndsCentering()
   * @see #getEdgeStyle()
   * @generated
   */
  EAttribute getEdgeStyle_EndsCentering();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Palette <em>Palette</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Palette</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Palette
   * @generated
   */
  EClass getPalette();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Palette#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Palette#getDocumentation()
   * @see #getPalette()
   * @generated
   */
  EAttribute getPalette_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Palette#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Palette#getName()
   * @see #getPalette()
   * @generated
   */
  EAttribute getPalette_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Palette#getColors <em>Colors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Colors</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Palette#getColors()
   * @see #getPalette()
   * @generated
   */
  EReference getPalette_Colors();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Color#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Color#getName()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Color#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Color#getValue()
   * @see #getColor()
   * @generated
   */
  EReference getColor_Value();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.ColorValue <em>Color Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Value</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ColorValue
   * @generated
   */
  EClass getColorValue();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.RGB <em>RGB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RGB</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RGB
   * @generated
   */
  EClass getRGB();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.RGB#getRed <em>Red</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Red</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RGB#getRed()
   * @see #getRGB()
   * @generated
   */
  EAttribute getRGB_Red();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.RGB#getGreen <em>Green</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Green</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RGB#getGreen()
   * @see #getRGB()
   * @generated
   */
  EAttribute getRGB_Green();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.RGB#getBlue <em>Blue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Blue</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RGB#getBlue()
   * @see #getRGB()
   * @generated
   */
  EAttribute getRGB_Blue();

  /**
   * Returns the meta object for enum '{@link org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment <em>Label Alignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Label Alignment</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment
   * @generated
   */
  EEnum getLabelAlignment();

  /**
   * Returns the meta object for enum '{@link org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection <em>Gradient Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Gradient Direction</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection
   * @generated
   */
  EEnum getGradientDirection();

  /**
   * Returns the meta object for enum '{@link org.obeonetwork.sirius.text.siriusTextDsl.LineStyle <em>Line Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Line Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LineStyle
   * @generated
   */
  EEnum getLineStyle();

  /**
   * Returns the meta object for enum '{@link org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle <em>Routing Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Routing Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle
   * @generated
   */
  EEnum getRoutingStyle();

  /**
   * Returns the meta object for enum '{@link org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator <em>Arrow Decorator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Arrow Decorator</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator
   * @generated
   */
  EEnum getArrowDecorator();

  /**
   * Returns the meta object for enum '{@link org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle <em>Folding Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Folding Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle
   * @generated
   */
  EEnum getFoldingStyle();

  /**
   * Returns the meta object for enum '{@link org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering <em>Ends Centering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Ends Centering</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering
   * @generated
   */
  EEnum getEndsCentering();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SiriusTextDslFactory getSiriusTextDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusFileImpl <em>Sirius File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusFileImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getSiriusFile()
     * @generated
     */
    EClass SIRIUS_FILE = eINSTANCE.getSiriusFile();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIRIUS_FILE__DOCUMENTATION = eINSTANCE.getSiriusFile_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIRIUS_FILE__NAME = eINSTANCE.getSiriusFile_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIRIUS_FILE__IMPORTS = eINSTANCE.getSiriusFile_Imports();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIRIUS_FILE__BODY = eINSTANCE.getSiriusFile_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusFileBodyImpl <em>Sirius File Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusFileBodyImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getSiriusFileBody()
     * @generated
     */
    EClass SIRIUS_FILE_BODY = eINSTANCE.getSiriusFileBody();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ImportImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DesignerImpl <em>Designer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.DesignerImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getDesigner()
     * @generated
     */
    EClass DESIGNER = eINSTANCE.getDesigner();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGNER__DOCUMENTATION = eINSTANCE.getDesigner_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGNER__NAME = eINSTANCE.getDesigner_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGNER__LABEL = eINSTANCE.getDesigner_Label();

    /**
     * The meta object literal for the '<em><b>Viewpoints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESIGNER__VIEWPOINTS = eINSTANCE.getDesigner_Viewpoints();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ViewpointImpl <em>Viewpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ViewpointImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getViewpoint()
     * @generated
     */
    EClass VIEWPOINT = eINSTANCE.getViewpoint();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__DOCUMENTATION = eINSTANCE.getViewpoint_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__NAME = eINSTANCE.getViewpoint_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__LABEL = eINSTANCE.getViewpoint_Label();

    /**
     * The meta object literal for the '<em><b>Model File Extensions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__MODEL_FILE_EXTENSIONS = eINSTANCE.getViewpoint_ModelFileExtensions();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__ICON = eINSTANCE.getViewpoint_Icon();

    /**
     * The meta object literal for the '<em><b>Representations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWPOINT__REPRESENTATIONS = eINSTANCE.getViewpoint_Representations();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RepresentationImpl <em>Representation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.RepresentationImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getRepresentation()
     * @generated
     */
    EClass REPRESENTATION = eINSTANCE.getRepresentation();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.DiagramImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getDiagram()
     * @generated
     */
    EClass DIAGRAM = eINSTANCE.getDiagram();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__DOCUMENTATION = eINSTANCE.getDiagram_Documentation();

    /**
     * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__INITIALIZED = eINSTANCE.getDiagram_Initialized();

    /**
     * The meta object literal for the '<em><b>Show On Startup</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__SHOW_ON_STARTUP = eINSTANCE.getDiagram_ShowOnStartup();

    /**
     * The meta object literal for the '<em><b>Enable Popup Bars</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__ENABLE_POPUP_BARS = eINSTANCE.getDiagram_EnablePopupBars();

    /**
     * The meta object literal for the '<em><b>Metamodel Uris</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__METAMODEL_URIS = eINSTANCE.getDiagram_MetamodelUris();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__LABEL = eINSTANCE.getDiagram_Label();

    /**
     * The meta object literal for the '<em><b>Domain Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__DOMAIN_CLASS = eINSTANCE.getDiagram_DomainClass();

    /**
     * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__PRECONDITION = eINSTANCE.getDiagram_Precondition();

    /**
     * The meta object literal for the '<em><b>End User Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__END_USER_DOCUMENTATION = eINSTANCE.getDiagram_EndUserDocumentation();

    /**
     * The meta object literal for the '<em><b>Title Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__TITLE_EXPRESSION = eINSTANCE.getDiagram_TitleExpression();

    /**
     * The meta object literal for the '<em><b>Root Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__ROOT_EXPRESSION = eINSTANCE.getDiagram_RootExpression();

    /**
     * The meta object literal for the '<em><b>Default Layer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__DEFAULT_LAYER = eINSTANCE.getDiagram_DefaultLayer();

    /**
     * The meta object literal for the '<em><b>Additional Layers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__ADDITIONAL_LAYERS = eINSTANCE.getDiagram_AdditionalLayers();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl <em>Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.LayerImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getLayer()
     * @generated
     */
    EClass LAYER = eINSTANCE.getLayer();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYER__DOCUMENTATION = eINSTANCE.getLayer_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYER__NAME = eINSTANCE.getLayer_Name();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYER__ICON = eINSTANCE.getLayer_Icon();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYER__MAPPINGS = eINSTANCE.getLayer_Mappings();

    /**
     * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYER__EDGES = eINSTANCE.getLayer_Edges();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getContainer()
     * @generated
     */
    EClass CONTAINER = eINSTANCE.getContainer();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__DOCUMENTATION = eINSTANCE.getContainer_Documentation();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__LIST = eINSTANCE.getContainer_List();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__LABEL = eINSTANCE.getContainer_Label();

    /**
     * The meta object literal for the '<em><b>Domain Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__DOMAIN_CLASS = eINSTANCE.getContainer_DomainClass();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__STYLE = eINSTANCE.getContainer_Style();

    /**
     * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__PRECONDITION = eINSTANCE.getContainer_Precondition();

    /**
     * The meta object literal for the '<em><b>Semantic Canditates Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__SEMANTIC_CANDITATES_EXPRESSION = eINSTANCE.getContainer_SemanticCanditatesExpression();

    /**
     * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__CONDITIONAL_STYLES = eINSTANCE.getContainer_ConditionalStyles();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ConditionalContainerStyleDeclarationImpl <em>Conditional Container Style Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ConditionalContainerStyleDeclarationImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getConditionalContainerStyleDeclaration()
     * @generated
     */
    EClass CONDITIONAL_CONTAINER_STYLE_DECLARATION = eINSTANCE.getConditionalContainerStyleDeclaration();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_CONTAINER_STYLE_DECLARATION__STYLE = eINSTANCE.getConditionalContainerStyleDeclaration_Style();

    /**
     * The meta object literal for the '<em><b>Conditional Style Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL_CONTAINER_STYLE_DECLARATION__CONDITIONAL_STYLE_EXPRESSION = eINSTANCE.getConditionalContainerStyleDeclaration_ConditionalStyleExpression();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.StyleImpl <em>Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.StyleImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getStyle()
     * @generated
     */
    EClass STYLE = eINSTANCE.getStyle();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerStyleImpl <em>Container Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerStyleImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getContainerStyle()
     * @generated
     */
    EClass CONTAINER_STYLE = eINSTANCE.getContainerStyle();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl <em>Gradient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.GradientImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getGradient()
     * @generated
     */
    EClass GRADIENT = eINSTANCE.getGradient();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__DOCUMENTATION = eINSTANCE.getGradient_Documentation();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__DIRECTION = eINSTANCE.getGradient_Direction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__NAME = eINSTANCE.getGradient_Name();

    /**
     * The meta object literal for the '<em><b>Background Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRADIENT__BACKGROUND_COLOR = eINSTANCE.getGradient_BackgroundColor();

    /**
     * The meta object literal for the '<em><b>Foreground Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRADIENT__FOREGROUND_COLOR = eINSTANCE.getGradient_ForegroundColor();

    /**
     * The meta object literal for the '<em><b>Label Alignment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__LABEL_ALIGNMENT = eINSTANCE.getGradient_LabelAlignment();

    /**
     * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__LABEL_EXPRESSION = eINSTANCE.getGradient_LabelExpression();

    /**
     * The meta object literal for the '<em><b>Label Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRADIENT__LABEL_COLOR = eINSTANCE.getGradient_LabelColor();

    /**
     * The meta object literal for the '<em><b>Border Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__BORDER_SIZE = eINSTANCE.getGradient_BorderSize();

    /**
     * The meta object literal for the '<em><b>Border Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRADIENT__BORDER_COLOR = eINSTANCE.getGradient_BorderColor();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__ICON = eINSTANCE.getGradient_Icon();

    /**
     * The meta object literal for the '<em><b>Height Computation Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__HEIGHT_COMPUTATION_EXPRESSION = eINSTANCE.getGradient_HeightComputationExpression();

    /**
     * The meta object literal for the '<em><b>Width Computation Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__WIDTH_COMPUTATION_EXPRESSION = eINSTANCE.getGradient_WidthComputationExpression();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeImpl <em>Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getEdge()
     * @generated
     */
    EClass EDGE = eINSTANCE.getEdge();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RelationBasedEdgeImpl <em>Relation Based Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.RelationBasedEdgeImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getRelationBasedEdge()
     * @generated
     */
    EClass RELATION_BASED_EDGE = eINSTANCE.getRelationBasedEdge();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_BASED_EDGE__DOCUMENTATION = eINSTANCE.getRelationBasedEdge_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_BASED_EDGE__NAME = eINSTANCE.getRelationBasedEdge_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_BASED_EDGE__LABEL = eINSTANCE.getRelationBasedEdge_Label();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_BASED_EDGE__STYLE = eINSTANCE.getRelationBasedEdge_Style();

    /**
     * The meta object literal for the '<em><b>Source Mappings</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_BASED_EDGE__SOURCE_MAPPINGS = eINSTANCE.getRelationBasedEdge_SourceMappings();

    /**
     * The meta object literal for the '<em><b>Target Mappings</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_BASED_EDGE__TARGET_MAPPINGS = eINSTANCE.getRelationBasedEdge_TargetMappings();

    /**
     * The meta object literal for the '<em><b>Target Finder Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_BASED_EDGE__TARGET_FINDER_EXPRESSION = eINSTANCE.getRelationBasedEdge_TargetFinderExpression();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl <em>Edge Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getEdgeStyle()
     * @generated
     */
    EClass EDGE_STYLE = eINSTANCE.getEdgeStyle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_STYLE__NAME = eINSTANCE.getEdgeStyle_Name();

    /**
     * The meta object literal for the '<em><b>Stroke Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STYLE__STROKE_COLOR = eINSTANCE.getEdgeStyle_StrokeColor();

    /**
     * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_STYLE__LINE_STYLE = eINSTANCE.getEdgeStyle_LineStyle();

    /**
     * The meta object literal for the '<em><b>Routing Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_STYLE__ROUTING_STYLE = eINSTANCE.getEdgeStyle_RoutingStyle();

    /**
     * The meta object literal for the '<em><b>Source Arrow</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_STYLE__SOURCE_ARROW = eINSTANCE.getEdgeStyle_SourceArrow();

    /**
     * The meta object literal for the '<em><b>Target Arrow</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_STYLE__TARGET_ARROW = eINSTANCE.getEdgeStyle_TargetArrow();

    /**
     * The meta object literal for the '<em><b>Size Computation Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_STYLE__SIZE_COMPUTATION_EXPRESSION = eINSTANCE.getEdgeStyle_SizeComputationExpression();

    /**
     * The meta object literal for the '<em><b>Folding Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_STYLE__FOLDING_STYLE = eINSTANCE.getEdgeStyle_FoldingStyle();

    /**
     * The meta object literal for the '<em><b>Ends Centering</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_STYLE__ENDS_CENTERING = eINSTANCE.getEdgeStyle_EndsCentering();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.PaletteImpl <em>Palette</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.PaletteImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getPalette()
     * @generated
     */
    EClass PALETTE = eINSTANCE.getPalette();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PALETTE__DOCUMENTATION = eINSTANCE.getPalette_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PALETTE__NAME = eINSTANCE.getPalette_Name();

    /**
     * The meta object literal for the '<em><b>Colors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PALETTE__COLORS = eINSTANCE.getPalette_Colors();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ColorImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getColor()
     * @generated
     */
    EClass COLOR = eINSTANCE.getColor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__NAME = eINSTANCE.getColor_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR__VALUE = eINSTANCE.getColor_Value();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ColorValueImpl <em>Color Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ColorValueImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getColorValue()
     * @generated
     */
    EClass COLOR_VALUE = eINSTANCE.getColorValue();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RGBImpl <em>RGB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.RGBImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getRGB()
     * @generated
     */
    EClass RGB = eINSTANCE.getRGB();

    /**
     * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB__RED = eINSTANCE.getRGB_Red();

    /**
     * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB__GREEN = eINSTANCE.getRGB_Green();

    /**
     * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB__BLUE = eINSTANCE.getRGB_Blue();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment <em>Label Alignment</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getLabelAlignment()
     * @generated
     */
    EEnum LABEL_ALIGNMENT = eINSTANCE.getLabelAlignment();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection <em>Gradient Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getGradientDirection()
     * @generated
     */
    EEnum GRADIENT_DIRECTION = eINSTANCE.getGradientDirection();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.LineStyle <em>Line Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.LineStyle
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getLineStyle()
     * @generated
     */
    EEnum LINE_STYLE = eINSTANCE.getLineStyle();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle <em>Routing Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getRoutingStyle()
     * @generated
     */
    EEnum ROUTING_STYLE = eINSTANCE.getRoutingStyle();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator <em>Arrow Decorator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getArrowDecorator()
     * @generated
     */
    EEnum ARROW_DECORATOR = eINSTANCE.getArrowDecorator();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle <em>Folding Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getFoldingStyle()
     * @generated
     */
    EEnum FOLDING_STYLE = eINSTANCE.getFoldingStyle();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering <em>Ends Centering</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getEndsCentering()
     * @generated
     */
    EEnum ENDS_CENTERING = eINSTANCE.getEndsCentering();

  }

} //SiriusTextDslPackage
