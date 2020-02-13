package com.resurrectionSeleniumARF;

import java.sql.DriverManager;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class proxyDemo {

	
	public static void main(String[] args) {
		
	    WebDriverManager.chromedriver().setup();
	    
	    Proxy proxy=new Proxy();
	    proxy.setHttpProxy("")
	    .setFtpProxy(ftpProxy)
	    .
		WebDriver driver=new ChromeDriver()
		
		
		
	}
}
