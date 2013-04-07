/**
 * 
 */
package org.sirius.client.win32.classes.controls;

import org.sirius.client.win32.classes.Window;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * 
 */
public class CheckBox extends Button {

    /**
     * @param client
     * @param locator
     */
    public CheckBox(final Window parent, final Win32Locator locator) {
        super(parent, locator);
        // TODO Auto-generated constructor stub
    }

    public void check() {
        ;
    }

    public boolean isChecked() {
        return false;
    }

    public void setState(final boolean checked) {
        if (checked) {
            check();
        } else {
            uncheck();
        }
    }

    public void uncheck() {
        ;
    }
}
