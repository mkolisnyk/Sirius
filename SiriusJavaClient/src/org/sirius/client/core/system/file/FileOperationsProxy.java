package org.sirius.client.core.system.file;

public class FileOperationsProxy implements
		org.sirius.client.core.system.file.FileOperations {
	private String _endpoint = null;
	private org.sirius.client.core.system.file.FileOperations fileOperations = null;

	public FileOperationsProxy() {
		_initFileOperationsProxy();
	}

	public FileOperationsProxy(String endpoint) {
		_endpoint = endpoint;
		_initFileOperationsProxy();
	}

	private void _initFileOperationsProxy() {
		try {
			fileOperations = (new org.sirius.client.core.system.file.FileOperationsServiceLocator())
					.getFileOperationsPort();
			if (fileOperations != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) fileOperations)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) fileOperations)
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
		if (fileOperations != null)
			((javax.xml.rpc.Stub) fileOperations)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public org.sirius.client.core.system.file.FileOperations getFileOperations() {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations;
	}

	@Override
	public java.lang.String[] getContentsEx(java.lang.String arg0, boolean arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.getContentsEx(arg0, arg1);
	}

	@Override
	public boolean copyEx(java.lang.String arg0, java.lang.String arg1,
			boolean arg2) throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.copyEx(arg0, arg1, arg2);
	}

	@Override
	public boolean createFile(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.createFile(arg0);
	}

	@Override
	public java.lang.String[] getContentsEx2(java.lang.String arg0, int arg1,
			int arg2) throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.getContentsEx2(arg0, arg1, arg2);
	}

	@Override
	public boolean appendEx(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.appendEx(arg0, arg1);
	}

	@Override
	public boolean createFileEx(java.lang.String arg0, boolean arg1)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.createFileEx(arg0, arg1);
	}

	@Override
	public byte[] getAllBytes(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.getAllBytes(arg0);
	}

	@Override
	public boolean moveEx(java.lang.String arg0, java.lang.String arg1,
			boolean arg2) throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.moveEx(arg0, arg1, arg2);
	}

	@Override
	public boolean writeEx(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.writeEx(arg0, arg1);
	}

	@Override
	public boolean append(java.lang.String arg0, byte[] arg1)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.append(arg0, arg1);
	}

	@Override
	public long size(java.lang.String arg0) throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.size(arg0);
	}

	@Override
	public boolean write(java.lang.String arg0, byte[] arg1)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.write(arg0, arg1);
	}

	@Override
	public boolean copy(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.copy(arg0, arg1);
	}

	@Override
	public boolean delete(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.delete(arg0);
	}

	@Override
	public boolean exists(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.exists(arg0);
	}

	@Override
	public java.lang.String[] head(java.lang.String arg0, int arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.head(arg0, arg1);
	}

	@Override
	public java.lang.String[] tail(java.lang.String arg0, int arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.tail(arg0, arg1);
	}

	@Override
	public boolean move(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.move(arg0, arg1);
	}

	@Override
	public java.lang.String[] getContents(java.lang.String arg0)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.getContents(arg0);
	}

}