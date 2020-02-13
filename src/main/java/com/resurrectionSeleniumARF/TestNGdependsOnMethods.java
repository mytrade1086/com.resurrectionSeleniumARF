package com.resurrectionSeleniumARF;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGdependsOnMethods {
	
	
	@Test
	public  void login() {
		Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods ="login")
	public  void homePage() {
		System.out.println("ruuning homePage");
	}
	
	
	@Test(dependsOnMethods ="login")
	public  void innerMethod() {
		System.out.println("innerMethod");
		
	}

}
