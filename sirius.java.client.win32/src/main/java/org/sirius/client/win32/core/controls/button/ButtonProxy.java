package org.sirius.client.win32.core.controls.button;

public class ButtonProxy implements
        org.sirius.client.win32.core.controls.button.Button {
    private String                                              _endpoint = null;
    private org.sirius.client.win32.core.controls.button.Button button    = null;

    public ButtonProxy() {
        _initButtonProxy();
    }

    public ButtonProxy(String endpoint) {
        _endpoint = endpoint;
        _initButtonProxy();
    }

    private void _initButtonProxy() {
        try {
            button = (new org.sirius.client.win32.core.controls.button.ButtonServiceLocator())
                    .getButtonPort();
            if (button != null) {
                if (_endpoint != null)
                    ((javax.xml.rpc.Stub) button)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                else
                    _endpoint = (String) ((javax.xml.rpc.Stub) button)
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
        if (button != null)
            ((javax.xml.rpc.Stub) button)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);

    }

    public org.sirius.client.win32.core.controls.button.Button getButton() {
        if (button == null)
            _initButtonProxy();
        return button;
    }

    public void setState(long arg0, int arg1) throws java.rmi.RemoteException {
        if (button == null)
            _initButtonProxy();
        button.setState(arg0, arg1);
    }

    public int getState(long arg0) throws java.rmi.RemoteException {
        if (button == null)
            _initButtonProxy();
        return button.getState(arg0);
    }

    public int getCheck(long arg0) throws java.rmi.RemoteException {
        if (button == null)
            _initButtonProxy();
        return button.getCheck(arg0);
    }

    public void setCheck(long arg0, int arg1) throws java.rmi.RemoteException {
        if (button == null)
            _initButtonProxy();
        button.setCheck(arg0, arg1);
    }

}