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
 * .
 */
@WebService
public class Edit extends Common implements IEditConsts {

    /**
     * .
     */
    public Edit() {
        // TODO Auto-generated constructor stub
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int canUndo(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, EM_CANUNDO, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int emptyUndoBuffer(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(
                hWnd,
                EM_EMPTYUNDOBUFFER,
                wParam,
                lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getFirstVisibleLine(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(
                hWnd,
                EM_GETFIRSTVISIBLELINE,
                wParam,
                lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getLineCount(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, EM_GETLINECOUNT, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getModify(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, EM_GETMODIFY, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getPasswordChar(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(
                hWnd,
                EM_GETPASSWORDCHAR,
                wParam,
                lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getSel(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, EM_GETSEL, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param ich .
     * @return .
     */
    public final int lineFromChar(final long hwndCtl, final int ich) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(ich);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, EM_LINEFROMCHAR, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param line .
     * @return .
     */
    public final int lineIndex(final long hwndCtl, final int line) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(line);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, EM_LINEINDEX, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param line .
     * @return .
     */
    public final int lineLength(final long hwndCtl, final int line) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(line);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, EM_LINELENGTH, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param lpszReplace .
     * @return .
     */
    public final int replaceSel(final long hwndCtl, final String lpszReplace) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        Pointer pt = new Pointer(0);
        pt.setString(0, lpszReplace);
        LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
        return getUser32().SendMessage(hWnd, EM_REPLACESEL, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param dv .
     * @param dh .
     * @return .
     */
    public final int scroll(final long hwndCtl, final int dv, final int dh) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(dh);
        LPARAM lParam = new LPARAM(dv);
        return getUser32().SendMessage(hWnd, EM_LINESCROLL, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final boolean scrollCaret(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return (getUser32()
                    .SendMessage(
                            hWnd,
                            EM_SCROLLCARET,
                            wParam,
                            lParam) != 0)
                ? true
                : false;
    }

    /**
     * .
     * @param hwndCtl .
     * @param ch .
     * @return .
     */
    public final int setPasswordChar(final long hwndCtl, final int ch) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(ch);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(
                hWnd,
                EM_SETPASSWORDCHAR,
                wParam,
                lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param ichStart .
     * @param ichEnd .
     * @return .
     */
    public final int setSel(
            final long hwndCtl,
            final int ichStart,
            final int ichEnd) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(ichStart);
        LPARAM lParam = new LPARAM(ichEnd);
        return getUser32().SendMessage(hWnd, EM_SETSEL, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param lpsz .
     * @return .
     */
    public final boolean setText(final long hwndCtl, final String lpsz) {
        HWND hWnd = longToHwnd(hwndCtl);
        return getUser32().SetWindowText(hWnd, lpsz.toCharArray());
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int undo(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, EM_UNDO, wParam, lParam);
    }
}
