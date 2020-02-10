package com.resurrectionSeleniumARF;

import org.testng.SkipException;
import org.testng.annotations.Test;
public class SkipExceptionDemo {
	
	
	@Test
	public void methodtoexecute() {
		
		System.out.println("Normal TEST method");
	}
	
	
	@Test
	public void methodtoSkip() {
		
		System.out.println("inside exception method");
		throw new SkipException("from skipException");
	}


}
