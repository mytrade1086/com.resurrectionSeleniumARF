package com.resurrectionSeleniumARF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumReadyClass {

	public WebDriver ChromedriverSetup(String url) {

		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("incognito");
		// options.addArguments("disable-infobars"); // Observation :it didnt work
		// options.addArguments("version"); // it didnt work

		 ChromeDriver driver = new ChromeDriver(options);

//WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		return driver;

	}

}
