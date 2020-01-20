package com.resurrectionSeleniumARF;

import org.testng.annotations.Test;

public class SkipException {
	
	
	@Test
	public void methodtoexecute() {
		
		
	}
	
	
	@Test
	public void methodtoSkip() {
		
		System.out.println("inside exception method");
		throw new SkipException("skipped with skipException");
	}


}
