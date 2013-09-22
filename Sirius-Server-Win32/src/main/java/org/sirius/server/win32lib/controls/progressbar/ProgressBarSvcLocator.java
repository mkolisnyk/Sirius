/**
 * ProgressBarSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.progressbar;

public class ProgressBarSvcLocator extends org.apache.axis.client.Service
        implements
        org.sirius.server.win32lib.controls.progressbar.ProgressBarSvc {

    // Use to get a proxy class for ProgressBarSvcPort
    private java.lang.String  ProgressBarSvcPort_address        = "http://localhost:8990/win32lib/progressbarsvc";

    // The WSDD service name defaults to the port name.
    private java.lang.String  ProgressBarSvcPortWSDDServiceName = "ProgressBarSvcPort";

    private java.util.HashSet ports                             = null;

    public ProgressBarSvcLocator() {
    }

    public ProgressBarSvcLocator(final java.lang.String wsdlLoc,
            final javax.xml.namespace.QName sName)
            throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    public ProgressBarSvcLocator(
            final org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    @Override
    public java.rmi.Remote getPort(final Class serviceEndpointInterface)
            throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.server.win32lib.controls.progressbar.IProgressBarContract.class
                    .isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.server.win32lib.controls.progressbar.ProgressBarSvcPortStub _stub = new org.sirius.server.win32lib.controls.progressbar.ProgressBarSvcPortStub(
                        new java.net.URL(ProgressBarSvcPort_address), this);
                _stub.setPortName(getProgressBarSvcPortWSDDServiceName());
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
        if ("ProgressBarSvcPort".equals(inputPortName)) {
            return getProgressBarSvcPort();
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
                    "http://progressbar.controls.win32lib.server.sirius.org/",
                    "ProgressBarSvcPort"));
        }
        return ports.iterator();
    }

    @Override
    public org.sirius.server.win32lib.controls.progressbar.IProgressBarContract getProgressBarSvcPort()
            throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProgressBarSvcPort_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProgressBarSvcPort(endpoint);
    }

    @Override
    public org.sirius.server.win32lib.controls.progressbar.IProgressBarContract getProgressBarSvcPort(
            final java.net.URL portAddress)
            throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.server.win32lib.controls.progressbar.ProgressBarSvcPortStub _stub = new org.sirius.server.win32lib.controls.progressbar.ProgressBarSvcPortStub(
                    portAddress, this);
            _stub.setPortName(getProgressBarSvcPortWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    @Override
    public java.lang.String getProgressBarSvcPortAddress() {
        return ProgressBarSvcPort_address;
    }

    public java.lang.String getProgressBarSvcPortWSDDServiceName() {
        return ProgressBarSvcPortWSDDServiceName;
    }

    @Override
    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName(
                "http://progressbar.controls.win32lib.server.sirius.org/",
                "ProgressBarSvc");
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(final java.lang.String portName,
            final java.lang.String address)
            throws javax.xml.rpc.ServiceException {

        if ("ProgressBarSvcPort".equals(portName)) {
            setProgressBarSvcPortEndpointAddress(address);
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

    public void setProgressBarSvcPortEndpointAddress(
            final java.lang.String address) {
        ProgressBarSvcPort_address = address;
    }

    public void setProgressBarSvcPortWSDDServiceName(final java.lang.String name) {
        ProgressBarSvcPortWSDDServiceName = name;
    }

}
