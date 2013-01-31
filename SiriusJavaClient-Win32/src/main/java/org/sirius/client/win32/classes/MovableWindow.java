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
	public MovableWindow(Win32Client client, Win32Locator locator) {
		super(client, locator);
	}

	public MovableWindow(Win32Client client, Window parent, Win32Locator locator) {
		super(client, parent, locator);
	}

	public boolean moveTo(int x, int y) throws Exception {
		this.client.core().window().moveTo(locator.getHwnd(), x, y);
		return true;
	}

	public boolean sizeTo(int width, int height) throws Exception {
		this.client.core().window().sizeTo(locator.getHwnd(), width, height);
		return true;
	}

	public void minimize() throws Exception {
		this.client.core().window().minimize(locator.getHwnd());
	}

	public void maximize() throws Exception {
		this.client.core().window().maximize(locator.getHwnd());
	}

	public void restore() throws Exception {
		this.client.core().window().restore(locator.getHwnd());
	}

	public boolean isMinimized() throws Exception {
		return this.client.core().window().isMinimized(locator.getHwnd());
	}

	public boolean isMaximized() throws Exception {
		return this.client.core().window().isMaximized(locator.getHwnd());
	}

	public boolean isRestored() throws Exception {
		return this.client.core().window().isNormal(locator.getHwnd());
	}

	public void close() throws Exception {
		this.client.core().window().close(locator.getHwnd());
	}
}
