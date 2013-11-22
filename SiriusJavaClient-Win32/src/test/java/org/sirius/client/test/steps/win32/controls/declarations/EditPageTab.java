/**
 * 
 */
package org.sirius.client.test.steps.win32.controls.declarations;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.annotations.Alias;
import org.sirius.client.win32.annotations.Locator;
import org.sirius.client.win32.classes.Window;
import org.sirius.client.win32.classes.controls.Edit;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 *
 */
public class EditPageTab extends Window {

    @Alias(name="Edit Control") 
    @Locator(winClass="Edit")
    public Edit edtText;
    
    /**
     * @param clientValue
     * @param locatorValue
     */
    public EditPageTab(Win32Client clientValue, Win32Locator locatorValue) {
        super(clientValue, locatorValue);
    }

}
