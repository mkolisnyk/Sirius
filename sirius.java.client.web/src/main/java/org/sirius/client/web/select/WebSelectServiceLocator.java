/**
 * WebSelectServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.web.select;

public class WebSelectServiceLocator extends org.apache.axis.client.Service
        implements org.sirius.client.web.select.WebSelectService {

    public WebSelectServiceLocator() {
    }

    public WebSelectServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebSelectServiceLocator(java.lang.String wsdlLoc,
            javax.xml.namespace.QName sName)
            throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebSelectPort
    private java.lang.String WebSelectPort_address = "http://localhost:21212/web/select";

    public java.lang.String getWebSelectPortAddress() {
        return WebSelectPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebSelectPortWSDDServiceName = "WebSelectPort";

    public java.lang.String getWebSelectPortWSDDServiceName() {
        return WebSelectPortWSDDServiceName;
    }

    public void setWebSelectPortWSDDServiceName(java.lang.String name) {
        WebSelectPortWSDDServiceName = name;
    }

    public org.sirius.client.web.select.WebSelect getWebSelectPort()
            throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebSelectPort_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebSelectPort(endpoint);
    }

    public org.sirius.client.web.select.WebSelect getWebSelectPort(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.client.web.select.WebSelectPortBindingStub _stub = new org.sirius.client.web.select.WebSelectPortBindingStub(
                    portAddress, this);
            _stub.setPortName(getWebSelectPortWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebSelectPortEndpointAddress(java.lang.String address) {
        WebSelectPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface)
            throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.client.web.select.WebSelect.class
                    .isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.client.web.select.WebSelectPortBindingStub _stub = new org.sirius.client.web.select.WebSelectPortBindingStub(
                        new java.net.URL(WebSelectPort_address), this);
                _stub.setPortName(getWebSelectPortWSDDServiceName());
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
        if ("WebSelectPort".equals(inputPortName)) {
            return getWebSelectPort();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://web.server.sirius.org/",
                "WebSelectService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName(
                    "http://web.server.sirius.org/", "WebSelectPort"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName,
            java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("WebSelectPort".equals(portName)) {
            setWebSelectPortEndpointAddress(address);
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
