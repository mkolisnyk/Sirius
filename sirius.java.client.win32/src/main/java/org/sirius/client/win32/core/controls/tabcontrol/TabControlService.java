/**
 * TabControlService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.tabcontrol;

public interface TabControlService extends javax.xml.rpc.Service {
    public java.lang.String getTabControlPortAddress();

    public org.sirius.client.win32.core.controls.tabcontrol.TabControl getTabControlPort()
            throws javax.xml.rpc.ServiceException;

    public org.sirius.client.win32.core.controls.tabcontrol.TabControl getTabControlPort(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
