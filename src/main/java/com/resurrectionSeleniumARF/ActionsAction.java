package com.resurrectionSeleniumARF;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Key;

public class ActionsAction {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		WebElement ele=driver.findElement(By.name("q"));
		
		Actions act=new Actions(driver);
		Action a=act.keyDown(ele,Keys.SHIFT).sendKeys("sumit").build();
	
		a.perform();
		
		Thread.sleep(3000);
		
		
		driver.quit();
	

	}

}
