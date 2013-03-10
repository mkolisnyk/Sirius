/**
 * 
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

import org.sirius.client.web.WebClient;

/**
 * @author Myk Kolisnyk
 *
 */
public class Page extends Frame {

	/**
	 * 
	 */
	public Page(WebClient client,String locator) {
		super(client,locator);
	}

	public Page(WebClient client) {
		super(client,null);
	}

	public String title() throws RemoteException{
		return client.core().getTitle();
	}
	
	public void back() throws RemoteException{
		client.core().back();
	}
	
	public void forward() throws RemoteException{
		client.core().forward();
	}
	
	public void refresh() throws RemoteException{
		client.core().refresh();
	}
	
	public void open(String URL) throws RemoteException{
		client.core().open(URL);
	}
	
	public void home(){
		;
	}

	public void switchTo(Page page) throws RemoteException{
		client.core().selectWindow(page.getLocator());
	}
}
