/**
 * .
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

import org.sirius.client.web.WebClient;

/**
 * @author Myk Kolisnyk .
 */
public class Page extends Frame {

	/**
	 * .
	 * 
	 * @param client
	 *            .
	 */
	public Page(final WebClient client) {
		super(client, null);
	}

	/**
	 * .
	 * 
	 * @param client
	 *            .
	 * @param locator
	 *            .
	 */
	public Page(final WebClient client, final String locator) {
		super(client, locator);
	}

	/**
	 * .
	 * 
	 * @throws RemoteException .
	 */
	public final void back() throws RemoteException {
		getClient().core().back();
	}

	/**
	 * .
	 * 
	 * @throws RemoteException .
	 */
	public final void forward() throws RemoteException {
		getClient().core().forward();
	}

	/**
	 * .
	 */
	public void home() {
	}

	/**
	 * .
	 * 
	 * @param url
	 *            .
	 * @throws RemoteException .
	 */
	public final void open(final String url) throws RemoteException {
		getClient().core().open(url);
	}

	/**
	 * .
	 * 
	 * @throws RemoteException .
	 */
	public final void refresh() throws RemoteException {
		getClient().core().refresh();
	}

	/**
	 * .
	 * 
	 * @param page
	 *            .
	 * @throws RemoteException .
	 */
	public final void switchTo(final Page page) throws RemoteException {
		getClient().core().selectWindow(page.getLocator());
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final String title() throws RemoteException {
		return getClient().core().getTitle();
	}
}
