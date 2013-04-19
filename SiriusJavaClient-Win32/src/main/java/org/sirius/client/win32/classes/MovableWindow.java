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
        getClient()
        .core()
        .window()
        .close(
                getLocator().getHwnd()
               );
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final boolean isMaximized() throws Exception {
        return getClient()
                .core()
                .window()
                .isMaximized(
                        getLocator().getHwnd()
                       );
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final boolean isMinimized() throws Exception {
        return getClient()
                .core()
                .window()
                .isMinimized(
                        getLocator().getHwnd()
                        );
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final boolean isRestored() throws Exception {
        return getClient()
                .core()
                .window()
                .isNormal(
                        getLocator()
                        .getHwnd()
                        );
    }

    /**
     * .
     * @throws Exception .
     */
    public final void maximize() throws Exception {
        getClient()
        .core()
        .window()
        .maximize(
                getLocator()
                .getHwnd()
                );
    }

    /**
     * .
     * @throws Exception .
     */
    public final void minimize() throws Exception {
        getClient()
        .core()
        .window()
        .minimize(
                getLocator().getHwnd()
                );
    }

    /**
     * .
     * @param x .
     * @param y .
     * @return .
     * @throws Exception .
     */
    public final boolean moveTo(final int x, final int y) throws Exception {
        getClient()
        .core()
        .window()
        .moveTo(
                getLocator()
                .getHwnd(), 
                x, 
                y
                );
        return true;
    }

    /**
     * .
     * @throws Exception .
     */
    public final void restore() throws Exception {
        getClient()
        .core()
        .window()
        .restore(
                getLocator()
                .getHwnd()
               );
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
        getClient()
        .core()
        .window()
        .sizeTo(
                getLocator()
                .getHwnd(),
                width,
                height
               );
        return true;
    }
}
