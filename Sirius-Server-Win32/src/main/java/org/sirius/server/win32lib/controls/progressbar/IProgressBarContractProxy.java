package org.sirius.server.win32lib.controls.progressbar;

public class IProgressBarContractProxy implements
        org.sirius.server.win32lib.controls.progressbar.IProgressBarContract {
    private String                                                               _endpoint            = null;
    private org.sirius.server.win32lib.controls.progressbar.IProgressBarContract iProgressBarContract = null;

    public IProgressBarContractProxy() {
        _initIProgressBarContractProxy();
    }

    public IProgressBarContractProxy(final String endpoint) {
        _endpoint = endpoint;
        _initIProgressBarContractProxy();
    }

    private void _initIProgressBarContractProxy() {
        try {
            iProgressBarContract = (new org.sirius.server.win32lib.controls.progressbar.ProgressBarSvcLocator())
                    .getProgressBarSvcPort();
            if (iProgressBarContract != null) {
                if (_endpoint != null) {
                    ((javax.xml.rpc.Stub) iProgressBarContract)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                } else {
                    _endpoint = (String) ((javax.xml.rpc.Stub) iProgressBarContract)
                            ._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public org.sirius.server.win32lib.controls.progressbar.IProgressBarContract getIProgressBarContract() {
        if (iProgressBarContract == null) {
            _initIProgressBarContractProxy();
        }
        return iProgressBarContract;
    }

    @Override
    public java.lang.Double getLowerBound(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iProgressBarContract == null) {
            _initIProgressBarContractProxy();
        }
        return iProgressBarContract.getLowerBound(hwnd);
    }

    @Override
    public java.lang.Double getPosition(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iProgressBarContract == null) {
            _initIProgressBarContractProxy();
        }
        return iProgressBarContract.getPosition(hwnd);
    }

    @Override
    public java.lang.Double getUpperBound(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iProgressBarContract == null) {
            _initIProgressBarContractProxy();
        }
        return iProgressBarContract.getUpperBound(hwnd);
    }

    public void setEndpoint(final String endpoint) {
        _endpoint = endpoint;
        if (iProgressBarContract != null) {
            ((javax.xml.rpc.Stub) iProgressBarContract)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);
        }

    }

    @Override
    public void setPosition(final java.lang.Integer hwnd,
            final java.lang.Double pos) throws java.rmi.RemoteException {
        if (iProgressBarContract == null) {
            _initIProgressBarContractProxy();
        }
        iProgressBarContract.setPosition(hwnd, pos);
    }

}