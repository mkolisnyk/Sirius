package org.sirius.client.core.system.sys;

public class SystemOperationsProxy implements
        org.sirius.client.core.system.sys.SystemOperations {
    private String                                             _endpoint        = null;
    private org.sirius.client.core.system.sys.SystemOperations systemOperations = null;

    public SystemOperationsProxy() {
        _initSystemOperationsProxy();
    }

    public SystemOperationsProxy(String endpoint) {
        _endpoint = endpoint;
        _initSystemOperationsProxy();
    }

    private void _initSystemOperationsProxy() {
        try {
            systemOperations = (new org.sirius.client.core.system.sys.SystemOperationsServiceLocator())
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

    public org.sirius.client.core.system.sys.SystemOperations getSystemOperations() {
        if (systemOperations == null)
            _initSystemOperationsProxy();
        return systemOperations;
    }

    public java.lang.String getMachineName() throws java.rmi.RemoteException {
        if (systemOperations == null)
            _initSystemOperationsProxy();
        return systemOperations.getMachineName();
    }

    public long getFreeMemory() throws java.rmi.RemoteException {
        if (systemOperations == null)
            _initSystemOperationsProxy();
        return systemOperations.getFreeMemory();
    }

    public long getFreeDiskSpace(java.lang.String arg0)
            throws java.rmi.RemoteException {
        if (systemOperations == null)
            _initSystemOperationsProxy();
        return systemOperations.getFreeDiskSpace(arg0);
    }

    public java.lang.String getCurrentUser() throws java.rmi.RemoteException {
        if (systemOperations == null)
            _initSystemOperationsProxy();
        return systemOperations.getCurrentUser();
    }

    public java.lang.String getEnvironmentVariable(java.lang.String arg0)
            throws java.rmi.RemoteException {
        if (systemOperations == null)
            _initSystemOperationsProxy();
        return systemOperations.getEnvironmentVariable(arg0);
    }

    public boolean setEnvironmentVariable(java.lang.String variableName,
            java.lang.String value) throws java.rmi.RemoteException,
            org.sirius.client.core.system.sys.IOException {
        if (systemOperations == null)
            _initSystemOperationsProxy();
        return systemOperations.setEnvironmentVariable(variableName, value);
    }

    public java.util.Calendar getDate() throws java.rmi.RemoteException {
        if (systemOperations == null)
            _initSystemOperationsProxy();
        return systemOperations.getDate();
    }

}