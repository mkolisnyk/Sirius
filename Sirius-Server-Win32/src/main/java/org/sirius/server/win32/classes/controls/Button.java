/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32.constants.IButtonConsts;

import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.WPARAM;

/**
 * @author Myk Kolisnyk
 *
 */
@WebService
public class Button extends Common implements IButtonConsts {

	/**
	 * 
	 */
	public Button() {
		// TODO Auto-generated constructor stub
	}

	public int GetCheck(long hwndCtl) {
		HWND handle = this.longToHwnd(hwndCtl);
		return user32.SendMessage(handle,BM_GETCHECK,new WPARAM(0),new LPARAM(0));
	}
	
	public int GetState(long hwndCtl){
		HWND handle = this.longToHwnd(hwndCtl);
		return user32.SendMessage(handle,BM_GETSTATE,new WPARAM(0),new LPARAM(0));
	}
	
	public void SetCheck(long hwndCtl,int check) {
		HWND handle = this.longToHwnd(hwndCtl);
		user32.SendMessage(handle,BM_SETCHECK,new WPARAM(check),new LPARAM(0));
	}
	public void SetState(long hwndCtl,int state) {
		HWND handle = this.longToHwnd(hwndCtl);
		user32.SendMessage(handle,BM_SETSTATE,new WPARAM(state),new LPARAM(0));
	}
}
