package com.resurrectionSeleniumARF;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");

		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> activeWindow = driver.getWindowHandles();

		Iterator<String> windowItr = activeWindow.iterator();
		String childHandle = windowItr.next();

		while (windowItr.hasNext())
			if ((String) windowItr.next() != parentHandle) {
				driver.switchTo().window(childHandle);
			}
		driver.findElement(By.name("emailid")).sendKeys("test");

	}

}
