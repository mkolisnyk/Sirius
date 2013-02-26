/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 *
 */
public interface IICCConsts {
	public final int ICC_LISTVIEW_CLASSES = 1;
	public final int ICC_TREEVIEW_CLASSES = 2;
	public final int ICC_BAR_CLASSES = 4;
	public final int ICC_TAB_CLASSES = 8;
	public final int ICC_UPDOWN_CLASS = 16;
	public final int ICC_PROGRESS_CLASS = 32;
	public final int ICC_HOTKEY_CLASS = 64;
	public final int ICC_ANIMATE_CLASS = 128;
	public final int ICC_WIN95_CLASSES = 255;
	public final int ICC_DATE_CLASSES = 256;
	public final int ICC_USEREX_CLASSES = 512;
	public final int ICC_COOL_CLASSES = 1024;
	public final int ICC_INTERNET_CLASSES = 2048;
	public final int ICC_PAGESCROLLER_CLASS = 4096;
	public final int ICC_NATIVEFNTCTL_CLASS = 8192;
	public final int ICC_STANDARD_CLASSES = 0x00004000;
	public final int ICC_LINK_CLASS = 0x00008000;
	
	public final int ICC_ALL = ICC_LISTVIEW_CLASSES | ICC_TREEVIEW_CLASSES | ICC_BAR_CLASSES 
			| ICC_TAB_CLASSES | ICC_UPDOWN_CLASS | ICC_PROGRESS_CLASS | ICC_HOTKEY_CLASS 
			| ICC_ANIMATE_CLASS | ICC_WIN95_CLASSES | ICC_DATE_CLASSES 
			| ICC_USEREX_CLASSES | ICC_COOL_CLASSES | ICC_INTERNET_CLASSES 
			| ICC_PAGESCROLLER_CLASS | ICC_NATIVEFNTCTL_CLASS | ICC_STANDARD_CLASSES 
			| ICC_LINK_CLASS;
};
