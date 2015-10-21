package org.obeonetwork.sirius.text.ui.wizards.newdiagram;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class NewSiriusTextDiagramWizardFirstPage extends WizardPage {
  private IStructuredSelection selection;
  
  private Text packageText;
  
  private Text sourceFolderText;
  
  private Text diagramNameText;
  
  private Text diagramLabelText;
  
  private TableViewer ePackagesTableViewer;
  
  private ComboViewer eClassComboViewer;
  
  public NewSiriusTextDiagramWizardFirstPage(final IStructuredSelection selection) {
    super("New Sirius Text Diagram");
    this.setTitle("Create a new Sirius Text diagram");
    this.setDescription("Enter the name of the Sirius Text diagram to create");
    this.selection = selection;
  }
  
  @Override
  public void createControl(final Composite parent) {
    final Composite composite = new Composite(parent, SWT.NONE);
    final GridLayout layout = new GridLayout();
    layout.numColumns = 1;
    composite.setLayout(layout);
    final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
    gridData.verticalAlignment = SWT.TOP;
    final int heightHint = 540;
    gridData.heightHint = heightHint;
    gridData.minimumHeight = heightHint;
    composite.setLayoutData(gridData);
    final Composite pageGroup = new Composite(composite, SWT.NONE);
    final GridLayout pageLayout = new GridLayout();
    pageLayout.numColumns = 4;
    pageGroup.setLayout(pageLayout);
    GridData _gridData = new GridData(GridData.FILL_BOTH);
    pageGroup.setLayoutData(_gridData);
    this.createSourceFolderGroup(pageGroup);
    this.createPackageGroup(pageGroup);
    this.createSeparator(pageGroup);
    this.createDiagramNameGroup(pageGroup);
    this.createDiagramLabelGroup(pageGroup);
    this.createEPackagesGroup(pageGroup);
    this.createEClassGroup(pageGroup);
    this.setControl(composite);
    Control _control = this.getControl();
    Dialog.applyDialogFont(_control);
  }
  
  private void createSourceFolderGroup(final Composite parent) {
    final Label label = new Label(parent, SWT.NULL);
    label.setText("Source Folder:");
    Text _text = new Text(parent, SWT.BORDER);
    this.sourceFolderText = _text;
    String _sourceFolder = this.getSourceFolder();
    this.sourceFolderText.setText(_sourceFolder);
    final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
    final int widthHint = 270;
    gridData.widthHint = widthHint;
    gridData.horizontalSpan = 2;
    this.sourceFolderText.setLayoutData(gridData);
    final Button packageBrowseButton = new Button(parent, SWT.PUSH);
    packageBrowseButton.setText("Browse...");
    packageBrowseButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(final SelectionEvent event) {
        NewSiriusTextDiagramWizardFirstPage.this.browseSourceFolder();
      }
    });
  }
  
  private String getSourceFolder() {
    IContainer container = null;
    final Object selectedElement = this.selection.getFirstElement();
    if ((selectedElement instanceof IContainer)) {
      container = ((IContainer) selectedElement);
    } else {
      if ((selectedElement instanceof IResource)) {
        IContainer _parent = ((IResource) selectedElement).getParent();
        container = _parent;
      } else {
        if ((selectedElement instanceof IPackageFragment)) {
          final IPackageFragment packageFragment = ((IPackageFragment) selectedElement);
          IJavaElement _parent_1 = packageFragment.getParent();
          IResource resource = _parent_1.getResource();
          if ((resource instanceof IContainer)) {
            container = ((IContainer) resource);
          } else {
            IContainer _parent_2 = resource.getParent();
            container = _parent_2;
          }
        }
      }
    }
    boolean _notEquals = (!Objects.equal(container, null));
    if (_notEquals) {
      IPath _fullPath = container.getFullPath();
      return _fullPath.toString();
    }
    return "";
  }
  
  private void browseSourceFolder() {
  }
  
  private void createPackageGroup(final Composite parent) {
    final Label label = new Label(parent, SWT.NULL);
    label.setText("Package:");
    Text _text = new Text(parent, SWT.BORDER);
    this.packageText = _text;
    String _packageFolder = this.getPackageFolder();
    this.packageText.setText(_packageFolder);
    final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
    final int widthHint = 270;
    gridData.widthHint = widthHint;
    gridData.horizontalSpan = 2;
    this.packageText.setLayoutData(gridData);
    final Button packageBrowseButton = new Button(parent, SWT.PUSH);
    packageBrowseButton.setText("Browse...");
    packageBrowseButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(final SelectionEvent event) {
        NewSiriusTextDiagramWizardFirstPage.this.browsePackage();
      }
    });
  }
  
  private String getPackageFolder() {
    final Object selectedElement = this.selection.getFirstElement();
    if ((selectedElement instanceof IPackageFragment)) {
      final IPackageFragment packageFragment = ((IPackageFragment) selectedElement);
      return packageFragment.getElementName();
    }
    return "";
  }
  
  private void browsePackage() {
  }
  
  private Label createDiagramNameGroup(final Composite parent) {
    Label _xblockexpression = null;
    {
      final Label label = new Label(parent, SWT.NULL);
      label.setText("Diagram Name:");
      Text _text = new Text(parent, SWT.BORDER);
      this.diagramNameText = _text;
      String _sourceFolder = this.getSourceFolder();
      this.diagramNameText.setText(_sourceFolder);
      final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
      final int widthHint = 270;
      gridData.widthHint = widthHint;
      gridData.horizontalSpan = 2;
      this.diagramNameText.setLayoutData(gridData);
      this.diagramNameText.setText("NewDiagram");
      _xblockexpression = new Label(parent, SWT.NULL);
    }
    return _xblockexpression;
  }
  
  private Label createDiagramLabelGroup(final Composite parent) {
    Label _xblockexpression = null;
    {
      final Label label = new Label(parent, SWT.NULL);
      label.setText("Diagram Label:");
      Text _text = new Text(parent, SWT.BORDER);
      this.diagramLabelText = _text;
      String _sourceFolder = this.getSourceFolder();
      this.diagramLabelText.setText(_sourceFolder);
      final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
      final int widthHint = 270;
      gridData.widthHint = widthHint;
      gridData.horizontalSpan = 2;
      this.diagramLabelText.setLayoutData(gridData);
      this.diagramLabelText.setText("New Diagram");
      _xblockexpression = new Label(parent, SWT.NULL);
    }
    return _xblockexpression;
  }
  
  private Label createEPackagesGroup(final Composite parent) {
    Label _xblockexpression = null;
    {
      final Label label = new Label(parent, SWT.NULL);
      label.setText("EPackages:");
      final GridData labelGridData = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
      labelGridData.horizontalSpan = 1;
      label.setLayoutData(labelGridData);
      TableViewer _tableViewer = new TableViewer(parent, ((((SWT.MULTI | SWT.H_SCROLL) | SWT.V_SCROLL) | SWT.FULL_SELECTION) | SWT.BORDER));
      this.ePackagesTableViewer = _tableViewer;
      ArrayContentProvider _instance = ArrayContentProvider.getInstance();
      this.ePackagesTableViewer.setContentProvider(_instance);
      final Table table = this.ePackagesTableViewer.getTable();
      table.setHeaderVisible(true);
      table.setLinesVisible(true);
      final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
      gridData.heightHint = 100;
      gridData.minimumHeight = 100;
      gridData.horizontalSpan = 2;
      table.setLayoutData(gridData);
      final TableViewerColumn nameColumn = new TableViewerColumn(this.ePackagesTableViewer, SWT.NONE);
      TableColumn _column = nameColumn.getColumn();
      _column.setWidth(120);
      TableColumn _column_1 = nameColumn.getColumn();
      _column_1.setText("Name");
      nameColumn.setLabelProvider(new ColumnLabelProvider() {
        @Override
        public String getText(final Object element) {
          return NewSiriusTextDiagramWizardFirstPage.this.getName(element);
        }
      });
      final TableViewerColumn nsUriColumn = new TableViewerColumn(this.ePackagesTableViewer, SWT.NONE);
      TableColumn _column_2 = nsUriColumn.getColumn();
      _column_2.setWidth(250);
      TableColumn _column_3 = nsUriColumn.getColumn();
      _column_3.setText("NsURI");
      nsUriColumn.setLabelProvider(new ColumnLabelProvider() {
        @Override
        public String getText(final Object element) {
          return NewSiriusTextDiagramWizardFirstPage.this.getNsUri(element);
        }
      });
      final ArrayList<Object> ePackages = CollectionLiterals.<Object>newArrayList();
      Collection<Object> _values = EPackage.Registry.INSTANCE.values();
      ePackages.addAll(_values);
      ePackages.sort(new Comparator<Object>() {
        @Override
        public int compare(final Object o1, final Object o2) {
          String _name = NewSiriusTextDiagramWizardFirstPage.this.getName(o1);
          String _name_1 = NewSiriusTextDiagramWizardFirstPage.this.getName(o2);
          return _name.compareTo(_name_1);
        }
      });
      this.ePackagesTableViewer.setInput(ePackages);
      final ISelectionChangedListener _function = (SelectionChangedEvent event) -> {
        this.updateEClass();
      };
      this.ePackagesTableViewer.addSelectionChangedListener(_function);
      StructuredSelection _structuredSelection = new StructuredSelection(EcorePackage.eINSTANCE);
      this.ePackagesTableViewer.setSelection(_structuredSelection, true);
      _xblockexpression = new Label(parent, SWT.NULL);
    }
    return _xblockexpression;
  }
  
  private String getName(final Object element) {
    if ((element instanceof EPackage)) {
      final EPackage ePackage = ((EPackage) element);
      return ePackage.getName();
    } else {
      if ((element instanceof EPackage.Descriptor)) {
        final EPackage.Descriptor descriptor = ((EPackage.Descriptor) element);
        EPackage _ePackage = descriptor.getEPackage();
        return _ePackage.getName();
      }
    }
    return "";
  }
  
  private String getNsUri(final Object element) {
    if ((element instanceof EPackage)) {
      final EPackage ePackage = ((EPackage) element);
      return ePackage.getNsURI();
    } else {
      if ((element instanceof EPackage.Descriptor)) {
        final EPackage.Descriptor descriptor = ((EPackage.Descriptor) element);
        EPackage _ePackage = descriptor.getEPackage();
        return _ePackage.getNsURI();
      }
    }
    return "";
  }
  
  private void updateEClass() {
    final ArrayList<EClass> eClasses = CollectionLiterals.<EClass>newArrayList();
    Iterable<EClass> _classesFromTableViewer = this.getClassesFromTableViewer();
    Iterables.<EClass>addAll(eClasses, _classesFromTableViewer);
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(this.eClassComboViewer, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Iterator<EClass> _iterator = eClasses.iterator();
      boolean _hasNext = _iterator.hasNext();
      _and = _hasNext;
    }
    if (_and) {
      this.eClassComboViewer.setInput(eClasses);
      Iterator<EClass> _iterator_1 = eClasses.iterator();
      EClass _next = _iterator_1.next();
      StructuredSelection _structuredSelection = new StructuredSelection(_next);
      this.eClassComboViewer.setSelection(_structuredSelection);
    }
  }
  
  private Iterable<EClass> getClassesFromTableViewer() {
    final ISelection selection = this.ePackagesTableViewer.getSelection();
    if ((selection instanceof IStructuredSelection)) {
      final IStructuredSelection structuredSelection = ((IStructuredSelection) selection);
      Object[] objectsSelected = structuredSelection.toArray();
      final Object[] _converted_objectsSelected = (Object[])objectsSelected;
      final Function1<Object, List<EClassifier>> _function = (Object object) -> {
        if ((object instanceof EPackage)) {
          return ((EPackage) object).getEClassifiers();
        } else {
          if ((object instanceof EPackage.Descriptor)) {
            final EPackage.Descriptor descriptor = ((EPackage.Descriptor) object);
            EPackage _ePackage = descriptor.getEPackage();
            return _ePackage.getEClassifiers();
          }
        }
        return CollectionLiterals.<EClassifier>newArrayList();
      };
      List<List<EClassifier>> _map = ListExtensions.<Object, List<EClassifier>>map(((List<Object>)Conversions.doWrapArray(_converted_objectsSelected)), _function);
      Iterable<EClassifier> _flatten = Iterables.<EClassifier>concat(_map);
      Iterable<EClass> eClassifiers = Iterables.<EClass>filter(_flatten, EClass.class);
      return eClassifiers;
    }
    return CollectionLiterals.<EClass>newArrayList();
  }
  
  private Label createEClassGroup(final Composite parent) {
    Label _xblockexpression = null;
    {
      final Label label = new Label(parent, SWT.NULL);
      label.setText("Domain Class:");
      ComboViewer _comboViewer = new ComboViewer(parent);
      this.eClassComboViewer = _comboViewer;
      ArrayContentProvider _arrayContentProvider = new ArrayContentProvider();
      this.eClassComboViewer.setContentProvider(_arrayContentProvider);
      this.eClassComboViewer.setLabelProvider(new LabelProvider() {
        @Override
        public String getText(final Object element) {
          if ((element instanceof EClass)) {
            final EClass eClass = ((EClass) element);
            EPackage _ePackage = eClass.getEPackage();
            String _name = _ePackage.getName();
            String _plus = (_name + "::");
            String _name_1 = eClass.getName();
            return (_plus + _name_1);
          }
          return "";
        }
      });
      final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
      gridData.heightHint = 100;
      gridData.minimumHeight = 100;
      gridData.horizontalSpan = 2;
      Combo _combo = this.eClassComboViewer.getCombo();
      _combo.setLayoutData(gridData);
      this.updateEClass();
      _xblockexpression = new Label(parent, SWT.NULL);
    }
    return _xblockexpression;
  }
  
  private void createSeparator(final Composite parent) {
    final Label label = new Label(parent, (SWT.SEPARATOR | SWT.HORIZONTAL));
    final GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    final int eight = 8;
    gd.minimumHeight = eight;
    gd.heightHint = eight;
    gd.horizontalSpan = 4;
    label.setLayoutData(gd);
  }
  
  public IFile getFile() {
    final String sourceFolderFullPath = this.sourceFolderText.getText();
    IWorkspace _workspace = ResourcesPlugin.getWorkspace();
    IWorkspaceRoot _root = _workspace.getRoot();
    Path _path = new Path(sourceFolderFullPath);
    IFolder folder = _root.getFolder(_path);
    boolean _exists = folder.exists();
    if (_exists) {
      final IJavaElement javaElement = JavaCore.create(folder);
      if ((javaElement instanceof IPackageFragmentRoot)) {
        final IPackageFragmentRoot packageFragmentRoot = ((IPackageFragmentRoot) javaElement);
        String _text = this.packageText.getText();
        IPackageFragment packageFragment = packageFragmentRoot.getPackageFragment(_text);
        IResource resource = packageFragment.getResource();
        if ((resource instanceof IContainer)) {
          final IContainer container = ((IContainer) resource);
          String _text_1 = this.diagramNameText.getText();
          String _plus = (_text_1 + ".sirius");
          Path _path_1 = new Path(_plus);
          final IFile file = container.getFile(_path_1);
          return file;
        }
      }
    }
    return null;
  }
  
  private List<String> getEPackagesSelected() {
    final ArrayList<String> ePackages = CollectionLiterals.<String>newArrayList();
    final ISelection selection = this.ePackagesTableViewer.getSelection();
    if ((selection instanceof IStructuredSelection)) {
      final IStructuredSelection structuredSelection = ((IStructuredSelection) selection);
      Object[] objectsSelected = structuredSelection.toArray();
      final Object[] _converted_objectsSelected = (Object[])objectsSelected;
      final Function1<Object, String> _function = (Object object) -> {
        if ((object instanceof EPackage)) {
          URI _uRI = EcoreUtil.getURI(((EPackage) object));
          return _uRI.toString();
        } else {
          if ((object instanceof EPackage.Descriptor)) {
            final EPackage.Descriptor descriptor = ((EPackage.Descriptor) object);
            EPackage _ePackage = descriptor.getEPackage();
            URI _uRI_1 = EcoreUtil.getURI(_ePackage);
            return _uRI_1.toString();
          }
        }
        return "";
      };
      List<String> _map = ListExtensions.<Object, String>map(((List<Object>)Conversions.doWrapArray(_converted_objectsSelected)), _function);
      ePackages.addAll(_map);
    }
    return ePackages;
  }
  
  private String getEClassSelected() {
    final ISelection selection = this.eClassComboViewer.getSelection();
    if ((selection instanceof IStructuredSelection)) {
      final Object element = ((IStructuredSelection)selection).getFirstElement();
      if ((element instanceof EClass)) {
        final EClass eClass = ((EClass) element);
        EPackage _ePackage = eClass.getEPackage();
        String _name = _ePackage.getName();
        String _plus = (_name + ".");
        String _name_1 = eClass.getName();
        return (_plus + _name_1);
      }
    }
    return "";
  }
  
  public String getContent() {
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
    String _text = this.packageText.getText();
    _builder.append(_text, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* A Sirius Text diagram");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("@Initialized");
    _builder.newLine();
    _builder.append("@EnablePopupBars");
    _builder.newLine();
    _builder.append("@MetamodelUris({");
    _builder.newLine();
    {
      List<String> _ePackagesSelected = this.getEPackagesSelected();
      boolean _hasElements = false;
      for(final String ePackage : _ePackagesSelected) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\t");
        _builder.append("\'");
        _builder.append(ePackage, "\t");
        _builder.append("\'");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("})");
    _builder.newLine();
    _builder.append("diagram ");
    String _text_1 = this.diagramNameText.getText();
    _builder.append(_text_1, "");
    _builder.append(" for \'");
    String _eClassSelected = this.getEClassSelected();
    _builder.append(_eClassSelected, "");
    _builder.append("\'{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("titleExpression = \"aql:\'New Diagram\'\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String content = _builder.toString();
    return content;
  }
}
