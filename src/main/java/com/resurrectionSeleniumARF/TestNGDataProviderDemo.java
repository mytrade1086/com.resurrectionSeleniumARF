package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderDemo {
	@Test(dataProvider = "provider")
	public void signin(String username,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.quit();
	}

	@DataProvider(name = "provider")
	public Object[][] datamethod() {

		Object[][] data = new Object[2][2];

		data[0][0] = "sumit";
		data[0][1] = "raut";
		data[1][0] = "neha";
		data[1][1] = "Deshmukh";

		return data; };
	}

