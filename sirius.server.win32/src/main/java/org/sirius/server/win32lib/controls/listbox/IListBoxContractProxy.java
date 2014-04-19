package org.sirius.server.win32lib.controls.listbox;

public class IListBoxContractProxy implements
        org.sirius.server.win32lib.controls.listbox.IListBoxContract {
    private String                                                       _endpoint        = null;
    private org.sirius.server.win32lib.controls.listbox.IListBoxContract iListBoxContract = null;

    public IListBoxContractProxy() {
        _initIListBoxContractProxy();
    }

    public IListBoxContractProxy(final String endpoint) {
        _endpoint = endpoint;
        _initIListBoxContractProxy();
    }

    private void _initIListBoxContractProxy() {
        try {
            iListBoxContract = (new org.sirius.server.win32lib.controls.listbox.ListBoxSvcLocator())
                    .getListBoxSvcPort();
            if (iListBoxContract != null) {
                if (_endpoint != null) {
                    ((javax.xml.rpc.Stub) iListBoxContract)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                } else {
                    _endpoint = (String) ((javax.xml.rpc.Stub) iListBoxContract)
                            ._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    @Override
    public void addSelectionByIndex(final java.lang.Integer hwnd,
            final java.lang.Integer index) throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        iListBoxContract.addSelectionByIndex(hwnd, index);
    }

    @Override
    public void addSelectionByName(final java.lang.Integer hwnd,
            final java.lang.String item) throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        iListBoxContract.addSelectionByName(hwnd, item);
    }

    @Override
    public void deselectAll(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        iListBoxContract.deselectAll(hwnd);
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public org.sirius.server.win32lib.controls.listbox.IListBoxContract getIListBoxContract() {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        return iListBoxContract;
    }

    @Override
    public java.lang.String[] getItemNames(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        return iListBoxContract.getItemNames(hwnd);
    }

    @Override
    public java.lang.Integer getItemsCount(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        return iListBoxContract.getItemsCount(hwnd);
    }

    @Override
    public java.lang.Integer getSelectedIndex(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        return iListBoxContract.getSelectedIndex(hwnd);
    }

    @Override
    public java.lang.String getSelectedItem(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        return iListBoxContract.getSelectedItem(hwnd);
    }

    @Override
    public java.lang.String[] getSelectedItems(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        return iListBoxContract.getSelectedItems(hwnd);
    }

    @Override
    public void removeSelectionByIndex(final java.lang.Integer hwnd,
            final java.lang.Integer index) throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        iListBoxContract.removeSelectionByIndex(hwnd, index);
    }

    @Override
    public void removeSelectionByName(final java.lang.Integer hwnd,
            final java.lang.String item) throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        iListBoxContract.removeSelectionByName(hwnd, item);
    }

    @Override
    public void selectAll(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        iListBoxContract.selectAll(hwnd);
    }

    @Override
    public void selectByIndex(final java.lang.Integer hwnd,
            final java.lang.Integer index) throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        iListBoxContract.selectByIndex(hwnd, index);
    }

    @Override
    public void selectByName(final java.lang.Integer hwnd,
            final java.lang.String item) throws java.rmi.RemoteException {
        if (iListBoxContract == null) {
            _initIListBoxContractProxy();
        }
        iListBoxContract.selectByName(hwnd, item);
    }

    public void setEndpoint(final String endpoint) {
        _endpoint = endpoint;
        if (iListBoxContract != null) {
            ((javax.xml.rpc.Stub) iListBoxContract)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);
        }

    }

}