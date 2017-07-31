/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
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

// $Id: MWholePartLink.java 1048 2009-07-05 12:10:11Z lars $

package org.tzi.use.uml.sys;

/**
 * A link is an instance of an association.
 *
 * @version     $ProjectVersion: 2-3-1-release.3 $
 * @author      Duc-Hanh
 * @param 		N The type of the connected Nodes
 */ 
import org.tzi.use.graph.DirectedEdge;

public interface MWholePartLink extends MLink, DirectedEdge<MObject> {    
}
