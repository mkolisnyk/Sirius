/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32.constants.IButtonConsts;

import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.WPARAM;

/**
 * @author Myk Kolisnyk
 * .
 */
@WebService
public class Button extends Common implements IButtonConsts {

    /**
	 * .
	 */
    public Button() {
        // TODO Auto-generated constructor stub
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getCheck(final long hwndCtl) {
        HWND handle = this.longToHwnd(hwndCtl);
        return getUser32().SendMessage(handle, BM_GETCHECK, new WPARAM(0),
                new LPARAM(0));
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getState(final long hwndCtl) {
        HWND handle = this.longToHwnd(hwndCtl);
        return getUser32().SendMessage(handle, BM_GETSTATE, new WPARAM(0),
                new LPARAM(0));
    }

    
    /*int BST_CHECKED       = 1;
    int BST_INDETERMINATE = 2;
    int BST_UNCHECKED     = 0;
    int BST_FOCUS         = 8;
    int BST_PUSHED        = 4;*/
    
    public final boolean isChecked(final long hwndCtl){
        return (getState(hwndCtl) & BST_CHECKED) == BST_CHECKED; 
    }
    
    public final boolean isIntermediate(final long hwndCtl){
        return (getState(hwndCtl) & BST_INDETERMINATE) == BST_INDETERMINATE;
    }
    
    public final boolean isPushed(final long hwndCtl){
        return (getState(hwndCtl) & BST_PUSHED) == BST_PUSHED;
    }

    /**
     * .
     * @param hwndCtl .
     * @param check .
     */
    public final void setCheck(final long hwndCtl, final int check) {
        HWND handle = this.longToHwnd(hwndCtl);
        getUser32().SendMessage(handle, BM_SETCHECK, new WPARAM(check),
                new LPARAM(0));
    }

    /**
     * .
     * @param hwndCtl .
     * @param state .
     */
    public final void setState(final long hwndCtl, final int state) {
        HWND handle = this.longToHwnd(hwndCtl);
        getUser32().SendMessage(handle, BM_SETSTATE, new WPARAM(state),
                new LPARAM(0));
    }
}
