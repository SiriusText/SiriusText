package org.obeonetwork.sirius.text.ui.wizards.newdiagram;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.obeonetwork.sirius.text.ui.wizards.newdiagram.NewSiriusTextDiagramWizardFirstPage;

@SuppressWarnings("all")
public class NewSiriusTextDiagramWizard extends Wizard implements INewWizard, IExecutableExtension {
  private IWorkbench workbench;
  
  private IStructuredSelection selection;
  
  private IConfigurationElement configurationElement;
  
  private NewSiriusTextDiagramWizardFirstPage firstPage;
  
  public NewSiriusTextDiagramWizard() {
    super();
    this.setWindowTitle("New Sirius Text Diagram");
  }
  
  @Override
  public void init(final IWorkbench workbench, final IStructuredSelection selection) {
    this.workbench = workbench;
    this.selection = selection;
  }
  
  @Override
  public void setInitializationData(final IConfigurationElement config, final String propertyName, final Object data) throws CoreException {
    this.configurationElement = config;
  }
  
  @Override
  public boolean needsProgressMonitor() {
    return true;
  }
  
  @Override
  public void addPages() {
    NewSiriusTextDiagramWizardFirstPage _newSiriusTextDiagramWizardFirstPage = new NewSiriusTextDiagramWizardFirstPage(this.selection);
    this.firstPage = _newSiriusTextDiagramWizardFirstPage;
    this.addPage(this.firstPage);
  }
  
  @Override
  public boolean performFinish() {
    try {
      final IRunnableWithProgress runnable = new IRunnableWithProgress() {
        @Override
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          try {
            final IFile file = NewSiriusTextDiagramWizard.this.firstPage.getFile();
            boolean _exists = file.exists();
            boolean _not = (!_exists);
            if (_not) {
              final String content = NewSiriusTextDiagramWizard.this.firstPage.getContent();
              byte[] _bytes = content.getBytes();
              final ByteArrayInputStream inputStream = new ByteArrayInputStream(_bytes);
              file.create(inputStream, true, monitor);
            }
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      boolean hasFinished = false;
      try {
        IWizardContainer _container = this.getContainer();
        _container.run(false, true, runnable);
        BasicNewProjectResourceWizard.updatePerspective(this.configurationElement);
        hasFinished = true;
      } catch (final Throwable _t) {
        if (_t instanceof CoreException) {
          final CoreException e = (CoreException)_t;
          hasFinished = false;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      return hasFinished;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
