/**
 * 
 */
package org.sirius.client.test.steps.win32.controls.declarations;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.classes.Window;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 *
 */
public class SlidersPageTab extends Window {

    /*sliderMap.put("Horizontal", 
            new Win32Locator("msctls_trackbar32",
            "Slider1", 0));
    public Slider sldHorizontal;
    
    sliderMap.put("Vertical", new Win32Locator("msctls_trackbar32",
            "Slider2", 0));
    public Slider sldVertical;*/
    
    /**
     * @param clientValue
     * @param locatorValue
     */
    public SlidersPageTab(Win32Client clientValue, Win32Locator locatorValue) {
        super(clientValue, locatorValue);
        // TODO Auto-generated constructor stub
    }

}
