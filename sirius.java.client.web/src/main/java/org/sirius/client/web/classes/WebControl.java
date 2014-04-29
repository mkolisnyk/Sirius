/**
 * .
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

import org.sirius.client.web.WebClient;
import org.sirius.client.web.core.Dimension;
import org.sirius.client.web.core.Point;

/**
 * @author Myk Kolisnyk .
 */
public class WebControl {

	/**
	 * .
	 */
	private WebClient client = null;
	/**
	 * .
	 */
	private Frame parent = null;
	/**
	 * .
	 */
	private String parentElement = null;
	/**
	 * .
	 */
	private String locator = null;

	/**
	 * @return the client
	 */
	public final WebClient getClient() {
		return client;
	}

	/**
	 * @param clientValue
	 *            the client to set
	 */
	public final void setClient(final WebClient clientValue) {
		this.client = clientValue;
	}

	/**
	 * @return the parent
	 */
	public final Frame getParent() {
		return parent;
	}

	/**
	 * @param parentValue
	 *            the parent to set
	 */
	public final void setParent(final Frame parentValue) {
		this.parent = parentValue;
	}

	/**
	 * @return the parentElement
	 */
	public final String getParentElement() {
		return parentElement;
	}

	/**
	 * @param parentElementValue
	 *            the parentElement to set
	 */
	public final void setParentElement(final String parentElementValue) {
		this.parentElement = parentElementValue;
	}

	/**
	 * @return the locator
	 */
	public final String getLocator() {
		return locator;
	}

	/**
	 * @param locatorValue
	 *            the locator to set
	 */
	public final void setLocator(final String locatorValue) {
		this.locator = locatorValue;
	}

	/**
	 * .
	 * 
	 * @param parentValue
	 *            .
	 * @param locatorValue
	 *            .
	 */
	public WebControl(final Frame parentValue, final String locatorValue) {
		this(parentValue, null, locatorValue);
	}

	/**
	 * .
	 * 
	 * @param parentValue
	 *            .
	 * @param parentElementValue
	 *            .
	 * @param locatorValue
	 *            .
	 */
	public WebControl(final Frame parentValue, final String parentElementValue,
			final String locatorValue) {
		this.parent = parentValue;
		this.parentElement = parentElementValue;
		this.locator = locatorValue;
	}

	/**
	 * .
	 * 
	 * @throws Exception .
	 */
	public final void click() throws Exception {
		client().core().click(parentElement, locator);
	}

	/**
	 * .
	 * 
	 * @return .
	 */
	protected final WebClient client() {
		if (client == null) {
			client = getParent().getClient();
		}
		return client;
	}

	/**
	 * .
	 * 
	 * @param attribute
	 *            .
	 * @return .
	 * @throws RemoteException .
	 */
	public final String getAttribute(final String attribute)
			throws RemoteException {
		return client().core().getAttribute(parentElement, locator, attribute);
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final Point getLocation() throws RemoteException {
		return client().core().getLocation(parentElement, locator);
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final Dimension getSize() throws RemoteException {
		return client().core().getSize(parentElement, locator);
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final String getValue() throws RemoteException {
		return getAttribute("value");
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final String innerHtml() throws RemoteException {
		return client().core()
				.getAttribute(parentElement, locator, "innerHTML");
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final String innerText() throws RemoteException {
		return client().core()
				.getAttribute(parentElement, locator, "innerText");
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final boolean isFocused() throws RemoteException {
		return false;
	}
}
