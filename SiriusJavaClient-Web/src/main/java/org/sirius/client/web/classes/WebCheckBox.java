/**
 * 
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

/**
 * @author Myk Kolisnyk
 *
 */
public class WebCheckBox extends WebRadioButton {

	/**
	 * @param parent
	 * @param parentElement
	 * @param locator
	 */
	public WebCheckBox(Frame parent, String parentElement, String locator) {
		super(parent, parentElement, locator);
	}

	/**
	 * @param parent
	 * @param locator
	 */
	public WebCheckBox(Frame parent, String locator) {
		super(parent, locator);
	}

	public void uncheck() throws RemoteException, Exception{
		if(isChecked()){
			click();
		}
	}

}
