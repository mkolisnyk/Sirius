package com.github.mkolisnyk.sirius.client;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

@RunWith(Parameterized.class)
public class SiriusClientTest {
	private String targetUrl;
	private Capabilities targetCapabilities;
	private Class<?> expectedClass;
	private Platform targetPlatform;
	
	public SiriusClientTest(String description, Platform platform, String url, Capabilities capabilities, Class<?> clazz) {
		this.targetUrl = url;
		this.targetCapabilities = capabilities;
		this.expectedClass = clazz;
		this.targetPlatform = platform;
	}
	
    @Parameters(name = "Test read input record: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
        		{"", Platform.ANDROID_NATIVE, "http://127.0.0.1:4723/wd/hub", 
        			new DesiredCapabilities() {
        				{
        					setCapability("deviceName", "test");
        					setCapability("app", "test.apk");
        					setCapability("appActivity", "SampleActivity");
        				}
        			},
        			RemoteWebDriver.class}
        });
    }
    @Test
    public void testInitSiriusClient() throws Exception {
    	SiriusClient client = new SiriusClient(this.targetPlatform.name(), new URL(this.targetUrl), this.targetCapabilities);
    	Assert.assertEquals(client.getDriver().getClass(), this.expectedClass);
    }
}
