package com.resurrectionCases;

import org.testng.annotations.Test;

public class TestNGDemo3 {


	@Test(groups= {"regression"})
	public void methodoneTwo() {

		// Method m.

		System.out.println("Output from Class " + TestNGDemo3.class.getName());

	}

	@Test
	public void methodtwoTwo() {
		System.out.println("Output from Class " + TestNGDemo3.class.getName());
	}

}
