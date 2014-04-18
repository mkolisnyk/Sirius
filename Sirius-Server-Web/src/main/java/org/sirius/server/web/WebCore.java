/**
 * 
 */
package org.sirius.server.web;

import javax.jws.WebService;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.opera.core.systems.OperaDriver;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class WebCore extends WebHelper {

	public final String IE = "ie";
	public final String FIREFOX = "firefox";
	public final String FIREFOX_UNSECURED = "chrome";
	public final String CHROME = "googlechrome";
	public final String OPERA = "opera";
	public final String SAFARI = "safari";
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
		} else if(browser.equalsIgnoreCase(OPERA)){
			driver = new OperaDriver();
		} else if(browser.equalsIgnoreCase(SAFARI)){
			driver = new SafariDriver();
		}
		

		if (driver != null) {
			DriverMap.drivers.put(driver.toString(), driver);
			return driver.toString();
		}

		return null;
	}

	public void stop(String token) {
		driver(token).close();
		DriverMap.drivers.remove(token);
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
