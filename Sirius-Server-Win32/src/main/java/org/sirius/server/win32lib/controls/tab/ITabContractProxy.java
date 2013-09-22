package org.sirius.server.win32lib.controls.tab;

public class ITabContractProxy implements
        org.sirius.server.win32lib.controls.tab.ITabContract {
    private String                                               _endpoint    = null;
    private org.sirius.server.win32lib.controls.tab.ITabContract iTabContract = null;

    public ITabContractProxy() {
        _initITabContractProxy();
    }

    public ITabContractProxy(final String endpoint) {
        _endpoint = endpoint;
        _initITabContractProxy();
    }

    private void _initITabContractProxy() {
        try {
            iTabContract = (new org.sirius.server.win32lib.controls.tab.TabSvcLocator())
                    .getTabSvcPort();
            if (iTabContract != null) {
                if (_endpoint != null) {
                    ((javax.xml.rpc.Stub) iTabContract)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                } else {
                    _endpoint = (String) ((javax.xml.rpc.Stub) iTabContract)
                            ._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public org.sirius.server.win32lib.controls.tab.ITabContract getITabContract() {
        if (iTabContract == null) {
            _initITabContractProxy();
        }
        return iTabContract;
    }

    @Override
    public java.lang.String[] getItemNames(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iTabContract == null) {
            _initITabContractProxy();
        }
        return iTabContract.getItemNames(hwnd);
    }

    @Override
    public java.lang.Integer getItemsCount(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iTabContract == null) {
            _initITabContractProxy();
        }
        return iTabContract.getItemsCount(hwnd);
    }

    @Override
    public java.lang.Integer getSelectedIndex(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iTabContract == null) {
            _initITabContractProxy();
        }
        return iTabContract.getSelectedIndex(hwnd);
    }

    @Override
    public java.lang.String getSelectedItem(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iTabContract == null) {
            _initITabContractProxy();
        }
        return iTabContract.getSelectedItem(hwnd);
    }

    @Override
    public void selectByIndex(final java.lang.Integer hwnd,
            final java.lang.Integer index) throws java.rmi.RemoteException {
        if (iTabContract == null) {
            _initITabContractProxy();
        }
        iTabContract.selectByIndex(hwnd, index);
    }

    @Override
    public void selectByName(final java.lang.Integer hwnd,
            final java.lang.String item) throws java.rmi.RemoteException {
        if (iTabContract == null) {
            _initITabContractProxy();
        }
        iTabContract.selectByName(hwnd, item);
    }

    public void setEndpoint(final String endpoint) {
        _endpoint = endpoint;
        if (iTabContract != null) {
            ((javax.xml.rpc.Stub) iTabContract)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);
        }

    }

}