/**
 * 
 */
package org.sirius.server.web;

import java.util.HashMap;

import javax.jws.WebService;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class WebCore {

	public static HashMap<String, WebDriver> drivers = new HashMap<String, WebDriver>();

	public final String IE = "ie";
	public final String FIREFOX = "firefox";
	public final String FIREFOX_UNSECURED = "chrome";
	public final String CHROME = "googlechrome";
	public final String OPERA = "opera";
	public final String HTMLUNIT = "htmlunit";

	/**
	 * 
	 */
	public WebCore() {
	}

	public String start(String browser) {
		WebDriver driver = null;
		if (browser.equalsIgnoreCase(IE)) {
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase(FIREFOX)) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase(CHROME)) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase(HTMLUNIT)) {
			driver = new HtmlUnitDriver();
		}

		if (driver != null) {
			drivers.put(driver.toString(), driver);
			return driver.toString();
		}

		return null;
	}

	private WebDriver driver(String token) {
		WebDriver driver = drivers.get(token);
		return driver;
	}

	public void stop(String token) {
		driver(token).close();
		drivers.remove(token);
	}

	public void open(String token, String url) {
		driver(token).navigate().to(url);
	}

	public void back(String token) {
		driver(token).navigate().back();
	}

	public void forward(String token) {
		driver(token).navigate().forward();
	}

	public void refresh(String token) {
		driver(token).navigate().refresh();
	}

	public String getURL(String token) {
		return driver(token).getCurrentUrl();
	}

	public String getPageSource(String token) {
		return driver(token).getPageSource();
	}

	public String getTitle(String token) {
		return driver(token).getTitle();
	}

	public String getWindowHandle(String token) {
		return driver(token).getWindowHandle();
	}

	public void selectFrameByIndex(String token, int index) {
		driver(token).switchTo().frame(index);
	}

	public void selectFrameByName(String token, String name) {
		driver(token).switchTo().frame(name);
	}

	public void selectWindow(String token, String name) {
		driver(token).switchTo().window(name);
	}

	public void selectDefaultContent(String token) {
		driver(token).switchTo().defaultContent();
	}

	public void selectAlert(String token) {
		driver(token).switchTo().alert();
	}

	// WebElement wrappers
	private By toLocator(String locator) {
		String prefix = locator.split("=")[0];
		String value = locator.substring(locator.indexOf("=") + 1);
		if (prefix.equals("id")) {
			return By.id(value);
		} else if (prefix.equals("name")) {
			return By.name(value);
		} else if (prefix.equals("link")) {
			return By.linkText(value);
		} else if (prefix.equals("tag")) {
			return By.tagName(value);
		} else if (prefix.equals("class")) {
			return By.className(value);
		} else if (prefix.equals("css")) {
			return By.cssSelector(value);
		} else if (prefix.equals("xpath")) {
			return By.xpath(value);
		}

		return null;
	}

	private WebElement getElement(String token, String startFrom, String locator) {
		if (startFrom != null) {
			return driver(token).findElement(toLocator(startFrom)).findElement(
					toLocator(locator));
		}
		return driver(token).findElement(toLocator(locator));
	}

	public void clear(String token, String startFrom, String locator) {
		getElement(token, startFrom, locator).clear();
	}

	public void click(String token, String startFrom, String locator) {
		getElement(token, startFrom, locator).click();
	}

	public String getAttribute(String token, String startFrom, String locator,
			String attribute) {
		return getElement(token, startFrom, locator).getAttribute(attribute);
	}

	public String getCssValue(String token, String startFrom, String locator,
			String value) {
		return getElement(token, startFrom, locator).getCssValue(value);
	}

	public Point getLocation(String token, String startFrom, String locator) {
		return getElement(token, startFrom, locator).getLocation();
	}

	public Dimension getSize(String token, String startFrom, String locator) {
		return getElement(token, startFrom, locator).getSize();
	}

	public String getTagName(String token, String startFrom, String locator) {
		return getElement(token, startFrom, locator).getTagName();
	}

	public String getText(String token, String startFrom, String locator) {
		return getElement(token, startFrom, locator).getText();
	}

	public boolean isDisplayed(String token, String startFrom, String locator) {
		return getElement(token, startFrom, locator).isDisplayed();
	}

	public boolean isEnabled(String token, String startFrom, String locator) {
		return getElement(token, startFrom, locator).isEnabled();
	}

	public boolean isSelected(String token, String startFrom, String locator) {
		return getElement(token, startFrom, locator).isSelected();
	}

	public void sendKeys(String token, String startFrom, String locator,
			String text) {
		getElement(token, startFrom, locator).sendKeys(text);
	}

	public void submit(String token, String startFrom, String locator) {
		getElement(token, startFrom, locator).submit();
	}
}
