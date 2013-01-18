/**
 * User32Lib.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.user32;

public interface User32Lib extends java.rmi.Remote {
    public org.sirius.client.win32.core.types.Lresult callNextHookEx(org.sirius.client.win32.core.types.Hhook arg0, int arg1, org.sirius.client.win32.core.types.Wparam arg2, org.sirius.client.win32.core.types.Lparam arg3) throws java.rmi.RemoteException;
    public boolean attachThreadInput(org.sirius.client.win32.core.types.Dword arg0, org.sirius.client.win32.core.types.Dword arg1, boolean arg2) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Lresult callNextHookEx2(org.sirius.client.win32.core.types.Hhook arg0, int arg1, org.sirius.client.win32.core.types.Wparam arg2, org.sirius.client.win32.core.types.Pointer arg3) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Lresult dispatchMessage(org.sirius.client.win32.core.types.Msg arg0) throws java.rmi.RemoteException;
    public boolean flashWindowEx(org.sirius.client.win32.core.types.Flashwinfo arg0) throws java.rmi.RemoteException;
    public short getAsyncKeyState(int arg0) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Hwnd getForegroundWindow() throws java.rmi.RemoteException;
    public boolean getGUIThreadInfo(int arg0, org.sirius.client.win32.core.types.Guithreadinfo arg1) throws java.rmi.RemoteException;
    public boolean getKeyboardState(byte[] arg0) throws java.rmi.RemoteException;
    public boolean getLastInputInfo(org.sirius.client.win32.core.types.Lastinputinfo arg0) throws java.rmi.RemoteException;
    public int getSystemMetrics(int arg0) throws java.rmi.RemoteException;
    public boolean getWindowInfo(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.Windowinfo arg1) throws java.rmi.RemoteException;
    public int getWindowLong(org.sirius.client.win32.core.types.Hwnd arg0, int arg1) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.LongPTR getWindowLongPtr(org.sirius.client.win32.core.types.Hwnd arg0, int arg1) throws java.rmi.RemoteException;
    public boolean getWindowRect(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.Rect arg1) throws java.rmi.RemoteException;
    public int getWindowText(org.sirius.client.win32.core.types.Hwnd arg0, org.apache.axis.types.UnsignedShort[] arg1, int arg2) throws java.rmi.RemoteException;
    public int getWindowTextLength(org.sirius.client.win32.core.types.Hwnd arg0) throws java.rmi.RemoteException;
    public boolean invalidateRect(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.ProcessInfoByReference arg1, boolean arg2) throws java.rmi.RemoteException;
    public boolean isWindowVisible(org.sirius.client.win32.core.types.Hwnd arg0) throws java.rmi.RemoteException;
    public void postQuitMessage(int arg0) throws java.rmi.RemoteException;
    public boolean registerHotKey(org.sirius.client.win32.core.types.Hwnd arg0, int arg1, int arg2, int arg3) throws java.rmi.RemoteException;
    public boolean setForegroundWindow(org.sirius.client.win32.core.types.Hwnd arg0) throws java.rmi.RemoteException;
    public int setWindowLong(org.sirius.client.win32.core.types.Hwnd arg0, int arg1, int arg2) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Pointer setWindowLong2(org.sirius.client.win32.core.types.Hwnd arg0, int arg1, org.sirius.client.win32.core.types.Pointer arg2) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.LongPTR setWindowLongPtr(org.sirius.client.win32.core.types.Hwnd arg0, int arg1, org.sirius.client.win32.core.types.LongPTR arg2) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Pointer setWindowLongPtr2(org.sirius.client.win32.core.types.Hwnd arg0, int arg1, org.sirius.client.win32.core.types.Pointer arg2) throws java.rmi.RemoteException;
    public boolean translateMessage(org.sirius.client.win32.core.types.Msg arg0) throws java.rmi.RemoteException;
    public boolean unhookWindowsHookEx(org.sirius.client.win32.core.types.Hhook arg0) throws java.rmi.RemoteException;
    public boolean unregisterHotKey(org.sirius.client.win32.core.types.Pointer arg0, int arg1) throws java.rmi.RemoteException;
    public boolean updateLayeredWindow(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.Hdc arg1, org.sirius.client.win32.core.types.Point arg2, org.sirius.client.win32.core.types.Size arg3, org.sirius.client.win32.core.types.Hdc arg4, org.sirius.client.win32.core.types.Point arg5, int arg6, org.sirius.client.win32.core.types.Blendfunction arg7, int arg8) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Dword waitForInputIdle(org.sirius.client.win32.core.types.Handle arg0, org.sirius.client.win32.core.types.Dword arg1) throws java.rmi.RemoteException;
    public boolean getMenuBarInfo(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types._long arg1, org.sirius.client.win32.core.types._long arg2, org.sirius.client.win32.core.types.Menubarinfo arg3) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Uint getMenuDefaultItem(org.sirius.client.win32.core.types.Hmenu arg0, org.sirius.client.win32.core.types.Uint arg1, org.sirius.client.win32.core.types.Uint arg2) throws java.rmi.RemoteException;
    public int getMenuItemCount(org.sirius.client.win32.core.types.Hmenu arg0) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Uint getMenuItemID(org.sirius.client.win32.core.types.Hmenu arg0, int arg1) throws java.rmi.RemoteException;
    public boolean getMenuItemInfo(org.sirius.client.win32.core.types.Hmenu arg0, org.sirius.client.win32.core.types.Uint arg1, boolean arg2, org.sirius.client.win32.core.types.Menuiteminfo arg3) throws java.rmi.RemoteException;
    public boolean getMenuItemRect(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.Hmenu arg1, org.sirius.client.win32.core.types.Uint arg2, org.sirius.client.win32.core.types.Rect arg3) throws java.rmi.RemoteException;
    public int getMenuString(org.sirius.client.win32.core.types.Hmenu arg0, org.sirius.client.win32.core.types.Uint arg1, org.apache.axis.types.UnsignedShort[] arg2, int arg3, org.sirius.client.win32.core.types.Uint arg4) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Hmenu getSystemMenu(org.sirius.client.win32.core.types.Hwnd arg0, boolean arg1) throws java.rmi.RemoteException;
    public int getWindowModuleFileName(org.sirius.client.win32.core.types.Hwnd arg0, org.apache.axis.types.UnsignedShort[] arg1, int arg2) throws java.rmi.RemoteException;
    public boolean getLayeredWindowAttributes(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.IntByReference arg1, org.sirius.client.win32.core.types.ByteByReference arg2, org.sirius.client.win32.core.types.IntByReference arg3) throws java.rmi.RemoteException;
    public int getWindowThreadProcessId(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.IntByReference arg1) throws java.rmi.RemoteException;
    public boolean setLayeredWindowAttributes(org.sirius.client.win32.core.types.Hwnd arg0, int arg1, byte arg2, int arg3) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types._long getMenuCheckMarkDimensions() throws java.rmi.RemoteException;
    public boolean closeWindow(org.sirius.client.win32.core.types.Hwnd arg0) throws java.rmi.RemoteException;
    public boolean destroyIcon(org.sirius.client.win32.core.types.Hicon arg0) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Hwnd findWindow(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public int getClassName(org.sirius.client.win32.core.types.Hwnd arg0, org.apache.axis.types.UnsignedShort[] arg1, int arg2) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Hdc getDC(org.sirius.client.win32.core.types.Hwnd arg0) throws java.rmi.RemoteException;
    public int getMessage(org.sirius.client.win32.core.types.Msg arg0, org.sirius.client.win32.core.types.Hwnd arg1, int arg2, int arg3) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Hwnd getWindow(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.Dword arg1) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Hicon loadIcon(org.sirius.client.win32.core.types.Hinstance arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Handle loadImage(org.sirius.client.win32.core.types.Hinstance arg0, java.lang.String arg1, int arg2, int arg3, int arg4, int arg5) throws java.rmi.RemoteException;
    public boolean moveWindow(org.sirius.client.win32.core.types.Hwnd arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) throws java.rmi.RemoteException;
    public boolean peekMessage(org.sirius.client.win32.core.types.Msg arg0, org.sirius.client.win32.core.types.Hwnd arg1, int arg2, int arg3, int arg4) throws java.rmi.RemoteException;
    public void postMessage(org.sirius.client.win32.core.types.Hwnd arg0, int arg1, org.sirius.client.win32.core.types.Wparam arg2, org.sirius.client.win32.core.types.Lparam arg3) throws java.rmi.RemoteException;
    public boolean redrawWindow(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.ProcessInfoByReference arg1, org.sirius.client.win32.core.types.Hrgn arg2, org.sirius.client.win32.core.types.Dword arg3) throws java.rmi.RemoteException;
    public int releaseDC(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.Hdc arg1) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Dword sendInput(org.sirius.client.win32.core.types.Dword arg0, org.sirius.client.win32.core.types.Input[] arg1, int arg2) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Hwnd setFocus(org.sirius.client.win32.core.types.Hwnd arg0) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Hwnd setParent(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.Hwnd arg1) throws java.rmi.RemoteException;
    public boolean setWindowPos(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.Hwnd arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws java.rmi.RemoteException;
    public int setWindowRgn(org.sirius.client.win32.core.types.Hwnd arg0, org.sirius.client.win32.core.types.Hrgn arg1, boolean arg2) throws java.rmi.RemoteException;
    public boolean showWindow(org.sirius.client.win32.core.types.Hwnd arg0, int arg1) throws java.rmi.RemoteException;
    public boolean updateWindow(org.sirius.client.win32.core.types.Hwnd arg0) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Hmenu getMenu(org.sirius.client.win32.core.types.Hwnd arg0) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Hmenu getSubMenu(org.sirius.client.win32.core.types.Hmenu arg0, int arg1) throws java.rmi.RemoteException;
    public boolean getMenuInfo(org.sirius.client.win32.core.types.Hmenu arg0, org.sirius.client.win32.core.types.Menuinfo arg1) throws java.rmi.RemoteException;
    public org.sirius.client.win32.core.types.Uint getMenuState(org.sirius.client.win32.core.types.Hmenu arg0, org.sirius.client.win32.core.types.Uint arg1, org.sirius.client.win32.core.types.Uint arg2) throws java.rmi.RemoteException;
}
