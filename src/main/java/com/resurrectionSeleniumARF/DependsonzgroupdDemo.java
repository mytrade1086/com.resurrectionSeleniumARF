package com.resurrectionSeleniumARF;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonzgroupdDemo {
	
	
	
	@Test(groups="even")
	public void even1() {
		Assert.assertEquals(true, true);
		System.out.println("runnign even 1");
	}
	
	@Test(groups="even")
	public void even2() {
		Assert.assertEquals(true, false);
		System.out.println("runnign even 2");
	}


	
	@Test(dependsOnGroups="even")
	public void even3() {
		
		System.out.println("runnign even 3");
	}

	
	/*
	 * runnign even 1 PASSED: even1 FAILED: even2 java.lang.AssertionError: expected
	 * [false] but found [true]
	 * 
	 * 
	 * SKIPPED: even3
	 * 
	 * 
	 * =============================================== Default test Tests run: 3,
	 * Failures: 1, Skips: 1 ===============================================
	 * 
	 * 
	 * =============================================== Default suite Total tests
	 * run: 3, Failures: 1, Skips: 1 =============================================
	 */
	
	
}
