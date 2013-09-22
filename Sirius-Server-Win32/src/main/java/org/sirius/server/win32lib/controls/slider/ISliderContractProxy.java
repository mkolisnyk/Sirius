package org.sirius.server.win32lib.controls.slider;

public class ISliderContractProxy implements
        org.sirius.server.win32lib.controls.slider.ISliderContract {
    private String                                                     _endpoint       = null;
    private org.sirius.server.win32lib.controls.slider.ISliderContract iSliderContract = null;

    public ISliderContractProxy() {
        _initISliderContractProxy();
    }

    public ISliderContractProxy(final String endpoint) {
        _endpoint = endpoint;
        _initISliderContractProxy();
    }

    private void _initISliderContractProxy() {
        try {
            iSliderContract = (new org.sirius.server.win32lib.controls.slider.SliderSvcLocator())
                    .getSliderSvcPort();
            if (iSliderContract != null) {
                if (_endpoint != null) {
                    ((javax.xml.rpc.Stub) iSliderContract)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                } else {
                    _endpoint = (String) ((javax.xml.rpc.Stub) iSliderContract)
                            ._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public org.sirius.server.win32lib.controls.slider.ISliderContract getISliderContract() {
        if (iSliderContract == null) {
            _initISliderContractProxy();
        }
        return iSliderContract;
    }

    @Override
    public java.lang.Double getLowerBound(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iSliderContract == null) {
            _initISliderContractProxy();
        }
        return iSliderContract.getLowerBound(hwnd);
    }

    @Override
    public java.lang.Double getPosition(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iSliderContract == null) {
            _initISliderContractProxy();
        }
        return iSliderContract.getPosition(hwnd);
    }

    @Override
    public java.lang.Double getUpperBound(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iSliderContract == null) {
            _initISliderContractProxy();
        }
        return iSliderContract.getUpperBound(hwnd);
    }

    public void setEndpoint(final String endpoint) {
        _endpoint = endpoint;
        if (iSliderContract != null) {
            ((javax.xml.rpc.Stub) iSliderContract)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);
        }

    }

    @Override
    public void setPosition(final java.lang.Integer hwnd,
            final java.lang.Double pos) throws java.rmi.RemoteException {
        if (iSliderContract == null) {
            _initISliderContractProxy();
        }
        iSliderContract.setPosition(hwnd, pos);
    }

}