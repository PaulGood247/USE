/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

// $Id: NullPrintWriter.java 1734 2010-09-07 14:56:17Z lhamann $

package org.tzi.use.util;

import java.io.PrintWriter;

/**
 * TODO
 * @author Daniel Gent
 *
 */
public class NullPrintWriter extends PrintWriter {
	/** TODO */
	private static NullPrintWriter fInstance = new NullPrintWriter();
	
	
	/**
	 * TODO
	 */
	private NullPrintWriter() {
		super(new NullWriter());
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public static NullPrintWriter getInstance() {
		return fInstance;
	}
}
