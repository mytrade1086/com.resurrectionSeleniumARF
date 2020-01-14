package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_SendKeys_Click_ScreenShotUtil_ElementUtils_GenericMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
        
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(By.name("q")), "sumit").build().perform();

	}

}
