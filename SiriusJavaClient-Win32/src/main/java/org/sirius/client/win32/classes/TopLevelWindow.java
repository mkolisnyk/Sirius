/**
 * 
 */
package org.sirius.client.win32.classes;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * 
 */
public class TopLevelWindow extends MovableWindow {

    /**
     * @param client
     * @param locator
     */
    public TopLevelWindow(final Win32Client client, final Win32Locator locator) {
        super(client, locator);
    }

    public TopLevelWindow(final Win32Client client, final Window parent,
            final Win32Locator locator) {
        super(client, parent, locator);
    }

    public Menu menu() throws Exception {
        if (this.exists()) {
            Menu menu = new Menu(client, this);
            return menu;
        }
        return null;
    }

    public void setActive() throws Exception {
        client.core().window().activate(locator.getHwnd());
    }

    public Menu systemMenu() throws Exception {
        if (this.exists()) {
            long hmenu = client.core().window()
                    .getSystemMenu(this.getHwnd(), true);
            Menu menu = new Menu(client, this, hmenu);
            return menu;
        }
        return null;
    }
}
