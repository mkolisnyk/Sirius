/**
 * 
 */
package org.sirius.server.win32.core.types;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.BaseTSD.ULONG_PTR;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT.HANDLE;
import com.sun.jna.platform.win32.WinUser.POINT;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface WinDefExt extends WinDef {
    class HBRUSH extends HANDLE {
        HBRUSH() {
            super();
        }

        HBRUSH(final Pointer p) {
            super(p);
        }
    }

    class MENUBARINFO extends Structure {
        public int     cbSize = size();
        public RECT    rcBar;
        public HMENU   hMenu;
        public HWND    hwndMenu;
        public boolean fBarFocused;
        public boolean fFocused;

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[] { "cbSize", "rcBar", "hMenu",
                    "hwndMenu", "fBarFocused", "fFocused" });
        }
    }

    class MENUINFO extends Structure {
        public int       cbSize = size();
        public DWORD     fMask;
        public DWORD     dwStyle;
        public UINT      cyMax;
        public HBRUSH    hbrBack;
        public DWORD     dwContextHelpID;
        public ULONG_PTR dwMenuData;

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[] { "cbSize", "fMask", "dwStyle",
                    "cyMax", "hbrBack", "dwContextHelpID", "dwMenuData" });
        }

    }

    class MENUITEMINFO extends Structure {
        public int       cbSize = size();
        public UINT      fMask;
        public UINT      fType;
        public UINT      fState;
        public UINT      wID;
        public HMENU     hSubMenu;
        public HBITMAP   hbmpChecked;
        public HBITMAP   hbmpUnchecked;
        public ULONG_PTR dwItemData;
        public String    dwTypeData;
        public UINT      cch;
        public HBITMAP   hbmpItem;

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[] { "cbSize", "fMask", "fType",
                    "fState", "wID", "hSubMenu", "hbmpChecked",
                    "hbmpUnchecked", "dwItemData", "dwTypeData", "cch",
                    "hbmpItem" });
        }
    }

    class UINT extends DWORD {
        /**
		 * 
		 */
        private static final long serialVersionUID = 1L;

        /**
		 * 
		 */
        UINT() {
            super();
        }

        /**
         * @param arg0
         */
        UINT(final long arg0) {
            super(arg0);
        }

    }

    class WINDOWPLACEMENT extends Structure {
        public int   length;
        public int   flags;
        public int   showCmd;
        public POINT ptMinPosition;
        public POINT ptMaxPosition;
        public RECT  rcNormalPosition;

        /*
         * (non-Javadoc)
         * 
         * @see com.sun.jna.Structure#getFieldOrder()
         */
        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[] { "length", "flags", "showCmd",
                    "ptMinPosition", "ptMaxPosition", "rcNormalPosition" });
        }
    }
}
