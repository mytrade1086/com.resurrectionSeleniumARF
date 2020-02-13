package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		String text = js.executeScript("return document.title;").toString();
		System.out.println(text); // Google
		driver.findElement(By.name("q")).sendKeys("love");
		WebElement edit = driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));
		js.executeScript("arguments[0].click();", edit);

		// js.executeScript("window.location = 'http://demo.guru99.com/'"); //nagigates
		// to url specified
	}

}
