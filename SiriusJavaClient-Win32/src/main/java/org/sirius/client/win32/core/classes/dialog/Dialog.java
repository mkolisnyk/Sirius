/**
 * Dialog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.classes.dialog;

public interface Dialog extends java.rmi.Remote {
    public int getDlgCtrlID(long arg0) throws java.rmi.RemoteException;
    public long getDlgItem(long arg0, int arg1) throws java.rmi.RemoteException;
    public long getDialogBaseUnits() throws java.rmi.RemoteException;
    public int getDlgItemInt(long arg0, int arg1, boolean arg2, boolean arg3) throws java.rmi.RemoteException;
    public java.lang.String getDlgItemTextA(long arg0, int arg1) throws java.rmi.RemoteException;
    public int isDlgButtonChecked(long arg0, int arg1) throws java.rmi.RemoteException;
    public boolean setDlgItemInt(long arg0, int arg1, int arg2, boolean arg3) throws java.rmi.RemoteException;
    public boolean setDlgItemText(long arg0, int arg1, java.lang.String arg2) throws java.rmi.RemoteException;
}
