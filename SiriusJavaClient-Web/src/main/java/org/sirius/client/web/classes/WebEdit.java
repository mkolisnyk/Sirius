/**
 * 
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

/**
 * @author Myk Kolisnyk
 *
 */
public class WebEdit extends WebControl {

	/**
	 * @param parent
	 * @param parentElement
	 * @param locator
	 */
	public WebEdit(Frame parent, String parentElement, String locator) {
		super(parent, parentElement, locator);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parent
	 * @param locator
	 */
	public WebEdit(Frame parent, String locator) {
		super(parent, locator);
		// TODO Auto-generated constructor stub
	}

	public void type(String text) throws RemoteException{
		this.client().core().sendKeys(parentElement, locator, text);
	}
	
	public String getText() throws RemoteException{
		return this.getValue();
	}
}
