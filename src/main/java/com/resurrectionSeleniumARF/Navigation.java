package com.resurrectionSeleniumARF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		/*
		 1.get will wait for page to load.
		 2. navigate().To() wont wait
		 */
		
		
		
		System.out.println(driver.getTitle());
		driver.navigate().to("http://www.amazon.com");
		
		System.out.println(driver.getTitle());
		
	}
	
	
	
	
	
}
