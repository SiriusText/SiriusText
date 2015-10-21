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
package org.obeonetwork.sirius.text;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SiriusTextDslStandaloneSetup extends SiriusTextDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SiriusTextDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
