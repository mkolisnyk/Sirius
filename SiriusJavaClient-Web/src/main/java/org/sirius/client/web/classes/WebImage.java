/**
 * 
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

/**
 * @author Myk Kolisnyk
 *
 */
public class WebImage extends WebButton {

	/**
	 * @param parent
	 * @param parentElement
	 * @param locator
	 */
	public WebImage(Frame parent, String parentElement, String locator) {
		super(parent, parentElement, locator);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parent
	 * @param locator
	 */
	public WebImage(Frame parent, String locator) {
		super(parent, locator);
		// TODO Auto-generated constructor stub
	}

	public String src() throws RemoteException{
		return this.getAttribute("src");
	}
	
	public String alt() throws RemoteException{
		return this.getAttribute("alt");
	}	
}
