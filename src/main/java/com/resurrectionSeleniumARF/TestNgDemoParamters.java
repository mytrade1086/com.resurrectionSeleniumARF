package com.resurrectionSeleniumARF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgDemoParamters {
	
	
	@Parameters({"testpara"})
	@Test
	public void parameterDemo(String testpara) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
    driver.get("http://www.rediff.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20 ,TimeUnit.SECONDS);
	
	System.out.println("Passed para from xml "+testpara);
	
	
	driver.quit();
	
   

}
}
