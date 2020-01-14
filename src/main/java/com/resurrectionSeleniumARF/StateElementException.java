package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StateElementException {
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		WebElement editGoogle=	driver.findElement(By.name("q"));
		
		System.out.println(editGoogle.hashCode());
		
		editGoogle.sendKeys("test");
		
		driver.navigate().refresh();
		
	
		
		
		editGoogle.sendKeys("test");
		//at com.resurrectionSeleniumARF.StateElementException.main(StateElementException.java:27)
		
		
		
	}

}
