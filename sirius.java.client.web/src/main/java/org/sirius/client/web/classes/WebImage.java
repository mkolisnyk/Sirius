/**
 * .
 */
package org.sirius.client.web.classes;

import java.rmi.RemoteException;

/**
 * @author Myk Kolisnyk
 * .
 */
public class WebImage extends WebButton {

    /**
     * @param parent .
     * @param locator .
     */
    public WebImage(final Frame parent, final String locator) {
        super(parent, locator);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param parent .
     * @param parentElement .
     * @param locator .
     */
    public WebImage(final Frame parent, final String parentElement,
            final String locator) {
        super(parent, parentElement, locator);
        // TODO Auto-generated constructor stub
    }

    /**
     * .
     * @return .
     * @throws RemoteException .
     */
    public final String alt() throws RemoteException {
        return this.getAttribute("alt");
    }

    /**
     * .
     * @return .
     * @throws RemoteException .
     */
    public final String src() throws RemoteException {
        return this.getAttribute("src");
    }
}
