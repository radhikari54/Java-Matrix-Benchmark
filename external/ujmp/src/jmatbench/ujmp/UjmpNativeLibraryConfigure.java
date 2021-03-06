/*
 * Copyright (c) 2009-2011, Peter Abeles. All Rights Reserved.
 *
 * This file is part of JMatrixBenchmark.
 *
 * JMatrixBenchmark is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 *
 * JMatrixBenchmark is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JMatrixBenchmark.  If not, see <http://www.gnu.org/licenses/>.
 */

package jmatbench.ujmp;

import jmbench.libraries.LibraryConfigure;
import org.ujmp.core.util.UJMPSettings;

/**
 * Allows native code to be turned on and off at runtime
 *
 * @author Peter Abeles
 */
public class UjmpNativeLibraryConfigure implements LibraryConfigure {


    @Override
    public void runtimeConfigure() {
        UJMPSettings.setUseJBlas(true);
    }

    @Override
    public String[] getJreFlags() {
        return new String[0];
    }
}
