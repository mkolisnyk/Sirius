package com.github.mkolisnyk.sirius.client.ui;

import com.github.mkolisnyk.sirius.client.SiriusClient;

public class Navigate {

    private SiriusClient driver;
    public Navigate(SiriusClient client) {
        this.driver = client;
    }

    public Page to(String name) throws Exception {
        Page page = PageFactory.create(driver, Page.class);
        return page.page(name).navigate();
    }
}
