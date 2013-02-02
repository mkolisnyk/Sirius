/**
 * 
 */
package org.sirius.server.win32.classes;

import javax.jws.WebService;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class Dialog extends Common {

	/**
	 * 
	 */
	public Dialog() {
		// TODO Auto-generated constructor stub
	}

	public long getDialogBaseUnits() {
		return this.dlg32.GetDialogBaseUnits();
	}

	public int getDlgCtrlID(long hWnd) {
		HWND handle = this.longToHwnd(hWnd);
		return this.dlg32.GetDlgCtrlID(handle);
	}

	public long getDlgItem(long hWnd, int itemId) {
		HWND handle = this.longToHwnd(hWnd);
		return Pointer.nativeValue(this.dlg32.GetDlgItem(handle, itemId).getPointer());
	}

	public int getDlgItemInt(long hWnd, int itemId, boolean pbool, boolean flag2) {
		HWND handle = this.longToHwnd(hWnd);
		return this.dlg32.GetDlgItemInt(handle, itemId, pbool, flag2);
	}

	public String getDlgItemTextA(long hWnd, int itemId) {
		HWND handle = this.longToHwnd(hWnd);
		
		int length = 255;
        char buf[] = new char[length];
        
        dlg32.GetDlgItemTextA(handle, itemId, buf, length);
    	String text = String.valueOf( buf ).trim();
    	return text;
	}

	public int isDlgButtonChecked(long hWnd, int itemId) {
		HWND handle = this.longToHwnd(hWnd);
		return dlg32.IsDlgButtonChecked(handle, itemId);
	}

	public boolean setDlgItemInt(long hWnd, int itenId, int intValue,
			boolean flag) {
		HWND handle = this.longToHwnd(hWnd);
		return dlg32.SetDlgItemInt(handle, itenId, intValue, flag);
	}

	public boolean setDlgItemText(long hWnd, int itemId, String text) {
		HWND handle = this.longToHwnd(hWnd);
		return dlg32.SetDlgItemTextA(handle, itemId, text.toCharArray());
	}

}
