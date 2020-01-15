package com.resurrectionSeleniumARF;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectGetOptionsDemo {
	
	
	/*#1
	 * getOptions returns List><WebElement> 
	 * We will have to iterate list with getText() method to get individual entries
	 */
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		WebElement langDropDown=driver.findElement(By.id("searchLanguage"));
		Select srch=new Select(langDropDown);
		List<WebElement> languages=srch.getOptions();
		System.out.println(languages.size()); //63
		for(WebElement item:languages) {	
			System.out.println(item.getText());
		}
		System.err.println("--------Separator-----------------------");
	/*
	 *Method 2 Without using getOptions
	 * 
	 */
		List<WebElement> DropDown=driver.findElements(By.tagName("option"));
		System.out.println(DropDown.size()); //63
		for(WebElement value:DropDown) {	
			System.out.println(value.getText());
		}
	
	}

}
