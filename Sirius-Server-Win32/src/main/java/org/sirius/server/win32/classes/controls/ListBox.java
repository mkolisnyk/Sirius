/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import java.rmi.RemoteException;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32.constants.IListBoxConsts;
import org.sirius.server.win32lib.controls.Win32LibControlsClient;
import org.sirius.server.win32lib.controls.listbox.IListBoxContract;
import org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.WPARAM;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class ListBox extends Common implements IListBoxConsts {

    
    Win32LibControlsClient win32lib;
    
    /**
	 * 
	 */
    public ListBox() {
        // TODO Auto-generated constructor stub
        win32lib = new Win32LibControlsClient();
    }

    /**
     * @param hwnd
     * @param index
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#addSelectionByIndex(java.lang.Integer, java.lang.Integer)
     */
    public void addSelectionByIndex(Integer hwnd, Integer index)
            throws RemoteException {
        win32lib.listBox().addSelectionByIndex(hwnd, index);
    }

    /**
     * @param hwnd
     * @param item
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#addSelectionByName(java.lang.Integer, java.lang.String)
     */
    public void addSelectionByName(Integer hwnd, String item)
            throws RemoteException {
        win32lib.listBox().addSelectionByName(hwnd, item);
    }

    /**
     * @param hwnd
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#deselectAll(java.lang.Integer)
     */
    public void deselectAll(Integer hwnd) throws RemoteException {
        win32lib.listBox().deselectAll(hwnd);
    }

    /**
     * @return
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#getEndpoint()
     */
    public String getEndpoint() {
        return win32lib.listBox().getEndpoint();
    }

    /**
     * @return
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#getIListBoxContract()
     */
    public IListBoxContract getIListBoxContract() {
        return win32lib.listBox().getIListBoxContract();
    }

    /**
     * @param hwnd
     * @return
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#getItemNames(java.lang.Integer)
     */
    public String[] getItemNames(Integer hwnd) throws RemoteException {
        return win32lib.listBox().getItemNames(hwnd);
    }

    /**
     * @param hwnd
     * @return
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#getItemsCount(java.lang.Integer)
     */
    public Integer getItemsCount(Integer hwnd) throws RemoteException {
        return win32lib.listBox().getItemsCount(hwnd);
    }

    /**
     * @param hwnd
     * @return
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#getSelectedIndex(java.lang.Integer)
     */
    public Integer getSelectedIndex(Integer hwnd) throws RemoteException {
        return win32lib.listBox().getSelectedIndex(hwnd);
    }

    /**
     * @param obj
     * @return
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object obj) {
        return win32lib.listBox().equals(obj);
    }

    /**
     * @param hwnd
     * @return
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#getSelectedItem(java.lang.Integer)
     */
    public String getSelectedItem(Integer hwnd) throws RemoteException {
        return win32lib.listBox().getSelectedItem(hwnd);
    }

    /**
     * @param hwnd
     * @return
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#getSelectedItems(java.lang.Integer)
     */
    public String[] getSelectedItems(Integer hwnd) throws RemoteException {
        return win32lib.listBox().getSelectedItems(hwnd);
    }

    /**
     * @param hwnd
     * @param index
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#removeSelectionByIndex(java.lang.Integer, java.lang.Integer)
     */
    public void removeSelectionByIndex(Integer hwnd, Integer index)
            throws RemoteException {
        win32lib.listBox().removeSelectionByIndex(hwnd, index);
    }

    /**
     * @param hwnd
     * @param item
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#removeSelectionByName(java.lang.Integer, java.lang.String)
     */
    public void removeSelectionByName(Integer hwnd, String item)
            throws RemoteException {
        win32lib.listBox().removeSelectionByName(hwnd, item);
    }

    /**
     * @param hwnd
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#selectAll(java.lang.Integer)
     */
    public void selectAll(Integer hwnd) throws RemoteException {
        win32lib.listBox().selectAll(hwnd);
    }

    /**
     * @param hwnd
     * @param index
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#selectByIndex(java.lang.Integer, java.lang.Integer)
     */
    public void selectByIndex(Integer hwnd, Integer index)
            throws RemoteException {
        win32lib.listBox().selectByIndex(hwnd, index);
    }

    /**
     * @param hwnd
     * @param item
     * @throws RemoteException
     * @see org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy#selectByName(java.lang.Integer, java.lang.String)
     */
    public void selectByName(Integer hwnd, String item) throws RemoteException {
        win32lib.listBox().selectByName(hwnd, item);
    }
}
