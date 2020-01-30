package com.resurrectionSeleniumARF;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClassDemo {
//robtObject.KeyPress(KeyEvent.VK_DOWN)   //vk+tab  vk_enter
	
	static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "H://geckodriver-v0.26.0-win64//geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.wfia.co.in/?page=past-performance");
	
	//Basically handling Save File dialog box
	//By default Control is on Open
	//We are moving to Save button with Down
	//and later hitting enter key to save file
	
	WebElement link=driver.findElement(By.xpath("//a[@href=\"admin/admin1/upload/STOCK FUTURE.xlsx\"]"));
	link.click();
	
	Robot objRobot=new Robot();
	objRobot.keyPress(KeyEvent.VK_DOWN);
	
	Thread.sleep(3000);
	
	objRobot.keyPress(KeyEvent.VK_ENTER);
	
	
	
	}

}
