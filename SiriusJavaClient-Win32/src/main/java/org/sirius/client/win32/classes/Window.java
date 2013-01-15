/**
 * 
 */
package org.sirius.client.win32.classes;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Date;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.core.types.Hwnd;
import org.sirius.client.win32.core.types.Rect;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * 
 */
public class Window {

	protected Win32Client client;
	protected Win32Locator locator;

	/**
	 * 
	 */
	public Window(Win32Client client, Win32Locator locator) {
		this.client = client;
		this.locator = locator;
	}

	public void click() {
		;
	}

	public boolean exists() throws RemoteException {
		Hwnd hwnd = client.utils().searchWindow(locator);
		if (hwnd != null) {
			this.locator.setHwnd(hwnd);
			return true;
		}
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
			Method waitMethod = this.getClass().getMethod(methodName, parameterTypes);
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

	public void getClientRect() {
		;
	}

	public Rect getRect() throws Exception {
		Rect rc = new Rect(); 
		if( !client.core().user32().getWindowRect(locator.getHwnd(), rc) ){
			return null;
		}
		return rc;
	}

	public boolean isActive() {
		return false;
	}

	public boolean isEnabled() {
		return false;
	}

	public boolean isVisible() throws Exception {
		return client.core().user32().isWindowVisible(locator.getHwnd());
	}

	public void sendKeys() {
		;
	}

	public Window getParent() {
		return null;
	}
}
