/**
 * .
 */
package org.sirius.server.win32.classes;

import javax.jws.WebService;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;

/**
 * Represents common interface for the Dialog boxes and all related items.
 * @author Myk Kolisnyk
 */
@WebService
public class Dialog extends Common {

    /**
	 * .
	 */
    public Dialog() {
        // TODO Auto-generated constructor stub
    }

    /**
     * .
     * @return .
     */
    public long getDialogBaseUnits() {
        return this.getDlg32().GetDialogBaseUnits();
    }

    /**
     * .
     * @param hWnd .
     * @return .
     */
    public int getDlgCtrlID(final long hWnd) {
        HWND handle = this.longToHwnd(hWnd);
        return this.getDlg32().GetDlgCtrlID(handle);
    }

    /**
     * .
     * @param hWnd .
     * @param itemId .
     * @return .
     */
    public long getDlgItem(final long hWnd, final int itemId) {
        HWND handle = this.longToHwnd(hWnd);
        return Pointer.nativeValue(this.getDlg32().GetDlgItem(handle, itemId)
                .getPointer());
    }

    /**
     * .
     * @param hWnd .
     * @param itemId .
     * @param pbool .
     * @param flag2 .
     * @return .
     */
    public int getDlgItemInt(final long hWnd, final int itemId,
            final boolean pbool, final boolean flag2) {
        HWND handle = this.longToHwnd(hWnd);
        return this.getDlg32().GetDlgItemInt(handle, itemId, pbool, flag2);
    }

    /**
     * .
     * @param hWnd .
     * @param itemId .
     * @return .
     */
    public String getDlgItemTextA(final long hWnd, final int itemId) {
        HWND handle = this.longToHwnd(hWnd);

        int length = 255;
        char[] buf = new char[length];

        getDlg32().GetDlgItemTextA(handle, itemId, buf, length);
        String text = String.valueOf(buf).trim();
        return text;
    }

    /**
     * .
     * @param hWnd .
     * @param itemId .
     * @return .
     */
    public int isDlgButtonChecked(final long hWnd, final int itemId) {
        HWND handle = this.longToHwnd(hWnd);
        return getDlg32().IsDlgButtonChecked(handle, itemId);
    }

    /**
     * .
     * @param hWnd .
     * @param itenId .
     * @param intValue .
     * @param flag .
     * @return .
     */
    public boolean setDlgItemInt(final long hWnd, final int itenId,
            final int intValue, final boolean flag) {
        HWND handle = this.longToHwnd(hWnd);
        return getDlg32().SetDlgItemInt(handle, itenId, intValue, flag);
    }

    /**
     * .
     * @param hWnd .
     * @param itemId .
     * @param text .
     * @return .
     */
    public boolean setDlgItemText(final long hWnd, final int itemId,
            final String text) {
        HWND handle = this.longToHwnd(hWnd);
        return getDlg32().SetDlgItemTextA(handle, itemId, text.toCharArray());
    }

}
