package com.github.mkolisnyk.sirius.client.ui;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Control {
    private String name;
    private Page parent;
    private String locatorText;
    private By locator;
    private WebElement element;
    private Class<? extends Page> onClickPage;
    private boolean excludeFromSearch = false;

    public Control(Page parentValue, String locatorValue) {
        this.parent = parentValue;
        this.locatorText = locatorValue;
        try {
            this.locator = locatorFromString(locatorValue);
        } catch (Exception e) {
            this.locator = new ByIdOrName(locatorValue);
        }
    }
    private final Map<String, Class<? extends By>> locatorTypesMap = new HashMap<String, Class<? extends By>>() {
        private static final long serialVersionUID = 1L;

        {
            put("id=", ById.class);
            put("name=", ByName.class);
            put("class=", ByClassName.class);
            put("css=", ByCssSelector.class);
            put("xpath=", ByXPath.class);
            put("/", ByXPath.class);
            put("link=", ByPartialLinkText.class);
        }
    };
    private By locatorFromString(String locatorValue) throws Exception {
        for (Entry<String, Class<? extends By>> entry : locatorTypesMap.entrySet()) {
            if (locatorValue.startsWith(entry.getKey())) {
                String actualLocator = "";
                if (entry.getKey().contains("=")) {
                    actualLocator = locatorValue.substring(locatorValue.indexOf("=") + 1);
                    return (By) entry.getValue().getConstructor(String.class).newInstance(actualLocator);
                } else {
                    actualLocator = locatorValue.substring(locatorValue.indexOf(entry.getKey()));
                    return (By) entry.getValue().getConstructor(String.class).newInstance(actualLocator);
                }
            }
        }
        return new ByIdOrName(locatorValue);
    }
    public final Page getParent() {
        return parent;
    }
    public final String getLocatorText() {
        return locatorText;
    }
    public final By getLocator() {
        return locator;
    }
    public final boolean isExcludeFromSearch() {
        return excludeFromSearch;
    }
    public final void setExcludeFromSearch(boolean excludeFromSearchValue) {
        this.excludeFromSearch = excludeFromSearchValue;
    }
    public final String getName() {
        return name;
    }
    public final void setName(String nameValue) {
        this.name = nameValue;
    }
    public final WebElement getElement() {
        if (element == null && !exists()) {
            return null;
        }
        return element;
    }
    public boolean exists(int timeout) {
        Wait<WebDriver> wait = new WebDriverWait(this.getParent().getDriver().getDriver(), timeout);
        try {
            this.element = wait.until(ExpectedConditions.presenceOfElementLocated(this.getLocator()));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean exists() {
        return exists(parent.getDriver().getConfiguration().getTimeout());
    }
    public boolean disappears(int timeout) {
        Wait<WebDriver> wait = new WebDriverWait(this.getParent().getDriver().getDriver(), timeout);
        try {
            return wait.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(this.getLocator())));
        } catch (Exception e) {
            return false;
        }
    }
    public boolean disappears() {
        return disappears(parent.getDriver().getConfiguration().getTimeout());
    }
    public boolean isVisible(int timeout) {
        if (!exists(timeout)) {
            return false;
        }
        Wait<WebDriver> wait = new WebDriverWait(this.getParent().getDriver().getDriver(), timeout);
        try {
            this.element = wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator()));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isVisible() {
        return isVisible(parent.getDriver().getConfiguration().getTimeout());
    }
    public boolean isHidden(int timeout) {
        if (!exists(timeout)) {
            return false;
        }
        Wait<WebDriver> wait = new WebDriverWait(this.getParent().getDriver().getDriver(), timeout);
        try {
            this.element = wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator()));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isHidden() {
        return isHidden(parent.getDriver().getConfiguration().getTimeout());
    }
    public Page getOnClickPage() throws Exception {
        if (this.onClickPage.equals(this.getParent().getClass()) || this.onClickPage.equals(Page.class)) {
            return this.getParent();
        }
        return PageFactory.create(this.getParent().getDriver(), this.onClickPage);
    }
    public final void setOnClickPage(Class<? extends Page> onClickPageValue) {
        this.onClickPage = onClickPageValue;
    }
    public Page click() throws Exception {
        if (this.getElement() == null || !this.isVisible()) {
            return null;
        }
        this.getElement().click();
        return getOnClickPage();
    }
    public Page sendKeys(String keys) throws Exception {
        if (this.getElement() == null || !this.isVisible()) {
            return null;
        }
        this.getElement().sendKeys(keys);
        return getOnClickPage();
    }

    public String getAttribute(String attributeName) {
        return this.getElement().getAttribute(attributeName);
    }
    public Control assertAttribute(String attributeName, String expected) {
        Assert.assertEquals("Unexpected '" + attributeName + "' attribute value found.",
                expected,
                this.getAttribute(attributeName));
        return this;
    }
    public Control assertAttributeContains(String attributeName, String expected) {
        String actual = this.getAttribute(attributeName);
        Assert.assertTrue(
                "The '" + attributeName + "' attribute doesn't contain '"
                        + expected + "' entry. Actual value is: '" + actual + "'",
                actual.contains(expected));
        return this;
    }
    public String getText() {
        this.exists();
        return this.getElement().getText();
    }
    public Page shouldHaveText(String expected) {
        Assert.assertEquals("Unexpected field text found.", expected, this.getText());
        return this.getParent();
    }
    public void reset() {
        this.element = null;
    }
}
