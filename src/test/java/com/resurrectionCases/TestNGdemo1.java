package com.resurrectionCases;

import org.testng.annotations.Test;

public class TestNGdemo1 {
	


	@Test(groups={"tp"})
    public void methodoneOne() {
		
		//Method m.
		
		
		System.out.println("Output from Class "+TestNGdemo1.class.getName());
		
  
	}

	@Test
	public void methodoneTwo() {
		System.out.println("Output from Class "+TestNGdemo1.class.getName());
	}

}
