/**
 * 
 */
package org.sirius.client.win32.classes;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Date;

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

	protected Win32Client client;
	protected Win32Locator locator;
	protected Window parent;

	protected Logger logger;

	/**
	 * 
	 */
	public Window(Win32Client client, Win32Locator locator) {
		this(client, null, locator);
	}

	/**
	 * 
	 */
	public Window(Win32Client client, Window parent, Win32Locator locator) {
		this.client = client;
		this.locator = locator;
		this.parent = parent;
		this.logger = Logger.getLogger(this.getClass());
		this.logger.addAppender(new ConsoleAppender(new SimpleLayout()));

		logger.debug("Initializing instance");
	}

	/**
	 * @param parent2
	 * @param locator2
	 */
	public Window(Window parent, Win32Locator locator) {
		this.client = null;
		this.locator = locator;
		this.parent = parent;
		this.logger = Logger.getLogger(this.getClass());
		this.logger.addAppender(new ConsoleAppender(new SimpleLayout()));

		logger.debug("Initializing instance");
	}

	public void click() {
		;
	}

	public long getHwnd() {
		return this.locator.getHwnd();
	}

	public Win32Locator getLocator() {
		return this.locator;
	}

	public boolean exists() throws RemoteException {
		logger.debug(String.format("Searching for window: %s", this.locator));

		if (parent != null) {
			logger.debug(String.format("Searching for parent window: %s",
					this.parent.getLocator()));

			if (!parent.exists()) {
				logger.debug(String
						.format("Parent window doesn't exist. Returning false"));
				return false;
			} else {
				logger.debug(String
						.format("The parent window was found. Looking for current window"));
				this.locator.setParent(parent.getHwnd());
			}
		}

		this.locator.setHwnd(0);
		long hwnd = 0;
		hwnd = client.utils().searchWindow(locator);
		if (hwnd != 0) {
			this.locator.setHwnd(hwnd);

			logger.debug(String.format("Window found: %s", this.locator));

			return true;
		} else {
			this.locator.setHwnd(0);
		}

		logger.debug(String.format("Window wasn't found"));

		return false;
	}

	private Class<?>[] getArrayTypes(Object... params) {
		Class<?>[] types = new Class[params.length];
		for (int i = 0; i < params.length; i++) {
			types[i] = params[i].getClass();
		}
		return types;
	}

	public boolean waitFor(long timeout, String methodName,
			Object expectedValue, Object... params) throws Exception {
		long end = (new Date()).getTime() + timeout;
		Class<?>[] parameterTypes = getArrayTypes(params);
		while ((new Date()).getTime() < end) {
			Method waitMethod = this.getClass().getMethod(methodName,
					parameterTypes);
			Object result = waitMethod.invoke(this, params);
			if (result.equals(expectedValue)) {
				return true;
			}
		}
		return false;
	}

	public boolean exists(long timeout) throws Exception {
		return waitFor(timeout, "exists", true);
	}

	public boolean disappears() throws Exception {
		return !exists();
	}

	public boolean disappears(long timeout) throws Exception {
		return waitFor(timeout, "disappears", true);
	}

	public Rect getClientRect() throws Exception {
		Rect rc = client.core().window().getClientRect(this.locator.getHwnd());
		return rc;
	}

	public Rect getRect() throws Exception {
		Rect rc = client.core().window().getRect(this.locator.getHwnd());
		return rc;
	}

	public boolean isActive() {
		return false;
	}

	public boolean isEnabled() throws Exception {
		return client.core().window().isEnabled(locator.getHwnd());
	}

	public boolean isVisible() throws Exception {
		return client.core().window().isVisible(locator.getHwnd());
	}

	public void sendKeys() {
		;
	}

	public Window getParent() {
		return parent;
	}
}
