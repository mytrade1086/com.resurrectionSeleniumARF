package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class setAttributeJavaScript {
	
	public static void main(String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.rediff.com");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.id("srchword"));
	String existing=element.getAttribute("value");
	System.out.println("Existing: "+existing);
	
	
	
	//"arguments[0].setAttribute('value','"+value+"');";
	
	String newvalue=existing+"comp";
	System.out.println("Newvalue: "+newvalue);
	
	element.sendKeys("comp");
	//js.executeScript("arguments[0].setAttribute('value', '"+newvalue+"')",element);
	
	
	}	
	

}
