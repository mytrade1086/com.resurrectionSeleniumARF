package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorAll {

	JavascriptExecutor js = null;
	WebDriver driver = null;

	@Test
	public void jsEnterText() {
		driver = getdriver("chrome", "http://www.rediff.com");
		WebElement srchword = driver.findElement(By.name("srchword"));
		WebElement srchquery_tbox = driver.findElement(By.name("srchquery_tbox"));
		js = (JavascriptExecutor) driver;
		// Version 1
		// 1 refers to srchquery_tbox
		js.executeScript("arguments[1].value='help';", srchword, srchquery_tbox);
		// 0 refers to srchword
		js.executeScript("arguments[0].value='help';", srchword, srchquery_tbox);
		driver.close();
	}

	@Test
	public void jsClick() throws InterruptedException {
		driver = getdriver("chrome", "http://www.google.com");
		WebElement btnSrch = driver
				.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']"));
		WebElement txtSrch = driver.findElement(By.name("q"));
		js = (JavascriptExecutor) driver;
		
		//Get window title
	System.out.println((String) js.executeScript("return document.title;"));
	
	//get current url
	System.out.println((String) js.executeScript("return document.URL;")); //URL is case sensitive
		
		
		js.executeScript("arguments[0].value='Javascript';", txtSrch);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", btnSrch);
		
		
		//To navigate to url
		js.executeScript("window.location = 'http://www.wwe.com/'");
		//driver.close();
	}
	
	
	
	
	@Test(priority=-1)
	public void jsWindowScrollBy() throws InterruptedException {
		driver = getdriver("chrome", "https://www.guru99.com/execute-javascript-selenium-webdriver.html");
	
		js.executeScript("window.scrollBy(0,600)"); //need to check
		Thread.sleep(3000);
		//driver.close();
	}
	
	
	//js.executeScript(“document.getElementsById(‘some_id’).value=’Avinash Mishra’;”);
	
	@Test(priority=-2)
	public void jsgetElementsById() {
		driver = getdriver("chrome", "https://mail.rediff.com/cgi-bin/login.cgi");
		js.executeScript("document.getElementsById('login1').value='AvinashMishra';");
		
	}
	
	
	
	
	
	
	public WebDriver getdriver(String browser, String url) {
		if (browser.trim().equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			driver.get(url);
			return driver;
		}
		else
			return null;
	}
}
