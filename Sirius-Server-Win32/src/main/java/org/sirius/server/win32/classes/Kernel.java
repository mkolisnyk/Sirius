/**
 * 
 */
package org.sirius.server.win32.classes;

import org.sirius.server.win32.constants.IMEMConsts;

import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinDef.DWORD;

/**
 * @author Myk Kolisnyk
 * .
 */
public class Kernel extends Common implements IMEMConsts {

    /**
	 * .
	 */
    public Kernel() {
        // TODO Auto-generated constructor stub
    }

    /**
     * .
     * @param struct .
     */
    public void VirtualAllocateMemory(final Structure struct) {
        getKernel32().VirtualAllocEx(getKernel32().GetCurrentProcess(),
                struct.getPointer(), struct.size(), new DWORD(MEM_COMMIT),
                new DWORD(MEM_LARGE_PAGES));
    }

    /**
     * .
     * @param struct .
     */
    public void VirtualFreeMemory(final Structure struct) {
        getKernel32().VirtualFreeEx(getKernel32().GetCurrentProcess(),
                struct.getPointer(), struct.size(), new DWORD(MEM_DECOMMIT));
    }
}
