package com.github.mkolisnyk.sirius.client.sample_web_app.pages;

import com.github.mkolisnyk.sirius.client.SiriusClient;
import com.github.mkolisnyk.sirius.client.annotations.Alias;
import com.github.mkolisnyk.sirius.client.annotations.FindBy;
import com.github.mkolisnyk.sirius.client.annotations.Screen;
import com.github.mkolisnyk.sirius.client.ui.Control;
import com.github.mkolisnyk.sirius.client.ui.Page;

@Screen("Buttons")
public class ButtonsPage extends Page {

    public ButtonsPage(SiriusClient driverValue) {
        super(driverValue);
    }

    @Alias("Simple Button")
    @FindBy(locator="id=simple")
    public Control buttonSimpleButton;
}
