package com.resurrectionSeleniumARF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemo {
	
	//Sikuli can't use browsers. Dependent on Webdriver
	//like clicking on youtube play pause
	//Sikulix dependency added to pom.xml
	
	public static void main(String[] args) throws FindFailed {
		
		
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes");
		
		Screen  s=new Screen();
		Pattern pause=new Pattern("H:\\youtubepause.png");
		
		s.wait(pause, 4000)		;
		
		
		
		s.click();
		
		
	}

}
