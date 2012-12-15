package org.sirius.client.core.system.system;

public class SystemOperationsProxy implements
		org.sirius.client.core.system.system.SystemOperations {
	private String _endpoint = null;
	private org.sirius.client.core.system.system.SystemOperations systemOperations = null;

	public SystemOperationsProxy() {
		_initSystemOperationsProxy();
	}

	public SystemOperationsProxy(String endpoint) {
		_endpoint = endpoint;
		_initSystemOperationsProxy();
	}

	private void _initSystemOperationsProxy() {
		try {
			systemOperations = (new org.sirius.client.core.system.system.SystemOperationsServiceLocator())
					.getSystemOperationsPort();
			if (systemOperations != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) systemOperations)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) systemOperations)
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
		if (systemOperations != null)
			((javax.xml.rpc.Stub) systemOperations)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public org.sirius.client.core.system.system.SystemOperations getSystemOperations() {
		if (systemOperations == null)
			_initSystemOperationsProxy();
		return systemOperations;
	}

	@Override
	public java.lang.String getMachineName() throws java.rmi.RemoteException {
		if (systemOperations == null)
			_initSystemOperationsProxy();
		return systemOperations.getMachineName();
	}

	@Override
	public long getFreeMemory() throws java.rmi.RemoteException {
		if (systemOperations == null)
			_initSystemOperationsProxy();
		return systemOperations.getFreeMemory();
	}

	@Override
	public long getFreeDiskSpace(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (systemOperations == null)
			_initSystemOperationsProxy();
		return systemOperations.getFreeDiskSpace(arg0);
	}

	@Override
	public java.lang.Object getSystemMetrics() throws java.rmi.RemoteException {
		if (systemOperations == null)
			_initSystemOperationsProxy();
		return systemOperations.getSystemMetrics();
	}

	@Override
	public java.lang.String getCurrentUser() throws java.rmi.RemoteException {
		if (systemOperations == null)
			_initSystemOperationsProxy();
		return systemOperations.getCurrentUser();
	}

	@Override
	public java.lang.String getEnvironmentVariable(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (systemOperations == null)
			_initSystemOperationsProxy();
		return systemOperations.getEnvironmentVariable(arg0);
	}

	@Override
	public boolean setEnvironmentVariable(java.lang.String arg0,
			java.lang.String arg1) throws java.rmi.RemoteException,
			org.sirius.client.core.system.system.IOException {
		if (systemOperations == null)
			_initSystemOperationsProxy();
		return systemOperations.setEnvironmentVariable(arg0, arg1);
	}

	@Override
	public java.util.Calendar getDate() throws java.rmi.RemoteException {
		if (systemOperations == null)
			_initSystemOperationsProxy();
		return systemOperations.getDate();
	}

	@Override
	public boolean setDate(java.util.Calendar arg0)
			throws java.rmi.RemoteException {
		if (systemOperations == null)
			_initSystemOperationsProxy();
		return systemOperations.setDate(arg0);
	}

}