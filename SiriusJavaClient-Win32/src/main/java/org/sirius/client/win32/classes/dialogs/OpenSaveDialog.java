/**
 * .
 */
package org.sirius.client.win32.classes.dialogs;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.classes.DialogBox;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * .
 */
public class OpenSaveDialog extends DialogBox {

    /**
     * .
     * @param clientValue .
     * @param locatorValue .
     * @throws Exception 
     */
    public OpenSaveDialog(
            final Win32Client clientValue,
            final Win32Locator locatorValue) throws Exception {
        super(clientValue, locatorValue);
        // TODO Auto-generated constructor stub
    }

}
