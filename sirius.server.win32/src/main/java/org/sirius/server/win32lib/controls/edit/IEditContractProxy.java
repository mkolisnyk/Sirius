package org.sirius.server.win32lib.controls.edit;

public class IEditContractProxy implements
        org.sirius.server.win32lib.controls.edit.IEditContract {
    private String                                                 _endpoint     = null;
    private org.sirius.server.win32lib.controls.edit.IEditContract iEditContract = null;

    public IEditContractProxy() {
        _initIEditContractProxy();
    }

    public IEditContractProxy(final String endpoint) {
        _endpoint = endpoint;
        _initIEditContractProxy();
    }

    private void _initIEditContractProxy() {
        try {
            iEditContract = (new org.sirius.server.win32lib.controls.edit.EditSvcLocator())
                    .getEditSvcPort();
            if (iEditContract != null) {
                if (_endpoint != null) {
                    ((javax.xml.rpc.Stub) iEditContract)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                } else {
                    _endpoint = (String) ((javax.xml.rpc.Stub) iEditContract)
                            ._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public org.sirius.server.win32lib.controls.edit.IEditContract getIEditContract() {
        if (iEditContract == null) {
            _initIEditContractProxy();
        }
        return iEditContract;
    }

    @Override
    public java.lang.String getSelectedText(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iEditContract == null) {
            _initIEditContractProxy();
        }
        return iEditContract.getSelectedText(hwnd);
    }

    @Override
    public java.lang.String getText(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iEditContract == null) {
            _initIEditContractProxy();
        }
        return iEditContract.getText(hwnd);
    }

    @Override
    public void setCursorPosition(final java.lang.Integer hwnd,
            final java.lang.Integer col, final java.lang.Integer row)
            throws java.rmi.RemoteException {
        if (iEditContract == null) {
            _initIEditContractProxy();
        }
        iEditContract.setCursorPosition(hwnd, col, row);
    }

    public void setEndpoint(final String endpoint) {
        _endpoint = endpoint;
        if (iEditContract != null) {
            ((javax.xml.rpc.Stub) iEditContract)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);
        }

    }

    @Override
    public void setSelection(final java.lang.Integer hwnd,
            final java.lang.Integer scol, final java.lang.Integer srow,
            final java.lang.Integer ecol, final java.lang.Integer erow)
            throws java.rmi.RemoteException {
        if (iEditContract == null) {
            _initIEditContractProxy();
        }
        iEditContract.setSelection(hwnd, scol, srow, ecol, erow);
    }

    @Override
    public void setText(final java.lang.Integer hwnd,
            final java.lang.String text) throws java.rmi.RemoteException {
        if (iEditContract == null) {
            _initIEditContractProxy();
        }
        iEditContract.setText(hwnd, text);
    }

    @Override
    public void typeText(final java.lang.Integer hwnd,
            final java.lang.String text) throws java.rmi.RemoteException {
        if (iEditContract == null) {
            _initIEditContractProxy();
        }
        iEditContract.typeText(hwnd, text);
    }

}