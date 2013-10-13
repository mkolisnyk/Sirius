/**
 * .
 */
package org.sirius.server.win32;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;

/**
 * @author Myk Kolisnyk
 * .
 */
public class Win32Locator {

    /**
     * .
     */
    private long   hwnd;
    /**
     * .
     */
    private long   parent;
    /**
     * .
     */
    private String winClass;
    /**
     * .
     */
    private String caption;
    /**
     * .
     */
    private int    index;

    /**
     * .
     */
    public Win32Locator() {
        hwnd = 0;
        parent = 0;
        winClass = "(.*)";
        caption = "(.*)";
        index = 0;
    }

    /**
     * @param winClass
     * @param caption
     * @param index
     */
    public Win32Locator(String winClass, String caption, int index) {
        super();
        this.winClass = winClass;
        this.caption = caption;
        this.index = index;
    }

    /**
     * @param parent
     * @param winClass
     * @param caption
     * @param index
     */
    public Win32Locator(long parent, String winClass, String caption, int index) {
        super();
        this.parent = parent;
        this.winClass = winClass;
        this.caption = caption;
        this.index = index;
    }

    /**
     * @return the caption
     */
    public final String getCaption() {
        return caption;
    }

    /**
     * @return the hwnd
     */
    public final long getHwnd() {
        return hwnd;
    }

    /**
     * @return the index
     */
    public final int getIndex() {
        return index;
    }

    /**
     * @return the parent
     */
    public final long getParent() {
        return parent;
    }

    /**
     * @return the winClass
     */
    public final String getWinClass() {
        return winClass;
    }

    /**
     * @param captionVal
     *            the caption to set
     */
    public final void setCaption(final String captionVal) {
        this.caption = captionVal;
    }

    /**
     * @param hwndVal
     *            the hwnd to set
     */
    public final void setHwnd(final HWND hwndVal) {
        this.hwnd = Pointer.nativeValue(hwndVal.getPointer());
    }

    /**
     * .
     * @param hwndVal .
     */
    public final void setHwnd(final long hwndVal) {
        this.hwnd = hwndVal;
    }

    /**
     * @param indexVal
     *            the index to set
     */
    public final void setIndex(final int indexVal) {
        this.index = indexVal;
    }

    /**
     * @param parentVal the parent to set
     */
    public final void setParent(final HWND parentVal) {
        this.parent = parentVal.getPointer().getLong(0);
    }

    /**
     * .
     * @param parentVal .
     */
    public final void setParent(final long parentVal) {
        this.parent = parentVal;
    }

    /**
     * @param winClassVal  the winClass to set
     */
    public final void setWinClass(final String winClassVal) {
        this.winClass = winClassVal;
    }
}
