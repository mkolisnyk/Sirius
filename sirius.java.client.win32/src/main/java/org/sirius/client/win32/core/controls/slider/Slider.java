/**
 * Slider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.slider;

public interface Slider extends java.rmi.Remote {
    public java.lang.Double getLowerBound(java.lang.Integer arg0) throws java.rmi.RemoteException;
    public java.lang.Double getUpperBound(java.lang.Integer arg0) throws java.rmi.RemoteException;
    public java.lang.Double getPosition(java.lang.Integer arg0) throws java.rmi.RemoteException;
    public void setPosition(java.lang.Integer arg0, java.lang.Double arg1) throws java.rmi.RemoteException;
}
