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
public class MovableWindow extends Window {

    /**
     * @param client
     * @param locator
     */
    public MovableWindow(final Win32Client client, final Win32Locator locator) {
        super(client, locator);
    }

    public MovableWindow(final Win32Client client, final Window parent,
            final Win32Locator locator) {
        super(client, parent, locator);
    }

    public void close() throws Exception {
        client.core().window().close(locator.getHwnd());
    }

    public boolean isMaximized() throws Exception {
        return client.core().window().isMaximized(locator.getHwnd());
    }

    public boolean isMinimized() throws Exception {
        return client.core().window().isMinimized(locator.getHwnd());
    }

    public boolean isRestored() throws Exception {
        return client.core().window().isNormal(locator.getHwnd());
    }

    public void maximize() throws Exception {
        client.core().window().maximize(locator.getHwnd());
    }

    public void minimize() throws Exception {
        client.core().window().minimize(locator.getHwnd());
    }

    public boolean moveTo(final int x, final int y) throws Exception {
        client.core().window().moveTo(locator.getHwnd(), x, y);
        return true;
    }

    public void restore() throws Exception {
        client.core().window().restore(locator.getHwnd());
    }

    public boolean sizeTo(final int width, final int height) throws Exception {
        client.core().window().sizeTo(locator.getHwnd(), width, height);
        return true;
    }
}
