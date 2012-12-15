/**
 * FileOperations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.core.system.file;

public interface FileOperations extends java.rmi.Remote {
	public java.lang.String[] getContentsEx(java.lang.String arg0, boolean arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean copyEx(java.lang.String arg0, java.lang.String arg1,
			boolean arg2) throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean createFile(java.lang.String arg0)
			throws java.rmi.RemoteException;

	public java.lang.String[] getContentsEx2(java.lang.String arg0, int arg1,
			int arg2) throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean appendEx(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException;

	public boolean createFileEx(java.lang.String arg0, boolean arg1)
			throws java.rmi.RemoteException;

	public byte[] getAllBytes(java.lang.String arg0)
			throws java.rmi.RemoteException;

	public boolean moveEx(java.lang.String arg0, java.lang.String arg1,
			boolean arg2) throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean writeEx(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException;

	public boolean append(java.lang.String arg0, byte[] arg1)
			throws java.rmi.RemoteException;

	public long size(java.lang.String arg0) throws java.rmi.RemoteException;

	public boolean write(java.lang.String arg0, byte[] arg1)
			throws java.rmi.RemoteException;

	public boolean copy(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean delete(java.lang.String arg0)
			throws java.rmi.RemoteException;

	public boolean exists(java.lang.String arg0)
			throws java.rmi.RemoteException;

	public java.lang.String[] head(java.lang.String arg0, int arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public java.lang.String[] tail(java.lang.String arg0, int arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean move(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public java.lang.String[] getContents(java.lang.String arg0)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;
}
