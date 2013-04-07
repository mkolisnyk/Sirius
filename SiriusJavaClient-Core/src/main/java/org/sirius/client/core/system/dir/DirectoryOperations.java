/**
 * DirectoryOperations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.core.system.dir;

public interface DirectoryOperations extends java.rmi.Remote {
    public boolean moveDirectory(java.lang.String origin,
            java.lang.String destination) throws java.rmi.RemoteException,
            org.sirius.client.core.system.dir.IOException;

    public boolean moveDirectoryEx(java.lang.String origin,
            java.lang.String destination, boolean overwrite)
            throws java.rmi.RemoteException,
            org.sirius.client.core.system.dir.IOException;

    public java.lang.String[] getContentsEx(java.lang.String path,
            boolean recursive) throws java.rmi.RemoteException;

    public boolean createEx(java.lang.String path, boolean overwrite)
            throws java.rmi.RemoteException;

    public boolean copyEx(java.lang.String origin,
            java.lang.String destination, boolean overwrite)
            throws java.rmi.RemoteException,
            org.sirius.client.core.system.dir.IOException;

    public boolean copy(java.lang.String origin, java.lang.String destination)
            throws java.rmi.RemoteException,
            org.sirius.client.core.system.dir.IOException;

    public boolean delete(java.lang.String path)
            throws java.rmi.RemoteException,
            org.sirius.client.core.system.dir.IOException;

    public boolean exists(java.lang.String path)
            throws java.rmi.RemoteException;

    public boolean create(java.lang.String path)
            throws java.rmi.RemoteException;

    public java.lang.String[] getContents(java.lang.String path)
            throws java.rmi.RemoteException;
}
