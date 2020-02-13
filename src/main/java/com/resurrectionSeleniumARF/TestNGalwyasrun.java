package com.resurrectionSeleniumARF;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGalwyasrun {
	@Test()
	public void one() {
	 System.out.println("this is method 1");
	 Assert.assertEquals("sumit", "bg");
	}
	
	@Test(dependsOnMethods="one",alwaysRun=true)
	public void two() {
		System.out.println("this is method 2");
	}

//	this is method 1
//	this is method 2
//	PASSED: two
//	FAILED: one
//	java.lang.AssertionError: expected [bg] but found [sumit]

}
