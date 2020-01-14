package com.resurrectionSeleniumARF;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MyGenericUtil {

	WebDriver driver;

	public MyGenericUtil(WebDriver driver) {
		this.driver = driver;

	}

	public void enterValue(By by, String sometext) {

		try {
			driver.findElement(by).sendKeys(sometext);
			System.out.println("Entering the value " + sometext + by.toString());
		}

		catch (Exception e) {
			System.err.println("Error While entering the value " + sometext + by.toString());

		}

	}
	
	
	
	
	public static void ScreenPrint(WebDriver driver,String fileName) throws IOException {
	File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(file, new File("H:\\eclipseWin10\\Resurrection\\ImageFrom\\"+fileName+".jpg"));
		
	}

}
