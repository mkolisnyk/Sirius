/**
 * ButtonSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.button;

public class ButtonSvcLocator extends org.apache.axis.client.Service implements
        org.sirius.server.win32lib.controls.button.ButtonSvc {

    // Use to get a proxy class for ButtonSvcPort
    private java.lang.String  ButtonSvcPort_address        = "http://localhost:8990/win32lib/buttonsvc";

    // The WSDD service name defaults to the port name.
    private java.lang.String  ButtonSvcPortWSDDServiceName = "ButtonSvcPort";

    private java.util.HashSet ports                        = null;

    public ButtonSvcLocator() {
    }

    public ButtonSvcLocator(final java.lang.String wsdlLoc,
            final javax.xml.namespace.QName sName)
            throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    public ButtonSvcLocator(final org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    @Override
    public org.sirius.server.win32lib.controls.button.IButtonContract getButtonSvcPort()
            throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ButtonSvcPort_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getButtonSvcPort(endpoint);
    }

    @Override
    public org.sirius.server.win32lib.controls.button.IButtonContract getButtonSvcPort(
            final java.net.URL portAddress)
            throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.server.win32lib.controls.button.ButtonSvcPortStub _stub = new org.sirius.server.win32lib.controls.button.ButtonSvcPortStub(
                    portAddress, this);
            _stub.setPortName(getButtonSvcPortWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    @Override
    public java.lang.String getButtonSvcPortAddress() {
        return ButtonSvcPort_address;
    }

    public java.lang.String getButtonSvcPortWSDDServiceName() {
        return ButtonSvcPortWSDDServiceName;
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    @Override
    public java.rmi.Remote getPort(final Class serviceEndpointInterface)
            throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.server.win32lib.controls.button.IButtonContract.class
                    .isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.server.win32lib.controls.button.ButtonSvcPortStub _stub = new org.sirius.server.win32lib.controls.button.ButtonSvcPortStub(
                        new java.net.URL(ButtonSvcPort_address), this);
                _stub.setPortName(getButtonSvcPortWSDDServiceName());
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
        if ("ButtonSvcPort".equals(inputPortName)) {
            return getButtonSvcPort();
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
                    "http://button.controls.win32lib.server.sirius.org/",
                    "ButtonSvcPort"));
        }
        return ports.iterator();
    }

    @Override
    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName(
                "http://button.controls.win32lib.server.sirius.org/",
                "ButtonSvc");
    }

    public void setButtonSvcPortEndpointAddress(final java.lang.String address) {
        ButtonSvcPort_address = address;
    }

    public void setButtonSvcPortWSDDServiceName(final java.lang.String name) {
        ButtonSvcPortWSDDServiceName = name;
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(final java.lang.String portName,
            final java.lang.String address)
            throws javax.xml.rpc.ServiceException {

        if ("ButtonSvcPort".equals(portName)) {
            setButtonSvcPortEndpointAddress(address);
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

}
