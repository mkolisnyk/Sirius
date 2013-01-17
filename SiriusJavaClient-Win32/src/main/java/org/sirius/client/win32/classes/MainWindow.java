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
public class MainWindow extends TopLevelWindow {

	/**
	 * @param client
	 * @param locator
	 */
	public MainWindow(Win32Client client, Win32Locator locator) {
		super(client, locator);
	}

	/**
	 * 
	 * @param executable
	 * @param params
	 * @param workingDir
	 * @throws Exception
	 */
	public void start(String executable, String params, String workingDir)
			throws Exception {
		this.client
				.core()
				.shell32()
				.shellExecute(this.locator.getHwnd(), null, executable, params,
						workingDir, SW_SHOW);
	}
}
