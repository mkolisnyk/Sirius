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
     * @param locator
     */
    public WebRadioButton(final Frame parent, final String locator) {
        super(parent, locator);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param parent
     * @param parentElement
     * @param locator
     */
    public WebRadioButton(final Frame parent, final String parentElement,
            final String locator) {
        super(parent, parentElement, locator);
        // TODO Auto-generated constructor stub
    }

    public void check() throws RemoteException, Exception {
        if (!isChecked()) {
            click();
        }
    }

    public boolean isChecked() throws RemoteException {
        return this.client().core().isSelected(parentElement, locator);
    }
}
