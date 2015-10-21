package org.obeonetwork.sirius.text.ui.wizards.newdiagram

import java.util.Comparator
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.jdt.core.IPackageFragment
import org.eclipse.jdt.core.IPackageFragmentRoot
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jface.dialogs.Dialog
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ColumnLabelProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.jface.wizard.WizardPage
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Text
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil

class NewSiriusTextDiagramWizardFirstPage extends WizardPage {
	
	IStructuredSelection selection
	
	Text packageText
	
	Text sourceFolderText
	
	Text diagramNameText
	
	Text diagramLabelText
	
	TableViewer ePackagesTableViewer
	
	ComboViewer eClassComboViewer
	
	new(IStructuredSelection selection) {
		super("New Sirius Text Diagram")
		title = "Create a new Sirius Text diagram"
		description = "Enter the name of the Sirius Text diagram to create"
		
		this.selection = selection
	}
	
	override createControl(Composite parent) {
		val composite = new Composite(parent, SWT.NONE) 
		val layout = new GridLayout()
		layout.numColumns = 1
		composite.setLayout(layout)
		val gridData = new GridData(GridData.FILL_HORIZONTAL)
		gridData.verticalAlignment = SWT.TOP
		
		val heightHint = 540
		gridData.heightHint = heightHint;
		gridData.minimumHeight = heightHint
		composite.setLayoutData(gridData)
		
		val pageGroup = new Composite(composite, SWT.NONE)
		val pageLayout = new GridLayout()
		pageLayout.numColumns = 4
		pageGroup.layout = pageLayout
		pageGroup.layoutData = new GridData(GridData.FILL_BOTH)
		
		this.createSourceFolderGroup(pageGroup)
		this.createPackageGroup(pageGroup)
		this.createSeparator(pageGroup)
		this.createDiagramNameGroup(pageGroup)
		this.createDiagramLabelGroup(pageGroup)
		this.createEPackagesGroup(pageGroup)
		this.createEClassGroup(pageGroup)
		
		control = composite
		Dialog.applyDialogFont(getControl())
	}
	
	def private createSourceFolderGroup(Composite parent) {
		val label = new Label(parent, SWT.NULL)
		label.text = "Source Folder:"

		this.sourceFolderText = new Text(parent, SWT.BORDER)
		this.sourceFolderText.text = this.sourceFolder
		val gridData = new GridData(GridData.FILL_HORIZONTAL)
		val int widthHint = 270
		gridData.widthHint = widthHint
		gridData.horizontalSpan = 2
		this.sourceFolderText.layoutData = gridData
		
		val packageBrowseButton = new Button(parent, SWT.PUSH)
		packageBrowseButton.text = "Browse..."
		packageBrowseButton.addSelectionListener(new SelectionAdapter() {
			override widgetSelected(SelectionEvent event) {
				browseSourceFolder()
			}
		})
	}
	
	def private String getSourceFolder() {
		var IContainer container = null
		
		val selectedElement = selection.firstElement
		if (selectedElement instanceof IContainer) {
			container = selectedElement as IContainer
		} else if (selectedElement instanceof IResource) {
			container = (selectedElement as IResource).parent
		} else if (selectedElement instanceof IPackageFragment) {
			val packageFragment = selectedElement as IPackageFragment
			var resource = packageFragment.parent.resource
			if (resource instanceof IContainer) {
				container = resource as IContainer
			} else {
				container = resource.parent
			}
		}
		
		if (container != null) {
			return container.fullPath.toString
		}
		return ""
	}
	
	def private void browseSourceFolder() {
		
	}
	
	def private createPackageGroup(Composite parent) {
		val label = new Label(parent, SWT.NULL)
		label.text = "Package:"

		this.packageText = new Text(parent, SWT.BORDER)
		this.packageText.text = this.packageFolder
		val gridData = new GridData(GridData.FILL_HORIZONTAL)
		val int widthHint = 270
		gridData.widthHint = widthHint
		gridData.horizontalSpan = 2
		this.packageText.layoutData = gridData
		
		val packageBrowseButton = new Button(parent, SWT.PUSH)
		packageBrowseButton.text = "Browse..."
		packageBrowseButton.addSelectionListener(new SelectionAdapter() {
			override widgetSelected(SelectionEvent event) {
				browsePackage()
			}
		})
	}
	
	def private String getPackageFolder() {
		val selectedElement = selection.firstElement
		if (selectedElement instanceof IPackageFragment) {
			val packageFragment = selectedElement as IPackageFragment
			return packageFragment.elementName
		}
		return ""
	}
	
	def private void browsePackage() {
		
	}
	
	def private createDiagramNameGroup(Composite parent) {
		val label = new Label(parent, SWT.NULL)
		label.text = "Diagram Name:"

		this.diagramNameText = new Text(parent, SWT.BORDER)
		this.diagramNameText.text = this.sourceFolder
		val gridData = new GridData(GridData.FILL_HORIZONTAL)
		val int widthHint = 270
		gridData.widthHint = widthHint
		gridData.horizontalSpan = 2
		this.diagramNameText.layoutData = gridData
		
		this.diagramNameText.text = "NewDiagram"
		
		new Label(parent, SWT.NULL)
	}
	
	def private createDiagramLabelGroup(Composite parent) {
		val label = new Label(parent, SWT.NULL)
		label.text = "Diagram Label:"

		this.diagramLabelText = new Text(parent, SWT.BORDER)
		this.diagramLabelText.text = this.sourceFolder
		val gridData = new GridData(GridData.FILL_HORIZONTAL)
		val int widthHint = 270
		gridData.widthHint = widthHint
		gridData.horizontalSpan = 2
		this.diagramLabelText.layoutData = gridData
		
		this.diagramLabelText.text = "New Diagram"
		
		new Label(parent, SWT.NULL)
	}
	
	def private createEPackagesGroup(Composite parent) {
		val label = new Label(parent, SWT.NULL)
		label.text = "EPackages:"
		
		val labelGridData = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		labelGridData.horizontalSpan = 1;
		label.layoutData = labelGridData
		
		this.ePackagesTableViewer = new TableViewer(parent, SWT.MULTI.bitwiseOr(SWT.H_SCROLL).bitwiseOr(SWT.V_SCROLL)
			.bitwiseOr(SWT.FULL_SELECTION).bitwiseOr(SWT.BORDER))
		this.ePackagesTableViewer.setContentProvider(ArrayContentProvider.getInstance())
		
		val table = ePackagesTableViewer.table
		table.headerVisible = true
		table.linesVisible = true
		
		val gridData = new GridData(GridData.FILL_HORIZONTAL)
		gridData.heightHint = 100;
		gridData.minimumHeight = 100;
		gridData.horizontalSpan = 2
		table.layoutData = gridData
				
		val nameColumn = new TableViewerColumn(this.ePackagesTableViewer, SWT.NONE)
		nameColumn.getColumn().setWidth(120);
		nameColumn.getColumn().setText("Name")
		nameColumn.setLabelProvider(new ColumnLabelProvider() {
			override String getText(Object element) {
				return getName(element)
			}
		})
		
		val nsUriColumn = new TableViewerColumn(this.ePackagesTableViewer, SWT.NONE)
		nsUriColumn.getColumn().setWidth(250);
		nsUriColumn.getColumn().setText("NsURI")
		nsUriColumn.setLabelProvider(new ColumnLabelProvider() {
			override String getText(Object element) {
				return getNsUri(element)
			}
		})

		val ePackages = newArrayList()
		ePackages.addAll(EPackage.Registry.INSTANCE.values)
		ePackages.sort(new Comparator<Object>() {
			override compare(Object o1, Object o2) {
				return getName(o1).compareTo(getName(o2))
			}
		})
		this.ePackagesTableViewer.setInput(ePackages)
		
		this.ePackagesTableViewer.addSelectionChangedListener([event | updateEClass()])
		
		this.ePackagesTableViewer.setSelection(new StructuredSelection(EcorePackage.eINSTANCE), true)
		
		new Label(parent, SWT.NULL)
	}
	
	def private String getName(Object element) {
		if (element instanceof EPackage) {
			val ePackage = element as EPackage
			return ePackage.name
		} else if (element instanceof EPackage.Descriptor) {
			val descriptor = element as EPackage.Descriptor
			return descriptor.getEPackage().name
		}
		return ""
	}
	
	def private String getNsUri(Object element) {
		if (element instanceof EPackage) {
			val ePackage = element as EPackage
			return ePackage.nsURI
		} else if (element instanceof EPackage.Descriptor) {
			val descriptor = element as EPackage.Descriptor
			return descriptor.getEPackage().nsURI
		}
		return ""
	}
	
	def private void updateEClass() {
		val eClasses = newArrayList()
		eClasses.addAll(this.classesFromTableViewer)
		if (this.eClassComboViewer != null && eClasses.iterator.hasNext) {
			this.eClassComboViewer.input = eClasses
			this.eClassComboViewer.selection = new StructuredSelection(eClasses.iterator.next)
		}
	}
	
	def private Iterable<EClass> getClassesFromTableViewer() {
		val selection = this.ePackagesTableViewer.selection
		if (selection instanceof IStructuredSelection) {
			val structuredSelection = selection as IStructuredSelection
			var objectsSelected = structuredSelection.toArray
			var eClassifiers = objectsSelected.map[object |
				if (object instanceof EPackage) {
					return (object as EPackage).getEClassifiers()
				} else if (object instanceof EPackage.Descriptor) {
					val descriptor = object as EPackage.Descriptor
					return descriptor.getEPackage().getEClassifiers()
				}
				return newArrayList()
			].flatten.filter(EClass)
			return eClassifiers
		}
		return newArrayList()
	}
	
	def private createEClassGroup(Composite parent) {
		val label = new Label(parent, SWT.NULL)
		label.text = "Domain Class:"
		
		this.eClassComboViewer = new ComboViewer(parent)
		this.eClassComboViewer.contentProvider = new ArrayContentProvider()
		this.eClassComboViewer.labelProvider = new LabelProvider() {
			override getText(Object element) {
				if (element instanceof EClass) {
					val eClass = element as EClass
					return eClass.getEPackage().name + "::" + eClass.name
				}
				return ""
			}
		}
		
		val gridData = new GridData(GridData.FILL_HORIZONTAL)
		gridData.heightHint = 100;
		gridData.minimumHeight = 100;
		gridData.horizontalSpan = 2
		this.eClassComboViewer.combo.layoutData = gridData
		
		this.updateEClass
		
		new Label(parent, SWT.NULL)
	}
	
	def private void createSeparator(Composite parent) {
		val label = new Label(parent, SWT.SEPARATOR.bitwiseOr(SWT.HORIZONTAL))
		val gd = new GridData(GridData.FILL_HORIZONTAL)
		val eight = 8
		gd.minimumHeight = eight
		gd.heightHint = eight
		gd.horizontalSpan = 4
		label.layoutData = gd
	}
	
	def public IFile getFile() {
		val sourceFolderFullPath = this.sourceFolderText.text
		var folder = ResourcesPlugin.workspace.root.getFolder(new Path(sourceFolderFullPath))
		if (folder.exists) {
			val javaElement = JavaCore.create(folder);
			if (javaElement instanceof IPackageFragmentRoot) {
				val packageFragmentRoot = javaElement as IPackageFragmentRoot
				var packageFragment = packageFragmentRoot.getPackageFragment(this.packageText.text)
				var resource = packageFragment.resource
				if (resource instanceof IContainer) {
					val container = resource as IContainer
					val file = container.getFile(new Path(this.diagramNameText.text + ".sirius"))
					return file
				}
			}
		}
		return null
	}
	
	def private List<String> getEPackagesSelected() {
		val ePackages = newArrayList()
		
		val selection = this.ePackagesTableViewer.selection
		if (selection instanceof IStructuredSelection) {
			val structuredSelection = selection as IStructuredSelection
			var objectsSelected = structuredSelection.toArray
			ePackages.addAll(objectsSelected.map[object |
				if (object instanceof EPackage) {
					return EcoreUtil.getURI((object as EPackage)).toString
				} else if (object instanceof EPackage.Descriptor) {
					val descriptor = object as EPackage.Descriptor
					return EcoreUtil.getURI(descriptor.getEPackage()).toString
				}
				return ""
			])
		}
		
		return ePackages
	}
	
	def private String getEClassSelected() {
		val selection = this.eClassComboViewer.selection
		if (selection instanceof IStructuredSelection) {
			val element = selection.firstElement
			if (element instanceof EClass) {
				val eClass = element as EClass
				return eClass.getEPackage.name + '.' + eClass.name
			}
		}
		return ""
	}
	
	def public String getContent() {
		val content = '''
			/**
			 * Created by Sirius Text
			 */
			package «this.packageText.text»
			
			/**
			 * A Sirius Text diagram
			 */
			@Initialized
			@EnablePopupBars
			@MetamodelUris({
				«FOR ePackage : this.getEPackagesSelected SEPARATOR ','»
				'«ePackage»'
				«ENDFOR»
			})
			diagram «this.diagramNameText.text» for '«this.getEClassSelected»'{
				titleExpression = "aql:'New Diagram'"
			}
		'''
		return content
	}
	
}