package com.resurrectionCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	
	
	@Test(invocationCount=4)
	public void testAssert() {
		
		Assert.assertTrue(false);
		System.out.println("hi");
	}

}
