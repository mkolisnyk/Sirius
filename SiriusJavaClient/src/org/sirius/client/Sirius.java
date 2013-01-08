/**
 * 
 */
package org.sirius.client;

import org.sirius.client.core.CoreClient;
import org.sirius.client.win32.Win32Client;

/**
 * @author Myk Kolisnyk
 * 
 */
public class Sirius {

	public final CoreClient core() {
		return coreClient;
	}

	public final Win32Client win32() {
		return win32Client;
	}

	private CoreClient coreClient;
	private Win32Client win32Client;

	/**
	 * 
	 */
	public Sirius() {
		coreClient = new CoreClient();
		win32Client = new Win32Client();
	}

}
