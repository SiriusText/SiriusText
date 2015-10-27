/*
 * generated by Xtext
 */
package org.obeonetwork.sirius.text.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.obeonetwork.sirius.text.services.SiriusTextDslGrammarAccess;

@SuppressWarnings("all")
public class SiriusTextDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SiriusTextDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ChangeContext___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	protected AbstractElementAlias match_ContainerCreation___ExtraMappingsKeyword_21_0_EqualsSignKeyword_21_1_LeftSquareBracketKeyword_21_2_RightSquareBracketKeyword_21_4__q;
	protected AbstractElementAlias match_CreateEdgeView___LeftCurlyBracketKeyword_20_0_RightCurlyBracketKeyword_20_2__q;
	protected AbstractElementAlias match_CreateInstance___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q;
	protected AbstractElementAlias match_CreateView___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q;
	protected AbstractElementAlias match_DeleteView___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Diagram_MetamodelUrisKeyword_4_p;
	protected AbstractElementAlias match_Diagram___AdditionalLayersKeyword_20_0_EqualsSignKeyword_20_1_LeftSquareBracketKeyword_20_2_RightSquareBracketKeyword_20_4__q;
	protected AbstractElementAlias match_Layer___EdgesKeyword_6_0_EqualsSignKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q;
	protected AbstractElementAlias match_Layer___MappingsKeyword_5_0_EqualsSignKeyword_5_1_LeftSquareBracketKeyword_5_2_RightSquareBracketKeyword_5_4__q;
	protected AbstractElementAlias match_Layer___SectionsKeyword_7_0_EqualsSignKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q;
	protected AbstractElementAlias match_Move___LeftCurlyBracketKeyword_10_0_RightCurlyBracketKeyword_10_2__q;
	protected AbstractElementAlias match_Remove___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Section___ToolsKeyword_6_0_EqualsSignKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q;
	protected AbstractElementAlias match_Set___LeftCurlyBracketKeyword_10_0_RightCurlyBracketKeyword_10_2__q;
	protected AbstractElementAlias match_Unset___LeftCurlyBracketKeyword_7_0_RightCurlyBracketKeyword_7_2__q;
	protected AbstractElementAlias match_Viewpoint___JavaExtensionsKeyword_8_0_EqualsSignKeyword_8_1_LeftSquareBracketKeyword_8_2_RightSquareBracketKeyword_8_4__q;
	protected AbstractElementAlias match_Viewpoint___RepresentationsKeyword_7_0_EqualsSignKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SiriusTextDslGrammarAccess) access;
		match_ChangeContext___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getChangeContextAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getChangeContextAccess().getRightCurlyBracketKeyword_4_2()));
		match_ContainerCreation___ExtraMappingsKeyword_21_0_EqualsSignKeyword_21_1_LeftSquareBracketKeyword_21_2_RightSquareBracketKeyword_21_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerCreationAccess().getExtraMappingsKeyword_21_0()), new TokenAlias(false, false, grammarAccess.getContainerCreationAccess().getEqualsSignKeyword_21_1()), new TokenAlias(false, false, grammarAccess.getContainerCreationAccess().getLeftSquareBracketKeyword_21_2()), new TokenAlias(false, false, grammarAccess.getContainerCreationAccess().getRightSquareBracketKeyword_21_4()));
		match_CreateEdgeView___LeftCurlyBracketKeyword_20_0_RightCurlyBracketKeyword_20_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCreateEdgeViewAccess().getLeftCurlyBracketKeyword_20_0()), new TokenAlias(false, false, grammarAccess.getCreateEdgeViewAccess().getRightCurlyBracketKeyword_20_2()));
		match_CreateInstance___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCreateInstanceAccess().getLeftCurlyBracketKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getCreateInstanceAccess().getRightCurlyBracketKeyword_12_2()));
		match_CreateView___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCreateViewAccess().getLeftCurlyBracketKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getCreateViewAccess().getRightCurlyBracketKeyword_12_2()));
		match_DeleteView___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeleteViewAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeleteViewAccess().getRightCurlyBracketKeyword_3_2()));
		match_Diagram_MetamodelUrisKeyword_4_p = new TokenAlias(true, false, grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4());
		match_Diagram___AdditionalLayersKeyword_20_0_EqualsSignKeyword_20_1_LeftSquareBracketKeyword_20_2_RightSquareBracketKeyword_20_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDiagramAccess().getAdditionalLayersKeyword_20_0()), new TokenAlias(false, false, grammarAccess.getDiagramAccess().getEqualsSignKeyword_20_1()), new TokenAlias(false, false, grammarAccess.getDiagramAccess().getLeftSquareBracketKeyword_20_2()), new TokenAlias(false, false, grammarAccess.getDiagramAccess().getRightSquareBracketKeyword_20_4()));
		match_Layer___EdgesKeyword_6_0_EqualsSignKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLayerAccess().getEdgesKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getLayerAccess().getEqualsSignKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_6_2()), new TokenAlias(false, false, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_6_4()));
		match_Layer___MappingsKeyword_5_0_EqualsSignKeyword_5_1_LeftSquareBracketKeyword_5_2_RightSquareBracketKeyword_5_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLayerAccess().getMappingsKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getLayerAccess().getEqualsSignKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_5_2()), new TokenAlias(false, false, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_5_4()));
		match_Layer___SectionsKeyword_7_0_EqualsSignKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLayerAccess().getSectionsKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getLayerAccess().getEqualsSignKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_7_2()), new TokenAlias(false, false, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_7_4()));
		match_Move___LeftCurlyBracketKeyword_10_0_RightCurlyBracketKeyword_10_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_10_2()));
		match_Remove___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRemoveAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getRemoveAccess().getRightCurlyBracketKeyword_3_2()));
		match_Section___ToolsKeyword_6_0_EqualsSignKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSectionAccess().getToolsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getSectionAccess().getEqualsSignKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_6_2()), new TokenAlias(false, false, grammarAccess.getSectionAccess().getRightSquareBracketKeyword_6_4()));
		match_Set___LeftCurlyBracketKeyword_10_0_RightCurlyBracketKeyword_10_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getSetAccess().getRightCurlyBracketKeyword_10_2()));
		match_Unset___LeftCurlyBracketKeyword_7_0_RightCurlyBracketKeyword_7_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUnsetAccess().getLeftCurlyBracketKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getUnsetAccess().getRightCurlyBracketKeyword_7_2()));
		match_Viewpoint___JavaExtensionsKeyword_8_0_EqualsSignKeyword_8_1_LeftSquareBracketKeyword_8_2_RightSquareBracketKeyword_8_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getViewpointAccess().getJavaExtensionsKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getViewpointAccess().getEqualsSignKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_8_2()), new TokenAlias(false, false, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_8_4()));
		match_Viewpoint___RepresentationsKeyword_7_0_EqualsSignKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getViewpointAccess().getRepresentationsKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getViewpointAccess().getEqualsSignKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_7_2()), new TokenAlias(false, false, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_7_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ChangeContext___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_ChangeContext___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ContainerCreation___ExtraMappingsKeyword_21_0_EqualsSignKeyword_21_1_LeftSquareBracketKeyword_21_2_RightSquareBracketKeyword_21_4__q.equals(syntax))
				emit_ContainerCreation___ExtraMappingsKeyword_21_0_EqualsSignKeyword_21_1_LeftSquareBracketKeyword_21_2_RightSquareBracketKeyword_21_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CreateEdgeView___LeftCurlyBracketKeyword_20_0_RightCurlyBracketKeyword_20_2__q.equals(syntax))
				emit_CreateEdgeView___LeftCurlyBracketKeyword_20_0_RightCurlyBracketKeyword_20_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CreateInstance___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q.equals(syntax))
				emit_CreateInstance___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CreateView___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q.equals(syntax))
				emit_CreateView___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DeleteView___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_DeleteView___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Diagram_MetamodelUrisKeyword_4_p.equals(syntax))
				emit_Diagram_MetamodelUrisKeyword_4_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Diagram___AdditionalLayersKeyword_20_0_EqualsSignKeyword_20_1_LeftSquareBracketKeyword_20_2_RightSquareBracketKeyword_20_4__q.equals(syntax))
				emit_Diagram___AdditionalLayersKeyword_20_0_EqualsSignKeyword_20_1_LeftSquareBracketKeyword_20_2_RightSquareBracketKeyword_20_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Layer___EdgesKeyword_6_0_EqualsSignKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q.equals(syntax))
				emit_Layer___EdgesKeyword_6_0_EqualsSignKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Layer___MappingsKeyword_5_0_EqualsSignKeyword_5_1_LeftSquareBracketKeyword_5_2_RightSquareBracketKeyword_5_4__q.equals(syntax))
				emit_Layer___MappingsKeyword_5_0_EqualsSignKeyword_5_1_LeftSquareBracketKeyword_5_2_RightSquareBracketKeyword_5_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Layer___SectionsKeyword_7_0_EqualsSignKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q.equals(syntax))
				emit_Layer___SectionsKeyword_7_0_EqualsSignKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Move___LeftCurlyBracketKeyword_10_0_RightCurlyBracketKeyword_10_2__q.equals(syntax))
				emit_Move___LeftCurlyBracketKeyword_10_0_RightCurlyBracketKeyword_10_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Remove___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Remove___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Section___ToolsKeyword_6_0_EqualsSignKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q.equals(syntax))
				emit_Section___ToolsKeyword_6_0_EqualsSignKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Set___LeftCurlyBracketKeyword_10_0_RightCurlyBracketKeyword_10_2__q.equals(syntax))
				emit_Set___LeftCurlyBracketKeyword_10_0_RightCurlyBracketKeyword_10_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Unset___LeftCurlyBracketKeyword_7_0_RightCurlyBracketKeyword_7_2__q.equals(syntax))
				emit_Unset___LeftCurlyBracketKeyword_7_0_RightCurlyBracketKeyword_7_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Viewpoint___JavaExtensionsKeyword_8_0_EqualsSignKeyword_8_1_LeftSquareBracketKeyword_8_2_RightSquareBracketKeyword_8_4__q.equals(syntax))
				emit_Viewpoint___JavaExtensionsKeyword_8_0_EqualsSignKeyword_8_1_LeftSquareBracketKeyword_8_2_RightSquareBracketKeyword_8_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Viewpoint___RepresentationsKeyword_7_0_EqualsSignKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q.equals(syntax))
				emit_Viewpoint___RepresentationsKeyword_7_0_EqualsSignKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     browseExpression=EXPRESSION ')' (ambiguity) (rule end)
	 */
	protected void emit_ChangeContext___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('extraMappings' '=' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     containerMappings+=[Mapping|QualifiedName] ']' (ambiguity) 'begin' '{' '}' '}' (rule end)
	 *     containerMappings+=[Mapping|QualifiedName] ']' (ambiguity) 'begin' '{' body=Operation
	 *     icon=STRING 'containerMappings' '=' '[' ']' (ambiguity) 'begin' '{' '}' '}' (rule end)
	 *     icon=STRING 'containerMappings' '=' '[' ']' (ambiguity) 'begin' '{' body=Operation
	 *     label=STRING '{' 'containerMappings' '=' '[' ']' (ambiguity) 'begin' '{' '}' '}' (rule end)
	 *     label=STRING '{' 'containerMappings' '=' '[' ']' (ambiguity) 'begin' '{' body=Operation
	 *     name=ID '{' 'containerMappings' '=' '[' ']' (ambiguity) 'begin' '{' '}' '}' (rule end)
	 *     name=ID '{' 'containerMappings' '=' '[' ']' (ambiguity) 'begin' '{' body=Operation
	 *     precondition=EXPRESSION '{' 'containerMappings' '=' '[' ']' (ambiguity) 'begin' '{' '}' '}' (rule end)
	 *     precondition=EXPRESSION '{' 'containerMappings' '=' '[' ']' (ambiguity) 'begin' '{' body=Operation
	 */
	protected void emit_ContainerCreation___ExtraMappingsKeyword_21_0_EqualsSignKeyword_21_1_LeftSquareBracketKeyword_21_2_RightSquareBracketKeyword_21_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     variableName=STRING (ambiguity) (rule end)
	 */
	protected void emit_CreateEdgeView___LeftCurlyBracketKeyword_20_0_RightCurlyBracketKeyword_20_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     variableName=STRING (ambiguity) (rule end)
	 */
	protected void emit_CreateInstance___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     variableName=STRING (ambiguity) (rule end)
	 */
	protected void emit_CreateView___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'deleteView' '()' (ambiguity) (rule start)
	 */
	protected void emit_DeleteView___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '@MetamodelUris'+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '({' metamodelUris+=STRING
	 *     documentation=DOCUMENTATION (ambiguity) '({' metamodelUris+=STRING
	 *     enablePopupBars?='@EnablePopupBars' (ambiguity) '({' metamodelUris+=STRING
	 *     initialized?='@Initialized' (ambiguity) '({' metamodelUris+=STRING
	 *     showOnStartup?='@ShowOnStartup' (ambiguity) '({' metamodelUris+=STRING
	 */
	protected void emit_Diagram_MetamodelUrisKeyword_4_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('additionalLayers' '=' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     defaultLayer=[Layer|QualifiedName] (ambiguity) '}' (rule end)
	 *     domainClass=STRING '{' (ambiguity) '}' (rule end)
	 *     endUserDocumentation=STRING (ambiguity) '}' (rule end)
	 *     precondition=EXPRESSION '{' (ambiguity) '}' (rule end)
	 *     rootExpression=EXPRESSION (ambiguity) '}' (rule end)
	 *     titleExpression=EXPRESSION (ambiguity) '}' (rule end)
	 */
	protected void emit_Diagram___AdditionalLayersKeyword_20_0_EqualsSignKeyword_20_1_LeftSquareBracketKeyword_20_2_RightSquareBracketKeyword_20_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('edges' '=' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     icon=STRING ('mappings' '=' '[' ']')? (ambiguity) 'sections' '=' '[' sections+=[Section|QualifiedName]
	 *     icon=STRING ('mappings' '=' '[' ']')? (ambiguity) ('sections' '=' '[' ']')? '}' (rule end)
	 *     mappings+=[Mapping|QualifiedName] ']' (ambiguity) 'sections' '=' '[' sections+=[Section|QualifiedName]
	 *     mappings+=[Mapping|QualifiedName] ']' (ambiguity) ('sections' '=' '[' ']')? '}' (rule end)
	 *     name=ID '{' ('mappings' '=' '[' ']')? (ambiguity) 'sections' '=' '[' sections+=[Section|QualifiedName]
	 *     name=ID '{' ('mappings' '=' '[' ']')? (ambiguity) ('sections' '=' '[' ']')? '}' (rule end)
	 */
	protected void emit_Layer___EdgesKeyword_6_0_EqualsSignKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('mappings' '=' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     icon=STRING (ambiguity) 'edges' '=' '[' edges+=[Edge|QualifiedName]
	 *     icon=STRING (ambiguity) ('edges' '=' '[' ']')? 'sections' '=' '[' sections+=[Section|QualifiedName]
	 *     icon=STRING (ambiguity) ('edges' '=' '[' ']')? ('sections' '=' '[' ']')? '}' (rule end)
	 *     name=ID '{' (ambiguity) 'edges' '=' '[' edges+=[Edge|QualifiedName]
	 *     name=ID '{' (ambiguity) ('edges' '=' '[' ']')? 'sections' '=' '[' sections+=[Section|QualifiedName]
	 *     name=ID '{' (ambiguity) ('edges' '=' '[' ']')? ('sections' '=' '[' ']')? '}' (rule end)
	 */
	protected void emit_Layer___MappingsKeyword_5_0_EqualsSignKeyword_5_1_LeftSquareBracketKeyword_5_2_RightSquareBracketKeyword_5_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('sections' '=' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     edges+=[Edge|QualifiedName] ']' (ambiguity) '}' (rule end)
	 *     icon=STRING ('mappings' '=' '[' ']')? ('edges' '=' '[' ']')? (ambiguity) '}' (rule end)
	 *     mappings+=[Mapping|QualifiedName] ']' ('edges' '=' '[' ']')? (ambiguity) '}' (rule end)
	 *     name=ID '{' ('mappings' '=' '[' ']')? ('edges' '=' '[' ']')? (ambiguity) '}' (rule end)
	 */
	protected void emit_Layer___SectionsKeyword_7_0_EqualsSignKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     featureName=STRING ')' (ambiguity) (rule end)
	 */
	protected void emit_Move___LeftCurlyBracketKeyword_10_0_RightCurlyBracketKeyword_10_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'remove' '()' (ambiguity) (rule start)
	 */
	protected void emit_Remove___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('tools' '=' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     icon=STRING (ambiguity) '}' (rule end)
	 *     label=STRING '{' (ambiguity) '}' (rule end)
	 *     name=ID '{' (ambiguity) '}' (rule end)
	 */
	protected void emit_Section___ToolsKeyword_6_0_EqualsSignKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     valueExpression=EXPRESSION ')' (ambiguity) (rule end)
	 */
	protected void emit_Set___LeftCurlyBracketKeyword_10_0_RightCurlyBracketKeyword_10_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     elementExpression=EXPRESSION ')' (ambiguity) (rule end)
	 *     featureName=STRING ')' (ambiguity) (rule end)
	 */
	protected void emit_Unset___LeftCurlyBracketKeyword_7_0_RightCurlyBracketKeyword_7_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('javaExtensions' '=' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     icon=STRING ('representations' '=' '[' ']')? (ambiguity) '}' (rule end)
	 *     label=STRING '{' ('representations' '=' '[' ']')? (ambiguity) '}' (rule end)
	 *     modelFileExtensions+=STRING ']' ('representations' '=' '[' ']')? (ambiguity) '}' (rule end)
	 *     name=ID '{' ('representations' '=' '[' ']')? (ambiguity) '}' (rule end)
	 *     representations+=[Representation|QualifiedName] ']' (ambiguity) '}' (rule end)
	 */
	protected void emit_Viewpoint___JavaExtensionsKeyword_8_0_EqualsSignKeyword_8_1_LeftSquareBracketKeyword_8_2_RightSquareBracketKeyword_8_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('representations' '=' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     icon=STRING (ambiguity) 'javaExtensions' '=' '[' javaExtension+=[JvmType|QualifiedName]
	 *     icon=STRING (ambiguity) ('javaExtensions' '=' '[' ']')? '}' (rule end)
	 *     label=STRING '{' (ambiguity) 'javaExtensions' '=' '[' javaExtension+=[JvmType|QualifiedName]
	 *     label=STRING '{' (ambiguity) ('javaExtensions' '=' '[' ']')? '}' (rule end)
	 *     modelFileExtensions+=STRING ']' (ambiguity) 'javaExtensions' '=' '[' javaExtension+=[JvmType|QualifiedName]
	 *     modelFileExtensions+=STRING ']' (ambiguity) ('javaExtensions' '=' '[' ']')? '}' (rule end)
	 *     name=ID '{' (ambiguity) 'javaExtensions' '=' '[' javaExtension+=[JvmType|QualifiedName]
	 *     name=ID '{' (ambiguity) ('javaExtensions' '=' '[' ']')? '}' (rule end)
	 */
	protected void emit_Viewpoint___RepresentationsKeyword_7_0_EqualsSignKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
