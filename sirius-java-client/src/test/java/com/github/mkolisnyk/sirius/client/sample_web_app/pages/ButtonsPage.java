package com.github.mkolisnyk.sirius.client.sample_web_app.pages;

import com.github.mkolisnyk.sirius.client.SiriusClient;
import com.github.mkolisnyk.sirius.client.annotations.Alias;
import com.github.mkolisnyk.sirius.client.annotations.FindBy;
import com.github.mkolisnyk.sirius.client.annotations.Screen;
import com.github.mkolisnyk.sirius.client.ui.Page;
import com.github.mkolisnyk.sirius.client.ui.controls.Button;

@Screen("Buttons")
public class ButtonsPage extends Page {

    public ButtonsPage(SiriusClient driverValue) {
        super(driverValue);
    }

    @Alias("Simple")
    @FindBy(locator="id=simple")
    public Button buttonSimple;

    @Alias("Input")
    @FindBy(locator="id=base_input")
    public Button buttonInput;

    @Alias("Submit")
    @FindBy(locator="id=base_submit")
    public Button buttonSubmit;
}
