/**
 * ISpinContract.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.spin;

public interface ISpinContract extends java.rmi.Remote {
    public java.lang.Double getLowerBound(java.lang.Integer hwnd) throws java.rmi.RemoteException;
    public java.lang.Double getPosition(java.lang.Integer hwnd) throws java.rmi.RemoteException;
    public java.lang.String getText(java.lang.Integer hwnd) throws java.rmi.RemoteException;
    public java.lang.Double getUpperBound(java.lang.Integer hwnd) throws java.rmi.RemoteException;
    public void setPosition(java.lang.Integer hwnd, java.lang.Double pos) throws java.rmi.RemoteException;
    public void setText(java.lang.Integer hwnd, java.lang.String text) throws java.rmi.RemoteException;
}
