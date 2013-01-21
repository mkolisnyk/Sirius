/**
 * 
 */
package org.sirius.server.win32.classes;

import javax.jws.WebService;

import org.sirius.server.win32.constants.IMenuFlag;
import org.sirius.server.win32.constants.IWMConsts;
import org.sirius.server.win32.core.types.WinDefExt.MENUBARINFO;
import org.sirius.server.win32.core.types.WinDefExt.MENUINFO;
import org.sirius.server.win32.core.types.WinDefExt.MENUITEMINFO;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinDef.HMENU;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.RECT;

/**
 * @author Myk Kolisnyk
 *
 */
@WebService
public class Menu extends Common implements IMenuFlag, IWMConsts, WinDef {

	/**
	 * 
	 */
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public int GetMenuDefaultItem(long hMenu, int fByPos, int gmdiFlags){
		HMENU handle = longToHmenu(hMenu);
		return user32.GetMenuDefaultItem(handle, fByPos, gmdiFlags);
	}
	
	public boolean GetMenuInfo(long hmenu, MENUINFO lpcmi ){
		HMENU handle = longToHmenu(hmenu);
		return user32.GetMenuInfo(handle, lpcmi);
	}
	
	public int GetMenuItemCount(long hMenu){
		HMENU handle = longToHmenu(hMenu);
		return user32.GetMenuItemCount(handle);
	}
	
	public int GetMenuItemID(long hMenu, int nPos){
		HMENU handle = longToHmenu(hMenu);
		return user32.GetMenuItemID(handle, nPos);
	}
	
	public boolean GetMenuItemInfo(long hMenu,int uItem,boolean fByPosition,MENUITEMINFO lpmii){
		HMENU handle = longToHmenu(hMenu);
		return user32.GetMenuItemInfo(handle, uItem, fByPosition, lpmii);
	}
	
	public boolean GetMenuItemRect(long hWnd, long hMenu, int uItem, RECT rect){
		HWND handle = longToHwnd(hWnd);
		HMENU menuHandle = longToHmenu(hMenu);
		return user32.GetMenuItemRect(handle, menuHandle, uItem, rect);
	}
	
	public int GetMenuState(long hMenu, int uId, int uFlags){
		HMENU handle = longToHmenu(hMenu);
		return user32.GetMenuState(handle, uId, uFlags);
	}
	
	public int GetMenuString(long hMenu, int uIDItem, char[] lpString,
			int nMaxCount, int uFlag){
		HMENU handle = longToHmenu(hMenu);
		return user32.GetMenuString(handle, uIDItem, lpString, nMaxCount, uFlag);
	}
	
	public long GetSubMenu(long hMenu, int nPos){
		HMENU handle = longToHmenu(hMenu);
		return Pointer.nativeValue( user32.GetSubMenu(handle, nPos).getPointer() );
	}

	public boolean IsMenu(long hMenu){
		HMENU handle = longToHmenu(hMenu);
		return user32.IsMenu(handle);
	}
	
	public boolean pickItem(long hwnd, long hMenu,int iPos){
		int count = GetMenuItemCount(hMenu);
		if(count < iPos) return false;
		
		HWND handle = longToHwnd(hwnd);
		
		WPARAM wParam = new WPARAM();
		LPARAM lParam = new LPARAM();
		int id = GetMenuItemID(hMenu, iPos);
		
		wParam.setValue(id);
		lParam.setValue(0);
		
		user32.PostMessage(handle, WM_COMMAND, wParam, lParam);
		
		return true;
	}
}
