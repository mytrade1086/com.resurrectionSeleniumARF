package com.resurrectionSeleniumARF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgParallelExecution {
	
	
	
	@Test
	public void loginRediff() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	

    driver.get("http://www.rediff.com");
	System.out.println("Window Handle is: "+driver.getWindowHandle()+" Hashcode of driver is: "+driver.hashCode());
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.manage().timeouts().pageLoadTimeout(20 ,TimeUnit.SECONDS);
	
	driver.quit();
	}
   
	
	@Test
	public void loginGoogle() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	

    driver.get("http://www.google.com");
	System.out.println("Window Handle is: "+driver.getWindowHandle()+" Hashcode of driver is: "+driver.hashCode());
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.manage().timeouts().pageLoadTimeout(20 ,TimeUnit.SECONDS);
	
	driver.quit();
	}
   
	
	@Test
	public void loginBing() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	

    driver.get("http://www.bing.com");
	System.out.println("Window Handle is: "+driver.getWindowHandle()+" Hashcode of driver is: "+driver.hashCode());
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.manage().timeouts().pageLoadTimeout(20 ,TimeUnit.SECONDS);
	
	driver.quit();
	
	}

}
