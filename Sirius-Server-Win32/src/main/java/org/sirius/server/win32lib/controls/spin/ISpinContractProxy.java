package org.sirius.server.win32lib.controls.spin;

public class ISpinContractProxy implements
        org.sirius.server.win32lib.controls.spin.ISpinContract {
    private String                                                 _endpoint     = null;
    private org.sirius.server.win32lib.controls.spin.ISpinContract iSpinContract = null;

    public ISpinContractProxy() {
        _initISpinContractProxy();
    }

    public ISpinContractProxy(final String endpoint) {
        _endpoint = endpoint;
        _initISpinContractProxy();
    }

    private void _initISpinContractProxy() {
        try {
            iSpinContract = (new org.sirius.server.win32lib.controls.spin.SpinSvcLocator())
                    .getSpinSvcPort();
            if (iSpinContract != null) {
                if (_endpoint != null) {
                    ((javax.xml.rpc.Stub) iSpinContract)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                } else {
                    _endpoint = (String) ((javax.xml.rpc.Stub) iSpinContract)
                            ._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public org.sirius.server.win32lib.controls.spin.ISpinContract getISpinContract() {
        if (iSpinContract == null) {
            _initISpinContractProxy();
        }
        return iSpinContract;
    }

    @Override
    public java.lang.Double getLowerBound(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iSpinContract == null) {
            _initISpinContractProxy();
        }
        return iSpinContract.getLowerBound(hwnd);
    }

    @Override
    public java.lang.Double getPosition(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iSpinContract == null) {
            _initISpinContractProxy();
        }
        return iSpinContract.getPosition(hwnd);
    }

    @Override
    public java.lang.String getText(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iSpinContract == null) {
            _initISpinContractProxy();
        }
        return iSpinContract.getText(hwnd);
    }

    @Override
    public java.lang.Double getUpperBound(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iSpinContract == null) {
            _initISpinContractProxy();
        }
        return iSpinContract.getUpperBound(hwnd);
    }

    public void setEndpoint(final String endpoint) {
        _endpoint = endpoint;
        if (iSpinContract != null) {
            ((javax.xml.rpc.Stub) iSpinContract)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);
        }

    }

    @Override
    public void setPosition(final java.lang.Integer hwnd,
            final java.lang.Double pos) throws java.rmi.RemoteException {
        if (iSpinContract == null) {
            _initISpinContractProxy();
        }
        iSpinContract.setPosition(hwnd, pos);
    }

    @Override
    public void setText(final java.lang.Integer hwnd,
            final java.lang.String text) throws java.rmi.RemoteException {
        if (iSpinContract == null) {
            _initISpinContractProxy();
        }
        iSpinContract.setText(hwnd, text);
    }

}