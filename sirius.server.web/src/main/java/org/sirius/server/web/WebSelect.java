/**
 * 
 */
package org.sirius.server.web;

import java.util.List;

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
	private Select get(String token, String parentLocator, String locator){
		Select control = new Select( this.getElement(token, parentLocator, locator) );
		return control;
	}
	
	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 */
	public void deselectAll(String token, String parentLocator, String locator){
		get(token,parentLocator,locator).deselectAll();
	}
	
	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @param index
	 */
	public void deselectByIndex(String token, String parentLocator, String locator,int index){
		get(token,parentLocator,locator).deselectByIndex(index);
	}
	
	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @param value
	 */
	public void deselectByValue(String token, String parentLocator, String locator,String value){
		get(token,parentLocator,locator).deselectByValue(value);
	}
	
	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @param text
	 */
	public void deselectByVisibleText(String token, String parentLocator, String locator, String text){
		get(token,parentLocator,locator).deselectByVisibleText(text);
	}
	
	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @return
	 */
	public String[] getAllOptions(String token, String parentLocator, String locator){
		List<WebElement> elements = get(token,parentLocator,locator).getOptions();
		String data[] = new String[elements.size()];
		
		for(int i=0;i<elements.size();i++){
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
	public String[] getAllSelectedOptions(String token, String parentLocator, String locator){
		List<WebElement> elements = get(token,parentLocator,locator).getAllSelectedOptions();
		String data[] = new String[elements.size()];
		
		for(int i=0;i<elements.size();i++){
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
	public String getFirstSelectedOption(String token,String parentLocator, String locator){
		return get(token,parentLocator,locator).getFirstSelectedOption().getText();
	}
	
	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @return
	 */
	public boolean isMultiple(String token, String parentLocator, String locator){
		return get(token,parentLocator,locator).isMultiple();
	}
	
	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @param index
	 */
	public void selectByIndex(String token, String parentLocator, String locator,int index){
		get(token,parentLocator,locator).selectByIndex(index);
	}
	
	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @param value
	 */
	public void selectByValue(String token, String parentLocator, String locator,String value){
		get(token,parentLocator,locator).selectByValue(value);
	}
	
	/**
	 * 
	 * @param token
	 * @param parentLocator
	 * @param locator
	 * @param text
	 */
	public void selectByVisibleText(String token, String parentLocator, String locator, String text){
		get(token,parentLocator,locator).selectByVisibleText(text);
	}
}
