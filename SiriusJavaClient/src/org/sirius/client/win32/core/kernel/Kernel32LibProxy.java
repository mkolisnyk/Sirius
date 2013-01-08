package org.sirius.client.win32.core.kernel;

public class Kernel32LibProxy implements
		org.sirius.client.win32.core.kernel.Kernel32Lib {
	private String _endpoint = null;
	private org.sirius.client.win32.core.kernel.Kernel32Lib kernel32Lib = null;

	public Kernel32LibProxy() {
		_initKernel32LibProxy();
	}

	public Kernel32LibProxy(String endpoint) {
		_endpoint = endpoint;
		_initKernel32LibProxy();
	}

	private void _initKernel32LibProxy() {
		try {
			kernel32Lib = (new org.sirius.client.win32.core.kernel.Kernel32LibServiceLocator())
					.getKernel32LibPort();
			if (kernel32Lib != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) kernel32Lib)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) kernel32Lib)
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
		if (kernel32Lib != null)
			((javax.xml.rpc.Stub) kernel32Lib)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public org.sirius.client.win32.core.kernel.Kernel32Lib getKernel32Lib() {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib;
	}

	public boolean closeHandle(org.sirius.client.win32.core.kernel.Handle arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.closeHandle(arg0);
	}

	public org.sirius.client.win32.core.kernel.Pointer localFree(
			org.sirius.client.win32.core.kernel.Pointer arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.localFree(arg0);
	}

	public boolean deleteFile(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.deleteFile(arg0);
	}

	public org.sirius.client.win32.core.kernel.Handle createFile(
			java.lang.String arg0, int arg1, int arg2,
			org.sirius.client.win32.core.kernel.SecurityATTRIBUTES arg3,
			int arg4, int arg5, org.sirius.client.win32.core.kernel.Handle arg6)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.createFile(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public int getDriveType(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getDriveType(arg0);
	}

	public boolean moveFileEx(java.lang.String arg0, java.lang.String arg1,
			org.sirius.client.win32.core.kernel.Dword arg2)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.moveFileEx(arg0, arg1, arg2);
	}

	public int setFileTime(org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.Filetime arg1,
			org.sirius.client.win32.core.kernel.Filetime arg2,
			org.sirius.client.win32.core.kernel.Filetime arg3)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.setFileTime(arg0, arg1, arg2, arg3);
	}

	public org.sirius.client.win32.core.kernel.Handle createIoCompletionPort(
			org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.Handle arg1,
			org.sirius.client.win32.core.kernel.Pointer arg2, int arg3)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.createIoCompletionPort(arg0, arg1, arg2, arg3);
	}

	public boolean getQueuedCompletionStatus(
			org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.IntByReference arg1,
			org.sirius.client.win32.core.kernel.UlongPTRByReference arg2,
			org.sirius.client.win32.core.kernel.PointerByReference arg3,
			int arg4) throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getQueuedCompletionStatus(arg0, arg1, arg2, arg3,
				arg4);
	}

	public boolean postQueuedCompletionStatus(
			org.sirius.client.win32.core.kernel.Handle arg0, int arg1,
			org.sirius.client.win32.core.kernel.Pointer arg2,
			org.sirius.client.win32.core.kernel.Overlapped arg3)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.postQueuedCompletionStatus(arg0, arg1, arg2, arg3);
	}

	public boolean createDirectory(java.lang.String arg0,
			org.sirius.client.win32.core.kernel.SecurityATTRIBUTES arg1)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.createDirectory(arg0, arg1);
	}

	public int getFileAttributes(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getFileAttributes(arg0);
	}

	public int formatMessage(int arg0,
			org.sirius.client.win32.core.kernel.Pointer arg1, int arg2,
			int arg3, org.sirius.client.win32.core.kernel.Buffer arg4,
			int arg5, org.sirius.client.win32.core.kernel.Pointer arg6)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.formatMessage(arg0, arg1, arg2, arg3, arg4, arg5,
				arg6);
	}

	public org.sirius.client.win32.core.kernel.Handle getCurrentProcess()
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getCurrentProcess();
	}

	public org.sirius.client.win32.core.kernel.Handle getCurrentThread()
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getCurrentThread();
	}

	public boolean setFileAttributes(java.lang.String arg0,
			org.sirius.client.win32.core.kernel.Dword arg1)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.setFileAttributes(arg0, arg1);
	}

	public org.sirius.client.win32.core.kernel.Handle createFileMapping(
			org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.SecurityATTRIBUTES arg1,
			int arg2, int arg3, int arg4, java.lang.String arg5)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib
				.createFileMapping(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public boolean deviceIoControl(
			org.sirius.client.win32.core.kernel.Handle arg0, int arg1,
			org.sirius.client.win32.core.kernel.Pointer arg2, int arg3,
			org.sirius.client.win32.core.kernel.Pointer arg4, int arg5,
			org.sirius.client.win32.core.kernel.IntByReference arg6,
			org.sirius.client.win32.core.kernel.Pointer arg7)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.deviceIoControl(arg0, arg1, arg2, arg3, arg4, arg5,
				arg6, arg7);
	}

	public boolean duplicateHandle(
			org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.Handle arg1,
			org.sirius.client.win32.core.kernel.Handle arg2,
			org.sirius.client.win32.core.kernel.HandleByReference arg3,
			int arg4, boolean arg5, int arg6) throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.duplicateHandle(arg0, arg1, arg2, arg3, arg4, arg5,
				arg6);
	}

	public int formatMessage2(int arg0,
			org.sirius.client.win32.core.kernel.Pointer arg1, int arg2,
			int arg3, org.sirius.client.win32.core.kernel.Pointer arg4,
			int arg5, org.sirius.client.win32.core.kernel.Pointer arg6)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.formatMessage2(arg0, arg1, arg2, arg3, arg4, arg5,
				arg6);
	}

	public int formatMessage3(int arg0,
			org.sirius.client.win32.core.kernel.Pointer arg1, int arg2,
			int arg3,
			org.sirius.client.win32.core.kernel.PointerByReference arg4,
			int arg5, org.sirius.client.win32.core.kernel.Pointer arg6)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.formatMessage3(arg0, arg1, arg2, arg3, arg4, arg5,
				arg6);
	}

	public boolean getComputerName(org.apache.axis.types.UnsignedShort[] arg0,
			org.sirius.client.win32.core.kernel.IntByReference arg1)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getComputerName(arg0, arg1);
	}

	public int getCurrentProcessId() throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getCurrentProcessId();
	}

	public int getCurrentThreadId() throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getCurrentThreadId();
	}

	public boolean getExitCodeProcess(
			org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.IntByReference arg1)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getExitCodeProcess(arg0, arg1);
	}

	public org.sirius.client.win32.core.kernel.Hmodule getModuleHandle(
			java.lang.String arg0) throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getModuleHandle(arg0);
	}

	public int getProcessVersion(int arg0) throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getProcessVersion(arg0);
	}

	public int getShortPathName(java.lang.String arg0,
			org.apache.axis.types.UnsignedShort[] arg1, int arg2)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getShortPathName(arg0, arg1, arg2);
	}

	public boolean getVersionEx2(
			org.sirius.client.win32.core.kernel.Osversioninfoex arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getVersionEx2(arg0);
	}

	public boolean globalMemoryStatusEx(
			org.sirius.client.win32.core.kernel.Memorystatusex arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.globalMemoryStatusEx(arg0);
	}

	public boolean isWow64Process(
			org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.IntByReference arg1)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.isWow64Process(arg0, arg1);
	}

	public org.sirius.client.win32.core.kernel.Pointer mapViewOfFile(
			org.sirius.client.win32.core.kernel.Handle arg0, int arg1,
			int arg2, int arg3, int arg4) throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.mapViewOfFile(arg0, arg1, arg2, arg3, arg4);
	}

	public boolean setHandleInformation(
			org.sirius.client.win32.core.kernel.Handle arg0, int arg1, int arg2)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.setHandleInformation(arg0, arg1, arg2);
	}

	public boolean terminateProcess(
			org.sirius.client.win32.core.kernel.Handle arg0, int arg1)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.terminateProcess(arg0, arg1);
	}

	public boolean unmapViewOfFile(
			org.sirius.client.win32.core.kernel.Pointer arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.unmapViewOfFile(arg0);
	}

	public int waitForSingleObject(
			org.sirius.client.win32.core.kernel.Handle arg0, int arg1)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.waitForSingleObject(arg0, arg1);
	}

	public org.sirius.client.win32.core.kernel.Handle createToolhelp32Snapshot(
			org.sirius.client.win32.core.kernel.Dword arg0,
			org.sirius.client.win32.core.kernel.Dword arg1)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.createToolhelp32Snapshot(arg0, arg1);
	}

	public int getEnvironmentVariable(java.lang.String arg0,
			org.apache.axis.types.UnsignedShort[] arg1, int arg2)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getEnvironmentVariable(arg0, arg1, arg2);
	}

	public org.sirius.client.win32.core.kernel.Dword getLogicalDriveStrings(
			org.sirius.client.win32.core.kernel.Dword arg0,
			org.apache.axis.types.UnsignedShort[] arg1)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getLogicalDriveStrings(arg0, arg1);
	}

	public boolean setEnvironmentVariable(java.lang.String arg0,
			java.lang.String arg1) throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.setEnvironmentVariable(arg0, arg1);
	}

	public int waitForMultipleObjects(int arg0,
			org.sirius.client.win32.core.kernel.Handle[] arg1, boolean arg2,
			int arg3) throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.waitForMultipleObjects(arg0, arg1, arg2, arg3);
	}

	public boolean copyFile(java.lang.String arg0, java.lang.String arg1,
			boolean arg2) throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.copyFile(arg0, arg1, arg2);
	}

	public org.sirius.client.win32.core.kernel.Handle createEvent(
			org.sirius.client.win32.core.kernel.SecurityATTRIBUTES arg0,
			boolean arg1, boolean arg2, java.lang.String arg3)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.createEvent(arg0, arg1, arg2, arg3);
	}

	public int getFileType(org.sirius.client.win32.core.kernel.Handle arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getFileType(arg0);
	}

	public int getLastError() throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getLastError();
	}

	public int getProcessId(org.sirius.client.win32.core.kernel.Handle arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getProcessId(arg0);
	}

	public org.sirius.client.win32.core.kernel.Dword getTempPath(
			org.sirius.client.win32.core.kernel.Dword arg0,
			org.apache.axis.types.UnsignedShort[] arg1)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getTempPath(arg0, arg1);
	}

	public int getTickCount() throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getTickCount();
	}

	public org.sirius.client.win32.core.kernel.Dword getVersion()
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getVersion();
	}

	public boolean getVersionEx(
			org.sirius.client.win32.core.kernel.Osversioninfo arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.getVersionEx(arg0);
	}

	public org.sirius.client.win32.core.kernel.Pointer globalFree(
			org.sirius.client.win32.core.kernel.Pointer arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.globalFree(arg0);
	}

	public org.sirius.client.win32.core.kernel.Pointer localAlloc(int arg0,
			int arg1) throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.localAlloc(arg0, arg1);
	}

	public boolean moveFile(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.moveFile(arg0, arg1);
	}

	public org.sirius.client.win32.core.kernel.Handle openProcess(int arg0,
			boolean arg1, int arg2) throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.openProcess(arg0, arg1, arg2);
	}

	public org.sirius.client.win32.core.kernel.Handle openThread(int arg0,
			boolean arg1, int arg2) throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.openThread(arg0, arg1, arg2);
	}

	public boolean pulseEvent(org.sirius.client.win32.core.kernel.Handle arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.pulseEvent(arg0);
	}

	public boolean readFile(org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.Buffer arg1, int arg2,
			org.sirius.client.win32.core.kernel.IntByReference arg3,
			org.sirius.client.win32.core.kernel.Overlapped arg4)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.readFile(arg0, arg1, arg2, arg3, arg4);
	}

	public boolean readFile2(org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.Pointer arg1, int arg2,
			org.sirius.client.win32.core.kernel.IntByReference arg3,
			org.sirius.client.win32.core.kernel.Overlapped arg4)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.readFile2(arg0, arg1, arg2, arg3, arg4);
	}

	public boolean setEvent(org.sirius.client.win32.core.kernel.Handle arg0)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.setEvent(arg0);
	}

	public void setLastError(int arg0) throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		kernel32Lib.setLastError(arg0);
	}

	public boolean writeFile(org.sirius.client.win32.core.kernel.Handle arg0,
			byte[] arg1, int arg2,
			org.sirius.client.win32.core.kernel.IntByReference arg3,
			org.sirius.client.win32.core.kernel.Overlapped arg4)
			throws java.rmi.RemoteException {
		if (kernel32Lib == null)
			_initKernel32LibProxy();
		return kernel32Lib.writeFile(arg0, arg1, arg2, arg3, arg4);
	}

}