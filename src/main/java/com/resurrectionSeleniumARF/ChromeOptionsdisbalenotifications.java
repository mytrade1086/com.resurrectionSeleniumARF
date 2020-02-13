package com.resurrectionSeleniumARF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsdisbalenotifications {
	
	public static void main(String[] args) {
		
//		//Create a map to store  preferences 
//		Map<String, Object> prefs = new HashMap<String, Object>();
//
//		//add key and value to map as follow to switch off browser notification
//		//Pass the argument 1 to allow and 2 to block
//		prefs.put("profile.default_content_setting_values.notifications", 2);
//
//		//Create an instance of ChromeOptions 
//		ChromeOptions options = new ChromeOptions();
//
//		// set ExperimentalOption - prefs 
//		options.setExperimentalOption("prefs", prefs);
//
//		//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
//		WebDriver driver = new ChromeDriver(options);
		
		
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
