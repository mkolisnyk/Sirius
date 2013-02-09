/**
 * ComboBox.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.combobox;

public interface ComboBox extends java.rmi.Remote {
    public int setEditSel(long arg0, int arg1, int arg2) throws java.rmi.RemoteException;
    public int setCurSel(long arg0, int arg1) throws java.rmi.RemoteException;
    public int selectString(long arg0, int arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public int findString(long arg0, int arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public void setText(long arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public int showDropdown(long arg0, boolean arg1) throws java.rmi.RemoteException;
    public int getEditSel(long arg0) throws java.rmi.RemoteException;
    public int getLBText(long arg0, int arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public int getItemData(long arg0, int arg1) throws java.rmi.RemoteException;
    public int getCount(long arg0) throws java.rmi.RemoteException;
    public int findItemData(long arg0, int arg1, org.sirius.client.win32.core.types.Lparam arg2) throws java.rmi.RemoteException;
    public int getCurSel(long arg0) throws java.rmi.RemoteException;
    public int getLBTextLen(long arg0, int arg1) throws java.rmi.RemoteException;
    public java.lang.String getText(long arg0) throws java.rmi.RemoteException;
    public int resetContent(long arg0) throws java.rmi.RemoteException;
    public int getDroppedState(long arg0) throws java.rmi.RemoteException;
    public int setItemHeight(long arg0, int arg1, int arg2) throws java.rmi.RemoteException;
    public int findStringExact(long arg0, int arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public int getTextLength(long arg0) throws java.rmi.RemoteException;
    public int getExtendedUI(long arg0) throws java.rmi.RemoteException;
    public int getItemHeight(long arg0) throws java.rmi.RemoteException;
}
