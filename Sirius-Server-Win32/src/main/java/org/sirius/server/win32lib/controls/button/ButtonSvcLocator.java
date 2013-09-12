/**
 * ButtonSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.button;

public class ButtonSvcLocator extends org.apache.axis.client.Service implements org.sirius.server.win32lib.controls.button.ButtonSvc {

    public ButtonSvcLocator() {
    }


    public ButtonSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ButtonSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ButtonSvcPort
    private java.lang.String ButtonSvcPort_address = "http://localhost:8990/win32lib/buttonsvc";

    public java.lang.String getButtonSvcPortAddress() {
        return ButtonSvcPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ButtonSvcPortWSDDServiceName = "ButtonSvcPort";

    public java.lang.String getButtonSvcPortWSDDServiceName() {
        return ButtonSvcPortWSDDServiceName;
    }

    public void setButtonSvcPortWSDDServiceName(java.lang.String name) {
        ButtonSvcPortWSDDServiceName = name;
    }

    public org.sirius.server.win32lib.controls.button.IButtonContract getButtonSvcPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ButtonSvcPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getButtonSvcPort(endpoint);
    }

    public org.sirius.server.win32lib.controls.button.IButtonContract getButtonSvcPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.server.win32lib.controls.button.ButtonSvcPortStub _stub = new org.sirius.server.win32lib.controls.button.ButtonSvcPortStub(portAddress, this);
            _stub.setPortName(getButtonSvcPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setButtonSvcPortEndpointAddress(java.lang.String address) {
        ButtonSvcPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.server.win32lib.controls.button.IButtonContract.class.isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.server.win32lib.controls.button.ButtonSvcPortStub _stub = new org.sirius.server.win32lib.controls.button.ButtonSvcPortStub(new java.net.URL(ButtonSvcPort_address), this);
                _stub.setPortName(getButtonSvcPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ButtonSvcPort".equals(inputPortName)) {
            return getButtonSvcPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://button.controls.win32lib.server.sirius.org/", "ButtonSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://button.controls.win32lib.server.sirius.org/", "ButtonSvcPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ButtonSvcPort".equals(portName)) {
            setButtonSvcPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
