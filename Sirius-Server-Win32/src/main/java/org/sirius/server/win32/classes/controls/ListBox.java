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
    public int FindString(final long hwndCtl, final int indexStart,
            final String lpszFind) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(indexStart);
        Pointer pt = new Pointer(0);
        pt.setString(0, lpszFind);
        LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));

        return getUser32().SendMessage(hWnd, LB_FINDSTRING, wParam, lParam);
    }

    public int FindStringExact(final long hwndCtl, final int indexStart,
            final String lpszFind) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(indexStart);
        Pointer pt = new Pointer(0);
        pt.setString(0, lpszFind);
        LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));

        return getUser32().SendMessage(hWnd, LB_FINDSTRINGEXACT, wParam, lParam);
    }

    public int GetCaretIndex(final long hwndCtl) {
        return this.sendMessage(hwndCtl, LB_GETCARETINDEX, 0, 0);
    }

    public int GetCount(final long hwndCtl) {
        return this.sendMessage(hwndCtl, LB_GETCOUNT, 0, 0);
    }

    public int GetCurSel(final long hwndCtl) {
        return this.sendMessage(hwndCtl, LB_GETCURSEL, 0, 0);
    }

    public int GetHorizontalExtent(final long hwndCtl) {
        return this.sendMessage(hwndCtl, LB_GETHORIZONTALEXTENT, 0, 0);
    }

    /*
     * public int GetItemData(hwndCtl,index) {
     * ((LRESULT)(DWORD)SNDMSG((hwndCtl),LB_GETITEMDATA,(WPARAM)(int)(index),0))
     * }
     */
    public int GetItemHeight(final long hwndCtl, final int index) {
        return this.sendMessage(hwndCtl, LB_GETITEMHEIGHT, index, 0);
    }

    /*
     * public int GetItemRect(hwndCtl,index,lprc) {
     * ((int)(DWORD)SNDMSG((hwndCtl)
     * ,LB_GETITEMRECT,(WPARAM)(int)(index),(LPARAM)(RECT*)(lprc))) }
     */
    public int GetSel(final long hwndCtl, final int index) {
        return this.sendMessage(hwndCtl, LB_GETSEL, index, 0);
    }

    public int GetSelCount(final long hwndCtl) {
        return this.sendMessage(hwndCtl, LB_GETSELCOUNT, 0, 0);
    }

    /*
     * public int GetSelItems(hwndCtl,cItems,lpItems) {
     * ((int)(DWORD)SNDMSG((hwndCtl
     * ),LB_GETSELITEMS,(WPARAM)(int)(cItems),(LPARAM)(int*)(lpItems))) }
     */
    public String GetText(final long hwndCtl, final int index) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(index);
        Pointer pt = new Pointer(0);
        String lpszText = "";
        pt.setString(0, lpszText);
        LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
        getUser32().SendMessage(hWnd, LB_GETTEXT, wParam, lParam);
        return pt.getString(0);
    }

    public int GetTextLen(final long hwndCtl, final int index) {
        return sendMessage(hwndCtl, LB_GETTEXTLEN, index, 0);
    }

    public int GetTopIndex(final long hwndCtl) {
        return sendMessage(hwndCtl, LB_GETTOPINDEX, 0, 0);
    }

    public int SelectString(final long hwndCtl, final int indexStart,
            final String lpszFind) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(indexStart);
        Pointer pt = new Pointer(0);
        String lpszText = "";
        pt.setString(0, lpszText);
        LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
        return getUser32().SendMessage(hWnd, LB_SELECTSTRING, wParam, lParam);
    }

    public int SelItemRange(final long hwndCtl, final boolean fSelect,
            final int first, final int last) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(fSelect ? 1 : 0);
        LPARAM lParam = this.makeLParam(first, last);
        return getUser32().SendMessage(hWnd, LB_SELITEMRANGE, wParam, lParam);
    }

    public int SetCaretIndex(final long hwndCtl, final int index) {
        return sendMessage(hwndCtl, LB_SETCARETINDEX, index, 0);
    }

    public int SetCurSel(final long hwndCtl, final int index) {
        return sendMessage(hwndCtl, LB_SETCURSEL, index, 0);
    }

    public int SetSel(final long hwndCtl, final boolean fSelect, final int index) {
        return sendMessage(hwndCtl, LB_SETSEL, fSelect ? 1 : 0, index);
    }
}
