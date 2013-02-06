/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32.constants.IEditConsts;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.WPARAM;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class Edit extends Common implements IEditConsts {

	/**
	 * 
	 */
	public Edit() {
		// TODO Auto-generated constructor stub
	}

	public int CanUndo(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, EM_CANUNDO, wParam, lParam);
	}

	public int EmptyUndoBuffer(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, EM_EMPTYUNDOBUFFER, wParam, lParam);
	}

	public int GetFirstVisibleLine(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, EM_GETFIRSTVISIBLELINE, wParam, lParam);
	}

	/*
	 * public int GetLine(hwndCtl,line,lpch,cchMax) { ((*((int*)(lpch)) =
	 * (cchMax
	 * )),((int)(DWORD)SNDMSG((hwndCtl),EM_GETLINE,(WPARAM)(int)(line),(LPARAM
	 * )(LPTSTR)(lpch)))) }
	 */
	public int GetLineCount(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, EM_GETLINECOUNT, wParam, lParam);
	}

	public int GetModify(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, EM_GETMODIFY, wParam, lParam);
	}

	public int GetPasswordChar(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, EM_GETPASSWORDCHAR, wParam, lParam);
	}

	public int GetSel(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, EM_GETSEL, wParam, lParam);
	}

	public int LineFromChar(long hwndCtl, int ich) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(ich);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, EM_LINEFROMCHAR, wParam, lParam);
	}

	public int LineIndex(long hwndCtl, int line) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(line);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, EM_LINEINDEX, wParam, lParam);
	}

	public int LineLength(long hwndCtl, int line) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(line);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, EM_LINELENGTH, wParam, lParam);
	}

	public int ReplaceSel(long hwndCtl, String lpszReplace) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		Pointer pt = new Pointer(0);
		pt.setString(0, lpszReplace);
		LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
		return user32.SendMessage(hWnd, EM_REPLACESEL, wParam, lParam);
	}

	public int Scroll(long hwndCtl, int dv, int dh) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(dh);
		LPARAM lParam = new LPARAM(dv);
		return user32.SendMessage(hWnd, EM_LINESCROLL, wParam, lParam);
	}

	public boolean ScrollCaret(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return (user32.SendMessage(hWnd, EM_SCROLLCARET, wParam, lParam) != 0) ? (true)
				: (false);
	}

	public int SetPasswordChar(long hwndCtl, int ch) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(ch);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, EM_SETPASSWORDCHAR, wParam, lParam);
	}

	public int SetSel(long hwndCtl, int ichStart, int ichEnd) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(ichStart);
		LPARAM lParam = new LPARAM(ichEnd);
		return user32.SendMessage(hWnd, EM_SETSEL, wParam, lParam);
	}

	public boolean SetText(long hwndCtl, String lpsz) {
		HWND hWnd = longToHwnd(hwndCtl);
		return user32.SetWindowText(hWnd, (lpsz).toCharArray());
	}

	public int Undo(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, EM_UNDO, wParam, lParam);
	}
}
