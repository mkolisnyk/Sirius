/**
 * .
 */
package org.sirius.client.web.classes;

/**
 * @author Myk Kolisnyk .
 */
public class WebButton extends WebControl {

	/**
	 * @param parent
	 *            .
	 * @param locator
	 *            .
	 */
	public WebButton(final Frame parent, final String locator) {
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
	public WebButton(final Frame parent, final String parentElement,
			final String locator) {
		super(parent, parentElement, locator);
		// TODO Auto-generated constructor stub
	}

	/**
	 * .
	 * 
	 * @return .
	 * @throws Exception .
	 */
	public final String text() throws Exception {
		String text = client().core().getAttribute(getParentElement(),
				getLocator(), "value");
		if (text.equals("")) {
			text = this.innerText();
		}
		return text;
	}
}
