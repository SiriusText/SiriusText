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
package org.obeonetwork.sirius.text.ui.contentassist;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Calendar;
import java.util.Iterator;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.obeonetwork.sirius.text.ui.contentassist.AbstractSiriusTextDslProposalProvider;
import org.obeonetwork.sirius.text.ui.contentassist.SiriusTextCompletionProposal;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class SiriusTextDslProposalProvider extends AbstractSiriusTextDslProposalProvider {
  @Inject
  private IStorage2UriMapper storage2UriMapper;
  
  @Override
  public void complete_SiriusFile(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final String packageName = this.getPackageName(model);
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(packageName, null));
    if (!_notEquals) {
      _and = false;
    } else {
      int _length = packageName.length();
      boolean _greaterThan = (_length > 0);
      _and = _greaterThan;
    }
    if (_and) {
      final StyledString displayString = new StyledString();
      displayString.append(packageName);
      final StyledString informationString = new StyledString();
      informationString.append("The name of the package");
      final String replacementString = packageName;
      int _offset = context.getOffset();
      int _offset_1 = context.getOffset();
      int _length_1 = replacementString.length();
      int _plus = (_offset_1 + _length_1);
      final SiriusTextCompletionProposal proposal = new SiriusTextCompletionProposal(_offset, 0, _plus, displayString, informationString, replacementString, null);
      acceptor.accept(proposal);
    }
    super.complete_SiriusFile(model, ruleCall, context, acceptor);
  }
  
  @Override
  public void completeSiriusFile_Documentation(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final StyledString displayString = new StyledString();
    displayString.append("copyright");
    final StyledString informationString = new StyledString();
    informationString.append("The copyright header of the file");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* All right reserved ");
    Calendar _instance = Calendar.getInstance();
    int _get = _instance.get(Calendar.YEAR);
    _builder.append(_get, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    final String replacementString = _builder.toString();
    int _offset = context.getOffset();
    int _offset_1 = context.getOffset();
    int _length = replacementString.length();
    int _plus = (_offset_1 + _length);
    final SiriusTextCompletionProposal proposal = new SiriusTextCompletionProposal(_offset, 0, _plus, displayString, informationString, replacementString, null);
    acceptor.accept(proposal);
  }
  
  @Override
  public void completeSiriusFile_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final String packageName = this.getPackageName(model);
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(packageName, null));
    if (!_notEquals) {
      _and = false;
    } else {
      int _length = packageName.length();
      boolean _greaterThan = (_length > 0);
      _and = _greaterThan;
    }
    if (_and) {
      final StyledString displayString = new StyledString();
      displayString.append(packageName);
      final StyledString informationString = new StyledString();
      informationString.append("The name of the package");
      final String replacementString = packageName;
      int _offset = context.getOffset();
      int _offset_1 = context.getOffset();
      int _length_1 = replacementString.length();
      int _plus = (_offset_1 + _length_1);
      final SiriusTextCompletionProposal proposal = new SiriusTextCompletionProposal(_offset, 0, _plus, displayString, informationString, replacementString, null);
      acceptor.accept(proposal);
    }
    super.completeSiriusFile_Name(model, assignment, context, acceptor);
  }
  
  private String getPackageName(final EObject eObject) {
    boolean _notEquals = (!Objects.equal(eObject, null));
    if (_notEquals) {
      final Resource resource = eObject.eResource();
      if ((resource instanceof XtextResource)) {
        final XtextResource xTextResource = ((XtextResource) resource);
        URI _uRI = xTextResource.getURI();
        final Iterable<Pair<IStorage, IProject>> storages = this.storage2UriMapper.getStorages(_uRI);
        final Iterator<Pair<IStorage, IProject>> iterator = storages.iterator();
        while (iterator.hasNext()) {
          {
            final Pair<IStorage, IProject> storage2project = iterator.next();
            final IStorage storage = storage2project.getFirst();
            final IProject project = storage2project.getSecond();
            return this.getPackageName(project, storage);
          }
        }
      }
    }
    return null;
  }
  
  private String getPackageName(final IProject project, final IStorage storage) {
    try {
      boolean _and = false;
      boolean _and_1 = false;
      boolean _hasNature = project.hasNature(JavaCore.NATURE_ID);
      if (!_hasNature) {
        _and_1 = false;
      } else {
        _and_1 = (storage instanceof IFile);
      }
      if (!_and_1) {
        _and = false;
      } else {
        IContainer _parent = ((IFile) storage).getParent();
        boolean _notEquals = (!Objects.equal(_parent, null));
        _and = _notEquals;
      }
      if (_and) {
        final IContainer parent = ((IFile) storage).getParent();
        final IJavaElement javaParent = JavaCore.create(parent);
        if ((javaParent instanceof IPackageFragment)) {
          final IPackageFragment packageFragment = ((IPackageFragment) javaParent);
          final String packageName = packageFragment.getElementName();
          return packageName;
        }
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
