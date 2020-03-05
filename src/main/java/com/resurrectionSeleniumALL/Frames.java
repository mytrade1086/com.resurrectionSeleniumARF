package com.resurrectionSeleniumALL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
		@Test
	public void singleFrame() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		    driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			 driver.get("http://demo.automationtesting.in/Register.html");
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			WebElement switchToClick=driver.findElement(By.xpath("//li[@class='dropdown']/a[text()='SwitchTo']"));
			Actions act=new Actions(driver);
			act.moveToElement(switchToClick).moveToElement(driver.findElement(By.xpath("//li/a[text()='Frames']"))).click().build().perform();
		
			
			
			
		System.out.println(" frames on main page "+driver.findElements(By.tagName("iframe")).size());
			
			
			
			
			
			driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
			
			////input[@type='text']  //Iframe with in an Iframe
			
			driver.switchTo().frame("singleframe");
			
			
			System.out.println(" frames on singleframe "+driver.findElements(By.tagName("iframe")).size());
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sumit");
			
			
			
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
			
			driver.switchTo().frame("singleframe");
			
			System.out.println(" inputs in" +driver.findElements(By.tagName("input")).size());
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sumit2");
			driver.switchTo().defaultContent();
			
			
}
		
		
		
		@Test(enabled=false)
		public void tes() {		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			    driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				 driver.get("http://demo.automationtesting.in");
			
			
			
			
			
		}
		
		
}
