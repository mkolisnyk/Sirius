/**
 * 
 */
package org.sirius.client.test.steps.win32.controls.declarations;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.annotations.Locator;
import org.sirius.client.win32.classes.MainWindow;
import org.sirius.client.win32.core.controls.tabcontrol.TabControl;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 *
 */
public class CommonControlsExamplesWindow extends MainWindow {

    @Locator(winClass="SysTabControl32",caption="")
    public TabControl mainTab;
    
    @Locator(winClass="#32770",caption="Buttons")
    public ButtonPageTab dButton;
    
    @Locator(winClass="#32770",caption="Combo Box")
    public ComboBoxPageTab dCombo;
    
    @Locator(winClass="#32770",caption="Edit Page")
    public EditPageTab dEdit;
    
    @Locator(winClass="#32770",caption="List Box")
    public ListBoxPageTab dListBox;
    
    @Locator(winClass="#32770",caption="Sliders")
    public SlidersPageTab dSliders;
    
    /**
     * @param client
     * @param locator
     */
    public CommonControlsExamplesWindow(Win32Client client, Win32Locator locator) {
        super(client, locator);
    }

}
