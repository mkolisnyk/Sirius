/**
 * 
 */
package org.sirius.client.test.steps.win32.controls.declarations;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.classes.Window;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 *
 */
public class ButtonPageTab extends Window {

    /**
     * @param clientValue
     * @param locatorValue
     */
    public ButtonPageTab(Win32Client clientValue, Win32Locator locatorValue) {
        super(clientValue, locatorValue);
    }
}
