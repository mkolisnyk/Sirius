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
     * @param locator
     */
    public WebCheckBox(final Frame parent, final String locator) {
        super(parent, locator);
    }

    /**
     * @param parent
     * @param parentElement
     * @param locator
     */
    public WebCheckBox(final Frame parent, final String parentElement,
            final String locator) {
        super(parent, parentElement, locator);
    }

    public void uncheck() throws RemoteException, Exception {
        if (isChecked()) {
            click();
        }
    }

}
