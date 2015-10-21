/**
 */
package org.obeonetwork.sirius.text.siriusTextDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.sirius.text.siriusTextDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage
 * @generated
 */
public class SiriusTextDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SiriusTextDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiriusTextDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SiriusTextDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SiriusTextDslSwitch<Adapter> modelSwitch =
    new SiriusTextDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseSiriusFile(SiriusFile object)
      {
        return createSiriusFileAdapter();
      }
      @Override
      public Adapter caseSiriusFileBody(SiriusFileBody object)
      {
        return createSiriusFileBodyAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseDesigner(Designer object)
      {
        return createDesignerAdapter();
      }
      @Override
      public Adapter caseViewpoint(Viewpoint object)
      {
        return createViewpointAdapter();
      }
      @Override
      public Adapter caseRepresentation(Representation object)
      {
        return createRepresentationAdapter();
      }
      @Override
      public Adapter caseDiagram(Diagram object)
      {
        return createDiagramAdapter();
      }
      @Override
      public Adapter caseLayer(Layer object)
      {
        return createLayerAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseContainer(Container object)
      {
        return createContainerAdapter();
      }
      @Override
      public Adapter caseConditionalContainerStyleDeclaration(ConditionalContainerStyleDeclaration object)
      {
        return createConditionalContainerStyleDeclarationAdapter();
      }
      @Override
      public Adapter caseStyle(Style object)
      {
        return createStyleAdapter();
      }
      @Override
      public Adapter caseContainerStyle(ContainerStyle object)
      {
        return createContainerStyleAdapter();
      }
      @Override
      public Adapter caseGradient(Gradient object)
      {
        return createGradientAdapter();
      }
      @Override
      public Adapter casePalette(Palette object)
      {
        return createPaletteAdapter();
      }
      @Override
      public Adapter caseColor(Color object)
      {
        return createColorAdapter();
      }
      @Override
      public Adapter caseColorValue(ColorValue object)
      {
        return createColorValueAdapter();
      }
      @Override
      public Adapter caseRGB(RGB object)
      {
        return createRGBAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile <em>Sirius File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile
   * @generated
   */
  public Adapter createSiriusFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.SiriusFileBody <em>Sirius File Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.SiriusFileBody
   * @generated
   */
  public Adapter createSiriusFileBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Designer <em>Designer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Designer
   * @generated
   */
  public Adapter createDesignerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint <em>Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint
   * @generated
   */
  public Adapter createViewpointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Representation <em>Representation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Representation
   * @generated
   */
  public Adapter createRepresentationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Diagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Diagram
   * @generated
   */
  public Adapter createDiagramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Layer
   * @generated
   */
  public Adapter createLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Container
   * @generated
   */
  public Adapter createContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration <em>Conditional Container Style Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration
   * @generated
   */
  public Adapter createConditionalContainerStyleDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Style
   * @generated
   */
  public Adapter createStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerStyle <em>Container Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerStyle
   * @generated
   */
  public Adapter createContainerStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Gradient <em>Gradient</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Gradient
   * @generated
   */
  public Adapter createGradientAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Palette <em>Palette</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Palette
   * @generated
   */
  public Adapter createPaletteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Color
   * @generated
   */
  public Adapter createColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.ColorValue <em>Color Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ColorValue
   * @generated
   */
  public Adapter createColorValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.RGB <em>RGB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RGB
   * @generated
   */
  public Adapter createRGBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SiriusTextDslAdapterFactory
