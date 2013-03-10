/**
 * 
 */
package org.sirius.client.web.classes;

/**
 * @author Myk Kolisnyk
 *
 */
public class WebButton extends WebControl {

	/**
	 * @param parent
	 * @param parentElement
	 * @param locator
	 */
	public WebButton(Frame parent, String parentElement, String locator) {
		super(parent, parentElement, locator);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parent
	 * @param locator
	 */
	public WebButton(Frame parent, String locator) {
		super(parent, locator);
		// TODO Auto-generated constructor stub
	}

	public String text() throws Exception {
		String text = client().core().getAttribute(parentElement, locator, "value");
		if(text.equals("")){
			text = this.innerText();
		}
		return text;
	}	
}
