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
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.RECT;
import com.sun.jna.platform.win32.WinDef.WPARAM;
import com.sun.jna.win32.W32APIOptions;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface User32Ext extends User32 {

	public User32Ext INSTANCE = (User32Ext) Native.loadLibrary("user32.dll",
			User32Ext.class, W32APIOptions.DEFAULT_OPTIONS);

	boolean GetClientRect(HWND hWnd, RECT rect);
	
	public HMENU GetMenu(HWND hWnd);
	public HMENU GetSubMenu(HMENU hMenu, int nPos);
	public boolean GetMenuBarInfo( HWND hwnd, long idObject, long idItem, MENUBARINFO pmbi );
	public long GetMenuCheckMarkDimensions();
	public int GetMenuDefaultItem(HMENU hMenu, int fByPos, int gmdiFlags);
	public boolean GetMenuInfo(HMENU hmenu, MENUINFO lpcmi );
	public int GetMenuItemCount(HMENU hMenu);
	public int GetMenuItemID(HMENU hMenu, int nPos);
	public boolean GetMenuItemInfo(HMENU hMenu,int uItem,boolean fByPosition,MENUITEMINFO lpmii);
	public boolean GetMenuItemRect(HWND hWnd, HMENU hMenu, int uItem, RECT rect);
	public int GetMenuState(HMENU hMenu, int uId, int uFlags);
	public int GetMenuString(HMENU hMenu, int uIDItem, char[] lpString,
			int nMaxCount, int uFlag);
	public HMENU GetSystemMenu(HWND hWnd, boolean bRevert);
	
	public boolean GetWindowPlacement(HWND hwnd,WINDOWPLACEMENT placement);
	
	public boolean IsIconic(HWND handle);
	public boolean IsMenu(HMENU handle);
	public boolean IsRectEmpty(RECT rect);
	public boolean IsWindow(HWND  handle);
	public boolean IsWindowEnabled(HWND handle);
	public boolean IsWindowUnicode(HWND handle);

	public int SendMessage(HWND hWnd, int msg, WPARAM wParam, LPARAM lParam);

	public boolean SetWindowText( HWND hWnd, char[] lpString);
}
