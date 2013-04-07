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

    public Page(final WebClient client) {
        super(client, null);
    }

    /**
	 * 
	 */
    public Page(final WebClient client, final String locator) {
        super(client, locator);
    }

    public void back() throws RemoteException {
        client.core().back();
    }

    public void forward() throws RemoteException {
        client.core().forward();
    }

    public void home() {
        ;
    }

    public void open(final String URL) throws RemoteException {
        client.core().open(URL);
    }

    public void refresh() throws RemoteException {
        client.core().refresh();
    }

    public void switchTo(final Page page) throws RemoteException {
        client.core().selectWindow(page.getLocator());
    }

    public String title() throws RemoteException {
        return client.core().getTitle();
    }
}
