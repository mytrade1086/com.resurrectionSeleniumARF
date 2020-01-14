package com.resurrectionSeleniumARF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Links_ImagesCount_AttributeValues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");

		
		//Links
		List<WebElement> wl = driver.findElements(By.tagName("a"));
		System.out.println(wl.size());
		System.err.println(" by For Each Loop________");
		for (WebElement wlink : wl) {
			if (wlink.getText().length()>0){
				System.out.println(wlink.getText()+"::"+wlink.getAttribute("value"));
			}
		}
	
		System.err.println(" by Regular For________");
		for(int i=0;i<wl.size();i++) {
			
		if(wl.get(i).getText().trim().length()>0) {
		System.out.println(wl.get(i).getText());	
		}
			
		
		}
		
		
		
		
	System.err.println("_________________________________");
		
		//EditBoxes
		List<WebElement> edit = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(edit.size());
		
		
		driver.close();
	}

}
