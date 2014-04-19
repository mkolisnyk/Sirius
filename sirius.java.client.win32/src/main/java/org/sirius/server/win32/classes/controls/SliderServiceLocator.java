/**
 * SliderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32.classes.controls;

public class SliderServiceLocator extends org.apache.axis.client.Service implements org.sirius.server.win32.classes.controls.SliderService {

    public SliderServiceLocator() {
    }


    public SliderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SliderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SliderPort
    private java.lang.String SliderPort_address = "http://localhost:21212/win32/slider";

    public java.lang.String getSliderPortAddress() {
        return SliderPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SliderPortWSDDServiceName = "SliderPort";

    public java.lang.String getSliderPortWSDDServiceName() {
        return SliderPortWSDDServiceName;
    }

    public void setSliderPortWSDDServiceName(java.lang.String name) {
        SliderPortWSDDServiceName = name;
    }

    public org.sirius.server.win32.classes.controls.Slider getSliderPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SliderPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSliderPort(endpoint);
    }

    public org.sirius.server.win32.classes.controls.Slider getSliderPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.server.win32.classes.controls.SliderPortBindingStub _stub = new org.sirius.server.win32.classes.controls.SliderPortBindingStub(portAddress, this);
            _stub.setPortName(getSliderPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSliderPortEndpointAddress(java.lang.String address) {
        SliderPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.server.win32.classes.controls.Slider.class.isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.server.win32.classes.controls.SliderPortBindingStub _stub = new org.sirius.server.win32.classes.controls.SliderPortBindingStub(new java.net.URL(SliderPort_address), this);
                _stub.setPortName(getSliderPortWSDDServiceName());
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
        if ("SliderPort".equals(inputPortName)) {
            return getSliderPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controls.classes.win32.server.sirius.org/", "SliderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controls.classes.win32.server.sirius.org/", "SliderPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SliderPort".equals(portName)) {
            setSliderPortEndpointAddress(address);
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
