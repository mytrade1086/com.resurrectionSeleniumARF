package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Dropdown button')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='dropdown show']/div[@class='dropdown-menu show']/a[text()='Another action']")).click();
		
		
		
		
		
		
		// https://getbootstrap.com/docs/4.0/components/dropdowns/

	}

}
