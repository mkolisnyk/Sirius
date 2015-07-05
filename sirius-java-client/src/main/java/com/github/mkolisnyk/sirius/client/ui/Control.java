package com.github.mkolisnyk.sirius.client.ui;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        this.locator = locatorFromString(locatorValue);
    }
    private By locatorFromString(String locatorValue) {
        if (locatorValue.startsWith("id=")) {
            return By.id(locatorValue.substring(locatorValue.indexOf("=") + 1));
        } else if (locatorValue.startsWith("name=")) {
            return By.name(locatorValue.substring(locatorValue.indexOf("=") + 1));
        } else if (locatorValue.startsWith("class=")) {
            return By.className(locatorValue.substring(locatorValue.indexOf("=") + 1));
        } else if (locatorValue.startsWith("css=")) {
            return By.cssSelector(locatorValue.substring(locatorValue.indexOf("=") + 1));
        } else if (locatorValue.startsWith("xpath=/") || locatorValue.startsWith("/")) {
            return By.xpath(locatorValue.substring(locatorValue.indexOf("/")));
        } else if (locatorValue.startsWith("link=")) {
            return By.partialLinkText(locatorValue.substring(locatorValue.indexOf("=") + 1));
        } 
        return By.id(locatorValue);
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
    public final void setExcludeFromSearch(boolean excludeFromSearch) {
        this.excludeFromSearch = excludeFromSearch;
    }
    public final String getName() {
        return name;
    }
    public final void setName(String name) {
        this.name = name;
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
}
