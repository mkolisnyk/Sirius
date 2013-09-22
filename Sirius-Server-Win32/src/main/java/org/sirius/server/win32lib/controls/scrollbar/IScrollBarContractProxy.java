package org.sirius.server.win32lib.controls.scrollbar;

public class IScrollBarContractProxy implements
        org.sirius.server.win32lib.controls.scrollbar.IScrollBarContract {
    private String                                                           _endpoint          = null;
    private org.sirius.server.win32lib.controls.scrollbar.IScrollBarContract iScrollBarContract = null;

    public IScrollBarContractProxy() {
        _initIScrollBarContractProxy();
    }

    public IScrollBarContractProxy(final String endpoint) {
        _endpoint = endpoint;
        _initIScrollBarContractProxy();
    }

    private void _initIScrollBarContractProxy() {
        try {
            iScrollBarContract = (new org.sirius.server.win32lib.controls.scrollbar.ScrollBarSvcLocator())
                    .getScrollBarSvcPort();
            if (iScrollBarContract != null) {
                if (_endpoint != null) {
                    ((javax.xml.rpc.Stub) iScrollBarContract)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                } else {
                    _endpoint = (String) ((javax.xml.rpc.Stub) iScrollBarContract)
                            ._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public org.sirius.server.win32lib.controls.scrollbar.IScrollBarContract getIScrollBarContract() {
        if (iScrollBarContract == null) {
            _initIScrollBarContractProxy();
        }
        return iScrollBarContract;
    }

    @Override
    public java.lang.Double getLowerBound(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iScrollBarContract == null) {
            _initIScrollBarContractProxy();
        }
        return iScrollBarContract.getLowerBound(hwnd);
    }

    @Override
    public java.lang.Double getPosition(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iScrollBarContract == null) {
            _initIScrollBarContractProxy();
        }
        return iScrollBarContract.getPosition(hwnd);
    }

    @Override
    public java.lang.Double getUpperBound(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iScrollBarContract == null) {
            _initIScrollBarContractProxy();
        }
        return iScrollBarContract.getUpperBound(hwnd);
    }

    public void setEndpoint(final String endpoint) {
        _endpoint = endpoint;
        if (iScrollBarContract != null) {
            ((javax.xml.rpc.Stub) iScrollBarContract)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);
        }

    }

    @Override
    public void setPosition(final java.lang.Integer hwnd,
            final java.lang.Double pos) throws java.rmi.RemoteException {
        if (iScrollBarContract == null) {
            _initIScrollBarContractProxy();
        }
        iScrollBarContract.setPosition(hwnd, pos);
    }

}