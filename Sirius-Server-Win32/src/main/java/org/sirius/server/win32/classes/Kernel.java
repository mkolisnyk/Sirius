/**
 * 
 */
package org.sirius.server.win32.classes;

import org.sirius.server.win32.constants.IMEMConsts;
import org.sirius.server.win32.core.types.WinDefExt;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinBase;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinNT.HANDLE;

/**
 * @author Myk Kolisnyk
 * 
 */
public class Kernel extends Common implements IMEMConsts {

	/**
	 * 
	 */
	public Kernel() {
		// TODO Auto-generated constructor stub
	}

	public void VirtualAllocateMemory(Structure struct) {
		kernel32.VirtualAllocEx(kernel32.GetCurrentProcess(),
				struct.getPointer(), struct.size(), new DWORD(MEM_COMMIT),
				new DWORD(MEM_LARGE_PAGES));
	}

	public void VirtualFreeMemory(Structure struct) {
		kernel32.VirtualFreeEx(kernel32.GetCurrentProcess(),
				struct.getPointer(), struct.size(), new DWORD(MEM_DECOMMIT));
	}
}
