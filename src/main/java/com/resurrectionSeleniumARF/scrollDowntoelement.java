package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollDowntoelement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		WebElement footer=driver.findElement(By.linkText("Execute Python"));		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", footer);
		Thread.sleep(4000);
		driver.close();

	}

}
