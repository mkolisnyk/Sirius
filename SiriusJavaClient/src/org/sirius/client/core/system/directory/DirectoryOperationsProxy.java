package org.sirius.client.core.system.directory;

public class DirectoryOperationsProxy implements
		org.sirius.client.core.system.directory.DirectoryOperations {
	private String _endpoint = null;
	private org.sirius.client.core.system.directory.DirectoryOperations directoryOperations = null;

	public DirectoryOperationsProxy() {
		_initDirectoryOperationsProxy();
	}

	public DirectoryOperationsProxy(String endpoint) {
		_endpoint = endpoint;
		_initDirectoryOperationsProxy();
	}

	private void _initDirectoryOperationsProxy() {
		try {
			directoryOperations = (new org.sirius.client.core.system.directory.DirectoryOperationsServiceLocator())
					.getDirectoryOperationsPort();
			if (directoryOperations != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) directoryOperations)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) directoryOperations)
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
		if (directoryOperations != null)
			((javax.xml.rpc.Stub) directoryOperations)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public org.sirius.client.core.system.directory.DirectoryOperations getDirectoryOperations() {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations;
	}

	@Override
	public boolean moveDirectoryEx(java.lang.String arg0,
			java.lang.String arg1, boolean arg2)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.directory.IOException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.moveDirectoryEx(arg0, arg1, arg2);
	}

	@Override
	public boolean moveDirectory(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.directory.IOException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.moveDirectory(arg0, arg1);
	}

	@Override
	public java.lang.String[] getContentsEx(java.lang.String arg0, boolean arg1)
			throws java.rmi.RemoteException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.getContentsEx(arg0, arg1);
	}

	@Override
	public boolean createDirectoryEx(java.lang.String arg0, boolean arg1)
			throws java.rmi.RemoteException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.createDirectoryEx(arg0, arg1);
	}

	@Override
	public boolean copyEx(java.lang.String arg0, java.lang.String arg1,
			boolean arg2) throws java.rmi.RemoteException,
			org.sirius.client.core.system.directory.IOException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.copyEx(arg0, arg1, arg2);
	}

	@Override
	public boolean copy(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.directory.IOException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.copy(arg0, arg1);
	}

	@Override
	public boolean delete(java.lang.String arg0)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.directory.IOException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.delete(arg0);
	}

	@Override
	public boolean exists(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.exists(arg0);
	}

	@Override
	public boolean createDirectory(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.createDirectory(arg0);
	}

	@Override
	public java.lang.String[] getContents(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.getContents(arg0);
	}

}