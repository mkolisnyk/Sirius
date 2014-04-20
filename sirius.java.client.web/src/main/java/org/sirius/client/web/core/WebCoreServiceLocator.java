/**
 * WebCoreServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.web.core;

public class WebCoreServiceLocator extends org.apache.axis.client.Service
		implements org.sirius.client.web.core.WebCoreService {

	public WebCoreServiceLocator() {
	}

	public WebCoreServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public WebCoreServiceLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for WebCorePort
	private java.lang.String WebCorePort_address = "http://localhost:21212/web/core";

	public java.lang.String getWebCorePortAddress() {
		return WebCorePort_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String WebCorePortWSDDServiceName = "WebCorePort";

	public java.lang.String getWebCorePortWSDDServiceName() {
		return WebCorePortWSDDServiceName;
	}

	public void setWebCorePortWSDDServiceName(java.lang.String name) {
		WebCorePortWSDDServiceName = name;
	}

	public org.sirius.client.web.core.WebCore getWebCorePort()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(WebCorePort_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getWebCorePort(endpoint);
	}

	public org.sirius.client.web.core.WebCore getWebCorePort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			org.sirius.client.web.core.WebCorePortBindingStub _stub = new org.sirius.client.web.core.WebCorePortBindingStub(
					portAddress, this);
			_stub.setPortName(getWebCorePortWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setWebCorePortEndpointAddress(java.lang.String address) {
		WebCorePort_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (org.sirius.client.web.core.WebCore.class
					.isAssignableFrom(serviceEndpointInterface)) {
				org.sirius.client.web.core.WebCorePortBindingStub _stub = new org.sirius.client.web.core.WebCorePortBindingStub(
						new java.net.URL(WebCorePort_address), this);
				_stub.setPortName(getWebCorePortWSDDServiceName());
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
		if ("WebCorePort".equals(inputPortName)) {
			return getWebCorePort();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://web.server.sirius.org/",
				"WebCoreService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
					"http://web.server.sirius.org/", "WebCorePort"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("WebCorePort".equals(portName)) {
			setWebCorePortEndpointAddress(address);
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
