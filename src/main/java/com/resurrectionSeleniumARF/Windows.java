package com.resurrectionSeleniumARF;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows {
	
	
	
	@Test//  click on link.. open new tabbed window-- click some link on new window-- return to parent window
	public void newTabbedWindow() {
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);			
		String Parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Open New Tabbed Windows ']")).click();
		driver.findElement(By.xpath("//a/button[@class='btn btn-info']")).click();
		Set <String> allWindows=driver.getWindowHandles();
		
	//	allWindows.remove(Parent);
		 String child="";
	Iterator<String> iwnd=	allWindows.iterator();
	   while(iwnd.hasNext()) {  
		   if(Parent!=iwnd.next()) {  
			    child=iwnd.next();
			   break;
		   }
	   }   
	    driver.switchTo().window(child);
	    driver.findElement(By.linkText("Contact")).click();
	    driver.switchTo().window(Parent);	    
        driver.close();
	}








@Test
public void newSeparateWindow() {
	
	System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Windows.html");
	driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);			
	String Parent=driver.getWindowHandle();
	
	
	
	driver.findElement(By.linkText("Open New Seperate Windows")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Set <String> allWindows=driver.getWindowHandles();
	
//	allWindows.remove(Parent);
	 String child="";
Iterator<String> iwnd=	allWindows.iterator();
   while(iwnd.hasNext()) {  
	   if(Parent!=iwnd.next()) {  
		    child=iwnd.next();
		   break;
	   }
   }   
    driver.switchTo().window(child);
    driver.findElement(By.linkText("Contact")).click();
    
    driver.close();
    driver.switchTo().window(Parent);	    
   // driver.close();
}
}

