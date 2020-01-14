package com.resurrectionSeleniumARF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Image_Attribute {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("http://www.amazon.com");
List<WebElement> wel=driver.findElements(By.tagName("img"));

System.out.println(wel.size());

for(WebElement wl:wel) {
	
	System.out.println(wl.getAttribute("SRC"));
	System.err.println("Separator");
	System.out.println(wl.getAttribute("src"));
}








driver.quit();

	}

}
