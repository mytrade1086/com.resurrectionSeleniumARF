package com.resurrectionSeleniumARF;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer  {
	
	int counter=0;
	int retrLimit=3;

	public boolean retry(ITestResult result) {
		
		if(counter<retrLimit) {
			
			counter++;
			return false;
			
		}
		return false;
		
		
	}

}
