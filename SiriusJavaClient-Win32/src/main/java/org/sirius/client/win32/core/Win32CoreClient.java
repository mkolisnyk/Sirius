/**
 * 
 */
package org.sirius.client.win32.core;

import org.sirius.client.win32.core.classes.menu.MenuProxy;
import org.sirius.client.win32.core.classes.window.WindowProxy;

/**
 * @author Myk Kolisnyk
 * 
 */
public class Win32CoreClient {

	private MenuProxy menu;
	private WindowProxy window;

	public final MenuProxy menu() {
		return menu;
	}

	public final WindowProxy window() {
		return window;
	}

	/**
	 * 
	 */
	public Win32CoreClient() {
		menu = new MenuProxy();
		window = new WindowProxy();
	}

}
