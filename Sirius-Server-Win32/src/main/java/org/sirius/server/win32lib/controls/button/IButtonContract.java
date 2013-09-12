/**
 * IButtonContract.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.button;

public interface IButtonContract extends java.rmi.Remote {
    public void click(java.lang.Integer hwnd) throws java.rmi.RemoteException;
    public java.lang.Boolean isChecked(java.lang.Integer hwnd) throws java.rmi.RemoteException;
    public java.lang.Boolean isIntermediate(java.lang.Integer hwnd) throws java.rmi.RemoteException;
    public java.lang.Boolean isPressed(java.lang.Integer hwnd) throws java.rmi.RemoteException;
    public void setCheck(java.lang.Integer hwnd, java.lang.Boolean check) throws java.rmi.RemoteException;
}
