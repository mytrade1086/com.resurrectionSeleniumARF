package com.resurrectionSeleniumARF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

public static void main(String[] args) {
	
	//Below snippet shows usage of Explicit wait
	//Explicit wait applies for specific WebElement( unlike Implicit which is Global)
	// wait.until returns WebElement
	//If element not located in speficed time limit  we get TimeOut Exception
	
	//Also note that we have used sendkeys in line 29 for drop down data entry instead of Select
	
	System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.Facebook.com");
	
	WebDriverWait wait =new WebDriverWait(driver,10);
	WebElement birthday;
	birthday=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@name='birthday_day']")));
	
	birthday.sendKeys("22");
	
	
}

}
