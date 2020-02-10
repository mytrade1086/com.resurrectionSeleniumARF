package com.resurrectionSeleniumARF;

import org.testng.annotations.Test;

public class TestNgTimeoutAttrib {
	
	
	
	@Test(timeOut=1000)
	
	public void bookTicket() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Error post timeout");
		
	}

}/*
	 
	  
	 * FAILED: bookTicket org.testng.internal.thread.ThreadTimeoutException: Method
	 * com.resurrectionSeleniumARF.TestNgTimeoutAttrib.bookTicket() didn't finish
	 * within the time-out 1000
	 */