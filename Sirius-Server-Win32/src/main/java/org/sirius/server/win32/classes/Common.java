/**
 * 
 */
package org.sirius.server.win32.classes;

import org.sirius.server.win32.core.DlgWin32API;
import org.sirius.server.win32.core.User32Ext;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Shell32;
import com.sun.jna.platform.win32.WinDef.HMENU;
import com.sun.jna.platform.win32.WinDef.HWND;

/**
 * @author Myk Kolisnyk
 *
 */
public class Common {

	protected Shell32 shell32 = Shell32.INSTANCE;
	protected User32Ext user32 = User32Ext.INSTANCE;
	protected DlgWin32API dlg32 = DlgWin32API.INSTANCE; 
	
	/**
	 * 
	 */
	public Common() {
		// TODO Auto-generated constructor stub
	}
	
	protected HMENU longToHmenu(long input){
		HMENU handle = new HMENU();
		handle.setPointer(Pointer.createConstant(input));
		return handle;
	}
	
	protected HWND longToHwnd(long input){
		HWND handle = new HWND();
		handle.setPointer(Pointer.createConstant(input));
		return handle;
	}

}
