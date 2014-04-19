/**
 * 
 */
package org.sirius.server.win32.core;

import org.sirius.server.win32.core.types.WinDefExt.MENUBARINFO;
import org.sirius.server.win32.core.types.WinDefExt.MENUINFO;
import org.sirius.server.win32.core.types.WinDefExt.MENUITEMINFO;
import org.sirius.server.win32.core.types.WinDefExt.WINDOWPLACEMENT;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.win32.W32APIOptions;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface User32Ext extends User32 {

    User32Ext INSTANCE = (User32Ext) Native.loadLibrary("user32.dll",
                                      User32Ext.class,
                                      W32APIOptions.DEFAULT_OPTIONS);

    boolean GetClientRect(HWND hWnd, RECT rect);

    HMENU GetMenu(HWND hWnd);

    boolean GetMenuBarInfo(HWND hwnd, long idObject, long idItem,
            MENUBARINFO pmbi);

    long GetMenuCheckMarkDimensions();

    int GetMenuDefaultItem(HMENU hMenu, int fByPos, int gmdiFlags);

    boolean GetMenuInfo(HMENU hmenu, MENUINFO lpcmi);

    int GetMenuItemCount(HMENU hMenu);

    int GetMenuItemID(HMENU hMenu, int nPos);

    boolean GetMenuItemInfo(HMENU hMenu, int uItem, boolean fByPosition,
            MENUITEMINFO lpmii);

    boolean GetMenuItemRect(HWND hWnd, HMENU hMenu, int uItem, RECT rect);

    int GetMenuState(HMENU hMenu, int uId, int uFlags);

    int GetMenuString(HMENU hMenu, int uIDItem, char[] lpString,
            int nMaxCount, int uFlag);

    HWND GetParent(HWND hWnd);

    HMENU GetSubMenu(HMENU hMenu, int nPos);

    HMENU GetSystemMenu(HWND hWnd, boolean bRevert);

    HDC GetWindowDC(HWND hWnd);

    boolean GetWindowPlacement(HWND hwnd, WINDOWPLACEMENT placement);

    boolean IsIconic(HWND handle);

    boolean IsMenu(HMENU handle);

    boolean IsRectEmpty(RECT rect);

    boolean IsWindow(HWND handle);

    boolean IsWindowEnabled(HWND handle);

    boolean IsWindowUnicode(HWND handle);

    int SendMessage(HWND hWnd, int msg, WPARAM wParam, LPARAM lParam);

    boolean SetWindowText(HWND hWnd, char[] lpString);
}
