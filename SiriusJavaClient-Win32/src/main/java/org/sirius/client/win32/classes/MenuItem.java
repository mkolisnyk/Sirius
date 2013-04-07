/**
 * 
 */
package org.sirius.client.win32.classes;

import org.sirius.client.win32.Win32Client;

/**
 * @author Myk Kolisnyk
 * 
 */
public class MenuItem {

    Win32Client client;
    Window      owner;
    long        hmenu;
    int         pos;

    /**
	 * 
	 */
    public MenuItem(final Win32Client client, final Window owner,
            final long hmenu, final int pos) {
        this.client = client;
        this.owner = owner;
        this.hmenu = hmenu;
        this.pos = pos;
    }

    public boolean isChecked() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public boolean isSeparator() {
        return false;
    }

    public void pick() throws Exception {
        client.core().menu().pickItem(owner.getHwnd(), hmenu, pos);
    }
}
