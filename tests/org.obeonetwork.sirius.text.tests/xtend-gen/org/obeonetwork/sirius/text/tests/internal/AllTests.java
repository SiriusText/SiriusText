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
package org.obeonetwork.sirius.text.tests.internal;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.obeonetwork.sirius.text.tests.internal.parser.DesignerParserTests;
import org.obeonetwork.sirius.text.tests.internal.parser.DiagramParserTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({ DesignerParserTests.class, DiagramParserTests.class })
@SuppressWarnings("all")
public class AllTests {
}
