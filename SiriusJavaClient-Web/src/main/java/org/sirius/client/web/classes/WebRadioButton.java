/**
 * 
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

/**
 * @author Myk Kolisnyk
 *
 */
public class WebRadioButton extends WebButton {

	/**
	 * @param parent
	 * @param parentElement
	 * @param locator
	 */
	public WebRadioButton(Frame parent, String parentElement, String locator) {
		super(parent, parentElement, locator);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parent
	 * @param locator
	 */
	public WebRadioButton(Frame parent, String locator) {
		super(parent, locator);
		// TODO Auto-generated constructor stub
	}

	public boolean isChecked() throws RemoteException{
		return this.client().core().isSelected(parentElement, locator);
	}
	
	public void check() throws RemoteException, Exception{
		if(!isChecked()){
			click();
		}
	}
}
