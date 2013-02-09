/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32.constants.IListBoxConsts;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.WPARAM;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class ListBox extends Common implements IListBoxConsts {

	/**
	 * 
	 */
	public ListBox() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public int FindItemData(hwndCtl,indexStart,data) {
	 * ((int)(DWORD)SNDMSG((hwndCtl
	 * ),LB_FINDSTRING,(WPARAM)(int)(indexStart),(LPARAM)(data))) }
	 */
	public int FindString(long hwndCtl, int indexStart, String lpszFind) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(indexStart);
		Pointer pt = new Pointer(0);
		pt.setString(0, lpszFind);
		LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));

		return user32.SendMessage(hWnd, LB_FINDSTRING, wParam, lParam);
	}

	public int FindStringExact(long hwndCtl, int indexStart, String lpszFind) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(indexStart);
		Pointer pt = new Pointer(0);
		pt.setString(0, lpszFind);
		LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));

		return user32.SendMessage(hWnd, LB_FINDSTRINGEXACT, wParam, lParam);
	}

	public int GetCaretIndex(long hwndCtl) {
		return this.SendMessage(hwndCtl, LB_GETCARETINDEX, 0, 0);
	}

	public int GetCount(long hwndCtl) {
		return this.SendMessage(hwndCtl, LB_GETCOUNT, 0, 0);
	}

	public int GetCurSel(long hwndCtl) {
		return this.SendMessage(hwndCtl, LB_GETCURSEL, 0, 0);
	}

	public int GetHorizontalExtent(long hwndCtl) {
		return this.SendMessage(hwndCtl, LB_GETHORIZONTALEXTENT, 0, 0);
	}

	/*
	 * public int GetItemData(hwndCtl,index) {
	 * ((LRESULT)(DWORD)SNDMSG((hwndCtl),LB_GETITEMDATA,(WPARAM)(int)(index),0))
	 * }
	 */
	public int GetItemHeight(long hwndCtl, int index) {
		return this.SendMessage(hwndCtl, LB_GETITEMHEIGHT, index, 0);
	}

	/*
	 * public int GetItemRect(hwndCtl,index,lprc) {
	 * ((int)(DWORD)SNDMSG((hwndCtl)
	 * ,LB_GETITEMRECT,(WPARAM)(int)(index),(LPARAM)(RECT*)(lprc))) }
	 */
	public int GetSel(long hwndCtl, int index) {
		return this.SendMessage(hwndCtl, LB_GETSEL, index, 0);
	}

	public int GetSelCount(long hwndCtl) {
		return this.SendMessage(hwndCtl, LB_GETSELCOUNT, 0, 0);
	}

	/*
	 * public int GetSelItems(hwndCtl,cItems,lpItems) {
	 * ((int)(DWORD)SNDMSG((hwndCtl
	 * ),LB_GETSELITEMS,(WPARAM)(int)(cItems),(LPARAM)(int*)(lpItems))) }
	 */
	public String GetText(long hwndCtl, int index) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(index);
		Pointer pt = new Pointer(0);
		String lpszText = "";
		pt.setString(0, lpszText);
		LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
		user32.SendMessage(hWnd, LB_GETTEXT, wParam, lParam);
		return pt.getString(0);
	}

	public int GetTextLen(long hwndCtl, int index) {
		return SendMessage(hwndCtl, LB_GETTEXTLEN, index, 0);
	}

	public int GetTopIndex(long hwndCtl) {
		return SendMessage(hwndCtl, LB_GETTOPINDEX, 0, 0);
	}

	public int SelItemRange(long hwndCtl, boolean fSelect, int first, int last) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM((fSelect) ? (1) : (0));
		LPARAM lParam = this.MAKELPARAM(first, last);
		return user32.SendMessage(hWnd, LB_SELITEMRANGE, wParam, lParam);
	}

	public int SelectString(long hwndCtl, int indexStart, String lpszFind) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(indexStart);
		Pointer pt = new Pointer(0);
		String lpszText = "";
		pt.setString(0, lpszText);
		LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
		return user32.SendMessage(hWnd, LB_SELECTSTRING, wParam, lParam);
	}

	public int SetCaretIndex(long hwndCtl, int index) {
		return SendMessage(hwndCtl, LB_SETCARETINDEX, index, 0);
	}

	public int SetCurSel(long hwndCtl, int index) {
		return SendMessage(hwndCtl, LB_SETCURSEL, index, 0);
	}

	public int SetSel(long hwndCtl, boolean fSelect, int index) {
		return SendMessage(hwndCtl, LB_SETSEL, (fSelect) ? (1) : (0), index);
	}
}
