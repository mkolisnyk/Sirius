/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32.constants.IHeaderConsts;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinDef.HBITMAP;
import com.sun.jna.platform.win32.WinDef.LPARAM;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class Header extends Common implements IHeaderConsts {

    public static class HD_ITEM extends Structure {
        int     mask;
        int     cxy;
        char[]  pszText;
        HBITMAP hbm;
        int     cchTextMax;
        int     fmt;
        LPARAM  lParam;

        int     iImage;
        int     iOrder;
        int     type;
        Pointer pvFilter;

        /*
         * (non-Javadoc)
         * 
         * @see com.sun.jna.Structure#getFieldOrder()
         */
        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[] { "mask", "cxy", "pszText",
                    "hbm", "cchTextMax", "fmt", "lParam",

                    "iImage", "iOrder", "type", "pvFilter" });
        }
    }

    /**
	 * 
	 */
    public Header() {
        // TODO Auto-generated constructor stub
    }

    public int GetItem(final long hwndCtl, final int index) {
        // (BOOL)SNDMSG((w),HDM_GETITEM,(WPARAM)(int)(i),(LPARAM)(HD_ITEM*)(phdi))
        return 0;
    }

    public int GetItemCount(final long hwndCtl) {
        // (int)SNDMSG((w),HDM_GETITEMCOUNT,0,0)
        return 0;
    }

    public int GetItemRect(final long hwndCtl, final int index) {
        // (BOOL)SNDMSG((w),HDM_GETITEMRECT,(WPARAM)(i),(LPARAM)(r))
        return 0;
    }
    /*
     * #define Header_GetOrderArray(w,l,a)
     * (BOOL)SNDMSG((w),HDM_GETORDERARRAY,(WPARAM)(l),(LPARAM)(a)) #define
     * Header_SetOrderArray(w,l,a)
     * (BOOL)SNDMSG((w),HDM_SETORDERARRAY,(WPARAM)(l),(LPARAM)(a)) #define
     * Header_GetImageList(w) (HIMAGELIST)SNDMSG((w),HDM_GETIMAGELIST,0,0)
     */
}
