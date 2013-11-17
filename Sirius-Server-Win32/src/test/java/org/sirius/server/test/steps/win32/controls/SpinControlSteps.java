/**
 * 
 */
package org.sirius.server.test.steps.win32.controls;

import java.util.HashMap;

import org.sirius.server.win32.Win32Locator;
import org.sirius.server.win32.Win32Utils;
import org.sirius.server.win32.classes.controls.Spin;
import org.sirius.server.win32.classes.controls.TabControl;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 * 
 */
public class SpinControlSteps {

    private HashMap<String, Win32Locator> spinMap = new HashMap<String, Win32Locator>();

    public SpinControlSteps() {
        spinMap.put("Buddy Control", new Win32Locator("msctls_updown32",
                "Spin2", 0));
        spinMap.put("Horizontal Lower", new Win32Locator("msctls_updown32",
                "Spin1", 1));
        spinMap.put("Horizontal Upper", new Win32Locator("msctls_updown32",
                "Spin1", 2));
    }

    private long getControl(String fieldName) throws Exception {
        Win32Utils utils = new Win32Utils();
        Win32Locator locator;
        Win32Locator pageLocator;

        if (!spinMap.containsKey(fieldName)) {
            locator = new Win32Locator("Edit", fieldName, 0);
        } else {
            locator = spinMap.get(fieldName);
        }
        long htab = CommonSteps.getMainTabControl();
        TabControl tab = new TabControl();

        pageLocator = new Win32Locator("#32770", tab.GetSelectedItem(htab), 0);
        pageLocator.setParent(CommonSteps.getMainWindow());
        long hpage = utils.searchWindow(pageLocator);

        locator.setParent(hpage);
        long hctrl = utils.searchWindow(locator);
        return hctrl;
    }

    @When("^(?:I |)increment \"([^\"]*)\" field value$")
    public void incrementSpinValue(String fieldName) throws Throwable {
        int hctl = (int) getControl(fieldName);
        Spin spin = new Spin();
        spin.increment(hctl);
    }

    @When("^(?:I |)decrement \"([^\"]*)\" field value$")
    public void decrementSpinValue(String fieldName) throws Throwable {
        int hctl = (int) getControl(fieldName);
        Spin spin = new Spin();
        spin.decrement(hctl);
    }
    
    @When("^(?:I |)set the \"(\\d+)\" position for the \"([^\"]*)\" spin$")
    public void incrementSpinValue(int position,String fieldName) throws Throwable {
        int hctl = (int) getControl(fieldName);
        Spin spin = new Spin();
        spin.setPosition(hctl,(double)position);
    }
}
