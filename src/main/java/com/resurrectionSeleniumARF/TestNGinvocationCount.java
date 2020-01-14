package com.resurrectionSeleniumARF;


import org.testng.annotations.Test;

public class TestNGinvocationCount {
	
	
	@Test(invocationCount=5)
	public  void login() {
		
		System.out.println("written one syso but will get executed 10 times");
//		PASSED: login
//		PASSED: login
//		PASSED: login
//		PASSED: login
//		PASSED: login
		
	}
	
	

}
