package com.resurrectionSeleniumARF;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasicsCharSequence {

	
	//H:\chromedriver_win32\chromedriver.exe
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
	
		driver.findElement(By.name("q")).sendKeys("this ","is"," sparta");
		//Notice that input text is separated by characters
		
		File fl=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(fl, new File("H:\\Resurrection\\snap.jpg"));
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
		finally {
			
			if (!(driver==null)) {
				driver.quit();
			}
		}
		
	}
	
	
	
	
}
