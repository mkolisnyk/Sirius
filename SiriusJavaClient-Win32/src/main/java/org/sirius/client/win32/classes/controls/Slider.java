/**
 * 
 */
package org.sirius.client.win32.classes.controls;

import java.rmi.RemoteException;

import org.sirius.client.win32.classes.Control;
import org.sirius.client.win32.classes.Window;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 *
 */
public class Slider extends Control {
    
    /**
     * @param parent
     * @param locator
     */
    public Slider(Window parent, Win32Locator locator) {
        super(parent, locator);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param arg0
     * @return
     * @throws RemoteException
     * @see org.sirius.client.win32.core.controls.slider.Sliderthis.getClient().core().slider()#getLowerBound(java.lang.Integer)
     */
    public Double getLowerBound(Integer arg0) throws RemoteException {
        return this.getClient().core().slider().getLowerBound(arg0);
    }

    /**
     * @param arg0
     * @return
     * @throws RemoteException
     * @see org.sirius.client.win32.core.controls.slider.Sliderthis.getClient().core().slider()#getUpperBound(java.lang.Integer)
     */
    public Double getUpperBound(Integer arg0) throws RemoteException {
        return this.getClient().core().slider().getUpperBound(arg0);
    }

    /**
     * @param arg0
     * @return
     * @throws RemoteException
     * @see org.sirius.client.win32.core.controls.slider.Sliderthis.getClient().core().slider()#getPosition(java.lang.Integer)
     */
    public Double getPosition(Integer arg0) throws RemoteException {
        return this.getClient().core().slider().getPosition(arg0);
    }

    /**
     * @param arg0
     * @param arg1
     * @throws RemoteException
     * @see org.sirius.client.win32.core.controls.slider.Sliderthis.getClient().core().slider()#setPosition(java.lang.Integer, java.lang.Double)
     */
    public void setPosition(Integer arg0, Double arg1) throws RemoteException {
        this.getClient().core().slider().setPosition(arg0, arg1);
    }
}
