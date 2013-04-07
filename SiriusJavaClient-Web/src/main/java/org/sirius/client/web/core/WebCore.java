/**
 * WebCore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.web.core;

public interface WebCore extends java.rmi.Remote {
    public void forward(java.lang.String arg0) throws java.rmi.RemoteException;

    public void sendKeys(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException;

    public void selectWindow(java.lang.String arg0, java.lang.String arg1)
            throws java.rmi.RemoteException;

    public void selectAlert(java.lang.String arg0)
            throws java.rmi.RemoteException;

    public java.lang.String getCssValue(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException;

    public boolean isDisplayed(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException;

    public java.lang.String getWindowHandle(java.lang.String arg0)
            throws java.rmi.RemoteException;

    public void selectFrameByName(java.lang.String arg0, java.lang.String arg1)
            throws java.rmi.RemoteException;

    public void selectDefaultContent(java.lang.String arg0)
            throws java.rmi.RemoteException;

    public java.lang.String getPageSource(java.lang.String arg0)
            throws java.rmi.RemoteException;

    public void selectFrameByIndex(java.lang.String arg0, int arg1)
            throws java.rmi.RemoteException;

    public void back(java.lang.String arg0) throws java.rmi.RemoteException;

    public org.sirius.client.web.core.Point getLocation(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException;

    public java.lang.String getURL(java.lang.String arg0)
            throws java.rmi.RemoteException;

    public void clear(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException;

    public java.lang.String start(java.lang.String arg0)
            throws java.rmi.RemoteException;

    public void stop(java.lang.String arg0) throws java.rmi.RemoteException;

    public org.sirius.client.web.core.Dimension getSize(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException;

    public void open(java.lang.String arg0, java.lang.String arg1)
            throws java.rmi.RemoteException;

    public void refresh(java.lang.String arg0) throws java.rmi.RemoteException;

    public java.lang.String getTitle(java.lang.String arg0)
            throws java.rmi.RemoteException;

    public boolean isEnabled(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException;

    public java.lang.String getText(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException;

    public void submit(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException;

    public void click(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException;

    public boolean isSelected(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException;

    public java.lang.String getAttribute(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException;

    public java.lang.String getTagName(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException;
}
