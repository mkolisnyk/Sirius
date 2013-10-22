/**
 * 
 */
package org.sirius.server.test.steps.win32.controls;

import java.util.HashMap;

import org.junit.Assert;
import org.sirius.server.win32.Win32Locator;
import org.sirius.server.win32.Win32Utils;
import org.sirius.server.win32.classes.controls.Slider;
import org.sirius.server.win32.classes.controls.TabControl;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 * 
 */
public class SliderControlSteps {

    private HashMap<String, Win32Locator> sliderMap = new HashMap<String, Win32Locator>();

    public SliderControlSteps() {
        sliderMap.put("Horizontal", new Win32Locator("msctls_trackbar32",
                "Slider1", 0));
        sliderMap.put("Vertical", new Win32Locator("msctls_trackbar32",
                "Slider2", 0));
    }

    private long getControl(String fieldName) throws Exception {
        Win32Utils utils = new Win32Utils();
        Win32Locator locator;
        Win32Locator pageLocator;

        if (!sliderMap.containsKey(fieldName)) {
            locator = new Win32Locator("msctls_trackbar32", fieldName, 0);
        } else {
            locator = sliderMap.get(fieldName);
        }
        long htab = CommonSteps.getMainTabControl();
        TabControl tab = new TabControl();

        pageLocator = new Win32Locator("#32770", tab.GetSelectedItem(htab), 0);

        long hpage = utils.searchWindow(pageLocator);

        locator.setParent(hpage);
        long hctrl = utils.searchWindow(locator);
        return hctrl;
    }

    @When("^(?:I |)set the \"(\\d+)\" position for the \"([^\"]*)\" slider$")
    public void setSliderPosition(int position, String fieldName)
            throws Throwable {
        int hctrl = (int) getControl(fieldName);
        Slider slider = new Slider();

        slider.setPosition(hctrl, (double) position);
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" slider is in \"(\\d+)\" position$")
    public void verifySliderPosition(String fieldName, double position)
            throws Throwable {
        int hctrl = (int) getControl(fieldName);
        Slider slider = new Slider();

        Assert.assertEquals("The '" + fieldName
                + "' slider is at the unexpected position", position, slider
                .getPosition(hctrl).doubleValue());
    }
}
