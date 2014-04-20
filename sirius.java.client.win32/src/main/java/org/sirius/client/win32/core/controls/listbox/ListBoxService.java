/**
 * ListBoxService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.listbox;

public interface ListBoxService extends javax.xml.rpc.Service {
    public java.lang.String getListBoxPortAddress();

    public org.sirius.client.win32.core.controls.listbox.ListBox getListBoxPort()
            throws javax.xml.rpc.ServiceException;

    public org.sirius.client.win32.core.controls.listbox.ListBox getListBoxPort(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
