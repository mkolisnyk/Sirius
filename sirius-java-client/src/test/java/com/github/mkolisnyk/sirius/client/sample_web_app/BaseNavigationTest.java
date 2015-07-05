package com.github.mkolisnyk.sirius.client.sample_web_app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.mkolisnyk.sirius.client.SiriusClient;
import com.github.mkolisnyk.sirius.client.sample_web_app.pages.HomePage;
import com.github.mkolisnyk.sirius.client.ui.Navigate;

public class BaseNavigationTest {
    private SiriusClient client;
    private Navigate navigate;
    
    @Before
    public void before() throws Exception {
        client = new SiriusClient("firefox");
        client.getConfiguration().setPagesPackage("com.github.mkolisnyk.sirius.client.sample_web_app");
        navigate = new Navigate(client);
    }

    @After
    public void after() {
        client.stop();
    }
    
    @Test
    public void testSampleNavigation() throws Exception {
        navigate.to("Home")
            .page("Home").shouldBeCurrent()
            .control("Buttons").click()
            .page("Buttons").shouldBeCurrent()
            .control("Simple Button").shouldHaveText("Simple Button")
            .clickOn("Simple Button")
            .control("Simple Button").shouldHaveText("Clicked")
            .back()
            .page("Home").shouldBeCurrent()
            .clickOn("Buttons")
            .page("Buttons").shouldBeCurrent()
            .control("Simple Button").shouldHaveText("Simple Button")
            .backTo("Home")
            .page("Home").shouldBeCurrent();
    }
}
