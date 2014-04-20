/**
 * WebSelect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.web.select;

public interface WebSelect extends java.rmi.Remote {
	public void selectByIndex(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator, int index)
			throws java.rmi.RemoteException;

	public void deselectAll(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator)
			throws java.rmi.RemoteException;

	public boolean isMultiple(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator)
			throws java.rmi.RemoteException;

	public void selectByValue(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator,
			java.lang.String value) throws java.rmi.RemoteException;

	public java.lang.String[] getAllOptions(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator)
			throws java.rmi.RemoteException;

	public java.lang.String[] getAllSelectedOptions(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator)
			throws java.rmi.RemoteException;

	public void deselectByValue(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator,
			java.lang.String value) throws java.rmi.RemoteException;

	public java.lang.String getFirstSelectedOption(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator)
			throws java.rmi.RemoteException;

	public void selectByVisibleText(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator,
			java.lang.String text) throws java.rmi.RemoteException;

	public void deselectByIndex(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator, int index)
			throws java.rmi.RemoteException;

	public void deselectByVisibleText(java.lang.String token,
			java.lang.String parentLocator, java.lang.String locator,
			java.lang.String text) throws java.rmi.RemoteException;
}
