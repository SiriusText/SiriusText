package org.obeonetwork.sirius.text.ui.wizards.newproject

import org.eclipse.jface.dialogs.Dialog
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage

class NewSiriusTextProjectWizardFirstPage extends WizardNewProjectCreationPage {
	
	private static final String INITIAL_PROJECT_NAME = "org.obeonetwork.sirius.text.sample";
	
	/**
	 * The "Resource working set" ID.
	 */
	protected static final String RESOURCE_WORKING_SET_ID = "org.eclipse.ui.resourceWorkingSetPage"; //$NON-NLS-1$

	/**
	 * The "Java working set" ID.
	 */
	protected static final String JAVA_WORKING_SET_ID = "org.eclipse.jdt.ui.JavaWorkingSetPage";
	
	IStructuredSelection selection
	
	new(IStructuredSelection selection) {
		super("New Sirius Text Project")
		title = "Create a new Sirius Text project"
		initialProjectName = INITIAL_PROJECT_NAME
		description = "Enter a name for the Sirius Text project to create"
		
		this.selection = selection
	}
	
	override createControl(Composite parent) {
		super.createControl(parent)
		
		createWorkingSetGroup(getControl() as Composite, selection, #[RESOURCE_WORKING_SET_ID, JAVA_WORKING_SET_ID]);
		Dialog.applyDialogFont(getControl());
	}
	
}