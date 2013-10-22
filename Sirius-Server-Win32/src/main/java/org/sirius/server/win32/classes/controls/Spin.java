/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import java.rmi.RemoteException;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32lib.controls.Win32LibControlsClient;

/**
 * @author Myk Kolisnyk
 *
 */
public class Spin  extends Common {

    Win32LibControlsClient win32lib;    
    
    /**
     * 
     */
    public Spin() {
        win32lib = new Win32LibControlsClient();        
    }

    /**
     * @param hwnd
     * @return
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.spin.ISpinContractProxy#getLowerBound(java.lang.Integer)
     */
    public Double getLowerBound(Integer hwnd) throws RemoteException {
        return win32lib.spin().getLowerBound(hwnd);
    }

    /**
     * @param hwnd
     * @return
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.spin.ISpinContractProxy#getPosition(java.lang.Integer)
     */
    public Double getPosition(Integer hwnd) throws RemoteException {
        return win32lib.spin().getPosition(hwnd);
    }

    /**
     * @param hwnd
     * @return
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.spin.ISpinContractProxy#getText(java.lang.Integer)
     */
    public String getText(Integer hwnd) throws RemoteException {
        return win32lib.spin().getText(hwnd);
    }

    /**
     * @param hwnd
     * @return
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.spin.ISpinContractProxy#getUpperBound(java.lang.Integer)
     */
    public Double getUpperBound(Integer hwnd) throws RemoteException {
        return win32lib.spin().getUpperBound(hwnd);
    }

    /**
     * @param hwnd
     * @param pos
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.spin.ISpinContractProxy#setPosition(java.lang.Integer, java.lang.Double)
     */
    public void setPosition(Integer hwnd, Double pos) throws RemoteException {
        win32lib.spin().setPosition(hwnd, pos);
    }

    /**
     * @param hwnd
     * @param text
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.spin.ISpinContractProxy#setText(java.lang.Integer, java.lang.String)
     */
    public void setText(Integer hwnd, String text) throws RemoteException {
        win32lib.spin().setText(hwnd, text);
    }
}
