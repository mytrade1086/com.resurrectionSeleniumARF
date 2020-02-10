/**
 * 
 */
package com.resurrectionSeleniumARF;

import org.testng.SkipException;
import org.testng.annotations.Test;

/**
 * @author sunshine
 *
 */
public class TestNGSkipException {
	
	
	
	@Test(enabled=false)
	public void skipdemo1() {	
		System.out.println("Skipping via enabled=false attrib");
		//this wont be considered skipped in results
	}
	
	
	@Test()
	public void skipExceptiondemo() {
		System.out.println("Inside Skip Exception");	
		throw new SkipException("Skipping via skip");
 
		/*
		 * Inside Skip Exception SKIPPED: skipExceptiondemo org.testng.SkipException:
		 * Skipping via skip
	
		 * Default test
           Tests run: 2, Failures: 0, Skips: 1
		 */
	}

}
