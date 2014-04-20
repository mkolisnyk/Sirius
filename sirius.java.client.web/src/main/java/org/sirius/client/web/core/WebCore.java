/**
 * WebCore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.web.core;

public interface WebCore extends java.rmi.Remote {
	public void clear(java.lang.String token, java.lang.String startFrom,
			java.lang.String locator) throws java.rmi.RemoteException;

	public org.sirius.client.web.core.Point getLocation(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException;

	public java.lang.String getURL(java.lang.String token)
			throws java.rmi.RemoteException;

	public java.lang.String start(java.lang.String browser)
			throws java.rmi.RemoteException;

	public void stop(java.lang.String token) throws java.rmi.RemoteException;

	public org.sirius.client.web.core.Dimension getSize(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException;

	public boolean exists(java.lang.String token, java.lang.String startFrom,
			java.lang.String locator, int timeout)
			throws java.rmi.RemoteException;

	public void open(java.lang.String token, java.lang.String url)
			throws java.rmi.RemoteException;

	public java.lang.String getAttribute(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator,
			java.lang.String attribute) throws java.rmi.RemoteException;

	public boolean isEnabled(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException;

	public void forward(java.lang.String token) throws java.rmi.RemoteException;

	public java.lang.String getCssValue(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator,
			java.lang.String value) throws java.rmi.RemoteException;

	public java.lang.String getPageSource(java.lang.String token)
			throws java.rmi.RemoteException;

	public java.lang.String getTitle(java.lang.String token)
			throws java.rmi.RemoteException;

	public boolean isDisplayed(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException;

	public boolean isSelected(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException;

	public void selectAlert(java.lang.String token)
			throws java.rmi.RemoteException;

	public void selectWindow(java.lang.String token, java.lang.String name)
			throws java.rmi.RemoteException;

	public void sendKeys(java.lang.String token, java.lang.String startFrom,
			java.lang.String locator, java.lang.String text)
			throws java.rmi.RemoteException;

	public java.lang.String getTagName(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException;

	public java.lang.String getText(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator)
			throws java.rmi.RemoteException;

	public void refresh(java.lang.String token) throws java.rmi.RemoteException;

	public void submit(java.lang.String token, java.lang.String startFrom,
			java.lang.String locator) throws java.rmi.RemoteException;

	public void click(java.lang.String token, java.lang.String startFrom,
			java.lang.String locator) throws java.rmi.RemoteException;

	public void back(java.lang.String token) throws java.rmi.RemoteException;

	public java.lang.String getWindowHandle(java.lang.String token)
			throws java.rmi.RemoteException;

	public boolean waitForElementToAppear(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator, int timeout)
			throws java.rmi.RemoteException;

	public void selectDefaultContent(java.lang.String token)
			throws java.rmi.RemoteException;

	public boolean waitForElementToDisappear(java.lang.String token,
			java.lang.String startFrom, java.lang.String locator, int timeout)
			throws java.rmi.RemoteException;

	public void selectFrameByIndex(java.lang.String token, int index)
			throws java.rmi.RemoteException;

	public void selectFrameByName(java.lang.String token, java.lang.String name)
			throws java.rmi.RemoteException;
}
