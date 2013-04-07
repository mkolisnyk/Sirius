/**
 * ButtonService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.button;

public interface ButtonService extends javax.xml.rpc.Service {
    public java.lang.String getButtonPortAddress();

    public org.sirius.client.win32.core.controls.button.Button getButtonPort()
            throws javax.xml.rpc.ServiceException;

    public org.sirius.client.win32.core.controls.button.Button getButtonPort(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
