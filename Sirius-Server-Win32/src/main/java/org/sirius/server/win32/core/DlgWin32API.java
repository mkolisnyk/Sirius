/**
 * 
 */
package org.sirius.server.win32.core;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;

/**
 * @author Myk Kolisnyk
 *
 */
public interface DlgWin32API  extends StdCallLibrary {

	public DlgWin32API INSTANCE = (DlgWin32API) Native.loadLibrary("user32.dll",
			DlgWin32API.class, W32APIOptions.DEFAULT_OPTIONS);
	
	public long GetDialogBaseUnits();
	public int GetDlgCtrlID(HWND hWnd);
	public HWND GetDlgItem(HWND hWnd,int itemId);
	public int GetDlgItemInt(HWND hWnd,int itemId,boolean pbool,boolean flag2);
	public int GetDlgItemTextA(HWND hWnd,int itemId,char[] text,int size);
	
	public int IsDlgButtonChecked(HWND hwnd,int itemId);
	
	public boolean SetDlgItemInt(HWND hwnd,int itenId,int intValue,boolean flag);
	public boolean SetDlgItemTextA(HWND hwnd,int itemId,char[] text);

}
