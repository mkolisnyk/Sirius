/**
 * DirectoryOperationsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.core.system.dir;

public class DirectoryOperationsServiceLocator extends
		org.apache.axis.client.Service implements
		org.sirius.client.core.system.dir.DirectoryOperationsService {

	public DirectoryOperationsServiceLocator() {
	}

	public DirectoryOperationsServiceLocator(
			org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public DirectoryOperationsServiceLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for DirectoryOperationsPort
	private java.lang.String DirectoryOperationsPort_address = "http://localhost:21212/system/directory";

	public java.lang.String getDirectoryOperationsPortAddress() {
		return DirectoryOperationsPort_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String DirectoryOperationsPortWSDDServiceName = "DirectoryOperationsPort";

	public java.lang.String getDirectoryOperationsPortWSDDServiceName() {
		return DirectoryOperationsPortWSDDServiceName;
	}

	public void setDirectoryOperationsPortWSDDServiceName(java.lang.String name) {
		DirectoryOperationsPortWSDDServiceName = name;
	}

	public org.sirius.client.core.system.dir.DirectoryOperations getDirectoryOperationsPort()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(DirectoryOperationsPort_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getDirectoryOperationsPort(endpoint);
	}

	public org.sirius.client.core.system.dir.DirectoryOperations getDirectoryOperationsPort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			org.sirius.client.core.system.dir.DirectoryOperationsPortBindingStub _stub = new org.sirius.client.core.system.dir.DirectoryOperationsPortBindingStub(
					portAddress, this);
			_stub.setPortName(getDirectoryOperationsPortWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setDirectoryOperationsPortEndpointAddress(
			java.lang.String address) {
		DirectoryOperationsPort_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (org.sirius.client.core.system.dir.DirectoryOperations.class
					.isAssignableFrom(serviceEndpointInterface)) {
				org.sirius.client.core.system.dir.DirectoryOperationsPortBindingStub _stub = new org.sirius.client.core.system.dir.DirectoryOperationsPortBindingStub(
						new java.net.URL(DirectoryOperationsPort_address), this);
				_stub.setPortName(getDirectoryOperationsPortWSDDServiceName());
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
		if ("DirectoryOperationsPort".equals(inputPortName)) {
			return getDirectoryOperationsPort();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName(
				"http://system.server.sirius.org/",
				"DirectoryOperationsService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
					"http://system.server.sirius.org/",
					"DirectoryOperationsPort"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("DirectoryOperationsPort".equals(portName)) {
			setDirectoryOperationsPortEndpointAddress(address);
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
