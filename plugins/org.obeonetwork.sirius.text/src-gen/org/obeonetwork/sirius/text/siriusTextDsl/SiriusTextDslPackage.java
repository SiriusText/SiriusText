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
   * The feature id for the '<em><b>Icon Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__ICON_PATH = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__NAME = 2;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__LABEL = 3;

  /**
   * The feature id for the '<em><b>Model File Extensions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__MODEL_FILE_EXTENSIONS = 4;

  /**
   * The feature id for the '<em><b>Representations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__REPRESENTATIONS = 5;

  /**
   * The feature id for the '<em><b>Java Extension</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__JAVA_EXTENSION = 6;

  /**
   * The number of structural features of the '<em>Viewpoint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT_FEATURE_COUNT = 7;

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
   * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__PRECONDITION_EXPRESSION = REPRESENTATION_FEATURE_COUNT + 8;

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
   * The feature id for the '<em><b>Icon Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__ICON_PATH = SIRIUS_FILE_BODY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__NAME = SIRIUS_FILE_BODY_FEATURE_COUNT + 2;

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
   * The feature id for the '<em><b>Sections</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__SECTIONS = SIRIUS_FILE_BODY_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_FEATURE_COUNT = SIRIUS_FILE_BODY_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SectionImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getSection()
   * @generated
   */
  int SECTION = 8;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__DOCUMENTATION = SIRIUS_FILE_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Icon Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__ICON_PATH = SIRIUS_FILE_BODY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__NAME = SIRIUS_FILE_BODY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__LABEL = SIRIUS_FILE_BODY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Tools</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__TOOLS = SIRIUS_FILE_BODY_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = SIRIUS_FILE_BODY_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ToolImpl <em>Tool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ToolImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getTool()
   * @generated
   */
  int TOOL = 9;

  /**
   * The number of structural features of the '<em>Tool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_FEATURE_COUNT = SIRIUS_FILE_BODY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl <em>Container Creation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getContainerCreation()
   * @generated
   */
  int CONTAINER_CREATION = 10;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CREATION__DOCUMENTATION = TOOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Force Refresh</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CREATION__FORCE_REFRESH = TOOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Icon Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CREATION__ICON_PATH = TOOL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Node Creation Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CREATION__NODE_CREATION_VARIABLE = TOOL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Container View Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CREATION__CONTAINER_VIEW_VARIABLE = TOOL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CREATION__NAME = TOOL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CREATION__LABEL = TOOL_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CREATION__PRECONDITION_EXPRESSION = TOOL_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Container Mappings</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CREATION__CONTAINER_MAPPINGS = TOOL_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Extra Mappings</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CREATION__EXTRA_MAPPINGS = TOOL_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CREATION__BODY = TOOL_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Container Creation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CREATION_FEATURE_COUNT = TOOL_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.OperationImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 11;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ChangeContextImpl <em>Change Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ChangeContextImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getChangeContext()
   * @generated
   */
  int CHANGE_CONTEXT = 12;

  /**
   * The feature id for the '<em><b>Browse Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_CONTEXT__BROWSE_EXPRESSION = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_CONTEXT__BODY = OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Change Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_CONTEXT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ForImpl <em>For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ForImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getFor()
   * @generated
   */
  int FOR = 13;

  /**
   * The feature id for the '<em><b>Iterator Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__ITERATOR_NAME = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__EXPRESSION = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__BODY = OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.IfImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getIf()
   * @generated
   */
  int IF = 14;

  /**
   * The feature id for the '<em><b>Condition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__CONDITION_EXPRESSION = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__BODY = OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SetImpl <em>Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SetImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getSet()
   * @generated
   */
  int SET = 15;

  /**
   * The feature id for the '<em><b>Feature Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__FEATURE_NAME = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__VALUE_EXPRESSION = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__BODY = OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.UnsetImpl <em>Unset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.UnsetImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getUnset()
   * @generated
   */
  int UNSET = 16;

  /**
   * The feature id for the '<em><b>Feature Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSET__FEATURE_NAME = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSET__ELEMENT_EXPRESSION = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSET__BODY = OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Unset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSET_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateInstanceImpl <em>Create Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateInstanceImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getCreateInstance()
   * @generated
   */
  int CREATE_INSTANCE = 17;

  /**
   * The feature id for the '<em><b>Reference Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_INSTANCE__REFERENCE_NAME = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_INSTANCE__TYPE = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_INSTANCE__VARIABLE_NAME = OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_INSTANCE__BODY = OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Create Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_INSTANCE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateViewImpl <em>Create View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateViewImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getCreateView()
   * @generated
   */
  int CREATE_VIEW = 18;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_VIEW__MAPPING = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Container View Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_VIEW__CONTAINER_VIEW_EXPRESSION = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_VIEW__VARIABLE_NAME = OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_VIEW__BODY = OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Create View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_VIEW_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateEdgeViewImpl <em>Create Edge View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateEdgeViewImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getCreateEdgeView()
   * @generated
   */
  int CREATE_EDGE_VIEW = 19;

  /**
   * The feature id for the '<em><b>Edge</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EDGE_VIEW__EDGE = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EDGE_VIEW__SOURCE_EXPRESSION = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EDGE_VIEW__TARGET_EXPRESSION = OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Container View Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EDGE_VIEW__CONTAINER_VIEW_EXPRESSION = OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EDGE_VIEW__VARIABLE_NAME = OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EDGE_VIEW__BODY = OPERATION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Create Edge View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EDGE_VIEW_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DeleteViewImpl <em>Delete View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.DeleteViewImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getDeleteView()
   * @generated
   */
  int DELETE_VIEW = 20;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_VIEW__BODY = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Delete View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_VIEW_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RemoveImpl <em>Remove</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.RemoveImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getRemove()
   * @generated
   */
  int REMOVE = 21;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE__BODY = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Remove</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MoveImpl <em>Move</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.MoveImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getMove()
   * @generated
   */
  int MOVE = 22;

  /**
   * The feature id for the '<em><b>New Container Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE__NEW_CONTAINER_EXPRESSION = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE__FEATURE_NAME = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE__BODY = OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Move</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SwitchImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 23;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__CASES = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__DEFAULT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.CaseImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getCase()
   * @generated
   */
  int CASE = 24;

  /**
   * The feature id for the '<em><b>Condition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__CONDITION_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__BODY = 1;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DefaultImpl <em>Default</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.DefaultImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getDefault()
   * @generated
   */
  int DEFAULT = 25;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT__BODY = 0;

  /**
   * The number of structural features of the '<em>Default</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.MappingImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 26;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__DOCUMENTATION = SIRIUS_FILE_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__NAME = SIRIUS_FILE_BODY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__LABEL = SIRIUS_FILE_BODY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Domain Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__DOMAIN_CLASS = SIRIUS_FILE_BODY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__PRECONDITION_EXPRESSION = SIRIUS_FILE_BODY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Semantic Candidates Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__SEMANTIC_CANDIDATES_EXPRESSION = SIRIUS_FILE_BODY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Associated Elements Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__ASSOCIATED_ELEMENTS_EXPRESSION = SIRIUS_FILE_BODY_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = SIRIUS_FILE_BODY_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.NodeImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getNode()
   * @generated
   */
  int NODE = 27;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__DOCUMENTATION = MAPPING__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = MAPPING__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__LABEL = MAPPING__LABEL;

  /**
   * The feature id for the '<em><b>Domain Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__DOMAIN_CLASS = MAPPING__DOMAIN_CLASS;

  /**
   * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__PRECONDITION_EXPRESSION = MAPPING__PRECONDITION_EXPRESSION;

  /**
   * The feature id for the '<em><b>Semantic Candidates Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__SEMANTIC_CANDIDATES_EXPRESSION = MAPPING__SEMANTIC_CANDIDATES_EXPRESSION;

  /**
   * The feature id for the '<em><b>Associated Elements Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ASSOCIATED_ELEMENTS_EXPRESSION = MAPPING__ASSOCIATED_ELEMENTS_EXPRESSION;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__STYLE = MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__CONDITIONAL_STYLES = MAPPING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getContainer()
   * @generated
   */
  int CONTAINER = 28;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DOCUMENTATION = MAPPING__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__NAME = MAPPING__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__LABEL = MAPPING__LABEL;

  /**
   * The feature id for the '<em><b>Domain Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DOMAIN_CLASS = MAPPING__DOMAIN_CLASS;

  /**
   * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__PRECONDITION_EXPRESSION = MAPPING__PRECONDITION_EXPRESSION;

  /**
   * The feature id for the '<em><b>Semantic Candidates Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__SEMANTIC_CANDIDATES_EXPRESSION = MAPPING__SEMANTIC_CANDIDATES_EXPRESSION;

  /**
   * The feature id for the '<em><b>Associated Elements Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__ASSOCIATED_ELEMENTS_EXPRESSION = MAPPING__ASSOCIATED_ELEMENTS_EXPRESSION;

  /**
   * The feature id for the '<em><b>Children Presentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CHILDREN_PRESENTATION = MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__STYLE = MAPPING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CONDITIONAL_STYLES = MAPPING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ConditionalNodeStyleDeclarationImpl <em>Conditional Node Style Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ConditionalNodeStyleDeclarationImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getConditionalNodeStyleDeclaration()
   * @generated
   */
  int CONDITIONAL_NODE_STYLE_DECLARATION = 29;

  /**
   * The feature id for the '<em><b>Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_NODE_STYLE_DECLARATION__STYLE = 0;

  /**
   * The feature id for the '<em><b>Conditional Style Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_NODE_STYLE_DECLARATION__CONDITIONAL_STYLE_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Conditional Node Style Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_NODE_STYLE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ConditionalContainerStyleDeclarationImpl <em>Conditional Container Style Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ConditionalContainerStyleDeclarationImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getConditionalContainerStyleDeclaration()
   * @generated
   */
  int CONDITIONAL_CONTAINER_STYLE_DECLARATION = 30;

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
  int STYLE = 31;

  /**
   * The number of structural features of the '<em>Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_FEATURE_COUNT = SIRIUS_FILE_BODY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.NodeStyleImpl <em>Node Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.NodeStyleImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getNodeStyle()
   * @generated
   */
  int NODE_STYLE = 32;

  /**
   * The number of structural features of the '<em>Node Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl <em>Square</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getSquare()
   * @generated
   */
  int SQUARE = 33;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__DOCUMENTATION = NODE_STYLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Allow Vertical Resizing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__ALLOW_VERTICAL_RESIZING = NODE_STYLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Allow Horizontal Resizing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__ALLOW_HORIZONTAL_RESIZING = NODE_STYLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__NAME = NODE_STYLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__COLOR = NODE_STYLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__LABEL = NODE_STYLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Label Border Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__LABEL_BORDER_STYLE = NODE_STYLE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Border</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__BORDER = NODE_STYLE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__HEIGHT = NODE_STYLE_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__WIDTH = NODE_STYLE_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Size Computation Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__SIZE_COMPUTATION_EXPRESSION = NODE_STYLE_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__TOOLTIP_EXPRESSION = NODE_STYLE_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Square</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE_FEATURE_COUNT = NODE_STYLE_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.LabelImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 34;

  /**
   * The feature id for the '<em><b>Show Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__SHOW_ICON = 0;

  /**
   * The feature id for the '<em><b>Hide By Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__HIDE_BY_DEFAULT = 1;

  /**
   * The feature id for the '<em><b>Icon Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__ICON_PATH = 2;

  /**
   * The feature id for the '<em><b>Format Options</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__FORMAT_OPTIONS = 3;

  /**
   * The feature id for the '<em><b>Alignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__ALIGNMENT = 4;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__SIZE = 5;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__COLOR = 7;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.BorderImpl <em>Border</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.BorderImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getBorder()
   * @generated
   */
  int BORDER = 35;

  /**
   * The feature id for the '<em><b>Line Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER__LINE_STYLE = 0;

  /**
   * The feature id for the '<em><b>Border Size Computation Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER__BORDER_SIZE_COMPUTATION_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Border Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER__BORDER_COLOR = 2;

  /**
   * The number of structural features of the '<em>Border</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerStyleImpl <em>Container Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerStyleImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getContainerStyle()
   * @generated
   */
  int CONTAINER_STYLE = 36;

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
  int GRADIENT = 37;

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
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__LABEL = CONTAINER_STYLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Label Border Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__LABEL_BORDER_STYLE = CONTAINER_STYLE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Border</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__BORDER = CONTAINER_STYLE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Height Computation Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__HEIGHT_COMPUTATION_EXPRESSION = CONTAINER_STYLE_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Width Computation Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__WIDTH_COMPUTATION_EXPRESSION = CONTAINER_STYLE_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Arc Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__ARC_HEIGHT = CONTAINER_STYLE_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Arc Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__ARC_WIDTH = CONTAINER_STYLE_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT__TOOLTIP_EXPRESSION = CONTAINER_STYLE_FEATURE_COUNT + 12;

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
  int EDGE = 38;

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
  int RELATION_BASED_EDGE = 39;

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
   * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE__PRECONDITION_EXPRESSION = EDGE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Source Mappings</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE__SOURCE_MAPPINGS = EDGE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Target Mappings</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE__TARGET_MAPPINGS = EDGE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Target Finder Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE__TARGET_FINDER_EXPRESSION = EDGE_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Relation Based Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_BASED_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl <em>Edge Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeStyleImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getEdgeStyle()
   * @generated
   */
  int EDGE_STYLE = 40;

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
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__LABEL = STYLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Source Arrow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__SOURCE_ARROW = STYLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Target Arrow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__TARGET_ARROW = STYLE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Size Computation Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__SIZE_COMPUTATION_EXPRESSION = STYLE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Folding Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__FOLDING_STYLE = STYLE_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Ends Centering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE__ENDS_CENTERING = STYLE_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Edge Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeLabelImpl <em>Edge Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeLabelImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getEdgeLabel()
   * @generated
   */
  int EDGE_LABEL = 41;

  /**
   * The feature id for the '<em><b>Show Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_LABEL__SHOW_ICON = 0;

  /**
   * The feature id for the '<em><b>Icon Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_LABEL__ICON_PATH = 1;

  /**
   * The feature id for the '<em><b>Format Options</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_LABEL__FORMAT_OPTIONS = 2;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_LABEL__SIZE = 3;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_LABEL__EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_LABEL__COLOR = 5;

  /**
   * The number of structural features of the '<em>Edge Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_LABEL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.PaletteImpl <em>Palette</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.PaletteImpl
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getPalette()
   * @generated
   */
  int PALETTE = 42;

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
  int COLOR = 43;

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
  int COLOR_VALUE = 44;

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
  int RGB = 45;

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
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerChildrenPresentation <em>Container Children Presentation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerChildrenPresentation
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getContainerChildrenPresentation()
   * @generated
   */
  int CONTAINER_CHILDREN_PRESENTATION = 46;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.NodeLabelBorderStyle <em>Node Label Border Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.NodeLabelBorderStyle
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getNodeLabelBorderStyle()
   * @generated
   */
  int NODE_LABEL_BORDER_STYLE = 47;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.LabelFormatOption <em>Label Format Option</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LabelFormatOption
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getLabelFormatOption()
   * @generated
   */
  int LABEL_FORMAT_OPTION = 48;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment <em>Label Alignment</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getLabelAlignment()
   * @generated
   */
  int LABEL_ALIGNMENT = 49;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerLabelBorderStyle <em>Container Label Border Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerLabelBorderStyle
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getContainerLabelBorderStyle()
   * @generated
   */
  int CONTAINER_LABEL_BORDER_STYLE = 50;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection <em>Gradient Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getGradientDirection()
   * @generated
   */
  int GRADIENT_DIRECTION = 51;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.LineStyle <em>Line Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LineStyle
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getLineStyle()
   * @generated
   */
  int LINE_STYLE = 52;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle <em>Routing Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getRoutingStyle()
   * @generated
   */
  int ROUTING_STYLE = 53;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator <em>Arrow Decorator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getArrowDecorator()
   * @generated
   */
  int ARROW_DECORATOR = 54;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle <em>Folding Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getFoldingStyle()
   * @generated
   */
  int FOLDING_STYLE = 55;

  /**
   * The meta object id for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering <em>Ends Centering</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering
   * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getEndsCentering()
   * @generated
   */
  int ENDS_CENTERING = 56;


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
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getIconPath <em>Icon Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon Path</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getIconPath()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_IconPath();

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
   * Returns the meta object for the reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getJavaExtension <em>Java Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Java Extension</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint#getJavaExtension()
   * @see #getViewpoint()
   * @generated
   */
  EReference getViewpoint_JavaExtension();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getPreconditionExpression <em>Precondition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precondition Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram#getPreconditionExpression()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_PreconditionExpression();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Layer#getIconPath <em>Icon Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon Path</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Layer#getIconPath()
   * @see #getLayer()
   * @generated
   */
  EAttribute getLayer_IconPath();

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
   * Returns the meta object for the reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Layer#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sections</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Layer#getSections()
   * @see #getLayer()
   * @generated
   */
  EReference getLayer_Sections();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Section#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Section#getDocumentation()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Section#getIconPath <em>Icon Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon Path</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Section#getIconPath()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_IconPath();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Section#getName()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Section#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Section#getLabel()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Label();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Section#getTools <em>Tools</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Tools</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Section#getTools()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Tools();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Tool <em>Tool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tool</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Tool
   * @generated
   */
  EClass getTool();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation <em>Container Creation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Creation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation
   * @generated
   */
  EClass getContainerCreation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getDocumentation()
   * @see #getContainerCreation()
   * @generated
   */
  EAttribute getContainerCreation_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#isForceRefresh <em>Force Refresh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Force Refresh</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#isForceRefresh()
   * @see #getContainerCreation()
   * @generated
   */
  EAttribute getContainerCreation_ForceRefresh();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getIconPath <em>Icon Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon Path</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getIconPath()
   * @see #getContainerCreation()
   * @generated
   */
  EAttribute getContainerCreation_IconPath();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getNodeCreationVariable <em>Node Creation Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node Creation Variable</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getNodeCreationVariable()
   * @see #getContainerCreation()
   * @generated
   */
  EAttribute getContainerCreation_NodeCreationVariable();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getContainerViewVariable <em>Container View Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Container View Variable</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getContainerViewVariable()
   * @see #getContainerCreation()
   * @generated
   */
  EAttribute getContainerCreation_ContainerViewVariable();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getName()
   * @see #getContainerCreation()
   * @generated
   */
  EAttribute getContainerCreation_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getLabel()
   * @see #getContainerCreation()
   * @generated
   */
  EAttribute getContainerCreation_Label();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getPreconditionExpression <em>Precondition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precondition Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getPreconditionExpression()
   * @see #getContainerCreation()
   * @generated
   */
  EAttribute getContainerCreation_PreconditionExpression();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getContainerMappings <em>Container Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Container Mappings</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getContainerMappings()
   * @see #getContainerCreation()
   * @generated
   */
  EReference getContainerCreation_ContainerMappings();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getExtraMappings <em>Extra Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Extra Mappings</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getExtraMappings()
   * @see #getContainerCreation()
   * @generated
   */
  EReference getContainerCreation_ExtraMappings();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation#getBody()
   * @see #getContainerCreation()
   * @generated
   */
  EReference getContainerCreation_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext <em>Change Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Change Context</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext
   * @generated
   */
  EClass getChangeContext();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext#getBrowseExpression <em>Browse Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Browse Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext#getBrowseExpression()
   * @see #getChangeContext()
   * @generated
   */
  EAttribute getChangeContext_BrowseExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext#getBody()
   * @see #getChangeContext()
   * @generated
   */
  EReference getChangeContext_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.For
   * @generated
   */
  EClass getFor();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.For#getIteratorName <em>Iterator Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iterator Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.For#getIteratorName()
   * @see #getFor()
   * @generated
   */
  EAttribute getFor_IteratorName();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.For#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.For#getExpression()
   * @see #getFor()
   * @generated
   */
  EAttribute getFor_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.For#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.For#getBody()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.If#getConditionExpression <em>Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.If#getConditionExpression()
   * @see #getIf()
   * @generated
   */
  EAttribute getIf_ConditionExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.If#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.If#getBody()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Set <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Set
   * @generated
   */
  EClass getSet();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Set#getFeatureName <em>Feature Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Set#getFeatureName()
   * @see #getSet()
   * @generated
   */
  EAttribute getSet_FeatureName();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Set#getValueExpression <em>Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Set#getValueExpression()
   * @see #getSet()
   * @generated
   */
  EAttribute getSet_ValueExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Set#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Set#getBody()
   * @see #getSet()
   * @generated
   */
  EReference getSet_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Unset <em>Unset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unset</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Unset
   * @generated
   */
  EClass getUnset();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Unset#getFeatureName <em>Feature Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Unset#getFeatureName()
   * @see #getUnset()
   * @generated
   */
  EAttribute getUnset_FeatureName();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Unset#getElementExpression <em>Element Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Unset#getElementExpression()
   * @see #getUnset()
   * @generated
   */
  EAttribute getUnset_ElementExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Unset#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Unset#getBody()
   * @see #getUnset()
   * @generated
   */
  EReference getUnset_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance <em>Create Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Instance</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance
   * @generated
   */
  EClass getCreateInstance();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance#getReferenceName <em>Reference Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance#getReferenceName()
   * @see #getCreateInstance()
   * @generated
   */
  EAttribute getCreateInstance_ReferenceName();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance#getType()
   * @see #getCreateInstance()
   * @generated
   */
  EAttribute getCreateInstance_Type();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance#getVariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance#getVariableName()
   * @see #getCreateInstance()
   * @generated
   */
  EAttribute getCreateInstance_VariableName();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance#getBody()
   * @see #getCreateInstance()
   * @generated
   */
  EReference getCreateInstance_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView <em>Create View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create View</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateView
   * @generated
   */
  EClass getCreateView();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mapping</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getMapping()
   * @see #getCreateView()
   * @generated
   */
  EReference getCreateView_Mapping();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getContainerViewExpression <em>Container View Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Container View Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getContainerViewExpression()
   * @see #getCreateView()
   * @generated
   */
  EAttribute getCreateView_ContainerViewExpression();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getVariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getVariableName()
   * @see #getCreateView()
   * @generated
   */
  EAttribute getCreateView_VariableName();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateView#getBody()
   * @see #getCreateView()
   * @generated
   */
  EReference getCreateView_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView <em>Create Edge View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Edge View</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView
   * @generated
   */
  EClass getCreateEdgeView();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getEdge <em>Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Edge</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getEdge()
   * @see #getCreateEdgeView()
   * @generated
   */
  EReference getCreateEdgeView_Edge();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getSourceExpression <em>Source Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getSourceExpression()
   * @see #getCreateEdgeView()
   * @generated
   */
  EAttribute getCreateEdgeView_SourceExpression();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getTargetExpression <em>Target Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getTargetExpression()
   * @see #getCreateEdgeView()
   * @generated
   */
  EAttribute getCreateEdgeView_TargetExpression();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getContainerViewExpression <em>Container View Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Container View Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getContainerViewExpression()
   * @see #getCreateEdgeView()
   * @generated
   */
  EAttribute getCreateEdgeView_ContainerViewExpression();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getVariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getVariableName()
   * @see #getCreateEdgeView()
   * @generated
   */
  EAttribute getCreateEdgeView_VariableName();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView#getBody()
   * @see #getCreateEdgeView()
   * @generated
   */
  EReference getCreateEdgeView_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.DeleteView <em>Delete View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete View</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.DeleteView
   * @generated
   */
  EClass getDeleteView();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.DeleteView#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.DeleteView#getBody()
   * @see #getDeleteView()
   * @generated
   */
  EReference getDeleteView_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Remove <em>Remove</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remove</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Remove
   * @generated
   */
  EClass getRemove();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Remove#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Remove#getBody()
   * @see #getRemove()
   * @generated
   */
  EReference getRemove_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Move <em>Move</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Move</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Move
   * @generated
   */
  EClass getMove();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Move#getNewContainerExpression <em>New Container Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Container Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Move#getNewContainerExpression()
   * @see #getMove()
   * @generated
   */
  EAttribute getMove_NewContainerExpression();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Move#getFeatureName <em>Feature Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Move#getFeatureName()
   * @see #getMove()
   * @generated
   */
  EAttribute getMove_FeatureName();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Move#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Move#getBody()
   * @see #getMove()
   * @generated
   */
  EReference getMove_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Switch
   * @generated
   */
  EClass getSwitch();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Switch#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Switch#getCases()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Cases();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Switch#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Switch#getDefault()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Default();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Case#getConditionExpression <em>Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Case#getConditionExpression()
   * @see #getCase()
   * @generated
   */
  EAttribute getCase_ConditionExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Case#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Case#getBody()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Body();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Default <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Default
   * @generated
   */
  EClass getDefault();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Default#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Default#getBody()
   * @see #getDefault()
   * @generated
   */
  EReference getDefault_Body();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getDocumentation()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getName()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getLabel()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Label();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getDomainClass <em>Domain Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domain Class</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getDomainClass()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_DomainClass();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getPreconditionExpression <em>Precondition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precondition Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getPreconditionExpression()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_PreconditionExpression();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getSemanticCandidatesExpression <em>Semantic Candidates Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Semantic Candidates Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getSemanticCandidatesExpression()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_SemanticCandidatesExpression();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getAssociatedElementsExpression <em>Associated Elements Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Associated Elements Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Mapping#getAssociatedElementsExpression()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_AssociatedElementsExpression();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Node#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Node#getStyle()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Style();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Node#getConditionalStyles <em>Conditional Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Node#getConditionalStyles()
   * @see #getNode()
   * @generated
   */
  EReference getNode_ConditionalStyles();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container#getChildrenPresentation <em>Children Presentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Children Presentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Container#getChildrenPresentation()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_ChildrenPresentation();

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
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration <em>Conditional Node Style Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Node Style Declaration</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration
   * @generated
   */
  EClass getConditionalNodeStyleDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration#getStyle()
   * @see #getConditionalNodeStyleDeclaration()
   * @generated
   */
  EReference getConditionalNodeStyleDeclaration_Style();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration#getConditionalStyleExpression <em>Conditional Style Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conditional Style Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration#getConditionalStyleExpression()
   * @see #getConditionalNodeStyleDeclaration()
   * @generated
   */
  EAttribute getConditionalNodeStyleDeclaration_ConditionalStyleExpression();

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
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.NodeStyle <em>Node Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.NodeStyle
   * @generated
   */
  EClass getNodeStyle();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square <em>Square</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Square</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square
   * @generated
   */
  EClass getSquare();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square#getDocumentation()
   * @see #getSquare()
   * @generated
   */
  EAttribute getSquare_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square#isAllowVerticalResizing <em>Allow Vertical Resizing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Allow Vertical Resizing</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square#isAllowVerticalResizing()
   * @see #getSquare()
   * @generated
   */
  EAttribute getSquare_AllowVerticalResizing();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square#isAllowHorizontalResizing <em>Allow Horizontal Resizing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Allow Horizontal Resizing</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square#isAllowHorizontalResizing()
   * @see #getSquare()
   * @generated
   */
  EAttribute getSquare_AllowHorizontalResizing();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square#getName()
   * @see #getSquare()
   * @generated
   */
  EAttribute getSquare_Name();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Color</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square#getColor()
   * @see #getSquare()
   * @generated
   */
  EReference getSquare_Color();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square#getLabel()
   * @see #getSquare()
   * @generated
   */
  EReference getSquare_Label();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square#getLabelBorderStyle <em>Label Border Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Border Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square#getLabelBorderStyle()
   * @see #getSquare()
   * @generated
   */
  EAttribute getSquare_LabelBorderStyle();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square#getBorder <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Border</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square#getBorder()
   * @see #getSquare()
   * @generated
   */
  EReference getSquare_Border();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square#getHeight()
   * @see #getSquare()
   * @generated
   */
  EAttribute getSquare_Height();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square#getWidth()
   * @see #getSquare()
   * @generated
   */
  EAttribute getSquare_Width();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square#getSizeComputationExpression <em>Size Computation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size Computation Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square#getSizeComputationExpression()
   * @see #getSquare()
   * @generated
   */
  EAttribute getSquare_SizeComputationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square#getTooltipExpression <em>Tooltip Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tooltip Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square#getTooltipExpression()
   * @see #getSquare()
   * @generated
   */
  EAttribute getSquare_TooltipExpression();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Label#isShowIcon <em>Show Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Show Icon</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Label#isShowIcon()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_ShowIcon();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Label#isHideByDefault <em>Hide By Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hide By Default</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Label#isHideByDefault()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_HideByDefault();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Label#getIconPath <em>Icon Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon Path</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Label#getIconPath()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_IconPath();

  /**
   * Returns the meta object for the attribute list '{@link org.obeonetwork.sirius.text.siriusTextDsl.Label#getFormatOptions <em>Format Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Format Options</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Label#getFormatOptions()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_FormatOptions();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Label#getAlignment <em>Alignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alignment</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Label#getAlignment()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Alignment();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Label#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Label#getSize()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Size();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Label#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Label#getExpression()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Expression();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Label#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Color</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Label#getColor()
   * @see #getLabel()
   * @generated
   */
  EReference getLabel_Color();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Border <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Border
   * @generated
   */
  EClass getBorder();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Border#getLineStyle <em>Line Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Border#getLineStyle()
   * @see #getBorder()
   * @generated
   */
  EAttribute getBorder_LineStyle();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Border#getBorderSizeComputationExpression <em>Border Size Computation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Border Size Computation Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Border#getBorderSizeComputationExpression()
   * @see #getBorder()
   * @generated
   */
  EAttribute getBorder_BorderSizeComputationExpression();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Border#getBorderColor <em>Border Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Border Color</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Border#getBorderColor()
   * @see #getBorder()
   * @generated
   */
  EReference getBorder_BorderColor();

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
   * Returns the meta object for the containment reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabel()
   * @see #getGradient()
   * @generated
   */
  EReference getGradient_Label();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelBorderStyle <em>Label Border Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Border Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getLabelBorderStyle()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_LabelBorderStyle();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBorder <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Border</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getBorder()
   * @see #getGradient()
   * @generated
   */
  EReference getGradient_Border();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getArcHeight <em>Arc Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arc Height</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getArcHeight()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_ArcHeight();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getArcWidth <em>Arc Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arc Width</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getArcWidth()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_ArcWidth();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getTooltipExpression <em>Tooltip Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tooltip Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient#getTooltipExpression()
   * @see #getGradient()
   * @generated
   */
  EAttribute getGradient_TooltipExpression();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getPreconditionExpression <em>Precondition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precondition Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge#getPreconditionExpression()
   * @see #getRelationBasedEdge()
   * @generated
   */
  EAttribute getRelationBasedEdge_PreconditionExpression();

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
   * Returns the meta object for the containment reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle#getLabel()
   * @see #getEdgeStyle()
   * @generated
   */
  EReference getEdgeStyle_Label();

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
   * Returns the meta object for class '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel <em>Edge Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Label</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel
   * @generated
   */
  EClass getEdgeLabel();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#isShowIcon <em>Show Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Show Icon</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#isShowIcon()
   * @see #getEdgeLabel()
   * @generated
   */
  EAttribute getEdgeLabel_ShowIcon();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getIconPath <em>Icon Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon Path</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getIconPath()
   * @see #getEdgeLabel()
   * @generated
   */
  EAttribute getEdgeLabel_IconPath();

  /**
   * Returns the meta object for the attribute list '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getFormatOptions <em>Format Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Format Options</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getFormatOptions()
   * @see #getEdgeLabel()
   * @generated
   */
  EAttribute getEdgeLabel_FormatOptions();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getSize()
   * @see #getEdgeLabel()
   * @generated
   */
  EAttribute getEdgeLabel_Size();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getExpression()
   * @see #getEdgeLabel()
   * @generated
   */
  EAttribute getEdgeLabel_Expression();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Color</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel#getColor()
   * @see #getEdgeLabel()
   * @generated
   */
  EReference getEdgeLabel_Color();

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
   * Returns the meta object for enum '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerChildrenPresentation <em>Container Children Presentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Container Children Presentation</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerChildrenPresentation
   * @generated
   */
  EEnum getContainerChildrenPresentation();

  /**
   * Returns the meta object for enum '{@link org.obeonetwork.sirius.text.siriusTextDsl.NodeLabelBorderStyle <em>Node Label Border Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Node Label Border Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.NodeLabelBorderStyle
   * @generated
   */
  EEnum getNodeLabelBorderStyle();

  /**
   * Returns the meta object for enum '{@link org.obeonetwork.sirius.text.siriusTextDsl.LabelFormatOption <em>Label Format Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Label Format Option</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.LabelFormatOption
   * @generated
   */
  EEnum getLabelFormatOption();

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
   * Returns the meta object for enum '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerLabelBorderStyle <em>Container Label Border Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Container Label Border Style</em>'.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerLabelBorderStyle
   * @generated
   */
  EEnum getContainerLabelBorderStyle();

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
     * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__ICON_PATH = eINSTANCE.getViewpoint_IconPath();

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
     * The meta object literal for the '<em><b>Representations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWPOINT__REPRESENTATIONS = eINSTANCE.getViewpoint_Representations();

    /**
     * The meta object literal for the '<em><b>Java Extension</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWPOINT__JAVA_EXTENSION = eINSTANCE.getViewpoint_JavaExtension();

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
     * The meta object literal for the '<em><b>Precondition Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__PRECONDITION_EXPRESSION = eINSTANCE.getDiagram_PreconditionExpression();

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
     * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYER__ICON_PATH = eINSTANCE.getLayer_IconPath();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYER__NAME = eINSTANCE.getLayer_Name();

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
     * The meta object literal for the '<em><b>Sections</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYER__SECTIONS = eINSTANCE.getLayer_Sections();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SectionImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__DOCUMENTATION = eINSTANCE.getSection_Documentation();

    /**
     * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__ICON_PATH = eINSTANCE.getSection_IconPath();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__NAME = eINSTANCE.getSection_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__LABEL = eINSTANCE.getSection_Label();

    /**
     * The meta object literal for the '<em><b>Tools</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__TOOLS = eINSTANCE.getSection_Tools();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ToolImpl <em>Tool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ToolImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getTool()
     * @generated
     */
    EClass TOOL = eINSTANCE.getTool();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl <em>Container Creation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ContainerCreationImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getContainerCreation()
     * @generated
     */
    EClass CONTAINER_CREATION = eINSTANCE.getContainerCreation();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_CREATION__DOCUMENTATION = eINSTANCE.getContainerCreation_Documentation();

    /**
     * The meta object literal for the '<em><b>Force Refresh</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_CREATION__FORCE_REFRESH = eINSTANCE.getContainerCreation_ForceRefresh();

    /**
     * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_CREATION__ICON_PATH = eINSTANCE.getContainerCreation_IconPath();

    /**
     * The meta object literal for the '<em><b>Node Creation Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_CREATION__NODE_CREATION_VARIABLE = eINSTANCE.getContainerCreation_NodeCreationVariable();

    /**
     * The meta object literal for the '<em><b>Container View Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_CREATION__CONTAINER_VIEW_VARIABLE = eINSTANCE.getContainerCreation_ContainerViewVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_CREATION__NAME = eINSTANCE.getContainerCreation_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_CREATION__LABEL = eINSTANCE.getContainerCreation_Label();

    /**
     * The meta object literal for the '<em><b>Precondition Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_CREATION__PRECONDITION_EXPRESSION = eINSTANCE.getContainerCreation_PreconditionExpression();

    /**
     * The meta object literal for the '<em><b>Container Mappings</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_CREATION__CONTAINER_MAPPINGS = eINSTANCE.getContainerCreation_ContainerMappings();

    /**
     * The meta object literal for the '<em><b>Extra Mappings</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_CREATION__EXTRA_MAPPINGS = eINSTANCE.getContainerCreation_ExtraMappings();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_CREATION__BODY = eINSTANCE.getContainerCreation_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.OperationImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ChangeContextImpl <em>Change Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ChangeContextImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getChangeContext()
     * @generated
     */
    EClass CHANGE_CONTEXT = eINSTANCE.getChangeContext();

    /**
     * The meta object literal for the '<em><b>Browse Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANGE_CONTEXT__BROWSE_EXPRESSION = eINSTANCE.getChangeContext_BrowseExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANGE_CONTEXT__BODY = eINSTANCE.getChangeContext_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ForImpl <em>For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ForImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getFor()
     * @generated
     */
    EClass FOR = eINSTANCE.getFor();

    /**
     * The meta object literal for the '<em><b>Iterator Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR__ITERATOR_NAME = eINSTANCE.getFor_IteratorName();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR__EXPRESSION = eINSTANCE.getFor_Expression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__BODY = eINSTANCE.getFor_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.IfImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Condition Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF__CONDITION_EXPRESSION = eINSTANCE.getIf_ConditionExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__BODY = eINSTANCE.getIf_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SetImpl <em>Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SetImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getSet()
     * @generated
     */
    EClass SET = eINSTANCE.getSet();

    /**
     * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET__FEATURE_NAME = eINSTANCE.getSet_FeatureName();

    /**
     * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET__VALUE_EXPRESSION = eINSTANCE.getSet_ValueExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET__BODY = eINSTANCE.getSet_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.UnsetImpl <em>Unset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.UnsetImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getUnset()
     * @generated
     */
    EClass UNSET = eINSTANCE.getUnset();

    /**
     * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNSET__FEATURE_NAME = eINSTANCE.getUnset_FeatureName();

    /**
     * The meta object literal for the '<em><b>Element Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNSET__ELEMENT_EXPRESSION = eINSTANCE.getUnset_ElementExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNSET__BODY = eINSTANCE.getUnset_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateInstanceImpl <em>Create Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateInstanceImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getCreateInstance()
     * @generated
     */
    EClass CREATE_INSTANCE = eINSTANCE.getCreateInstance();

    /**
     * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_INSTANCE__REFERENCE_NAME = eINSTANCE.getCreateInstance_ReferenceName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_INSTANCE__TYPE = eINSTANCE.getCreateInstance_Type();

    /**
     * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_INSTANCE__VARIABLE_NAME = eINSTANCE.getCreateInstance_VariableName();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_INSTANCE__BODY = eINSTANCE.getCreateInstance_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateViewImpl <em>Create View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateViewImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getCreateView()
     * @generated
     */
    EClass CREATE_VIEW = eINSTANCE.getCreateView();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_VIEW__MAPPING = eINSTANCE.getCreateView_Mapping();

    /**
     * The meta object literal for the '<em><b>Container View Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_VIEW__CONTAINER_VIEW_EXPRESSION = eINSTANCE.getCreateView_ContainerViewExpression();

    /**
     * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_VIEW__VARIABLE_NAME = eINSTANCE.getCreateView_VariableName();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_VIEW__BODY = eINSTANCE.getCreateView_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateEdgeViewImpl <em>Create Edge View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.CreateEdgeViewImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getCreateEdgeView()
     * @generated
     */
    EClass CREATE_EDGE_VIEW = eINSTANCE.getCreateEdgeView();

    /**
     * The meta object literal for the '<em><b>Edge</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_EDGE_VIEW__EDGE = eINSTANCE.getCreateEdgeView_Edge();

    /**
     * The meta object literal for the '<em><b>Source Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_EDGE_VIEW__SOURCE_EXPRESSION = eINSTANCE.getCreateEdgeView_SourceExpression();

    /**
     * The meta object literal for the '<em><b>Target Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_EDGE_VIEW__TARGET_EXPRESSION = eINSTANCE.getCreateEdgeView_TargetExpression();

    /**
     * The meta object literal for the '<em><b>Container View Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_EDGE_VIEW__CONTAINER_VIEW_EXPRESSION = eINSTANCE.getCreateEdgeView_ContainerViewExpression();

    /**
     * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_EDGE_VIEW__VARIABLE_NAME = eINSTANCE.getCreateEdgeView_VariableName();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_EDGE_VIEW__BODY = eINSTANCE.getCreateEdgeView_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DeleteViewImpl <em>Delete View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.DeleteViewImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getDeleteView()
     * @generated
     */
    EClass DELETE_VIEW = eINSTANCE.getDeleteView();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_VIEW__BODY = eINSTANCE.getDeleteView_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.RemoveImpl <em>Remove</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.RemoveImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getRemove()
     * @generated
     */
    EClass REMOVE = eINSTANCE.getRemove();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REMOVE__BODY = eINSTANCE.getRemove_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.MoveImpl <em>Move</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.MoveImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getMove()
     * @generated
     */
    EClass MOVE = eINSTANCE.getMove();

    /**
     * The meta object literal for the '<em><b>New Container Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVE__NEW_CONTAINER_EXPRESSION = eINSTANCE.getMove_NewContainerExpression();

    /**
     * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVE__FEATURE_NAME = eINSTANCE.getMove_FeatureName();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVE__BODY = eINSTANCE.getMove_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SwitchImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getSwitch()
     * @generated
     */
    EClass SWITCH = eINSTANCE.getSwitch();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__CASES = eINSTANCE.getSwitch_Cases();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__DEFAULT = eINSTANCE.getSwitch_Default();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.CaseImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>Condition Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE__CONDITION_EXPRESSION = eINSTANCE.getCase_ConditionExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__BODY = eINSTANCE.getCase_Body();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.DefaultImpl <em>Default</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.DefaultImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getDefault()
     * @generated
     */
    EClass DEFAULT = eINSTANCE.getDefault();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFAULT__BODY = eINSTANCE.getDefault_Body();

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
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__DOCUMENTATION = eINSTANCE.getMapping_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__NAME = eINSTANCE.getMapping_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__LABEL = eINSTANCE.getMapping_Label();

    /**
     * The meta object literal for the '<em><b>Domain Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__DOMAIN_CLASS = eINSTANCE.getMapping_DomainClass();

    /**
     * The meta object literal for the '<em><b>Precondition Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__PRECONDITION_EXPRESSION = eINSTANCE.getMapping_PreconditionExpression();

    /**
     * The meta object literal for the '<em><b>Semantic Candidates Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__SEMANTIC_CANDIDATES_EXPRESSION = eINSTANCE.getMapping_SemanticCandidatesExpression();

    /**
     * The meta object literal for the '<em><b>Associated Elements Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__ASSOCIATED_ELEMENTS_EXPRESSION = eINSTANCE.getMapping_AssociatedElementsExpression();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.NodeImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__STYLE = eINSTANCE.getNode_Style();

    /**
     * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__CONDITIONAL_STYLES = eINSTANCE.getNode_ConditionalStyles();

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
     * The meta object literal for the '<em><b>Children Presentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__CHILDREN_PRESENTATION = eINSTANCE.getContainer_ChildrenPresentation();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__STYLE = eINSTANCE.getContainer_Style();

    /**
     * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__CONDITIONAL_STYLES = eINSTANCE.getContainer_ConditionalStyles();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.ConditionalNodeStyleDeclarationImpl <em>Conditional Node Style Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.ConditionalNodeStyleDeclarationImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getConditionalNodeStyleDeclaration()
     * @generated
     */
    EClass CONDITIONAL_NODE_STYLE_DECLARATION = eINSTANCE.getConditionalNodeStyleDeclaration();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_NODE_STYLE_DECLARATION__STYLE = eINSTANCE.getConditionalNodeStyleDeclaration_Style();

    /**
     * The meta object literal for the '<em><b>Conditional Style Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL_NODE_STYLE_DECLARATION__CONDITIONAL_STYLE_EXPRESSION = eINSTANCE.getConditionalNodeStyleDeclaration_ConditionalStyleExpression();

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
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.NodeStyleImpl <em>Node Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.NodeStyleImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getNodeStyle()
     * @generated
     */
    EClass NODE_STYLE = eINSTANCE.getNodeStyle();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl <em>Square</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SquareImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getSquare()
     * @generated
     */
    EClass SQUARE = eINSTANCE.getSquare();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQUARE__DOCUMENTATION = eINSTANCE.getSquare_Documentation();

    /**
     * The meta object literal for the '<em><b>Allow Vertical Resizing</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQUARE__ALLOW_VERTICAL_RESIZING = eINSTANCE.getSquare_AllowVerticalResizing();

    /**
     * The meta object literal for the '<em><b>Allow Horizontal Resizing</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQUARE__ALLOW_HORIZONTAL_RESIZING = eINSTANCE.getSquare_AllowHorizontalResizing();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQUARE__NAME = eINSTANCE.getSquare_Name();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQUARE__COLOR = eINSTANCE.getSquare_Color();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQUARE__LABEL = eINSTANCE.getSquare_Label();

    /**
     * The meta object literal for the '<em><b>Label Border Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQUARE__LABEL_BORDER_STYLE = eINSTANCE.getSquare_LabelBorderStyle();

    /**
     * The meta object literal for the '<em><b>Border</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQUARE__BORDER = eINSTANCE.getSquare_Border();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQUARE__HEIGHT = eINSTANCE.getSquare_Height();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQUARE__WIDTH = eINSTANCE.getSquare_Width();

    /**
     * The meta object literal for the '<em><b>Size Computation Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQUARE__SIZE_COMPUTATION_EXPRESSION = eINSTANCE.getSquare_SizeComputationExpression();

    /**
     * The meta object literal for the '<em><b>Tooltip Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQUARE__TOOLTIP_EXPRESSION = eINSTANCE.getSquare_TooltipExpression();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.LabelImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Show Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__SHOW_ICON = eINSTANCE.getLabel_ShowIcon();

    /**
     * The meta object literal for the '<em><b>Hide By Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__HIDE_BY_DEFAULT = eINSTANCE.getLabel_HideByDefault();

    /**
     * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__ICON_PATH = eINSTANCE.getLabel_IconPath();

    /**
     * The meta object literal for the '<em><b>Format Options</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__FORMAT_OPTIONS = eINSTANCE.getLabel_FormatOptions();

    /**
     * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__ALIGNMENT = eINSTANCE.getLabel_Alignment();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__SIZE = eINSTANCE.getLabel_Size();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__EXPRESSION = eINSTANCE.getLabel_Expression();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL__COLOR = eINSTANCE.getLabel_Color();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.BorderImpl <em>Border</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.BorderImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getBorder()
     * @generated
     */
    EClass BORDER = eINSTANCE.getBorder();

    /**
     * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BORDER__LINE_STYLE = eINSTANCE.getBorder_LineStyle();

    /**
     * The meta object literal for the '<em><b>Border Size Computation Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BORDER__BORDER_SIZE_COMPUTATION_EXPRESSION = eINSTANCE.getBorder_BorderSizeComputationExpression();

    /**
     * The meta object literal for the '<em><b>Border Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BORDER__BORDER_COLOR = eINSTANCE.getBorder_BorderColor();

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
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRADIENT__LABEL = eINSTANCE.getGradient_Label();

    /**
     * The meta object literal for the '<em><b>Label Border Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__LABEL_BORDER_STYLE = eINSTANCE.getGradient_LabelBorderStyle();

    /**
     * The meta object literal for the '<em><b>Border</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRADIENT__BORDER = eINSTANCE.getGradient_Border();

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
     * The meta object literal for the '<em><b>Arc Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__ARC_HEIGHT = eINSTANCE.getGradient_ArcHeight();

    /**
     * The meta object literal for the '<em><b>Arc Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__ARC_WIDTH = eINSTANCE.getGradient_ArcWidth();

    /**
     * The meta object literal for the '<em><b>Tooltip Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRADIENT__TOOLTIP_EXPRESSION = eINSTANCE.getGradient_TooltipExpression();

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
     * The meta object literal for the '<em><b>Precondition Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_BASED_EDGE__PRECONDITION_EXPRESSION = eINSTANCE.getRelationBasedEdge_PreconditionExpression();

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
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STYLE__LABEL = eINSTANCE.getEdgeStyle_Label();

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
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeLabelImpl <em>Edge Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.EdgeLabelImpl
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getEdgeLabel()
     * @generated
     */
    EClass EDGE_LABEL = eINSTANCE.getEdgeLabel();

    /**
     * The meta object literal for the '<em><b>Show Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_LABEL__SHOW_ICON = eINSTANCE.getEdgeLabel_ShowIcon();

    /**
     * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_LABEL__ICON_PATH = eINSTANCE.getEdgeLabel_IconPath();

    /**
     * The meta object literal for the '<em><b>Format Options</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_LABEL__FORMAT_OPTIONS = eINSTANCE.getEdgeLabel_FormatOptions();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_LABEL__SIZE = eINSTANCE.getEdgeLabel_Size();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_LABEL__EXPRESSION = eINSTANCE.getEdgeLabel_Expression();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_LABEL__COLOR = eINSTANCE.getEdgeLabel_Color();

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
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerChildrenPresentation <em>Container Children Presentation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerChildrenPresentation
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getContainerChildrenPresentation()
     * @generated
     */
    EEnum CONTAINER_CHILDREN_PRESENTATION = eINSTANCE.getContainerChildrenPresentation();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.NodeLabelBorderStyle <em>Node Label Border Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.NodeLabelBorderStyle
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getNodeLabelBorderStyle()
     * @generated
     */
    EEnum NODE_LABEL_BORDER_STYLE = eINSTANCE.getNodeLabelBorderStyle();

    /**
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.LabelFormatOption <em>Label Format Option</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.LabelFormatOption
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getLabelFormatOption()
     * @generated
     */
    EEnum LABEL_FORMAT_OPTION = eINSTANCE.getLabelFormatOption();

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
     * The meta object literal for the '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerLabelBorderStyle <em>Container Label Border Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerLabelBorderStyle
     * @see org.obeonetwork.sirius.text.siriusTextDsl.impl.SiriusTextDslPackageImpl#getContainerLabelBorderStyle()
     * @generated
     */
    EEnum CONTAINER_LABEL_BORDER_STYLE = eINSTANCE.getContainerLabelBorderStyle();

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
