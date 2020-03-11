package com.resurrectionSeleniumARF;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;

public class ClassTag1Parent {

	
	
	@BeforeClass
	public void bc1() {
		
		System.out.println("Inside Parent Before Class");
	}
}
