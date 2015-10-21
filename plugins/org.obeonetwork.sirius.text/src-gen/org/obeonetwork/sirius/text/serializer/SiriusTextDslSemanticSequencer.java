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
import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.ConditionalContainerStyleDeclaration;
import org.obeonetwork.sirius.text.siriusTextDsl.Container;
import org.obeonetwork.sirius.text.siriusTextDsl.Designer;
import org.obeonetwork.sirius.text.siriusTextDsl.Diagram;
import org.obeonetwork.sirius.text.siriusTextDsl.Gradient;
import org.obeonetwork.sirius.text.siriusTextDsl.Import;
import org.obeonetwork.sirius.text.siriusTextDsl.Layer;
import org.obeonetwork.sirius.text.siriusTextDsl.Palette;
import org.obeonetwork.sirius.text.siriusTextDsl.RGB;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage;
import org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint;

@SuppressWarnings("all")
public class SiriusTextDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SiriusTextDslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SiriusTextDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SiriusTextDslPackage.COLOR:
				sequence_Color(context, (Color) semanticObject); 
				return; 
			case SiriusTextDslPackage.CONDITIONAL_CONTAINER_STYLE_DECLARATION:
				sequence_ConditionalContainerStyleDeclaration(context, (ConditionalContainerStyleDeclaration) semanticObject); 
				return; 
			case SiriusTextDslPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case SiriusTextDslPackage.DESIGNER:
				sequence_Designer(context, (Designer) semanticObject); 
				return; 
			case SiriusTextDslPackage.DIAGRAM:
				sequence_Diagram(context, (Diagram) semanticObject); 
				return; 
			case SiriusTextDslPackage.GRADIENT:
				sequence_Gradient(context, (Gradient) semanticObject); 
				return; 
			case SiriusTextDslPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case SiriusTextDslPackage.LAYER:
				sequence_Layer(context, (Layer) semanticObject); 
				return; 
			case SiriusTextDslPackage.PALETTE:
				sequence_Palette(context, (Palette) semanticObject); 
				return; 
			case SiriusTextDslPackage.RGB:
				sequence_RGB(context, (RGB) semanticObject); 
				return; 
			case SiriusTextDslPackage.SIRIUS_FILE:
				sequence_SiriusFile(context, (SiriusFile) semanticObject); 
				return; 
			case SiriusTextDslPackage.VIEWPOINT:
				sequence_Viewpoint(context, (Viewpoint) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
	 *         documentation=DOCUMENTATION? 
	 *         direction=GradientDirection 
	 *         name=ID 
	 *         backgroundColor=[Color|QualifiedName] 
	 *         foregroundColor=[Color|QualifiedName] 
	 *         (labelAlignment=LabelAlignment labelExpression=EXPRESSION labelColor=[Color|QualifiedName])? 
	 *         (borderSize=INT borderColor=[Color|QualifiedName])? 
	 *         icon=STRING? 
	 *         height=INT? 
	 *         width=INT?
	 *     )
	 */
	protected void sequence_Gradient(EObject context, Gradient semanticObject) {
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
	 *     (documentation=DOCUMENTATION? name=ID icon=STRING? (mappings+=[Mapping|QualifiedName] mappings+=[Mapping|QualifiedName]*)?)
	 */
	protected void sequence_Layer(EObject context, Layer semanticObject) {
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
		feeder.accept(grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_1_0(), semanticObject.getRed());
		feeder.accept(grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_3_0(), semanticObject.getGreen());
		feeder.accept(grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_5_0(), semanticObject.getBlue());
		feeder.finish();
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
	 *     (
	 *         documentation=DOCUMENTATION? 
	 *         name=ID 
	 *         label=STRING? 
	 *         (modelFileExtensions+=STRING modelFileExtensions+=STRING*)? 
	 *         icon=STRING? 
	 *         (representations+=[Representation|QualifiedName] representations+=[Representation|QualifiedName]*)?
	 *     )
	 */
	protected void sequence_Viewpoint(EObject context, Viewpoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}