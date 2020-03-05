package com.resurrectionSeleniumARF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableHandling {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		
		
		//click edit button present in particular row
		
		
		
		//div[contains(text(),'teste.4221@teste.io')]//parent::div/following-sibling::div//i[@class='fa fa-pencil']
		//div[contains(text(),'teste.4221@teste.io')]//parent::div/following-sibling::div//i[@class='fa fa-pencil']
		
		

	}

}
