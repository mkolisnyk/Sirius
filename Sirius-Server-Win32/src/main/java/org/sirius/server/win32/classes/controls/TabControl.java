/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32.classes.Window;
import org.sirius.server.win32.constants.ITabControlConsts;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.RECT;
import com.sun.jna.platform.win32.WinDef.WPARAM;
import com.sun.jna.platform.win32.WinUser.POINT;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class TabControl extends Common implements ITabControlConsts {

	/**
	 * 
	 */
	public TabControl() {
		// TODO Auto-generated constructor stub
	}

	public static class TC_ITEM extends Structure {
		public int mask;

		public int dwState;
		public int dwStateMask;

		public String pszText;
		public int cchTextMax;
		public int iImage;
		public LPARAM lParam;

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.sun.jna.Structure#getFieldOrder()
		 */
		@Override
		protected List getFieldOrder() {
			return Arrays
					.asList(new String[] { "mask", "dwState", "dwStateMask",
							"pszText", "cchTextMax", "iImage", "lParam" });
		}
		public TC_ITEM(){
			//cchTextMax=255;
			pszText = "";
		}
	}

	public static class TC_HITTESTINFO extends Structure {
		public POINT pt;
		public int flags;

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.sun.jna.Structure#getFieldOrder()
		 */
		@Override
		protected List getFieldOrder() {
			return Arrays.asList(new String[] { "pt", "flags" });
		}
	}

	public TC_ITEM GetItem(long hwndCtl, int index) {
		HWND hWnd = longToHwnd(hwndCtl);
		TC_ITEM item = new TC_ITEM();
		WPARAM wParam = new WPARAM(index);

		Pointer pt = item.getPointer();
		LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
		user32.SendMessage(hWnd, TCM_GETITEMA, wParam, lParam);
		return item;
	}

	public RECT GetItemRect(long hwndCtl, int index) {
		HWND hWnd = longToHwnd(hwndCtl);
		RECT item = new RECT();
		WPARAM wParam = new WPARAM(index);

		Pointer pt = item.getPointer();
		LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
		user32.SendMessage(hWnd, TCM_GETITEMRECT, wParam, lParam);
		return item;
	}

	public int GetCurSel(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(0);
		LPARAM lParam = new LPARAM(0);
		return user32.SendMessage(hWnd, TCM_GETCURSEL, wParam, lParam);
	}

	public void SetCurSel(long hwndCtl, int index) {
		HWND hWnd = longToHwnd(hwndCtl);
		WPARAM wParam = new WPARAM(index);
		LPARAM lParam = new LPARAM(0);
		user32.SendMessage(hWnd, TCM_SETCURSEL, wParam, lParam);
	}

	public TC_HITTESTINFO HitTest(long hwndCtl) {
		HWND hWnd = longToHwnd(hwndCtl);
		TC_HITTESTINFO item = new TC_HITTESTINFO();
		WPARAM wParam = new WPARAM(0);

		Pointer pt = item.getPointer();
		LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
		user32.SendMessage(hWnd, TCM_HITTEST, wParam, lParam);
		return item;
	}

	public int GetRowCount(long hwndCtl) {
		return SendMessage(hwndCtl, TCM_GETROWCOUNT, 0, 0);
	}

	/*
	 * public HWND GetToolTips(w){ (HWND)SNDMSG((w),TCM_GETTOOLTIPS,0,0) }
	 */

	public int GetCurFocus(long hwndCtl) {
		return SendMessage(hwndCtl, TCM_GETCURFOCUS, 0, 0);
	}

	public void SetCurFocus(long hwndCtl, int index) {
		SendMessage(hwndCtl, TCM_SETCURFOCUS, index, 0);
	}

	public int GetItemCount(long hwndCtl) {
		return SendMessage(hwndCtl, TCM_GETITEMCOUNT, 0, 0);
	}
	
	public static void main(String args[]){
		long hwnd = 0x000B0960L;

		long mainHwnd = 0x0009093FCL;
		HWND dlg = new HWND();
		dlg.setPointer(Pointer.createConstant(mainHwnd));
		TabControl control = new TabControl();
		Window win = new Window();
		//TC_ITEM item = control.GetItem(hwnd, 0);
		//System.out.println(item.pszText);
		RECT rc = control.GetItemRect(hwnd, 2);
		win.click(hwnd, 0, rc.left, rc.top, true, true, true);
	}
}
