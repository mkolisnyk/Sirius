/**
 * 
 */
package org.sirius.client.test.steps.win32.controls.declarations;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.annotations.Alias;
import org.sirius.client.win32.annotations.Locator;
import org.sirius.client.win32.classes.Window;
import org.sirius.client.win32.classes.controls.Button;
import org.sirius.client.win32.classes.controls.CheckBox;
import org.sirius.client.win32.classes.controls.RadioButton;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 *
 */
public class ButtonPageTab extends Window {


    @Alias(name="Check Box Button")
    @Locator(winClass="Button",caption="Check Box(.*)Button",index=0)
    public Button btnCheckBoxButton;
    
    @Locator(winClass="Button",caption="Check Box",index=0)
    public CheckBox cbCheckBox;
    
    @Locator(winClass="Button",caption="Checked",index=0)
    public RadioButton rbChecked;
    
    @Locator(winClass="Button",caption="Unchecked",index=0)
    public RadioButton rbUnchecked;
    
    @Locator(winClass="Button",caption="Indeterminate",index=0)
    public RadioButton rbIndeterminate;
    
    @Locator(winClass="Button",caption="Radio Button 1",index=0)
    public RadioButton rbRadioButton1;
    
    @Locator(winClass="Button",caption="Radio Button 2",index=0)
    public RadioButton rbRadioButton2;

    @Locator(winClass="Button",caption="Radio Button 3",index=0)
    public RadioButton rbRadioButton3;

    /**
     * @param clientValue
     * @param locatorValue
     */
    public ButtonPageTab(Win32Client clientValue, Win32Locator locatorValue) {
        super(clientValue, locatorValue);
    }
}
