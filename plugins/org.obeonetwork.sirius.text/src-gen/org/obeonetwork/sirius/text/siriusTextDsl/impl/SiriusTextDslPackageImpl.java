/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator;
import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.ColorValue;
import org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration;
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.Designer;
import org.obeonetwork.sirius.text.siriusTextDsl.Diagram;
import org.obeonetwork.sirius.text.siriusTextDsl.Edge;
import org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering;
import org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.Gradient;
import org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection;
import org.obeonetwork.sirius.text.siriusTextDsl.Import;
import org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment;
import org.obeonetwork.sirius.text.siriusTextDsl.Layer;
import org.obeonetwork.sirius.text.siriusTextDsl.LineStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.Mapping;
import org.obeonetwork.sirius.text.siriusTextDsl.Palette;
import org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge;
import org.obeonetwork.sirius.text.siriusTextDsl.Representation;
import org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFileBody;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslFactory;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;
import org.obeonetwork.sirius.text.siriusTextDsl.Style;
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    designerEClass.getESuperTypes().add(this.getSiriusFileBody());
    representationEClass.getESuperTypes().add(this.getSiriusFileBody());
    diagramEClass.getESuperTypes().add(this.getRepresentation());
    layerEClass.getESuperTypes().add(this.getSiriusFileBody());
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
