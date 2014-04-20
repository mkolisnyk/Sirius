/**
 * .
 */
package org.sirius.client.win32.classes;

import org.sirius.client.win32.Win32Client;

/**
 * @author Myk Kolisnyk
 * .
 */
public class MenuItem {

    /**
     * .
     */
    private Win32Client client;
    /**
     * .
     */
    private Window      owner;
    /**
     * .
     */
    private long        hmenu;
    /**
     * .
     */
    private int         pos;

    /**
     * .
     * @param clientValue .
     * @param ownerValue .
     * @param hmenuValue .
     * @param posValue .
     */
    public MenuItem(final Win32Client clientValue, final Window ownerValue,
            final long hmenuValue, final int posValue) {
        this.client = clientValue;
        this.owner = ownerValue;
        this.hmenu = hmenuValue;
        this.pos = posValue;
    }

    /**
     * .
     * @return .
     */
    public final boolean isChecked() {
        return false;
    }

    /**
     * .
     * @return .
     */
    public final boolean isEnabled() {
        return false;
    }

    /**
     * .
     * @return .
     */
    public final boolean isSeparator() {
        return false;
    }

    /**
     * .
     * @throws Exception .
     */
    public final void pick() throws Exception {
        client.core().menu().pickItem(owner.getHwnd(), hmenu, pos);
    }
}
