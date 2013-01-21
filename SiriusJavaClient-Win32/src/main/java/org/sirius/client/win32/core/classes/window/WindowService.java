/**
 * WindowService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.classes.window;

public interface WindowService extends javax.xml.rpc.Service {
    public java.lang.String getWindowPortAddress();

    public org.sirius.client.win32.core.classes.window.Window getWindowPort() throws javax.xml.rpc.ServiceException;

    public org.sirius.client.win32.core.classes.window.Window getWindowPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
