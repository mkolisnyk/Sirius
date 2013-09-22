package org.sirius.server.win32lib.controls.listview;

public class IListViewContractProxy implements
        org.sirius.server.win32lib.controls.listview.IListViewContract {
    private String                                                         _endpoint         = null;
    private org.sirius.server.win32lib.controls.listview.IListViewContract iListViewContract = null;

    public IListViewContractProxy() {
        _initIListViewContractProxy();
    }

    public IListViewContractProxy(final String endpoint) {
        _endpoint = endpoint;
        _initIListViewContractProxy();
    }

    private void _initIListViewContractProxy() {
        try {
            iListViewContract = (new org.sirius.server.win32lib.controls.listview.ListViewSvcLocator())
                    .getListViewSvcPort();
            if (iListViewContract != null) {
                if (_endpoint != null) {
                    ((javax.xml.rpc.Stub) iListViewContract)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                } else {
                    _endpoint = (String) ((javax.xml.rpc.Stub) iListViewContract)
                            ._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    @Override
    public void addSelectionByIndex(final java.lang.Integer hwnd,
            final java.lang.Integer index) throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        iListViewContract.addSelectionByIndex(hwnd, index);
    }

    @Override
    public void addSelectionByName(final java.lang.Integer hwnd,
            final java.lang.String item) throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        iListViewContract.addSelectionByName(hwnd, item);
    }

    @Override
    public void deselectAll(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        iListViewContract.deselectAll(hwnd);
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public org.sirius.server.win32lib.controls.listview.IListViewContract getIListViewContract() {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        return iListViewContract;
    }

    @Override
    public java.lang.String[] getItemNames(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        return iListViewContract.getItemNames(hwnd);
    }

    @Override
    public java.lang.Integer getItemsCount(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        return iListViewContract.getItemsCount(hwnd);
    }

    @Override
    public java.lang.Integer getSelectedIndex(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        return iListViewContract.getSelectedIndex(hwnd);
    }

    @Override
    public java.lang.String getSelectedItem(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        return iListViewContract.getSelectedItem(hwnd);
    }

    @Override
    public java.lang.String[] getSelectedItems(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        return iListViewContract.getSelectedItems(hwnd);
    }

    @Override
    public void removeSelectionByIndex(final java.lang.Integer hwnd,
            final java.lang.Integer index) throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        iListViewContract.removeSelectionByIndex(hwnd, index);
    }

    @Override
    public void removeSelectionByName(final java.lang.Integer hwnd,
            final java.lang.String item) throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        iListViewContract.removeSelectionByName(hwnd, item);
    }

    @Override
    public void selectAll(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        iListViewContract.selectAll(hwnd);
    }

    @Override
    public void selectByIndex(final java.lang.Integer hwnd,
            final java.lang.Integer index) throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        iListViewContract.selectByIndex(hwnd, index);
    }

    @Override
    public void selectByName(final java.lang.Integer hwnd,
            final java.lang.String item) throws java.rmi.RemoteException {
        if (iListViewContract == null) {
            _initIListViewContractProxy();
        }
        iListViewContract.selectByName(hwnd, item);
    }

    public void setEndpoint(final String endpoint) {
        _endpoint = endpoint;
        if (iListViewContract != null) {
            ((javax.xml.rpc.Stub) iListViewContract)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);
        }

    }

}