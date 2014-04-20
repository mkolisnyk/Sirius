/**
 * 
 */
package org.sirius.server.web;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class WebSelect extends WebHelper {

	/**
	 * 
	 */
	public WebSelect() {
		;
	}

	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @return
	 */
	private Select get(@WebParam(name = "token") String token,
			@WebParam(name = "parentLocator") String parentLocator,
			@WebParam(name = "locator") String locator) {
		Select control = new Select(this.getElement(token, parentLocator,
				locator));
		return control;
	}

	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 */
	public void deselectAll(@WebParam(name = "token") String token,
			@WebParam(name = "parentLocator") String parentLocator,
			@WebParam(name = "locator") String locator) {
		get(token, parentLocator, locator).deselectAll();
	}

	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @param index
	 */
	public void deselectByIndex(@WebParam(name = "token") String token,
			@WebParam(name = "parentLocator") String parentLocator,
			@WebParam(name = "locator") String locator,
			@WebParam(name = "index") int index) {
		get(token, parentLocator, locator).deselectByIndex(index);
	}

	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @param value
	 */
	public void deselectByValue(@WebParam(name = "token") String token,
			@WebParam(name = "parentLocator") String parentLocator,
			@WebParam(name = "locator") String locator,
			@WebParam(name = "value") String value) {
		get(token, parentLocator, locator).deselectByValue(value);
	}

	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @param text
	 */
	public void deselectByVisibleText(@WebParam(name = "token") String token,
			@WebParam(name = "parentLocator") String parentLocator,
			@WebParam(name = "locator") String locator,
			@WebParam(name = "text") String text) {
		get(token, parentLocator, locator).deselectByVisibleText(text);
	}

	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @return
	 */
	public String[] getAllOptions(@WebParam(name = "token") String token,
			@WebParam(name = "parentLocator") String parentLocator,
			@WebParam(name = "locator") String locator) {
		List<WebElement> elements = get(token, parentLocator, locator)
				.getOptions();
		String data[] = new String[elements.size()];

		for (int i = 0; i < elements.size(); i++) {
			data[i] = elements.get(i).getText();
		}

		return data;
	}

	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @return
	 */
	public String[] getAllSelectedOptions(
			@WebParam(name = "token") String token,
			@WebParam(name = "parentLocator") String parentLocator,
			@WebParam(name = "locator") String locator) {
		List<WebElement> elements = get(token, parentLocator, locator)
				.getAllSelectedOptions();
		String data[] = new String[elements.size()];

		for (int i = 0; i < elements.size(); i++) {
			data[i] = elements.get(i).getText();
		}

		return data;
	}

	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @return
	 */
	public String getFirstSelectedOption(
			@WebParam(name = "token") String token,
			@WebParam(name = "parentLocator") String parentLocator,
			@WebParam(name = "locator") String locator) {
		return get(token, parentLocator, locator).getFirstSelectedOption()
				.getText();
	}

	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @return
	 */
	public boolean isMultiple(@WebParam(name = "token") String token,
			@WebParam(name = "parentLocator") String parentLocator,
			@WebParam(name = "locator") String locator) {
		return get(token, parentLocator, locator).isMultiple();
	}

	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @param index
	 */
	public void selectByIndex(@WebParam(name = "token") String token,
			@WebParam(name = "parentLocator") String parentLocator,
			@WebParam(name = "locator") String locator,
			@WebParam(name = "index") int index) {
		get(token, parentLocator, locator).selectByIndex(index);
	}

	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @param value
	 */
	public void selectByValue(@WebParam(name = "token") String token,
			@WebParam(name = "parentLocator") String parentLocator,
			@WebParam(name = "locator") String locator,
			@WebParam(name = "value") String value) {
		get(token, parentLocator, locator).selectByValue(value);
	}

	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @param text
	 */
	public void selectByVisibleText(@WebParam(name = "token") String token,
			@WebParam(name = "parentLocator") String parentLocator,
			@WebParam(name = "locator") String locator,
			@WebParam(name = "text") String text) {
		get(token, parentLocator, locator).selectByVisibleText(text);
	}
}
