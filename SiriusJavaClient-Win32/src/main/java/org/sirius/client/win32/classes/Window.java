/**
 * .
 */
package org.sirius.client.win32.classes;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Date;

import org.apache.axis.types.UnsignedShort;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.core.types.Rect;
import org.sirius.client.win32.types.Win32Locator;

import com.sun.jna.platform.win32.WinUser;

/**
 * @author Myk Kolisnyk
 * .
 */
public class Window implements WinUser {

    /**
     * .
     */
    private Win32Client  client;
    /**
     * .
     */
    private Win32Locator locator;
    /**
     * .
     */
    private Window       parent;

    /**
     * .
     */
    private Logger       logger;

    /**
     * @return the client
     */
    public final Win32Client getClient() {
        return client;
    }

    /**
     * @param clientValue the client to set
     */
    public final void setClient(final Win32Client clientValue) {
        this.client = clientValue;
    }

    /**
     * @return the logger
     */
    public final Logger getLogger() {
        return logger;
    }

    /**
     * @param locatorValue the locator to set
     */
    public final void setLocator(final Win32Locator locatorValue) {
        this.locator = locatorValue;
    }

    /**
     * @param parentValue the parent to set
     */
    public final void setParent(final Window parentValue) {
        this.parent = parentValue;
    }

    /**
     * .
     * @param clientValue .
     * @param locatorValue .
     */
    public Window(
            final Win32Client clientValue,
            final Win32Locator locatorValue) {
        this(clientValue, null, locatorValue);
    }

    /**
     * .
     * @param clientValue .
     * @param parentValue .
     * @param locatorValue .
     */
    public Window(
            final Win32Client clientValue,
            final Window parentValue,
            final Win32Locator locatorValue) {
        this.client = clientValue;
        this.locator = locatorValue;
        this.parent = parentValue;
        logger = Logger.getLogger(this.getClass());
        logger.addAppender(new ConsoleAppender(new SimpleLayout()));

        logger.debug("Initializing instance");
    }

    /**
     * .
     * @param parentValue .
     * @param locatorValue .
     */
    public Window(final Window parentValue, final Win32Locator locatorValue) {
        client = null;
        this.locator = locatorValue;
        this.parent = parentValue;
        logger = Logger.getLogger(this.getClass());
        logger.addAppender(new ConsoleAppender(new SimpleLayout()));

        logger.debug("Initializing instance");
        if (parent != null) {
            client = parent.client;
        }
    }

    /**
     * .
     * @throws Exception .
     */
    public final void click() throws Exception {
        if (!exists()) {
            return;
        }
        client.core().window()
                .click(locator.getHwnd(), 0, 0, 0, false, false, false);
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final boolean disappears() throws Exception {
        return !exists();
    }

    /**
     * .
     * @param timeout .
     * @return .
     * @throws Exception .
     */
    public final boolean disappears(final long timeout) throws Exception {
        return waitFor(timeout, "disappears", true);
    }

    /**
     * .
     * @return .
     * @throws RemoteException .
     */
    public final boolean exists() throws RemoteException {
        logger.debug(String.format("Searching for window: %s", locator));

        if (parent != null) {
            logger.debug(
                String.format("Searching for parent window: %s",
                    parent.getLocator()));

            if (!parent.exists()) {
                logger.debug(
                    String.format(
                        "Parent window doesn't exist. Returning false"
                    )
                );
                return false;
            } else {
                logger.debug(
                    String.format(
                        "The parent window was found: %s. "
                        + "Looking for current window: %s",
                        parent.getLocator(),
                        this.getLocator()
                    )
                );
                locator.setParent(parent.getHwnd());
            }
        }

        locator.setHwnd(0);
        if (parent != null) {
            client = parent.client;
        }

        long hwnd = 0;
        logger.debug(String.format("Searching for window: %s", locator));
        try {
            hwnd = client.utils().searchWindow(locator);
        } catch (Throwable e) {
            logger.debug(
                    String.format("Error while searching for window", locator),
                    e);
        }
        logger.debug(String.format("HWND returned: %d", hwnd));
        if (hwnd != 0) {
            locator.setHwnd(hwnd);

            logger.debug(String.format("Window found: %s", locator));

            return true;
        } else {
            locator.setHwnd(0);
        }

        logger.debug(String.format("Window wasn't found"));

        return false;
    }

    /**
     * .
     * @param timeout .
     * @return .
     * @throws Exception .
     */
    public final boolean exists(final long timeout) throws Exception {
        return waitFor(timeout, "exists", true);
    }

    /**
     * .
     * @param params .
     * @return .
     */
    private Class<?>[] getArrayTypes(final Object... params) {
        Class<?>[] types = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            types[i] = params[i].getClass();
        }
        return types;
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final Rect getClientRect() throws Exception {
        Rect rc = client.core().window().getClientRect(locator.getHwnd());
        return rc;
    }

    /**
     * .
     * @return .
     */
    public final long getHwnd() {
        return locator.getHwnd();
    }

    /**
     * .
     * @return .
     */
    public final Win32Locator getLocator() {
        return locator;
    }

    /**
     * .
     * @param text .
     * @return .
     */
    protected final String getNativeText(final UnsignedShort[] text) {
        char[] convertedText = new char[text.length];
        for (int i = 0; i < text.length; i++) {
            convertedText[i] = (char) text[i].intValue();
        }
        return null;
    }

    /**
     * .
     * @return .
     */
    public final Window getParent() {
        return parent;
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final Rect getRect() throws Exception {
        Rect rc = client.core().window().getRect(locator.getHwnd());
        return rc;
    }

    /**
     * .
     * @return .
     */
    public final boolean isActive() {
        return false;
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final boolean isEnabled() throws Exception {
        return client.core().window().isEnabled(locator.getHwnd());
    }

    /**
     * .
     * @param timeout .
     * @return .
     * @throws Exception .
     */
    public final boolean isEnabled(final long timeout) throws Exception {
        return waitFor(timeout, "isEnabled", true);
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final boolean isVisible() throws Exception {
        return client.core().window().isVisible(locator.getHwnd());
    }

    /**
     * .
     * @param timeout .
     * @return .
     * @throws Exception .
     */
    public final boolean isVisible(final long timeout) throws Exception {
        return waitFor(timeout, "isVisible", true);
    }

    /**
     * .
     */
    public final void sendKeys() {
    }

    /**
     * .
     * @param text .
     * @throws Exception .
     */
    public final void typeKeys(final String text) throws Exception {
        if (!exists()) {
            return;
        }
        for (char key : text.toCharArray()) {
            int code = key;
            // TODO Add specific keys handling
            client.core().window().keyPress(locator.getHwnd(), code);
        }
    }

    /**
     * .
     * @param timeout .
     * @param methodName .
     * @param expectedValue .
     * @param params .
     * @return .
     * @throws Exception .
     */
    public final boolean waitFor(final long timeout, final String methodName,
            final Object expectedValue, final Object... params)
            throws Exception {
        long end = new Date().getTime() + timeout;
        Class<?>[] parameterTypes = getArrayTypes(params);
        while (new Date().getTime() < end) {
            Method waitMethod = this.getClass().getMethod(methodName,
                    parameterTypes);
            Object result = waitMethod.invoke(this, params);
            if (result.equals(expectedValue)) {
                return true;
            }
        }
        return false;
    }
}
