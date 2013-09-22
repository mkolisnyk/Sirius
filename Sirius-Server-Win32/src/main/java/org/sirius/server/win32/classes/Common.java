/**
 * .
 */
package org.sirius.server.win32.classes;

import org.sirius.server.win32.constants.IICCConsts;
import org.sirius.server.win32.core.CommCtl;
import org.sirius.server.win32.core.CommCtl.INITCOMMONCONTROLSEX;
import org.sirius.server.win32.core.DlgWin32API;
import org.sirius.server.win32.core.Kernel32Ext;
import org.sirius.server.win32.core.User32Ext;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Shell32;
import com.sun.jna.platform.win32.WinDef.HMENU;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.WPARAM;

/**
 * @author Myk Kolisnyk
 * .
 */
public class Common implements IICCConsts {

    /**
     * .
     */
    private final int wordShift = 16;

    /**
     * .
     */
    private Shell32     shell32   = Shell32.INSTANCE;
    /**
     * .
     */
    private User32Ext   user32    = User32Ext.INSTANCE;
    /**
     * .
     */
    private DlgWin32API dlg32     = DlgWin32API.INSTANCE;
    /**
     * .
     */
    private Kernel32Ext kernel32  = Kernel32Ext.INSTANCE;
    /**
     * .
     */
    private CommCtl     commCtl32 = CommCtl.INSTANCE;

    /**
     * @return the shell32
     */
    public final Shell32 getShell32() {
        return shell32;
    }

    /**
     * @return the user32
     */
    public final User32Ext getUser32() {
        return user32;
    }

    /**
     * @return the dlg32
     */
    public final DlgWin32API getDlg32() {
        return dlg32;
    }

    /**
     * @return the kernel32
     */
    public final Kernel32Ext getKernel32() {
        return kernel32;
    }

    /**
     * @return the commCtl32
     */
    public final CommCtl getCommCtl32() {
        return commCtl32;
    }

    /**
     * .
     */
    public Common() {
        // TODO Auto-generated constructor stub
    }

    /**
     * .
     */
    public final void initCommonControls() {

        INITCOMMONCONTROLSEX lpInitCtrls = new INITCOMMONCONTROLSEX();
        lpInitCtrls.dwICC = IICCConsts.ICC_ALL;
        commCtl32.InitCommonControlsEx(lpInitCtrls);
    }

    /**
     * .
     * @param input .
     * @return .
     */
    public final HMENU longToHmenu(final long input) {
        HMENU handle = new HMENU();
        handle.setPointer(Pointer.createConstant(input));
        return handle;
    }

    /**
     * .
     * @param input .
     * @return .
     */
    public final HWND longToHwnd(final long input) {
        HWND handle = new HWND();
        handle.setPointer(Pointer.createConstant(input));
        return handle;
    }

    /**
     * .
     * @param a .
     * @param b .
     * @return .
     */
    public final long makeLong(final int a, final int b) {
        return a | (b << wordShift);
    }

    /**
     * .
     * @param a .
     * @param b .
     * @return .
     */
    public final LPARAM makeLParam(final int a, final int b) {
        LPARAM lParam = new LPARAM(makeLong(a, b));
        return lParam;
    }

    /**
     * .
     * @param a .
     * @param b .
     * @return .
     */
    public final WPARAM makeWParam(final int a, final int b) {
        WPARAM wParam = new WPARAM(makeLong(a, b));
        return wParam;
    }

    /**
     * .
     * @param hwnd .
     * @param msg .
     * @param wparam .
     * @param lparam .
     */
    public final void postMessage(final long hwnd, final int msg,
            final int wparam, final int lparam) {
        user32.PostMessage(longToHwnd(hwnd), msg, new WPARAM(wparam),
                new LPARAM(lparam));
    }

    /**
     * .
     * @param hwnd .
     * @param msg .
     * @param wparam .
     * @param lparam .
     * @return .
     */
    public final int sendMessage(
            final long hwnd,
            final int msg,
            final int wparam,
            final int lparam) {
        return user32.SendMessage(longToHwnd(hwnd), msg, new WPARAM(wparam),
                new LPARAM(lparam));
    }
}
