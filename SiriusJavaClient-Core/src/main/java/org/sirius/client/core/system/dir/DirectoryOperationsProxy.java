package org.sirius.client.core.system.dir;

public class DirectoryOperationsProxy implements
		org.sirius.client.core.system.dir.DirectoryOperations {
	private String _endpoint = null;
	private org.sirius.client.core.system.dir.DirectoryOperations directoryOperations = null;

	public DirectoryOperationsProxy() {
		_initDirectoryOperationsProxy();
	}

	public DirectoryOperationsProxy(String endpoint) {
		_endpoint = endpoint;
		_initDirectoryOperationsProxy();
	}

	private void _initDirectoryOperationsProxy() {
		try {
			directoryOperations = (new org.sirius.client.core.system.dir.DirectoryOperationsServiceLocator())
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

	public org.sirius.client.core.system.dir.DirectoryOperations getDirectoryOperations() {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations;
	}

	public boolean moveDirectory(java.lang.String origin,
			java.lang.String destination) throws java.rmi.RemoteException,
			org.sirius.client.core.system.dir.IOException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.moveDirectory(origin, destination);
	}

	public boolean moveDirectoryEx(java.lang.String origin,
			java.lang.String destination, boolean overwrite)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.dir.IOException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.moveDirectoryEx(origin, destination,
				overwrite);
	}

	public java.lang.String[] getContentsEx(java.lang.String path,
			boolean recursive) throws java.rmi.RemoteException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.getContentsEx(path, recursive);
	}

	public boolean createEx(java.lang.String path, boolean overwrite)
			throws java.rmi.RemoteException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.createEx(path, overwrite);
	}

	public boolean copyEx(java.lang.String origin,
			java.lang.String destination, boolean overwrite)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.dir.IOException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.copyEx(origin, destination, overwrite);
	}

	public boolean copy(java.lang.String origin, java.lang.String destination)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.dir.IOException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.copy(origin, destination);
	}

	public boolean delete(java.lang.String path)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.dir.IOException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.delete(path);
	}

	public boolean exists(java.lang.String path)
			throws java.rmi.RemoteException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.exists(path);
	}

	public boolean create(java.lang.String path)
			throws java.rmi.RemoteException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.create(path);
	}

	public java.lang.String[] getContents(java.lang.String path)
			throws java.rmi.RemoteException {
		if (directoryOperations == null)
			_initDirectoryOperationsProxy();
		return directoryOperations.getContents(path);
	}

}