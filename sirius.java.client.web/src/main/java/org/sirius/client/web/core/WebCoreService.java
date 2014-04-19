/**
 * WebCoreService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.web.core;

public interface WebCoreService extends javax.xml.rpc.Service {
    public java.lang.String getWebCorePortAddress();

    public org.sirius.client.web.core.WebCore getWebCorePort()
            throws javax.xml.rpc.ServiceException;

    public org.sirius.client.web.core.WebCore getWebCorePort(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
