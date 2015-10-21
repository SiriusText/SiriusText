package org.obeonetwork.sirius.text.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.resource.ResourceSet

interface IMultipleResourcesGenerator extends IGenerator {
	def void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa)
}