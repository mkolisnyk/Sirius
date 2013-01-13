/**
 * Kernel32LibService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.kernel;

public interface Kernel32LibService extends javax.xml.rpc.Service {
	public java.lang.String getKernel32LibPortAddress();

	public org.sirius.client.win32.core.kernel.Kernel32Lib getKernel32LibPort()
			throws javax.xml.rpc.ServiceException;

	public org.sirius.client.win32.core.kernel.Kernel32Lib getKernel32LibPort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
