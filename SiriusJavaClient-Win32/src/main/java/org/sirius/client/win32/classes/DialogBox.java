/**
 * .
 */
package org.sirius.client.win32.classes;

import java.rmi.RemoteException;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * .
 */
public class DialogBox extends TopLevelWindow {

    /**
     * .
     * @param client .
     * @param locator .
     */
    public DialogBox(final Win32Client client, final Win32Locator locator) {
        super(client, locator);
    }

    /**
     * .
     * @param client .
     * @param parent .
     * @param locator .
     */
    public DialogBox(final Win32Client client, final Window parent,
            final Win32Locator locator) {
        super(client, parent, locator);
    }

    @Override
    public final boolean exists() throws RemoteException {
        logger.debug("Searching for dialog box: " + locator);
        if (parent == null) {
            logger.debug("Searching for dialog box parent");
            return super.exists();
        } else if (!parent.exists()) {
            logger.debug("Parent window doesn't exist. Quiting...");
            return false;
        } else {
            logger.debug("Searching for dialog box in the same thread");
            long hwnd = client.utils().searchSameThreadWindow(parent.getHwnd(),
                    locator);
            if (hwnd == 0) {
                logger.debug("No dialog found. Returning false");
                return false;
            } else {
                locator.setHwnd(hwnd);
            }
        }
        logger.debug("Dialog was found: " + locator);
        return true;
    }

    @Override
    public final boolean exists(final long timeout) throws Exception {
        return waitFor(timeout, "exists", true);
    }
}
