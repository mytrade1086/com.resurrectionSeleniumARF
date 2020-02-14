package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	
	//H:\chromedriver_win32\chromedriver.exe
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
//		String fullxpath="//a[text()='Gmail']";
//		String partial1="//a[text()='";
//		String partial2="Gmail";
//		String Partial3="']";
//		String total=partial1+partial2+Partial3;
//		driver.findElement(By.xpath(total)).click();
//				
		
		//Case 1
		
		//driver.quit();
		//now driver is null. No session id maintained
		//driver.get("http://www.google.com"); //org.openqa.selenium.NoSuchSessionException Session ID is null	
		
		//Case 2
		//driver.close();
		//now driver is not null.  session id remains same
		
		//driver.getTitle(); //org.openqa.selenium.NoSuchSessionException invalid session id
		
		
	}
	
	
	
	
}
