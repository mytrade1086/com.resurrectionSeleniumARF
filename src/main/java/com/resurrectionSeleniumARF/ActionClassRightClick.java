package com.resurrectionSeleniumARF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassRightClick {

	public static void main(String[] args) {
		
		//Actions constructor needs driver object
		//Select class object needs Webelement

		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	
		
		
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.name("q"))).build().perform(); //
			
		
		driver.quit();

	}

}
