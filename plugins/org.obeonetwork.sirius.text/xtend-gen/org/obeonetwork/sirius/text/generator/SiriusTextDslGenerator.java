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
package org.obeonetwork.sirius.text.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.diagram.description.AdditionalLayer;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.viewpoint.description.DescriptionFactory;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.obeonetwork.sirius.text.generator.IMultipleResourcesGenerator;
import org.obeonetwork.sirius.text.siriusTextDsl.Container;
import org.obeonetwork.sirius.text.siriusTextDsl.Designer;
import org.obeonetwork.sirius.text.siriusTextDsl.Diagram;
import org.obeonetwork.sirius.text.siriusTextDsl.Layer;
import org.obeonetwork.sirius.text.siriusTextDsl.Mapping;
import org.obeonetwork.sirius.text.siriusTextDsl.Representation;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFile;
import org.obeonetwork.sirius.text.siriusTextDsl.SiriusFileBody;
import org.obeonetwork.sirius.text.siriusTextDsl.Viewpoint;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SiriusTextDslGenerator implements IMultipleResourcesGenerator {
  @Override
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa) {
    try {
      if ((fsa instanceof AbstractFileSystemAccess)) {
        final AbstractFileSystemAccess fileSystemAccess = ((AbstractFileSystemAccess) fsa);
        fileSystemAccess.setOutputPath("./");
      }
      EList<Resource> _resources = resourceSet.getResources();
      final Function1<Resource, Boolean> _function = (Resource r) -> {
        URI _uRI = r.getURI();
        String _fileExtension = _uRI.fileExtension();
        return Boolean.valueOf("sirius".equals(_fileExtension));
      };
      final Iterable<Resource> siriusResources = IterableExtensions.<Resource>filter(_resources, _function);
      final Function1<Resource, Boolean> _function_1 = (Resource r) -> {
        boolean _and = false;
        EList<EObject> _contents = r.getContents();
        int _size = _contents.size();
        boolean _greaterThan = (_size > 0);
        if (!_greaterThan) {
          _and = false;
        } else {
          EList<EObject> _contents_1 = r.getContents();
          EObject _get = _contents_1.get(0);
          _and = (_get instanceof SiriusFile);
        }
        return Boolean.valueOf(_and);
      };
      Iterable<Resource> _filter = IterableExtensions.<Resource>filter(siriusResources, _function_1);
      final Function1<Resource, SiriusFile> _function_2 = (Resource r) -> {
        EList<EObject> _contents = r.getContents();
        EObject _get = _contents.get(0);
        return ((SiriusFile) _get);
      };
      final Iterable<SiriusFile> siriusFiles = IterableExtensions.<Resource, SiriusFile>map(_filter, _function_2);
      final Function1<SiriusFile, Boolean> _function_3 = (SiriusFile siriusFile) -> {
        SiriusFileBody _body = siriusFile.getBody();
        return Boolean.valueOf((_body instanceof Designer));
      };
      final SiriusFile mainFile = IterableExtensions.<SiriusFile>findFirst(siriusFiles, _function_3);
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(mainFile, null));
      if (!_notEquals) {
        _and = false;
      } else {
        SiriusFileBody _body = mainFile.getBody();
        _and = (_body instanceof Designer);
      }
      if (_and) {
        SiriusFileBody _body_1 = mainFile.getBody();
        final Designer designer = ((Designer) _body_1);
        final Group group = this.getGroupForDesigner(designer);
        final ResourceSetImpl outputResourceSet = new ResourceSetImpl();
        URI _createURI = URI.createURI("");
        final Resource oDesignResource = outputResourceSet.createResource(_createURI);
        EList<EObject> _contents = oDesignResource.getContents();
        _contents.add(group);
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        HashMap<Object, Object> _newHashMap = CollectionLiterals.<Object, Object>newHashMap();
        oDesignResource.save(outputStream, _newHashMap);
        final String content = outputStream.toString();
        fsa.generateFile("description/designer.odesign", content);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
  }
  
  public Group getGroupForDesigner(final Designer designer) {
    DescriptionFactory _descriptionFactory = DescriptionPackage.eINSTANCE.getDescriptionFactory();
    final Group group = _descriptionFactory.createGroup();
    String _label = designer.getLabel();
    group.setName(_label);
    String _documentation = designer.getDocumentation();
    group.setDocumentation(_documentation);
    EList<Viewpoint> _viewpoints = designer.getViewpoints();
    final Function1<Viewpoint, org.eclipse.sirius.viewpoint.description.Viewpoint> _function = (Viewpoint v) -> {
      return this.getViewpoint(v);
    };
    final List<org.eclipse.sirius.viewpoint.description.Viewpoint> viewpoints = ListExtensions.<Viewpoint, org.eclipse.sirius.viewpoint.description.Viewpoint>map(_viewpoints, _function);
    EList<org.eclipse.sirius.viewpoint.description.Viewpoint> _ownedViewpoints = group.getOwnedViewpoints();
    _ownedViewpoints.addAll(viewpoints);
    return group;
  }
  
  public org.eclipse.sirius.viewpoint.description.Viewpoint getViewpoint(final Viewpoint viewpoint) {
    DescriptionFactory _descriptionFactory = DescriptionPackage.eINSTANCE.getDescriptionFactory();
    final org.eclipse.sirius.viewpoint.description.Viewpoint siriusViewpoint = _descriptionFactory.createViewpoint();
    String _name = viewpoint.getName();
    siriusViewpoint.setName(_name);
    String _label = viewpoint.getLabel();
    siriusViewpoint.setLabel(_label);
    String _documentation = viewpoint.getDocumentation();
    siriusViewpoint.setDocumentation(_documentation);
    String _icon = viewpoint.getIcon();
    siriusViewpoint.setIcon(_icon);
    EList<String> _modelFileExtensions = viewpoint.getModelFileExtensions();
    final Function2<String, String, String> _function = (String a, String b) -> {
      return ((a + ", ") + b);
    };
    String _reduce = IterableExtensions.<String>reduce(_modelFileExtensions, _function);
    siriusViewpoint.setModelFileExtension(_reduce);
    EList<Representation> _representations = viewpoint.getRepresentations();
    final Function1<Representation, RepresentationDescription> _function_1 = (Representation r) -> {
      return this.getRepresentation(r);
    };
    final List<RepresentationDescription> representations = ListExtensions.<Representation, RepresentationDescription>map(_representations, _function_1);
    EList<RepresentationDescription> _ownedRepresentations = siriusViewpoint.getOwnedRepresentations();
    _ownedRepresentations.addAll(representations);
    return siriusViewpoint;
  }
  
  public RepresentationDescription getRepresentation(final Representation representation) {
    if ((representation instanceof Diagram)) {
      final DiagramDescription representationDescription = org.eclipse.sirius.diagram.description.DescriptionFactory.eINSTANCE.createDiagramDescription();
      String _name = ((Diagram)representation).getName();
      representationDescription.setName(_name);
      String _label = ((Diagram)representation).getLabel();
      representationDescription.setLabel(_label);
      String _domainClass = ((Diagram)representation).getDomainClass();
      representationDescription.setDomainClass(_domainClass);
      boolean _isShowOnStartup = ((Diagram)representation).isShowOnStartup();
      representationDescription.setShowOnStartup(_isShowOnStartup);
      boolean _isInitialized = ((Diagram)representation).isInitialized();
      representationDescription.setInitialisation(_isInitialized);
      boolean _isEnablePopupBars = ((Diagram)representation).isEnablePopupBars();
      representationDescription.setEnablePopupBars(_isEnablePopupBars);
      final Layer defaultLayer = ((Diagram)representation).getDefaultLayer();
      boolean _notEquals = (!Objects.equal(defaultLayer, null));
      if (_notEquals) {
        org.eclipse.sirius.diagram.description.Layer _layer = this.getLayer(defaultLayer);
        representationDescription.setDefaultLayer(_layer);
      }
      EList<AdditionalLayer> _additionalLayers = representationDescription.getAdditionalLayers();
      EList<Layer> _additionalLayers_1 = ((Diagram)representation).getAdditionalLayers();
      final Function1<Layer, AdditionalLayer> _function = (Layer l) -> {
        return this.getAdditionalLayer(l);
      };
      List<AdditionalLayer> _map = ListExtensions.<Layer, AdditionalLayer>map(_additionalLayers_1, _function);
      _additionalLayers.addAll(_map);
      return representationDescription;
    }
    return null;
  }
  
  public org.eclipse.sirius.diagram.description.Layer getLayer(final Layer layer) {
    final org.eclipse.sirius.diagram.description.Layer siriusLayer = org.eclipse.sirius.diagram.description.DescriptionFactory.eINSTANCE.createLayer();
    EList<ContainerMapping> _containerMappings = siriusLayer.getContainerMappings();
    EList<Mapping> _mappings = layer.getMappings();
    Iterable<Container> _filter = Iterables.<Container>filter(_mappings, Container.class);
    final Function1<Container, ContainerMapping> _function = (Container c) -> {
      return this.getContainerMapping(c);
    };
    Iterable<ContainerMapping> _map = IterableExtensions.<Container, ContainerMapping>map(_filter, _function);
    Iterables.<ContainerMapping>addAll(_containerMappings, _map);
    return siriusLayer;
  }
  
  public AdditionalLayer getAdditionalLayer(final Layer layer) {
    final AdditionalLayer siriusLayer = org.eclipse.sirius.diagram.description.DescriptionFactory.eINSTANCE.createAdditionalLayer();
    return siriusLayer;
  }
  
  public ContainerMapping getContainerMapping(final Container container) {
    final ContainerMapping containerMapping = org.eclipse.sirius.diagram.description.DescriptionFactory.eINSTANCE.createContainerMapping();
    String _name = container.getName();
    containerMapping.setName(_name);
    String _label = container.getLabel();
    containerMapping.setLabel(_label);
    String _domainClass = container.getDomainClass();
    containerMapping.setDomainClass(_domainClass);
    return containerMapping;
  }
}
