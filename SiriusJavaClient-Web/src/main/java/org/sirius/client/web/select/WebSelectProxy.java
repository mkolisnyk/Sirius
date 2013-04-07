package org.sirius.client.web.select;

public class WebSelectProxy implements org.sirius.client.web.select.WebSelect {
    private String                                 _endpoint = null;
    private org.sirius.client.web.select.WebSelect webSelect = null;

    public WebSelectProxy() {
        _initWebSelectProxy();
    }

    public WebSelectProxy(String endpoint) {
        _endpoint = endpoint;
        _initWebSelectProxy();
    }

    private void _initWebSelectProxy() {
        try {
            webSelect = (new org.sirius.client.web.select.WebSelectServiceLocator())
                    .getWebSelectPort();
            if (webSelect != null) {
                if (_endpoint != null)
                    ((javax.xml.rpc.Stub) webSelect)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                else
                    _endpoint = (String) ((javax.xml.rpc.Stub) webSelect)
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
        if (webSelect != null)
            ((javax.xml.rpc.Stub) webSelect)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);

    }

    public org.sirius.client.web.select.WebSelect getWebSelect() {
        if (webSelect == null)
            _initWebSelectProxy();
        return webSelect;
    }

    public boolean isMultiple(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException {
        if (webSelect == null)
            _initWebSelectProxy();
        return webSelect.isMultiple(arg0, arg1, arg2);
    }

    public void deselectAll(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException {
        if (webSelect == null)
            _initWebSelectProxy();
        webSelect.deselectAll(arg0, arg1, arg2);
    }

    public void deselectByIndex(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2, int arg3) throws java.rmi.RemoteException {
        if (webSelect == null)
            _initWebSelectProxy();
        webSelect.deselectByIndex(arg0, arg1, arg2, arg3);
    }

    public void deselectByValue(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException {
        if (webSelect == null)
            _initWebSelectProxy();
        webSelect.deselectByValue(arg0, arg1, arg2, arg3);
    }

    public java.lang.String[] getAllOptions(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
        if (webSelect == null)
            _initWebSelectProxy();
        return webSelect.getAllOptions(arg0, arg1, arg2);
    }

    public void selectByIndex(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2, int arg3) throws java.rmi.RemoteException {
        if (webSelect == null)
            _initWebSelectProxy();
        webSelect.selectByIndex(arg0, arg1, arg2, arg3);
    }

    public void selectByValue(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException {
        if (webSelect == null)
            _initWebSelectProxy();
        webSelect.selectByValue(arg0, arg1, arg2, arg3);
    }

    public void selectByVisibleText(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException {
        if (webSelect == null)
            _initWebSelectProxy();
        webSelect.selectByVisibleText(arg0, arg1, arg2, arg3);
    }

    public void deselectByVisibleText(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException {
        if (webSelect == null)
            _initWebSelectProxy();
        webSelect.deselectByVisibleText(arg0, arg1, arg2, arg3);
    }

    public java.lang.String[] getAllSelectedOptions(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
        if (webSelect == null)
            _initWebSelectProxy();
        return webSelect.getAllSelectedOptions(arg0, arg1, arg2);
    }

    public java.lang.String getFirstSelectedOption(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
        if (webSelect == null)
            _initWebSelectProxy();
        return webSelect.getFirstSelectedOption(arg0, arg1, arg2);
    }

}