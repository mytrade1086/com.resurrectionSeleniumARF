package com.resurrectionSeleniumARF;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		/**
		 * 
		 * Alert works with Javascript pop up alerts only
		 */

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		// '//input[@name='proceed']'

		driver.findElement(By.name("proceed")).click();

		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		driver.switchTo().alert().accept();
		
		
		//We can also use belw to get alert object
		WebDriverWait wait=new WebDriverWait(driver,300);
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());

	}

}
