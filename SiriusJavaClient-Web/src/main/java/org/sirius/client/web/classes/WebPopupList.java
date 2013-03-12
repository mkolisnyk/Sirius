/**
 * 
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

/**
 * @author Myk Kolisnyk
 *
 */
public class WebPopupList extends WebControl {

	/**
	 * @param parent
	 * @param parentElement
	 * @param locator
	 */
	public WebPopupList(Frame parent, String parentElement, String locator) {
		super(parent, parentElement, locator);
	}

	/**
	 * @param parent
	 * @param locator
	 */
	public WebPopupList(Frame parent, String locator) {
		super(parent, locator);
	}

    public boolean isMulti() throws RemoteException {
    	return this.client().core().isMultiple(parentElement, locator);
    }

    public void deselectAll() throws RemoteException {
    	this.client().core().deselectAll(parentElement, locator);
    }
    
    public void deselectByIndex(int arg3) throws RemoteException {
    	this.client().core().deselectByIndex(parentElement, locator, arg3);
    }
    
    public void deselectByValue(String arg3) throws RemoteException{
    	this.client().core().deselectByValue(parentElement, locator, arg3);
    }
    
    public void deselectByVisibleText(String arg3) throws RemoteException{
    	this.client().core().deselectByVisibleText(parentElement, locator, arg3);
    }
    
    public String[] getAllOptions() throws RemoteException {
    	return this.client().core().getAllOptions(parentElement, locator);
    }
    
    public void selectByIndex(int arg3) throws RemoteException {
    	this.client().core().selectByIndex(parentElement, locator, arg3);
    }
    
    public void selectByValue(String arg3) throws RemoteException{
    	this.client().core().selectByValue(parentElement, locator, arg3);
    }
    
    public void selectByVisibleText(String arg3) throws RemoteException{
    	this.client().core().selectByVisibleText(parentElement, locator, arg3);
    }
    
    public String[] getAllSelectedOptions() throws RemoteException {
    	return this.client().core().getAllSelectedOptions(parentElement, locator);
    }
    
    public String getFirstSelectedOption() throws RemoteException {
    	return this.client().core().getFirstSelectedOption(parentElement, locator);
    }

}
