/*******************************************************************************
 * Copyright (c) 2010, 2019 VectorGraphics2D project.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Erich Seifert - initial API and implementation
 * Michael Seifert - initial API and implementation
 *******************************************************************************/
package org.eclipse.swtchart.vectorgraphics2d.intermediate.commands;

import java.awt.font.GlyphVector;
public class DrawGlyphVectorCommand extends Command<GlyphVector> {
    public final float x;
    public final float y;
	public DrawGlyphVectorCommand(GlyphVector vector, float x, float y) {
		super(vector);
        this.x=x;this.y=y;
	}
}
