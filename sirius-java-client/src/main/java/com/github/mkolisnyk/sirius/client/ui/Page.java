package com.github.mkolisnyk.sirius.client.ui;

import java.io.File;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.reflections.Reflections;

import com.github.mkolisnyk.sirius.client.Configuration;
import com.github.mkolisnyk.sirius.client.SiriusClient;
import com.github.mkolisnyk.sirius.client.annotations.Screen;

public class Page {
    private String screenName;
    private SiriusClient driver;
    private String url;
    public Page(SiriusClient driverValue) {
        this.driver = driverValue;
    }
    public final String getScreenName() {
        return screenName;
    }
    public final void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    public final String getUrl() {
        return url;
    }
    public final void setUrl(String url) {
        this.url = url;
    }
    public final SiriusClient getDriver() {
        return driver;
    }
    public Page open() throws MalformedURLException {
        if (StringUtils.isNotBlank(this.url)) {
            if (!this.url.startsWith("http")) {
                this.url = "file:///" + new File(this.url).getAbsolutePath();
            }
            URL realUrl = new URL(url);
            this.getDriver().getDriver().navigate().to(realUrl);
        }
        return this;
    }
    public Page navigate() throws Exception {
        this.open();
        return this;
    }
    public String getSource() {
        return this.getDriver().getDriver().getPageSource();
    }
    public String getTitle() {
        return this.getDriver().getDriver().getTitle();
    }
    public Page assertTitle(String expected) {
        String actualTitle = this.getTitle();
        Assert.assertTrue("The '" + actualTitle + "' doesn't contain expected text of: '" + expected + "'",
                actualTitle.contains(expected));
        return this;
    }
    public String getCurrentURL() {
        return this.getDriver().getDriver().getCurrentUrl();
    }
    public List<Control> getAllControls() throws Exception {
        List<Control> controls = new ArrayList<Control>();
        for (Field field : this.getClass().getFields()) {
            if (Control.class.isAssignableFrom(field.getType())) {
                controls.add((Control) field.get(this));
            }
        }
        return controls;
    }
    public List<Control> getControls(boolean exclude) throws Exception {
        List<Control> controls = this.getAllControls();
        for (int i = 0; i < controls.size(); i++) {
            if (exclude && controls.get(i).isExcludeFromSearch()) {
                controls.remove(i);
                i--;
            }
        }
        return controls;
    }
    public boolean isCurrent(int timeout) throws Exception {
        for (Control item : this.getControls(true)) {
            if (!item.exists(timeout)) {
                return false;
            }
        }
        return true;
    }
    public boolean isCurrent() throws Exception {
        return isCurrent(this.getDriver().getConfiguration().getTimeout());
    }
    public Page shouldBeCurrent(int timeout) throws Exception {
        Assert.assertTrue(isCurrent(timeout));
        return this;
    }
    public Page shouldBeCurrent() throws Exception {
        SiriusClient _driver = this.getDriver();
        Configuration _config = _driver.getConfiguration();
        int timeout = _config.getTimeout();
        return shouldBeCurrent(timeout);
    }
    public Control control(String name) throws Exception {
        for (Field field : this.getClass().getFields()) {
            if (Control.class.isAssignableFrom(field.getType())) {
                String alias = (String) field.getType().getMethod("getName").invoke(field.get(this));
                if (alias.equals(name)) {
                    return (Control) field.get(this);
                }
            }
        }
        return null;
    }
    public Page clickOn(String name) throws Exception {
        return this.control(name).click();
    }
    public Page shouldHaveText(String name, String expected) throws Exception {
        this.control(name).shouldHaveText(expected);
        return this;
    }
    public Page page(String name) throws Exception {
        Reflections reflections = null;
        if (this.getDriver().getConfiguration().getPagesPackage() != null) {
            reflections = new Reflections(this.getDriver().getConfiguration().getPagesPackage());
        } else {
            reflections = new Reflections();
        }
        for (Class<?> clazz : reflections.getTypesAnnotatedWith(Screen.class)) {
            if (Page.class.isAssignableFrom(clazz)) {
                Screen annotation = clazz.getAnnotation(Screen.class);
                if (annotation.value().equals(name)) {
                    Page result = PageFactory.create(this.getDriver(), clazz);
                    return result;
                }
            }
        }
        return null;
    }
    public Page back() {
        this.getDriver().getDriver().navigate().back();
        return this;
    }
    public Page backTo(String pageName) throws Exception {
        return this.back().page(pageName).shouldBeCurrent();
    }
}
