/*
 * generated by Xtext
 */
package org.obeonetwork.sirius.text.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.obeonetwork.sirius.text.services.SiriusTextDslGrammarAccess;
import org.obeonetwork.sirius.text.siriusTextDsl.Case;
import org.obeonetwork.sirius.text.siriusTextDsl.ChangeContext;
import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration;
import org.obeonetwork.sirius.text.siriusTextDsl.Container;
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation;
import org.obeonetwork.sirius.text.siriusTextDsl.CreateEdgeView;
import org.obeonetwork.sirius.text.siriusTextDsl.CreateInstance;
import org.obeonetwork.sirius.text.siriusTextDsl.CreateView;
import org.obeonetwork.sirius.text.siriusTextDsl.Default;
import org.obeonetwork.sirius.text.siriusTextDsl.DeleteView;
import org.obeonetwork.sirius.text.siriusTextDsl.Designer;
import org.obeonetwork.sirius.text.siriusTextDsl.Diagram;
import org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.For;
import org.obeonetwork.sirius.text.siriusTextDsl.Gradient;
import org.obeonetwork.sirius.text.siriusTextDsl.If;
import org.obeonetwork.sirius.text.siriusTextDsl.Import;
import org.obeonetwork.sirius.text.siriusTextDsl.Layer;
import org.obeonetwork.sirius.text.siriusTextDsl.Move;
import org.obeonetwork.sirius.text.siriusTextDsl.Palette;
import org.obeonetwork.sirius.text.siriusTextDsl.RGB;
import org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge;
import org.obeonetwork.sirius.text.siriusTextDsl.Remove;
import org.obeonetwork.sirius.text.siriusTextDsl.Section;
import org.obeonetwork.sirius.text.siriusTextDsl.Set;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;
import org.obeonetwork.sirius.text.siriusTextDsl.Switch;
import org.obeonetwork.sirius.text.siriusTextDsl.Unset;
import org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint;

@SuppressWarnings("all")
public class SiriusTextDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SiriusTextDslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SiriusTextDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SiriusTextDslPackage.CASE:
				sequence_Case(context, (Case) semanticObject); 
				return; 
			case SiriusTextDslPackage.CHANGE_CONTEXT:
				sequence_ChangeContext(context, (ChangeContext) semanticObject); 
				return; 
			case SiriusTextDslPackage.COLOR:
				sequence_Color(context, (Color) semanticObject); 
				return; 
			case SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION:
				sequence_ConditionalContainerStyleDeclaration(context, (ConditionalContainerStyleDeclaration) semanticObject); 
				return; 
			case SiriusTextDslPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case SiriusTextDslPackage.CONTAINER_CREATION:
				sequence_ContainerCreation(context, (ContainerCreation) semanticObject); 
				return; 
			case SiriusTextDslPackage.CREATE_EDGE_VIEW:
				sequence_CreateEdgeView(context, (CreateEdgeView) semanticObject); 
				return; 
			case SiriusTextDslPackage.CREATE_INSTANCE:
				sequence_CreateInstance(context, (CreateInstance) semanticObject); 
				return; 
			case SiriusTextDslPackage.CREATE_VIEW:
				sequence_CreateView(context, (CreateView) semanticObject); 
				return; 
			case SiriusTextDslPackage.DEFAULT:
				sequence_Default(context, (Default) semanticObject); 
				return; 
			case SiriusTextDslPackage.DELETE_VIEW:
				sequence_DeleteView(context, (DeleteView) semanticObject); 
				return; 
			case SiriusTextDslPackage.DESIGNER:
				sequence_Designer(context, (Designer) semanticObject); 
				return; 
			case SiriusTextDslPackage.DIAGRAM:
				sequence_Diagram(context, (Diagram) semanticObject); 
				return; 
			case SiriusTextDslPackage.EDGE_STYLE:
				sequence_EdgeStyle(context, (EdgeStyle) semanticObject); 
				return; 
			case SiriusTextDslPackage.FOR:
				sequence_For(context, (For) semanticObject); 
				return; 
			case SiriusTextDslPackage.GRADIENT:
				sequence_Gradient(context, (Gradient) semanticObject); 
				return; 
			case SiriusTextDslPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case SiriusTextDslPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case SiriusTextDslPackage.LAYER:
				sequence_Layer(context, (Layer) semanticObject); 
				return; 
			case SiriusTextDslPackage.MOVE:
				sequence_Move(context, (Move) semanticObject); 
				return; 
			case SiriusTextDslPackage.PALETTE:
				sequence_Palette(context, (Palette) semanticObject); 
				return; 
			case SiriusTextDslPackage.RGB:
				sequence_RGB(context, (RGB) semanticObject); 
				return; 
			case SiriusTextDslPackage.RELATION_BASED_EDGE:
				sequence_RelationBasedEdge(context, (RelationBasedEdge) semanticObject); 
				return; 
			case SiriusTextDslPackage.REMOVE:
				sequence_Remove(context, (Remove) semanticObject); 
				return; 
			case SiriusTextDslPackage.SECTION:
				sequence_Section(context, (Section) semanticObject); 
				return; 
			case SiriusTextDslPackage.SET:
				sequence_Set(context, (Set) semanticObject); 
				return; 
			case SiriusTextDslPackage.SIRIUS_FILE:
				sequence_SiriusFile(context, (SiriusFile) semanticObject); 
				return; 
			case SiriusTextDslPackage.SWITCH:
				sequence_Switch(context, (Switch) semanticObject); 
				return; 
			case SiriusTextDslPackage.UNSET:
				sequence_Unset(context, (Unset) semanticObject); 
				return; 
			case SiriusTextDslPackage.VIEWPOINT:
				sequence_Viewpoint(context, (Viewpoint) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (conditionExpression=EXPRESSION body+=Operation*)
	 */
	protected void sequence_Case(EObject context, Case semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (browseExpression=EXPRESSION body+=Operation*)
	 */
	protected void sequence_ChangeContext(EObject context, ChangeContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=ColorValue)
	 */
	protected void sequence_Color(EObject context, Color semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SiriusTextDslPackage.Literals.COLOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SiriusTextDslPackage.Literals.COLOR__NAME));
			if(transientValues.isValueTransient(semanticObject, SiriusTextDslPackage.Literals.COLOR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SiriusTextDslPackage.Literals.COLOR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getColorAccess().getValueColorValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (style=[ContainerStyle|QualifiedName] conditionalStyleExpression=EXPRESSION)
	 */
	protected void sequence_ConditionalContainerStyleDeclaration(EObject context, ConditionalContainerStyleDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SiriusTextDslPackage.Literals.CONDITIONAL_CONTAINER_STYLE_DECLARATION__STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SiriusTextDslPackage.Literals.CONDITIONAL_CONTAINER_STYLE_DECLARATION__STYLE));
			if(transientValues.isValueTransient(semanticObject, SiriusTextDslPackage.Literals.CONDITIONAL_CONTAINER_STYLE_DECLARATION__CONDITIONAL_STYLE_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SiriusTextDslPackage.Literals.CONDITIONAL_CONTAINER_STYLE_DECLARATION__CONDITIONAL_STYLE_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleQualifiedNameParserRuleCall_1_0_1(), semanticObject.getStyle());
		feeder.accept(grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionEXPRESSIONTerminalRuleCall_3_0(), semanticObject.getConditionalStyleExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation=DOCUMENTATION? 
	 *         forceRefresh?='@ForceRefresh'? 
	 *         nodeCreationVariable=STRING 
	 *         containerViewVariable=STRING 
	 *         name=ID 
	 *         label=STRING? 
	 *         precondition=EXPRESSION? 
	 *         icon=STRING? 
	 *         (containerMappings+=[Mapping|QualifiedName] containerMappings+=[Mapping|QualifiedName]*)? 
	 *         (extraMappings+=[Mapping|QualifiedName] extraMappings+=[Mapping|QualifiedName]*)? 
	 *         body=Operation?
	 *     )
	 */
	protected void sequence_ContainerCreation(EObject context, ContainerCreation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation=DOCUMENTATION? 
	 *         list?='list'? 
	 *         name=ID 
	 *         label=STRING? 
	 *         domainClass=STRING 
	 *         style=[ContainerStyle|QualifiedName] 
	 *         precondition=EXPRESSION? 
	 *         semanticCanditatesExpression=EXPRESSION? 
	 *         conditionalStyles+=ConditionalContainerStyleDeclaration*
	 *     )
	 */
	protected void sequence_Container(EObject context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         edge=[Edge|QualifiedName] 
	 *         sourceExpression=EXPRESSION 
	 *         targetExpression=EXPRESSION 
	 *         containerViewExpression=EXPRESSION 
	 *         variableName=STRING 
	 *         body+=Operation*
	 *     )
	 */
	protected void sequence_CreateEdgeView(EObject context, CreateEdgeView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (referenceName=STRING type=STRING variableName=STRING body+=Operation*)
	 */
	protected void sequence_CreateInstance(EObject context, CreateInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (mapping=[Mapping|QualifiedName] containerViewExpression=EXPRESSION variableName=STRING body+=Operation*)
	 */
	protected void sequence_CreateView(EObject context, CreateView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (body+=Operation*)
	 */
	protected void sequence_Default(EObject context, Default semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (body+=Operation*)
	 */
	protected void sequence_DeleteView(EObject context, DeleteView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (documentation=DOCUMENTATION? name=ID label=STRING? viewpoints+=Viewpoint*)
	 */
	protected void sequence_Designer(EObject context, Designer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation=DOCUMENTATION? 
	 *         initialized?='@Initialized'? 
	 *         showOnStartup?='@ShowOnStartup'? 
	 *         enablePopupBars?='@EnablePopupBars'? 
	 *         metamodelUris+=STRING 
	 *         metamodelUris+=STRING* 
	 *         name=ID 
	 *         label=STRING? 
	 *         domainClass=STRING 
	 *         precondition=EXPRESSION? 
	 *         endUserDocumentation=STRING? 
	 *         titleExpression=EXPRESSION? 
	 *         rootExpression=EXPRESSION? 
	 *         defaultLayer=[Layer|QualifiedName]? 
	 *         (additionalLayers+=[Layer|QualifiedName] additionalLayers+=[Layer|QualifiedName]*)?
	 *     )
	 */
	protected void sequence_Diagram(EObject context, Diagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         strokeColor=[Color|QualifiedName] 
	 *         lineStyle=LineStyle? 
	 *         routingStyle=RoutingStyle? 
	 *         sourceArrow=ArrowDecorator? 
	 *         targetArrow=ArrowDecorator? 
	 *         sizeComputationExpression=EXPRESSION? 
	 *         foldingStyle=FoldingStyle? 
	 *         endsCentering=EndsCentering?
	 *     )
	 */
	protected void sequence_EdgeStyle(EObject context, EdgeStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (iteratorName=STRING expression=EXPRESSION body+=Operation*)
	 */
	protected void sequence_For(EObject context, For semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation=DOCUMENTATION? 
	 *         direction=GradientDirection 
	 *         name=ID 
	 *         backgroundColor=[Color|QualifiedName] 
	 *         foregroundColor=[Color|QualifiedName] 
	 *         (labelAlignment=LabelAlignment labelExpression=EXPRESSION labelColor=[Color|QualifiedName])? 
	 *         (borderSize=INT borderColor=[Color|QualifiedName])? 
	 *         icon=STRING? 
	 *         heightComputationExpression=EXPRESSION? 
	 *         widthComputationExpression=EXPRESSION?
	 *     )
	 */
	protected void sequence_Gradient(EObject context, Gradient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conditionExpression=EXPRESSION body+=Operation*)
	 */
	protected void sequence_If(EObject context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SiriusTextDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SiriusTextDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation=DOCUMENTATION? 
	 *         name=ID 
	 *         icon=STRING? 
	 *         (mappings+=[Mapping|QualifiedName] mappings+=[Mapping|QualifiedName]*)? 
	 *         (edges+=[Edge|QualifiedName] edges+=[Edge|QualifiedName]*)? 
	 *         (sections+=[Section|QualifiedName] sections+=[Section|QualifiedName]*)?
	 *     )
	 */
	protected void sequence_Layer(EObject context, Layer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (newContainerExpression=EXPRESSION featureName=STRING body+=Operation*)
	 */
	protected void sequence_Move(EObject context, Move semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (documentation=DOCUMENTATION? name=ID colors+=Color*)
	 */
	protected void sequence_Palette(EObject context, Palette semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (red=INT green=INT blue=INT)
	 */
	protected void sequence_RGB(EObject context, RGB semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SiriusTextDslPackage.Literals.RGB__RED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SiriusTextDslPackage.Literals.RGB__RED));
			if(transientValues.isValueTransient(semanticObject, SiriusTextDslPackage.Literals.RGB__GREEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SiriusTextDslPackage.Literals.RGB__GREEN));
			if(transientValues.isValueTransient(semanticObject, SiriusTextDslPackage.Literals.RGB__BLUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SiriusTextDslPackage.Literals.RGB__BLUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_2_0(), semanticObject.getRed());
		feeder.accept(grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_4_0(), semanticObject.getGreen());
		feeder.accept(grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_6_0(), semanticObject.getBlue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation=DOCUMENTATION? 
	 *         name=ID 
	 *         label=STRING? 
	 *         style=[EdgeStyle|QualifiedName] 
	 *         (sourceMappings+=[Mapping|QualifiedName] sourceMappings+=[Mapping|QualifiedName]*)? 
	 *         (targetMappings+=[Mapping|QualifiedName] targetMappings+=[Mapping|QualifiedName]*)? 
	 *         targetFinderExpression=EXPRESSION
	 *     )
	 */
	protected void sequence_RelationBasedEdge(EObject context, RelationBasedEdge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (body+=Operation*)
	 */
	protected void sequence_Remove(EObject context, Remove semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (documentation=DOCUMENTATION? name=ID label=STRING? icon=STRING? (tools+=[Tool|QualifiedName] tools+=[Tool|QualifiedName]*)?)
	 */
	protected void sequence_Section(EObject context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (featureName=STRING valueExpression=EXPRESSION body+=Operation*)
	 */
	protected void sequence_Set(EObject context, Set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (documentation=DOCUMENTATION? name=QualifiedName imports+=Import* body=SiriusFileBody)
	 */
	protected void sequence_SiriusFile(EObject context, SiriusFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cases+=Case+ default=Default?)
	 */
	protected void sequence_Switch(EObject context, Switch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (featureName=STRING elementExpression=EXPRESSION? body+=Operation*)
	 */
	protected void sequence_Unset(EObject context, Unset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation=DOCUMENTATION? 
	 *         name=ID 
	 *         label=STRING? 
	 *         (modelFileExtensions+=STRING modelFileExtensions+=STRING*)? 
	 *         icon=STRING? 
	 *         (representations+=[Representation|QualifiedName] representations+=[Representation|QualifiedName]*)? 
	 *         (javaExtension+=[JvmType|QualifiedName] javaExtension+=[JvmType|QualifiedName]*)?
	 *     )
	 */
	protected void sequence_Viewpoint(EObject context, Viewpoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
