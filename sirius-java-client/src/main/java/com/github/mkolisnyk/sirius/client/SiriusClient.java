package com.github.mkolisnyk.sirius.client;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SiriusClient {

    private Platform platform;
    private WebDriver driver;
    private Map<Platform, Class<?>> driverMap = new HashMap<Platform, Class<?>>() {
        private static final long serialVersionUID = 1L;

        {
            put(Platform.REMOTE, RemoteWebDriver.class);
            put(Platform.HTMLUNIT, HtmlUnitDriver.class);
            put(Platform.IE, InternetExplorerDriver.class);
            put(Platform.FIREFOX, FirefoxDriver.class);
            put(Platform.CHROME, ChromeDriver.class);
            put(Platform.SAFARI, SafariDriver.class);
            put(Platform.OPERA, OperaDriver.class);
            put(Platform.ANDROID_NATIVE, AndroidDriver.class);
            put(Platform.IOS_NATIVE, IOSDriver.class);
            put(Platform.ANDROID_WEB, AndroidDriver.class);
            put(Platform.IOS_WEB, IOSDriver.class);
            put(Platform.WIN_APP, RemoteWebDriver.class);
            put(Platform.WIN_PHONE, RemoteWebDriver.class);
            put(Platform.NONE, NullDriver.class);
        }
    };
    private Configuration configuration;
    public SiriusClient() throws Exception {
        this.driver = (WebDriver) driverMap.get(Platform.REMOTE).getConstructor().newInstance();
        this.configuration = new Configuration();
        this.platform = Platform.REMOTE;
    }
    public SiriusClient(WebDriver customDriver) {
        this.driver = customDriver;
        this.platform = Platform.REMOTE;
        this.configuration = new Configuration();
    }
    public SiriusClient(String platformValue) throws Exception {
        super();
        this.configuration = new Configuration();
        for (Platform value : Platform.values()) {
            if (value.name().equalsIgnoreCase(platformValue.trim())) {
                this.driver = (WebDriver) driverMap.get(value).getConstructor().newInstance();
                this.platform = value;
                return;
            }
        }
    }
    public SiriusClient(String platformValue, URL url, Capabilities capabilities) throws Exception {
        for (Platform value : Platform.values()) {
            if (value.name().equalsIgnoreCase(platformValue.trim())) {
                Constructor<?> constructor = null;
                try {
                    constructor = driverMap.get(value).getConstructor(URL.class, Capabilities.class);
                    this.driver = (WebDriver) constructor.newInstance(url, capabilities);
                    this.platform = value;
                } catch (NoSuchMethodException e) {
                    constructor = driverMap.get(value).getConstructor(Capabilities.class);
                    this.driver = (WebDriver) constructor.newInstance(capabilities);
                    this.platform = value;
                }
                return;
            }
        }
        this.driver = new NullDriver();
    }
    public final WebDriver getDriver() {
        return driver;
    }
    public final Configuration getConfiguration() {
        return configuration;
    }
    public final void setConfiguration(Configuration configurationValue) {
        this.configuration = configurationValue;
    }
    public final Platform getPlatform() {
        return platform;
    }
    public void stop() {
        this.getDriver().quit();
    }
}
