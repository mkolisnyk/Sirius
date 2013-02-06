/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32.constants.IComboBoxConsts;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.WPARAM;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class ComboBox extends Common implements IComboBoxConsts {

	/**
	 * 
	 */
	public ComboBox() {
		// TODO Auto-generated constructor stub
	}

	public int FindItemData(long hwndCtl, int indexStart, LPARAM data) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM((long) indexStart);
		return user32.SendMessage(hWnd, CB_FINDSTRING, wParam, data);
	}

	public int FindString(long hwndCtl, int indexStart, String lpszFind) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM((long) indexStart);
		Pointer pt = new Pointer(0);
		pt.setString(0, lpszFind);
		LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
		return user32.SendMessage(hWnd, CB_FINDSTRING, wParam, lParam);
	}

	public int FindStringExact(long hwndCtl, int indexStart, String lpszFind) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM((long) indexStart);
		Pointer pt = new Pointer(0);
		pt.setString(0, lpszFind);
		LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
		return user32.SendMessage(hWnd, CB_FINDSTRINGEXACT, wParam, lParam);
	}

	public int GetCount(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, CB_GETCOUNT, wParam, lParam);
	}

	public int GetCurSel(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, CB_GETCURSEL, wParam, lParam);
	}

	/*
	 * public int GetDroppedControlRect(long hwndCtl,RECT lprc){
	 * ((void)SNDMSG((hwndCtl
	 * ),CB_GETDROPPEDCONTROLRECT,0,(LPARAM)(RECT*)(lprc))) }
	 */
	public int GetDroppedState(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, CB_GETDROPPEDSTATE, wParam, lParam);
	}

	public int GetEditSel(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, CB_GETEDITSEL, wParam, lParam);
	}

	public int GetExtendedUI(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, CB_GETEXTENDEDUI, wParam, lParam);
	}

	public int GetItemData(long hwndCtl, int index) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(index);
		LPARAM lParam = new LPARAM(0);
		user32.SendMessage(hWnd, CB_GETITEMDATA, wParam, lParam);
		return 0;
	}

	public int GetItemHeight(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, CB_GETITEMHEIGHT, wParam, lParam);
	}

	public int GetLBText(long hwndCtl, int index, String lpszBuffer) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM((long) index);
		Pointer pt = new Pointer(0);
		pt.setString(0, lpszBuffer);
		LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
		return user32.SendMessage(hWnd, CB_GETLBTEXT, wParam, lParam);
	}

	public int GetLBTextLen(long hwndCtl, int index) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(index);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, CB_GETLBTEXTLEN, wParam, lParam);
	}

	public String GetText(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		int length = GetTextLength(hwndCtl);
		char[] buf = new char[length];
		user32.GetWindowText(hWnd, buf, length);
		return String.valueOf(buf);
	}

	public int GetTextLength(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		return user32.GetWindowTextLength(hWnd);
	}

	public int ResetContent(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, CB_RESETCONTENT, wParam, lParam);
	}

	/*
	 * public int SelectItemData(long hwndCtl,int indexStart,LPARAM data) {
	 * ((int
	 * )(DWORD)SNDMSG((hwndCtl),CB_SELECTSTRING,(WPARAM)(int)(indexStart),(LPARAM
	 * )(data))) }
	 */
	public int SelectString(long hwndCtl, int indexStart, String lpszSelect) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM((long) indexStart);
		Pointer pt = new Pointer(0);
		pt.setString(0, lpszSelect);
		LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));

		return user32.SendMessage(hWnd, CB_SELECTSTRING, wParam, lParam);
	}

	public int SetCurSel(long hwndCtl, int index) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM((long) index);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, CB_SETCURSEL, wParam, lParam);
	}

	public int SetEditSel(long hwndCtl, int ichStart, int ichEnd) {
		HWND hWnd = longToHwnd(hwndCtl);
		return user32.SendMessage(hWnd, CB_SETEDITSEL, new WPARAM(0L),
				MAKELPARAM((ichStart), (ichEnd)));
	}

	/*
	 * public int SetItemData(long hwndCtl,index,data) { HWND hWnd =
	 * longToHwnd(hwndCtl); return user32.SendMessage(hWnd,
	 * ,CB_SETITEMDATA,(WPARAM)(int)(index),(LPARAM)(data))) }
	 */

	public int SetItemHeight(long hwndCtl, int index, int cyItem) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM((long) index);
		LPARAM lParam = new LPARAM(cyItem);
		return user32.SendMessage(hWnd, CB_SETITEMHEIGHT, wParam, lParam);
	}

	public void SetText(long hwndCtl, String lpsz) {
		HWND hWnd = longToHwnd(hwndCtl);
		user32.SetWindowText(hWnd,(lpsz).toCharArray());
	}

	public int ShowDropdown(long hwndCtl, boolean fShow) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM((fShow) ? (1) : (0));
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, CB_SHOWDROPDOWN, wParam, lParam);
	}
}
