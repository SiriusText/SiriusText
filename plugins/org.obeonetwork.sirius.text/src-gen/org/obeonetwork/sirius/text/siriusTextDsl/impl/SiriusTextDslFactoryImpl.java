/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.sirius.text.siriusTextDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiriusTextDslFactoryImpl extends EFactoryImpl implements SiriusTextDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SiriusTextDslFactory init()
  {
    try
    {
      SiriusTextDslFactory theSiriusTextDslFactory = (SiriusTextDslFactory)EPackage.Registry.INSTANCE.getEFactory(SiriusTextDslPackage.eNS_URI);
      if (theSiriusTextDslFactory != null)
      {
        return theSiriusTextDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SiriusTextDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiriusTextDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SiriusTextDslPackage.SIRIUS_FILE: return createSiriusFile();
      case SiriusTextDslPackage.SIRIUS_FILE_BODY: return createSiriusFileBody();
      case SiriusTextDslPackage.IMPORT: return createImport();
      case SiriusTextDslPackage.DESIGNER: return createDesigner();
      case SiriusTextDslPackage.VIEWPOINT: return createViewpoint();
      case SiriusTextDslPackage.REPRESENTATION: return createRepresentation();
      case SiriusTextDslPackage.DIAGRAM: return createDiagram();
      case SiriusTextDslPackage.LAYER: return createLayer();
      case SiriusTextDslPackage.MAPPING: return createMapping();
      case SiriusTextDslPackage.CONTAINER: return createContainer();
      case SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION: return createConditionalContainerStyleDeclaration();
      case SiriusTextDslPackage.STYLE: return createStyle();
      case SiriusTextDslPackage.CONTAINER_STYLE: return createContainerStyle();
      case SiriusTextDslPackage.GRADIENT: return createGradient();
      case SiriusTextDslPackage.PALETTE: return createPalette();
      case SiriusTextDslPackage.COLOR: return createColor();
      case SiriusTextDslPackage.COLOR_VALUE: return createColorValue();
      case SiriusTextDslPackage.RGB: return createRGB();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SiriusTextDslPackage.LABEL_ALIGNMENT:
        return createLabelAlignmentFromString(eDataType, initialValue);
      case SiriusTextDslPackage.GRADIENT_DIRECTION:
        return createGradientDirectionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SiriusTextDslPackage.LABEL_ALIGNMENT:
        return convertLabelAlignmentToString(eDataType, instanceValue);
      case SiriusTextDslPackage.GRADIENT_DIRECTION:
        return convertGradientDirectionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiriusFile createSiriusFile()
  {
    SiriusFileImpl siriusFile = new SiriusFileImpl();
    return siriusFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiriusFileBody createSiriusFileBody()
  {
    SiriusFileBodyImpl siriusFileBody = new SiriusFileBodyImpl();
    return siriusFileBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Designer createDesigner()
  {
    DesignerImpl designer = new DesignerImpl();
    return designer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Viewpoint createViewpoint()
  {
    ViewpointImpl viewpoint = new ViewpointImpl();
    return viewpoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Representation createRepresentation()
  {
    RepresentationImpl representation = new RepresentationImpl();
    return representation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Diagram createDiagram()
  {
    DiagramImpl diagram = new DiagramImpl();
    return diagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layer createLayer()
  {
    LayerImpl layer = new LayerImpl();
    return layer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.obeonetwork.sirius.text.siriusTextDsl.Container createContainer()
  {
    ContainerImpl container = new ContainerImpl();
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalContainerStyleDeclaration createConditionalContainerStyleDeclaration()
  {
    ConditionalContainerStyleDeclarationImpl conditionalContainerStyleDeclaration = new ConditionalContainerStyleDeclarationImpl();
    return conditionalContainerStyleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style createStyle()
  {
    StyleImpl style = new StyleImpl();
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerStyle createContainerStyle()
  {
    ContainerStyleImpl containerStyle = new ContainerStyleImpl();
    return containerStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Gradient createGradient()
  {
    GradientImpl gradient = new GradientImpl();
    return gradient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Palette createPalette()
  {
    PaletteImpl palette = new PaletteImpl();
    return palette;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorValue createColorValue()
  {
    ColorValueImpl colorValue = new ColorValueImpl();
    return colorValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RGB createRGB()
  {
    RGBImpl rgb = new RGBImpl();
    return rgb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelAlignment createLabelAlignmentFromString(EDataType eDataType, String initialValue)
  {
    LabelAlignment result = LabelAlignment.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLabelAlignmentToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GradientDirection createGradientDirectionFromString(EDataType eDataType, String initialValue)
  {
    GradientDirection result = GradientDirection.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGradientDirectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiriusTextDslPackage getSiriusTextDslPackage()
  {
    return (SiriusTextDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SiriusTextDslPackage getPackage()
  {
    return SiriusTextDslPackage.eINSTANCE;
  }

} //SiriusTextDslFactoryImpl
