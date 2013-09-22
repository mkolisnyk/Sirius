/**
 * .
 */
package org.sirius.server.win32;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32.core.User32Ext;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser;
import com.sun.jna.ptr.IntByReference;

/**
 * @author Myk Kolisnyk
 * .
 */
@WebService
public class Win32Utils extends Common {

    /**
     * .
     * @author Myk Kolisnyk
     *
     */
    public class WNDENUMPROC implements WinUser.WNDENUMPROC {

        /**
         * .
         */
        private final int maxLength = 128;

        /**
         * .
         */
        private int                currIndex;
        /**
         * .
         */
        private final Win32Locator locator;

        /**
         * .
         * @param locatorVal .
         */
        public WNDENUMPROC(final Win32Locator locatorVal) {
            this.locator = locatorVal;
            currIndex = 0;
        }

        /**
         * .
         * @param arg0 .
         * @param arg1 .
         * @return .
         */
        @Override
        public final boolean callback(final HWND arg0, final Pointer arg1) {
            User32Ext user32 = User32Ext.INSTANCE;
            int length = user32.GetWindowTextLength(arg0) + 1;
            char[] buf = new char[length];

            user32.GetWindowText(arg0, buf, length);
            String text = String.valueOf(buf).trim();

            if (!text.matches(locator.getCaption())) {
                return true;
            }

            buf = null;
            buf = new char[maxLength];

            user32.GetClassName(arg0, buf, maxLength);
            String clazz = String.valueOf(buf).trim();

            if (!clazz.matches(locator.getWinClass())) {
                return true;
            }

            if (currIndex < locator.getIndex()) {
                currIndex++;
            } else {
                locator.setHwnd(arg0);
            }

            if (locator.getHwnd() == 0) {
                return true;
            } else if (!user32.IsWindow(longToHwnd(locator.getHwnd()))) {
                locator.setHwnd(0L);
                return true;
            }

            buf = null;
            locator.setCaption(text);
            locator.setWinClass(clazz);

            return false;
        }

        /**
         * @return the locator
         */
        public final Win32Locator getLocator() {
            return locator;
        }
    }

    /**
	 * .
	 */
    public Win32Utils() {
    }

    /**
     * .
     * @param baseHwnd .
     * @param locator .
     * @return .
     */
    public final long searchSameThreadWindow(final long baseHwnd,
            final Win32Locator locator) {
        User32Ext user32 = User32Ext.INSTANCE;

        HWND hWnd = new HWND();
        hWnd.setPointer(Pointer.createConstant(baseHwnd));

        IntByReference lpdwProcessId = new IntByReference();
        int threadID = user32.GetWindowThreadProcessId(hWnd, lpdwProcessId);

        Pointer pt = Pointer.NULL;
        locator.setHwnd(0L);

        WNDENUMPROC enumProc = new WNDENUMPROC(locator);
        user32.EnumThreadWindows(threadID, enumProc, pt);

        return enumProc.getLocator().getHwnd();
    }

    /**
     * .
     * @param locator .
     * @return .
     */
    public final long searchWindow(final Win32Locator locator) {
        User32Ext user32 = User32Ext.INSTANCE;

        locator.setHwnd(0L);
        WNDENUMPROC enumProc = new WNDENUMPROC(locator);
        Pointer pt = Pointer.NULL;

        if (locator.getParent() == 0L) {
            user32.EnumWindows(enumProc, pt);
        } else {
            HWND hWnd = new HWND();
            hWnd.setPointer(Pointer.createConstant(locator.getParent()));
            user32.EnumChildWindows(hWnd, enumProc, pt);
        }
        return enumProc.getLocator().getHwnd();
    }
}
