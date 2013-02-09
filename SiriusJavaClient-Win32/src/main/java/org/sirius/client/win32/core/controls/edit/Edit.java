/**
 * Edit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.edit;

public interface Edit extends java.rmi.Remote {
    public boolean setText(long arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public int setSel(long arg0, int arg1, int arg2) throws java.rmi.RemoteException;
    public int canUndo(long arg0) throws java.rmi.RemoteException;
    public int scroll(long arg0, int arg1, int arg2) throws java.rmi.RemoteException;
    public int lineFromChar(long arg0, int arg1) throws java.rmi.RemoteException;
    public int getLineCount(long arg0) throws java.rmi.RemoteException;
    public int getSel(long arg0) throws java.rmi.RemoteException;
    public int lineLength(long arg0, int arg1) throws java.rmi.RemoteException;
    public int lineIndex(long arg0, int arg1) throws java.rmi.RemoteException;
    public int getModify(long arg0) throws java.rmi.RemoteException;
    public int replaceSel(long arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public boolean scrollCaret(long arg0) throws java.rmi.RemoteException;
    public int emptyUndoBuffer(long arg0) throws java.rmi.RemoteException;
    public int getFirstVisibleLine(long arg0) throws java.rmi.RemoteException;
    public int getPasswordChar(long arg0) throws java.rmi.RemoteException;
    public int setPasswordChar(long arg0, int arg1) throws java.rmi.RemoteException;
    public int undo(long arg0) throws java.rmi.RemoteException;
}
