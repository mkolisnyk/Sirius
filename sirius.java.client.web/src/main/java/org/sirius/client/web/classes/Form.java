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
     * Initializes new instance of the Web Form object.
     * @param client the reference to org.sirius.client.web.WebClient object.
     * @param locator the string representing the search criteria for the current object.
     */
    public Form(final WebClient client, final String locator) {
        super(client, locator);
    }

    /**
     * Retrieves the URL or script name which should be executed when Submit button is clicked.
     * @return the value of the form <b>action</b> attribute.
     * @throws RemoteException thrown when there's no connection with the server or some other connectivity problems.
     */
    public final String action() throws RemoteException {
        return this.getClient()
                .core()
                .getAttribute(null, getLocator(), "action");
    }

    /**
     * Returns the name of the method which should be used to transfer the data. Notmally it's something like <b>GET</b> or <b>POST</b>.
     * @return the value of the <b>method</b> form attribute.
     * @throws Exception .
     */
    public final String method() throws Exception {
        return this.getClient()
                .core()
                .getAttribute(null, getLocator(), "method");
    }

    /**
     * Returns the form name.
     * @return the value of the form <b>name</b> attribute.
     * @throws RemoteException thrown when there's no connection with the server or some other connectivity problems.
     */
    public final String name() throws RemoteException {
        return this.getClient()
                .core()
                .getAttribute(null, getLocator(), "name");
    }

    /**
     * Submits current form by clicking the button which is defined as the type <b>submit</b> and belongs to current form.
     * @throws RemoteException thrown when there's no connection with the server or some other connectivity problems.
     */
    public final void submit() throws RemoteException {
        this.getClient().core().submit(null, getLocator());
    }
}
