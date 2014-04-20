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
 * Contains common interfaces and methods for Win32 objects interaction including JNA interfaces
 * @author Myk Kolisnyk
 */
public class Common implements IICCConsts {

    /**
     * Constant containing the size of shift between low and high word.
     */
    private final int wordShift = 16;

    /**
     * Provides interface for Shell32 functionality.
     */
    private Shell32     shell32   = Shell32.INSTANCE;
    /**
     * Provides interface for User32 JNA functionality.
     */
    private User32Ext   user32    = User32Ext.INSTANCE;
    /**
     * Provides interface for Dlg32 JNA functionality. 
     */
    private DlgWin32API dlg32     = DlgWin32API.INSTANCE;
    /**
     * Provides interface to Kernel32 functionality.
     */
    private Kernel32Ext kernel32  = Kernel32Ext.INSTANCE;
    /**
     * Provides interface to CommCtl32 functionality.
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
     * Base constructor.
     */
    public Common() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Performs initialization of common controls. This call is needed to enable interaction with extended
     * set of controls like List View, Tree View, Header etc.
     */
    public final void initCommonControls() {

        INITCOMMONCONTROLSEX lpInitCtrls = new INITCOMMONCONTROLSEX();
        lpInitCtrls.dwICC = IICCConsts.ICC_ALL;
        commCtl32.InitCommonControlsEx(lpInitCtrls);
    }

    /**
     * Converts menu handle represented as long into the HMENU structure.
     * @param input the handle value to convert.
     * @return converted HMENU value.
     */
    public final HMENU longToHmenu(final long input) {
        HMENU handle = new HMENU();
        handle.setPointer(Pointer.createConstant(input));
        return handle;
    }

    /**
     * Converts window handle represented as long into the HWND structure.
     * @param input the handle value to convert.
     * @return converted HWND value.
     */
    public final HWND longToHwnd(final long input) {
        HWND handle = new HWND();
        handle.setPointer(Pointer.createConstant(input));
        return handle;
    }

    /**
     * Makes the long value based on 2 values representing low and high words of the final expression.
     * @param a low word.
     * @param b high word.
     * @return the final long where <b>a</b> is the low word and <b>b</b> is high word.
     */
    public final long makeLong(final int a, final int b) {
        return a | (b << wordShift);
    }

    /**
     * Converts 2 integer values representing low and high words into LPARAM structure.
     * @param a low word.
     * @param b high word.
     * @return the resultant LPARAM value where <b>a</b> is the low word and <b>b</b> is high word.
     */
    public final LPARAM makeLParam(final int a, final int b) {
        LPARAM lParam = new LPARAM(makeLong(a, b));
        return lParam;
    }

    /**
     * Converts 2 integer values representing low and high words into WPARAM structure.
     * @param a low word.
     * @param b high word.
     * @return the resultant WPARAM value where <b>a</b> is the low word and <b>b</b> is high word.
     */
    public final WPARAM makeWParam(final int a, final int b) {
        WPARAM wParam = new WPARAM(makeLong(a, b));
        return wParam;
    }

    /**
     * Performs asynchronous message sending. Unlike {@link #sendMessage(long, int, int, int)} it
     * simply sends the command and doesn't wait for the completion. Use this method while 
     * interacting with elements which activate modal dialogs.
     * @param hwnd window handle to send message to.
     * @param msg the message code to send.
     * @param wparam the WPARAM value to pass to the message call.
     * @param lparam the LPARAM value to pass to the message call.
     */
    public final void postMessage(final long hwnd, final int msg,
            final int wparam, final int lparam) {
        user32.PostMessage(longToHwnd(hwnd), msg, new WPARAM(wparam),
                new LPARAM(lparam));
    }

    /**
     * Performs synchronous message sending. Unlike {@link #postMessage(long, int, int, int)} it 
     * waits for command to complete.
     * @param hwnd window handle to send message to.
     * @param msg the message code to send.
     * @param wparam the WPARAM value to pass to the message call.
     * @param lparam the LPARAM value to pass to the message call.
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
