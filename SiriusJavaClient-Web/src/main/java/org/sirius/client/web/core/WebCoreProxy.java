package org.sirius.client.web.core;

public class WebCoreProxy implements org.sirius.client.web.core.WebCore {
    private String                             _endpoint = null;
    private org.sirius.client.web.core.WebCore webCore   = null;

    public WebCoreProxy() {
        _initWebCoreProxy();
    }

    public WebCoreProxy(String endpoint) {
        _endpoint = endpoint;
        _initWebCoreProxy();
    }

    private void _initWebCoreProxy() {
        try {
            webCore = (new org.sirius.client.web.core.WebCoreServiceLocator())
                    .getWebCorePort();
            if (webCore != null) {
                if (_endpoint != null)
                    ((javax.xml.rpc.Stub) webCore)
                            ._setProperty(
                                    "javax.xml.rpc.service.endpoint.address",
                                    _endpoint);
                else
                    _endpoint = (String) ((javax.xml.rpc.Stub) webCore)
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
        if (webCore != null)
            ((javax.xml.rpc.Stub) webCore)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);

    }

    public org.sirius.client.web.core.WebCore getWebCore() {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore;
    }

    public void forward(java.lang.String arg0) throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.forward(arg0);
    }

    public void sendKeys(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.sendKeys(arg0, arg1, arg2, arg3);
    }

    public void selectWindow(java.lang.String arg0, java.lang.String arg1)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.selectWindow(arg0, arg1);
    }

    public void selectAlert(java.lang.String arg0)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.selectAlert(arg0);
    }

    public java.lang.String getCssValue(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.getCssValue(arg0, arg1, arg2, arg3);
    }

    public boolean isDisplayed(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.isDisplayed(arg0, arg1, arg2);
    }

    public java.lang.String getWindowHandle(java.lang.String arg0)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.getWindowHandle(arg0);
    }

    public void selectFrameByName(java.lang.String arg0, java.lang.String arg1)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.selectFrameByName(arg0, arg1);
    }

    public void selectDefaultContent(java.lang.String arg0)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.selectDefaultContent(arg0);
    }

    public java.lang.String getPageSource(java.lang.String arg0)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.getPageSource(arg0);
    }

    public void selectFrameByIndex(java.lang.String arg0, int arg1)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.selectFrameByIndex(arg0, arg1);
    }

    public void back(java.lang.String arg0) throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.back(arg0);
    }

    public org.sirius.client.web.core.Point getLocation(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.getLocation(arg0, arg1, arg2);
    }

    public java.lang.String getURL(java.lang.String arg0)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.getURL(arg0);
    }

    public void clear(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.clear(arg0, arg1, arg2);
    }

    public java.lang.String start(java.lang.String arg0)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.start(arg0);
    }

    public void stop(java.lang.String arg0) throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.stop(arg0);
    }

    public org.sirius.client.web.core.Dimension getSize(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.getSize(arg0, arg1, arg2);
    }

    public void open(java.lang.String arg0, java.lang.String arg1)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.open(arg0, arg1);
    }

    public void refresh(java.lang.String arg0) throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.refresh(arg0);
    }

    public java.lang.String getTitle(java.lang.String arg0)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.getTitle(arg0);
    }

    public boolean isEnabled(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.isEnabled(arg0, arg1, arg2);
    }

    public java.lang.String getText(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.getText(arg0, arg1, arg2);
    }

    public void submit(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.submit(arg0, arg1, arg2);
    }

    public void click(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        webCore.click(arg0, arg1, arg2);
    }

    public boolean isSelected(java.lang.String arg0, java.lang.String arg1,
            java.lang.String arg2) throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.isSelected(arg0, arg1, arg2);
    }

    public java.lang.String getAttribute(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.getAttribute(arg0, arg1, arg2, arg3);
    }

    public java.lang.String getTagName(java.lang.String arg0,
            java.lang.String arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
        if (webCore == null)
            _initWebCoreProxy();
        return webCore.getTagName(arg0, arg1, arg2);
    }

}