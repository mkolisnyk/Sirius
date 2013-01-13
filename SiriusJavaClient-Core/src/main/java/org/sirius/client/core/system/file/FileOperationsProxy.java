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

	public boolean fileExists(java.lang.String fileName)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.fileExists(fileName);
	}

	public boolean copyEx(java.lang.String origin,
			java.lang.String destination, boolean overwrite)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.copyEx(origin, destination, overwrite);
	}

	public boolean createFile(java.lang.String fileName)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.createFile(fileName);
	}

	public java.lang.String[] getFileContents(java.lang.String path)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.getFileContents(path);
	}

	public java.lang.String[] getFileContentsEx2(java.lang.String path,
			int start, int number) throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.getFileContentsEx2(path, start, number);
	}

	public java.lang.String[] getFileContentsEx(java.lang.String path, int start)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.getFileContentsEx(path, start);
	}

	public boolean appendEx(java.lang.String path, java.lang.String text)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.appendEx(path, text);
	}

	public boolean createFileEx(java.lang.String fileName, boolean overwrite)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.createFileEx(fileName, overwrite);
	}

	public boolean deleteFile(java.lang.String fileName)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.deleteFile(fileName);
	}

	public byte[] getAllBytes(java.lang.String fileName)
			throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.getAllBytes(fileName);
	}

	public boolean moveEx(java.lang.String origin,
			java.lang.String destination, boolean overwrite)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.moveEx(origin, destination, overwrite);
	}

	public boolean writeEx(java.lang.String path, java.lang.String text)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.writeEx(path, text);
	}

	public boolean append(java.lang.String path, byte[] content)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.append(path, content);
	}

	public long size(java.lang.String fileName) throws java.rmi.RemoteException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.size(fileName);
	}

	public boolean write(java.lang.String path, byte[] content)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.write(path, content);
	}

	public boolean copy(java.lang.String origin, java.lang.String destination)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.copy(origin, destination);
	}

	public java.lang.String[] head(java.lang.String path, int lines)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.head(path, lines);
	}

	public java.lang.String[] tail(java.lang.String path, int lines)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.tail(path, lines);
	}

	public boolean move(java.lang.String origin, java.lang.String destination)
			throws java.rmi.RemoteException,
			org.sirius.client.core.system.file.IOException {
		if (fileOperations == null)
			_initFileOperationsProxy();
		return fileOperations.move(origin, destination);
	}

}