package com.resurrectionSeleniumARF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {
	
	public static void main(String[] args) {
		
//		start-maximized: Opens Chrome in maximize mode
//		incognito: Opens Chrome in incognito mode
//		headless: Opens Chrome in headless mode
//		disable-extensions: Disables existing extensions on Chrome browser
//		disable-popup-blocking: Disables pop-ups displayed on Chrome browser
//		make-default-browser: Makes Chrome default browser
//		version: Prints chrome browser version
//		disable-infobars: Prevents Chrome from displaying the notification 'Chrome is being controlled by automated software
		
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		            ChromeOptions options = new ChromeOptions();
					options.addArguments("start-maximized");
		            options.addArguments("incognito");
		            //options.addArguments("disable-infobars"); // Observation :it didnt work
		            //options.addArguments("version");         //  it didnt work
		           
		            ChromeDriver driver = new ChromeDriver(options);
		
		//WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		      
		
	}

}
