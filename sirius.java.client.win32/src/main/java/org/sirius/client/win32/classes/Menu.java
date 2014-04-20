/**
 * .
 */
package org.sirius.client.win32.classes;

import org.apache.axis.types.UnsignedShort;
import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.core.constants.IMenuFlag;

/**
 * @author Myk Kolisnyk
 * .
 */
public class Menu implements IMenuFlag {

    /**
     * .
     */
    public static final int STRING_MAXLEN = 255;

    /**
     * .
     */
    private Win32Client client;
    /**
     * .
     */
    private Window      owner;
    // Menu baseMenu;
    /**
     * .
     */
    private long        hmenu;

    /**
     * .
     * @param parent .
     * @param text .
     * @throws Exception .
     */
    public Menu(final Menu parent, final String text) throws Exception {
        client = parent.getClient();
        owner = parent.getOwner();

        Menu current = parent.menu(text);

        hmenu = current.getHmenu();
    }

    /**
     * .
     * @param clientValue .
     * @param ownerValue .
     * @throws Exception .
     */
    public Menu(
            final Win32Client clientValue,
            final Window ownerValue)
                    throws Exception {
        this.client = clientValue;
        this.owner = ownerValue;
        if (ownerValue.exists()) {
            hmenu = client.core().window().getMenu(ownerValue.getHwnd());
        }
        // baseMenu = null;
    }

    /**
     * .
     * @param clientValue .
     * @param ownerValue .
     * @param hmenuValue .
     */
    public Menu(final Win32Client clientValue,
            final Window ownerValue,
            final long hmenuValue) {
        this.client = clientValue;
        this.owner = ownerValue;
        this.hmenu = hmenuValue;
    }

    /**
     * @return the client
     */
    public final Win32Client getClient() {
        return client;
    }

    /**
     * @return the hmenu
     */
    public final long getHmenu() {
        return hmenu;
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final String[] getItemNames() throws Exception {
        int count = client.core().menu().getMenuItemCount(hmenu);
        String[] names = new String[count];

        for (int i = 0; i < count; i++) {
            UnsignedShort[] buf = new UnsignedShort[STRING_MAXLEN];
            client.core().menu()
                    .getMenuString(
                            hmenu,
                            i,
                            buf,
                            STRING_MAXLEN,
                            (int) MF_BYPOSITION
                    );
            byte[] text = new byte[buf.length];

            for (int j = 0; j < buf.length; j++) {
                text[j] = buf[j].byteValue();
            }
            names[i] = new String(text);
        }

        return names;
    }

    /**
     * .
     * @param position .
     * @return .
     * @throws Exception .
     */
    public final String getMenuItemText(final int position)
            throws Exception {
        int maxLength = STRING_MAXLEN;

        UnsignedShort[] buffer = new UnsignedShort[maxLength];
        client.core()
                .menu()
                .getMenuString(hmenu, position, buffer, maxLength,
                        (int) MF_BYPOSITION);
        String result = buffer.toString();

        return result;
    }

    /**
     * @return the owner
     */
    public final Window getOwner() {
        return owner;
    }

    /**
     * .
     * @param position .
     * @return .
     * @throws Exception .
     */
    public final Menu getSubMenu(final int position) throws Exception {
        long subMenu = client.core().menu().getSubMenu(hmenu, position);
        return new Menu(client, owner, subMenu);
    }

    /**
     * .
     * @param title .
     * @return .
     * @throws Exception .
     */
    public final MenuItem item(final String title) throws Exception {
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

    /**
     * .
     * @param title .
     * @return .
     * @throws Exception .
     */
    public final Menu menu(final String title) throws Exception {
        String[] names = this.getItemNames();
        int item = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].matches(title) || names[i].contains(title)) {
                item = i;
                break;
            }
        }
        long subHMenu = client.core().menu().getSubMenu(hmenu, item);
        Menu subMenu = new Menu(client, owner, subHMenu);
        return subMenu;
    }

    /**
     * .
     * @param position .
     * @throws Exception .
     */
    public final void pick(final int position) throws Exception {
        client.core().menu().pickItem(owner.getHwnd(), hmenu, position);
    }
}
