package com.resurrectionSeleniumARF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1.by.xpath
		 2.by.name
		 3.by.id
		 4.by.cssselector
		 5.by.linktext    Only links
		 6.className
		 7.by.partialLinktext
		 
		 
		 Prefererred Order:	id name xpath/css 
		 */
	
		
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pwd");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		
		
		
		
		

	}

}
