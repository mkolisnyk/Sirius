/**
 * WindowServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.classes.window;

public class WindowServiceLocator extends org.apache.axis.client.Service
        implements org.sirius.client.win32.core.classes.window.WindowService {

    public WindowServiceLocator() {
    }

    public WindowServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WindowServiceLocator(java.lang.String wsdlLoc,
            javax.xml.namespace.QName sName)
            throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WindowPort
    private java.lang.String WindowPort_address = "http://localhost:21212/win32/window";

    public java.lang.String getWindowPortAddress() {
        return WindowPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WindowPortWSDDServiceName = "WindowPort";

    public java.lang.String getWindowPortWSDDServiceName() {
        return WindowPortWSDDServiceName;
    }

    public void setWindowPortWSDDServiceName(java.lang.String name) {
        WindowPortWSDDServiceName = name;
    }

    public org.sirius.client.win32.core.classes.window.Window getWindowPort()
            throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WindowPort_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWindowPort(endpoint);
    }

    public org.sirius.client.win32.core.classes.window.Window getWindowPort(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.client.win32.core.classes.window.WindowPortBindingStub _stub = new org.sirius.client.win32.core.classes.window.WindowPortBindingStub(
                    portAddress, this);
            _stub.setPortName(getWindowPortWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWindowPortEndpointAddress(java.lang.String address) {
        WindowPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface)
            throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.client.win32.core.classes.window.Window.class
                    .isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.client.win32.core.classes.window.WindowPortBindingStub _stub = new org.sirius.client.win32.core.classes.window.WindowPortBindingStub(
                        new java.net.URL(WindowPort_address), this);
                _stub.setPortName(getWindowPortWSDDServiceName());
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
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName,
            Class serviceEndpointInterface)
            throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WindowPort".equals(inputPortName)) {
            return getWindowPort();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "WindowService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName(
                    "http://classes.win32.server.sirius.org/", "WindowPort"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName,
            java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("WindowPort".equals(portName)) {
            setWindowPortEndpointAddress(address);
        } else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(
                    " Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(javax.xml.namespace.QName portName,
            java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
