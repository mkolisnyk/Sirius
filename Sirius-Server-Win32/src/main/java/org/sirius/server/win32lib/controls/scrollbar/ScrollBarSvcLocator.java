/**
 * ScrollBarSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.scrollbar;

public class ScrollBarSvcLocator extends org.apache.axis.client.Service implements org.sirius.server.win32lib.controls.scrollbar.ScrollBarSvc {

    public ScrollBarSvcLocator() {
    }


    public ScrollBarSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ScrollBarSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ScrollBarSvcPort
    private java.lang.String ScrollBarSvcPort_address = "http://localhost:31313/win32lib/scrollbarsvc";

    public java.lang.String getScrollBarSvcPortAddress() {
        return ScrollBarSvcPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ScrollBarSvcPortWSDDServiceName = "ScrollBarSvcPort";

    public java.lang.String getScrollBarSvcPortWSDDServiceName() {
        return ScrollBarSvcPortWSDDServiceName;
    }

    public void setScrollBarSvcPortWSDDServiceName(java.lang.String name) {
        ScrollBarSvcPortWSDDServiceName = name;
    }

    public org.sirius.server.win32lib.controls.scrollbar.IScrollBarContract getScrollBarSvcPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ScrollBarSvcPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getScrollBarSvcPort(endpoint);
    }

    public org.sirius.server.win32lib.controls.scrollbar.IScrollBarContract getScrollBarSvcPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.server.win32lib.controls.scrollbar.ScrollBarSvcPortStub _stub = new org.sirius.server.win32lib.controls.scrollbar.ScrollBarSvcPortStub(portAddress, this);
            _stub.setPortName(getScrollBarSvcPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setScrollBarSvcPortEndpointAddress(java.lang.String address) {
        ScrollBarSvcPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.server.win32lib.controls.scrollbar.IScrollBarContract.class.isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.server.win32lib.controls.scrollbar.ScrollBarSvcPortStub _stub = new org.sirius.server.win32lib.controls.scrollbar.ScrollBarSvcPortStub(new java.net.URL(ScrollBarSvcPort_address), this);
                _stub.setPortName(getScrollBarSvcPortWSDDServiceName());
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
        if ("ScrollBarSvcPort".equals(inputPortName)) {
            return getScrollBarSvcPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://scrollbar.controls.win32lib.server.sirius.org/", "ScrollBarSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://scrollbar.controls.win32lib.server.sirius.org/", "ScrollBarSvcPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ScrollBarSvcPort".equals(portName)) {
            setScrollBarSvcPortEndpointAddress(address);
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
