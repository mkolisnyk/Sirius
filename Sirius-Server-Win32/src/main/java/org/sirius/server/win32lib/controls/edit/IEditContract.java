/**
 * IEditContract.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.edit;

public interface IEditContract extends java.rmi.Remote {
    public java.lang.String getText(java.lang.Integer hwnd) throws java.rmi.RemoteException;
    public void setText(java.lang.Integer hwnd, java.lang.String text) throws java.rmi.RemoteException;
    public void typeText(java.lang.Integer hwnd, java.lang.String text) throws java.rmi.RemoteException;
    public void setCursorPosition(java.lang.Integer hwnd, java.lang.Integer col, java.lang.Integer row) throws java.rmi.RemoteException;
    public void setSelection(java.lang.Integer hwnd, java.lang.Integer scol, java.lang.Integer srow, java.lang.Integer ecol, java.lang.Integer erow) throws java.rmi.RemoteException;
    public java.lang.String getSelectedText(java.lang.Integer hwnd) throws java.rmi.RemoteException;
}
