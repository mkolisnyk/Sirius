/**
 * User32LibServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.user32;

public class User32LibServiceLocator extends org.apache.axis.client.Service
		implements org.sirius.client.win32.core.user32.User32LibService {

	public User32LibServiceLocator() {
	}

	public User32LibServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public User32LibServiceLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for User32LibPort
	private java.lang.String User32LibPort_address = "http://localhost:21212/win32/core/user32";

	public java.lang.String getUser32LibPortAddress() {
		return User32LibPort_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String User32LibPortWSDDServiceName = "User32LibPort";

	public java.lang.String getUser32LibPortWSDDServiceName() {
		return User32LibPortWSDDServiceName;
	}

	public void setUser32LibPortWSDDServiceName(java.lang.String name) {
		User32LibPortWSDDServiceName = name;
	}

	public org.sirius.client.win32.core.user32.User32Lib getUser32LibPort()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(User32LibPort_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getUser32LibPort(endpoint);
	}

	public org.sirius.client.win32.core.user32.User32Lib getUser32LibPort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			org.sirius.client.win32.core.user32.User32LibPortBindingStub _stub = new org.sirius.client.win32.core.user32.User32LibPortBindingStub(
					portAddress, this);
			_stub.setPortName(getUser32LibPortWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setUser32LibPortEndpointAddress(java.lang.String address) {
		User32LibPort_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (org.sirius.client.win32.core.user32.User32Lib.class
					.isAssignableFrom(serviceEndpointInterface)) {
				org.sirius.client.win32.core.user32.User32LibPortBindingStub _stub = new org.sirius.client.win32.core.user32.User32LibPortBindingStub(
						new java.net.URL(User32LibPort_address), this);
				_stub.setPortName(getUser32LibPortWSDDServiceName());
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
		if ("User32LibPort".equals(inputPortName)) {
			return getUser32LibPort();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "User32LibService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
					"http://core.win32.server.sirius.org/", "User32LibPort"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("User32LibPort".equals(portName)) {
			setUser32LibPortEndpointAddress(address);
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
