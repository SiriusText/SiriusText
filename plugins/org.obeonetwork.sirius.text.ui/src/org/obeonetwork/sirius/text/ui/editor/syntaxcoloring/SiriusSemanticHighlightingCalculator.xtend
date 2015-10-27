package org.obeonetwork.sirius.text.ui.editor.syntaxcoloring

import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.util.CancelIndicator
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerCreation
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.nodemodel.ILeafNode
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.Keyword

class SiriusSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	private static final String CHANGE_CONTEXT_KEYWORD = "changeContext"
	private static final String FOR_KEYWORD = "for"
	private static final String IF_KEYWORD = "if"
	private static final String SET_KEYWORD = "set"
	private static final String FEATURE_NAME_KEYWORD = "featureName"
	private static final String VALUE_EXPRESSION_KEYWORD = "valueExpression"
	private static final String UNSET_KEYWORD = "unset"
	private static final String ELEMENT_EXPRESSION_KEYWORD = "elementExpression"
	private static final String CREATE_INSTANCE_KEYWORD = "createInstance"
	private static final String REFERENCE_NAME_KEYWORD = "referenceName"
	private static final String TYPE_KEYWORD = "type"
	private static final String AS_KEYWORD = "as"
	private static final String CREATE_VIEW_KEYWORD = "createView"
	private static final String MAPPING_KEYWORD = "mapping"
	private static final String CONTAINER_VIEW_EXPRESSION_KEYWORD = "containerViewExpression"
	private static final String CREATE_EDGE_VIEW_KEYWORD = "createEdgeView"
	private static final String SOURCE_EXPRESSION_KEYWORD = "sourceExpression"
	private static final String TARGET_EXPRESSION_KEYWORD = "targetExpression"
	private static final String DELETE_VIEW_KEYWORD = "deleteView"
	private static final String REMOVE_KEYWORD = "remove"
	private static final String MOVE_KEYWORD = "move"
	private static final String NEW_CONTAINER_EXPRESSION_KEYWORD = "newContainerExpression"
	private static final String SWITCH_KEYWORD = "switch"
	private static final String CASE_KEYWORD = "case"
	private static final String DEFAULT_KEYWORD = "default"
	
	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptator, CancelIndicator cancelIndicator) {
		val contents = resource.contents
		if (contents.size == 1 && contents.get(0) instanceof SiriusFile) {
			val siriusFile = contents.get(0) as SiriusFile
			val body = siriusFile.body
			if (body instanceof ContainerCreation) {
				val containerCreation = body as ContainerCreation
				this.provideHighlightingForContainerCreation(containerCreation, acceptator, cancelIndicator)
			}
		}
	}
	
	def private provideHighlightingForContainerCreation(ContainerCreation containerCreation, IHighlightedPositionAcceptor acceptator, CancelIndicator cancelIndicator) {
		val bodyNodes = NodeModelUtils.findNodesForFeature(containerCreation, SiriusTextDslPackage.Literals.CONTAINER_CREATION__BODY)
		if (bodyNodes != null && bodyNodes.size == 1) {
			this.provideHighlightingForOperationBody(bodyNodes.get(0), acceptator, cancelIndicator)
		}
	}
	
	def private provideHighlightingForOperationBody(INode node, IHighlightedPositionAcceptor acceptator, CancelIndicator cancelIndicator) {
		for (ILeafNode leafNode: node.getLeafNodes()) {
			val grammarElement = leafNode.getGrammarElement()
			if (grammarElement instanceof Keyword && !cancelIndicator.canceled) {
				val keyword = grammarElement as Keyword
				val value = keyword.value
				
				if (CHANGE_CONTEXT_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.OPERATION_ID)
				} else if (FOR_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.FOR_ID)
				} else if (IF_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.IF_ID)
				} else if (SET_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.OPERATION_ID)
				} else if (FEATURE_NAME_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.PARAMETER_NAME_ID)
				} else if (VALUE_EXPRESSION_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.PARAMETER_NAME_ID)
				} else if (UNSET_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.OPERATION_ID)
				} else if (ELEMENT_EXPRESSION_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.PARAMETER_NAME_ID)
				} else if (CREATE_INSTANCE_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.OPERATION_ID)
				} else if (REFERENCE_NAME_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.PARAMETER_NAME_ID)
				} else if (TYPE_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.PARAMETER_NAME_ID)
				} else if (AS_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.PARAMETER_NAME_ID)
				} else if (CREATE_VIEW_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.OPERATION_ID)
				} else if (MAPPING_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.PARAMETER_NAME_ID)
				} else if (CONTAINER_VIEW_EXPRESSION_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.PARAMETER_NAME_ID)
				} else if (CREATE_EDGE_VIEW_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.OPERATION_ID)
				} else if (SOURCE_EXPRESSION_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.PARAMETER_NAME_ID)
				} else if (TARGET_EXPRESSION_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.PARAMETER_NAME_ID)
				} else if (DELETE_VIEW_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.OPERATION_ID)
				} else if (REMOVE_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.OPERATION_ID)
				} else if (MOVE_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.OPERATION_ID)
				} else if (NEW_CONTAINER_EXPRESSION_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.PARAMETER_NAME_ID)
				} else if (SWITCH_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.SWITCH_ID)
				} else if (CASE_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.SWITCH_ID)
				} else if (DEFAULT_KEYWORD.equals(value)) {
					acceptator.addPosition(leafNode.textRegion.offset, leafNode.textRegion.length, SiriusHighlightingConfiguration.SWITCH_ID)
				}
			}
		}
	}
}