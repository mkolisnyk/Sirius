/**
 * 
 */
package org.sirius.client.win32.classes.controls;

import org.sirius.client.win32.classes.Window;
import org.sirius.client.win32.core.controls.tabcontrol.TcITEM;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * 
 */
public class PageList extends List {

    /**
     * @param client
     * @param locator
     */
    public PageList(final Window parent, final Win32Locator locator) {
        super(parent, locator);
        // TODO Auto-generated constructor stub
    }

    public int getSelectedTab() throws Exception {
        return client.core().tabcontrol().getCurSel(this.getHwnd());
    }

    public String getSelectedTabName() throws Exception {
        int current = getSelectedTab();
        return getTabNames()[current];
    }

    public String[] getTabNames() throws Exception {
        int count = getTabsCount();
        String[] tabNames = new String[count];
        for (int i = 0; i < count; i++) {
            TcITEM item = client.core().tabcontrol().getItem(this.getHwnd(), i);
            tabNames[i] = getNativeText(item.getPszText());
        }
        return tabNames;
    }

    public int getTabsCount() throws Exception {
        return client.core().tabcontrol().getItemCount(this.getHwnd());
    }

    public void select(final int index) throws Exception {
        client.core().tabcontrol().setCurSel(this.getHwnd(), index);
    }

    public void select(final String tabName) throws Exception {
        String tabs[] = getTabNames();
        for (int i = 0; i < tabs.length; i++) {
            if (tabs[i].matches(tabName)) {
                select(i);
            }
        }
    }
}
