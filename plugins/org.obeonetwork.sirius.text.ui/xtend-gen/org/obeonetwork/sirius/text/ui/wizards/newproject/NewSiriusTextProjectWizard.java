package org.obeonetwork.sirius.text.ui.wizards.newproject;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.StringTokenizer;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.obeonetwork.sirius.text.ui.wizards.newproject.NewSiriusTextProjectWizardFirstPage;

@SuppressWarnings("all")
public class NewSiriusTextProjectWizard extends Wizard implements INewWizard, IExecutableExtension {
  private IWorkbench workbench;
  
  private IStructuredSelection selection;
  
  private IConfigurationElement configurationElement;
  
  private NewSiriusTextProjectWizardFirstPage firstPage;
  
  public NewSiriusTextProjectWizard() {
    super();
    this.setWindowTitle("New Sirius Text Project");
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
    NewSiriusTextProjectWizardFirstPage _newSiriusTextProjectWizardFirstPage = new NewSiriusTextProjectWizardFirstPage(this.selection);
    this.firstPage = _newSiriusTextProjectWizardFirstPage;
    this.addPage(this.firstPage);
  }
  
  @Override
  public boolean canFinish() {
    return this.firstPage.isPageComplete();
  }
  
  @Override
  public boolean performFinish() {
    try {
      final IRunnableWithProgress runnable = new IRunnableWithProgress() {
        @Override
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          try {
            IWorkspace _workspace = ResourcesPlugin.getWorkspace();
            IWorkspaceRoot _root = _workspace.getRoot();
            String _projectName = NewSiriusTextProjectWizard.this.firstPage.getProjectName();
            final IProject project = _root.getProject(_projectName);
            IPath location = NewSiriusTextProjectWizard.this.firstPage.getLocationPath();
            boolean _exists = project.exists();
            boolean _not = (!_exists);
            if (_not) {
              IWorkspace _workspace_1 = project.getWorkspace();
              String _projectName_1 = NewSiriusTextProjectWizard.this.firstPage.getProjectName();
              final IProjectDescription description = _workspace_1.newProjectDescription(_projectName_1);
              boolean _and = false;
              boolean _notEquals = (!Objects.equal(location, null));
              if (!_notEquals) {
                _and = false;
              } else {
                IWorkspace _workspace_2 = ResourcesPlugin.getWorkspace();
                IWorkspaceRoot _root_1 = _workspace_2.getRoot();
                IPath _location = _root_1.getLocation();
                boolean _equals = _location.equals(location);
                _and = _equals;
              }
              if (_and) {
                location = null;
              }
              description.setLocation(location);
              final ICommand jdtBuildCommand = description.newCommand();
              jdtBuildCommand.setBuilderName("org.eclipse.jdt.core.javabuilder");
              final ICommand pdeManifestBuildCommand = description.newCommand();
              pdeManifestBuildCommand.setBuilderName("org.eclipse.pde.ManifestBuilder");
              final ICommand pdeSchemaBuildCommand = description.newCommand();
              pdeSchemaBuildCommand.setBuilderName("org.eclipse.pde.SchemaBuilder");
              final ICommand xtextBuildCommand = description.newCommand();
              xtextBuildCommand.setBuilderName("org.eclipse.xtext.ui.shared.xtextBuilder");
              description.setBuildSpec(new ICommand[] { jdtBuildCommand, pdeManifestBuildCommand, pdeSchemaBuildCommand, xtextBuildCommand });
              description.setNatureIds(new String[] { "org.eclipse.xtext.ui.shared.xtextNature", "org.eclipse.jdt.core.javanature", "org.eclipse.pde.PluginNature" });
              project.create(description, monitor);
              project.open(monitor);
              NewSiriusTextProjectWizard.this.convertProject(project, monitor);
            }
            boolean _isOpen = project.isOpen();
            boolean _not_1 = (!_isOpen);
            if (_not_1) {
              project.open(monitor);
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
  
  private void convertProject(final IProject project, final IProgressMonitor monitor) {
    this.createManifestMf(project, monitor);
    this.createClasspath(project, monitor);
    this.createPropertiesFiles(project, monitor);
    this.createSource(project, monitor);
  }
  
  private void createManifestMf(final IProject project, final IProgressMonitor monitor) {
    try {
      final IFolder metaInf = project.getFolder("META-INF");
      boolean _exists = metaInf.exists();
      boolean _not = (!_exists);
      if (_not) {
        metaInf.create(true, true, monitor);
      }
      final IFile manifestMf = metaInf.getFile("MANIFEST.MF");
      boolean _exists_1 = manifestMf.exists();
      boolean _not_1 = (!_exists_1);
      if (_not_1) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Manifest-Version: 1.0");
        _builder.newLine();
        _builder.append("Bundle-ManifestVersion: 2");
        _builder.newLine();
        _builder.append("Bundle-Name: %pluginName");
        _builder.newLine();
        _builder.append("Bundle-Vendor: %providerName");
        _builder.newLine();
        _builder.append("Bundle-Version: 1.0.0.qualifier");
        _builder.newLine();
        _builder.append("Bundle-SymbolicName: ");
        String _name = project.getName();
        _builder.append(_name, "");
        _builder.append("; singleton:=true");
        _builder.newLineIfNotEmpty();
        _builder.append("Bundle-Activator: ");
        String _name_1 = project.getName();
        _builder.append(_name_1, "");
        _builder.append(".internal.SiriusTextPlugin$Implementation");
        _builder.newLineIfNotEmpty();
        _builder.append("Bundle-ActivationPolicy: lazy");
        _builder.newLine();
        _builder.append("Require-Bundle: org.eclipse.ui,");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("org.eclipse.core.runtime,");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("org.eclipse.core.resources,");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("org.eclipse.sirius,");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("org.eclipse.sirius.common.acceleo.aql");
        _builder.newLine();
        _builder.append("Bundle-RequiredExecutionEnvironment: JavaSE-1.6");
        _builder.newLine();
        _builder.append("Export-Package: ");
        String _name_2 = project.getName();
        _builder.append(_name_2, "");
        _builder.append(".internal;x-internal:=true");
        _builder.newLineIfNotEmpty();
        _builder.append("Bundle-Localization: plugin");
        _builder.newLine();
        final String content = _builder.toString();
        byte[] _bytes = content.getBytes("UTF-8");
        final ByteArrayInputStream inputStream = new ByteArrayInputStream(_bytes);
        manifestMf.create(inputStream, true, monitor);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void createClasspath(final IProject project, final IProgressMonitor monitor) {
    try {
      final IFolder src = project.getFolder("src");
      boolean _exists = src.exists();
      boolean _not = (!_exists);
      if (_not) {
        src.create(true, true, monitor);
      }
      IFile classpath = project.getFile(".classpath");
      boolean _exists_1 = classpath.exists();
      boolean _not_1 = (!_exists_1);
      if (_not_1) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        _builder.newLine();
        _builder.append("<classpath>");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("<classpathentry kind=\"src\" path=\"src\"/>");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.6\"/>");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("<classpathentry kind=\"con\" path=\"org.eclipse.pde.core.requiredPlugins\"/>");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("<classpathentry kind=\"output\" path=\"bin\"/>");
        _builder.newLine();
        _builder.append("</classpath>");
        _builder.newLine();
        final String content = _builder.toString();
        byte[] _bytes = content.getBytes("UTF-8");
        final ByteArrayInputStream inputStream = new ByteArrayInputStream(_bytes);
        classpath.create(inputStream, true, monitor);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void createPropertiesFiles(final IProject project, final IProgressMonitor monitor) {
    try {
      final IFile buildProperties = project.getFile("build.properties");
      boolean _exists = buildProperties.exists();
      boolean _not = (!_exists);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("source.. = src/");
        _builder.newLine();
        _builder.append("output.. = bin/");
        _builder.newLine();
        _builder.append("bin.includes = META-INF/,\\");
        _builder.newLine();
        _builder.append("               ");
        _builder.append(".,\\");
        _builder.newLine();
        _builder.append("               ");
        _builder.append("description/,\\");
        _builder.newLine();
        _builder.append("               ");
        _builder.append("plugin.xml,\\");
        _builder.newLine();
        _builder.append("               ");
        _builder.append("plugin.properties");
        _builder.newLine();
        String content = _builder.toString();
        byte[] _bytes = content.getBytes("UTF-8");
        final ByteArrayInputStream inputStream = new ByteArrayInputStream(_bytes);
        buildProperties.create(inputStream, true, monitor);
      }
      final IFile pluginProperties = project.getFile("plugin.properties");
      boolean _exists_1 = pluginProperties.exists();
      boolean _not_1 = (!_exists_1);
      if (_not_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("pluginName=Sirius Text Project");
        _builder_1.newLine();
        _builder_1.append("providerName=www.obeo.fr");
        _builder_1.newLine();
        String content_1 = _builder_1.toString();
        byte[] _bytes_1 = content_1.getBytes("UTF-8");
        final ByteArrayInputStream inputStream_1 = new ByteArrayInputStream(_bytes_1);
        pluginProperties.create(inputStream_1, true, monitor);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void createSource(final IProject project, final IProgressMonitor monitor) {
    try {
      Path _path = new Path("src");
      final IFolder src = project.getFolder(_path);
      boolean _exists = src.exists();
      if (_exists) {
        IFolder parentFolder = src;
        String _name = project.getName();
        final StringTokenizer tokenizer = new StringTokenizer(_name, ".");
        while (tokenizer.hasMoreTokens()) {
          {
            final String token = tokenizer.nextToken();
            IFolder _folder = parentFolder.getFolder(token);
            parentFolder = _folder;
            boolean _exists_1 = parentFolder.exists();
            boolean _not = (!_exists_1);
            if (_not) {
              parentFolder.create(true, true, monitor);
            }
          }
        }
        boolean _exists_1 = parentFolder.exists();
        if (_exists_1) {
          final IFolder internalFolder = parentFolder.getFolder("internal");
          boolean _exists_2 = internalFolder.exists();
          boolean _not = (!_exists_2);
          if (_not) {
            internalFolder.create(true, true, monitor);
            this.createActivator(internalFolder, monitor);
            this.createDefaultDesigner(internalFolder, monitor);
          }
        }
      }
      final IFolder description = project.getFolder("description");
      boolean _exists_3 = description.exists();
      boolean _not_1 = (!_exists_3);
      if (_not_1) {
        description.create(true, true, monitor);
      }
      final IFile pluginXml = project.getFile("plugin.xml");
      boolean _exists_4 = pluginXml.exists();
      boolean _not_2 = (!_exists_4);
      if (_not_2) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        _builder.newLine();
        _builder.append("<?eclipse version=\"3.0\"?>");
        _builder.newLine();
        _builder.append("<plugin>");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("<extension point=\"org.eclipse.sirius.componentization\">");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("<component class=\"");
        String _name_1 = project.getName();
        _builder.append(_name_1, "    ");
        _builder.append(".internal.SiriusTextPlugin\"");
        _builder.newLineIfNotEmpty();
        _builder.append("               ");
        _builder.append("id=\"");
        String _name_2 = project.getName();
        _builder.append(_name_2, "               ");
        _builder.append(".design\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t           ");
        _builder.append("name=\"designer\">");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("</component>");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("</extension>");
        _builder.newLine();
        _builder.append("</plugin>");
        _builder.newLine();
        final String content = _builder.toString();
        byte[] _bytes = content.getBytes("UTF-8");
        final ByteArrayInputStream inputStream = new ByteArrayInputStream(_bytes);
        pluginXml.create(inputStream, true, monitor);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void createActivator(final IFolder folder, final IProgressMonitor monitor) {
    try {
      final IFile siriusTextPlugin = folder.getFile("SiriusTextPlugin.java");
      boolean _exists = siriusTextPlugin.exists();
      boolean _not = (!_exists);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* Created by Sirius Text");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("package ");
        IProject _project = folder.getProject();
        String _name = _project.getName();
        _builder.append(_name, "");
        _builder.append(".internal;");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("import java.util.HashSet;");
        _builder.newLine();
        _builder.append("import java.util.Set;");
        _builder.newLine();
        _builder.newLine();
        _builder.append("import org.eclipse.emf.common.EMFPlugin;");
        _builder.newLine();
        _builder.append("import org.eclipse.emf.common.util.ResourceLocator;");
        _builder.newLine();
        _builder.append("import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;");
        _builder.newLine();
        _builder.append("import org.eclipse.sirius.viewpoint.description.Viewpoint;");
        _builder.newLine();
        _builder.newLine();
        _builder.append("import org.osgi.framework.BundleContext;");
        _builder.newLine();
        _builder.newLine();
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* The plugin class of the bundle.");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("public class SiriusTextPlugin extends EMFPlugin {");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* The identifier of the plugin.");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static final String PLUGIN_ID = \"");
        IProject _project_1 = folder.getProject();
        String _name_1 = _project_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append("\"; //$NON-NLS-1$");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* The sole instance of the plugin.");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static final SiriusTextPlugin INSTANCE = new SiriusTextPlugin();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* The OSGi related implementation of the plugin.");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("private static Implementation plugin;");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* The constructor.");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public SiriusTextPlugin() {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("super(new ResourceLocator[0]);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* {@inheritDoc}");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* @see org.eclipse.emf.common.EMFPlugin#getPluginResourceLocator()");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ResourceLocator getPluginResourceLocator() {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("return plugin;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* Returns the OSGi related implementation.");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* @return The OSGi related implementation");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static Implementation getImplementation() {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("return plugin;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* This class is used as the bundle activator of the plugin.");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static class Implementation extends EclipsePlugin {");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("* The viewpoints registered by this plugin.");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("private static Set<Viewpoint> viewpoints;");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("* The constructor.");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("public Implementation() {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("super();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("SiriusTextPlugin.plugin = this;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("* {@inheritDoc}");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("*");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("* @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("public void start(BundleContext context) throws Exception {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("super.start(context);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("viewpoints = new HashSet<Viewpoint>();");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + \"/description/designer.odesign\")); ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("* {@inheritDoc}");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("*");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("* @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("public void stop(BundleContext context) throws Exception {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("if (viewpoints != null) {");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("for (final Viewpoint viewpoint: viewpoints) {");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("viewpoints.clear();");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("viewpoints = null; ");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("super.stop(context);");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        final String content = _builder.toString();
        byte[] _bytes = content.getBytes("UTF-8");
        final ByteArrayInputStream inputStream = new ByteArrayInputStream(_bytes);
        siriusTextPlugin.create(inputStream, true, monitor);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void createDefaultDesigner(final IFolder folder, final IProgressMonitor monitor) {
    try {
      final IFile designerSirius = folder.getFile("Designer.sirius");
      boolean _exists = designerSirius.exists();
      boolean _not = (!_exists);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* Created by Sirius Text");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("package ");
        IProject _project = folder.getProject();
        String _name = _project.getName();
        _builder.append(_name, "");
        _builder.append(".internal");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* A Sirius based designer");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("designer Designer as \'Designer\' {");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("viewpoint Architect {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("representations = []");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        final String content = _builder.toString();
        byte[] _bytes = content.getBytes("UTF-8");
        final ByteArrayInputStream inputStream = new ByteArrayInputStream(_bytes);
        designerSirius.create(inputStream, true, monitor);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
