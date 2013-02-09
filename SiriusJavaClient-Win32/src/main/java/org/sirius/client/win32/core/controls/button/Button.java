/**
 * Button.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.button;

public interface Button extends java.rmi.Remote {
    public void setState(long arg0, int arg1) throws java.rmi.RemoteException;
    public int getState(long arg0) throws java.rmi.RemoteException;
    public int getCheck(long arg0) throws java.rmi.RemoteException;
    public void setCheck(long arg0, int arg1) throws java.rmi.RemoteException;
}
