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
public interface DlgWin32API extends StdCallLibrary {

    DlgWin32API INSTANCE = (DlgWin32API) Native.loadLibrary(
                                        "user32.dll", DlgWin32API.class,
                                        W32APIOptions.DEFAULT_OPTIONS);

    long GetDialogBaseUnits();

    int GetDlgCtrlID(HWND hWnd);

    HWND GetDlgItem(HWND hWnd, int itemId);

    int GetDlgItemInt(HWND hWnd, int itemId, boolean pbool, boolean flag2);

    int GetDlgItemTextA(HWND hWnd, int itemId, char[] text, int size);

    int IsDlgButtonChecked(HWND hwnd, int itemId);

    boolean SetDlgItemInt(HWND hwnd, int itenId, int intValue,
            boolean flag);

    boolean SetDlgItemTextA(HWND hwnd, int itemId, char[] text);

}
