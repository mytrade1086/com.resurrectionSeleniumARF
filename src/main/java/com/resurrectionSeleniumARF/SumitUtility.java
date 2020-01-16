package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SumitUtility {

//static WebDriver driver;
//public SumitUtility(WebDriver driver) {
//		this.driver=driver;
//	}

	/*
	 * public static boolean isElementPresent(By by) {
	 * 
	 * try { driver.findElement(by); System.out.println("Webelement present");
	 * return true; } catch (Exception e) {
	 * System.out.println("No Element present"); return false; }
	 * 
	 * }
	 */


public static boolean isElementPresent(WebDriver driver,By by) {
try {
		 driver.findElement(by);
		System.out.println(by.toString()+" <b>Webelement present</b>");
		return true;
	} catch (Exception e) {
		System.out.println("No Element present");
		return false;
	}

}

}
