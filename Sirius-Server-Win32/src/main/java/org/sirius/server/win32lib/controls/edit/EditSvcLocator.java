/**
 * EditSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.edit;

public class EditSvcLocator extends org.apache.axis.client.Service implements org.sirius.server.win32lib.controls.edit.EditSvc {

    public EditSvcLocator() {
    }


    public EditSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EditSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EditSvcPort
    private java.lang.String EditSvcPort_address = "http://localhost:8990/win32lib/editsvc";

    public java.lang.String getEditSvcPortAddress() {
        return EditSvcPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EditSvcPortWSDDServiceName = "EditSvcPort";

    public java.lang.String getEditSvcPortWSDDServiceName() {
        return EditSvcPortWSDDServiceName;
    }

    public void setEditSvcPortWSDDServiceName(java.lang.String name) {
        EditSvcPortWSDDServiceName = name;
    }

    public org.sirius.server.win32lib.controls.edit.IEditContract getEditSvcPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EditSvcPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEditSvcPort(endpoint);
    }

    public org.sirius.server.win32lib.controls.edit.IEditContract getEditSvcPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.server.win32lib.controls.edit.EditSvcPortStub _stub = new org.sirius.server.win32lib.controls.edit.EditSvcPortStub(portAddress, this);
            _stub.setPortName(getEditSvcPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEditSvcPortEndpointAddress(java.lang.String address) {
        EditSvcPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.server.win32lib.controls.edit.IEditContract.class.isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.server.win32lib.controls.edit.EditSvcPortStub _stub = new org.sirius.server.win32lib.controls.edit.EditSvcPortStub(new java.net.URL(EditSvcPort_address), this);
                _stub.setPortName(getEditSvcPortWSDDServiceName());
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
        if ("EditSvcPort".equals(inputPortName)) {
            return getEditSvcPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://edit.controls.win32lib.server.sirius.org/", "EditSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://edit.controls.win32lib.server.sirius.org/", "EditSvcPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EditSvcPort".equals(portName)) {
            setEditSvcPortEndpointAddress(address);
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
