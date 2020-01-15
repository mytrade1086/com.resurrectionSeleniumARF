package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isPresent_isDisplayed_isEnabled extends SumitUtility {
	
	static WebDriver driver;
	public isPresent_isDisplayed_isEnabled(WebDriver driver) {
		//super(driver);
	}
	public static void main(String[] args) {	
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//isPresent_isDisplayed_isEnabled ipe=new isPresent_isDisplayed_isEnabled(driver);
		
		driver.get("https://www.wikipedia.org/");
		
		isElementPresent(driver,By.xpath("//div[@class='central-textlogo-wrapper']"));	
		
		
		WebElement langDropDown=driver.findElement(By.id("searchLanguage"));
		System.out.println(langDropDown.isDisplayed()); // false as list is kinda of hidden
		System.out.println(langDropDown.isEnabled());		
		System.out.println(langDropDown.isSelected());

	}
	
	
	}


