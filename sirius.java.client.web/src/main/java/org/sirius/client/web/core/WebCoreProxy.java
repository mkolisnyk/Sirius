package org.sirius.client.web.core;

public class WebCoreProxy implements org.sirius.client.web.core.WebCore {
	private String _endpoint = null;
	private org.sirius.client.web.core.WebCore webCore = null;

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

	public void clear(java.lang.String token, java.lang.String startFrom,
			java.lang.String locator) throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.clear(token, startFrom, locator);
	}

	public org.sirius.client.web.core.Point getLocation(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.getLocation(token, startFrom, locator);
	}

	public java.lang.String getURL(java.lang.String token)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.getURL(token);
	}

	public java.lang.String start(java.lang.String browser)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.start(browser);
	}

	public void stop(java.lang.String token) throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.stop(token);
	}

	public org.sirius.client.web.core.Dimension getSize(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.getSize(token, startFrom, locator);
	}

	public boolean exists(java.lang.String token, java.lang.String startFrom,
			java.lang.String locator, int timeout)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.exists(token, startFrom, locator, timeout);
	}

	public void open(java.lang.String token, java.lang.String url)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.open(token, url);
	}

	public java.lang.String getAttribute(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator,
			java.lang.String attribute) throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.getAttribute(token, startFrom, locator, attribute);
	}

	public boolean isEnabled(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.isEnabled(token, startFrom, locator);
	}

	public void forward(java.lang.String token) throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.forward(token);
	}

	public java.lang.String getCssValue(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator,
			java.lang.String value) throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.getCssValue(token, startFrom, locator, value);
	}

	public java.lang.String getPageSource(java.lang.String token)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.getPageSource(token);
	}

	public java.lang.String getTitle(java.lang.String token)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.getTitle(token);
	}

	public boolean isDisplayed(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.isDisplayed(token, startFrom, locator);
	}

	public boolean isSelected(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.isSelected(token, startFrom, locator);
	}

	public void selectAlert(java.lang.String token)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.selectAlert(token);
	}

	public void selectWindow(java.lang.String token, java.lang.String name)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.selectWindow(token, name);
	}

	public void sendKeys(java.lang.String token, java.lang.String startFrom,
			java.lang.String locator, java.lang.String text)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.sendKeys(token, startFrom, locator, text);
	}

	public java.lang.String getTagName(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.getTagName(token, startFrom, locator);
	}

	public java.lang.String getText(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.getText(token, startFrom, locator);
	}

	public void refresh(java.lang.String token) throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.refresh(token);
	}

	public void submit(java.lang.String token, java.lang.String startFrom,
			java.lang.String locator) throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.submit(token, startFrom, locator);
	}

	public void click(java.lang.String token, java.lang.String startFrom,
			java.lang.String locator) throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.click(token, startFrom, locator);
	}

	public void back(java.lang.String token) throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.back(token);
	}

	public java.lang.String getWindowHandle(java.lang.String token)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.getWindowHandle(token);
	}

	public boolean waitForElementToAppear(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator, int timeout)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.waitForElementToAppear(token, startFrom, locator,
				timeout);
	}

	public void selectDefaultContent(java.lang.String token)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.selectDefaultContent(token);
	}

	public boolean waitForElementToDisappear(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator, int timeout)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		return webCore.waitForElementToDisappear(token, startFrom, locator,
				timeout);
	}

	public void selectFrameByIndex(java.lang.String token, int index)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.selectFrameByIndex(token, index);
	}

	public void selectFrameByName(java.lang.String token, java.lang.String name)
			throws java.rmi.RemoteException {
		if (webCore == null)
			_initWebCoreProxy();
		webCore.selectFrameByName(token, name);
	}

}