package org.sirius.client.win32.core.controls.combobox;

public class ComboBoxProxy implements
        org.sirius.client.win32.core.controls.combobox.ComboBox {
    private String                                                  _endpoint = null;
    private org.sirius.client.win32.core.controls.combobox.ComboBox comboBox  = null;

    public ComboBoxProxy() {
        _initComboBoxProxy();
    }

    public ComboBoxProxy(String endpoint) {
        _endpoint = endpoint;
        _initComboBoxProxy();
    }

    private void _initComboBoxProxy() {
        try {
            comboBox = (new org.sirius.client.win32.core.controls.combobox.ComboBoxServiceLocator())
                    .getComboBoxPort();
            if (comboBox != null) {
                if (_endpoint != null)
                    ((javax.xml.rpc.Stub) comboBox)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                else
                    _endpoint = (String) ((javax.xml.rpc.Stub) comboBox)
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
        if (comboBox != null)
            ((javax.xml.rpc.Stub) comboBox)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);

    }

    public org.sirius.client.win32.core.controls.combobox.ComboBox getComboBox() {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox;
    }

    public int setEditSel(long arg0, int arg1, int arg2)
            throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.setEditSel(arg0, arg1, arg2);
    }

    public int setCurSel(long arg0, int arg1) throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.setCurSel(arg0, arg1);
    }

    public int selectString(long arg0, int arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.selectString(arg0, arg1, arg2);
    }

    public int findString(long arg0, int arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.findString(arg0, arg1, arg2);
    }

    public void setText(long arg0, java.lang.String arg1)
            throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        comboBox.setText(arg0, arg1);
    }

    public int showDropdown(long arg0, boolean arg1)
            throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.showDropdown(arg0, arg1);
    }

    public int getEditSel(long arg0) throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.getEditSel(arg0);
    }

    public int getLBText(long arg0, int arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.getLBText(arg0, arg1, arg2);
    }

    public int getItemData(long arg0, int arg1) throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.getItemData(arg0, arg1);
    }

    public int getCount(long arg0) throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.getCount(arg0);
    }

    public int findItemData(long arg0, int arg1,
            org.sirius.client.win32.core.types.Lparam arg2)
            throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.findItemData(arg0, arg1, arg2);
    }

    public int getCurSel(long arg0) throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.getCurSel(arg0);
    }

    public int getLBTextLen(long arg0, int arg1)
            throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.getLBTextLen(arg0, arg1);
    }

    public java.lang.String getText(long arg0) throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.getText(arg0);
    }

    public int resetContent(long arg0) throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.resetContent(arg0);
    }

    public int getDroppedState(long arg0) throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.getDroppedState(arg0);
    }

    public int setItemHeight(long arg0, int arg1, int arg2)
            throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.setItemHeight(arg0, arg1, arg2);
    }

    public int findStringExact(long arg0, int arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.findStringExact(arg0, arg1, arg2);
    }

    public int getTextLength(long arg0) throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.getTextLength(arg0);
    }

    public int getExtendedUI(long arg0) throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.getExtendedUI(arg0);
    }

    public int getItemHeight(long arg0) throws java.rmi.RemoteException {
        if (comboBox == null)
            _initComboBoxProxy();
        return comboBox.getItemHeight(arg0);
    }

}