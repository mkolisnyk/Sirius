package org.sirius.server.win32lib.controls.button;

public class IButtonContractProxy implements
        org.sirius.server.win32lib.controls.button.IButtonContract {
    private String                                                     _endpoint       = null;
    private org.sirius.server.win32lib.controls.button.IButtonContract iButtonContract = null;

    public IButtonContractProxy() {
        _initIButtonContractProxy();
    }

    public IButtonContractProxy(final String endpoint) {
        _endpoint = endpoint;
        _initIButtonContractProxy();
    }

    private void _initIButtonContractProxy() {
        try {
            iButtonContract = (new org.sirius.server.win32lib.controls.button.ButtonSvcLocator())
                    .getButtonSvcPort();
            if (iButtonContract != null) {
                if (_endpoint != null) {
                    ((javax.xml.rpc.Stub) iButtonContract)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                } else {
                    _endpoint = (String) ((javax.xml.rpc.Stub) iButtonContract)
                            ._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    @Override
    public void click(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iButtonContract == null) {
            _initIButtonContractProxy();
        }
        iButtonContract.click(hwnd);
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public org.sirius.server.win32lib.controls.button.IButtonContract getIButtonContract() {
        if (iButtonContract == null) {
            _initIButtonContractProxy();
        }
        return iButtonContract;
    }

    @Override
    public java.lang.Boolean isChecked(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iButtonContract == null) {
            _initIButtonContractProxy();
        }
        return iButtonContract.isChecked(hwnd);
    }

    @Override
    public java.lang.Boolean isIntermediate(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iButtonContract == null) {
            _initIButtonContractProxy();
        }
        return iButtonContract.isIntermediate(hwnd);
    }

    @Override
    public java.lang.Boolean isPressed(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iButtonContract == null) {
            _initIButtonContractProxy();
        }
        return iButtonContract.isPressed(hwnd);
    }

    @Override
    public void setCheck(final java.lang.Integer hwnd,
            final java.lang.Boolean check) throws java.rmi.RemoteException {
        if (iButtonContract == null) {
            _initIButtonContractProxy();
        }
        iButtonContract.setCheck(hwnd, check);
    }

    public void setEndpoint(final String endpoint) {
        _endpoint = endpoint;
        if (iButtonContract != null) {
            ((javax.xml.rpc.Stub) iButtonContract)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);
        }

    }

}