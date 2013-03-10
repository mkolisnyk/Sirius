/**
 * 
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

import org.sirius.client.web.WebClient;
import org.sirius.client.web.core.Dimension;
import org.sirius.client.web.core.Point;

/**
 * @author Myk Kolisnyk
 *
 */
public class WebControl {

	protected WebClient client = null;
	protected Frame parent = null;
	protected String parentElement = null;
	protected String locator = null;
	
	protected WebClient client(){
		if(client == null){
			client = parent.client;
		}
		return client;
	}
	
	/**
	 * 
	 */
	public WebControl(Frame parent,String parentElement, String locator) {
		this.parent = parent;
		this.parentElement = parentElement;
		this.locator = locator;
	}

	public WebControl(Frame parent,String locator) {
		this(parent,null,locator);
	}
	
	public String innerText() throws RemoteException{
		return client().core().getAttribute(parentElement, locator, "innerText");
	}
	
	public String innerHtml() throws RemoteException{
		return client().core().getAttribute(parentElement, locator, "innerHTML");
	}
	
	public Point getLocation() throws RemoteException {
		return client().core().getLocation(parentElement, locator);
	}
	
	public Dimension getSize() throws RemoteException {
		return client().core().getSize(parentElement, locator);
	}
	
	public boolean isFocused() throws RemoteException {
		return false;
	}
	
	public void click() throws Exception {
		client().core().click(parentElement, locator);
	}
	
	public String getAttribute(String attribute) throws RemoteException{
		return client().core().getAttribute(parentElement, locator, attribute);
	}
}
