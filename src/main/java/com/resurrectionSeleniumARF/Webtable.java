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

		List<WebElement> allrows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")); // 7

		// lets find how much column how row has

		for (int i = 1; i <= 7; i++) {
			int col = driver.findElements(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td")).size();
			System.out.println(i + " row has " + col + "columns");

		}

		// lets find at what postion author is mukesh

		for (int i = 2; i <= 7; i++) {
			int col = driver.findElements(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td")).size();
			// System.out.println(i+" row has "+col+ "columns");

			for (int c = 1; c <= col; c++) {

				List<WebElement>  tddata=driver.findElements(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td[" + c + "]"));
					
						
						for(WebElement td:tddata) {
					System.out.print(" Row:" + i + " and col:" + c +" "+td.getText());

				
			}
System.out.println(" ");
		}

		
	}
		driver.close();
	}
		
}
