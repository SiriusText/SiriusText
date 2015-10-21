package org.obeonetwork.sirius.text.ui.wizards.newproject;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

@SuppressWarnings("all")
public class NewSiriusTextProjectWizardFirstPage extends WizardNewProjectCreationPage {
  private final static String INITIAL_PROJECT_NAME = "org.obeonetwork.sirius.text.sample";
  
  /**
   * The "Resource working set" ID.
   */
  protected final static String RESOURCE_WORKING_SET_ID = "org.eclipse.ui.resourceWorkingSetPage";
  
  /**
   * The "Java working set" ID.
   */
  protected final static String JAVA_WORKING_SET_ID = "org.eclipse.jdt.ui.JavaWorkingSetPage";
  
  private IStructuredSelection selection;
  
  public NewSiriusTextProjectWizardFirstPage(final IStructuredSelection selection) {
    super("New Sirius Text Project");
    this.setTitle("Create a new Sirius Text project");
    this.setInitialProjectName(NewSiriusTextProjectWizardFirstPage.INITIAL_PROJECT_NAME);
    this.setDescription("Enter a name for the Sirius Text project to create");
    this.selection = selection;
  }
  
  @Override
  public void createControl(final Composite parent) {
    super.createControl(parent);
    Control _control = this.getControl();
    this.createWorkingSetGroup(((Composite) _control), this.selection, new String[] { NewSiriusTextProjectWizardFirstPage.RESOURCE_WORKING_SET_ID, NewSiriusTextProjectWizardFirstPage.JAVA_WORKING_SET_ID });
    Control _control_1 = this.getControl();
    Dialog.applyDialogFont(_control_1);
  }
}
