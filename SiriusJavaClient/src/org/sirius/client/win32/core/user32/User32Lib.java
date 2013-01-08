/**
 * User32Lib.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.user32;

public interface User32Lib extends java.rmi.Remote {
	public boolean getLayeredWindowAttributes(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.IntByReference arg1,
			org.sirius.client.win32.core.user32.ByteByReference arg2,
			org.sirius.client.win32.core.user32.IntByReference arg3)
			throws java.rmi.RemoteException;

	public int getWindowModuleFileName(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.apache.axis.types.UnsignedShort[] arg1, int arg2)
			throws java.rmi.RemoteException;

	public int getWindowThreadProcessId(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.IntByReference arg1)
			throws java.rmi.RemoteException;

	public boolean closeWindow(org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException;

	public boolean destroyIcon(org.sirius.client.win32.core.user32.Hicon arg0)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Hwnd findWindow(
			java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException;

	public int getClassName(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.apache.axis.types.UnsignedShort[] arg1, int arg2)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Hdc getDC(
			org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException;

	public int getMessage(org.sirius.client.win32.core.user32.Msg arg0,
			org.sirius.client.win32.core.user32.Hwnd arg1, int arg2, int arg3)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Hwnd getWindow(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Dword arg1)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Hicon loadIcon(
			org.sirius.client.win32.core.user32.Hinstance arg0,
			java.lang.String arg1) throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Handle loadImage(
			org.sirius.client.win32.core.user32.Hinstance arg0,
			java.lang.String arg1, int arg2, int arg3, int arg4, int arg5)
			throws java.rmi.RemoteException;

	public boolean moveWindow(org.sirius.client.win32.core.user32.Hwnd arg0,
			int arg1, int arg2, int arg3, int arg4, boolean arg5)
			throws java.rmi.RemoteException;

	public boolean peekMessage(org.sirius.client.win32.core.user32.Msg arg0,
			org.sirius.client.win32.core.user32.Hwnd arg1, int arg2, int arg3,
			int arg4) throws java.rmi.RemoteException;

	public void postMessage(org.sirius.client.win32.core.user32.Hwnd arg0,
			int arg1, org.sirius.client.win32.core.user32.Wparam arg2,
			org.sirius.client.win32.core.user32.Lparam arg3)
			throws java.rmi.RemoteException;

	public boolean redrawWindow(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.ProcessInfoByReference arg1,
			org.sirius.client.win32.core.user32.Hrgn arg2,
			org.sirius.client.win32.core.user32.Dword arg3)
			throws java.rmi.RemoteException;

	public int releaseDC(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Hdc arg1)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Dword sendInput(
			org.sirius.client.win32.core.user32.Dword arg0,
			org.sirius.client.win32.core.user32.Input[] arg1, int arg2)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Hwnd setFocus(
			org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Hwnd setParent(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Hwnd arg1)
			throws java.rmi.RemoteException;

	public boolean setWindowPos(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Hwnd arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) throws java.rmi.RemoteException;

	public int setWindowRgn(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Hrgn arg1, boolean arg2)
			throws java.rmi.RemoteException;

	public boolean showWindow(org.sirius.client.win32.core.user32.Hwnd arg0,
			int arg1) throws java.rmi.RemoteException;

	public boolean updateWindow(org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException;

	public boolean attachThreadInput(
			org.sirius.client.win32.core.user32.Dword arg0,
			org.sirius.client.win32.core.user32.Dword arg1, boolean arg2)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Lresult callNextHookEx(
			org.sirius.client.win32.core.user32.Hhook arg0, int arg1,
			org.sirius.client.win32.core.user32.Wparam arg2,
			org.sirius.client.win32.core.user32.Lparam arg3)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Lresult callNextHookEx2(
			org.sirius.client.win32.core.user32.Hhook arg0, int arg1,
			org.sirius.client.win32.core.user32.Wparam arg2,
			org.sirius.client.win32.core.user32.Pointer arg3)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Lresult dispatchMessage(
			org.sirius.client.win32.core.user32.Msg arg0)
			throws java.rmi.RemoteException;

	public boolean flashWindowEx(
			org.sirius.client.win32.core.user32.Flashwinfo arg0)
			throws java.rmi.RemoteException;

	public short getAsyncKeyState(int arg0) throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Hwnd getForegroundWindow()
			throws java.rmi.RemoteException;

	public boolean getGUIThreadInfo(int arg0,
			org.sirius.client.win32.core.user32.Guithreadinfo arg1)
			throws java.rmi.RemoteException;

	public boolean getKeyboardState(byte[] arg0)
			throws java.rmi.RemoteException;

	public boolean getLastInputInfo(
			org.sirius.client.win32.core.user32.Lastinputinfo arg0)
			throws java.rmi.RemoteException;

	public int getSystemMetrics(int arg0) throws java.rmi.RemoteException;

	public boolean getWindowInfo(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Windowinfo arg1)
			throws java.rmi.RemoteException;

	public int getWindowLong(org.sirius.client.win32.core.user32.Hwnd arg0,
			int arg1) throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.LongPTR getWindowLongPtr(
			org.sirius.client.win32.core.user32.Hwnd arg0, int arg1)
			throws java.rmi.RemoteException;

	public boolean getWindowRect(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Rect arg1)
			throws java.rmi.RemoteException;

	public int getWindowText(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.apache.axis.types.UnsignedShort[] arg1, int arg2)
			throws java.rmi.RemoteException;

	public int getWindowTextLength(org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException;

	public boolean invalidateRect(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.ProcessInfoByReference arg1,
			boolean arg2) throws java.rmi.RemoteException;

	public boolean isWindowVisible(org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException;

	public void postQuitMessage(int arg0) throws java.rmi.RemoteException;

	public boolean registerHotKey(
			org.sirius.client.win32.core.user32.Hwnd arg0, int arg1, int arg2,
			int arg3) throws java.rmi.RemoteException;

	public boolean setForegroundWindow(
			org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException;

	public int setWindowLong(org.sirius.client.win32.core.user32.Hwnd arg0,
			int arg1, int arg2) throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Pointer setWindowLong2(
			org.sirius.client.win32.core.user32.Hwnd arg0, int arg1,
			org.sirius.client.win32.core.user32.Pointer arg2)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.LongPTR setWindowLongPtr(
			org.sirius.client.win32.core.user32.Hwnd arg0, int arg1,
			org.sirius.client.win32.core.user32.LongPTR arg2)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Pointer setWindowLongPtr2(
			org.sirius.client.win32.core.user32.Hwnd arg0, int arg1,
			org.sirius.client.win32.core.user32.Pointer arg2)
			throws java.rmi.RemoteException;

	public boolean translateMessage(org.sirius.client.win32.core.user32.Msg arg0)
			throws java.rmi.RemoteException;

	public boolean unhookWindowsHookEx(
			org.sirius.client.win32.core.user32.Hhook arg0)
			throws java.rmi.RemoteException;

	public boolean unregisterHotKey(
			org.sirius.client.win32.core.user32.Pointer arg0, int arg1)
			throws java.rmi.RemoteException;

	public boolean updateLayeredWindow(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Hdc arg1,
			org.sirius.client.win32.core.user32.Point arg2,
			org.sirius.client.win32.core.user32.Size arg3,
			org.sirius.client.win32.core.user32.Hdc arg4,
			org.sirius.client.win32.core.user32.Point arg5, int arg6,
			org.sirius.client.win32.core.user32.Blendfunction arg7, int arg8)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.user32.Dword waitForInputIdle(
			org.sirius.client.win32.core.user32.Handle arg0,
			org.sirius.client.win32.core.user32.Dword arg1)
			throws java.rmi.RemoteException;

	public boolean setLayeredWindowAttributes(
			org.sirius.client.win32.core.user32.Hwnd arg0, int arg1, byte arg2,
			int arg3) throws java.rmi.RemoteException;
}
