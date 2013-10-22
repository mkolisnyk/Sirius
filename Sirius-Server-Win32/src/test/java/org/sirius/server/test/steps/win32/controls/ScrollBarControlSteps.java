/**
 * 
 */
package org.sirius.server.test.steps.win32.controls;

import java.util.HashMap;

import org.junit.Assert;
import org.sirius.server.win32.Win32Locator;
import org.sirius.server.win32.Win32Utils;
import org.sirius.server.win32.classes.controls.ScrollBar;
import org.sirius.server.win32.classes.controls.Slider;
import org.sirius.server.win32.classes.controls.TabControl;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class ScrollBarControlSteps {
    private HashMap<String, Win32Locator> scrollBarMap = new HashMap<String, Win32Locator>();

    public ScrollBarControlSteps() {
        scrollBarMap.put("Horizontal", new Win32Locator("ScrollBar",
                "(.*)", 1));
        scrollBarMap.put("Vertical", new Win32Locator("ScrollBar",
                "(.*)", 0));
    }

    private long getControl(String fieldName) throws Exception {
        Win32Utils utils = new Win32Utils();
        Win32Locator locator;
        Win32Locator pageLocator;

        if (!scrollBarMap.containsKey(fieldName)) {
            locator = new Win32Locator("ScrollBar", fieldName, 0);
        } else {
            locator = scrollBarMap.get(fieldName);
        }
        long htab = CommonSteps.getMainTabControl();
        TabControl tab = new TabControl();

        pageLocator = new Win32Locator("#32770", tab.GetSelectedItem(htab), 0);

        long hpage = utils.searchWindow(pageLocator);

        locator.setParent(hpage);
        long hctrl = utils.searchWindow(locator);
        return hctrl;
    }
    
    @When("^(?:I |)set the \"(\\d+)\" position for the \"([^\"]*)\" scroll bar$")
    public void setPositionByIndex(int position, String fieldName) throws Throwable {
        int hctrl = (int)getControl(fieldName);
        ScrollBar scroll = new ScrollBar();
        scroll.setPosition(hctrl, (double)position);
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" scroll bar is in \"(\\d+)\" position$")
    public void verifyPosition(String fieldName, int position) throws Throwable {
        int hctrl = (int) getControl(fieldName);
        ScrollBar scroll = new ScrollBar();

        Assert.assertEquals("The '" + fieldName
                + "' slider is at the unexpected position", position, scroll
                .getPosition(hctrl).doubleValue());
    }
    
    @When("^(?:I |)add (\\d+) step (forward|backward) for the \"([^\"]*)\" scroll bar$")
    public void addStep(int step, String direction, String fieldName) throws Throwable {
        boolean forward = direction.equals("forward");
        int hctrl = (int) getControl(fieldName);
        ScrollBar scroll = new ScrollBar();        
        // TODO Add implementation
    }
}
