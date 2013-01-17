package org.sirius.client.win32.core.shell32;

public class Shell32LibProxy implements
		org.sirius.client.win32.core.shell32.Shell32Lib {
	private String _endpoint = null;
	private org.sirius.client.win32.core.shell32.Shell32Lib shell32Lib = null;

	public Shell32LibProxy() {
		_initShell32LibProxy();
	}

	public Shell32LibProxy(String endpoint) {
		_endpoint = endpoint;
		_initShell32LibProxy();
	}

	private void _initShell32LibProxy() {
		try {
			shell32Lib = (new org.sirius.client.win32.core.shell32.Shell32LibServiceLocator())
					.getShell32LibPort();
			if (shell32Lib != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) shell32Lib)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) shell32Lib)
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
		if (shell32Lib != null)
			((javax.xml.rpc.Stub) shell32Lib)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public org.sirius.client.win32.core.shell32.Shell32Lib getShell32Lib() {
		if (shell32Lib == null)
			_initShell32LibProxy();
		return shell32Lib;
	}

	public int SHFileOperation(
			org.sirius.client.win32.core.types.Shfileopstruct arg0)
			throws java.rmi.RemoteException {
		if (shell32Lib == null)
			_initShell32LibProxy();
		return shell32Lib.SHFileOperation(arg0);
	}

	public org.sirius.client.win32.core.types.Hresult SHGetFolderPath(
			org.sirius.client.win32.core.types.Hwnd arg0, int arg1,
			org.sirius.client.win32.core.types.Handle arg2,
			org.sirius.client.win32.core.types.Dword arg3,
			org.apache.axis.types.UnsignedShort[] arg4)
			throws java.rmi.RemoteException {
		if (shell32Lib == null)
			_initShell32LibProxy();
		return shell32Lib.SHGetFolderPath(arg0, arg1, arg2, arg3, arg4);
	}

	public org.sirius.client.win32.core.types.Hresult SHGetDesktopFolder(
			org.sirius.client.win32.core.types.PointerByReference arg0)
			throws java.rmi.RemoteException {
		if (shell32Lib == null)
			_initShell32LibProxy();
		return shell32Lib.SHGetDesktopFolder(arg0);
	}

	public org.sirius.client.win32.core.types.IntPTR shellExecute(
			org.sirius.client.win32.core.types.Hwnd arg0,
			java.lang.String arg1, java.lang.String arg2,
			java.lang.String arg3, java.lang.String arg4, int arg5)
			throws java.rmi.RemoteException {
		if (shell32Lib == null)
			_initShell32LibProxy();
		return shell32Lib.shellExecute(arg0, arg1, arg2, arg3, arg4, arg5);
	}

}