/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import java.rmi.RemoteException;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32lib.controls.Win32LibControlsClient;
import org.sirius.server.win32lib.controls.slider.ISliderContractProxy;

/**
 * @author Myk Kolisnyk
 *
 */
@WebService
public class Slider extends Common {
    
    private final Win32LibControlsClient win32lib;  
    
    /**
     * 
     */
    public Slider() {
        win32lib = new Win32LibControlsClient();
    }

    /**
     * @param hwnd
     * @return
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.slider.ISliderContractProxy#getLowerBound(java.lang.Integer)
     */
    public Double getLowerBound(Integer hwnd) throws RemoteException {
        return win32lib.slider().getLowerBound(hwnd);
    }

    /**
     * @param hwnd
     * @return
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.slider.ISliderContractProxy#getPosition(java.lang.Integer)
     */
    public Double getPosition(Integer hwnd) throws RemoteException {
        return win32lib.slider().getPosition(hwnd);
    }

    /**
     * @param hwnd
     * @return
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.slider.ISliderContractProxy#getUpperBound(java.lang.Integer)
     */
    public Double getUpperBound(Integer hwnd) throws RemoteException {
        return win32lib.slider().getUpperBound(hwnd);
    }

    /**
     * @param hwnd
     * @param pos
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.slider.ISliderContractProxy#setPosition(java.lang.Integer, java.lang.Double)
     */
    public void setPosition(Integer hwnd, Double pos) throws RemoteException {
        win32lib.slider().setPosition(hwnd, pos);
    }

}
