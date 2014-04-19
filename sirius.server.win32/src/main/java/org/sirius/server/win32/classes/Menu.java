/**
 * 
 */
package org.sirius.server.win32.classes;

import javax.jws.WebService;

import org.sirius.server.win32.constants.IMenuFlag;
import org.sirius.server.win32.constants.IWMConsts;
import org.sirius.server.win32.core.types.WinDefExt.MENUINFO;
import org.sirius.server.win32.core.types.WinDefExt.MENUITEMINFO;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef;

/**
 * @author Myk Kolisnyk
 * .
 */
@WebService
public class Menu extends Common implements IMenuFlag, IWMConsts, WinDef {

    /**
     * .
     */
    public Menu() {
        // TODO Auto-generated constructor stub
    }

    /**
     * .
     * @param hMenu .
     * @param fByPos .
     * @param gmdiFlags .
     * @return .
     */
    public int getMenuDefaultItem(final long hMenu, final int fByPos,
            final int gmdiFlags) {
        HMENU handle = longToHmenu(hMenu);
        return getUser32().GetMenuDefaultItem(handle, fByPos, gmdiFlags);
    }

    /**
     * .
     * @param hmenu .
     * @param lpcmi .
     * @return .
     */
    public boolean getMenuInfo(final long hmenu, final MENUINFO lpcmi) {
        HMENU handle = longToHmenu(hmenu);
        return getUser32().GetMenuInfo(handle, lpcmi);
    }

    /**
     * .
     * @param hMenu .
     * @return .
     */
    public int getMenuItemCount(final long hMenu) {
        HMENU handle = longToHmenu(hMenu);
        return getUser32().GetMenuItemCount(handle);
    }

    /**
     * .
     * @param hMenu .
     * @param nPos .
     * @return .
     */
    public int getMenuItemID(final long hMenu, final int nPos) {
        HMENU handle = longToHmenu(hMenu);
        return getUser32().GetMenuItemID(handle, nPos);
    }

    /**
     * .
     * @param hMenu .
     * @param uItem .
     * @param fByPosition .
     * @param lpmii .
     * @return .
     */
    public boolean getMenuItemInfo(final long hMenu, final int uItem,
            final boolean fByPosition, final MENUITEMINFO lpmii) {
        HMENU handle = longToHmenu(hMenu);
        return getUser32().GetMenuItemInfo(handle, uItem, fByPosition, lpmii);
    }

    /**
     * .
     * @param hWnd .
     * @param hMenu .
     * @param uItem .
     * @param rect .
     * @return .
     */
    public boolean getMenuItemRect(final long hWnd, final long hMenu,
            final int uItem, final RECT rect) {
        HWND handle = longToHwnd(hWnd);
        HMENU menuHandle = longToHmenu(hMenu);
        return getUser32().GetMenuItemRect(handle, menuHandle, uItem, rect);
    }

    /**
     * .
     * @param hMenu .
     * @param uId .
     * @param uFlags .
     * @return .
     */
    public int getMenuState(
            final long hMenu,
            final int uId,
            final int uFlags) {
        HMENU handle = longToHmenu(hMenu);
        return getUser32().GetMenuState(handle, uId, uFlags);
    }

    /**
     * .
     * @param hMenu .
     * @param uIDItem .
     * @param lpString .
     * @param nMaxCount .
     * @param uFlag .
     * @return .
     */
    public int getMenuString(
            final long hMenu,
            final int uIDItem,
            final char[] lpString,
            final int nMaxCount,
            final int uFlag) {
        HMENU handle = longToHmenu(hMenu);
        return getUser32()
                .GetMenuString(handle, uIDItem, lpString, nMaxCount, uFlag);
    }

    /**
     * .
     * @param hMenu .
     * @param nPos .
     * @return .
     */
    public long getSubMenu(final long hMenu, final int nPos) {
        HMENU handle = longToHmenu(hMenu);
        return Pointer
                .nativeValue(getUser32().GetSubMenu(handle, nPos).getPointer());
    }

    /**
     * .
     * @param hMenu .
     * @return .
     */
    public boolean isMenu(final long hMenu) {
        HMENU handle = longToHmenu(hMenu);
        return getUser32().IsMenu(handle);
    }

    /**
     * .
     * @param hwnd .
     * @param hMenu .
     * @param iPos .
     * @return .
     */
    public boolean pickItem(
            final long hwnd,
            final long hMenu,
            final int iPos) {
        int count = getMenuItemCount(hMenu);
        if (count < iPos) {
            return false;
        }

        HWND handle = longToHwnd(hwnd);

        WPARAM wParam = new WPARAM();
        LPARAM lParam = new LPARAM();
        int id = getMenuItemID(hMenu, iPos);

        wParam.setValue(id);
        lParam.setValue(0);

        getUser32().PostMessage(handle, WM_COMMAND, wParam, lParam);

        return true;
    }
}
