package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.pollingEvery(duration, unit)
		//wait.ignoring(exceptionType)
		
		
		
		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println(wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username")))));	
		//[[ChromeDriver: chrome on WINDOWS (6bd18d744ccddb729a13855decc70b3b)] -> id: username]	
		
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		driver.findElement(By.id("username")).sendKeys("test");
		driver.close();
	}

}
