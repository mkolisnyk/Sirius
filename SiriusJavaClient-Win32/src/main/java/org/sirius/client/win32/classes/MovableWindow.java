/**
 * .
 */
package org.sirius.client.win32.classes;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * .
 */
public class MovableWindow extends Window {

    /**
     * @param clientValue .
     * @param locatorValue .
     */
    public MovableWindow(
            final Win32Client clientValue,
            final Win32Locator locatorValue) {
        super(clientValue, locatorValue);
    }

    /**
     * .
     * @param clientValue .
     * @param parentValue .
     * @param locatorValue .
     */
    public MovableWindow(
            final Win32Client clientValue,
            final Window parentValue,
            final Win32Locator locatorValue) {
        super(clientValue, parentValue, locatorValue);
    }

    /**
     * .
     * @throws Exception .
     */
    public final void close() throws Exception {
        client.core().window().close(locator.getHwnd());
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final boolean isMaximized() throws Exception {
        return client.core().window().isMaximized(locator.getHwnd());
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final boolean isMinimized() throws Exception {
        return client.core().window().isMinimized(locator.getHwnd());
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final boolean isRestored() throws Exception {
        return client.core().window().isNormal(locator.getHwnd());
    }

    /**
     * .
     * @throws Exception .
     */
    public final void maximize() throws Exception {
        client.core().window().maximize(locator.getHwnd());
    }

    /**
     * .
     * @throws Exception .
     */
    public final void minimize() throws Exception {
        client.core().window().minimize(locator.getHwnd());
    }

    /**
     * .
     * @param x .
     * @param y .
     * @return .
     * @throws Exception .
     */
    public final boolean moveTo(final int x, final int y) throws Exception {
        client.core().window().moveTo(locator.getHwnd(), x, y);
        return true;
    }

    /**
     * .
     * @throws Exception .
     */
    public final void restore() throws Exception {
        client.core().window().restore(locator.getHwnd());
    }

    /**
     * .
     * @param width .
     * @param height .
     * @return .
     * @throws Exception .
     */
    public final boolean sizeTo(
            final int width,
            final int height)
                    throws Exception {
        client.core().window().sizeTo(locator.getHwnd(), width, height);
        return true;
    }
}
