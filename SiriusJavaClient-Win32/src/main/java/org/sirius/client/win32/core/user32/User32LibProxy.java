package org.sirius.client.win32.core.user32;

public class User32LibProxy implements
		org.sirius.client.win32.core.user32.User32Lib {
	private String _endpoint = null;
	private org.sirius.client.win32.core.user32.User32Lib user32Lib = null;

	public User32LibProxy() {
		_initUser32LibProxy();
	}

	public User32LibProxy(String endpoint) {
		_endpoint = endpoint;
		_initUser32LibProxy();
	}

	private void _initUser32LibProxy() {
		try {
			user32Lib = (new org.sirius.client.win32.core.user32.User32LibServiceLocator())
					.getUser32LibPort();
			if (user32Lib != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) user32Lib)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) user32Lib)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (user32Lib != null)
			((javax.xml.rpc.Stub) user32Lib)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public org.sirius.client.win32.core.user32.User32Lib getUser32Lib() {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib;
	}

	public boolean getLayeredWindowAttributes(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.IntByReference arg1,
			org.sirius.client.win32.core.user32.ByteByReference arg2,
			org.sirius.client.win32.core.user32.IntByReference arg3)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getLayeredWindowAttributes(arg0, arg1, arg2, arg3);
	}

	public int getWindowModuleFileName(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.apache.axis.types.UnsignedShort[] arg1, int arg2)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getWindowModuleFileName(arg0, arg1, arg2);
	}

	public int getWindowThreadProcessId(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.IntByReference arg1)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getWindowThreadProcessId(arg0, arg1);
	}

	public boolean closeWindow(org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.closeWindow(arg0);
	}

	public boolean destroyIcon(org.sirius.client.win32.core.user32.Hicon arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.destroyIcon(arg0);
	}

	public org.sirius.client.win32.core.user32.Hwnd findWindow(
			java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.findWindow(arg0, arg1);
	}

	public int getClassName(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.apache.axis.types.UnsignedShort[] arg1, int arg2)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getClassName(arg0, arg1, arg2);
	}

	public org.sirius.client.win32.core.user32.Hdc getDC(
			org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getDC(arg0);
	}

	public int getMessage(org.sirius.client.win32.core.user32.Msg arg0,
			org.sirius.client.win32.core.user32.Hwnd arg1, int arg2, int arg3)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getMessage(arg0, arg1, arg2, arg3);
	}

	public org.sirius.client.win32.core.user32.Hwnd getWindow(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Dword arg1)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getWindow(arg0, arg1);
	}

	public org.sirius.client.win32.core.user32.Hicon loadIcon(
			org.sirius.client.win32.core.user32.Hinstance arg0,
			java.lang.String arg1) throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.loadIcon(arg0, arg1);
	}

	public org.sirius.client.win32.core.user32.Handle loadImage(
			org.sirius.client.win32.core.user32.Hinstance arg0,
			java.lang.String arg1, int arg2, int arg3, int arg4, int arg5)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.loadImage(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public boolean moveWindow(org.sirius.client.win32.core.user32.Hwnd arg0,
			int arg1, int arg2, int arg3, int arg4, boolean arg5)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.moveWindow(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public boolean peekMessage(org.sirius.client.win32.core.user32.Msg arg0,
			org.sirius.client.win32.core.user32.Hwnd arg1, int arg2, int arg3,
			int arg4) throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.peekMessage(arg0, arg1, arg2, arg3, arg4);
	}

	public void postMessage(org.sirius.client.win32.core.user32.Hwnd arg0,
			int arg1, org.sirius.client.win32.core.user32.Wparam arg2,
			org.sirius.client.win32.core.user32.Lparam arg3)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		user32Lib.postMessage(arg0, arg1, arg2, arg3);
	}

	public boolean redrawWindow(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.ProcessInfoByReference arg1,
			org.sirius.client.win32.core.user32.Hrgn arg2,
			org.sirius.client.win32.core.user32.Dword arg3)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.redrawWindow(arg0, arg1, arg2, arg3);
	}

	public int releaseDC(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Hdc arg1)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.releaseDC(arg0, arg1);
	}

	public org.sirius.client.win32.core.user32.Dword sendInput(
			org.sirius.client.win32.core.user32.Dword arg0,
			org.sirius.client.win32.core.user32.Input[] arg1, int arg2)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.sendInput(arg0, arg1, arg2);
	}

	public org.sirius.client.win32.core.user32.Hwnd setFocus(
			org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.setFocus(arg0);
	}

	public org.sirius.client.win32.core.user32.Hwnd setParent(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Hwnd arg1)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.setParent(arg0, arg1);
	}

	public boolean setWindowPos(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Hwnd arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.setWindowPos(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public int setWindowRgn(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Hrgn arg1, boolean arg2)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.setWindowRgn(arg0, arg1, arg2);
	}

	public boolean showWindow(org.sirius.client.win32.core.user32.Hwnd arg0,
			int arg1) throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.showWindow(arg0, arg1);
	}

	public boolean updateWindow(org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.updateWindow(arg0);
	}

	public boolean attachThreadInput(
			org.sirius.client.win32.core.user32.Dword arg0,
			org.sirius.client.win32.core.user32.Dword arg1, boolean arg2)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.attachThreadInput(arg0, arg1, arg2);
	}

	public org.sirius.client.win32.core.user32.Lresult callNextHookEx(
			org.sirius.client.win32.core.user32.Hhook arg0, int arg1,
			org.sirius.client.win32.core.user32.Wparam arg2,
			org.sirius.client.win32.core.user32.Lparam arg3)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.callNextHookEx(arg0, arg1, arg2, arg3);
	}

	public org.sirius.client.win32.core.user32.Lresult callNextHookEx2(
			org.sirius.client.win32.core.user32.Hhook arg0, int arg1,
			org.sirius.client.win32.core.user32.Wparam arg2,
			org.sirius.client.win32.core.user32.Pointer arg3)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.callNextHookEx2(arg0, arg1, arg2, arg3);
	}

	public org.sirius.client.win32.core.user32.Lresult dispatchMessage(
			org.sirius.client.win32.core.user32.Msg arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.dispatchMessage(arg0);
	}

	public boolean flashWindowEx(
			org.sirius.client.win32.core.user32.Flashwinfo arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.flashWindowEx(arg0);
	}

	public short getAsyncKeyState(int arg0) throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getAsyncKeyState(arg0);
	}

	public org.sirius.client.win32.core.user32.Hwnd getForegroundWindow()
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getForegroundWindow();
	}

	public boolean getGUIThreadInfo(int arg0,
			org.sirius.client.win32.core.user32.Guithreadinfo arg1)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getGUIThreadInfo(arg0, arg1);
	}

	public boolean getKeyboardState(byte[] arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getKeyboardState(arg0);
	}

	public boolean getLastInputInfo(
			org.sirius.client.win32.core.user32.Lastinputinfo arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getLastInputInfo(arg0);
	}

	public int getSystemMetrics(int arg0) throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getSystemMetrics(arg0);
	}

	public boolean getWindowInfo(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Windowinfo arg1)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getWindowInfo(arg0, arg1);
	}

	public int getWindowLong(org.sirius.client.win32.core.user32.Hwnd arg0,
			int arg1) throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getWindowLong(arg0, arg1);
	}

	public org.sirius.client.win32.core.user32.LongPTR getWindowLongPtr(
			org.sirius.client.win32.core.user32.Hwnd arg0, int arg1)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getWindowLongPtr(arg0, arg1);
	}

	public boolean getWindowRect(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Rect arg1)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getWindowRect(arg0, arg1);
	}

	public int getWindowText(org.sirius.client.win32.core.user32.Hwnd arg0,
			org.apache.axis.types.UnsignedShort[] arg1, int arg2)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getWindowText(arg0, arg1, arg2);
	}

	public int getWindowTextLength(org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.getWindowTextLength(arg0);
	}

	public boolean invalidateRect(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.ProcessInfoByReference arg1,
			boolean arg2) throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.invalidateRect(arg0, arg1, arg2);
	}

	public boolean isWindowVisible(org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.isWindowVisible(arg0);
	}

	public void postQuitMessage(int arg0) throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		user32Lib.postQuitMessage(arg0);
	}

	public boolean registerHotKey(
			org.sirius.client.win32.core.user32.Hwnd arg0, int arg1, int arg2,
			int arg3) throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.registerHotKey(arg0, arg1, arg2, arg3);
	}

	public boolean setForegroundWindow(
			org.sirius.client.win32.core.user32.Hwnd arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.setForegroundWindow(arg0);
	}

	public int setWindowLong(org.sirius.client.win32.core.user32.Hwnd arg0,
			int arg1, int arg2) throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.setWindowLong(arg0, arg1, arg2);
	}

	public org.sirius.client.win32.core.user32.Pointer setWindowLong2(
			org.sirius.client.win32.core.user32.Hwnd arg0, int arg1,
			org.sirius.client.win32.core.user32.Pointer arg2)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.setWindowLong2(arg0, arg1, arg2);
	}

	public org.sirius.client.win32.core.user32.LongPTR setWindowLongPtr(
			org.sirius.client.win32.core.user32.Hwnd arg0, int arg1,
			org.sirius.client.win32.core.user32.LongPTR arg2)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.setWindowLongPtr(arg0, arg1, arg2);
	}

	public org.sirius.client.win32.core.user32.Pointer setWindowLongPtr2(
			org.sirius.client.win32.core.user32.Hwnd arg0, int arg1,
			org.sirius.client.win32.core.user32.Pointer arg2)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.setWindowLongPtr2(arg0, arg1, arg2);
	}

	public boolean translateMessage(org.sirius.client.win32.core.user32.Msg arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.translateMessage(arg0);
	}

	public boolean unhookWindowsHookEx(
			org.sirius.client.win32.core.user32.Hhook arg0)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.unhookWindowsHookEx(arg0);
	}

	public boolean unregisterHotKey(
			org.sirius.client.win32.core.user32.Pointer arg0, int arg1)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.unregisterHotKey(arg0, arg1);
	}

	public boolean updateLayeredWindow(
			org.sirius.client.win32.core.user32.Hwnd arg0,
			org.sirius.client.win32.core.user32.Hdc arg1,
			org.sirius.client.win32.core.user32.Point arg2,
			org.sirius.client.win32.core.user32.Size arg3,
			org.sirius.client.win32.core.user32.Hdc arg4,
			org.sirius.client.win32.core.user32.Point arg5, int arg6,
			org.sirius.client.win32.core.user32.Blendfunction arg7, int arg8)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.updateLayeredWindow(arg0, arg1, arg2, arg3, arg4,
				arg5, arg6, arg7, arg8);
	}

	public org.sirius.client.win32.core.user32.Dword waitForInputIdle(
			org.sirius.client.win32.core.user32.Handle arg0,
			org.sirius.client.win32.core.user32.Dword arg1)
			throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.waitForInputIdle(arg0, arg1);
	}

	public boolean setLayeredWindowAttributes(
			org.sirius.client.win32.core.user32.Hwnd arg0, int arg1, byte arg2,
			int arg3) throws java.rmi.RemoteException {
		if (user32Lib == null)
			_initUser32LibProxy();
		return user32Lib.setLayeredWindowAttributes(arg0, arg1, arg2, arg3);
	}

}