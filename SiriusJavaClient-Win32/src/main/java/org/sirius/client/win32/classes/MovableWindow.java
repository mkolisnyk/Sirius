/**
 * 
 */
package org.sirius.client.win32.classes;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.core.types.Rect;
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
		Rect rc = this.getRect();
		return this.client
				.core()
				.user32()
				.moveWindow(locator.getHwnd(), x, y,
						rc.getRight() - rc.getLeft(),
						rc.getBottom() - rc.getTop(), true);
	}

	public boolean sizeTo(int width,int height) throws Exception {
		Rect rc = this.getRect();
		return this.client
				.core()
				.user32()
				.moveWindow(locator.getHwnd(), rc.getLeft(), rc.getTop(),
						width,
						height, true);
	}

	public void minimize() throws Exception {
		this.client
		.core()
		.user32().showWindow(locator.getHwnd(), SW_MINIMIZE);
	}

	public void maximize() throws Exception {
		this.client
		.core()
		.user32().showWindow(locator.getHwnd(), SW_MAXIMIZE);
	}

	public void restore() throws Exception {
		this.client
		.core()
		.user32().showWindow(locator.getHwnd(), SW_SHOWNORMAL);
	}

	public void close() throws Exception {
		this.client
		.core()
		.user32().closeWindow(locator.getHwnd());
	}
}
