package com.resurrectionSeleniumARF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling1 {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByValue("10");

		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("11");
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1986");
		
		
		List<WebElement> items=getAllOptions(year);
		
		System.out.println(items.size());
		
		
	}
	
	public static void Selectbyvalue(WebElement webelement,String value) {
		Select sel=new Select(webelement);
		sel.selectByValue(value);
	
    }
	
	
	public static List<WebElement> getAllOptions(Select select) {
		//Select sel=new Select(webelement);
		List<WebElement> items=select.getOptions();
		
		return items;
		
		
    }
	
}
