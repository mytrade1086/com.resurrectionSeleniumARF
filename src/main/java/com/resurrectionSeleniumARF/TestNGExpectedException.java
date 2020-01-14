package com.resurrectionSeleniumARF;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExpectedException {
	
	
	@Test(expectedExceptions =ArithmeticException.class)
	public  void login(){
     int i=9/0;
     System.out.println("run after ignoring exception");
     
     /*
     [RemoteTestNG] detected TestNG version 6.14.3
     PASSED: login

     ===============================================
         Default test
         Tests run: 1, Failures: 0, Skips: 0
     ===============================================
     
     */
		
	}
	
	
	
	@Test
	public  void signIn(){
     int i=9/0;
     System.out.println("run after ignoring exception");
     
     /*
     [RemoteTestNG] detected TestNG version 6.14.3
FAILED: signIn
java.lang.ArithmeticException: / by zero

===============================================
    Default test
    Tests run: 1, Failures: 1, Skips: 0
===============================================


     
     */
		
	}
	
	
	

}
