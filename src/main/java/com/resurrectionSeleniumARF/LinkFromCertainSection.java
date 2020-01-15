package com.resurrectionSeleniumARF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkFromCertainSection {

	public static void main(String[] args) {
		// 
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		WebElement centralLang=driver.findElement(By.xpath("//div[@class='central-featured']"));
		List<WebElement> lang=centralLang.findElements(By.xpath("//a/strong"));
		
		System.out.println(lang.size()); //10
		for(WebElement link:lang) {
			System.out.println(link.getText());
			
//			English
//			日本語
//			Deutsch
//			Español
//			Русский
//			Français
//			Italiano
//			中文
//			Português
//			Polski
			
		}
		
		
		

	}

}
