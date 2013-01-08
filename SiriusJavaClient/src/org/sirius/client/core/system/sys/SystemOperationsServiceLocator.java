/**
 * SystemOperationsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.core.system.sys;

public class SystemOperationsServiceLocator extends
		org.apache.axis.client.Service implements
		org.sirius.client.core.system.sys.SystemOperationsService {

	public SystemOperationsServiceLocator() {
	}

	public SystemOperationsServiceLocator(
			org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public SystemOperationsServiceLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for SystemOperationsPort
	private java.lang.String SystemOperationsPort_address = "http://localhost:21212/system/system";

	public java.lang.String getSystemOperationsPortAddress() {
		return SystemOperationsPort_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String SystemOperationsPortWSDDServiceName = "SystemOperationsPort";

	public java.lang.String getSystemOperationsPortWSDDServiceName() {
		return SystemOperationsPortWSDDServiceName;
	}

	public void setSystemOperationsPortWSDDServiceName(java.lang.String name) {
		SystemOperationsPortWSDDServiceName = name;
	}

	public org.sirius.client.core.system.sys.SystemOperations getSystemOperationsPort()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(SystemOperationsPort_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getSystemOperationsPort(endpoint);
	}

	public org.sirius.client.core.system.sys.SystemOperations getSystemOperationsPort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			org.sirius.client.core.system.sys.SystemOperationsPortBindingStub _stub = new org.sirius.client.core.system.sys.SystemOperationsPortBindingStub(
					portAddress, this);
			_stub.setPortName(getSystemOperationsPortWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setSystemOperationsPortEndpointAddress(java.lang.String address) {
		SystemOperationsPort_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (org.sirius.client.core.system.sys.SystemOperations.class
					.isAssignableFrom(serviceEndpointInterface)) {
				org.sirius.client.core.system.sys.SystemOperationsPortBindingStub _stub = new org.sirius.client.core.system.sys.SystemOperationsPortBindingStub(
						new java.net.URL(SystemOperationsPort_address), this);
				_stub.setPortName(getSystemOperationsPortWSDDServiceName());
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
		if ("SystemOperationsPort".equals(inputPortName)) {
			return getSystemOperationsPort();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName(
				"http://system.server.sirius.org/", "SystemOperationsService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
					"http://system.server.sirius.org/", "SystemOperationsPort"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("SystemOperationsPort".equals(portName)) {
			setSystemOperationsPortEndpointAddress(address);
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
