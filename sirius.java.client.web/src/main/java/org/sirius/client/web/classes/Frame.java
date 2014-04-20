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
public class Frame {

	/**
	 * .
	 */
	private WebClient client = null;

	/**
	 * .
	 */
	private String locator = "";

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
	 * @param locatorValue
	 *            the locator to set
	 */
	public final void setLocator(final String locatorValue) {
		this.locator = locatorValue;
	}

	/**
	 * .
	 * 
	 * @param clientValue
	 *            .
	 * @param locatorValue
	 *            .
	 */
	public Frame(final WebClient clientValue, final String locatorValue) {
		this.client = clientValue;
		this.locator = locatorValue;
	}

	/**
	 * .
	 * 
	 * @return .
	 */
	public final boolean exists() {
		return false;
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final Point getLocation() throws RemoteException {
		return this.client.core().getLocation(null, locator);
	}

	/**
	 * .
	 * 
	 * @return .
	 */
	public final String getLocator() {
		return this.locator;
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final Dimension getSize() throws RemoteException {
		return this.client.core().getSize(null, locator);
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final String getURL() throws RemoteException {
		return this.client.core().getURL();
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final String innerHtml() throws RemoteException {
		return this.client.core().getAttribute(null, locator, "innerHTML");
	}

	/**
	 * .
	 * 
	 * @param frame
	 *            .
	 * @throws RemoteException .
	 */
	public final void switchTo(final Frame frame) throws RemoteException {
		this.client.core().selectFrameByName(frame.getLocator());
	}
}
