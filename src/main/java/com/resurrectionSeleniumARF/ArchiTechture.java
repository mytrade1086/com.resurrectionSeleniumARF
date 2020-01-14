package com.resurrectionSeleniumARF;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ArchiTechture {

	public static void main(String[] args) {

		SearchContext scChrome = new ChromeDriver();
		//scChrome.findElement(by)
		//scChrome.findElements(by)

		SearchContext scFirefox = new FirefoxDriver();
		// SearchContext can access only two methods.

		WebDriver driver = new ChromeDriver();

	}

}
