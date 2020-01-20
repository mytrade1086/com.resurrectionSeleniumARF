package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		Actions act=new Actions(driver) ;
		act.click(driver.findElement(By.xpath("//Select[@title='Search in']"))).click(); //No need of build().perform() as single action
		
	
	}
}
