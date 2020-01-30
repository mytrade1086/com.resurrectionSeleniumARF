package com.resurrectionSeleniumARF;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> hreafall = findAllLinks(driver);
		for (WebElement el : hreafall) {
			System.out.println(el.getAttribute("href"));
		

		HttpURLConnection connection = (HttpURLConnection).openConnection();
		try
		{
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			return response;
		}

		catch (Exception exp)
		{
			return exp.getMessage();
		}
	}

	public static List<WebElement> findAllLinks(WebDriver driver) {
		List<WebElement> elementList = new ArrayList<WebElement>();
		elementList = driver.findElements(By.tagName("a"));
		elementList.addAll(driver.findElements(By.tagName("img")));
		List<WebElement> finalList = new ArrayList<WebElement>();
		for (WebElement element : elementList) {
			if (element.getAttribute("href") != null) {
				finalList.add(element);
			}
		}
		return finalList;
	}

}
