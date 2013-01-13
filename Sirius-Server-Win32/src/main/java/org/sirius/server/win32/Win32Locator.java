/**
 * 
 */
package org.sirius.server.win32;

import com.sun.jna.platform.win32.WinDef.HWND;

/**
 * @author Myk Kolisnyk
 *
 */
public class Win32Locator {

	private HWND hwnd;
	private HWND parent;
	private String winClass;
	private String caption;
	private int index;
	
	/**
	 * 
	 */
	public Win32Locator() {
		hwnd = null;
		parent = null;
		winClass = "(.*)";
		caption = "(.*)";
		index = 0;
	}

	/**
	 * @return the hwnd
	 */
	public final HWND getHwnd() {
		return hwnd;
	}

	/**
	 * @param hwnd the hwnd to set
	 */
	public final void setHwnd(HWND hwnd) {
		this.hwnd = hwnd;
	}

	/**
	 * @return the winClass
	 */
	public final String getWinClass() {
		return winClass;
	}

	/**
	 * @param winClass the winClass to set
	 */
	public final void setWinClass(String winClass) {
		this.winClass = winClass;
	}

	/**
	 * @return the caption
	 */
	public final String getCaption() {
		return caption;
	}

	/**
	 * @param caption the caption to set
	 */
	public final void setCaption(String caption) {
		this.caption = caption;
	}

	/**
	 * @return the index
	 */
	public final int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public final void setIndex(int index) {
		this.index = index;
	}

	/**
	 * @return the parent
	 */
	public final HWND getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public final void setParent(HWND parent) {
		this.parent = parent;
	}	
}
