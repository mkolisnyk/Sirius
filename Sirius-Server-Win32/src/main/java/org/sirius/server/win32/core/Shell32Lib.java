/**
 * 
 */
package org.sirius.server.win32.core;

import javax.jws.WebService;

import com.sun.jna.platform.win32.Shell32;
import com.sun.jna.platform.win32.ShellAPI.SHFILEOPSTRUCT;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.INT_PTR;
import com.sun.jna.platform.win32.WinNT.HANDLE;
import com.sun.jna.platform.win32.WinNT.HRESULT;
import com.sun.jna.ptr.PointerByReference;

/**
 * @author Myk Kolisnyk
 *
 */
@WebService
public class Shell32Lib {

	protected Shell32 shell32;
	
	/**
	 * 
	 */
	public Shell32Lib() {
		shell32 = Shell32.INSTANCE;
	}

	/* (non-Javadoc)
	 * @see org.sirius.server.win32.core.Shell32Int#SHFileOperation(com.sun.jna.platform.win32.ShellAPI.SHFILEOPSTRUCT)
	 */
	public int SHFileOperation(SHFILEOPSTRUCT fileop) {
		
		return shell32.SHFileOperation(fileop);
	}

	/* (non-Javadoc)
	 * @see org.sirius.server.win32.core.Shell32Int#SHGetFolderPath(com.sun.jna.platform.win32.WinDef.HWND, int, com.sun.jna.platform.win32.WinNT.HANDLE, com.sun.jna.platform.win32.WinDef.DWORD, char[])
	 */
	public HRESULT SHGetFolderPath(HWND hwndOwner, int nFolder, HANDLE hToken,
			DWORD dwFlags, char[] pszPath) {
		
		return shell32.SHGetFolderPath(hwndOwner, nFolder, hToken, dwFlags, pszPath);
	}

	/* (non-Javadoc)
	 * @see org.sirius.server.win32.core.Shell32Int#SHGetDesktopFolder(com.sun.jna.ptr.PointerByReference)
	 */
	public HRESULT SHGetDesktopFolder(PointerByReference ppshf) {
		
		return shell32.SHGetDesktopFolder(ppshf);
	}

	/* (non-Javadoc)
	 * @see org.sirius.server.win32.core.Shell32Int#ShellExecute(com.sun.jna.platform.win32.WinDef.HWND, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)
	 */
	public INT_PTR ShellExecute(HWND hwnd, String lpOperation, String lpFile,
			String lpParameters, String lpDirectory, int nShowCmd) {
		
		return shell32.ShellExecute(hwnd, lpOperation, lpFile, lpParameters, lpDirectory,
				nShowCmd);
	}

}
