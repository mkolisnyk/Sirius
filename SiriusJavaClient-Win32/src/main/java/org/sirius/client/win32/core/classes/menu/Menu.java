/**
 * Menu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.classes.menu;

public interface Menu extends java.rmi.Remote {
    public int getMenuItemCount(long arg0) throws java.rmi.RemoteException;

    public int getMenuString(long arg0, int arg1,
            org.apache.axis.types.UnsignedShort[] arg2, int arg3, int arg4)
            throws java.rmi.RemoteException;

    public boolean getMenuInfo(long arg0,
            org.sirius.client.win32.core.types.Menuinfo arg1)
            throws java.rmi.RemoteException;

    public long getSubMenu(long arg0, int arg1) throws java.rmi.RemoteException;

    public int getMenuDefaultItem(long arg0, int arg1, int arg2)
            throws java.rmi.RemoteException;

    public int getMenuItemID(long arg0, int arg1)
            throws java.rmi.RemoteException;

    public boolean getMenuItemInfo(long arg0, int arg1, boolean arg2,
            org.sirius.client.win32.core.types.Menuiteminfo arg3)
            throws java.rmi.RemoteException;

    public boolean getMenuItemRect(long arg0, long arg1, int arg2,
            org.sirius.client.win32.core.types.Rect arg3)
            throws java.rmi.RemoteException;

    public boolean isMenu(long arg0) throws java.rmi.RemoteException;

    public int getMenuState(long arg0, int arg1, int arg2)
            throws java.rmi.RemoteException;

    public boolean pickItem(long arg0, long arg1, int arg2)
            throws java.rmi.RemoteException;
}
