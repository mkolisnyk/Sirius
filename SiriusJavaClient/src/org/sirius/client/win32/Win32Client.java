/**
 * 
 */
package org.sirius.client.win32;

import org.sirius.client.win32.core.Win32CoreClient;

/**
 * @author Myk Kolisnyk
 * 
 */
public class Win32Client {

	private Win32CoreClient core;

	/**
	 * 
	 */
	public Win32Client() {
		core = new Win32CoreClient();
	}

	public final Win32CoreClient core() {
		return core;
	}
}
