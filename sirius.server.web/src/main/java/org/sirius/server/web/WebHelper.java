/**
 * 
 */
package org.sirius.server.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Myk Kolisnyk
 * 
 */
public class WebHelper {

	/**
	 * 
	 */
	public WebHelper() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param token
	 * @return
	 */
	protected WebDriver driver(String token) {
		WebDriver driver = DriverMap.drivers.get(token);
		return driver;
	}

	/**
	 * 
	 * @param locator
	 * @return
	 */
	protected By toLocator(String locator) {
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

	/**
	 * 
	 * @param token
	 * @param startFrom
	 * @param locator
	 * @return
	 */
	protected WebElement getElement(String token, String startFrom,
			String locator) {
		if (startFrom != null) {
			return driver(token).findElement(toLocator(startFrom)).findElement(
					toLocator(locator));
		}
		return driver(token).findElement(toLocator(locator));
	}
}
