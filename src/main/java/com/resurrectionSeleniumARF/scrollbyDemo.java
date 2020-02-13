package com.resurrectionSeleniumARF;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollbyDemo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.google.com");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		driver.close();
	}

}
