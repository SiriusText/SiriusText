/*
 * generated by Xtext
 */
package org.obeonetwork.sirius.text.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractSiriusTextDslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.obeonetwork.sirius.text.siriusTextDsl.SiriusTextDslPackage.eINSTANCE);
		return result;
	}
}
