package com.resurrectionSeleniumARF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenHtml {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

		List<WebElement> allP = driver.findElements(By.id("male"));
		System.out.println(driver.findElements(By.id("male")).size());

		for (WebElement el : allP) {
			try {
				System.out.println("Displayed=" + el.isDisplayed() + " Text is:" + el.getText());
				System.out.println(
						"X coordinate is: " + el.getLocation().getX() + " Y coordinate is: " + el.getLocation().getY());
				el.click();
				// org.openqa.selenium.ElementNotInteractableException
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			//

		}

	}

}
