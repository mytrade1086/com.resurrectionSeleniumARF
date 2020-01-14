package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyGenericUtilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		 By editSearch=By.name("q");
		 MyGenericUtil util=new MyGenericUtil(driver) ;
		 util.enterValue(editSearch, "sumit");
			 
			 
		
		
		
		

	}

}
