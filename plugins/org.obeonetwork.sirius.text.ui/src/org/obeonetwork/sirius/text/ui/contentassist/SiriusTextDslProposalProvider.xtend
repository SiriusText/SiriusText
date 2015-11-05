/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.sirius.text.ui.contentassist

import java.util.Calendar
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.StyledString
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.resource.IStorage2UriMapper
import com.google.inject.Inject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.core.resources.IFile
import org.eclipse.jdt.core.IPackageFragment
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IStorage
import org.eclipse.xtext.Keyword
import java.util.Set

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class SiriusTextDslProposalProvider extends AbstractSiriusTextDslProposalProvider {
	
	private static final Set<String> KEYWORDS_TO_IGNORE = newLinkedHashSet('designer', '@IconPath', 'viewpoint',
		'@Initialized', '@ShowOnStartup', '@EnablePopupBars', '@MetamodelUris', 'diagram', 'layer', 'section',
		'@ForceRefresh', '@NodeCreationVariable', '@ContainerViewVariable', 'containerCreation', 'node', 'container',
		'@AllowHorizontalResizing', '@AllowVerticalResizing', 'square', 'gradient', 'relationBasedEdge', 'edgeStyle',
		'palette')
	
	@Inject
	private IStorage2UriMapper storage2UriMapper;
	
	override completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		if (KEYWORDS_TO_IGNORE.contains(keyword.value)) {
			return
		}
		super.completeKeyword(keyword, contentAssistContext, acceptor)
	}
	
	override complete_SiriusFile(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val packageName = this.getPackageName(model)
		if (packageName != null && packageName.length > 0) {
			val displayString = new StyledString()
			displayString.append(packageName)
			val informationString = new StyledString()
			informationString.append("The name of the package")
			val replacementString = packageName

			val proposal = new SiriusTextCompletionProposal(context.offset, 0, context.offset + replacementString.length, displayString, informationString, replacementString, null)
			acceptor.accept(proposal)
		}
		super.complete_SiriusFile(model, ruleCall, context, acceptor)
	}
	
	override completeSiriusFile_Documentation(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val displayString = new StyledString()
		displayString.append("copyright")
		
		val informationString = new StyledString()
		informationString.append("The copyright header of the file")
		
		val replacementString = '''
			/**
			 * All right reserved «Calendar.getInstance().get(Calendar.YEAR)»
			 */
		'''
		
		val proposal = new SiriusTextCompletionProposal(context.offset, 0, context.offset + replacementString.length, displayString, informationString, replacementString, null)
		acceptor.accept(proposal)
	}
	
	override completeSiriusFile_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val packageName = this.getPackageName(model)
		if (packageName != null && packageName.length > 0) {
			val displayString = new StyledString()
			displayString.append(packageName)
			val informationString = new StyledString()
			informationString.append("The name of the package")
			val replacementString = packageName

			val proposal = new SiriusTextCompletionProposal(context.offset, 0, context.offset + replacementString.length, displayString, informationString, replacementString, null)
			acceptor.accept(proposal)
		}
		super.completeSiriusFile_Name(model, assignment, context, acceptor)
	}
	
	def private String getPackageName(EObject eObject) {
		if (eObject != null) {
			val resource = eObject.eResource
			if (resource instanceof XtextResource) {
				val xTextResource = resource as XtextResource
				
				val storages = this.storage2UriMapper.getStorages(xTextResource.getURI)
				val iterator = storages.iterator
				while (iterator.hasNext) {
					val storage2project = iterator.next
					val storage = storage2project.first
					val project = storage2project.second
					
					return this.getPackageName(project, storage)
				}
			}
		}
		return null
	}
	
	def private String getPackageName(IProject project, IStorage storage) {
		if (project.hasNature(JavaCore.NATURE_ID) && storage instanceof IFile && ((storage as IFile).parent) != null) {
			val parent = (storage as IFile).parent
			val javaParent = JavaCore.create(parent)
			if (javaParent instanceof IPackageFragment) {
				val packageFragment = javaParent as IPackageFragment
				val packageName = packageFragment.elementName
				return packageName
			}
		}
		return null
	}
}
