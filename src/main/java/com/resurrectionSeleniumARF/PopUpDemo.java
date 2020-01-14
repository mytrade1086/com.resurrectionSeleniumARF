package com.resurrectionSeleniumARF;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpDemo {

	public static void main(String[] args) {

		/**
		  
		 * Alert works with Javascript pop up alerts only
		 */

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://shopping.rediff.com/");
		System.out.println(driver.getWindowHandle());

		driver.findElement(By.className("hm_advertise_new")).click();

		Set<String> st = driver.getWindowHandles();
		Iterator<String> it = st.iterator();

		String PWindow = it.next();
		System.out.println(PWindow);

		String CWindow = it.next();
		System.out.println(CWindow);

		driver.switchTo().window(CWindow);
		driver.close();
        
		driver.switchTo().window(PWindow);
		driver.get("http://www.google.com");
		// org.openqa.selenium.NoSuchWindowException: no such window: target window
		// already closed
		// from unknown error: web view not found

	}

}
