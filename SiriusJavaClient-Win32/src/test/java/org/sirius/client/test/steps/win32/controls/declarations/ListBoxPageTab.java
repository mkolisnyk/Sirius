/**
 * 
 */
package org.sirius.client.test.steps.win32.controls.declarations;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.annotations.Alias;
import org.sirius.client.win32.annotations.Locator;
import org.sirius.client.win32.classes.Window;
import org.sirius.client.win32.classes.controls.Button;
import org.sirius.client.win32.classes.controls.ListBox;
import org.sirius.client.win32.core.controls.tabcontrol.TabControl;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 *
 */
public class ListBoxPageTab extends Window {

    @Locator(winClass="SysTabControl32")
    public TabControl plstListBoxTabs;
    
    public class BasicListBoxTab extends Window {

        @Alias(name="Pool List")
        @Locator(winClass="ListBox",caption="(.*)",index=0)
        public ListBox lstPoolList;
        
        @Alias(name="Action List")
        @Locator(winClass="ListBox",caption="(.*)",index=1)
        public ListBox lstActionList;        
        
        @Alias(name="Basic List Box")
        @Locator(winClass="ListBox",caption="(.*)",index=2)
        public ListBox lstBasic;
        
        @Alias(name="Add to List")
        @Locator(winClass="Button",caption="Add(.*)>>")
        public Button btnAdd;
        
        @Alias(name="Remove from List")
        @Locator(winClass="Button",caption="Remove(.*)<<")
        public Button btnRemove;
        
        /**
         * @param clientValue
         * @param locatorValue
         */
        public BasicListBoxTab(Win32Client clientValue,
                Win32Locator locatorValue) {
            super(clientValue, locatorValue);
        }
        
    }

    @Locator(winClass="#32770",caption="")
    public BasicListBoxTab dBasicListBox;
    
    /**
     * @param clientValue
     * @param locatorValue
     */
    public ListBoxPageTab(Win32Client clientValue, Win32Locator locatorValue) {
        super(clientValue, locatorValue);
        // TODO Auto-generated constructor stub
    }

}
