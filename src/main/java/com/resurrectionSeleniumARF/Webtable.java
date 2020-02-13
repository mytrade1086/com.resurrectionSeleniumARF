package com.resurrectionSeleniumARF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtable {

	@Test
	public void Webtablework() {
		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
		List<WebElement> allHeadersOfTable = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("Total Headers are " + allHeadersOfTable.size());
		
		if (allHeadersOfTable.size() > 0) {
			for (WebElement el : allHeadersOfTable) {
         	System.out.print(el.getText() + " ");
			}
		}
//		Total Headers are4
//		BookName Author Subject Price
		driver.close();
	}

}
