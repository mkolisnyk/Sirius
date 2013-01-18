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

/**
 * @author Myk Kolisnyk
 * 
 */
public interface WinDefExt extends WinDef {
	public static class UINT extends DWORD {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * 
		 */
		public UINT() {
			super();
		}

		/**
		 * @param arg0
		 */
		public UINT(long arg0) {
			super(arg0);
		}

	}

	public static class HBRUSH extends HANDLE {
		public HBRUSH() {
			super();
		}

		public HBRUSH(Pointer p) {
			super(p);
		}
	}

	public class MENUBARINFO extends Structure {
		public int cbSize = size();
		public RECT rcBar;
		public HMENU hMenu;
		public HWND hwndMenu;
		public boolean fBarFocused;
		public boolean fFocused;

		protected List getFieldOrder() {
			return Arrays.asList(new String[] { "cbSize", "rcBar", "hMenu",
					"hwndMenu", "fBarFocused", "fFocused" });
		}
	}

	public class MENUINFO extends Structure {
		public int cbSize = size();
		public DWORD fMask;
		public DWORD dwStyle;
		public UINT cyMax;
		public HBRUSH hbrBack;
		public DWORD dwContextHelpID;
		public ULONG_PTR dwMenuData;

		protected List getFieldOrder() {
			return Arrays.asList(new String[] { "cbSize", "fMask", "dwStyle",
					"cyMax", "hbrBack", "dwContextHelpID", "dwMenuData" });
		}
	}

	public class MENUITEMINFO extends Structure {
		public int cbSize = size();
		UINT fMask;
		UINT fType;
		UINT fState;
		UINT wID;
		HMENU hSubMenu;
		HBITMAP hbmpChecked;
		HBITMAP hbmpUnchecked;
		ULONG_PTR dwItemData;
		char[] dwTypeData;
		UINT cch;
		HBITMAP hbmpItem;

		protected List getFieldOrder() {
			return Arrays.asList(new String[] { "cbSize", "fMask", "fType",
					"fState", "wID", "hSubMenu", "hbmpChecked",
					"hbmpUnchecked", "dwItemData", "dwTypeData", "cch",
					"hbmpItem" });
		}
	}
}
