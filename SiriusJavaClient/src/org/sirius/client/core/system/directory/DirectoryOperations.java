/**
 * DirectoryOperations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.core.system.directory;

public interface DirectoryOperations extends java.rmi.Remote {
	public boolean moveDirectoryEx(java.lang.String arg0,
			java.lang.String arg1, boolean arg2)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.directory.IOException;

	public boolean moveDirectory(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.directory.IOException;

	public java.lang.String[] getContentsEx(java.lang.String arg0, boolean arg1)
			throws java.rmi.RemoteException;

	public boolean createDirectoryEx(java.lang.String arg0, boolean arg1)
			throws java.rmi.RemoteException;

	public boolean copyEx(java.lang.String arg0, java.lang.String arg1,
			boolean arg2) throws java.rmi.RemoteException,
			org.sirius.client.core.system.directory.IOException;

	public boolean copy(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.directory.IOException;

	public boolean delete(java.lang.String arg0)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.directory.IOException;

	public boolean exists(java.lang.String arg0)
			throws java.rmi.RemoteException;

	public boolean createDirectory(java.lang.String arg0)
			throws java.rmi.RemoteException;

	public java.lang.String[] getContents(java.lang.String arg0)
			throws java.rmi.RemoteException;
}
