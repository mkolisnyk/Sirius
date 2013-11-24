/**
 * 
 */
package org.sirius.server.win32.classes;

import javax.jws.WebService;

import org.sirius.server.win32.constants.IMKConsts;
import org.sirius.server.win32.constants.IWMConsts;
import org.sirius.server.win32.core.types.WinDefExt.WINDOWPLACEMENT;

import com.sun.jna.Pointer;

/**
 * Core class representing base window functionality. It is collection of the methods which are mostly general
 * to window objects. 
 * @author Myk Kolisnyk
 */
@WebService
public class Window extends Common implements IWMConsts, IMKConsts {

    /**
	 * .
	 */
    public Window() {
        // TODO Auto-generated constructor stub
    }

    /**
     * .
     * @param hwnd .
     */
    public void activate(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        getUser32().SetForegroundWindow(handle);
    }

    /**
     * .
     * @param hwnd .
     * @param button .
     * @param x .
     * @param y .
     * @param isControl .
     * @param isAlt .
     * @param isShift .
     */
    public void click(final long hwnd, final int button, final int x,
            final int y, final boolean isControl, final boolean isAlt,
            final boolean isShift) {
        mouseDown(hwnd, button, x, y, isControl, isAlt, isShift);
        mouseUp(hwnd, button, x, y, isControl, isAlt, isShift);
    }

    /**
     * .
     * @param hwnd .
     */
    public void close(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        WPARAM wParam = new WPARAM();
        LPARAM lParam = new LPARAM();

        wParam.setValue(0);
        lParam.setValue(0);
        getUser32().PostMessage(handle, WM_CLOSE, wParam, lParam);
    }

    /**
     * .
     * @param hwnd .
     * @param button .
     * @param x .
     * @param y .
     * @param isControl .
     * @param isAlt .
     * @param isShift .
     */
    public void doubleClick(
            final long hwnd,
            final int button,
            final int x,
            final int y,
            final boolean isControl,
            final boolean isAlt,
            final boolean isShift) {
        int message = 0;
        int flags = 0;
        switch (button) {
            case 0:
                message = WM_LBUTTONDBLCLK;
                break;
            case 1:
                message = WM_RBUTTONDBLCLK;
                break;
            case 2:
                message = WM_MBUTTONDBLCLK;
                break;
            default:
                message = WM_LBUTTONDBLCLK;
                break;
        }

        if (isControl) {
            flags |= MK_CONTROL;
        }
        if (isShift) {
            flags |= MK_SHIFT;
        }
        sendMessage(hwnd, message, flags, makeLParam(x, y).intValue());
    }

    /**
     * .
     * @param hwnd .
     * @return .
     */
    public RECT getClientRect(final long hwnd) {
        RECT result = new RECT();
        HWND handle = longToHwnd(hwnd);
        getUser32().GetClientRect(handle, result);
        return result;
    }

    public long getDesktopWindow(){
        return 0;
    }
    
    /**
     * .
     * @param hwnd .
     * @return .
     */
    public long getMenu(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        HMENU hmenu = getUser32().GetMenu(handle);
        return Pointer.nativeValue(hmenu.getPointer());
    }

    /**
     * .
     * @param hwnd .
     * @return .
     */
    public RECT getRect(final long hwnd) {
        RECT result = new RECT();
        HWND handle = longToHwnd(hwnd);
        getUser32().GetWindowRect(handle, result);
        return result;
    }

    /**
     * .
     * @param hwnd .
     * @param revert .
     * @return .
     */
    public long getSystemMenu(final long hwnd, final boolean revert) {
        HWND handle = longToHwnd(hwnd);
        HMENU hmenu = getUser32().GetSystemMenu(handle, revert);
        return Pointer.nativeValue(hmenu.getPointer());
    }

    /**
     * .
     * @param hwnd .
     * @return .
     */
    public String getText(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        int length = getUser32().GetWindowTextLength(handle) + 1;
        char[] buf = new char[length];

        getUser32().GetWindowText(handle, buf, length);
        String text = String.valueOf(buf).trim();
        return text;
    }

    /**
     * .
     * @param hwnd .
     * @param placement .
     * @return .
     */
    public boolean getWindowPlacement(final long hwnd,
            final WINDOWPLACEMENT placement) {
        HWND handle = longToHwnd(hwnd);
        return getUser32().GetWindowPlacement(handle, placement);
    }

    /**
     * .
     * @param hwnd .
     * @return .
     */
    public boolean isEnabled(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        return getUser32().IsWindowEnabled(handle);
    }

    /**
     * .
     * @param hwnd .
     * @return .
     */
    public boolean isMaximized(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        WINDOWPLACEMENT placement = new WINDOWPLACEMENT();
        getUser32().GetWindowPlacement(handle, placement);
        return placement.showCmd == SW_MAXIMIZE;
    }

    /**
     * .
     * @param hwnd .
     * @return .
     */
    public boolean isMinimized(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        WINDOWPLACEMENT placement = new WINDOWPLACEMENT();
        getUser32().GetWindowPlacement(handle, placement);
        return placement.showCmd == SW_SHOWMINIMIZED;
    }

    /**
     * .
     * @param hwnd .
     * @return .
     */
    public boolean isNormal(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        WINDOWPLACEMENT placement = new WINDOWPLACEMENT();
        getUser32().GetWindowPlacement(handle, placement);
        return placement.showCmd == SW_NORMAL;
    }

    /**
     * .
     * @param hwnd .
     * @return .
     */
    public boolean isUnicode(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        return getUser32().IsWindowUnicode(handle);
    }

    /**
     * .
     * @param hwnd .
     * @return .
     */
    public boolean isVisible(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        return getUser32().IsWindowVisible(handle);
    }

    /**
     * .
     * @param hwnd .
     * @return .
     */
    public boolean isWindow(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        return getUser32().IsWindow(handle);
    }

    /**
     * .
     * @param hwnd .
     * @param key .
     */
    public void keyDown(final long hwnd, final int key) {
        sendMessage(hwnd, WM_KEYDOWN, key, 0);
    }

    /**
     * .
     * @param hwnd .
     * @param key .
     */
    public void keyPress(final long hwnd, final int key) {
        sendMessage(hwnd, WM_CHAR, key, 0);
    }

    /**
     * .
     * @param hwnd .
     * @param key .
     */
    public void keyUp(final long hwnd, final int key) {
        sendMessage(hwnd, WM_KEYUP, key, 0);
    }

    /**
     * .
     * @param hwnd .
     */
    public void maximize(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        getUser32().ShowWindow(handle, SW_MAXIMIZE);
    }

    /**
     * .
     * @param hwnd .
     */
    public void minimize(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        getUser32().ShowWindow(handle, SW_MINIMIZE);
    }

    /**
     * .
     * @param hwnd .
     * @param button .
     * @param x .
     * @param y .
     * @param isControl .
     * @param isAlt .
     * @param isShift .
     */
    public void mouseDown(final long hwnd, final int button, final int x,
            final int y, final boolean isControl, final boolean isAlt,
            final boolean isShift) {
        int message = 0;
        int flags = 0;
        switch (button) {
            case 0:
                message = WM_LBUTTONDOWN;
                break;
            case 1:
                message = WM_RBUTTONDOWN;
                break;
            case 2:
                message = WM_MBUTTONDOWN;
                break;
            default:
                message = WM_LBUTTONDOWN;
                break;
        }

        if (isControl) {
            flags |= MK_CONTROL;
        }
        if (isShift) {
            flags |= MK_SHIFT;
        }
        sendMessage(hwnd, message, flags, makeLParam(x, y).intValue());
    }

    /**
     * .
     * @param hwnd .
     * @param button .
     * @param x .
     * @param y .
     * @param isControl .
     * @param isAlt .
     * @param isShift .
     */
    public void mouseUp(final long hwnd, final int button, final int x,
            final int y, final boolean isControl, final boolean isAlt,
            final boolean isShift) {
        int message = 0;
        int flags = 0;
        switch (button) {
            case 0:
                message = WM_LBUTTONUP;
                break;
            case 1:
                message = WM_RBUTTONUP;
                break;
            case 2:
                message = WM_MBUTTONUP;
                break;
            default:
                message = WM_LBUTTONUP;
                break;
        }

        if (isControl) {
            flags |= MK_CONTROL;
        }
        if (isShift) {
            flags |= MK_SHIFT;
        }
        sendMessage(hwnd, message, flags, makeLParam(x, y).intValue());
    }

    /**
     * .
     * @param hwnd .
     * @param x .
     * @param y .
     * @param width .
     * @param height .
     */
    public void move(final long hwnd, final int x, final int y,
            final int width, final int height) {
        moveTo(hwnd, x, y);
        sizeTo(hwnd, width, height);
    }

    /**
     * .
     * @param hwnd .
     * @param x .
     * @param y .
     */
    public void moveTo(final long hwnd, final int x, final int y) {
        HWND handle = longToHwnd(hwnd);
        RECT rc = getRect(hwnd);
        getUser32().MoveWindow(
                handle,
                x,
                y,
                rc.right - rc.left,
                rc.bottom - rc.top,
                true);
    }

    /**
     * .
     * @param hwnd .
     */
    public void restore(final long hwnd) {
        HWND handle = longToHwnd(hwnd);
        getUser32().ShowWindow(handle, SW_SHOWNORMAL);
    }

    /**
     * .
     * @param hwnd .
     * @param width .
     * @param height .
     */
    public void sizeTo(
            final long hwnd,
            final int width,
            final int height) {
        HWND handle = longToHwnd(hwnd);
        RECT rc = getRect(hwnd);
        getUser32().MoveWindow(handle, rc.left, rc.top, width, height, true);
    }

    /**
     * .
     * @param hwnd .
     * @param command .
     * @param params .
     * @param workingDir .
     */
    public void start(
            final long hwnd,
            final String command,
            final String params,
            final String workingDir) {
        HWND handle = longToHwnd(hwnd);
        getShell32().ShellExecute(
                handle,
                null,
                command,
                params,
                workingDir,
                SW_SHOW);
    }
}
