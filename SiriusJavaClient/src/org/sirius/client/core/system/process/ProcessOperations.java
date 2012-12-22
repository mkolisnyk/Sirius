/**
 * ProcessOperations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.core.system.process;

public interface ProcessOperations extends java.rmi.Remote {
    public int waitProcessCloseByIdEx(int pid, int timeout) throws java.rmi.RemoteException;
    public boolean kill(java.lang.String processName) throws java.rmi.RemoteException;
    public int waitProcessCloseById(int pid) throws java.rmi.RemoteException;
    public int waitProcessClose(java.lang.String process) throws java.rmi.RemoteException;
    public int waitProcessCloseEx(java.lang.String process, int timeout) throws java.rmi.RemoteException;
    public org.sirius.client.core.system.process.ProcessInfo[] listAll() throws java.rmi.RemoteException;
    public org.sirius.client.core.system.process.ProcessInfo[] listByMask(java.lang.String mask) throws java.rmi.RemoteException;
    public org.sirius.client.core.system.process.ProcessInfo[] listByFilter(org.sirius.client.core.system.process.ProcessInfo filter) throws java.rmi.RemoteException;
    public boolean startEx(java.lang.String command, java.lang.String[] args) throws java.rmi.RemoteException;
    public int runEx(java.lang.String command, java.lang.String[] args) throws java.rmi.RemoteException;
    public boolean start(java.lang.String command) throws java.rmi.RemoteException;
    public int run(java.lang.String command) throws java.rmi.RemoteException;
}
