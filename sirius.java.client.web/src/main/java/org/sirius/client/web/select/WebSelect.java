/**
 * WebSelect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.web.select;

public interface WebSelect extends java.rmi.Remote {
    public boolean isMultiple(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException;

    public void deselectAll(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException;

    public void deselectByIndex(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2, int arg3) throws java.rmi.RemoteException;

    public void deselectByValue(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException;

    public java.lang.String[] getAllOptions(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException;

    public void selectByIndex(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2, int arg3) throws java.rmi.RemoteException;

    public void selectByValue(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException;

    public void selectByVisibleText(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException;

    public void deselectByVisibleText(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException;

    public java.lang.String[] getAllSelectedOptions(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException;

    public java.lang.String getFirstSelectedOption(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException;
}
