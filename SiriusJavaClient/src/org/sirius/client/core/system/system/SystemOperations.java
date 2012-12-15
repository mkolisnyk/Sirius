/**
 * SystemOperations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.core.system.system;

public interface SystemOperations extends java.rmi.Remote {
	public java.lang.String getMachineName() throws java.rmi.RemoteException;

	public long getFreeMemory() throws java.rmi.RemoteException;

	public long getFreeDiskSpace(java.lang.String arg0)
			throws java.rmi.RemoteException;

	public java.lang.Object getSystemMetrics() throws java.rmi.RemoteException;

	public java.lang.String getCurrentUser() throws java.rmi.RemoteException;

	public java.lang.String getEnvironmentVariable(java.lang.String arg0)
			throws java.rmi.RemoteException;

	public boolean setEnvironmentVariable(java.lang.String arg0,
			java.lang.String arg1) throws java.rmi.RemoteException,
			org.sirius.client.core.system.system.IOException;

	public java.util.Calendar getDate() throws java.rmi.RemoteException;

	public boolean setDate(java.util.Calendar arg0)
			throws java.rmi.RemoteException;
}
