/**
 * 
 */
package org.sirius.client.win32.classes;

import org.apache.axis.types.UnsignedShort;
import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.core.constants.IMenuFlag;

/**
 * @author Myk Kolisnyk
 *
 */
public class Menu implements IMenuFlag {

	Win32Client client;
	long hmenu;
	
	/**
	 * @param client
	 * @param locator
	 */
	public Menu(Win32Client client, long hmenu) {
		this.client = client;
		this.hmenu = hmenu;
	}
	
	public String getMenuItemText(int position) throws Exception {
		int maxLength = 255;
		//char[] buffer = new char[maxLength];
		UnsignedShort[] buffer = new UnsignedShort[maxLength];
		client.core().menu().getMenuString(hmenu, position, buffer , maxLength, (int)MF_BYPOSITION);
		String result = buffer.toString();
		
		return result;
	}
	
	public Menu getSubMenu(int position) throws Exception {
		long subMenu = client.core().menu().getSubMenu(hmenu, position);
		return new Menu(client,subMenu);
	}
	
	public void pick(int position) throws Exception {
		return;
	}
}
