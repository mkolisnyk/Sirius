/**
 * .
 */
package org.sirius.client.win32.classes.controls;

import org.sirius.client.win32.classes.Window;
import org.sirius.client.win32.core.controls.tabcontrol.TcITEM;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * .
 */
public class PageList extends List {

    /**
     * .
     * @param parentValue .
     * @param locatorValue .
     * @throws Exception 
     */
    public PageList(
            final Window parentValue,
            final Win32Locator locatorValue){
            super(parentValue, locatorValue);
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final int getSelectedTab() throws Exception {
        return getClient().core().tabcontrol().getCurSel(this.getHwnd());
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final String getSelectedTabName() throws Exception {
        int current = getSelectedTab();
        return getTabNames()[current];
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final String[] getTabNames() throws Exception {
        int count = getTabsCount();
        String[] tabNames = new String[count];
        for (int i = 0; i < count; i++) {
            TcITEM item = getClient()
                    .core()
                    .tabcontrol()
                    .getItem(this.getHwnd(), i);
            tabNames[i] = getNativeText(item.getPszText());
        }
        return tabNames;
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final int getTabsCount() throws Exception {
        return getClient().core().tabcontrol().getItemCount(this.getHwnd());
    }

    /**
     * .
     * @param index .
     * @throws Exception .
     */
    public final void select(final int index) throws Exception {
        getClient().core().tabcontrol().setCurSel(this.getHwnd(), index);
    }

    /**
     * .
     * @param tabName .
     * @throws Exception .
     */
    public final void select(final String tabName) throws Exception {
        String[] tabs = getTabNames();
        for (int i = 0; i < tabs.length; i++) {
            if (tabs[i].matches(tabName)) {
                select(i);
            }
        }
    }
}
