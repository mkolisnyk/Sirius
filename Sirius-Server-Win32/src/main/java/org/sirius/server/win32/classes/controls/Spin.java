/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import java.rmi.RemoteException;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32lib.controls.Win32LibControlsClient;

/**
 * @author Myk Kolisnyk
 *
 */
@WebService
public class Spin  extends Common {

    private final Win32LibControlsClient win32lib;    
    
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
        return String.valueOf(win32lib.spin().getValue(hwnd));
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
        win32lib.spin().setValue(hwnd, new Double(text));
    }
    
    public Double getSmallStep(Integer hwnd) throws RemoteException{
        return win32lib.spin().getSmallStep(hwnd);
    }

    public Double getLargeStep(Integer hwnd) throws RemoteException{
        return win32lib.spin().getLargeStep(hwnd);
    }
    
    public void increment(Integer hwnd) throws RemoteException{
        double position = this.getPosition(hwnd);
        double step = this.getSmallStep(hwnd);
        double min = this.getLowerBound(hwnd);
        double max = this.getUpperBound(hwnd);
        
        if(position + step > max ){
            this.setPosition(hwnd, min);
        }
        else {
            this.setPosition(hwnd, position + step);
        }
    }
    
    public void decrement(Integer hwnd) throws RemoteException{
        double position = this.getPosition(hwnd);
        double step = this.getSmallStep(hwnd);
        double min = this.getLowerBound(hwnd);
        double max = this.getUpperBound(hwnd);
        
        if(position - step < min ){
            this.setPosition(hwnd, max);
        }
        else {
            this.setPosition(hwnd, position - step);
        }
    }
}
