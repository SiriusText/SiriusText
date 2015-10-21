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
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.diagram.BackgroundStyle;
import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.AdditionalLayer;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
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
import org.obeonetwork.sirius.text.siriusTextDsl.Color;
import org.obeonetwork.sirius.text.siriusTextDsl.ColorValue;
import org.obeonetwork.sirius.text.siriusTextDsl.Container;
import org.obeonetwork.sirius.text.siriusTextDsl.ContainerStyle;
import org.obeonetwork.sirius.text.siriusTextDsl.Designer;
import org.obeonetwork.sirius.text.siriusTextDsl.Diagram;
import org.obeonetwork.sirius.text.siriusTextDsl.Gradient;
import org.obeonetwork.sirius.text.siriusTextDsl.GradientDirection;
import org.obeonetwork.sirius.text.siriusTextDsl.LabelAlignment;
import org.obeonetwork.sirius.text.siriusTextDsl.Layer;
import org.obeonetwork.sirius.text.siriusTextDsl.Mapping;
import org.obeonetwork.sirius.text.siriusTextDsl.Palette;
import org.obeonetwork.sirius.text.siriusTextDsl.RGB;
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
  
  public void populateGroupForDesigner(final Group group, final Designer designer) {
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
  
  public void populateViewpoint(final org.eclipse.sirius.viewpoint.description.Viewpoint siriusViewpoint, final Viewpoint viewpoint) {
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
  
  public void populateDiagram(final DiagramDescription diagramDescription, final Diagram diagram) {
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
  
  public void populateDefaultLayer(final org.eclipse.sirius.diagram.description.Layer siriusLayer, final Layer layer) {
    String _name = layer.getName();
    siriusLayer.setName(_name);
    EList<Mapping> _mappings = layer.getMappings();
    Iterable<Container> _filter = Iterables.<Container>filter(_mappings, Container.class);
    final Consumer<Container> _function = (Container c) -> {
      final ContainerMapping containerMapping = org.eclipse.sirius.diagram.description.DescriptionFactory.eINSTANCE.createContainerMapping();
      EList<ContainerMapping> _containerMappings = siriusLayer.getContainerMappings();
      _containerMappings.add(containerMapping);
      this.populateContainerMapping(containerMapping, c);
    };
    _filter.forEach(_function);
  }
  
  public Object populateAdditionalLayer(final AdditionalLayer siriusLayer, final Layer layer) {
    return null;
  }
  
  public void populateContainerMapping(final ContainerMapping containerMapping, final Container container) {
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
  
  public String trimQuotes(final String expressionOrLabel) {
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
  
  public void populateGradientStyle(final FlatContainerStyleDescription gradientStyle, final Gradient gradient) {
    String _labelExpression = gradient.getLabelExpression();
    String _trimQuotes = this.trimQuotes(_labelExpression);
    gradientStyle.setLabelExpression(_trimQuotes);
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
    boolean _notEquals = (!Objects.equal(_backgroundColor, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(group, null));
      _and = _notEquals_1;
    }
    if (_and) {
      Color _backgroundColor_1 = gradient.getBackgroundColor();
      ColorDescription _colorDescription = this.getColorDescription(group, _backgroundColor_1);
      gradientStyle.setBackgroundColor(_colorDescription);
    }
    boolean _and_1 = false;
    Color _foregroundColor = gradient.getForegroundColor();
    boolean _notEquals_2 = (!Objects.equal(_foregroundColor, null));
    if (!_notEquals_2) {
      _and_1 = false;
    } else {
      boolean _notEquals_3 = (!Objects.equal(group, null));
      _and_1 = _notEquals_3;
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
  
  public ColorDescription getColorDescription(final Group group, final Color color) {
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
  
  public ColorDescription getColorInPalette(final UserColorsPalette userColorsPalette, final Color color) {
    DescriptionFactory _descriptionFactory = DescriptionPackage.eINSTANCE.getDescriptionFactory();
    final UserFixedColor userColor = _descriptionFactory.createUserFixedColor();
    EList<UserColor> _entries = userColorsPalette.getEntries();
    _entries.add(userColor);
    this.populateUserFixedColor(userColor, color);
    return userColor;
  }
  
  public void populateUserFixedColor(final UserFixedColor userFixedColor, final Color color) {
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
