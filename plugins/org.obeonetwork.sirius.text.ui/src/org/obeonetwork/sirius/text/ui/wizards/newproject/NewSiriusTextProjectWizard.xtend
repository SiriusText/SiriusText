package org.obeonetwork.sirius.text.ui.wizards.newproject

import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.IExecutableExtension
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench
import org.eclipse.jface.operation.IRunnableWithProgress
import org.eclipse.core.runtime.IProgressMonitor
import java.lang.reflect.InvocationTargetException
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IProject
import java.io.ByteArrayInputStream
import org.eclipse.core.runtime.Path
import java.util.StringTokenizer
import org.eclipse.core.resources.IFolder
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard

class NewSiriusTextProjectWizard extends Wizard implements INewWizard, IExecutableExtension {
	
	IWorkbench workbench
	
	IStructuredSelection selection
	
	IConfigurationElement configurationElement
	
	NewSiriusTextProjectWizardFirstPage firstPage
	
	new() {
		super();
		this.windowTitle = "New Sirius Text Project";
	}
	
	override init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}
	
	override setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		this.configurationElement = config;
	}
	
	override needsProgressMonitor() {
		return true;
	}
	
	override addPages() {
		this.firstPage = new NewSiriusTextProjectWizardFirstPage(this.selection);
		this.addPage(this.firstPage);
	}
	
	override canFinish() {
		return this.firstPage.isPageComplete();
	}
	
	override performFinish() {
		val runnable = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				val project = ResourcesPlugin.workspace.root.getProject(firstPage.projectName)
				var location = firstPage.locationPath
				if (!project.exists) {
					val description = project.workspace.newProjectDescription(firstPage.projectName)
					if (location != null && ResourcesPlugin.workspace.root.location.equals(location)) {
						location = null
					}
					description.location = location
					
					val jdtBuildCommand = description.newCommand
					jdtBuildCommand.builderName = "org.eclipse.jdt.core.javabuilder"
					val pdeManifestBuildCommand = description.newCommand
					pdeManifestBuildCommand.builderName = "org.eclipse.pde.ManifestBuilder"
					val pdeSchemaBuildCommand = description.newCommand
					pdeSchemaBuildCommand.builderName = "org.eclipse.pde.SchemaBuilder"
					val xtextBuildCommand = description.newCommand
					xtextBuildCommand.builderName = "org.eclipse.xtext.ui.shared.xtextBuilder"
					
					description.buildSpec = #[jdtBuildCommand, pdeManifestBuildCommand, pdeSchemaBuildCommand, xtextBuildCommand]
					description.setNatureIds(#["org.eclipse.xtext.ui.shared.xtextNature", "org.eclipse.jdt.core.javanature",
							"org.eclipse.pde.PluginNature"])
					project.create(description, monitor)
					project.open(monitor)
					
					convertProject(project, monitor)
				}
				if (!project.isOpen()) {
					project.open(monitor)
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
	
	def private void convertProject(IProject project, IProgressMonitor monitor) {
		this.createManifestMf(project, monitor)
		this.createClasspath(project, monitor)
		this.createPropertiesFiles(project, monitor)
		this.createSource(project, monitor)
	}
	
	def private void createManifestMf(IProject project, IProgressMonitor monitor) {
		val metaInf = project.getFolder("META-INF")
		if (!metaInf.exists) {
			metaInf.create(true, true, monitor)
		}
		val manifestMf = metaInf.getFile("MANIFEST.MF")
		if (!manifestMf.exists) {
			val content = '''
				Manifest-Version: 1.0
				Bundle-ManifestVersion: 2
				Bundle-Name: %pluginName
				Bundle-Vendor: %providerName
				Bundle-Version: 1.0.0.qualifier
				Bundle-SymbolicName: «project.name»; singleton:=true
				Bundle-Activator: «project.name».internal.SiriusTextPlugin$Implementation
				Bundle-ActivationPolicy: lazy
				Require-Bundle: org.eclipse.ui,
				 org.eclipse.core.runtime,
				 org.eclipse.core.resources,
				 org.eclipse.sirius,
				 org.eclipse.sirius.common.acceleo.aql
				Bundle-RequiredExecutionEnvironment: JavaSE-1.6
				Export-Package: «project.name».internal;x-internal:=true
				Bundle-Localization: plugin
			'''
			val inputStream = new ByteArrayInputStream(content.getBytes("UTF-8"))
			manifestMf.create(inputStream, true, monitor)
		}
	}
	
	def private void createClasspath(IProject project, IProgressMonitor monitor) {
		val src = project.getFolder("src")
		if (!src.exists()) {
			src.create(true, true, monitor)
		}
		
		var classpath = project.getFile(".classpath")
		if (!classpath.exists) {
			val content = '''
				<?xml version="1.0" encoding="UTF-8"?>
				<classpath>
				  <classpathentry kind="src" path="src"/>
				  <classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.6"/>
				  <classpathentry kind="con" path="org.eclipse.pde.core.requiredPlugins"/>
				  <classpathentry kind="output" path="bin"/>
				</classpath>
			'''
			val inputStream = new ByteArrayInputStream(content.getBytes("UTF-8"))
			classpath.create(inputStream, true, monitor)
		}
	}
	
	def private void createPropertiesFiles(IProject project, IProgressMonitor monitor) {
		val buildProperties = project.getFile("build.properties")
		if (!buildProperties.exists) {
			var content = '''
				source.. = src/
				output.. = bin/
				bin.includes = META-INF/,\
				               .,\
				               description/,\
				               plugin.xml,\
				               plugin.properties
			'''
			val inputStream = new ByteArrayInputStream(content.getBytes("UTF-8"))
			buildProperties.create(inputStream, true, monitor)
		}
		
		val pluginProperties = project.getFile("plugin.properties")
		if (!pluginProperties.exists) {
			var content = '''
				pluginName=Sirius Text Project
				providerName=www.obeo.fr
			'''
			val inputStream = new ByteArrayInputStream(content.getBytes("UTF-8"))
			pluginProperties.create(inputStream, true, monitor)
		}
	}
	
	def private void createSource(IProject project, IProgressMonitor monitor) {
		val src = project.getFolder(new Path("src"))
		if (src.exists) {
			var parentFolder = src;
			
			val tokenizer = new StringTokenizer(project.name, '.')
			while (tokenizer.hasMoreTokens) {
				val token = tokenizer.nextToken
				
				parentFolder = parentFolder.getFolder(token)
				if (!parentFolder.exists) {
					parentFolder.create(true, true, monitor)
				}
			}
			
			if (parentFolder.exists) {
				val internalFolder = parentFolder.getFolder("internal")
				if (!internalFolder.exists) {
					internalFolder.create(true, true, monitor)
					
					this.createActivator(internalFolder, monitor)
					this.createDefaultDesigner(internalFolder, monitor)
				}
			}
		}
		
		val description = project.getFolder("description")
		if (!description.exists) {
			description.create(true, true, monitor)
		}
		
		val pluginXml = project.getFile("plugin.xml")
		if (!pluginXml.exists) {
			val content = '''
				<?xml version="1.0" encoding="UTF-8"?>
				<?eclipse version="3.0"?>
				<plugin>
				  <extension point="org.eclipse.sirius.componentization">
				    <component class="«project.name».internal.SiriusTextPlugin"
				               id="«project.name».design"
					           name="designer">
				    </component>
				  </extension>
				</plugin>
			'''
			val inputStream = new ByteArrayInputStream(content.getBytes("UTF-8"))
			pluginXml.create(inputStream, true, monitor)
		}
	}
	
	def private void createActivator(IFolder folder, IProgressMonitor monitor) {
		val siriusTextPlugin = folder.getFile("SiriusTextPlugin.java")
		if (!siriusTextPlugin.exists) {
			val content = '''
				/**
				 * Created by Sirius Text
				 */
				package «folder.project.name».internal;

				import java.util.HashSet;
				import java.util.Set;
				
				import org.eclipse.emf.common.EMFPlugin;
				import org.eclipse.emf.common.util.ResourceLocator;
				import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
				import org.eclipse.sirius.viewpoint.description.Viewpoint;

				import org.osgi.framework.BundleContext;
				
				/**
				 * The plugin class of the bundle.
				 */
				public class SiriusTextPlugin extends EMFPlugin {
				
					/**
					 * The identifier of the plugin.
					 */
					public static final String PLUGIN_ID = "«folder.project.name»"; //$NON-NLS-1$
				
					/**
					 * The sole instance of the plugin.
					 */
					public static final SiriusTextPlugin INSTANCE = new SiriusTextPlugin();
				
					/**
					 * The OSGi related implementation of the plugin.
					 */
					private static Implementation plugin;
				
					/**
					 * The constructor.
					 */
					public SiriusTextPlugin() {
						super(new ResourceLocator[0]);
					}
				
					/**
					 * {@inheritDoc}
					 *
					 * @see org.eclipse.emf.common.EMFPlugin#getPluginResourceLocator()
					 */
					@Override
					public ResourceLocator getPluginResourceLocator() {
						return plugin;
					}
				
					/**
					 * Returns the OSGi related implementation.
					 *
					 * @return The OSGi related implementation
					 */
					public static Implementation getImplementation() {
						return plugin;
					}
				
					/**
					 * This class is used as the bundle activator of the plugin.
					 */
					public static class Implementation extends EclipsePlugin {
				
						/**
						 * The viewpoints registered by this plugin.
						 */
						private static Set<Viewpoint> viewpoints;
				
						/**
						 * The constructor.
						 */
						public Implementation() {
							super();
				
							SiriusTextPlugin.plugin = this;
						}
				
						/**
						 * {@inheritDoc}
						 *
						 * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
						 */
						@Override
						public void start(BundleContext context) throws Exception {
							super.start(context);
							viewpoints = new HashSet<Viewpoint>();
							viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/description/designer.odesign")); 
						}
				
						/**
						 * {@inheritDoc}
						 *
						 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
						 */
						@Override
						public void stop(BundleContext context) throws Exception {
							if (viewpoints != null) {
								for (final Viewpoint viewpoint: viewpoints) {
									ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
								}
								viewpoints.clear();
								viewpoints = null; 
							}
							super.stop(context);
						}
					}
				
				}
			'''
			val inputStream = new ByteArrayInputStream(content.getBytes("UTF-8"))
			siriusTextPlugin.create(inputStream, true, monitor)
		}
	}
	
	def private void createDefaultDesigner(IFolder folder, IProgressMonitor monitor) {
		val designerSirius = folder.getFile("Designer.sirius")
		if (!designerSirius.exists) {
			val content = '''
				/**
				 * Created by Sirius Text
				 */
				package «folder.project.name».internal
				
				/**
				 * A Sirius based designer
				 */
				designer Designer as 'Designer' {
					
					viewpoint Architect {
						representations = []
					}
				}
			'''
			val inputStream = new ByteArrayInputStream(content.getBytes("UTF-8"))
			designerSirius.create(inputStream, true, monitor)
		}
	}
}