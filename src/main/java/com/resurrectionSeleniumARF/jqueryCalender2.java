package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryCalender2 {
	
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.expedia.com");
		
		driver.findElement(By.id("package-departing-hp-package")).click();
		
		// //button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next'];
		
		
		
		
	}

}
