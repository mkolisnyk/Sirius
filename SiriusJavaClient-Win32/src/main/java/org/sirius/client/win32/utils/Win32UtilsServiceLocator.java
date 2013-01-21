/**
 * Win32UtilsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.utils;

public class Win32UtilsServiceLocator extends org.apache.axis.client.Service implements org.sirius.client.win32.utils.Win32UtilsService {

    public Win32UtilsServiceLocator() {
    }


    public Win32UtilsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Win32UtilsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Win32UtilsPort
    private java.lang.String Win32UtilsPort_address = "http://localhost:21212/win32/utils";

    public java.lang.String getWin32UtilsPortAddress() {
        return Win32UtilsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Win32UtilsPortWSDDServiceName = "Win32UtilsPort";

    public java.lang.String getWin32UtilsPortWSDDServiceName() {
        return Win32UtilsPortWSDDServiceName;
    }

    public void setWin32UtilsPortWSDDServiceName(java.lang.String name) {
        Win32UtilsPortWSDDServiceName = name;
    }

    public org.sirius.client.win32.utils.Win32Utils getWin32UtilsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Win32UtilsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWin32UtilsPort(endpoint);
    }

    public org.sirius.client.win32.utils.Win32Utils getWin32UtilsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.client.win32.utils.Win32UtilsPortBindingStub _stub = new org.sirius.client.win32.utils.Win32UtilsPortBindingStub(portAddress, this);
            _stub.setPortName(getWin32UtilsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWin32UtilsPortEndpointAddress(java.lang.String address) {
        Win32UtilsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.client.win32.utils.Win32Utils.class.isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.client.win32.utils.Win32UtilsPortBindingStub _stub = new org.sirius.client.win32.utils.Win32UtilsPortBindingStub(new java.net.URL(Win32UtilsPort_address), this);
                _stub.setPortName(getWin32UtilsPortWSDDServiceName());
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
        if ("Win32UtilsPort".equals(inputPortName)) {
            return getWin32UtilsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://win32.server.sirius.org/", "Win32UtilsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://win32.server.sirius.org/", "Win32UtilsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Win32UtilsPort".equals(portName)) {
            setWin32UtilsPortEndpointAddress(address);
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
