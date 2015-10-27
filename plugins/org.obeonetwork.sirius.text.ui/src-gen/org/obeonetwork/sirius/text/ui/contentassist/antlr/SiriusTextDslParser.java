/*
 * generated by Xtext
 */
package org.obeonetwork.sirius.text.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.obeonetwork.sirius.text.services.SiriusTextDslGrammarAccess;

public class SiriusTextDslParser extends AbstractContentAssistParser {
	
	@Inject
	private SiriusTextDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.obeonetwork.sirius.text.ui.contentassist.antlr.internal.InternalSiriusTextDslParser createParser() {
		org.obeonetwork.sirius.text.ui.contentassist.antlr.internal.InternalSiriusTextDslParser result = new org.obeonetwork.sirius.text.ui.contentassist.antlr.internal.InternalSiriusTextDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSiriusFileBodyAccess().getAlternatives(), "rule__SiriusFileBody__Alternatives");
					put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
					put(grammarAccess.getStyleAccess().getAlternatives(), "rule__Style__Alternatives");
					put(grammarAccess.getLabelAlignmentAccess().getAlternatives(), "rule__LabelAlignment__Alternatives");
					put(grammarAccess.getGradientDirectionAccess().getAlternatives(), "rule__GradientDirection__Alternatives");
					put(grammarAccess.getLineStyleAccess().getAlternatives(), "rule__LineStyle__Alternatives");
					put(grammarAccess.getRoutingStyleAccess().getAlternatives(), "rule__RoutingStyle__Alternatives");
					put(grammarAccess.getArrowDecoratorAccess().getAlternatives(), "rule__ArrowDecorator__Alternatives");
					put(grammarAccess.getFoldingStyleAccess().getAlternatives(), "rule__FoldingStyle__Alternatives");
					put(grammarAccess.getEndsCenteringAccess().getAlternatives(), "rule__EndsCentering__Alternatives");
					put(grammarAccess.getSiriusFileAccess().getGroup(), "rule__SiriusFile__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getDesignerAccess().getGroup(), "rule__Designer__Group__0");
					put(grammarAccess.getDesignerAccess().getGroup_3(), "rule__Designer__Group_3__0");
					put(grammarAccess.getViewpointAccess().getGroup(), "rule__Viewpoint__Group__0");
					put(grammarAccess.getViewpointAccess().getGroup_3(), "rule__Viewpoint__Group_3__0");
					put(grammarAccess.getViewpointAccess().getGroup_5(), "rule__Viewpoint__Group_5__0");
					put(grammarAccess.getViewpointAccess().getGroup_5_4(), "rule__Viewpoint__Group_5_4__0");
					put(grammarAccess.getViewpointAccess().getGroup_6(), "rule__Viewpoint__Group_6__0");
					put(grammarAccess.getViewpointAccess().getGroup_7(), "rule__Viewpoint__Group_7__0");
					put(grammarAccess.getViewpointAccess().getGroup_7_3(), "rule__Viewpoint__Group_7_3__0");
					put(grammarAccess.getViewpointAccess().getGroup_7_3_1(), "rule__Viewpoint__Group_7_3_1__0");
					put(grammarAccess.getViewpointAccess().getGroup_8(), "rule__Viewpoint__Group_8__0");
					put(grammarAccess.getViewpointAccess().getGroup_8_3(), "rule__Viewpoint__Group_8_3__0");
					put(grammarAccess.getViewpointAccess().getGroup_8_3_1(), "rule__Viewpoint__Group_8_3_1__0");
					put(grammarAccess.getDiagramAccess().getGroup(), "rule__Diagram__Group__0");
					put(grammarAccess.getDiagramAccess().getGroup_7(), "rule__Diagram__Group_7__0");
					put(grammarAccess.getDiagramAccess().getGroup_11(), "rule__Diagram__Group_11__0");
					put(grammarAccess.getDiagramAccess().getGroup_14(), "rule__Diagram__Group_14__0");
					put(grammarAccess.getDiagramAccess().getGroup_16(), "rule__Diagram__Group_16__0");
					put(grammarAccess.getDiagramAccess().getGroup_17(), "rule__Diagram__Group_17__0");
					put(grammarAccess.getDiagramAccess().getGroup_18(), "rule__Diagram__Group_18__0");
					put(grammarAccess.getDiagramAccess().getGroup_19(), "rule__Diagram__Group_19__0");
					put(grammarAccess.getDiagramAccess().getGroup_20(), "rule__Diagram__Group_20__0");
					put(grammarAccess.getDiagramAccess().getGroup_20_3(), "rule__Diagram__Group_20_3__0");
					put(grammarAccess.getDiagramAccess().getGroup_20_3_1(), "rule__Diagram__Group_20_3_1__0");
					put(grammarAccess.getLayerAccess().getGroup(), "rule__Layer__Group__0");
					put(grammarAccess.getLayerAccess().getGroup_4(), "rule__Layer__Group_4__0");
					put(grammarAccess.getLayerAccess().getGroup_5(), "rule__Layer__Group_5__0");
					put(grammarAccess.getLayerAccess().getGroup_5_3(), "rule__Layer__Group_5_3__0");
					put(grammarAccess.getLayerAccess().getGroup_5_3_1(), "rule__Layer__Group_5_3_1__0");
					put(grammarAccess.getLayerAccess().getGroup_6(), "rule__Layer__Group_6__0");
					put(grammarAccess.getLayerAccess().getGroup_6_3(), "rule__Layer__Group_6_3__0");
					put(grammarAccess.getLayerAccess().getGroup_6_3_1(), "rule__Layer__Group_6_3_1__0");
					put(grammarAccess.getLayerAccess().getGroup_7(), "rule__Layer__Group_7__0");
					put(grammarAccess.getLayerAccess().getGroup_7_3(), "rule__Layer__Group_7_3__0");
					put(grammarAccess.getLayerAccess().getGroup_7_3_1(), "rule__Layer__Group_7_3_1__0");
					put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
					put(grammarAccess.getSectionAccess().getGroup_3(), "rule__Section__Group_3__0");
					put(grammarAccess.getSectionAccess().getGroup_5(), "rule__Section__Group_5__0");
					put(grammarAccess.getSectionAccess().getGroup_6(), "rule__Section__Group_6__0");
					put(grammarAccess.getSectionAccess().getGroup_6_3(), "rule__Section__Group_6_3__0");
					put(grammarAccess.getSectionAccess().getGroup_6_3_1(), "rule__Section__Group_6_3_1__0");
					put(grammarAccess.getContainerCreationAccess().getGroup(), "rule__ContainerCreation__Group__0");
					put(grammarAccess.getContainerCreationAccess().getGroup_12(), "rule__ContainerCreation__Group_12__0");
					put(grammarAccess.getContainerCreationAccess().getGroup_13(), "rule__ContainerCreation__Group_13__0");
					put(grammarAccess.getContainerCreationAccess().getGroup_15(), "rule__ContainerCreation__Group_15__0");
					put(grammarAccess.getContainerCreationAccess().getGroup_19(), "rule__ContainerCreation__Group_19__0");
					put(grammarAccess.getContainerCreationAccess().getGroup_19_1(), "rule__ContainerCreation__Group_19_1__0");
					put(grammarAccess.getContainerCreationAccess().getGroup_21(), "rule__ContainerCreation__Group_21__0");
					put(grammarAccess.getContainerCreationAccess().getGroup_21_3(), "rule__ContainerCreation__Group_21_3__0");
					put(grammarAccess.getContainerCreationAccess().getGroup_21_3_1(), "rule__ContainerCreation__Group_21_3_1__0");
					put(grammarAccess.getChangeContextAccess().getGroup(), "rule__ChangeContext__Group__0");
					put(grammarAccess.getChangeContextAccess().getGroup_4(), "rule__ChangeContext__Group_4__0");
					put(grammarAccess.getForAccess().getGroup(), "rule__For__Group__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getSetAccess().getGroup(), "rule__Set__Group__0");
					put(grammarAccess.getSetAccess().getGroup_10(), "rule__Set__Group_10__0");
					put(grammarAccess.getUnsetAccess().getGroup(), "rule__Unset__Group__0");
					put(grammarAccess.getUnsetAccess().getGroup_5(), "rule__Unset__Group_5__0");
					put(grammarAccess.getUnsetAccess().getGroup_7(), "rule__Unset__Group_7__0");
					put(grammarAccess.getCreateInstanceAccess().getGroup(), "rule__CreateInstance__Group__0");
					put(grammarAccess.getCreateInstanceAccess().getGroup_12(), "rule__CreateInstance__Group_12__0");
					put(grammarAccess.getCreateViewAccess().getGroup(), "rule__CreateView__Group__0");
					put(grammarAccess.getCreateViewAccess().getGroup_12(), "rule__CreateView__Group_12__0");
					put(grammarAccess.getCreateEdgeViewAccess().getGroup(), "rule__CreateEdgeView__Group__0");
					put(grammarAccess.getCreateEdgeViewAccess().getGroup_20(), "rule__CreateEdgeView__Group_20__0");
					put(grammarAccess.getDeleteViewAccess().getGroup(), "rule__DeleteView__Group__0");
					put(grammarAccess.getDeleteViewAccess().getGroup_3(), "rule__DeleteView__Group_3__0");
					put(grammarAccess.getRemoveAccess().getGroup(), "rule__Remove__Group__0");
					put(grammarAccess.getRemoveAccess().getGroup_3(), "rule__Remove__Group_3__0");
					put(grammarAccess.getMoveAccess().getGroup(), "rule__Move__Group__0");
					put(grammarAccess.getMoveAccess().getGroup_10(), "rule__Move__Group_10__0");
					put(grammarAccess.getSwitchAccess().getGroup(), "rule__Switch__Group__0");
					put(grammarAccess.getCaseAccess().getGroup(), "rule__Case__Group__0");
					put(grammarAccess.getDefaultAccess().getGroup(), "rule__Default__Group__0");
					put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
					put(grammarAccess.getContainerAccess().getGroup_4(), "rule__Container__Group_4__0");
					put(grammarAccess.getContainerAccess().getGroup_9(), "rule__Container__Group_9__0");
					put(grammarAccess.getContainerAccess().getGroup_11(), "rule__Container__Group_11__0");
					put(grammarAccess.getConditionalContainerStyleDeclarationAccess().getGroup(), "rule__ConditionalContainerStyleDeclaration__Group__0");
					put(grammarAccess.getGradientAccess().getGroup(), "rule__Gradient__Group__0");
					put(grammarAccess.getGradientAccess().getGroup_9(), "rule__Gradient__Group_9__0");
					put(grammarAccess.getGradientAccess().getGroup_10(), "rule__Gradient__Group_10__0");
					put(grammarAccess.getGradientAccess().getGroup_11(), "rule__Gradient__Group_11__0");
					put(grammarAccess.getGradientAccess().getGroup_12(), "rule__Gradient__Group_12__0");
					put(grammarAccess.getGradientAccess().getGroup_13(), "rule__Gradient__Group_13__0");
					put(grammarAccess.getRelationBasedEdgeAccess().getGroup(), "rule__RelationBasedEdge__Group__0");
					put(grammarAccess.getRelationBasedEdgeAccess().getGroup_3(), "rule__RelationBasedEdge__Group_3__0");
					put(grammarAccess.getRelationBasedEdgeAccess().getGroup_10(), "rule__RelationBasedEdge__Group_10__0");
					put(grammarAccess.getRelationBasedEdgeAccess().getGroup_10_1(), "rule__RelationBasedEdge__Group_10_1__0");
					put(grammarAccess.getRelationBasedEdgeAccess().getGroup_15(), "rule__RelationBasedEdge__Group_15__0");
					put(grammarAccess.getRelationBasedEdgeAccess().getGroup_15_1(), "rule__RelationBasedEdge__Group_15_1__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup(), "rule__EdgeStyle__Group__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup_4(), "rule__EdgeStyle__Group_4__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup_5(), "rule__EdgeStyle__Group_5__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup_7(), "rule__EdgeStyle__Group_7__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup_8(), "rule__EdgeStyle__Group_8__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup_9(), "rule__EdgeStyle__Group_9__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup_10(), "rule__EdgeStyle__Group_10__0");
					put(grammarAccess.getEdgeStyleAccess().getGroup_11(), "rule__EdgeStyle__Group_11__0");
					put(grammarAccess.getPaletteAccess().getGroup(), "rule__Palette__Group__0");
					put(grammarAccess.getColorAccess().getGroup(), "rule__Color__Group__0");
					put(grammarAccess.getRGBAccess().getGroup(), "rule__RGB__Group__0");
					put(grammarAccess.getSiriusFileAccess().getDocumentationAssignment_0(), "rule__SiriusFile__DocumentationAssignment_0");
					put(grammarAccess.getSiriusFileAccess().getNameAssignment_2(), "rule__SiriusFile__NameAssignment_2");
					put(grammarAccess.getSiriusFileAccess().getImportsAssignment_3(), "rule__SiriusFile__ImportsAssignment_3");
					put(grammarAccess.getSiriusFileAccess().getBodyAssignment_4(), "rule__SiriusFile__BodyAssignment_4");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getDesignerAccess().getDocumentationAssignment_0(), "rule__Designer__DocumentationAssignment_0");
					put(grammarAccess.getDesignerAccess().getNameAssignment_2(), "rule__Designer__NameAssignment_2");
					put(grammarAccess.getDesignerAccess().getLabelAssignment_3_1(), "rule__Designer__LabelAssignment_3_1");
					put(grammarAccess.getDesignerAccess().getViewpointsAssignment_5(), "rule__Designer__ViewpointsAssignment_5");
					put(grammarAccess.getViewpointAccess().getDocumentationAssignment_0(), "rule__Viewpoint__DocumentationAssignment_0");
					put(grammarAccess.getViewpointAccess().getNameAssignment_2(), "rule__Viewpoint__NameAssignment_2");
					put(grammarAccess.getViewpointAccess().getLabelAssignment_3_1(), "rule__Viewpoint__LabelAssignment_3_1");
					put(grammarAccess.getViewpointAccess().getModelFileExtensionsAssignment_5_3(), "rule__Viewpoint__ModelFileExtensionsAssignment_5_3");
					put(grammarAccess.getViewpointAccess().getModelFileExtensionsAssignment_5_4_1(), "rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1");
					put(grammarAccess.getViewpointAccess().getIconAssignment_6_2(), "rule__Viewpoint__IconAssignment_6_2");
					put(grammarAccess.getViewpointAccess().getRepresentationsAssignment_7_3_0(), "rule__Viewpoint__RepresentationsAssignment_7_3_0");
					put(grammarAccess.getViewpointAccess().getRepresentationsAssignment_7_3_1_1(), "rule__Viewpoint__RepresentationsAssignment_7_3_1_1");
					put(grammarAccess.getViewpointAccess().getJavaExtensionAssignment_8_3_0(), "rule__Viewpoint__JavaExtensionAssignment_8_3_0");
					put(grammarAccess.getViewpointAccess().getJavaExtensionAssignment_8_3_1_1(), "rule__Viewpoint__JavaExtensionAssignment_8_3_1_1");
					put(grammarAccess.getDiagramAccess().getDocumentationAssignment_0(), "rule__Diagram__DocumentationAssignment_0");
					put(grammarAccess.getDiagramAccess().getInitializedAssignment_1(), "rule__Diagram__InitializedAssignment_1");
					put(grammarAccess.getDiagramAccess().getShowOnStartupAssignment_2(), "rule__Diagram__ShowOnStartupAssignment_2");
					put(grammarAccess.getDiagramAccess().getEnablePopupBarsAssignment_3(), "rule__Diagram__EnablePopupBarsAssignment_3");
					put(grammarAccess.getDiagramAccess().getMetamodelUrisAssignment_6(), "rule__Diagram__MetamodelUrisAssignment_6");
					put(grammarAccess.getDiagramAccess().getMetamodelUrisAssignment_7_1(), "rule__Diagram__MetamodelUrisAssignment_7_1");
					put(grammarAccess.getDiagramAccess().getNameAssignment_10(), "rule__Diagram__NameAssignment_10");
					put(grammarAccess.getDiagramAccess().getLabelAssignment_11_1(), "rule__Diagram__LabelAssignment_11_1");
					put(grammarAccess.getDiagramAccess().getDomainClassAssignment_13(), "rule__Diagram__DomainClassAssignment_13");
					put(grammarAccess.getDiagramAccess().getPreconditionAssignment_14_1(), "rule__Diagram__PreconditionAssignment_14_1");
					put(grammarAccess.getDiagramAccess().getEndUserDocumentationAssignment_16_2(), "rule__Diagram__EndUserDocumentationAssignment_16_2");
					put(grammarAccess.getDiagramAccess().getTitleExpressionAssignment_17_2(), "rule__Diagram__TitleExpressionAssignment_17_2");
					put(grammarAccess.getDiagramAccess().getRootExpressionAssignment_18_2(), "rule__Diagram__RootExpressionAssignment_18_2");
					put(grammarAccess.getDiagramAccess().getDefaultLayerAssignment_19_2(), "rule__Diagram__DefaultLayerAssignment_19_2");
					put(grammarAccess.getDiagramAccess().getAdditionalLayersAssignment_20_3_0(), "rule__Diagram__AdditionalLayersAssignment_20_3_0");
					put(grammarAccess.getDiagramAccess().getAdditionalLayersAssignment_20_3_1_1(), "rule__Diagram__AdditionalLayersAssignment_20_3_1_1");
					put(grammarAccess.getLayerAccess().getDocumentationAssignment_0(), "rule__Layer__DocumentationAssignment_0");
					put(grammarAccess.getLayerAccess().getNameAssignment_2(), "rule__Layer__NameAssignment_2");
					put(grammarAccess.getLayerAccess().getIconAssignment_4_2(), "rule__Layer__IconAssignment_4_2");
					put(grammarAccess.getLayerAccess().getMappingsAssignment_5_3_0(), "rule__Layer__MappingsAssignment_5_3_0");
					put(grammarAccess.getLayerAccess().getMappingsAssignment_5_3_1_1(), "rule__Layer__MappingsAssignment_5_3_1_1");
					put(grammarAccess.getLayerAccess().getEdgesAssignment_6_3_0(), "rule__Layer__EdgesAssignment_6_3_0");
					put(grammarAccess.getLayerAccess().getEdgesAssignment_6_3_1_1(), "rule__Layer__EdgesAssignment_6_3_1_1");
					put(grammarAccess.getLayerAccess().getSectionsAssignment_7_3_0(), "rule__Layer__SectionsAssignment_7_3_0");
					put(grammarAccess.getLayerAccess().getSectionsAssignment_7_3_1_1(), "rule__Layer__SectionsAssignment_7_3_1_1");
					put(grammarAccess.getSectionAccess().getDocumentationAssignment_0(), "rule__Section__DocumentationAssignment_0");
					put(grammarAccess.getSectionAccess().getNameAssignment_2(), "rule__Section__NameAssignment_2");
					put(grammarAccess.getSectionAccess().getLabelAssignment_3_1(), "rule__Section__LabelAssignment_3_1");
					put(grammarAccess.getSectionAccess().getIconAssignment_5_2(), "rule__Section__IconAssignment_5_2");
					put(grammarAccess.getSectionAccess().getToolsAssignment_6_3_0(), "rule__Section__ToolsAssignment_6_3_0");
					put(grammarAccess.getSectionAccess().getToolsAssignment_6_3_1_1(), "rule__Section__ToolsAssignment_6_3_1_1");
					put(grammarAccess.getContainerCreationAccess().getDocumentationAssignment_0(), "rule__ContainerCreation__DocumentationAssignment_0");
					put(grammarAccess.getContainerCreationAccess().getForceRefreshAssignment_1(), "rule__ContainerCreation__ForceRefreshAssignment_1");
					put(grammarAccess.getContainerCreationAccess().getNodeCreationVariableAssignment_4(), "rule__ContainerCreation__NodeCreationVariableAssignment_4");
					put(grammarAccess.getContainerCreationAccess().getContainerViewVariableAssignment_8(), "rule__ContainerCreation__ContainerViewVariableAssignment_8");
					put(grammarAccess.getContainerCreationAccess().getNameAssignment_11(), "rule__ContainerCreation__NameAssignment_11");
					put(grammarAccess.getContainerCreationAccess().getLabelAssignment_12_1(), "rule__ContainerCreation__LabelAssignment_12_1");
					put(grammarAccess.getContainerCreationAccess().getPreconditionAssignment_13_1(), "rule__ContainerCreation__PreconditionAssignment_13_1");
					put(grammarAccess.getContainerCreationAccess().getIconAssignment_15_2(), "rule__ContainerCreation__IconAssignment_15_2");
					put(grammarAccess.getContainerCreationAccess().getContainerMappingsAssignment_19_0(), "rule__ContainerCreation__ContainerMappingsAssignment_19_0");
					put(grammarAccess.getContainerCreationAccess().getContainerMappingsAssignment_19_1_1(), "rule__ContainerCreation__ContainerMappingsAssignment_19_1_1");
					put(grammarAccess.getContainerCreationAccess().getExtraMappingsAssignment_21_3_0(), "rule__ContainerCreation__ExtraMappingsAssignment_21_3_0");
					put(grammarAccess.getContainerCreationAccess().getExtraMappingsAssignment_21_3_1_1(), "rule__ContainerCreation__ExtraMappingsAssignment_21_3_1_1");
					put(grammarAccess.getContainerCreationAccess().getBodyAssignment_24(), "rule__ContainerCreation__BodyAssignment_24");
					put(grammarAccess.getChangeContextAccess().getBrowseExpressionAssignment_2(), "rule__ChangeContext__BrowseExpressionAssignment_2");
					put(grammarAccess.getChangeContextAccess().getBodyAssignment_4_1(), "rule__ChangeContext__BodyAssignment_4_1");
					put(grammarAccess.getForAccess().getIteratorNameAssignment_2(), "rule__For__IteratorNameAssignment_2");
					put(grammarAccess.getForAccess().getExpressionAssignment_4(), "rule__For__ExpressionAssignment_4");
					put(grammarAccess.getForAccess().getBodyAssignment_7(), "rule__For__BodyAssignment_7");
					put(grammarAccess.getIfAccess().getConditionExpressionAssignment_2(), "rule__If__ConditionExpressionAssignment_2");
					put(grammarAccess.getIfAccess().getBodyAssignment_5(), "rule__If__BodyAssignment_5");
					put(grammarAccess.getSetAccess().getFeatureNameAssignment_4(), "rule__Set__FeatureNameAssignment_4");
					put(grammarAccess.getSetAccess().getValueExpressionAssignment_8(), "rule__Set__ValueExpressionAssignment_8");
					put(grammarAccess.getSetAccess().getBodyAssignment_10_1(), "rule__Set__BodyAssignment_10_1");
					put(grammarAccess.getUnsetAccess().getFeatureNameAssignment_4(), "rule__Unset__FeatureNameAssignment_4");
					put(grammarAccess.getUnsetAccess().getElementExpressionAssignment_5_3(), "rule__Unset__ElementExpressionAssignment_5_3");
					put(grammarAccess.getUnsetAccess().getBodyAssignment_7_1(), "rule__Unset__BodyAssignment_7_1");
					put(grammarAccess.getCreateInstanceAccess().getReferenceNameAssignment_4(), "rule__CreateInstance__ReferenceNameAssignment_4");
					put(grammarAccess.getCreateInstanceAccess().getTypeAssignment_8(), "rule__CreateInstance__TypeAssignment_8");
					put(grammarAccess.getCreateInstanceAccess().getVariableNameAssignment_11(), "rule__CreateInstance__VariableNameAssignment_11");
					put(grammarAccess.getCreateInstanceAccess().getBodyAssignment_12_1(), "rule__CreateInstance__BodyAssignment_12_1");
					put(grammarAccess.getCreateViewAccess().getMappingAssignment_4(), "rule__CreateView__MappingAssignment_4");
					put(grammarAccess.getCreateViewAccess().getContainerViewExpressionAssignment_8(), "rule__CreateView__ContainerViewExpressionAssignment_8");
					put(grammarAccess.getCreateViewAccess().getVariableNameAssignment_11(), "rule__CreateView__VariableNameAssignment_11");
					put(grammarAccess.getCreateViewAccess().getBodyAssignment_12_1(), "rule__CreateView__BodyAssignment_12_1");
					put(grammarAccess.getCreateEdgeViewAccess().getEdgeAssignment_4(), "rule__CreateEdgeView__EdgeAssignment_4");
					put(grammarAccess.getCreateEdgeViewAccess().getSourceExpressionAssignment_8(), "rule__CreateEdgeView__SourceExpressionAssignment_8");
					put(grammarAccess.getCreateEdgeViewAccess().getTargetExpressionAssignment_12(), "rule__CreateEdgeView__TargetExpressionAssignment_12");
					put(grammarAccess.getCreateEdgeViewAccess().getContainerViewExpressionAssignment_16(), "rule__CreateEdgeView__ContainerViewExpressionAssignment_16");
					put(grammarAccess.getCreateEdgeViewAccess().getVariableNameAssignment_19(), "rule__CreateEdgeView__VariableNameAssignment_19");
					put(grammarAccess.getCreateEdgeViewAccess().getBodyAssignment_20_1(), "rule__CreateEdgeView__BodyAssignment_20_1");
					put(grammarAccess.getDeleteViewAccess().getBodyAssignment_3_1(), "rule__DeleteView__BodyAssignment_3_1");
					put(grammarAccess.getRemoveAccess().getBodyAssignment_3_1(), "rule__Remove__BodyAssignment_3_1");
					put(grammarAccess.getMoveAccess().getNewContainerExpressionAssignment_4(), "rule__Move__NewContainerExpressionAssignment_4");
					put(grammarAccess.getMoveAccess().getFeatureNameAssignment_8(), "rule__Move__FeatureNameAssignment_8");
					put(grammarAccess.getMoveAccess().getBodyAssignment_10_1(), "rule__Move__BodyAssignment_10_1");
					put(grammarAccess.getSwitchAccess().getCasesAssignment_2(), "rule__Switch__CasesAssignment_2");
					put(grammarAccess.getSwitchAccess().getDefaultAssignment_3(), "rule__Switch__DefaultAssignment_3");
					put(grammarAccess.getCaseAccess().getConditionExpressionAssignment_2(), "rule__Case__ConditionExpressionAssignment_2");
					put(grammarAccess.getCaseAccess().getBodyAssignment_5(), "rule__Case__BodyAssignment_5");
					put(grammarAccess.getDefaultAccess().getBodyAssignment_3(), "rule__Default__BodyAssignment_3");
					put(grammarAccess.getContainerAccess().getDocumentationAssignment_0(), "rule__Container__DocumentationAssignment_0");
					put(grammarAccess.getContainerAccess().getListAssignment_1(), "rule__Container__ListAssignment_1");
					put(grammarAccess.getContainerAccess().getNameAssignment_3(), "rule__Container__NameAssignment_3");
					put(grammarAccess.getContainerAccess().getLabelAssignment_4_1(), "rule__Container__LabelAssignment_4_1");
					put(grammarAccess.getContainerAccess().getDomainClassAssignment_6(), "rule__Container__DomainClassAssignment_6");
					put(grammarAccess.getContainerAccess().getStyleAssignment_8(), "rule__Container__StyleAssignment_8");
					put(grammarAccess.getContainerAccess().getPreconditionAssignment_9_1(), "rule__Container__PreconditionAssignment_9_1");
					put(grammarAccess.getContainerAccess().getSemanticCanditatesExpressionAssignment_11_2(), "rule__Container__SemanticCanditatesExpressionAssignment_11_2");
					put(grammarAccess.getContainerAccess().getConditionalStylesAssignment_12(), "rule__Container__ConditionalStylesAssignment_12");
					put(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleAssignment_1(), "rule__ConditionalContainerStyleDeclaration__StyleAssignment_1");
					put(grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionAssignment_3(), "rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3");
					put(grammarAccess.getGradientAccess().getDocumentationAssignment_0(), "rule__Gradient__DocumentationAssignment_0");
					put(grammarAccess.getGradientAccess().getDirectionAssignment_2(), "rule__Gradient__DirectionAssignment_2");
					put(grammarAccess.getGradientAccess().getNameAssignment_3(), "rule__Gradient__NameAssignment_3");
					put(grammarAccess.getGradientAccess().getBackgroundColorAssignment_5(), "rule__Gradient__BackgroundColorAssignment_5");
					put(grammarAccess.getGradientAccess().getForegroundColorAssignment_7(), "rule__Gradient__ForegroundColorAssignment_7");
					put(grammarAccess.getGradientAccess().getLabelAlignmentAssignment_9_1(), "rule__Gradient__LabelAlignmentAssignment_9_1");
					put(grammarAccess.getGradientAccess().getLabelExpressionAssignment_9_2(), "rule__Gradient__LabelExpressionAssignment_9_2");
					put(grammarAccess.getGradientAccess().getLabelColorAssignment_9_4(), "rule__Gradient__LabelColorAssignment_9_4");
					put(grammarAccess.getGradientAccess().getBorderSizeAssignment_10_3(), "rule__Gradient__BorderSizeAssignment_10_3");
					put(grammarAccess.getGradientAccess().getBorderColorAssignment_10_5(), "rule__Gradient__BorderColorAssignment_10_5");
					put(grammarAccess.getGradientAccess().getIconAssignment_11_2(), "rule__Gradient__IconAssignment_11_2");
					put(grammarAccess.getGradientAccess().getHeightComputationExpressionAssignment_12_2(), "rule__Gradient__HeightComputationExpressionAssignment_12_2");
					put(grammarAccess.getGradientAccess().getWidthComputationExpressionAssignment_13_2(), "rule__Gradient__WidthComputationExpressionAssignment_13_2");
					put(grammarAccess.getRelationBasedEdgeAccess().getDocumentationAssignment_0(), "rule__RelationBasedEdge__DocumentationAssignment_0");
					put(grammarAccess.getRelationBasedEdgeAccess().getNameAssignment_2(), "rule__RelationBasedEdge__NameAssignment_2");
					put(grammarAccess.getRelationBasedEdgeAccess().getLabelAssignment_3_1(), "rule__RelationBasedEdge__LabelAssignment_3_1");
					put(grammarAccess.getRelationBasedEdgeAccess().getStyleAssignment_5(), "rule__RelationBasedEdge__StyleAssignment_5");
					put(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsAssignment_10_0(), "rule__RelationBasedEdge__SourceMappingsAssignment_10_0");
					put(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsAssignment_10_1_1(), "rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1");
					put(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsAssignment_15_0(), "rule__RelationBasedEdge__TargetMappingsAssignment_15_0");
					put(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsAssignment_15_1_1(), "rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1");
					put(grammarAccess.getRelationBasedEdgeAccess().getTargetFinderExpressionAssignment_19(), "rule__RelationBasedEdge__TargetFinderExpressionAssignment_19");
					put(grammarAccess.getEdgeStyleAccess().getNameAssignment_1(), "rule__EdgeStyle__NameAssignment_1");
					put(grammarAccess.getEdgeStyleAccess().getStrokeColorAssignment_3(), "rule__EdgeStyle__StrokeColorAssignment_3");
					put(grammarAccess.getEdgeStyleAccess().getLineStyleAssignment_4_2(), "rule__EdgeStyle__LineStyleAssignment_4_2");
					put(grammarAccess.getEdgeStyleAccess().getRoutingStyleAssignment_5_2(), "rule__EdgeStyle__RoutingStyleAssignment_5_2");
					put(grammarAccess.getEdgeStyleAccess().getSourceArrowAssignment_7_2(), "rule__EdgeStyle__SourceArrowAssignment_7_2");
					put(grammarAccess.getEdgeStyleAccess().getTargetArrowAssignment_8_2(), "rule__EdgeStyle__TargetArrowAssignment_8_2");
					put(grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionAssignment_9_2(), "rule__EdgeStyle__SizeComputationExpressionAssignment_9_2");
					put(grammarAccess.getEdgeStyleAccess().getFoldingStyleAssignment_10_2(), "rule__EdgeStyle__FoldingStyleAssignment_10_2");
					put(grammarAccess.getEdgeStyleAccess().getEndsCenteringAssignment_11_2(), "rule__EdgeStyle__EndsCenteringAssignment_11_2");
					put(grammarAccess.getPaletteAccess().getDocumentationAssignment_0(), "rule__Palette__DocumentationAssignment_0");
					put(grammarAccess.getPaletteAccess().getNameAssignment_2(), "rule__Palette__NameAssignment_2");
					put(grammarAccess.getPaletteAccess().getColorsAssignment_4(), "rule__Palette__ColorsAssignment_4");
					put(grammarAccess.getColorAccess().getNameAssignment_1(), "rule__Color__NameAssignment_1");
					put(grammarAccess.getColorAccess().getValueAssignment_3(), "rule__Color__ValueAssignment_3");
					put(grammarAccess.getRGBAccess().getRedAssignment_2(), "rule__RGB__RedAssignment_2");
					put(grammarAccess.getRGBAccess().getGreenAssignment_4(), "rule__RGB__GreenAssignment_4");
					put(grammarAccess.getRGBAccess().getBlueAssignment_6(), "rule__RGB__BlueAssignment_6");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.obeonetwork.sirius.text.ui.contentassist.antlr.internal.InternalSiriusTextDslParser typedParser = (org.obeonetwork.sirius.text.ui.contentassist.antlr.internal.InternalSiriusTextDslParser) parser;
			typedParser.entryRuleSiriusFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS" };
	}
	
	public SiriusTextDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SiriusTextDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
