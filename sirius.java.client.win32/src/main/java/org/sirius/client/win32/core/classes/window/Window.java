/**
 * Window.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.classes.window;

public interface Window extends java.rmi.Remote {
    public boolean getWindowPlacement(long arg0,
            org.sirius.client.win32.core.types.Windowplacement arg1)
            throws java.rmi.RemoteException;

    public long getSystemMenu(long arg0, boolean arg1)
            throws java.rmi.RemoteException;

    public org.sirius.client.win32.core.types.Rect getClientRect(long arg0)
            throws java.rmi.RemoteException;

    public void doubleClick(long arg0, int arg1, int arg2, int arg3,
            boolean arg4, boolean arg5, boolean arg6)
            throws java.rmi.RemoteException;

    public void keyPress(long arg0, int arg1) throws java.rmi.RemoteException;

    public org.sirius.client.win32.core.types.Rect getRect(long arg0)
            throws java.rmi.RemoteException;

    public boolean isMaximized(long arg0) throws java.rmi.RemoteException;

    public boolean isMinimized(long arg0) throws java.rmi.RemoteException;

    public boolean isUnicode(long arg0) throws java.rmi.RemoteException;

    public boolean isWindow(long arg0) throws java.rmi.RemoteException;

    public void sizeTo(long arg0, int arg1, int arg2)
            throws java.rmi.RemoteException;

    public void start(long arg0, java.lang.String arg1, java.lang.String arg2,
            java.lang.String arg3) throws java.rmi.RemoteException;

    public void close(long arg0) throws java.rmi.RemoteException;

    public boolean isVisible(long arg0) throws java.rmi.RemoteException;

    public boolean isEnabled(long arg0) throws java.rmi.RemoteException;

    public void keyDown(long arg0, int arg1) throws java.rmi.RemoteException;

    public void keyUp(long arg0, int arg1) throws java.rmi.RemoteException;

    public void mouseDown(long arg0, int arg1, int arg2, int arg3,
            boolean arg4, boolean arg5, boolean arg6)
            throws java.rmi.RemoteException;

    public void mouseUp(long arg0, int arg1, int arg2, int arg3, boolean arg4,
            boolean arg5, boolean arg6) throws java.rmi.RemoteException;

    public void move(long arg0, int arg1, int arg2, int arg3, int arg4)
            throws java.rmi.RemoteException;

    public java.lang.String getText(long arg0) throws java.rmi.RemoteException;

    public void activate(long arg0) throws java.rmi.RemoteException;

    public void moveTo(long arg0, int arg1, int arg2)
            throws java.rmi.RemoteException;

    public void maximize(long arg0) throws java.rmi.RemoteException;

    public void minimize(long arg0) throws java.rmi.RemoteException;

    public void restore(long arg0) throws java.rmi.RemoteException;

    public void click(long arg0, int arg1, int arg2, int arg3, boolean arg4,
            boolean arg5, boolean arg6) throws java.rmi.RemoteException;

    public long getMenu(long arg0) throws java.rmi.RemoteException;

    public boolean isNormal(long arg0) throws java.rmi.RemoteException;
}
