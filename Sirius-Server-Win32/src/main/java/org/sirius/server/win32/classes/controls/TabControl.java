/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32.classes.Kernel;
import org.sirius.server.win32.classes.Window;
import org.sirius.server.win32.constants.IMEMConsts;
import org.sirius.server.win32.constants.ITabControlConsts;
import org.sirius.server.win32.constants.IThreadConsts;
import org.sirius.server.win32.constants.IWMConsts;
import org.sirius.server.win32.core.CommCtl;
import org.sirius.server.win32.core.types.WinDefExt.UINT;
import org.sirius.server.win32lib.controls.Win32LibControlsClient;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.RECT;
import com.sun.jna.platform.win32.WinDef.UINT_PTR;
import com.sun.jna.platform.win32.WinDef.WPARAM;
import com.sun.jna.platform.win32.WinNT.HANDLE;
import com.sun.jna.platform.win32.WinUser.POINT;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class TabControl extends Common implements ITabControlConsts,
		IThreadConsts, IMEMConsts, IWMConsts {

    Win32LibControlsClient win32lib;
    
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

		public TC_ITEM() {
			// cchTextMax=255;
			pszText = null;
		}
	}

	public class NMHDR extends Structure {
		public HWND hwndFrom;
		public int idFrom;
		public int code;

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.sun.jna.Structure#getFieldOrder()
		 */
		@Override
		protected List getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList(new String[] { "hwndFrom", "idFrom", "code" });
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

		this.InitCommonControls();

		int dwThreadId = user32.GetWindowThreadProcessId(hWnd, null);
		HANDLE threadHandle = kernel32.OpenThread(TH_READ_CONTROL, true,
				dwThreadId);

		Kernel kernel = new Kernel();
		// kernel.VirtualAllocateMemory(item);
		item.mask = TCIF_TEXT;
		item.cchTextMax = 255;
		item.pszText = new String();

		kernel32.VirtualAllocEx(threadHandle, item.getPointer(), item.size(),
				new DWORD(MEM_COMMIT), new DWORD(MEM_LARGE_PAGES));

		LPARAM lParam = new LPARAM(Pointer.nativeValue(item.getPointer()));

		int ret = user32.SendMessage(hWnd, TCM_GETITEMW, wParam, lParam);

		// item.dwState = pt.getInt(0);
		Pointer pt = new Pointer(lParam.longValue());
		for (int i = 0; i < item.size(); i++) {
			System.out.println("Position " + i + ": " + pt.getInt(i));
		}

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
		try {
            win32lib.tab().selectByIndex((int)hwndCtl,index);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
	
	public String[] GetItemNames(long hwndCtl){
	    try {
            return win32lib.tab().getItemNames((int)hwndCtl);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	    return null;
	}
	
	public void Select(long hwndCtl, String tabName){
	    try {
            win32lib.tab().selectByName((int)hwndCtl, tabName);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	public String GetSelectedItem(long hwndCtl){
	    try {
            return win32lib.tab().getSelectedItem((int)hwndCtl);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	    return null;
	}
}
