package com.resurrectionSeleniumARF;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author sunshine
 * Created for Select
 * 
 * Selectvalue
 * id
 * getoptions
 *
 */
public class DropDownUtils {
	
	
	
	
	public static void Selectbyvalue(WebElement webelement,String value) {
		Select sel=new Select(webelement);
		sel.selectByValue(value);
		
    }
	
	
	public static List<WebElement> getAllOptions(Select select) {
		//Select sel=new Select(webelement);
		List<WebElement> items=select.getOptions();
		
		return items;

}
}
