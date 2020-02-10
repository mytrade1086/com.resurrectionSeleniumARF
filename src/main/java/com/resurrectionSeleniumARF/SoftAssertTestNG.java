package com.resurrectionSeleniumARF;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTestNG {

	@Test

	public void methodWithSoftAssert() {

		SoftAssert sa = new SoftAssert();
		Assert.assertEquals("sumit", "sumit");
		System.out.println("==Using SA in below line");
		sa.assertEquals(5, 3);
		sa.assertEquals("raut", "rau");
		//Assert.assertEquals("sumit", "sumit");
		sa.assertAll();

		/*
		 * FAILED: methodWithSoftAssert java.lang.AssertionError: The following asserts
		 * failed: expected [3] but found [5], 
		 * expected [rau] but found [raut]
		 */
	}

}
