package org.sirius.client.core.system.process;

public class ProcessOperationsProxy implements
		org.sirius.client.core.system.process.ProcessOperations {
	private String _endpoint = null;
	private org.sirius.client.core.system.process.ProcessOperations processOperations = null;

	public ProcessOperationsProxy() {
		_initProcessOperationsProxy();
	}

	public ProcessOperationsProxy(String endpoint) {
		_endpoint = endpoint;
		_initProcessOperationsProxy();
	}

	private void _initProcessOperationsProxy() {
		try {
			processOperations = (new org.sirius.client.core.system.process.ProcessOperationsServiceLocator())
					.getProcessOperationsPort();
			if (processOperations != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) processOperations)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) processOperations)
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
		if (processOperations != null)
			((javax.xml.rpc.Stub) processOperations)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public org.sirius.client.core.system.process.ProcessOperations getProcessOperations() {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations;
	}

	public int waitProcessCloseByIdEx(int pid, int timeout)
			throws java.rmi.RemoteException {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations.waitProcessCloseByIdEx(pid, timeout);
	}

	public boolean kill(java.lang.String processName)
			throws java.rmi.RemoteException {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations.kill(processName);
	}

	public int waitProcessCloseById(int pid) throws java.rmi.RemoteException {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations.waitProcessCloseById(pid);
	}

	public int waitProcessClose(java.lang.String process)
			throws java.rmi.RemoteException {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations.waitProcessClose(process);
	}

	public int waitProcessCloseEx(java.lang.String process, int timeout)
			throws java.rmi.RemoteException {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations.waitProcessCloseEx(process, timeout);
	}

	public org.sirius.client.core.system.process.ProcessInfo[] listAll()
			throws java.rmi.RemoteException {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations.listAll();
	}

	public org.sirius.client.core.system.process.ProcessInfo[] listByMask(
			java.lang.String mask) throws java.rmi.RemoteException {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations.listByMask(mask);
	}

	public org.sirius.client.core.system.process.ProcessInfo[] listByFilter(
			org.sirius.client.core.system.process.ProcessInfo filter)
			throws java.rmi.RemoteException {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations.listByFilter(filter);
	}

	public boolean startEx(java.lang.String command, java.lang.String[] args)
			throws java.rmi.RemoteException {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations.startEx(command, args);
	}

	public int runEx(java.lang.String command, java.lang.String[] args)
			throws java.rmi.RemoteException {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations.runEx(command, args);
	}

	public boolean start(java.lang.String command)
			throws java.rmi.RemoteException {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations.start(command);
	}

	public int run(java.lang.String command) throws java.rmi.RemoteException {
		if (processOperations == null)
			_initProcessOperationsProxy();
		return processOperations.run(command);
	}

}