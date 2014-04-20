/**
 * .
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

/**
 * @author Myk Kolisnyk .
 */
public class WebEdit extends WebControl {

	/**
	 * @param parent
	 *            .
	 * @param locator
	 *            .
	 */
	public WebEdit(final Frame parent, final String locator) {
		super(parent, locator);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parent
	 *            .
	 * @param parentElement
	 *            .
	 * @param locator
	 *            .
	 */
	public WebEdit(final Frame parent, final String parentElement,
			final String locator) {
		super(parent, parentElement, locator);
		// TODO Auto-generated constructor stub
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final String getText() throws RemoteException {
		return this.getValue();
	}

	/**
	 * .
	 * 
	 * @param text
	 *            .
	 * @throws RemoteException .
	 */
	public final void type(final String text) throws RemoteException {
		this.client().core().sendKeys(getParentElement(), getLocator(), text);
	}
}
