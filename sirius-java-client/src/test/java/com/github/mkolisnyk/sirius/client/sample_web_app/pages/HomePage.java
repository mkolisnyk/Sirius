package com.github.mkolisnyk.sirius.client.sample_web_app.pages;

import com.github.mkolisnyk.sirius.client.SiriusClient;
import com.github.mkolisnyk.sirius.client.annotations.Alias;
import com.github.mkolisnyk.sirius.client.annotations.FindBy;
import com.github.mkolisnyk.sirius.client.annotations.Screen;
import com.github.mkolisnyk.sirius.client.ui.Control;
import com.github.mkolisnyk.sirius.client.ui.Page;

@Screen(value = "Home", url = "./src/test/resources/test_home_page.html")
public class HomePage extends Page {

    public HomePage(SiriusClient driverValue) {
        super(driverValue);
    }

    @Alias("Buttons")
    @FindBy(locator = "link=Buttons", onClick = ButtonsPage.class)
    public Control linkButtons;
    @Alias("Edit Fields")
    @FindBy(locator = "link=Edit fields")
    public Control linkEditFields;
    @Alias("Popup Lists")
    @FindBy(locator = "link=Popup Lists")
    public Control linkPopupLists;
    @Override
    public Page navigate() throws Exception {
        return this.open();
    }
    
}
