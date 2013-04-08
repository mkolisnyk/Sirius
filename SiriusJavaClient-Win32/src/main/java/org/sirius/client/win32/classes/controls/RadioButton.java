/**
 * .
 */
package org.sirius.client.win32.classes.controls;

import org.sirius.client.win32.classes.Window;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * .
 */
public class RadioButton extends CheckBox {

    /**
     * .
     * @param parentValue .
     * @param locatorValue .
     */
    public RadioButton(
            final Window parentValue,
            final Win32Locator locatorValue) {
        super(parentValue, locatorValue);
        // TODO Auto-generated constructor stub
    }

    @Override
    public final void uncheck() {
    }
}
