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

	private Select get(String token, String parentLocator, String locator){
		Select control = new Select( this.getElement(token, parentLocator, locator) );
		return control;
	}
	
	public void deselectAll(String token, String parentLocator, String locator){
		get(token,parentLocator,locator).deselectAll();
	}
	
	public void deselectByIndex(String token, String parentLocator, String locator,int index){
		get(token,parentLocator,locator).deselectByIndex(index);
	}
	
	public void deselectByValue(String token, String parentLocator, String locator,String value){
		get(token,parentLocator,locator).deselectByValue(value);
	}
	
	public void deselectByVisibleText(String token, String parentLocator, String locator, String text){
		get(token,parentLocator,locator).deselectByVisibleText(text);
	}
	
	public String[] getAllOptions(String token, String parentLocator, String locator){
		List<WebElement> elements = get(token,parentLocator,locator).getOptions();
		String data[] = new String[elements.size()];
		
		for(int i=0;i<elements.size();i++){
			data[i] = elements.get(i).getText();
		}
		
		return data;
	}
	
	public String[] getAllSelectedOptions(String token, String parentLocator, String locator){
		List<WebElement> elements = get(token,parentLocator,locator).getAllSelectedOptions();
		String data[] = new String[elements.size()];
		
		for(int i=0;i<elements.size();i++){
			data[i] = elements.get(i).getText();
		}
		
		return data;
	}
	
	public String getFirstSelectedOption(String token,String parentLocator, String locator){
		return get(token,parentLocator,locator).getFirstSelectedOption().getText();
	}
	
	public boolean isMultiple(String token, String parentLocator, String locator){
		return get(token,parentLocator,locator).isMultiple();
	}
	
	public void selectByIndex(String token, String parentLocator, String locator,int index){
		get(token,parentLocator,locator).selectByIndex(index);
	}
	
	public void selectByValue(String token, String parentLocator, String locator,String value){
		get(token,parentLocator,locator).selectByValue(value);
	}
	
	public void selectByVisibleText(String token, String parentLocator, String locator, String text){
		get(token,parentLocator,locator).selectByVisibleText(text);
	}
}
