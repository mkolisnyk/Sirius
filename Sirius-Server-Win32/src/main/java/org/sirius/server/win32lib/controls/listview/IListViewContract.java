/**
 * IListViewContract.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.listview;

public interface IListViewContract extends java.rmi.Remote {
    public void addSelectionByIndex(java.lang.Integer hwnd,
            java.lang.Integer index) throws java.rmi.RemoteException;

    public void addSelectionByName(java.lang.Integer hwnd, java.lang.String item)
            throws java.rmi.RemoteException;

    public void deselectAll(java.lang.Integer hwnd)
            throws java.rmi.RemoteException;

    public java.lang.String[] getItemNames(java.lang.Integer hwnd)
            throws java.rmi.RemoteException;

    public java.lang.Integer getItemsCount(java.lang.Integer hwnd)
            throws java.rmi.RemoteException;

    public java.lang.Integer getSelectedIndex(java.lang.Integer hwnd)
            throws java.rmi.RemoteException;

    public java.lang.String getSelectedItem(java.lang.Integer hwnd)
            throws java.rmi.RemoteException;

    public java.lang.String[] getSelectedItems(java.lang.Integer hwnd)
            throws java.rmi.RemoteException;

    public void removeSelectionByIndex(java.lang.Integer hwnd,
            java.lang.Integer index) throws java.rmi.RemoteException;

    public void removeSelectionByName(java.lang.Integer hwnd,
            java.lang.String item) throws java.rmi.RemoteException;

    public void selectAll(java.lang.Integer hwnd)
            throws java.rmi.RemoteException;

    public void selectByIndex(java.lang.Integer hwnd, java.lang.Integer index)
            throws java.rmi.RemoteException;

    public void selectByName(java.lang.Integer hwnd, java.lang.String item)
            throws java.rmi.RemoteException;
}
