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
public class Form extends Frame {

    /**
	 * 
	 */
    public Form(final WebClient client, final String locator) {
        super(client, locator);
    }

    public String action() throws RemoteException {
        return this.client.core().getAttribute(null, locator, "action");
    }

    public String method() throws Exception {
        return this.client.core().getAttribute(null, locator, "method");
    }

    public String name() throws RemoteException {
        return this.client.core().getAttribute(null, locator, "name");
    }

    public void submit() throws RemoteException {
        this.client.core().submit(null, locator);
    }
}
