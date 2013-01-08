/**
 * FileOperationsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.core.system.file;

public class FileOperationsServiceLocator extends
		org.apache.axis.client.Service implements
		org.sirius.client.core.system.file.FileOperationsService {

	public FileOperationsServiceLocator() {
	}

	public FileOperationsServiceLocator(
			org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public FileOperationsServiceLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for FileOperationsPort
	private java.lang.String FileOperationsPort_address = "http://localhost:21212/system/file";

	public java.lang.String getFileOperationsPortAddress() {
		return FileOperationsPort_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String FileOperationsPortWSDDServiceName = "FileOperationsPort";

	public java.lang.String getFileOperationsPortWSDDServiceName() {
		return FileOperationsPortWSDDServiceName;
	}

	public void setFileOperationsPortWSDDServiceName(java.lang.String name) {
		FileOperationsPortWSDDServiceName = name;
	}

	public org.sirius.client.core.system.file.FileOperations getFileOperationsPort()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(FileOperationsPort_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getFileOperationsPort(endpoint);
	}

	public org.sirius.client.core.system.file.FileOperations getFileOperationsPort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			org.sirius.client.core.system.file.FileOperationsPortBindingStub _stub = new org.sirius.client.core.system.file.FileOperationsPortBindingStub(
					portAddress, this);
			_stub.setPortName(getFileOperationsPortWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setFileOperationsPortEndpointAddress(java.lang.String address) {
		FileOperationsPort_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (org.sirius.client.core.system.file.FileOperations.class
					.isAssignableFrom(serviceEndpointInterface)) {
				org.sirius.client.core.system.file.FileOperationsPortBindingStub _stub = new org.sirius.client.core.system.file.FileOperationsPortBindingStub(
						new java.net.URL(FileOperationsPort_address), this);
				_stub.setPortName(getFileOperationsPortWSDDServiceName());
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
		if ("FileOperationsPort".equals(inputPortName)) {
			return getFileOperationsPort();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName(
				"http://system.server.sirius.org/", "FileOperationsService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
					"http://system.server.sirius.org/", "FileOperationsPort"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("FileOperationsPort".equals(portName)) {
			setFileOperationsPortEndpointAddress(address);
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
