/**
 * 
 */
package org.sirius.client.win32.classes;

import java.rmi.RemoteException;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * 
 */
public class DialogBox extends TopLevelWindow {

	public DialogBox(Win32Client client, Win32Locator locator) {
		super(client, locator);
	}

	public DialogBox(Win32Client client, Window parent, Win32Locator locator) {
		super(client, parent,locator);
	}
	
	@Override
	public boolean exists() throws RemoteException {
		if(this.parent == null){
			return super.exists();
		}
		else if(!parent.exists()){
			return false;
		}
		else {
			long hwnd = client.utils().searchSameThreadWindow(parent.getHwnd(), locator);
			if(hwnd==0){
				return false;
			}
			else {
				locator.setHwnd(hwnd);
			}
		}
		return true;
	}
}
