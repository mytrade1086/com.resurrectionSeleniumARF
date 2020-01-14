package com.resurrectionCases;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngDemo {

	@BeforeSuite
	public void suite() {

		System.out.println("BEFORESUITE Level Method");
	}

	@BeforeTest
	public void test() {
		System.out.println("BEFORE TEST Level Method");
	}

	@BeforeMethod
	public void method() {

		System.out.println("BEFORE Method");
	}

//Getting currently executing method name with Reflection
	@Test
	public void firstNG(Method m) {
		System.out.println("Currently executing " + m.getName());
	}

	@Test
	public void secondNG(Method m) {
		System.out.println("Currently executing " + m.getName());
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("AFTER Method");
	}

	@AfterTest
	public void afterTesttest() {

		System.out.println("AFTER TEST Method");
	}

	@AfterSuite
	public void afterSuitesuite() {

		System.out.println("AFTERSUITE Level Method");
	}

}
