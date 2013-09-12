/**
 * TabSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.tab;

public class TabSvcLocator extends org.apache.axis.client.Service implements org.sirius.server.win32lib.controls.tab.TabSvc {

    public TabSvcLocator() {
    }


    public TabSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TabSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TabSvcPort
    private java.lang.String TabSvcPort_address = "http://localhost:8990/win32lib/tabsvc";

    public java.lang.String getTabSvcPortAddress() {
        return TabSvcPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TabSvcPortWSDDServiceName = "TabSvcPort";

    public java.lang.String getTabSvcPortWSDDServiceName() {
        return TabSvcPortWSDDServiceName;
    }

    public void setTabSvcPortWSDDServiceName(java.lang.String name) {
        TabSvcPortWSDDServiceName = name;
    }

    public org.sirius.server.win32lib.controls.tab.ITabContract getTabSvcPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TabSvcPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTabSvcPort(endpoint);
    }

    public org.sirius.server.win32lib.controls.tab.ITabContract getTabSvcPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.server.win32lib.controls.tab.TabSvcPortStub _stub = new org.sirius.server.win32lib.controls.tab.TabSvcPortStub(portAddress, this);
            _stub.setPortName(getTabSvcPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTabSvcPortEndpointAddress(java.lang.String address) {
        TabSvcPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.server.win32lib.controls.tab.ITabContract.class.isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.server.win32lib.controls.tab.TabSvcPortStub _stub = new org.sirius.server.win32lib.controls.tab.TabSvcPortStub(new java.net.URL(TabSvcPort_address), this);
                _stub.setPortName(getTabSvcPortWSDDServiceName());
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
        if ("TabSvcPort".equals(inputPortName)) {
            return getTabSvcPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tab.controls.win32lib.server.sirius.org/", "TabSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tab.controls.win32lib.server.sirius.org/", "TabSvcPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TabSvcPort".equals(portName)) {
            setTabSvcPortEndpointAddress(address);
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
