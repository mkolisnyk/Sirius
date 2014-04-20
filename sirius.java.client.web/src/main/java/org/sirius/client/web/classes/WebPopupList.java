/**
 * .
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

/**
 * @author Myk Kolisnyk .
 */
public class WebPopupList extends WebControl {

	/**
	 * @param parent
	 *            .
	 * @param locator
	 *            .
	 */
	public WebPopupList(final Frame parent, final String locator) {
		super(parent, locator);
	}

	/**
	 * @param parent
	 *            .
	 * @param parentElement
	 *            .
	 * @param locator
	 *            .
	 */
	public WebPopupList(final Frame parent, final String parentElement,
			final String locator) {
		super(parent, parentElement, locator);
	}

	/**
	 * .
	 * 
	 * @throws RemoteException .
	 */
	public final void deselectAll() throws RemoteException {
		this.client().core().deselectAll(getParentElement(), getLocator());
	}

	/**
	 * .
	 * 
	 * @param arg3
	 *            .
	 * @throws RemoteException .
	 */
	public final void deselectByIndex(final int arg3) throws RemoteException {
		this.client().core()
				.deselectByIndex(getParentElement(), getLocator(), arg3);
	}

	/**
	 * .
	 * 
	 * @param arg3
	 *            .
	 * @throws RemoteException .
	 */
	public final void deselectByValue(final String arg3) throws RemoteException {
		this.client().core()
				.deselectByValue(getParentElement(), getLocator(), arg3);
	}

	/**
	 * .
	 * 
	 * @param arg3
	 *            .
	 * @throws RemoteException .
	 */
	public final void deselectByVisibleText(final String arg3)
			throws RemoteException {
		this.client().core()
				.deselectByVisibleText(getParentElement(), getLocator(), arg3);
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final String[] getAllOptions() throws RemoteException {
		return this.client().core()
				.getAllOptions(getParentElement(), getLocator());
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final String[] getAllSelectedOptions() throws RemoteException {
		return this.client().core()
				.getAllSelectedOptions(getParentElement(), getLocator());
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final String getFirstSelectedOption() throws RemoteException {
		return this.client().core()
				.getFirstSelectedOption(getParentElement(), getLocator());
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final boolean isMulti() throws RemoteException {
		return this.client().core()
				.isMultiple(getParentElement(), getLocator());
	}

	/**
	 * .
	 * 
	 * @param arg3
	 *            .
	 * @throws RemoteException .
	 */
	public final void selectByIndex(final int arg3) throws RemoteException {
		this.client().core()
				.selectByIndex(getParentElement(), getLocator(), arg3);
	}

	/**
	 * .
	 * 
	 * @param arg3
	 *            .
	 * @throws RemoteException .
	 */
	public final void selectByValue(final String arg3) throws RemoteException {
		this.client().core()
				.selectByValue(getParentElement(), getLocator(), arg3);
	}

	/**
	 * .
	 * 
	 * @param arg3
	 *            .
	 * @throws RemoteException .
	 */
	public final void selectByVisibleText(final String arg3)
			throws RemoteException {
		this.client().core()
				.selectByVisibleText(getParentElement(), getLocator(), arg3);
	}
}
