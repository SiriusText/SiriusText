package org.obeonetwork.sirius.text.ui.contentassist;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension5;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension6;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

public class SiriusTextCompletionProposal implements ICompletionProposal, ICompletionProposalExtension5, ICompletionProposalExtension6 {
	
	private int offset;
	private int length;
	private int cursorPosition;
	private StyledString displayString;
	private StyledString informationString;
	private String replacementString;
	private Image image;
	
	public SiriusTextCompletionProposal(int offset, int length, int cursorPosition, StyledString displayString, StyledString informationString, String replacementString, Image image) {
		this.offset = offset;
		this.length = length;
		this.cursorPosition = cursorPosition;
		this.displayString = displayString;
		this.informationString = informationString;
		this.replacementString = replacementString;
		this.image = image;
	}
	
	@Override
	public void apply(IDocument document) {
		try {
			document.replace(this.offset, this.length, this.replacementString);
		} catch (BadLocationException e) {
			// do nothing
		}
	}

	@Override
	public Point getSelection(IDocument document) {
		return new Point(this.offset + this.cursorPosition, 0);
	}

	@Override
	public String getAdditionalProposalInfo() {
		return this.getAdditionalProposalInfo(new NullProgressMonitor()).toString();
	}
	
	@Override
	public Object getAdditionalProposalInfo(IProgressMonitor monitor) {
		return this.informationString;
	}

	@Override
	public String getDisplayString() {
		return this.getStyledDisplayString().getString();
	}
	
	@Override
	public StyledString getStyledDisplayString() {
		return this.displayString;
	}

	@Override
	public Image getImage() {
		return image;
	}

	@Override
	public IContextInformation getContextInformation() {
		return null;
	}

}
