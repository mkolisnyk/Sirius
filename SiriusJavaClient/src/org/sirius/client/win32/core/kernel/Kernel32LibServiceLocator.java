/**
 * Kernel32LibServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.kernel;

public class Kernel32LibServiceLocator extends org.apache.axis.client.Service
		implements org.sirius.client.win32.core.kernel.Kernel32LibService {

	public Kernel32LibServiceLocator() {
	}

	public Kernel32LibServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public Kernel32LibServiceLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for Kernel32LibPort
	private java.lang.String Kernel32LibPort_address = "http://localhost:21212/win32/core/kernel32";

	public java.lang.String getKernel32LibPortAddress() {
		return Kernel32LibPort_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String Kernel32LibPortWSDDServiceName = "Kernel32LibPort";

	public java.lang.String getKernel32LibPortWSDDServiceName() {
		return Kernel32LibPortWSDDServiceName;
	}

	public void setKernel32LibPortWSDDServiceName(java.lang.String name) {
		Kernel32LibPortWSDDServiceName = name;
	}

	public org.sirius.client.win32.core.kernel.Kernel32Lib getKernel32LibPort()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(Kernel32LibPort_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getKernel32LibPort(endpoint);
	}

	public org.sirius.client.win32.core.kernel.Kernel32Lib getKernel32LibPort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			org.sirius.client.win32.core.kernel.Kernel32LibPortBindingStub _stub = new org.sirius.client.win32.core.kernel.Kernel32LibPortBindingStub(
					portAddress, this);
			_stub.setPortName(getKernel32LibPortWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setKernel32LibPortEndpointAddress(java.lang.String address) {
		Kernel32LibPort_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (org.sirius.client.win32.core.kernel.Kernel32Lib.class
					.isAssignableFrom(serviceEndpointInterface)) {
				org.sirius.client.win32.core.kernel.Kernel32LibPortBindingStub _stub = new org.sirius.client.win32.core.kernel.Kernel32LibPortBindingStub(
						new java.net.URL(Kernel32LibPort_address), this);
				_stub.setPortName(getKernel32LibPortWSDDServiceName());
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
		if ("Kernel32LibPort".equals(inputPortName)) {
			return getKernel32LibPort();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "Kernel32LibService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
					"http://core.win32.server.sirius.org/", "Kernel32LibPort"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("Kernel32LibPort".equals(portName)) {
			setKernel32LibPortEndpointAddress(address);
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
