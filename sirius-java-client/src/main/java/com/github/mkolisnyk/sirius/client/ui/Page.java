package com.github.mkolisnyk.sirius.client.ui;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.apache.commons.lang3.StringUtils;

import com.github.mkolisnyk.sirius.client.SiriusClient;

public class Page {
    private String screenName;
    private SiriusClient driver;
    private String url;
    public Page(SiriusClient driverValue) {
        this(driverValue, "", "");
    }
    public Page(SiriusClient driverValue, String nameValue, String urlValue) {
        this.driver = driverValue;
        this.screenName = nameValue;
        this.url = urlValue;
    }
    public final String getScreenName() {
        return screenName;
    }
    public final void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    public final SiriusClient getDriver() {
        return driver;
    }
    public Page open() {
        if (StringUtils.isNotBlank(this.url)) {
            this.getDriver().getDriver().navigate().to(this.url);
        }
        return this;
    }
    public Page navigate() {
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
    public Page assertCurrent(int timeout) throws Exception {
        Assert.assertTrue(isCurrent(timeout));
        return this;
    }
    public Page assertCurrent() throws Exception {
        return assertCurrent(this.getDriver().getConfiguration().getTimeout());
    }
}
