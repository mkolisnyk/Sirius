/**
 * ListBox.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.listbox;

public interface ListBox extends java.rmi.Remote {
    public int getSel(long arg0, int arg1) throws java.rmi.RemoteException;
    public int setCurSel(long arg0, int arg1) throws java.rmi.RemoteException;
    public int selectString(long arg0, int arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public int findString(long arg0, int arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public int getCount(long arg0) throws java.rmi.RemoteException;
    public int getCurSel(long arg0) throws java.rmi.RemoteException;
    public java.lang.String getText(long arg0, int arg1) throws java.rmi.RemoteException;
    public int setSel(long arg0, boolean arg1, int arg2) throws java.rmi.RemoteException;
    public int getTopIndex(long arg0) throws java.rmi.RemoteException;
    public int getSelCount(long arg0) throws java.rmi.RemoteException;
    public int selItemRange(long arg0, boolean arg1, int arg2, int arg3) throws java.rmi.RemoteException;
    public int getTextLen(long arg0, int arg1) throws java.rmi.RemoteException;
    public int findStringExact(long arg0, int arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public int getItemHeight(long arg0, int arg1) throws java.rmi.RemoteException;
    public int setCaretIndex(long arg0, int arg1) throws java.rmi.RemoteException;
    public int getCaretIndex(long arg0) throws java.rmi.RemoteException;
    public int getHorizontalExtent(long arg0) throws java.rmi.RemoteException;
}
