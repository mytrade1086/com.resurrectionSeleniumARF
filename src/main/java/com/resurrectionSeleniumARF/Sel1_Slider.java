package com.resurrectionSeleniumARF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel1_Slider {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	
}
}

