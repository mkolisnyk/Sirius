/**
 * .
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

/**
 * @author Myk Kolisnyk .
 */
public class WebRadioButton extends WebButton {

	/**
	 * @param parentValue
	 *            .
	 * @param locatorValue
	 *            .
	 */
	public WebRadioButton(final Frame parentValue, final String locatorValue) {
		super(parentValue, locatorValue);
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
	public WebRadioButton(final Frame parent, final String parentElement,
			final String locator) {
		super(parent, parentElement, locator);
		// TODO Auto-generated constructor stub
	}

	/**
	 * .
	 * 
	 * @throws Exception .
	 */
	public final void check() throws Exception {
		if (!isChecked()) {
			click();
		}
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws RemoteException .
	 */
	public final boolean isChecked() throws RemoteException {
		return this.client().core()
				.isSelected(getParentElement(), getLocator());
	}
}
