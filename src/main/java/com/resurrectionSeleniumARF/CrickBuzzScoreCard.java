package com.resurrectionSeleniumARF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickBuzzScoreCard {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scores/26548/zim-vs-sl-1st-test-sri-lanka-tour-of-zimbabwe-2020");

		List<WebElement> table = driver
				.findElements(By.xpath("//div[@ng-repeat='batsmen in match.miniscore.batsman']/div"));

		System.out.println("Batting Table Div Count :" + table.size());

		for (int i = 0; i < table.size(); i++) {
			System.out.print(table.get(i).getText() + " ");

			if (table.get(i).getText().contains(".")) {
				// Just breaking the output in new line once we strike rate column with .
				System.out.println("");
			}

		}

		driver.quit();
	}

}
