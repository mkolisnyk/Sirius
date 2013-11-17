/**
 * ListBoxSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.listbox;

public class ListBoxSvcLocator extends org.apache.axis.client.Service implements
        org.sirius.server.win32lib.controls.listbox.ListBoxSvc {

    // Use to get a proxy class for ListBoxSvcPort
    private java.lang.String  ListBoxSvcPort_address        = "http://localhost:31313/win32lib/listboxsvc";

    // The WSDD service name defaults to the port name.
    private java.lang.String  ListBoxSvcPortWSDDServiceName = "ListBoxSvcPort";

    private java.util.HashSet ports                         = null;

    public ListBoxSvcLocator() {
    }

    public ListBoxSvcLocator(final java.lang.String wsdlLoc,
            final javax.xml.namespace.QName sName)
            throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    public ListBoxSvcLocator(final org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    @Override
    public org.sirius.server.win32lib.controls.listbox.IListBoxContract getListBoxSvcPort()
            throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ListBoxSvcPort_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getListBoxSvcPort(endpoint);
    }

    @Override
    public org.sirius.server.win32lib.controls.listbox.IListBoxContract getListBoxSvcPort(
            final java.net.URL portAddress)
            throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.server.win32lib.controls.listbox.ListBoxSvcPortStub _stub = new org.sirius.server.win32lib.controls.listbox.ListBoxSvcPortStub(
                    portAddress, this);
            _stub.setPortName(getListBoxSvcPortWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    @Override
    public java.lang.String getListBoxSvcPortAddress() {
        return ListBoxSvcPort_address;
    }

    public java.lang.String getListBoxSvcPortWSDDServiceName() {
        return ListBoxSvcPortWSDDServiceName;
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    @Override
    public java.rmi.Remote getPort(final Class serviceEndpointInterface)
            throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.server.win32lib.controls.listbox.IListBoxContract.class
                    .isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.server.win32lib.controls.listbox.ListBoxSvcPortStub _stub = new org.sirius.server.win32lib.controls.listbox.ListBoxSvcPortStub(
                        new java.net.URL(ListBoxSvcPort_address), this);
                _stub.setPortName(getListBoxSvcPortWSDDServiceName());
                return _stub;
            }
        } catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException(
                "There is no stub implementation for the interface:  "
                        + (serviceEndpointInterface == null ? "null"
                                : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    @Override
    public java.rmi.Remote getPort(final javax.xml.namespace.QName portName,
            final Class serviceEndpointInterface)
            throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ListBoxSvcPort".equals(inputPortName)) {
            return getListBoxSvcPort();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    @Override
    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName(
                    "http://listbox.controls.win32lib.server.sirius.org/",
                    "ListBoxSvcPort"));
        }
        return ports.iterator();
    }

    @Override
    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "ListBoxSvc");
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(final java.lang.String portName,
            final java.lang.String address)
            throws javax.xml.rpc.ServiceException {

        if ("ListBoxSvcPort".equals(portName)) {
            setListBoxSvcPortEndpointAddress(address);
        } else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(
                    " Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(final javax.xml.namespace.QName portName,
            final java.lang.String address)
            throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

    public void setListBoxSvcPortEndpointAddress(final java.lang.String address) {
        ListBoxSvcPort_address = address;
    }

    public void setListBoxSvcPortWSDDServiceName(final java.lang.String name) {
        ListBoxSvcPortWSDDServiceName = name;
    }

}
