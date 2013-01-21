/**
 * MenuServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.classes.menu;

public class MenuServiceLocator extends org.apache.axis.client.Service implements org.sirius.client.win32.core.classes.menu.MenuService {

    public MenuServiceLocator() {
    }


    public MenuServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MenuServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MenuPort
    private java.lang.String MenuPort_address = "http://localhost:21212/win32/menu";

    public java.lang.String getMenuPortAddress() {
        return MenuPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MenuPortWSDDServiceName = "MenuPort";

    public java.lang.String getMenuPortWSDDServiceName() {
        return MenuPortWSDDServiceName;
    }

    public void setMenuPortWSDDServiceName(java.lang.String name) {
        MenuPortWSDDServiceName = name;
    }

    public org.sirius.client.win32.core.classes.menu.Menu getMenuPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MenuPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMenuPort(endpoint);
    }

    public org.sirius.client.win32.core.classes.menu.Menu getMenuPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.client.win32.core.classes.menu.MenuPortBindingStub _stub = new org.sirius.client.win32.core.classes.menu.MenuPortBindingStub(portAddress, this);
            _stub.setPortName(getMenuPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMenuPortEndpointAddress(java.lang.String address) {
        MenuPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.client.win32.core.classes.menu.Menu.class.isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.client.win32.core.classes.menu.MenuPortBindingStub _stub = new org.sirius.client.win32.core.classes.menu.MenuPortBindingStub(new java.net.URL(MenuPort_address), this);
                _stub.setPortName(getMenuPortWSDDServiceName());
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
        if ("MenuPort".equals(inputPortName)) {
            return getMenuPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "MenuService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "MenuPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MenuPort".equals(portName)) {
            setMenuPortEndpointAddress(address);
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
