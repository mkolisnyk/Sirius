/**
 * ComboBoxServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.combobox;

public class ComboBoxServiceLocator extends org.apache.axis.client.Service
        implements
        org.sirius.client.win32.core.controls.combobox.ComboBoxService {

    public ComboBoxServiceLocator() {
    }

    public ComboBoxServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ComboBoxServiceLocator(java.lang.String wsdlLoc,
            javax.xml.namespace.QName sName)
            throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ComboBoxPort
    private java.lang.String ComboBoxPort_address = "http://localhost:21212/win32/combobox";

    public java.lang.String getComboBoxPortAddress() {
        return ComboBoxPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ComboBoxPortWSDDServiceName = "ComboBoxPort";

    public java.lang.String getComboBoxPortWSDDServiceName() {
        return ComboBoxPortWSDDServiceName;
    }

    public void setComboBoxPortWSDDServiceName(java.lang.String name) {
        ComboBoxPortWSDDServiceName = name;
    }

    public org.sirius.client.win32.core.controls.combobox.ComboBox getComboBoxPort()
            throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ComboBoxPort_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getComboBoxPort(endpoint);
    }

    public org.sirius.client.win32.core.controls.combobox.ComboBox getComboBoxPort(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sirius.client.win32.core.controls.combobox.ComboBoxPortBindingStub _stub = new org.sirius.client.win32.core.controls.combobox.ComboBoxPortBindingStub(
                    portAddress, this);
            _stub.setPortName(getComboBoxPortWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setComboBoxPortEndpointAddress(java.lang.String address) {
        ComboBoxPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface)
            throws javax.xml.rpc.ServiceException {
        try {
            if (org.sirius.client.win32.core.controls.combobox.ComboBox.class
                    .isAssignableFrom(serviceEndpointInterface)) {
                org.sirius.client.win32.core.controls.combobox.ComboBoxPortBindingStub _stub = new org.sirius.client.win32.core.controls.combobox.ComboBoxPortBindingStub(
                        new java.net.URL(ComboBoxPort_address), this);
                _stub.setPortName(getComboBoxPortWSDDServiceName());
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
        if ("ComboBoxPort".equals(inputPortName)) {
            return getComboBoxPort();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/",
                "ComboBoxService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName(
                    "http://controls.classes.win32.server.sirius.org/",
                    "ComboBoxPort"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName,
            java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("ComboBoxPort".equals(portName)) {
            setComboBoxPortEndpointAddress(address);
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
