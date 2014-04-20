/**
 * WebSelectService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.web.select;

public interface WebSelectService extends javax.xml.rpc.Service {
	public java.lang.String getWebSelectPortAddress();

	public org.sirius.client.web.select.WebSelect getWebSelectPort()
			throws javax.xml.rpc.ServiceException;

	public org.sirius.client.web.select.WebSelect getWebSelectPort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
