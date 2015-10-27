/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator;
import org.obeonetwork.sirius.text.siriusTextDsl.Case;
import org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext;
import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.ColorValue;
import org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration;
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation;
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView;
import org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance;
import org.obeonetwork.sirius.text.siriusTextDsl.CreateView;
import org.obeonetwork.sirius.text.siriusTextDsl.Default;
import org.obeonetwork.sirius.text.siriusTextDsl.DeleteView;
import org.obeonetwork.sirius.text.siriusTextDsl.Designer;
import org.obeonetwork.sirius.text.siriusTextDsl.Diagram;
import org.obeonetwork.sirius.text.siriusTextDsl.Edge;
import org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering;
import org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.For;
import org.obeonetwork.sirius.text.siriusTextDsl.Gradient;
import org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection;
import org.obeonetwork.sirius.text.siriusTextDsl.If;
import org.obeonetwork.sirius.text.siriusTextDsl.Import;
import org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment;
import org.obeonetwork.sirius.text.siriusTextDsl.Layer;
import org.obeonetwork.sirius.text.siriusTextDsl.LineStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.Mapping;
import org.obeonetwork.sirius.text.siriusTextDsl.Move;
import org.obeonetwork.sirius.text.siriusTextDsl.Operation;
import org.obeonetwork.sirius.text.siriusTextDsl.Palette;
import org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge;
import org.obeonetwork.sirius.text.siriusTextDsl.Remove;
import org.obeonetwork.sirius.text.siriusTextDsl.Representation;
import org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.Section;
import org.obeonetwork.sirius.text.siriusTextDsl.Set;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFileBody;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslFactory;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;
import org.obeonetwork.sirius.text.siriusTextDsl.Style;
import org.obeonetwork.sirius.text.siriusTextDsl.Switch;
import org.obeonetwork.sirius.text.siriusTextDsl.Tool;
import org.obeonetwork.sirius.text.siriusTextDsl.Unset;
import org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiriusTextDslPackageImpl extends EPackageImpl implements SiriusTextDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass siriusFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass siriusFileBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass designerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewpointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass representationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diagramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerCreationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass changeContextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createEdgeViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass removeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalContainerStyleDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass styleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gradientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edgeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationBasedEdgeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edgeStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paletteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rgbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum labelAlignmentEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum gradientDirectionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum lineStyleEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum routingStyleEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum arrowDecoratorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum foldingStyleEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum endsCenteringEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SiriusTextDslPackageImpl()
  {
    super(eNS_URI, SiriusTextDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SiriusTextDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SiriusTextDslPackage init()
  {
    if (isInited) return (SiriusTextDslPackage)EPackage.Registry.INSTANCE.getEPackage(SiriusTextDslPackage.eNS_URI);

    // Obtain or create and register package
    SiriusTextDslPackageImpl theSiriusTextDslPackage = (SiriusTextDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SiriusTextDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SiriusTextDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSiriusTextDslPackage.createPackageContents();

    // Initialize created meta-data
    theSiriusTextDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSiriusTextDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SiriusTextDslPackage.eNS_URI, theSiriusTextDslPackage);
    return theSiriusTextDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSiriusFile()
  {
    return siriusFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiriusFile_Documentation()
  {
    return (EAttribute)siriusFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiriusFile_Name()
  {
    return (EAttribute)siriusFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSiriusFile_Imports()
  {
    return (EReference)siriusFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSiriusFile_Body()
  {
    return (EReference)siriusFileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSiriusFileBody()
  {
    return siriusFileBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDesigner()
  {
    return designerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesigner_Documentation()
  {
    return (EAttribute)designerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesigner_Name()
  {
    return (EAttribute)designerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesigner_Label()
  {
    return (EAttribute)designerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDesigner_Viewpoints()
  {
    return (EReference)designerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewpoint()
  {
    return viewpointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_Documentation()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_Name()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_Label()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_ModelFileExtensions()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_Icon()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewpoint_Representations()
  {
    return (EReference)viewpointEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewpoint_JavaExtension()
  {
    return (EReference)viewpointEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepresentation()
  {
    return representationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiagram()
  {
    return diagramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_Documentation()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_Initialized()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_ShowOnStartup()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_EnablePopupBars()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_MetamodelUris()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_Name()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_Label()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_DomainClass()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_Precondition()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_EndUserDocumentation()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_TitleExpression()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_RootExpression()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagram_DefaultLayer()
  {
    return (EReference)diagramEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagram_AdditionalLayers()
  {
    return (EReference)diagramEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayer()
  {
    return layerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayer_Documentation()
  {
    return (EAttribute)layerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayer_Name()
  {
    return (EAttribute)layerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayer_Icon()
  {
    return (EAttribute)layerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayer_Mappings()
  {
    return (EReference)layerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayer_Edges()
  {
    return (EReference)layerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayer_Sections()
  {
    return (EReference)layerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSection()
  {
    return sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSection_Documentation()
  {
    return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSection_Name()
  {
    return (EAttribute)sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSection_Label()
  {
    return (EAttribute)sectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSection_Icon()
  {
    return (EAttribute)sectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSection_Tools()
  {
    return (EReference)sectionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTool()
  {
    return toolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerCreation()
  {
    return containerCreationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerCreation_Documentation()
  {
    return (EAttribute)containerCreationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerCreation_ForceRefresh()
  {
    return (EAttribute)containerCreationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerCreation_NodeCreationVariable()
  {
    return (EAttribute)containerCreationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerCreation_ContainerViewVariable()
  {
    return (EAttribute)containerCreationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerCreation_Name()
  {
    return (EAttribute)containerCreationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerCreation_Label()
  {
    return (EAttribute)containerCreationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerCreation_Precondition()
  {
    return (EAttribute)containerCreationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerCreation_Icon()
  {
    return (EAttribute)containerCreationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerCreation_ContainerMappings()
  {
    return (EReference)containerCreationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerCreation_ExtraMappings()
  {
    return (EReference)containerCreationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerCreation_Body()
  {
    return (EReference)containerCreationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChangeContext()
  {
    return changeContextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChangeContext_BrowseExpression()
  {
    return (EAttribute)changeContextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChangeContext_Body()
  {
    return (EReference)changeContextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor()
  {
    return forEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFor_IteratorName()
  {
    return (EAttribute)forEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFor_Expression()
  {
    return (EAttribute)forEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Body()
  {
    return (EReference)forEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIf()
  {
    return ifEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIf_ConditionExpression()
  {
    return (EAttribute)ifEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_Body()
  {
    return (EReference)ifEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSet()
  {
    return setEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSet_FeatureName()
  {
    return (EAttribute)setEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSet_ValueExpression()
  {
    return (EAttribute)setEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSet_Body()
  {
    return (EReference)setEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnset()
  {
    return unsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnset_FeatureName()
  {
    return (EAttribute)unsetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnset_ElementExpression()
  {
    return (EAttribute)unsetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnset_Body()
  {
    return (EReference)unsetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateInstance()
  {
    return createInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateInstance_ReferenceName()
  {
    return (EAttribute)createInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateInstance_Type()
  {
    return (EAttribute)createInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateInstance_VariableName()
  {
    return (EAttribute)createInstanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateInstance_Body()
  {
    return (EReference)createInstanceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateView()
  {
    return createViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateView_Mapping()
  {
    return (EReference)createViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateView_ContainerViewExpression()
  {
    return (EAttribute)createViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateView_VariableName()
  {
    return (EAttribute)createViewEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateView_Body()
  {
    return (EReference)createViewEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateEdgeView()
  {
    return createEdgeViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateEdgeView_Edge()
  {
    return (EReference)createEdgeViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateEdgeView_SourceExpression()
  {
    return (EAttribute)createEdgeViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateEdgeView_TargetExpression()
  {
    return (EAttribute)createEdgeViewEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateEdgeView_ContainerViewExpression()
  {
    return (EAttribute)createEdgeViewEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateEdgeView_VariableName()
  {
    return (EAttribute)createEdgeViewEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateEdgeView_Body()
  {
    return (EReference)createEdgeViewEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeleteView()
  {
    return deleteViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeleteView_Body()
  {
    return (EReference)deleteViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemove()
  {
    return removeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRemove_Body()
  {
    return (EReference)removeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMove()
  {
    return moveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMove_NewContainerExpression()
  {
    return (EAttribute)moveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMove_FeatureName()
  {
    return (EAttribute)moveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMove_Body()
  {
    return (EReference)moveEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitch()
  {
    return switchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_Cases()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_Default()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCase()
  {
    return caseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCase_ConditionExpression()
  {
    return (EAttribute)caseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_Body()
  {
    return (EReference)caseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefault()
  {
    return defaultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefault_Body()
  {
    return (EReference)defaultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapping()
  {
    return mappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainer()
  {
    return containerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Documentation()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_List()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Name()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Label()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_DomainClass()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Style()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Precondition()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_SemanticCanditatesExpression()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_ConditionalStyles()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalContainerStyleDeclaration()
  {
    return conditionalContainerStyleDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalContainerStyleDeclaration_Style()
  {
    return (EReference)conditionalContainerStyleDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionalContainerStyleDeclaration_ConditionalStyleExpression()
  {
    return (EAttribute)conditionalContainerStyleDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStyle()
  {
    return styleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerStyle()
  {
    return containerStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGradient()
  {
    return gradientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGradient_Documentation()
  {
    return (EAttribute)gradientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGradient_Direction()
  {
    return (EAttribute)gradientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGradient_Name()
  {
    return (EAttribute)gradientEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGradient_BackgroundColor()
  {
    return (EReference)gradientEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGradient_ForegroundColor()
  {
    return (EReference)gradientEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGradient_LabelAlignment()
  {
    return (EAttribute)gradientEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGradient_LabelExpression()
  {
    return (EAttribute)gradientEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGradient_LabelColor()
  {
    return (EReference)gradientEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGradient_BorderSize()
  {
    return (EAttribute)gradientEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGradient_BorderColor()
  {
    return (EReference)gradientEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGradient_Icon()
  {
    return (EAttribute)gradientEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGradient_HeightComputationExpression()
  {
    return (EAttribute)gradientEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGradient_WidthComputationExpression()
  {
    return (EAttribute)gradientEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEdge()
  {
    return edgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationBasedEdge()
  {
    return relationBasedEdgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationBasedEdge_Documentation()
  {
    return (EAttribute)relationBasedEdgeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationBasedEdge_Name()
  {
    return (EAttribute)relationBasedEdgeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationBasedEdge_Label()
  {
    return (EAttribute)relationBasedEdgeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationBasedEdge_Style()
  {
    return (EReference)relationBasedEdgeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationBasedEdge_SourceMappings()
  {
    return (EReference)relationBasedEdgeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationBasedEdge_TargetMappings()
  {
    return (EReference)relationBasedEdgeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationBasedEdge_TargetFinderExpression()
  {
    return (EAttribute)relationBasedEdgeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEdgeStyle()
  {
    return edgeStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEdgeStyle_Name()
  {
    return (EAttribute)edgeStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdgeStyle_StrokeColor()
  {
    return (EReference)edgeStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEdgeStyle_LineStyle()
  {
    return (EAttribute)edgeStyleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEdgeStyle_RoutingStyle()
  {
    return (EAttribute)edgeStyleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEdgeStyle_SourceArrow()
  {
    return (EAttribute)edgeStyleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEdgeStyle_TargetArrow()
  {
    return (EAttribute)edgeStyleEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEdgeStyle_SizeComputationExpression()
  {
    return (EAttribute)edgeStyleEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEdgeStyle_FoldingStyle()
  {
    return (EAttribute)edgeStyleEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEdgeStyle_EndsCentering()
  {
    return (EAttribute)edgeStyleEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPalette()
  {
    return paletteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPalette_Documentation()
  {
    return (EAttribute)paletteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPalette_Name()
  {
    return (EAttribute)paletteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPalette_Colors()
  {
    return (EReference)paletteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColor()
  {
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_Name()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColor_Value()
  {
    return (EReference)colorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorValue()
  {
    return colorValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRGB()
  {
    return rgbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGB_Red()
  {
    return (EAttribute)rgbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGB_Green()
  {
    return (EAttribute)rgbEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGB_Blue()
  {
    return (EAttribute)rgbEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLabelAlignment()
  {
    return labelAlignmentEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getGradientDirection()
  {
    return gradientDirectionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLineStyle()
  {
    return lineStyleEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRoutingStyle()
  {
    return routingStyleEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getArrowDecorator()
  {
    return arrowDecoratorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFoldingStyle()
  {
    return foldingStyleEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEndsCentering()
  {
    return endsCenteringEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiriusTextDslFactory getSiriusTextDslFactory()
  {
    return (SiriusTextDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    siriusFileEClass = createEClass(SIRIUS_FILE);
    createEAttribute(siriusFileEClass, SIRIUS_FILE__DOCUMENTATION);
    createEAttribute(siriusFileEClass, SIRIUS_FILE__NAME);
    createEReference(siriusFileEClass, SIRIUS_FILE__IMPORTS);
    createEReference(siriusFileEClass, SIRIUS_FILE__BODY);

    siriusFileBodyEClass = createEClass(SIRIUS_FILE_BODY);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    designerEClass = createEClass(DESIGNER);
    createEAttribute(designerEClass, DESIGNER__DOCUMENTATION);
    createEAttribute(designerEClass, DESIGNER__NAME);
    createEAttribute(designerEClass, DESIGNER__LABEL);
    createEReference(designerEClass, DESIGNER__VIEWPOINTS);

    viewpointEClass = createEClass(VIEWPOINT);
    createEAttribute(viewpointEClass, VIEWPOINT__DOCUMENTATION);
    createEAttribute(viewpointEClass, VIEWPOINT__NAME);
    createEAttribute(viewpointEClass, VIEWPOINT__LABEL);
    createEAttribute(viewpointEClass, VIEWPOINT__MODEL_FILE_EXTENSIONS);
    createEAttribute(viewpointEClass, VIEWPOINT__ICON);
    createEReference(viewpointEClass, VIEWPOINT__REPRESENTATIONS);
    createEReference(viewpointEClass, VIEWPOINT__JAVA_EXTENSION);

    representationEClass = createEClass(REPRESENTATION);

    diagramEClass = createEClass(DIAGRAM);
    createEAttribute(diagramEClass, DIAGRAM__DOCUMENTATION);
    createEAttribute(diagramEClass, DIAGRAM__INITIALIZED);
    createEAttribute(diagramEClass, DIAGRAM__SHOW_ON_STARTUP);
    createEAttribute(diagramEClass, DIAGRAM__ENABLE_POPUP_BARS);
    createEAttribute(diagramEClass, DIAGRAM__METAMODEL_URIS);
    createEAttribute(diagramEClass, DIAGRAM__NAME);
    createEAttribute(diagramEClass, DIAGRAM__LABEL);
    createEAttribute(diagramEClass, DIAGRAM__DOMAIN_CLASS);
    createEAttribute(diagramEClass, DIAGRAM__PRECONDITION);
    createEAttribute(diagramEClass, DIAGRAM__END_USER_DOCUMENTATION);
    createEAttribute(diagramEClass, DIAGRAM__TITLE_EXPRESSION);
    createEAttribute(diagramEClass, DIAGRAM__ROOT_EXPRESSION);
    createEReference(diagramEClass, DIAGRAM__DEFAULT_LAYER);
    createEReference(diagramEClass, DIAGRAM__ADDITIONAL_LAYERS);

    layerEClass = createEClass(LAYER);
    createEAttribute(layerEClass, LAYER__DOCUMENTATION);
    createEAttribute(layerEClass, LAYER__NAME);
    createEAttribute(layerEClass, LAYER__ICON);
    createEReference(layerEClass, LAYER__MAPPINGS);
    createEReference(layerEClass, LAYER__EDGES);
    createEReference(layerEClass, LAYER__SECTIONS);

    sectionEClass = createEClass(SECTION);
    createEAttribute(sectionEClass, SECTION__DOCUMENTATION);
    createEAttribute(sectionEClass, SECTION__NAME);
    createEAttribute(sectionEClass, SECTION__LABEL);
    createEAttribute(sectionEClass, SECTION__ICON);
    createEReference(sectionEClass, SECTION__TOOLS);

    toolEClass = createEClass(TOOL);

    containerCreationEClass = createEClass(CONTAINER_CREATION);
    createEAttribute(containerCreationEClass, CONTAINER_CREATION__DOCUMENTATION);
    createEAttribute(containerCreationEClass, CONTAINER_CREATION__FORCE_REFRESH);
    createEAttribute(containerCreationEClass, CONTAINER_CREATION__NODE_CREATION_VARIABLE);
    createEAttribute(containerCreationEClass, CONTAINER_CREATION__CONTAINER_VIEW_VARIABLE);
    createEAttribute(containerCreationEClass, CONTAINER_CREATION__NAME);
    createEAttribute(containerCreationEClass, CONTAINER_CREATION__LABEL);
    createEAttribute(containerCreationEClass, CONTAINER_CREATION__PRECONDITION);
    createEAttribute(containerCreationEClass, CONTAINER_CREATION__ICON);
    createEReference(containerCreationEClass, CONTAINER_CREATION__CONTAINER_MAPPINGS);
    createEReference(containerCreationEClass, CONTAINER_CREATION__EXTRA_MAPPINGS);
    createEReference(containerCreationEClass, CONTAINER_CREATION__BODY);

    operationEClass = createEClass(OPERATION);

    changeContextEClass = createEClass(CHANGE_CONTEXT);
    createEAttribute(changeContextEClass, CHANGE_CONTEXT__BROWSE_EXPRESSION);
    createEReference(changeContextEClass, CHANGE_CONTEXT__BODY);

    forEClass = createEClass(FOR);
    createEAttribute(forEClass, FOR__ITERATOR_NAME);
    createEAttribute(forEClass, FOR__EXPRESSION);
    createEReference(forEClass, FOR__BODY);

    ifEClass = createEClass(IF);
    createEAttribute(ifEClass, IF__CONDITION_EXPRESSION);
    createEReference(ifEClass, IF__BODY);

    setEClass = createEClass(SET);
    createEAttribute(setEClass, SET__FEATURE_NAME);
    createEAttribute(setEClass, SET__VALUE_EXPRESSION);
    createEReference(setEClass, SET__BODY);

    unsetEClass = createEClass(UNSET);
    createEAttribute(unsetEClass, UNSET__FEATURE_NAME);
    createEAttribute(unsetEClass, UNSET__ELEMENT_EXPRESSION);
    createEReference(unsetEClass, UNSET__BODY);

    createInstanceEClass = createEClass(CREATE_INSTANCE);
    createEAttribute(createInstanceEClass, CREATE_INSTANCE__REFERENCE_NAME);
    createEAttribute(createInstanceEClass, CREATE_INSTANCE__TYPE);
    createEAttribute(createInstanceEClass, CREATE_INSTANCE__VARIABLE_NAME);
    createEReference(createInstanceEClass, CREATE_INSTANCE__BODY);

    createViewEClass = createEClass(CREATE_VIEW);
    createEReference(createViewEClass, CREATE_VIEW__MAPPING);
    createEAttribute(createViewEClass, CREATE_VIEW__CONTAINER_VIEW_EXPRESSION);
    createEAttribute(createViewEClass, CREATE_VIEW__VARIABLE_NAME);
    createEReference(createViewEClass, CREATE_VIEW__BODY);

    createEdgeViewEClass = createEClass(CREATE_EDGE_VIEW);
    createEReference(createEdgeViewEClass, CREATE_EDGE_VIEW__EDGE);
    createEAttribute(createEdgeViewEClass, CREATE_EDGE_VIEW__SOURCE_EXPRESSION);
    createEAttribute(createEdgeViewEClass, CREATE_EDGE_VIEW__TARGET_EXPRESSION);
    createEAttribute(createEdgeViewEClass, CREATE_EDGE_VIEW__CONTAINER_VIEW_EXPRESSION);
    createEAttribute(createEdgeViewEClass, CREATE_EDGE_VIEW__VARIABLE_NAME);
    createEReference(createEdgeViewEClass, CREATE_EDGE_VIEW__BODY);

    deleteViewEClass = createEClass(DELETE_VIEW);
    createEReference(deleteViewEClass, DELETE_VIEW__BODY);

    removeEClass = createEClass(REMOVE);
    createEReference(removeEClass, REMOVE__BODY);

    moveEClass = createEClass(MOVE);
    createEAttribute(moveEClass, MOVE__NEW_CONTAINER_EXPRESSION);
    createEAttribute(moveEClass, MOVE__FEATURE_NAME);
    createEReference(moveEClass, MOVE__BODY);

    switchEClass = createEClass(SWITCH);
    createEReference(switchEClass, SWITCH__CASES);
    createEReference(switchEClass, SWITCH__DEFAULT);

    caseEClass = createEClass(CASE);
    createEAttribute(caseEClass, CASE__CONDITION_EXPRESSION);
    createEReference(caseEClass, CASE__BODY);

    defaultEClass = createEClass(DEFAULT);
    createEReference(defaultEClass, DEFAULT__BODY);

    mappingEClass = createEClass(MAPPING);

    containerEClass = createEClass(CONTAINER);
    createEAttribute(containerEClass, CONTAINER__DOCUMENTATION);
    createEAttribute(containerEClass, CONTAINER__LIST);
    createEAttribute(containerEClass, CONTAINER__NAME);
    createEAttribute(containerEClass, CONTAINER__LABEL);
    createEAttribute(containerEClass, CONTAINER__DOMAIN_CLASS);
    createEReference(containerEClass, CONTAINER__STYLE);
    createEAttribute(containerEClass, CONTAINER__PRECONDITION);
    createEAttribute(containerEClass, CONTAINER__SEMANTIC_CANDITATES_EXPRESSION);
    createEReference(containerEClass, CONTAINER__CONDITIONAL_STYLES);

    conditionalContainerStyleDeclarationEClass = createEClass(CONDITIONAL_CONTAINER_STYLE_DECLARATION);
    createEReference(conditionalContainerStyleDeclarationEClass, CONDITIONAL_CONTAINER_STYLE_DECLARATION__STYLE);
    createEAttribute(conditionalContainerStyleDeclarationEClass, CONDITIONAL_CONTAINER_STYLE_DECLARATION__CONDITIONAL_STYLE_EXPRESSION);

    styleEClass = createEClass(STYLE);

    containerStyleEClass = createEClass(CONTAINER_STYLE);

    gradientEClass = createEClass(GRADIENT);
    createEAttribute(gradientEClass, GRADIENT__DOCUMENTATION);
    createEAttribute(gradientEClass, GRADIENT__DIRECTION);
    createEAttribute(gradientEClass, GRADIENT__NAME);
    createEReference(gradientEClass, GRADIENT__BACKGROUND_COLOR);
    createEReference(gradientEClass, GRADIENT__FOREGROUND_COLOR);
    createEAttribute(gradientEClass, GRADIENT__LABEL_ALIGNMENT);
    createEAttribute(gradientEClass, GRADIENT__LABEL_EXPRESSION);
    createEReference(gradientEClass, GRADIENT__LABEL_COLOR);
    createEAttribute(gradientEClass, GRADIENT__BORDER_SIZE);
    createEReference(gradientEClass, GRADIENT__BORDER_COLOR);
    createEAttribute(gradientEClass, GRADIENT__ICON);
    createEAttribute(gradientEClass, GRADIENT__HEIGHT_COMPUTATION_EXPRESSION);
    createEAttribute(gradientEClass, GRADIENT__WIDTH_COMPUTATION_EXPRESSION);

    edgeEClass = createEClass(EDGE);

    relationBasedEdgeEClass = createEClass(RELATION_BASED_EDGE);
    createEAttribute(relationBasedEdgeEClass, RELATION_BASED_EDGE__DOCUMENTATION);
    createEAttribute(relationBasedEdgeEClass, RELATION_BASED_EDGE__NAME);
    createEAttribute(relationBasedEdgeEClass, RELATION_BASED_EDGE__LABEL);
    createEReference(relationBasedEdgeEClass, RELATION_BASED_EDGE__STYLE);
    createEReference(relationBasedEdgeEClass, RELATION_BASED_EDGE__SOURCE_MAPPINGS);
    createEReference(relationBasedEdgeEClass, RELATION_BASED_EDGE__TARGET_MAPPINGS);
    createEAttribute(relationBasedEdgeEClass, RELATION_BASED_EDGE__TARGET_FINDER_EXPRESSION);

    edgeStyleEClass = createEClass(EDGE_STYLE);
    createEAttribute(edgeStyleEClass, EDGE_STYLE__NAME);
    createEReference(edgeStyleEClass, EDGE_STYLE__STROKE_COLOR);
    createEAttribute(edgeStyleEClass, EDGE_STYLE__LINE_STYLE);
    createEAttribute(edgeStyleEClass, EDGE_STYLE__ROUTING_STYLE);
    createEAttribute(edgeStyleEClass, EDGE_STYLE__SOURCE_ARROW);
    createEAttribute(edgeStyleEClass, EDGE_STYLE__TARGET_ARROW);
    createEAttribute(edgeStyleEClass, EDGE_STYLE__SIZE_COMPUTATION_EXPRESSION);
    createEAttribute(edgeStyleEClass, EDGE_STYLE__FOLDING_STYLE);
    createEAttribute(edgeStyleEClass, EDGE_STYLE__ENDS_CENTERING);

    paletteEClass = createEClass(PALETTE);
    createEAttribute(paletteEClass, PALETTE__DOCUMENTATION);
    createEAttribute(paletteEClass, PALETTE__NAME);
    createEReference(paletteEClass, PALETTE__COLORS);

    colorEClass = createEClass(COLOR);
    createEAttribute(colorEClass, COLOR__NAME);
    createEReference(colorEClass, COLOR__VALUE);

    colorValueEClass = createEClass(COLOR_VALUE);

    rgbEClass = createEClass(RGB);
    createEAttribute(rgbEClass, RGB__RED);
    createEAttribute(rgbEClass, RGB__GREEN);
    createEAttribute(rgbEClass, RGB__BLUE);

    // Create enums
    labelAlignmentEEnum = createEEnum(LABEL_ALIGNMENT);
    gradientDirectionEEnum = createEEnum(GRADIENT_DIRECTION);
    lineStyleEEnum = createEEnum(LINE_STYLE);
    routingStyleEEnum = createEEnum(ROUTING_STYLE);
    arrowDecoratorEEnum = createEEnum(ARROW_DECORATOR);
    foldingStyleEEnum = createEEnum(FOLDING_STYLE);
    endsCenteringEEnum = createEEnum(ENDS_CENTERING);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    designerEClass.getESuperTypes().add(this.getSiriusFileBody());
    representationEClass.getESuperTypes().add(this.getSiriusFileBody());
    diagramEClass.getESuperTypes().add(this.getRepresentation());
    layerEClass.getESuperTypes().add(this.getSiriusFileBody());
    sectionEClass.getESuperTypes().add(this.getSiriusFileBody());
    toolEClass.getESuperTypes().add(this.getSiriusFileBody());
    containerCreationEClass.getESuperTypes().add(this.getTool());
    changeContextEClass.getESuperTypes().add(this.getOperation());
    forEClass.getESuperTypes().add(this.getOperation());
    ifEClass.getESuperTypes().add(this.getOperation());
    setEClass.getESuperTypes().add(this.getOperation());
    unsetEClass.getESuperTypes().add(this.getOperation());
    createInstanceEClass.getESuperTypes().add(this.getOperation());
    createViewEClass.getESuperTypes().add(this.getOperation());
    createEdgeViewEClass.getESuperTypes().add(this.getOperation());
    deleteViewEClass.getESuperTypes().add(this.getOperation());
    removeEClass.getESuperTypes().add(this.getOperation());
    moveEClass.getESuperTypes().add(this.getOperation());
    switchEClass.getESuperTypes().add(this.getOperation());
    mappingEClass.getESuperTypes().add(this.getSiriusFileBody());
    containerEClass.getESuperTypes().add(this.getMapping());
    styleEClass.getESuperTypes().add(this.getSiriusFileBody());
    containerStyleEClass.getESuperTypes().add(this.getStyle());
    gradientEClass.getESuperTypes().add(this.getContainerStyle());
    edgeEClass.getESuperTypes().add(this.getSiriusFileBody());
    relationBasedEdgeEClass.getESuperTypes().add(this.getEdge());
    edgeStyleEClass.getESuperTypes().add(this.getStyle());
    paletteEClass.getESuperTypes().add(this.getSiriusFileBody());
    rgbEClass.getESuperTypes().add(this.getColorValue());

    // Initialize classes and features; add operations and parameters
    initEClass(siriusFileEClass, SiriusFile.class, "SiriusFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSiriusFile_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, SiriusFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSiriusFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, SiriusFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSiriusFile_Imports(), this.getImport(), null, "imports", null, 0, -1, SiriusFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSiriusFile_Body(), this.getSiriusFileBody(), null, "body", null, 0, 1, SiriusFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(siriusFileBodyEClass, SiriusFileBody.class, "SiriusFileBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(designerEClass, Designer.class, "Designer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDesigner_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Designer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDesigner_Name(), ecorePackage.getEString(), "name", null, 0, 1, Designer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDesigner_Label(), ecorePackage.getEString(), "label", null, 0, 1, Designer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDesigner_Viewpoints(), this.getViewpoint(), null, "viewpoints", null, 0, -1, Designer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewpointEClass, Viewpoint.class, "Viewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getViewpoint_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewpoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewpoint_Label(), ecorePackage.getEString(), "label", null, 0, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewpoint_ModelFileExtensions(), ecorePackage.getEString(), "modelFileExtensions", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewpoint_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewpoint_Representations(), this.getRepresentation(), null, "representations", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewpoint_JavaExtension(), theTypesPackage.getJvmType(), null, "javaExtension", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(representationEClass, Representation.class, "Representation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDiagram_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagram_Initialized(), ecorePackage.getEBoolean(), "initialized", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagram_ShowOnStartup(), ecorePackage.getEBoolean(), "showOnStartup", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagram_EnablePopupBars(), ecorePackage.getEBoolean(), "enablePopupBars", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagram_MetamodelUris(), ecorePackage.getEString(), "metamodelUris", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagram_Label(), ecorePackage.getEString(), "label", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagram_DomainClass(), ecorePackage.getEString(), "domainClass", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagram_Precondition(), ecorePackage.getEString(), "precondition", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagram_EndUserDocumentation(), ecorePackage.getEString(), "endUserDocumentation", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagram_TitleExpression(), ecorePackage.getEString(), "titleExpression", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagram_RootExpression(), ecorePackage.getEString(), "rootExpression", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagram_DefaultLayer(), this.getLayer(), null, "defaultLayer", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagram_AdditionalLayers(), this.getLayer(), null, "additionalLayers", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(layerEClass, Layer.class, "Layer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLayer_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLayer_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayer_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayer_Edges(), this.getEdge(), null, "edges", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayer_Sections(), this.getSection(), null, "sections", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSection_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSection_Label(), ecorePackage.getEString(), "label", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSection_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSection_Tools(), this.getTool(), null, "tools", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(containerCreationEClass, ContainerCreation.class, "ContainerCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContainerCreation_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, ContainerCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainerCreation_ForceRefresh(), ecorePackage.getEBoolean(), "forceRefresh", null, 0, 1, ContainerCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainerCreation_NodeCreationVariable(), ecorePackage.getEString(), "nodeCreationVariable", null, 0, 1, ContainerCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainerCreation_ContainerViewVariable(), ecorePackage.getEString(), "containerViewVariable", null, 0, 1, ContainerCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainerCreation_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContainerCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainerCreation_Label(), ecorePackage.getEString(), "label", null, 0, 1, ContainerCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainerCreation_Precondition(), ecorePackage.getEString(), "precondition", null, 0, 1, ContainerCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainerCreation_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, ContainerCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerCreation_ContainerMappings(), this.getMapping(), null, "containerMappings", null, 0, -1, ContainerCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerCreation_ExtraMappings(), this.getMapping(), null, "extraMappings", null, 0, -1, ContainerCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerCreation_Body(), this.getOperation(), null, "body", null, 0, 1, ContainerCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(changeContextEClass, ChangeContext.class, "ChangeContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChangeContext_BrowseExpression(), ecorePackage.getEString(), "browseExpression", null, 0, 1, ChangeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChangeContext_Body(), this.getOperation(), null, "body", null, 0, -1, ChangeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forEClass, For.class, "For", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFor_IteratorName(), ecorePackage.getEString(), "iteratorName", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFor_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_Body(), this.getOperation(), null, "body", null, 0, -1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIf_ConditionExpression(), ecorePackage.getEString(), "conditionExpression", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIf_Body(), this.getOperation(), null, "body", null, 0, -1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSet_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSet_ValueExpression(), ecorePackage.getEString(), "valueExpression", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSet_Body(), this.getOperation(), null, "body", null, 0, -1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unsetEClass, Unset.class, "Unset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnset_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, Unset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnset_ElementExpression(), ecorePackage.getEString(), "elementExpression", null, 0, 1, Unset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnset_Body(), this.getOperation(), null, "body", null, 0, -1, Unset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createInstanceEClass, CreateInstance.class, "CreateInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateInstance_ReferenceName(), ecorePackage.getEString(), "referenceName", null, 0, 1, CreateInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateInstance_Type(), ecorePackage.getEString(), "type", null, 0, 1, CreateInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateInstance_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, CreateInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateInstance_Body(), this.getOperation(), null, "body", null, 0, -1, CreateInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createViewEClass, CreateView.class, "CreateView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreateView_Mapping(), this.getMapping(), null, "mapping", null, 0, 1, CreateView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateView_ContainerViewExpression(), ecorePackage.getEString(), "containerViewExpression", null, 0, 1, CreateView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateView_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, CreateView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateView_Body(), this.getOperation(), null, "body", null, 0, -1, CreateView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createEdgeViewEClass, CreateEdgeView.class, "CreateEdgeView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreateEdgeView_Edge(), this.getEdge(), null, "edge", null, 0, 1, CreateEdgeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateEdgeView_SourceExpression(), ecorePackage.getEString(), "sourceExpression", null, 0, 1, CreateEdgeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateEdgeView_TargetExpression(), ecorePackage.getEString(), "targetExpression", null, 0, 1, CreateEdgeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateEdgeView_ContainerViewExpression(), ecorePackage.getEString(), "containerViewExpression", null, 0, 1, CreateEdgeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateEdgeView_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, CreateEdgeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateEdgeView_Body(), this.getOperation(), null, "body", null, 0, -1, CreateEdgeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deleteViewEClass, DeleteView.class, "DeleteView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeleteView_Body(), this.getOperation(), null, "body", null, 0, -1, DeleteView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(removeEClass, Remove.class, "Remove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRemove_Body(), this.getOperation(), null, "body", null, 0, -1, Remove.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moveEClass, Move.class, "Move", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMove_NewContainerExpression(), ecorePackage.getEString(), "newContainerExpression", null, 0, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMove_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMove_Body(), this.getOperation(), null, "body", null, 0, -1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitch_Cases(), this.getCase(), null, "cases", null, 0, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_Default(), this.getDefault(), null, "default", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCase_ConditionExpression(), ecorePackage.getEString(), "conditionExpression", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCase_Body(), this.getOperation(), null, "body", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultEClass, Default.class, "Default", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefault_Body(), this.getOperation(), null, "body", null, 0, -1, Default.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(containerEClass, org.obeonetwork.sirius.text.siriusTextDsl.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContainer_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, org.obeonetwork.sirius.text.siriusTextDsl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_List(), ecorePackage.getEBoolean(), "list", null, 0, 1, org.obeonetwork.sirius.text.siriusTextDsl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.obeonetwork.sirius.text.siriusTextDsl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_Label(), ecorePackage.getEString(), "label", null, 0, 1, org.obeonetwork.sirius.text.siriusTextDsl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_DomainClass(), ecorePackage.getEString(), "domainClass", null, 0, 1, org.obeonetwork.sirius.text.siriusTextDsl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_Style(), this.getContainerStyle(), null, "style", null, 0, 1, org.obeonetwork.sirius.text.siriusTextDsl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_Precondition(), ecorePackage.getEString(), "precondition", null, 0, 1, org.obeonetwork.sirius.text.siriusTextDsl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_SemanticCanditatesExpression(), ecorePackage.getEString(), "semanticCanditatesExpression", null, 0, 1, org.obeonetwork.sirius.text.siriusTextDsl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_ConditionalStyles(), this.getConditionalContainerStyleDeclaration(), null, "conditionalStyles", null, 0, -1, org.obeonetwork.sirius.text.siriusTextDsl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalContainerStyleDeclarationEClass, ConditionalContainerStyleDeclaration.class, "ConditionalContainerStyleDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionalContainerStyleDeclaration_Style(), this.getContainerStyle(), null, "style", null, 0, 1, ConditionalContainerStyleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionalContainerStyleDeclaration_ConditionalStyleExpression(), ecorePackage.getEString(), "conditionalStyleExpression", null, 0, 1, ConditionalContainerStyleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(containerStyleEClass, ContainerStyle.class, "ContainerStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gradientEClass, Gradient.class, "Gradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGradient_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGradient_Direction(), this.getGradientDirection(), "direction", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGradient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGradient_BackgroundColor(), this.getColor(), null, "backgroundColor", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGradient_ForegroundColor(), this.getColor(), null, "foregroundColor", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGradient_LabelAlignment(), this.getLabelAlignment(), "labelAlignment", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGradient_LabelExpression(), ecorePackage.getEString(), "labelExpression", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGradient_LabelColor(), this.getColor(), null, "labelColor", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGradient_BorderSize(), ecorePackage.getEInt(), "borderSize", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGradient_BorderColor(), this.getColor(), null, "borderColor", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGradient_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGradient_HeightComputationExpression(), ecorePackage.getEString(), "heightComputationExpression", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGradient_WidthComputationExpression(), ecorePackage.getEString(), "widthComputationExpression", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationBasedEdgeEClass, RelationBasedEdge.class, "RelationBasedEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationBasedEdge_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, RelationBasedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationBasedEdge_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationBasedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationBasedEdge_Label(), ecorePackage.getEString(), "label", null, 0, 1, RelationBasedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationBasedEdge_Style(), this.getEdgeStyle(), null, "style", null, 0, 1, RelationBasedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationBasedEdge_SourceMappings(), this.getMapping(), null, "sourceMappings", null, 0, -1, RelationBasedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationBasedEdge_TargetMappings(), this.getMapping(), null, "targetMappings", null, 0, -1, RelationBasedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationBasedEdge_TargetFinderExpression(), ecorePackage.getEString(), "targetFinderExpression", null, 0, 1, RelationBasedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edgeStyleEClass, EdgeStyle.class, "EdgeStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEdgeStyle_Name(), ecorePackage.getEString(), "name", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEdgeStyle_StrokeColor(), this.getColor(), null, "strokeColor", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEdgeStyle_LineStyle(), this.getLineStyle(), "lineStyle", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEdgeStyle_RoutingStyle(), this.getRoutingStyle(), "routingStyle", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEdgeStyle_SourceArrow(), this.getArrowDecorator(), "sourceArrow", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEdgeStyle_TargetArrow(), this.getArrowDecorator(), "targetArrow", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEdgeStyle_SizeComputationExpression(), ecorePackage.getEString(), "sizeComputationExpression", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEdgeStyle_FoldingStyle(), this.getFoldingStyle(), "foldingStyle", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEdgeStyle_EndsCentering(), this.getEndsCentering(), "endsCentering", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paletteEClass, Palette.class, "Palette", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPalette_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPalette_Name(), ecorePackage.getEString(), "name", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPalette_Colors(), this.getColor(), null, "colors", null, 0, -1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColor_Value(), this.getColorValue(), null, "value", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorValueEClass, ColorValue.class, "ColorValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rgbEClass, org.obeonetwork.sirius.text.siriusTextDsl.RGB.class, "RGB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRGB_Red(), ecorePackage.getEInt(), "red", null, 0, 1, org.obeonetwork.sirius.text.siriusTextDsl.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGB_Green(), ecorePackage.getEInt(), "green", null, 0, 1, org.obeonetwork.sirius.text.siriusTextDsl.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGB_Blue(), ecorePackage.getEInt(), "blue", null, 0, 1, org.obeonetwork.sirius.text.siriusTextDsl.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(labelAlignmentEEnum, LabelAlignment.class, "LabelAlignment");
    addEEnumLiteral(labelAlignmentEEnum, LabelAlignment.LEFT);
    addEEnumLiteral(labelAlignmentEEnum, LabelAlignment.CENTER);
    addEEnumLiteral(labelAlignmentEEnum, LabelAlignment.RIGHT);

    initEEnum(gradientDirectionEEnum, GradientDirection.class, "GradientDirection");
    addEEnumLiteral(gradientDirectionEEnum, GradientDirection.OBLIQUE);
    addEEnumLiteral(gradientDirectionEEnum, GradientDirection.LEFTTORIGHT);
    addEEnumLiteral(gradientDirectionEEnum, GradientDirection.TOPTOBOTTOM);

    initEEnum(lineStyleEEnum, LineStyle.class, "LineStyle");
    addEEnumLiteral(lineStyleEEnum, LineStyle.SOLID);
    addEEnumLiteral(lineStyleEEnum, LineStyle.DASH);
    addEEnumLiteral(lineStyleEEnum, LineStyle.DOT);
    addEEnumLiteral(lineStyleEEnum, LineStyle.DASH_DOT);

    initEEnum(routingStyleEEnum, RoutingStyle.class, "RoutingStyle");
    addEEnumLiteral(routingStyleEEnum, RoutingStyle.STRAIGHT);
    addEEnumLiteral(routingStyleEEnum, RoutingStyle.MANHATTAN);
    addEEnumLiteral(routingStyleEEnum, RoutingStyle.TREE);

    initEEnum(arrowDecoratorEEnum, ArrowDecorator.class, "ArrowDecorator");
    addEEnumLiteral(arrowDecoratorEEnum, ArrowDecorator.NO_DECORATION);
    addEEnumLiteral(arrowDecoratorEEnum, ArrowDecorator.OUTPUT_ARROW);
    addEEnumLiteral(arrowDecoratorEEnum, ArrowDecorator.INPUT_ARROW);
    addEEnumLiteral(arrowDecoratorEEnum, ArrowDecorator.OUTPUT_CLOSED_ARROW);
    addEEnumLiteral(arrowDecoratorEEnum, ArrowDecorator.INPUT_CLOSED_ARROW);
    addEEnumLiteral(arrowDecoratorEEnum, ArrowDecorator.OUTPUT_FILL_CLOSED_ARROW);
    addEEnumLiteral(arrowDecoratorEEnum, ArrowDecorator.INPUT_FILL_CLOSED_ARROW);
    addEEnumLiteral(arrowDecoratorEEnum, ArrowDecorator.DIAMOND);
    addEEnumLiteral(arrowDecoratorEEnum, ArrowDecorator.FILL_DIAMOND);
    addEEnumLiteral(arrowDecoratorEEnum, ArrowDecorator.INPUT_ARROW_WITH_DIAMOND);
    addEEnumLiteral(arrowDecoratorEEnum, ArrowDecorator.INPUT_ARROW_WITH_FILL_DIAMOND);

    initEEnum(foldingStyleEEnum, FoldingStyle.class, "FoldingStyle");
    addEEnumLiteral(foldingStyleEEnum, FoldingStyle.NONE);
    addEEnumLiteral(foldingStyleEEnum, FoldingStyle.SOURCE);
    addEEnumLiteral(foldingStyleEEnum, FoldingStyle.TARGET);

    initEEnum(endsCenteringEEnum, EndsCentering.class, "EndsCentering");
    addEEnumLiteral(endsCenteringEEnum, EndsCentering.NONE);
    addEEnumLiteral(endsCenteringEEnum, EndsCentering.BOTH);
    addEEnumLiteral(endsCenteringEEnum, EndsCentering.SOURCE);
    addEEnumLiteral(endsCenteringEEnum, EndsCentering.TARGET);

    // Create resource
    createResource(eNS_URI);
  }

} //SiriusTextDslPackageImpl
