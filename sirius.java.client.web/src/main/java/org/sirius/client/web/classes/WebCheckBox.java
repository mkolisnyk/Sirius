/**
 * .
 */
package org.sirius.client.web.classes;

/**
 * @author Myk Kolisnyk .
 */
public class WebCheckBox extends WebRadioButton {

	/**
	 * @param parent
	 *            .
	 * @param locator
	 *            .
	 */
	public WebCheckBox(final Frame parent, final String locator) {
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
	public WebCheckBox(final Frame parent, final String parentElement,
			final String locator) {
		super(parent, parentElement, locator);
	}

	/**
	 * .
	 * 
	 * @throws Exception .
	 */
	public final void uncheck() throws Exception {
		if (isChecked()) {
			click();
		}
	}

}
