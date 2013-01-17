/**
 * Shell32Lib.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.shell32;

public interface Shell32Lib extends java.rmi.Remote {
	public int SHFileOperation(
			org.sirius.client.win32.core.types.Shfileopstruct arg0)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.types.Hresult SHGetFolderPath(
			org.sirius.client.win32.core.types.Hwnd arg0, int arg1,
			org.sirius.client.win32.core.types.Handle arg2,
			org.sirius.client.win32.core.types.Dword arg3,
			org.apache.axis.types.UnsignedShort[] arg4)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.types.Hresult SHGetDesktopFolder(
			org.sirius.client.win32.core.types.PointerByReference arg0)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.types.IntPTR shellExecute(
			org.sirius.client.win32.core.types.Hwnd arg0,
			java.lang.String arg1, java.lang.String arg2,
			java.lang.String arg3, java.lang.String arg4, int arg5)
			throws java.rmi.RemoteException;
}
