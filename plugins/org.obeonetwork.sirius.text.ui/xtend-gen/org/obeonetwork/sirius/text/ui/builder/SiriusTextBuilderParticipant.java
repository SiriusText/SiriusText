package org.obeonetwork.sirius.text.ui.builder;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.obeonetwork.sirius.text.generator.IMultipleResourcesGenerator;

@SuppressWarnings("all")
public class SiriusTextBuilderParticipant extends BuilderParticipant {
  @Inject
  private ResourceDescriptionsProvider resourceDescriptionsProvider;
  
  @Inject
  private IContainer.Manager containerManager;
  
  @Inject(optional = true)
  private IMultipleResourcesGenerator generator;
  
  protected ThreadLocal<Boolean> buildSemaphor = new ThreadLocal<Boolean>();
  
  @Override
  public void build(final IXtextBuilderParticipant.IBuildContext context, final IProgressMonitor monitor) throws CoreException {
    this.buildSemaphor.set(Boolean.valueOf(false));
    super.build(context, monitor);
  }
  
  @Override
  protected void handleChangedContents(final IResourceDescription.Delta delta, final IXtextBuilderParticipant.IBuildContext context, final IFileSystemAccess fileSystemAccess) throws CoreException {
    super.handleChangedContents(delta, context, fileSystemAccess);
    boolean _and = false;
    Boolean _get = this.buildSemaphor.get();
    boolean _not = (!(_get).booleanValue());
    if (!_not) {
      _and = false;
    } else {
      boolean _notEquals = (!Objects.equal(this.generator, null));
      _and = _notEquals;
    }
    if (_and) {
      this.invokeGenerator(delta, context, fileSystemAccess);
    }
  }
  
  public void invokeGenerator(final IResourceDescription.Delta delta, final IXtextBuilderParticipant.IBuildContext context, final IFileSystemAccess fileSystemAccess) {
    this.buildSemaphor.set(Boolean.valueOf(true));
    ResourceSet _resourceSet = context.getResourceSet();
    URI _uri = delta.getUri();
    final Resource resource = _resourceSet.getResource(_uri, true);
    boolean _shouldGenerate = this.shouldGenerate(resource, context);
    if (_shouldGenerate) {
      final IResourceDescriptions index = this.resourceDescriptionsProvider.createResourceDescriptions();
      URI _uRI = resource.getURI();
      final IResourceDescription resDesc = index.getResourceDescription(_uRI);
      final List<IContainer> visibleContainers = this.containerManager.getVisibleContainers(resDesc, index);
      for (final IContainer c : visibleContainers) {
        Iterable<IResourceDescription> _resourceDescriptions = c.getResourceDescriptions();
        for (final IResourceDescription rd : _resourceDescriptions) {
          ResourceSet _resourceSet_1 = context.getResourceSet();
          URI _uRI_1 = rd.getURI();
          _resourceSet_1.getResource(_uRI_1, true);
        }
      }
      ResourceSet _resourceSet_2 = context.getResourceSet();
      this.generator.doGenerate(_resourceSet_2, fileSystemAccess);
    }
  }
}
