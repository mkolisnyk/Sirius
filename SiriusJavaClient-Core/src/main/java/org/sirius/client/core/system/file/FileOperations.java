/**
 * FileOperations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.core.system.file;

public interface FileOperations extends java.rmi.Remote {
	public boolean fileExists(java.lang.String fileName)
			throws java.rmi.RemoteException;

	public boolean copyEx(java.lang.String origin,
			java.lang.String destination, boolean overwrite)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean createFile(java.lang.String fileName)
			throws java.rmi.RemoteException;

	public java.lang.String[] getFileContents(java.lang.String path)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public java.lang.String[] getFileContentsEx2(java.lang.String path,
			int start, int number) throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public java.lang.String[] getFileContentsEx(java.lang.String path, int start)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean appendEx(java.lang.String path, java.lang.String text)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean createFileEx(java.lang.String fileName, boolean overwrite)
			throws java.rmi.RemoteException;

	public boolean deleteFile(java.lang.String fileName)
			throws java.rmi.RemoteException;

	public byte[] getAllBytes(java.lang.String fileName)
			throws java.rmi.RemoteException;

	public boolean moveEx(java.lang.String origin,
			java.lang.String destination, boolean overwrite)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean writeEx(java.lang.String path, java.lang.String text)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean append(java.lang.String path, byte[] content)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public long size(java.lang.String fileName) throws java.rmi.RemoteException;

	public boolean write(java.lang.String path, byte[] content)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean copy(java.lang.String origin, java.lang.String destination)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public java.lang.String[] head(java.lang.String path, int lines)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public java.lang.String[] tail(java.lang.String path, int lines)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;

	public boolean move(java.lang.String origin, java.lang.String destination)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException;
}
