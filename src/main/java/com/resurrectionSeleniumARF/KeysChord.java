package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysChord {
	
	
public static void main(String[] args) {
	


	System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");

	driver.findElement(By.name("q")).sendKeys(Keys.chord(Keys.CONTROL+"P"));
	
}
}