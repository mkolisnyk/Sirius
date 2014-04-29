package org.sirius.client.web.select;

public class WebSelectProxy implements org.sirius.client.web.select.WebSelect {
	private String _endpoint = null;
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

	public void selectByIndex(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator, int index)
			throws java.rmi.RemoteException {
		if (webSelect == null)
			_initWebSelectProxy();
		webSelect.selectByIndex(token, parentLocator, locator, index);
	}

	public void deselectAll(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator)
			throws java.rmi.RemoteException {
		if (webSelect == null)
			_initWebSelectProxy();
		webSelect.deselectAll(token, parentLocator, locator);
	}

	public boolean isMultiple(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator)
			throws java.rmi.RemoteException {
		if (webSelect == null)
			_initWebSelectProxy();
		return webSelect.isMultiple(token, parentLocator, locator);
	}

	public void selectByValue(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator,
			java.lang.String value) throws java.rmi.RemoteException {
		if (webSelect == null)
			_initWebSelectProxy();
		webSelect.selectByValue(token, parentLocator, locator, value);
	}

	public java.lang.String[] getAllOptions(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator)
			throws java.rmi.RemoteException {
		if (webSelect == null)
			_initWebSelectProxy();
		return webSelect.getAllOptions(token, parentLocator, locator);
	}

	public java.lang.String[] getAllSelectedOptions(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator)
			throws java.rmi.RemoteException {
		if (webSelect == null)
			_initWebSelectProxy();
		return webSelect.getAllSelectedOptions(token, parentLocator, locator);
	}

	public void deselectByValue(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator,
			java.lang.String value) throws java.rmi.RemoteException {
		if (webSelect == null)
			_initWebSelectProxy();
		webSelect.deselectByValue(token, parentLocator, locator, value);
	}

	public java.lang.String getFirstSelectedOption(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator)
			throws java.rmi.RemoteException {
		if (webSelect == null)
			_initWebSelectProxy();
		return webSelect.getFirstSelectedOption(token, parentLocator, locator);
	}

	public void selectByVisibleText(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator,
			java.lang.String text) throws java.rmi.RemoteException {
		if (webSelect == null)
			_initWebSelectProxy();
		webSelect.selectByVisibleText(token, parentLocator, locator, text);
	}

	public void deselectByIndex(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator, int index)
			throws java.rmi.RemoteException {
		if (webSelect == null)
			_initWebSelectProxy();
		webSelect.deselectByIndex(token, parentLocator, locator, index);
	}

	public void deselectByVisibleText(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator,
			java.lang.String text) throws java.rmi.RemoteException {
		if (webSelect == null)
			_initWebSelectProxy();
		webSelect.deselectByVisibleText(token, parentLocator, locator, text);
	}

}