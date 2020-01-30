package com.resurrectionSeleniumARF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowsers {
	static WebDriver driver=null;

	public static void main(String[] args) {
		
		AllBrowsers ab=new AllBrowsers();
		driver=ab.launchBrowser("ie");

	}  

	/**
	 * 
	 * @param browserName chrome,firefox,ie
	 */

	public WebDriver launchBrowser(String browserName) {

		if (browserName.trim().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.google.com");

			return driver;

		}

		else if (browserName.trim().equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", "H:\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("http://www.rediff.com");

			return driver;
		}

		else if (browserName.trim().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "H://geckodriver-v0.26.0-win64//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://www.google.com");

			return driver;
		}

		else {
			return null;

		}

	

	}

}
