/**
 * .
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

import org.sirius.client.web.WebClient;

/**
 * @author Myk Kolisnyk
 * .
 */
public class Form extends Frame {

    /**
     * .
     * @param client .
     * @param locator .
     */
    public Form(final WebClient client, final String locator) {
        super(client, locator);
    }

    /**
     * .
     * @return .
     * @throws RemoteException .
     */
    public final String action() throws RemoteException {
        return this.getClient()
                .core()
                .getAttribute(null, getLocator(), "action");
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final String method() throws Exception {
        return this.getClient()
                .core()
                .getAttribute(null, getLocator(), "method");
    }

    /**
     * .
     * @return .
     * @throws RemoteException .
     */
    public final String name() throws RemoteException {
        return this.getClient()
                .core()
                .getAttribute(null, getLocator(), "name");
    }

    /**
     * .
     * @throws RemoteException .
     */
    public final void submit() throws RemoteException {
        this.getClient().core().submit(null, getLocator());
    }
}
