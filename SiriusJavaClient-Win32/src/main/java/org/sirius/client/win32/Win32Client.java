/**
 * 
 */
package org.sirius.client.win32;

import org.sirius.client.win32.core.Win32CoreClient;
import org.sirius.client.win32.utils.Win32UtilsProxy;

/**
 * @author Myk Kolisnyk
 * 
 */
public class Win32Client {

	private Win32CoreClient core;
	private Win32UtilsProxy utils;

	/**
	 * 
	 */
	public Win32Client() {
		core = new Win32CoreClient();
		utils = new Win32UtilsProxy();
	}

	public final Win32CoreClient core() {
		return core;
	}

	public final Win32UtilsProxy utils() {
		return utils;
	}
}
