package com.resurrectionSeleniumARF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestionDescendent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		
		
		
		Thread.sleep(4000);

	//both works
	//List< WebElement> suggest=driver.findElements(By.xpath("//ul[@class='erkvQe']//li//div/descendant::div[@class='sbl1']"));
	List< WebElement> suggest=driver.findElements(By.xpath("//ul[@class='erkvQe']//li//div/descendant::span"));
		
		
		//"//ul[@class='erkvQe']//li//div/descendant::span"
		for (WebElement wl:suggest) {
			System.out.println(wl.getText().trim());
			
		}
		
		
		driver.quit();
		
//		
//		javatpoint
//		java interview questions
//		java
//		javascript
//		javascript interview questions
//		java 8 features
//		java tutorial
//		jawa bike
//		javascript tutorial
//		java download
		
		
		
		
	}

}
