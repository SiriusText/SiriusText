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
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.diagram.BackgroundStyle;
import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.EdgeArrows;
import org.eclipse.sirius.diagram.EdgeRouting;
import org.eclipse.sirius.diagram.description.AdditionalLayer;
import org.eclipse.sirius.diagram.description.CenteringStyle;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.style.EdgeStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.viewpoint.description.ColorDescription;
import org.eclipse.sirius.viewpoint.description.DescriptionFactory;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.UserColor;
import org.eclipse.sirius.viewpoint.description.UserColorsPalette;
import org.eclipse.sirius.viewpoint.description.UserFixedColor;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.obeonetwork.sirius.text.generator.IMultipleResourcesGenerator;
import org.obeonetwork.sirius.text.siriusTextDsl.ArrowDecorator;
import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.ColorValue;
import org.obeonetwork.sirius.text.siriusTextDsl.Container;
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.Designer;
import org.obeonetwork.sirius.text.siriusTextDsl.Diagram;
import org.obeonetwork.sirius.text.siriusTextDsl.Edge;
import org.obeonetwork.sirius.text.siriusTextDsl.EdgeStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.EndsCentering;
import org.obeonetwork.sirius.text.siriusTextDsl.FoldingStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.Gradient;
import org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection;
import org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment;
import org.obeonetwork.sirius.text.siriusTextDsl.Layer;
import org.obeonetwork.sirius.text.siriusTextDsl.LineStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.Mapping;
import org.obeonetwork.sirius.text.siriusTextDsl.Palette;
import org.obeonetwork.sirius.text.siriusTextDsl.RGB;
import org.obeonetwork.sirius.text.siriusTextDsl.RelationBasedEdge;
import org.obeonetwork.sirius.text.siriusTextDsl.Representation;
import org.obeonetwork.sirius.text.siriusTextDsl.RoutingStyle;
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
  private final HashMap<Object, Object> cache = CollectionLiterals.<Object, Object>newHashMap();
  
  private final HashMap<Object, Object> elementsToResolve = CollectionLiterals.<Object, Object>newHashMap();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
  }
  
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
        DescriptionFactory _descriptionFactory = DescriptionPackage.eINSTANCE.getDescriptionFactory();
        final Group group = _descriptionFactory.createGroup();
        this.populateGroupForDesigner(group, designer);
        this.resolveLinks();
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
  
  private void resolveLinks() {
    this.resolveMappingsForEdges();
    this.cache.clear();
    this.elementsToResolve.clear();
  }
  
  private void resolveMappingsForEdges() {
    Set<Map.Entry<Object, Object>> _entrySet = this.elementsToResolve.entrySet();
    final Function1<Map.Entry<Object, Object>, Boolean> _function = (Map.Entry<Object, Object> e) -> {
      Object _key = e.getKey();
      return Boolean.valueOf((_key instanceof RelationBasedEdge));
    };
    Iterable<Map.Entry<Object, Object>> _filter = IterableExtensions.<Map.Entry<Object, Object>>filter(_entrySet, _function);
    final Consumer<Map.Entry<Object, Object>> _function_1 = (Map.Entry<Object, Object> e) -> {
      boolean _and = false;
      Object _key = e.getKey();
      if (!(_key instanceof RelationBasedEdge)) {
        _and = false;
      } else {
        Object _value = e.getValue();
        _and = (_value instanceof EdgeMapping);
      }
      if (_and) {
        Object _key_1 = e.getKey();
        final RelationBasedEdge relationBasedEdge = ((RelationBasedEdge) _key_1);
        Object _value_1 = e.getValue();
        final EdgeMapping edgeMapping = ((EdgeMapping) _value_1);
        EList<Mapping> _sourceMappings = relationBasedEdge.getSourceMappings();
        final Consumer<Mapping> _function_2 = (Mapping s) -> {
          final Object sourceMapping = this.cache.get(s);
          if ((sourceMapping instanceof DiagramElementMapping)) {
            EList<DiagramElementMapping> _sourceMapping = edgeMapping.getSourceMapping();
            _sourceMapping.add(((DiagramElementMapping) sourceMapping));
          }
        };
        _sourceMappings.forEach(_function_2);
        EList<Mapping> _targetMappings = relationBasedEdge.getTargetMappings();
        final Consumer<Mapping> _function_3 = (Mapping s) -> {
          final Object targetMapping = this.cache.get(s);
          if ((targetMapping instanceof DiagramElementMapping)) {
            EList<DiagramElementMapping> _targetMapping = edgeMapping.getTargetMapping();
            _targetMapping.add(((DiagramElementMapping) targetMapping));
          }
        };
        _targetMappings.forEach(_function_3);
      }
    };
    _filter.forEach(_function_1);
  }
  
  private void populateGroupForDesigner(final Group group, final Designer designer) {
    String _label = designer.getLabel();
    group.setName(_label);
    String _documentation = designer.getDocumentation();
    group.setDocumentation(_documentation);
    EList<Viewpoint> _viewpoints = designer.getViewpoints();
    final Consumer<Viewpoint> _function = (Viewpoint v) -> {
      DescriptionFactory _descriptionFactory = DescriptionPackage.eINSTANCE.getDescriptionFactory();
      final org.eclipse.sirius.viewpoint.description.Viewpoint siriusViewpoint = _descriptionFactory.createViewpoint();
      EList<org.eclipse.sirius.viewpoint.description.Viewpoint> _ownedViewpoints = group.getOwnedViewpoints();
      CollectionExtensions.<org.eclipse.sirius.viewpoint.description.Viewpoint>addAll(_ownedViewpoints, siriusViewpoint);
      this.populateViewpoint(siriusViewpoint, v);
    };
    _viewpoints.forEach(_function);
  }
  
  private void populateViewpoint(final org.eclipse.sirius.viewpoint.description.Viewpoint siriusViewpoint, final Viewpoint viewpoint) {
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
    final Consumer<Representation> _function_1 = (Representation r) -> {
      if ((r instanceof Diagram)) {
        final Diagram diagram = ((Diagram) r);
        final DiagramDescription diagramDescription = org.eclipse.sirius.diagram.description.DescriptionFactory.eINSTANCE.createDiagramDescription();
        EList<RepresentationDescription> _ownedRepresentations = siriusViewpoint.getOwnedRepresentations();
        _ownedRepresentations.add(diagramDescription);
        this.populateDiagram(diagramDescription, diagram);
      }
    };
    _representations.forEach(_function_1);
  }
  
  private void populateDiagram(final DiagramDescription diagramDescription, final Diagram diagram) {
    String _name = diagram.getName();
    diagramDescription.setName(_name);
    String _label = diagram.getLabel();
    diagramDescription.setLabel(_label);
    String _domainClass = diagram.getDomainClass();
    diagramDescription.setDomainClass(_domainClass);
    boolean _isShowOnStartup = diagram.isShowOnStartup();
    diagramDescription.setShowOnStartup(_isShowOnStartup);
    boolean _isInitialized = diagram.isInitialized();
    diagramDescription.setInitialisation(_isInitialized);
    boolean _isEnablePopupBars = diagram.isEnablePopupBars();
    diagramDescription.setEnablePopupBars(_isEnablePopupBars);
    final Layer defaultLayer = diagram.getDefaultLayer();
    boolean _notEquals = (!Objects.equal(defaultLayer, null));
    if (_notEquals) {
      final org.eclipse.sirius.diagram.description.Layer siriusLayer = org.eclipse.sirius.diagram.description.DescriptionFactory.eINSTANCE.createLayer();
      diagramDescription.setDefaultLayer(siriusLayer);
      this.populateDefaultLayer(siriusLayer, defaultLayer);
    }
    EList<Layer> _additionalLayers = diagram.getAdditionalLayers();
    final Consumer<Layer> _function = (Layer l) -> {
      final AdditionalLayer siriusLayer_1 = org.eclipse.sirius.diagram.description.DescriptionFactory.eINSTANCE.createAdditionalLayer();
      EList<AdditionalLayer> _additionalLayers_1 = diagramDescription.getAdditionalLayers();
      _additionalLayers_1.add(siriusLayer_1);
      this.populateAdditionalLayer(siriusLayer_1, l);
    };
    _additionalLayers.forEach(_function);
  }
  
  private void populateDefaultLayer(final org.eclipse.sirius.diagram.description.Layer siriusLayer, final Layer layer) {
    String _name = layer.getName();
    siriusLayer.setName(_name);
    EList<Mapping> _mappings = layer.getMappings();
    Iterable<Container> _filter = Iterables.<Container>filter(_mappings, Container.class);
    final Consumer<Container> _function = (Container c) -> {
      final ContainerMapping containerMapping = org.eclipse.sirius.diagram.description.DescriptionFactory.eINSTANCE.createContainerMapping();
      EList<ContainerMapping> _containerMappings = siriusLayer.getContainerMappings();
      _containerMappings.add(containerMapping);
      this.cache.put(c, containerMapping);
      this.populateContainerMapping(containerMapping, c);
    };
    _filter.forEach(_function);
    EList<Edge> _edges = layer.getEdges();
    Iterable<RelationBasedEdge> _filter_1 = Iterables.<RelationBasedEdge>filter(_edges, RelationBasedEdge.class);
    final Consumer<RelationBasedEdge> _function_1 = (RelationBasedEdge r) -> {
      final EdgeMapping edgeMapping = org.eclipse.sirius.diagram.description.DescriptionFactory.eINSTANCE.createEdgeMapping();
      EList<EdgeMapping> _edgeMappings = siriusLayer.getEdgeMappings();
      _edgeMappings.add(edgeMapping);
      this.elementsToResolve.put(r, edgeMapping);
      this.populateRelationBasedEdgeMapping(edgeMapping, r);
    };
    _filter_1.forEach(_function_1);
  }
  
  private Object populateAdditionalLayer(final AdditionalLayer siriusLayer, final Layer layer) {
    return null;
  }
  
  private void populateRelationBasedEdgeMapping(final EdgeMapping edgeMapping, final RelationBasedEdge relationBasedEdge) {
    String _name = relationBasedEdge.getName();
    edgeMapping.setName(_name);
    String _label = relationBasedEdge.getLabel();
    edgeMapping.setLabel(_label);
    String _targetFinderExpression = relationBasedEdge.getTargetFinderExpression();
    String _trimQuotes = this.trimQuotes(_targetFinderExpression);
    edgeMapping.setTargetFinderExpression(_trimQuotes);
    final EdgeStyle style = relationBasedEdge.getStyle();
    boolean _notEquals = (!Objects.equal(style, null));
    if (_notEquals) {
      final EdgeStyleDescription edgeStyleDescription = StyleFactory.eINSTANCE.createEdgeStyleDescription();
      edgeMapping.setStyle(edgeStyleDescription);
      this.populateEdgeStyleDescription(edgeStyleDescription, style);
    }
  }
  
  private void populateEdgeStyleDescription(final EdgeStyleDescription edgeStyleDescription, final EdgeStyle edgeStyle) {
    String _sizeComputationExpression = edgeStyle.getSizeComputationExpression();
    String _trimQuotes = this.trimQuotes(_sizeComputationExpression);
    edgeStyleDescription.setSizeComputationExpression(_trimQuotes);
    final Group group = this.getGroup(edgeStyleDescription);
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(group, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Color _strokeColor = edgeStyle.getStrokeColor();
      boolean _notEquals_1 = (!Objects.equal(_strokeColor, null));
      _and = _notEquals_1;
    }
    if (_and) {
      Color _strokeColor_1 = edgeStyle.getStrokeColor();
      final ColorDescription colorDescription = this.getColorDescription(group, _strokeColor_1);
      edgeStyleDescription.setStrokeColor(colorDescription);
    }
    LineStyle _lineStyle = edgeStyle.getLineStyle();
    org.eclipse.sirius.diagram.LineStyle _lineStyle_1 = this.getLineStyle(_lineStyle);
    edgeStyleDescription.setLineStyle(_lineStyle_1);
    RoutingStyle _routingStyle = edgeStyle.getRoutingStyle();
    EdgeRouting _routingStyle_1 = this.getRoutingStyle(_routingStyle);
    edgeStyleDescription.setRoutingStyle(_routingStyle_1);
    ArrowDecorator _sourceArrow = edgeStyle.getSourceArrow();
    EdgeArrows _edgeArrows = this.getEdgeArrows(_sourceArrow);
    edgeStyleDescription.setSourceArrow(_edgeArrows);
    ArrowDecorator _targetArrow = edgeStyle.getTargetArrow();
    EdgeArrows _edgeArrows_1 = this.getEdgeArrows(_targetArrow);
    edgeStyleDescription.setTargetArrow(_edgeArrows_1);
    FoldingStyle _foldingStyle = edgeStyle.getFoldingStyle();
    org.eclipse.sirius.diagram.description.FoldingStyle _foldingStyle_1 = this.getFoldingStyle(_foldingStyle);
    edgeStyleDescription.setFoldingStyle(_foldingStyle_1);
    EndsCentering _endsCentering = edgeStyle.getEndsCentering();
    CenteringStyle _endsCentering_1 = this.getEndsCentering(_endsCentering);
    edgeStyleDescription.setEndsCentering(_endsCentering_1);
  }
  
  private org.eclipse.sirius.diagram.LineStyle getLineStyle(final LineStyle lineStyle) {
    org.eclipse.sirius.diagram.LineStyle siriusLineStyle = org.eclipse.sirius.diagram.LineStyle.SOLID_LITERAL;
    boolean _equals = lineStyle.equals(LineStyle.DASH_DOT);
    if (_equals) {
      siriusLineStyle = org.eclipse.sirius.diagram.LineStyle.DASH_DOT_LITERAL;
    } else {
      boolean _equals_1 = lineStyle.equals(LineStyle.DOT);
      if (_equals_1) {
        siriusLineStyle = org.eclipse.sirius.diagram.LineStyle.DOT_LITERAL;
      } else {
        boolean _equals_2 = lineStyle.equals(LineStyle.DASH);
        if (_equals_2) {
          siriusLineStyle = org.eclipse.sirius.diagram.LineStyle.DASH_LITERAL;
        }
      }
    }
    return siriusLineStyle;
  }
  
  private EdgeRouting getRoutingStyle(final RoutingStyle routingStyle) {
    EdgeRouting edgeRouting = EdgeRouting.STRAIGHT_LITERAL;
    boolean _equals = routingStyle.equals(RoutingStyle.MANHATTAN);
    if (_equals) {
      edgeRouting = EdgeRouting.MANHATTAN_LITERAL;
    } else {
      boolean _equals_1 = routingStyle.equals(RoutingStyle.TREE);
      if (_equals_1) {
        edgeRouting = EdgeRouting.TREE_LITERAL;
      }
    }
    return edgeRouting;
  }
  
  private EdgeArrows getEdgeArrows(final ArrowDecorator arrowDecorator) {
    EdgeArrows edgeArrows = EdgeArrows.NO_DECORATION_LITERAL;
    boolean _equals = arrowDecorator.equals(ArrowDecorator.DIAMOND);
    if (_equals) {
      edgeArrows = EdgeArrows.DIAMOND_LITERAL;
    } else {
      boolean _equals_1 = arrowDecorator.equals(ArrowDecorator.FILL_DIAMOND);
      if (_equals_1) {
        edgeArrows = EdgeArrows.FILL_DIAMOND_LITERAL;
      } else {
        boolean _equals_2 = arrowDecorator.equals(ArrowDecorator.INPUT_ARROW);
        if (_equals_2) {
          edgeArrows = EdgeArrows.INPUT_ARROW_LITERAL;
        } else {
          boolean _equals_3 = arrowDecorator.equals(ArrowDecorator.INPUT_ARROW_WITH_DIAMOND);
          if (_equals_3) {
            edgeArrows = EdgeArrows.INPUT_ARROW_WITH_DIAMOND_LITERAL;
          } else {
            boolean _equals_4 = arrowDecorator.equals(ArrowDecorator.INPUT_ARROW_WITH_FILL_DIAMOND);
            if (_equals_4) {
              edgeArrows = EdgeArrows.INPUT_ARROW_WITH_FILL_DIAMOND_LITERAL;
            } else {
              boolean _equals_5 = arrowDecorator.equals(ArrowDecorator.INPUT_CLOSED_ARROW);
              if (_equals_5) {
                edgeArrows = EdgeArrows.INPUT_CLOSED_ARROW_LITERAL;
              } else {
                boolean _equals_6 = arrowDecorator.equals(ArrowDecorator.INPUT_FILL_CLOSED_ARROW);
                if (_equals_6) {
                  edgeArrows = EdgeArrows.INPUT_FILL_CLOSED_ARROW_LITERAL;
                } else {
                  boolean _equals_7 = arrowDecorator.equals(ArrowDecorator.OUTPUT_ARROW);
                  if (_equals_7) {
                    edgeArrows = EdgeArrows.OUTPUT_ARROW_LITERAL;
                  } else {
                    boolean _equals_8 = arrowDecorator.equals(ArrowDecorator.OUTPUT_CLOSED_ARROW);
                    if (_equals_8) {
                      edgeArrows = EdgeArrows.OUTPUT_CLOSED_ARROW_LITERAL;
                    } else {
                      boolean _equals_9 = arrowDecorator.equals(ArrowDecorator.OUTPUT_FILL_CLOSED_ARROW);
                      if (_equals_9) {
                        edgeArrows = EdgeArrows.OUTPUT_FILL_CLOSED_ARROW_LITERAL;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return edgeArrows;
  }
  
  private org.eclipse.sirius.diagram.description.FoldingStyle getFoldingStyle(final FoldingStyle foldingStyle) {
    org.eclipse.sirius.diagram.description.FoldingStyle siriusFoldingStyle = org.eclipse.sirius.diagram.description.FoldingStyle.NONE_LITERAL;
    boolean _equals = foldingStyle.equals(FoldingStyle.SOURCE);
    if (_equals) {
      siriusFoldingStyle = org.eclipse.sirius.diagram.description.FoldingStyle.SOURCE_LITERAL;
    } else {
      boolean _equals_1 = foldingStyle.equals(FoldingStyle.TARGET);
      if (_equals_1) {
        siriusFoldingStyle = org.eclipse.sirius.diagram.description.FoldingStyle.TARGET_LITERAL;
      }
    }
    return siriusFoldingStyle;
  }
  
  private CenteringStyle getEndsCentering(final EndsCentering endsCentering) {
    CenteringStyle centeringStyle = CenteringStyle.NONE;
    boolean _equals = endsCentering.equals(EndsCentering.SOURCE);
    if (_equals) {
      centeringStyle = CenteringStyle.SOURCE;
    } else {
      boolean _equals_1 = endsCentering.equals(EndsCentering.TARGET);
      if (_equals_1) {
        centeringStyle = CenteringStyle.TARGET;
      } else {
        boolean _equals_2 = endsCentering.equals(EndsCentering.BOTH);
        if (_equals_2) {
          centeringStyle = CenteringStyle.BOTH;
        }
      }
    }
    return centeringStyle;
  }
  
  private void populateContainerMapping(final ContainerMapping containerMapping, final Container container) {
    String _name = container.getName();
    containerMapping.setName(_name);
    String _label = container.getLabel();
    containerMapping.setLabel(_label);
    String _domainClass = container.getDomainClass();
    containerMapping.setDomainClass(_domainClass);
    boolean _isList = container.isList();
    if (_isList) {
      containerMapping.setChildrenPresentation(ContainerLayout.LIST);
    }
    String _semanticCanditatesExpression = container.getSemanticCanditatesExpression();
    String _trimQuotes = this.trimQuotes(_semanticCanditatesExpression);
    containerMapping.setSemanticCandidatesExpression(_trimQuotes);
    ContainerStyle _style = container.getStyle();
    if ((_style instanceof Gradient)) {
      ContainerStyle _style_1 = container.getStyle();
      final Gradient gradient = ((Gradient) _style_1);
      final FlatContainerStyleDescription gradientStyle = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
      containerMapping.setStyle(gradientStyle);
      this.populateGradientStyle(gradientStyle, gradient);
    }
  }
  
  private String trimQuotes(final String expressionOrLabel) {
    String result = expressionOrLabel;
    boolean _notEquals = (!Objects.equal(result, null));
    if (_notEquals) {
      boolean _or = false;
      boolean _and = false;
      boolean _startsWith = result.startsWith("\"");
      if (!_startsWith) {
        _and = false;
      } else {
        boolean _endsWith = result.endsWith("\"");
        _and = _endsWith;
      }
      if (_and) {
        _or = true;
      } else {
        boolean _and_1 = false;
        boolean _startsWith_1 = result.startsWith("\'");
        if (!_startsWith_1) {
          _and_1 = false;
        } else {
          boolean _endsWith_1 = result.endsWith("\'");
          _and_1 = _endsWith_1;
        }
        _or = _and_1;
      }
      if (_or) {
        String _substring = result.substring(1);
        result = _substring;
        int _length = result.length();
        int _minus = (_length - 1);
        String _substring_1 = result.substring(0, _minus);
        result = _substring_1;
      }
    }
    return result;
  }
  
  private void populateGradientStyle(final FlatContainerStyleDescription gradientStyle, final Gradient gradient) {
    String _labelExpression = gradient.getLabelExpression();
    String _trimQuotes = this.trimQuotes(_labelExpression);
    gradientStyle.setLabelExpression(_trimQuotes);
    String _heightComputationExpression = gradient.getHeightComputationExpression();
    boolean _notEquals = (!Objects.equal(_heightComputationExpression, null));
    if (_notEquals) {
      String _heightComputationExpression_1 = gradient.getHeightComputationExpression();
      String _trimQuotes_1 = this.trimQuotes(_heightComputationExpression_1);
      gradientStyle.setHeightComputationExpression(_trimQuotes_1);
    }
    String _widthComputationExpression = gradient.getWidthComputationExpression();
    boolean _notEquals_1 = (!Objects.equal(_widthComputationExpression, null));
    if (_notEquals_1) {
      String _widthComputationExpression_1 = gradient.getWidthComputationExpression();
      String _trimQuotes_2 = this.trimQuotes(_widthComputationExpression_1);
      gradientStyle.setWidthComputationExpression(_trimQuotes_2);
    }
    GradientDirection _direction = gradient.getDirection();
    boolean _equals = Objects.equal(_direction, GradientDirection.LEFTTORIGHT);
    if (_equals) {
      gradientStyle.setBackgroundStyle(BackgroundStyle.GRADIENT_LEFT_TO_RIGHT_LITERAL);
    } else {
      GradientDirection _direction_1 = gradient.getDirection();
      boolean _equals_1 = Objects.equal(_direction_1, GradientDirection.OBLIQUE);
      if (_equals_1) {
        gradientStyle.setBackgroundStyle(BackgroundStyle.LIQUID_LITERAL);
      } else {
        GradientDirection _direction_2 = gradient.getDirection();
        boolean _equals_2 = Objects.equal(_direction_2, GradientDirection.TOPTOBOTTOM);
        if (_equals_2) {
          gradientStyle.setBackgroundStyle(BackgroundStyle.GRADIENT_TOP_TO_BOTTOM_LITERAL);
        }
      }
    }
    LabelAlignment _labelAlignment = gradient.getLabelAlignment();
    boolean _equals_3 = Objects.equal(_labelAlignment, org.eclipse.sirius.viewpoint.LabelAlignment.LEFT);
    if (_equals_3) {
      gradientStyle.setLabelAlignment(org.eclipse.sirius.viewpoint.LabelAlignment.LEFT);
    } else {
      LabelAlignment _labelAlignment_1 = gradient.getLabelAlignment();
      boolean _equals_4 = Objects.equal(_labelAlignment_1, org.eclipse.sirius.viewpoint.LabelAlignment.CENTER);
      if (_equals_4) {
        gradientStyle.setLabelAlignment(org.eclipse.sirius.viewpoint.LabelAlignment.CENTER);
      } else {
        LabelAlignment _labelAlignment_2 = gradient.getLabelAlignment();
        boolean _equals_5 = Objects.equal(_labelAlignment_2, org.eclipse.sirius.viewpoint.LabelAlignment.RIGHT);
        if (_equals_5) {
          gradientStyle.setLabelAlignment(org.eclipse.sirius.viewpoint.LabelAlignment.RIGHT);
        }
      }
    }
    final Group group = this.getGroup(gradientStyle);
    boolean _and = false;
    Color _backgroundColor = gradient.getBackgroundColor();
    boolean _notEquals_2 = (!Objects.equal(_backgroundColor, null));
    if (!_notEquals_2) {
      _and = false;
    } else {
      boolean _notEquals_3 = (!Objects.equal(group, null));
      _and = _notEquals_3;
    }
    if (_and) {
      Color _backgroundColor_1 = gradient.getBackgroundColor();
      ColorDescription _colorDescription = this.getColorDescription(group, _backgroundColor_1);
      gradientStyle.setBackgroundColor(_colorDescription);
    }
    boolean _and_1 = false;
    Color _foregroundColor = gradient.getForegroundColor();
    boolean _notEquals_4 = (!Objects.equal(_foregroundColor, null));
    if (!_notEquals_4) {
      _and_1 = false;
    } else {
      boolean _notEquals_5 = (!Objects.equal(group, null));
      _and_1 = _notEquals_5;
    }
    if (_and_1) {
      Color _foregroundColor_1 = gradient.getForegroundColor();
      ColorDescription _colorDescription_1 = this.getColorDescription(group, _foregroundColor_1);
      gradientStyle.setForegroundColor(_colorDescription_1);
    }
  }
  
  private Group getGroup(final EObject eObject) {
    EObject tempEObject = eObject;
    Group group = null;
    while ((Objects.equal(group, null) && (!Objects.equal(tempEObject, null)))) {
      if ((tempEObject instanceof Group)) {
        group = ((Group) tempEObject);
      } else {
        EObject _eContainer = tempEObject.eContainer();
        tempEObject = _eContainer;
      }
    }
    return group;
  }
  
  private ColorDescription getColorDescription(final Group group, final Color color) {
    ColorDescription colorDescription = null;
    final EObject eContainer = color.eContainer();
    if ((eContainer instanceof Palette)) {
      final Palette palette = ((Palette) eContainer);
      EList<UserColorsPalette> _userColorsPalettes = group.getUserColorsPalettes();
      final Function1<UserColorsPalette, Boolean> _function = (UserColorsPalette p) -> {
        String _name = p.getName();
        String _name_1 = palette.getName();
        return Boolean.valueOf(_name.equals(_name_1));
      };
      final UserColorsPalette userPalette = IterableExtensions.<UserColorsPalette>findFirst(_userColorsPalettes, _function);
      boolean _equals = Objects.equal(userPalette, null);
      if (_equals) {
        DescriptionFactory _descriptionFactory = DescriptionPackage.eINSTANCE.getDescriptionFactory();
        final UserColorsPalette userColorsPalette = _descriptionFactory.createUserColorsPalette();
        EList<UserColorsPalette> _userColorsPalettes_1 = group.getUserColorsPalettes();
        _userColorsPalettes_1.add(userColorsPalette);
        String _name = palette.getName();
        userColorsPalette.setName(_name);
        ColorDescription _colorInPalette = this.getColorInPalette(userColorsPalette, color);
        colorDescription = _colorInPalette;
      } else {
        EList<UserColor> _entries = userPalette.getEntries();
        final Function1<UserColor, Boolean> _function_1 = (UserColor c) -> {
          String _name_1 = c.getName();
          String _name_2 = color.getName();
          return Boolean.valueOf(_name_1.equals(_name_2));
        };
        UserColor userColor = IterableExtensions.<UserColor>findFirst(_entries, _function_1);
        boolean _equals_1 = Objects.equal(userColor, null);
        if (_equals_1) {
          ColorDescription _colorInPalette_1 = this.getColorInPalette(userPalette, color);
          colorDescription = _colorInPalette_1;
        } else {
          if ((userColor instanceof ColorDescription)) {
            colorDescription = ((ColorDescription) userColor);
          }
        }
      }
    }
    return colorDescription;
  }
  
  private ColorDescription getColorInPalette(final UserColorsPalette userColorsPalette, final Color color) {
    DescriptionFactory _descriptionFactory = DescriptionPackage.eINSTANCE.getDescriptionFactory();
    final UserFixedColor userColor = _descriptionFactory.createUserFixedColor();
    EList<UserColor> _entries = userColorsPalette.getEntries();
    _entries.add(userColor);
    this.populateUserFixedColor(userColor, color);
    return userColor;
  }
  
  private void populateUserFixedColor(final UserFixedColor userFixedColor, final Color color) {
    String _name = color.getName();
    userFixedColor.setName(_name);
    ColorValue _value = color.getValue();
    if ((_value instanceof RGB)) {
      ColorValue _value_1 = color.getValue();
      final RGB rgb = ((RGB) _value_1);
      int _red = rgb.getRed();
      userFixedColor.setRed(_red);
      int _green = rgb.getGreen();
      userFixedColor.setGreen(_green);
      int _blue = rgb.getBlue();
      userFixedColor.setBlue(_blue);
    }
  }
}
