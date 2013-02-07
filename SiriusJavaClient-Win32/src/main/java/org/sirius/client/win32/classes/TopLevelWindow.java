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
	public TopLevelWindow(Win32Client client, Win32Locator locator) {
		super(client, locator);
	}

	public TopLevelWindow(Win32Client client, Window parent, Win32Locator locator) {
		super(client, parent, locator);
	}

	public void setActive() throws Exception {
		this.client.core().window().activate(locator.getHwnd());
	}

	public Menu menu() throws Exception {
		if (this.exists()) {
			Menu menu = new Menu(client, this);
			return menu;
		}
		return null;
	}

	public Menu systemMenu() throws Exception {
		if (this.exists()) {
			long hmenu = this.client.core().window()
					.getSystemMenu(this.getHwnd(), true);
			Menu menu = new Menu(client, this, hmenu);
			return menu;
		}
		return null;
	}
}
