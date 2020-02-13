package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement editSearch=driver.findElement(By.name("oq"));
		//org.openqa.selenium.NoSuchElementException


		driver.close();

		
	
	}
	

	
}
