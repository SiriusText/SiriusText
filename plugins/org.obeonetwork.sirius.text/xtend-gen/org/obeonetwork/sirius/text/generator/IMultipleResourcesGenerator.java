package org.obeonetwork.sirius.text.generator;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public interface IMultipleResourcesGenerator extends IGenerator {
  public abstract void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa);
}
