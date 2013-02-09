/**
 * 
 */
package org.sirius.client.win32.core;

import org.sirius.client.win32.core.classes.dialog.DialogProxy;
import org.sirius.client.win32.core.classes.menu.MenuProxy;
import org.sirius.client.win32.core.classes.window.WindowProxy;
import org.sirius.client.win32.core.controls.button.ButtonProxy;
import org.sirius.client.win32.core.controls.combobox.ComboBoxProxy;
import org.sirius.client.win32.core.controls.edit.EditProxy;
import org.sirius.client.win32.core.controls.listbox.ListBoxProxy;
import org.sirius.client.win32.core.controls.tabcontrol.TabControlProxy;

/**
 * @author Myk Kolisnyk
 * 
 */
public class Win32CoreClient {

	private MenuProxy menu;
	private WindowProxy window;
	private DialogProxy dialog;
	private ButtonProxy button;
	private ComboBoxProxy combo;
	private EditProxy edit;
	private ListBoxProxy listbox;
	private TabControlProxy tabcontrol;
	
	public final MenuProxy menu() {
		return menu;
	}

	public final WindowProxy window() {
		return window;
	}

	/**
	 * @return the dialog
	 */
	public final DialogProxy dialog() {
		return dialog;
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
	 * @return the tabcontrol
	 */
	public final TabControlProxy tabcontrol() {
		return tabcontrol;
	}

	/**
	 * 
	 */
	public Win32CoreClient() {
		menu = new MenuProxy();
		window = new WindowProxy();
	}

}
