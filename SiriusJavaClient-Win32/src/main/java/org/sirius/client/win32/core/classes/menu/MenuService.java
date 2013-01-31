/**
 * MenuService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.classes.menu;

public interface MenuService extends javax.xml.rpc.Service {
	public java.lang.String getMenuPortAddress();

	public org.sirius.client.win32.core.classes.menu.Menu getMenuPort()
			throws javax.xml.rpc.ServiceException;

	public org.sirius.client.win32.core.classes.menu.Menu getMenuPort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
