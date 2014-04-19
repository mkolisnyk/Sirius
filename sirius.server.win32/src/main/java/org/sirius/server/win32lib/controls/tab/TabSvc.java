/**
 * TabSvc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.tab;

public interface TabSvc extends javax.xml.rpc.Service {
    public org.sirius.server.win32lib.controls.tab.ITabContract getTabSvcPort()
            throws javax.xml.rpc.ServiceException;

    public org.sirius.server.win32lib.controls.tab.ITabContract getTabSvcPort(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException;

    public java.lang.String getTabSvcPortAddress();
}
