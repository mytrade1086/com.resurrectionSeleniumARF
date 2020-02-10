package com.resurrectionSeleniumARF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWairDemo3 {
	
	
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://app.hubspot.com");
    WebDriverWait wait = new WebDriverWait(driver, 10);
    
    //wait.ignoring(NoSuchElementException.class);
    //wait.pollingEvery(Duration.ofSeconds(1000));
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
    // Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#username"}
    driver.findElement(By.id("username")).sendKeys("test");
    
	driver.close();
}
}