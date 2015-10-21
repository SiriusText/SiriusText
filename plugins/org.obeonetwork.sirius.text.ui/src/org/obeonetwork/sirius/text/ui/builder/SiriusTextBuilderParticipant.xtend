package org.obeonetwork.sirius.text.ui.builder

import org.eclipse.xtext.builder.BuilderParticipant
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import com.google.inject.Inject
import org.eclipse.xtext.resource.IContainer
import org.obeonetwork.sirius.text.generator.IMultipleResourcesGenerator
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.CoreException
import org.eclipse.xtext.resource.IResourceDescription.Delta
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.resource.IResourceDescription

class SiriusTextBuilderParticipant extends BuilderParticipant {
	@Inject
	ResourceDescriptionsProvider resourceDescriptionsProvider;

	@Inject
	private IContainer.Manager containerManager;

	@Inject(optional=true)
	private IMultipleResourcesGenerator generator;

	protected ThreadLocal<Boolean> buildSemaphor = new ThreadLocal<Boolean>();

	override build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
	    buildSemaphor.set(false);
	    super.build(context, monitor)		
	}
	
	override protected handleChangedContents(Delta delta, IBuildContext context, IFileSystemAccess fileSystemAccess) throws CoreException {
		super.handleChangedContents(delta, context, fileSystemAccess)
		if (!buildSemaphor.get() && generator != null) {
			invokeGenerator(delta, context, fileSystemAccess);
		}
	}
	
	def invokeGenerator(Delta delta, IBuildContext context, IFileSystemAccess fileSystemAccess) {
		buildSemaphor.set(true);
		
		val resource = context.getResourceSet().getResource(delta.getUri(), true);
		if (shouldGenerate(resource, context)) {
			val index = resourceDescriptionsProvider.createResourceDescriptions();
			val resDesc = index.getResourceDescription(resource.getURI());
			val visibleContainers = containerManager.getVisibleContainers(resDesc, index);
			
			for (IContainer c : visibleContainers) {
				for (IResourceDescription rd : c.getResourceDescriptions()) {
					context.getResourceSet().getResource(rd.getURI(), true);
				}
			}
			
			generator.doGenerate(context.getResourceSet(), fileSystemAccess);
		}
	}
}