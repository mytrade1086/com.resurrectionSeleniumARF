package com.resurrectionSeleniumARF;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassTag2Child  extends ClassTag1Parent{
	
	
	
	@BeforeClass
	public void bcChild() {
		
		System.out.println("Inside Child Before Class");
	}
	
	
	@Test
		public void dummy() {
			
		
		System.out.println("in test method");}
	}



