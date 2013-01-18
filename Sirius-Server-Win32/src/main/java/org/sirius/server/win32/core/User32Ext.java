/**
 * 
 */
package org.sirius.server.win32.core;

import org.sirius.server.win32.core.types.WinDefExt.MENUBARINFO;
import org.sirius.server.win32.core.types.WinDefExt.MENUINFO;
import org.sirius.server.win32.core.types.WinDefExt.MENUITEMINFO;
import org.sirius.server.win32.core.types.WinDefExt.UINT;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.win32.W32APIOptions;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface User32Ext extends User32 {

	public User32Ext INSTANCE = (User32Ext) Native.loadLibrary("user32.dll",
			User32Ext.class, W32APIOptions.DEFAULT_OPTIONS);

	public HMENU GetMenu(HWND hWnd);
	public HMENU GetSubMenu(HMENU hMenu, int nPos);
	public boolean GetMenuBarInfo( HWND hwnd, LONG idObject, LONG idItem, MENUBARINFO pmbi );
	public LONG GetMenuCheckMarkDimensions();
	public UINT GetMenuDefaultItem(HMENU hMenu, UINT fByPos, UINT gmdiFlags);
	public boolean GetMenuInfo(HMENU hmenu, MENUINFO lpcmi );
	public int GetMenuItemCount(HMENU hMenu);
	public UINT GetMenuItemID(HMENU hMenu, int nPos);
	public boolean GetMenuItemInfo(HMENU hMenu,UINT uItem,boolean fByPosition,MENUITEMINFO lpmii);
	public boolean GetMenuItemRect(HWND hWnd, HMENU hMenu, UINT uItem, RECT rect);
	public UINT GetMenuState(HMENU hMenu, UINT uId, UINT uFlags);
	public int GetMenuString(HMENU hMenu, UINT uIDItem, char[] lpString,
			int nMaxCount, UINT uFlag);
	public HMENU GetSystemMenu(HWND hWnd, boolean bRevert);
}
