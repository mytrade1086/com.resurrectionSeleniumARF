package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements_value_attibute {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("value"));

		driver.quit();
	}

}
