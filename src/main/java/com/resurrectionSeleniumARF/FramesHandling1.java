package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		driver.switchTo().frame("main");
		
		System.out.println(driver.findElement(By.cssSelector("body >h2")).getText());
		//http://www.londonfreelance.org/courses/frames/index.html
		
		driver.switchTo().defaultContent();
		
		
		
		
	}

}
