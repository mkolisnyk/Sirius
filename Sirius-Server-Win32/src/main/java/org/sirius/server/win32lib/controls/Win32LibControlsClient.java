/**
 * 
 */
package org.sirius.server.win32lib.controls;

import org.sirius.server.win32lib.controls.button.IButtonContractProxy;
import org.sirius.server.win32lib.controls.edit.IEditContractProxy;
import org.sirius.server.win32lib.controls.listbox.IListBoxContractProxy;
import org.sirius.server.win32lib.controls.listview.IListViewContractProxy;
import org.sirius.server.win32lib.controls.progressbar.IProgressBarContractProxy;
import org.sirius.server.win32lib.controls.scrollbar.IScrollBarContractProxy;
import org.sirius.server.win32lib.controls.slider.ISliderContractProxy;
import org.sirius.server.win32lib.controls.spin.ISpinContractProxy;
import org.sirius.server.win32lib.controls.tab.ITabContractProxy;

/**
 * @author Myk Kolisnyk
 *
 */
public class Win32LibControlsClient {
    private IButtonContractProxy button;
    private IEditContractProxy edit;
    private IListBoxContractProxy listBox;
    private IListViewContractProxy listView;
    private IProgressBarContractProxy progressBar;
    private IScrollBarContractProxy scrollBar;
    private ISliderContractProxy slider;
    private ISpinContractProxy spin;
    private ITabContractProxy tab;

    /**
     * .
     */
    public Win32LibControlsClient() {
        this.button = new IButtonContractProxy();
        this.edit = new IEditContractProxy();
        this.listBox = new IListBoxContractProxy();
        this.listView = new IListViewContractProxy();
        this.progressBar = new IProgressBarContractProxy();
        this.scrollBar = new IScrollBarContractProxy();
        this.slider = new ISliderContractProxy();
        this.spin = new ISpinContractProxy();
        this.tab = new ITabContractProxy();
    }

    /**
     * @return the button
     */
    public IButtonContractProxy button() {
        return button;
    }

    /**
     * @return the edit
     */
    public IEditContractProxy edit() {
        return edit;
    }

    /**
     * @return the listBox
     */
    public IListBoxContractProxy listBox() {
        return listBox;
    }

    /**
     * @return the listView
     */
    public IListViewContractProxy listView() {
        return listView;
    }

    /**
     * @return the progressBar
     */
    public IProgressBarContractProxy progressBar() {
        return progressBar;
    }

    /**
     * @return the scrollBar
     */
    public IScrollBarContractProxy scrollBar() {
        return scrollBar;
    }

    /**
     * @return the slider
     */
    public ISliderContractProxy slider() {
        return slider;
    }

    /**
     * @return the spin
     */
    public ISpinContractProxy spin() {
        return spin;
    }

    /**
     * @return the tab
     */
    public ITabContractProxy tab() {
        return tab;
    }
    
    
}
