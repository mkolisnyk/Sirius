/**
 * .
 */
package org.sirius.client.win32.core;

import org.sirius.client.win32.core.classes.dialog.DialogProxy;
import org.sirius.client.win32.core.classes.menu.MenuProxy;
import org.sirius.client.win32.core.classes.window.WindowProxy;
import org.sirius.client.win32.core.controls.button.ButtonProxy;
import org.sirius.client.win32.core.controls.combobox.ComboBoxProxy;
import org.sirius.client.win32.core.controls.edit.EditProxy;
import org.sirius.client.win32.core.controls.listbox.ListBoxProxy;
import org.sirius.client.win32.core.controls.slider.SliderProxy;
import org.sirius.client.win32.core.controls.tabcontrol.TabControlProxy;

/**
 * @author Myk Kolisnyk
 * .
 */
public class Win32CoreClient {

    /**
     * .
     */
    private final MenuProxy       menu;
    /**
     * .
     */
    private final WindowProxy     window;
    /**
     * .
     */
    private final DialogProxy     dialog;
    /**
     * .
     */
    private final ButtonProxy     button;
    /**
     * .
     */
    private final ComboBoxProxy   combo;
    /**
     * .
     */
    private final EditProxy       edit;
    /**
     * .
     */
    private final ListBoxProxy    listbox;
    /**
     * .
     */
    private final TabControlProxy tabcontrol;
    /**
     * .
     */
    private final SliderProxy slider;
    
    /**
     * .
     */
    public Win32CoreClient() {
        menu = new MenuProxy();
        window = new WindowProxy();

        dialog = new DialogProxy();
        button = new ButtonProxy();
        combo = new ComboBoxProxy();
        edit = new EditProxy();
        listbox = new ListBoxProxy();
        tabcontrol = new TabControlProxy();
        slider = new SliderProxy();
    }

    /**
     * @return the button
     */
    public final ButtonProxy button() {
        return button;
    }

    /**
     * @return the combo
     */
    public final ComboBoxProxy combo() {
        return combo;
    }

    /**
     * @return the dialog
     */
    public final DialogProxy dialog() {
        return dialog;
    }

    /**
     * @return the edit
     */
    public final EditProxy edit() {
        return edit;
    }

    /**
     * @return the listbox
     */
    public final ListBoxProxy listbox() {
        return listbox;
    }

    /**
     * .
     * @return .
     */
    public final MenuProxy menu() {
        return menu;
    }

    /**
     * @return the tabcontrol
     */
    public final TabControlProxy tabcontrol() {
        return tabcontrol;
    }

    /**
     * @return the slider
     */
    public SliderProxy slider() {
        return slider;
    }

    /**
     * .
     * @return .
     */
    public final WindowProxy window() {
        return window;
    }

}
