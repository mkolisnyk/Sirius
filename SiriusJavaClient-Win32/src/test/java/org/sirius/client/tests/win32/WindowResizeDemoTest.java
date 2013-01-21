/**
 * 
 */
package org.sirius.client.tests.win32;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;
import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.classes.MainWindow;
import org.sirius.client.win32.constants.IWin32Options;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 *
 */
public class WindowResizeDemoTest {

	Win32Client client = new Win32Client();
	MainWindow notepad = new MainWindow(client,new Win32Locator("Notepad",0));
	
	@Ignore
	@Test
	public void test() throws Exception {
		System.out.println("Starting notepad");
		notepad.start("notepad.exe", "", "");
		System.out.println("Waiting for appear");
		Assert.assertTrue(notepad.exists(IWin32Options.DEFAULT_TIMEOUT));
		System.out.println("OK. It exists!!! Activating...");
		notepad.setActive();
		System.out.println("Maximizing...");
		notepad.maximize();
		System.out.println("Minimizing...");
		notepad.minimize();
		System.out.println("Restore...");
		notepad.restore();
		System.out.println("Close window");
		notepad.close();
		System.out.println("Waiting for disappear...");
		Assert.assertTrue(notepad.disappears(IWin32Options.DEFAULT_TIMEOUT));
		System.out.println("Success");
	}

}
