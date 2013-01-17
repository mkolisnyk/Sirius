/**
 * 
 */
package org.sirius.client.win32.core;

import org.sirius.client.win32.core.kernel.Kernel32LibProxy;
import org.sirius.client.win32.core.shell32.Shell32LibProxy;
import org.sirius.client.win32.core.user32.User32LibProxy;

/**
 * @author Myk Kolisnyk
 * 
 */
public class Win32CoreClient {

	private Kernel32LibProxy kernel32;
	private User32LibProxy user32;
	private Shell32LibProxy shell32;

	public final Kernel32LibProxy kernel32() {
		return kernel32;
	}

	public final User32LibProxy user32() {
		return user32;
	}

	public final Shell32LibProxy shell32() {
		return shell32;
	}

	/**
	 * 
	 */
	public Win32CoreClient() {
		kernel32 = new Kernel32LibProxy();
		user32 = new User32LibProxy();
		shell32 = new Shell32LibProxy();
	}

}
