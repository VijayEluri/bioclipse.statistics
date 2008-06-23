/*******************************************************************************
 * Copyright (c) 2006 Bioclipse Project
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Egon Willighagen - core API and implementation
 *******************************************************************************/
package net.bioclipse.statistics.model;
 
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IActionFilter;

/**
 * An interface for matrix implementations. Rows and Columns start with index 1.
 *
 * @author egonw
 */
public interface IMatrixImplementationResource extends IAdaptable, IActionFilter {
	
	public IMatrixImplementationResource getInstance(int rows, int cols);
	
	public int getRowCount() throws Exception;
	public int getColumnCount() throws Exception;
	
	/** Gets a value in the matrix. Indices start at 1. */
	public double get(int row, int col) throws Exception;
	/** Sets a value in the matrix. Indices start at 1. */
	public void set(int row, int col, double value) throws Exception;
	
	public boolean hasColHeader();
	public boolean hasRowHeader();
	/** Sets a column label. Index starts at 1. */
	public void setRowName( int index, String name );
	public String getRowName( int index );
	/** Sets a row label. Index starts at 1. */
	public void setColumnName( int index, String name );
	public String getColumnName( int index );

}
