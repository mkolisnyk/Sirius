/**
 * 
 */
package org.sirius.server.win32.core;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.win32.W32APIOptions;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface Kernel32Ext extends Kernel32 {

	public Kernel32Ext INSTANCE = (Kernel32Ext) Native.loadLibrary(
			"kernel32.dll", Kernel32Ext.class, W32APIOptions.DEFAULT_OPTIONS);

	Pointer VirtualAllocEx(HANDLE hProcess, Pointer lpAddress, int dwSize,
			DWORD flAllocationType, DWORD flProtect);

	boolean VirtualFreeEx(HANDLE hProcess, Pointer lpAddress, int dwSize,
			DWORD dwFreeType);
}
