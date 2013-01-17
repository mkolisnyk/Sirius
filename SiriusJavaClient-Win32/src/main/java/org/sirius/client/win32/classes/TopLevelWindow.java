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

	public void setActive() throws Exception {
		this.client.core().user32().setForegroundWindow(locator.getHwnd());
	}
	
	public Menu getMenu(){
		
		return null;
	}
}
