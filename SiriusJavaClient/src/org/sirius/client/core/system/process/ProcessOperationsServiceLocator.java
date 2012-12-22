/**
 * ProcessOperationsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.core.system.process;

public class ProcessOperationsServiceLocator extends org.apache.axis.client.Service implements org.sirius.client.core.system.process.ProcessOperationsService {

    public ProcessOperationsServiceLocator() {
    }


    public ProcessOperationsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProcessOperationsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProcessOperationsPort
    private java.lang.String ProcessOperationsPort_address = "http://localhost:21212/system/process";

    public java.lang.String getProcessOperationsPortAddress() {
        return ProcessOperationsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProcessOperationsPortWSDDServiceName = "ProcessOperationsPort";

    public java.lang.String getProcessOperationsPortWSDDServiceName() {
        return ProcessOperationsPortWSDDServiceName;
    }

    public void setProcessOperationsPortWSDDServiceName(java.lang.String name) {
        ProcessOperationsPortWSDDServiceName = name;
    }

    public org.sirius.client.core.system.process.ProcessOperations getProcessOperationsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProcessOperationsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProcessOperationsPort(endpoint);
    }

    public org.sirius.client.core.system.process.ProcessOperations getProcessOperationsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.client.core.system.process.ProcessOperationsPortBindingStub _stub = new org.sirius.client.core.system.process.ProcessOperationsPortBindingStub(portAddress, this);
            _stub.setPortName(getProcessOperationsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProcessOperationsPortEndpointAddress(java.lang.String address) {
        ProcessOperationsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.client.core.system.process.ProcessOperations.class.isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.client.core.system.process.ProcessOperationsPortBindingStub _stub = new org.sirius.client.core.system.process.ProcessOperationsPortBindingStub(new java.net.URL(ProcessOperationsPort_address), this);
                _stub.setPortName(getProcessOperationsPortWSDDServiceName());
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
        if ("ProcessOperationsPort".equals(inputPortName)) {
            return getProcessOperationsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://system.server.sirius.org/", "ProcessOperationsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://system.server.sirius.org/", "ProcessOperationsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProcessOperationsPort".equals(portName)) {
            setProcessOperationsPortEndpointAddress(address);
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
