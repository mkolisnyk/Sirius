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
public class CheckBox extends Button {

    /**
     * .
     * @param parentValue .
     * @param locatorValue .
     */
    public CheckBox(
            final Window parentValue,
            final Win32Locator locatorValue) {
        super(parentValue, locatorValue);
        // TODO Auto-generated constructor stub
    }

    /**
     * .
     */
    public final void check() {
    }

    /**
     * .
     * @return .
     */
    public final boolean isChecked() {
        return false;
    }

    /**
     * .
     * @param checked .
     */
    public final void setState(final boolean checked) {
        if (checked) {
            check();
        } else {
            uncheck();
        }
    }

    /**
     * .
     */
    public void uncheck() {
    }
}
