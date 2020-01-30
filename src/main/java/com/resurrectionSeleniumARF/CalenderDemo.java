package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		////ul/li[@data-cy='oneWayTrip']  
		
		
		
		
		//driver.findElement(By.xpath("//ul/li[@data-cy='roundTrip']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//ul/li[@data-cy='oneWayTrip']")).click();
		
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
		////input[@id='fromCity']
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mum",Keys.DOWN,Keys.RETURN);
		
		
		
		
		
		
		//driver.findElement(by)
		
		
		
		
	}
}
