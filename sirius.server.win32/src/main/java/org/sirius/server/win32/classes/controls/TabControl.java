/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32.constants.IMEMConsts;
import org.sirius.server.win32.constants.ITabControlConsts;
import org.sirius.server.win32.constants.IThreadConsts;
import org.sirius.server.win32.constants.IWMConsts;
import org.sirius.server.win32lib.controls.Win32LibControlsClient;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinNT.HANDLE;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class TabControl extends Common implements ITabControlConsts,
        IThreadConsts, IMEMConsts, IWMConsts {

    public class NMHDR extends Structure {
        public HWND hwndFrom;
        public int  idFrom;
        public int  code;

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
        public int   flags;

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

    public static class TC_ITEM extends Structure {
        public int    mask;

        public int    dwState;
        public int    dwStateMask;

        public String pszText;
        public int    cchTextMax;
        public int    iImage;
        public LPARAM lParam;

        public TC_ITEM() {
            // cchTextMax=255;
            pszText = null;
        }

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
    }

    /**
     * .
     */
    private final Win32LibControlsClient win32lib;

    /**
	 * 
	 */
    public TabControl() {
        win32lib = new Win32LibControlsClient();
    }

    public int GetCurFocus(final long hwndCtl) {
        return sendMessage(hwndCtl, TCM_GETCURFOCUS, 0, 0);
    }

    public int GetCurSel(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, TCM_GETCURSEL, wParam, lParam);
    }

    public TC_ITEM GetItem(final long hwndCtl, final int index) {
        HWND hWnd = longToHwnd(hwndCtl);
        TC_ITEM item = new TC_ITEM();
        //WPARAM wParam = new WPARAM(index);

        this.initCommonControls();

        int dwThreadId = getUser32().GetWindowThreadProcessId(hWnd, null);
        HANDLE threadHandle = getKernel32().OpenThread(TH_READ_CONTROL, true,
                dwThreadId);

        item.mask = TCIF_TEXT;
        item.cchTextMax = 255;
        item.pszText = new String();

        getKernel32().VirtualAllocEx(threadHandle, item.getPointer(), item.size(),
                new DWORD(MEM_COMMIT), new DWORD(MEM_LARGE_PAGES));

        LPARAM lParam = new LPARAM(Pointer.nativeValue(item.getPointer()));

        //int ret = getUser32().SendMessage(hWnd, TCM_GETITEMW, wParam, lParam);

        // item.dwState = pt.getInt(0);
        Pointer pt = new Pointer(lParam.longValue());
        for (int i = 0; i < item.size(); i++) {
            System.out.println("Position " + i + ": " + pt.getInt(i));
        }

        return item;
    }

    public int GetItemCount(final long hwndCtl) throws RemoteException {
        //return sendMessage(hwndCtl, TCM_GETITEMCOUNT, 0, 0);
        return win32lib.tab().getItemsCount((int) hwndCtl);
    }

    public String[] GetItemNames(final long hwndCtl) {
        try {
            return win32lib.tab().getItemNames((int) hwndCtl);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public RECT GetItemRect(final long hwndCtl, final int index) {
        HWND hWnd = longToHwnd(hwndCtl);
        RECT item = new RECT();
        WPARAM wParam = new WPARAM(index);

        Pointer pt = item.getPointer();
        LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
        getUser32().SendMessage(hWnd, TCM_GETITEMRECT, wParam, lParam);
        return item;
    }

    /*
     * public HWND GetToolTips(w){ (HWND)SNDMSG((w),TCM_GETTOOLTIPS,0,0) }
     */

    public int GetRowCount(final long hwndCtl) {
        return sendMessage(hwndCtl, TCM_GETROWCOUNT, 0, 0);
    }

    public String GetSelectedItem(final long hwndCtl) {
        try {
            return win32lib.tab().getSelectedItem((int) hwndCtl);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public TC_HITTESTINFO HitTest(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        TC_HITTESTINFO item = new TC_HITTESTINFO();
        WPARAM wParam = new WPARAM(0);

        Pointer pt = item.getPointer();
        LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
        getUser32().SendMessage(hWnd, TCM_HITTEST, wParam, lParam);
        return item;
    }

    public void Select(final long hwndCtl, final String tabName) {
        try {
            win32lib.tab().selectByName((int) hwndCtl, tabName);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void SelectByIndex(final long hwndCtl, final int index) {
        try {
            win32lib.tab().selectByIndex((int) hwndCtl, index);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void SetCurFocus(final long hwndCtl, final int index) {
        sendMessage(hwndCtl, TCM_SETCURFOCUS, index, 0);
    }

    public void SetCurSel(final long hwndCtl, final int index) {
        try {
            win32lib.tab().selectByIndex((int) hwndCtl, index);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
