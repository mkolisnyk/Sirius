/**
 * 
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
 * 
 */
public class Window implements WinUser {

    protected Win32Client  client;
    protected Win32Locator locator;
    protected Window       parent;

    protected Logger       logger;

    /**
	 * 
	 */
    public Window(final Win32Client client, final Win32Locator locator) {
        this(client, null, locator);
    }

    /**
	 * 
	 */
    public Window(final Win32Client client, final Window parent,
            final Win32Locator locator) {
        this.client = client;
        this.locator = locator;
        this.parent = parent;
        logger = Logger.getLogger(this.getClass());
        logger.addAppender(new ConsoleAppender(new SimpleLayout()));

        logger.debug("Initializing instance");
    }

    /**
     * @param parent2
     * @param locator2
     */
    public Window(final Window parent, final Win32Locator locator) {
        client = null;
        this.locator = locator;
        this.parent = parent;
        logger = Logger.getLogger(this.getClass());
        logger.addAppender(new ConsoleAppender(new SimpleLayout()));

        logger.debug("Initializing instance");
        if (parent != null) {
            client = parent.client;
        }
    }

    public void click() throws Exception {
        if (!exists()) {
            return;
        }
        client.core().window()
                .click(locator.getHwnd(), 0, 0, 0, false, false, false);
    }

    public boolean disappears() throws Exception {
        return !exists();
    }

    public boolean disappears(final long timeout) throws Exception {
        return waitFor(timeout, "disappears", true);
    }

    public boolean exists() throws RemoteException {
        logger.debug(String.format("Searching for window: %s", locator));

        if (parent != null) {
            logger.debug(String.format("Searching for parent window: %s",
                    parent.getLocator()));

            if (!parent.exists()) {
                logger.debug(String
                        .format("Parent window doesn't exist. Returning false"));
                return false;
            } else {
                logger.debug(String
                        .format("The parent window was found: %s. Looking for current window: %s",
                                parent.getLocator(), this.getLocator()));
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

    public boolean exists(final long timeout) throws Exception {
        return waitFor(timeout, "exists", true);
    }

    private Class<?>[] getArrayTypes(final Object... params) {
        Class<?>[] types = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            types[i] = params[i].getClass();
        }
        return types;
    }

    public Rect getClientRect() throws Exception {
        Rect rc = client.core().window().getClientRect(locator.getHwnd());
        return rc;
    }

    public long getHwnd() {
        return locator.getHwnd();
    }

    public Win32Locator getLocator() {
        return locator;
    }

    protected String getNativeText(final UnsignedShort[] text) {
        char[] convertedText = new char[text.length];
        for (int i = 0; i < text.length; i++) {
            convertedText[i] = (char) text[i].intValue();
        }
        return null;
    }

    public Window getParent() {
        return parent;
    }

    public Rect getRect() throws Exception {
        Rect rc = client.core().window().getRect(locator.getHwnd());
        return rc;
    }

    public boolean isActive() {
        return false;
    }

    public boolean isEnabled() throws Exception {
        return client.core().window().isEnabled(locator.getHwnd());
    }

    public boolean isEnabled(final long timeout) throws Exception {
        return waitFor(timeout, "isEnabled", true);
    }

    public boolean isVisible() throws Exception {
        return client.core().window().isVisible(locator.getHwnd());
    }

    public boolean isVisible(final long timeout) throws Exception {
        return waitFor(timeout, "isVisible", true);
    }

    public void sendKeys() {
        ;
    }

    public void typeKeys(final String text) throws Exception {
        if (!exists()) {
            return;
        }
        for (char key : text.toCharArray()) {
            int code = key;
            // TODO Add specific keys handling
            client.core().window().keyPress(locator.getHwnd(), code);
        }
    }

    public boolean waitFor(final long timeout, final String methodName,
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
