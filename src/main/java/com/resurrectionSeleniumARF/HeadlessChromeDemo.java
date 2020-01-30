package com.resurrectionSeleniumARF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	//WebDriver driver=null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--headless");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getWindowHandle());
		
		
		
	}

}
