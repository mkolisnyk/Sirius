/**
 * SliderSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.slider;

public class SliderSvcLocator extends org.apache.axis.client.Service implements org.sirius.server.win32lib.controls.slider.SliderSvc {

    public SliderSvcLocator() {
    }


    public SliderSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SliderSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SliderSvcPort
    private java.lang.String SliderSvcPort_address = "http://localhost:31313/win32lib/slidersvc";

    public java.lang.String getSliderSvcPortAddress() {
        return SliderSvcPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SliderSvcPortWSDDServiceName = "SliderSvcPort";

    public java.lang.String getSliderSvcPortWSDDServiceName() {
        return SliderSvcPortWSDDServiceName;
    }

    public void setSliderSvcPortWSDDServiceName(java.lang.String name) {
        SliderSvcPortWSDDServiceName = name;
    }

    public org.sirius.server.win32lib.controls.slider.ISliderContract getSliderSvcPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SliderSvcPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSliderSvcPort(endpoint);
    }

    public org.sirius.server.win32lib.controls.slider.ISliderContract getSliderSvcPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.server.win32lib.controls.slider.SliderSvcPortStub _stub = new org.sirius.server.win32lib.controls.slider.SliderSvcPortStub(portAddress, this);
            _stub.setPortName(getSliderSvcPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSliderSvcPortEndpointAddress(java.lang.String address) {
        SliderSvcPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.server.win32lib.controls.slider.ISliderContract.class.isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.server.win32lib.controls.slider.SliderSvcPortStub _stub = new org.sirius.server.win32lib.controls.slider.SliderSvcPortStub(new java.net.URL(SliderSvcPort_address), this);
                _stub.setPortName(getSliderSvcPortWSDDServiceName());
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
        if ("SliderSvcPort".equals(inputPortName)) {
            return getSliderSvcPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://slider.controls.win32lib.server.sirius.org/", "SliderSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://slider.controls.win32lib.server.sirius.org/", "SliderSvcPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SliderSvcPort".equals(portName)) {
            setSliderSvcPortEndpointAddress(address);
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
