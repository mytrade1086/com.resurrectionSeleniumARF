package com.resurrectionSeleniumARF;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsesertVSverify {
	
	/*
	 * Assert: If the assert condition is true then the program control will execute
	 * the next test step but if the condition is false, the execution will stop and
	 * further test step will not be executed. whereas, Verify: There won’t be any
	 * halt in the test execution even though the verify condition is true or false
	 */

	
	@Test
	public void assertDemo() {
		
		Assert.assertEquals("sumit", "sumt");
		Assert.assertEquals("true", "true");
		
		//FAILED: assertDemo
		//java.lang.AssertionError: expected [sumt] but found [sumit]
		
	}
	
	
	
	//Verify is implemented in TestNG using SoftAssert
	@Test
	public void VerifyDemo() {
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals("sumit", "sumt");
		sa.assertEquals("true", "true");
		sa.assertAll();
		
		//FAILED: assertDemo
		//java.lang.AssertionError: expected [sumt] but found [sumit]
		
	}
	
	
	
}
