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
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter caseTool(Tool object)
      {
        return createToolAdapter();
      }
      @Override
      public Adapter caseContainerCreation(ContainerCreation object)
      {
        return createContainerCreationAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseChangeContext(ChangeContext object)
      {
        return createChangeContextAdapter();
      }
      @Override
      public Adapter caseFor(For object)
      {
        return createForAdapter();
      }
      @Override
      public Adapter caseIf(If object)
      {
        return createIfAdapter();
      }
      @Override
      public Adapter caseSet(Set object)
      {
        return createSetAdapter();
      }
      @Override
      public Adapter caseUnset(Unset object)
      {
        return createUnsetAdapter();
      }
      @Override
      public Adapter caseCreateInstance(CreateInstance object)
      {
        return createCreateInstanceAdapter();
      }
      @Override
      public Adapter caseCreateView(CreateView object)
      {
        return createCreateViewAdapter();
      }
      @Override
      public Adapter caseCreateEdgeView(CreateEdgeView object)
      {
        return createCreateEdgeViewAdapter();
      }
      @Override
      public Adapter caseDeleteView(DeleteView object)
      {
        return createDeleteViewAdapter();
      }
      @Override
      public Adapter caseRemove(Remove object)
      {
        return createRemoveAdapter();
      }
      @Override
      public Adapter caseMove(Move object)
      {
        return createMoveAdapter();
      }
      @Override
      public Adapter caseSwitch(Switch object)
      {
        return createSwitchAdapter();
      }
      @Override
      public Adapter caseCase(Case object)
      {
        return createCaseAdapter();
      }
      @Override
      public Adapter caseDefault(Default object)
      {
        return createDefaultAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseContainer(Container object)
      {
        return createContainerAdapter();
      }
      @Override
      public Adapter caseConditionalNodeStyleDeclaration(ConditionalNodeStyleDeclaration object)
      {
        return createConditionalNodeStyleDeclarationAdapter();
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
      public Adapter caseNodeStyle(NodeStyle object)
      {
        return createNodeStyleAdapter();
      }
      @Override
      public Adapter caseSquare(Square object)
      {
        return createSquareAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseBorder(Border object)
      {
        return createBorderAdapter();
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
      public Adapter caseEdge(Edge object)
      {
        return createEdgeAdapter();
      }
      @Override
      public Adapter caseRelationBasedEdge(RelationBasedEdge object)
      {
        return createRelationBasedEdgeAdapter();
      }
      @Override
      public Adapter caseEdgeStyle(EdgeStyle object)
      {
        return createEdgeStyleAdapter();
      }
      @Override
      public Adapter caseEdgeLabel(EdgeLabel object)
      {
        return createEdgeLabelAdapter();
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
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Tool <em>Tool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Tool
   * @generated
   */
  public Adapter createToolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation <em>Container Creation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation
   * @generated
   */
  public Adapter createContainerCreationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext <em>Change Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext
   * @generated
   */
  public Adapter createChangeContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.For
   * @generated
   */
  public Adapter createForAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.If
   * @generated
   */
  public Adapter createIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Set <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Set
   * @generated
   */
  public Adapter createSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Unset <em>Unset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Unset
   * @generated
   */
  public Adapter createUnsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance <em>Create Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance
   * @generated
   */
  public Adapter createCreateInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateView <em>Create View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateView
   * @generated
   */
  public Adapter createCreateViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView <em>Create Edge View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView
   * @generated
   */
  public Adapter createCreateEdgeViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.DeleteView <em>Delete View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.DeleteView
   * @generated
   */
  public Adapter createDeleteViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Remove <em>Remove</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Remove
   * @generated
   */
  public Adapter createRemoveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Move <em>Move</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Move
   * @generated
   */
  public Adapter createMoveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Switch
   * @generated
   */
  public Adapter createSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Case
   * @generated
   */
  public Adapter createCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Default <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Default
   * @generated
   */
  public Adapter createDefaultAdapter()
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
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Node
   * @generated
   */
  public Adapter createNodeAdapter()
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
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration <em>Conditional Node Style Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.ConditionalNodeStyleDeclaration
   * @generated
   */
  public Adapter createConditionalNodeStyleDeclarationAdapter()
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
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.NodeStyle <em>Node Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.NodeStyle
   * @generated
   */
  public Adapter createNodeStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Square <em>Square</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Square
   * @generated
   */
  public Adapter createSquareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Border <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Border
   * @generated
   */
  public Adapter createBorderAdapter()
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
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.Edge <em>Edge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.Edge
   * @generated
   */
  public Adapter createEdgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge <em>Relation Based Edge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge
   * @generated
   */
  public Adapter createRelationBasedEdgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle <em>Edge Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle
   * @generated
   */
  public Adapter createEdgeStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel <em>Edge Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.sirius.text.siriusTextDsl.EdgeLabel
   * @generated
   */
  public Adapter createEdgeLabelAdapter()
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
