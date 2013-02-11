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
	Window owner;
	// Menu baseMenu;
	long hmenu;

	/**
	 * @return the client
	 */
	public final Win32Client getClient() {
		return client;
	}

	/**
	 * @return the owner
	 */
	public final Window getOwner() {
		return owner;
	}

	/**
	 * @return the hmenu
	 */
	public final long getHmenu() {
		return hmenu;
	}

	/**
	 * @param client
	 * @param locator
	 */
	public Menu(Win32Client client, Window owner) throws Exception {
		this.client = client;
		this.owner = owner;
		if (owner.exists()) {
			this.hmenu = client.core().window().getMenu(owner.getHwnd());
		}
		// baseMenu = null;
	}

	public Menu(Win32Client client, Window owner, long hmenu) {
		this.client = client;
		this.owner = owner;
		this.hmenu = hmenu;
	}

	public Menu(Menu parent, String text) throws Exception {
		this.client = parent.getClient();
		this.owner = parent.getOwner();

		Menu current = parent.menu(text);

		this.hmenu = current.getHmenu();
	}

	public String getMenuItemText(int position) throws Exception {
		int maxLength = 255;

		UnsignedShort[] buffer = new UnsignedShort[maxLength];
		client.core()
				.menu()
				.getMenuString(hmenu, position, buffer, maxLength,
						(int) MF_BYPOSITION);
		String result = buffer.toString();

		return result;
	}

	public Menu getSubMenu(int position) throws Exception {
		long subMenu = client.core().menu().getSubMenu(hmenu, position);
		return new Menu(client, owner, subMenu);
	}

	public void pick(int position) throws Exception {
		client.core().menu().pickItem(owner.getHwnd(), hmenu, position);
	}

	public String[] getItemNames() throws Exception {
		int count = client.core().menu().getMenuItemCount(hmenu);
		String[] names = new String[count];

		for (int i = 0; i < count; i++) {
			UnsignedShort[] buf = new UnsignedShort[255];
			client.core().menu()
					.getMenuString(hmenu, i, buf, 255, (int) MF_BYPOSITION);
			byte[] text = new byte[buf.length];

			for (int j = 0; j < buf.length; j++) {
				text[j] = buf[j].byteValue();
			}
			names[i] = new String(text);
		}

		return names;
	}

	public Menu menu(String title) throws Exception {
		String[] names = this.getItemNames();
		int item = -1;
		for (int i = 0; i < names.length; i++) {
			if (names[i].matches(title) || names[i].contains(title)) {
				item = i;
				break;
			}
		}
		long subHMenu = client.core().menu().getSubMenu(hmenu, item);
		Menu subMenu = new Menu(this.client, owner, subHMenu);
		return subMenu;
	}

	public MenuItem item(String title) throws Exception {
		String[] names = this.getItemNames();
		int itemNum = -1;
		for (int i = 0; i < names.length; i++) {
			if (names[i].matches(title) || names[i].contains(title)) {
				itemNum = i;
				break;
			}
		}
		MenuItem item = new MenuItem(client, owner, hmenu, itemNum);
		return item;
	}
}
