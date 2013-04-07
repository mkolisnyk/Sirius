/**
 * TabControl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.tabcontrol;

public interface TabControl extends java.rmi.Remote {
    public int getCurSel(long arg0) throws java.rmi.RemoteException;

    public void setCurSel(long arg0, int arg1) throws java.rmi.RemoteException;

    public int getItemCount(long arg0) throws java.rmi.RemoteException;

    public int getCurFocus(long arg0) throws java.rmi.RemoteException;

    public void setCurFocus(long arg0, int arg1)
            throws java.rmi.RemoteException;

    public int getRowCount(long arg0) throws java.rmi.RemoteException;

    public org.sirius.client.win32.core.controls.tabcontrol.TcITEM getItem(
            long arg0, int arg1) throws java.rmi.RemoteException;

    public org.sirius.client.win32.core.types.Rect getItemRect(long arg0,
            int arg1) throws java.rmi.RemoteException;

    public org.sirius.client.win32.core.controls.tabcontrol.TcHITTESTINFO hitTest(
            long arg0) throws java.rmi.RemoteException;
}
