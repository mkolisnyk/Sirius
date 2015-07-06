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
            .control("Simple").shouldHaveText("Simple Button")
            .control("Input").shouldHaveText("Input")
            .control("Submit").shouldHaveText("Submit Button")
            .clickOn("Simple")
            .clickOn("Input")
            .clickOn("Submit")
            .control("Simple").shouldHaveText("Clicked")
            .control("Input").shouldHaveText("Clicked")
            .control("Submit").shouldHaveText("Submitted")
            .refresh()
            .control("Simple").shouldHaveText("Simple Button")
            .control("Input").shouldHaveText("Input")
            .control("Submit").shouldHaveText("Submit Button")
            .back()
            .page("Home").shouldBeCurrent()
            .clickOn("Buttons")
            .page("Buttons").shouldBeCurrent()
            .control("Simple").shouldHaveText("Simple Button")
            .control("Input").shouldHaveText("Input")
            .control("Submit").shouldHaveText("Submit Button")
            .backTo("Home")
            .page("Home").shouldBeCurrent();
    }
}
