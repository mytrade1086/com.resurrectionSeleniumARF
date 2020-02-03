package com.resurrectionCases;

import org.testng.annotations.Test;

public class TestNGDemo2 {


	@Test(groups= {"regression"})
	public void methodoneTwo() {
System.out.println("Output from Class " + TestNGDemo2.class.getName());

	}

	@Test
	public void methodtwoTwo() {
		System.out.println("Output from Class " + TestNGDemo2.class.getName());
	}

}
