package org.obeonetwork.sirius.text.ui.wizards.newdiagram

import org.eclipse.ui.INewWizard
import org.eclipse.jface.wizard.Wizard
import org.eclipse.core.runtime.IExecutableExtension
import org.eclipse.ui.IWorkbench
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.CoreException
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard
import org.eclipse.jface.operation.IRunnableWithProgress
import org.eclipse.core.runtime.IProgressMonitor
import java.lang.reflect.InvocationTargetException
import java.io.ByteArrayInputStream

class NewSiriusTextDiagramWizard extends Wizard implements INewWizard, IExecutableExtension {
	
	IWorkbench workbench
	
	IStructuredSelection selection
	
	IConfigurationElement configurationElement
	
	NewSiriusTextDiagramWizardFirstPage firstPage
	
	public new() {
		super()
		this.windowTitle = "New Sirius Text Diagram"
	}
	
	override init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench
		this.selection = selection
	}
	
	override setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		this.configurationElement = config
	}

	override needsProgressMonitor() {
		return true
	}

	override addPages() {
		this.firstPage = new NewSiriusTextDiagramWizardFirstPage(selection)
		this.addPage(this.firstPage)
	}
	
	override performFinish() {
		val runnable = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				val file = firstPage.file
				if (!file.exists) {
					val content = firstPage.content
					val inputStream = new ByteArrayInputStream(content.bytes);
					file.create(inputStream, true, monitor)
				}
			}
		}
		
		var hasFinished = false;
		try {
			this.container.run(false, true, runnable)
			BasicNewProjectResourceWizard.updatePerspective(this.configurationElement);
			hasFinished = true
		} catch (CoreException e) {
			hasFinished = false
		}
		return hasFinished
	}
	
}