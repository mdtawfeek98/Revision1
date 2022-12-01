package com.testng.rev;

import static org.testng.Assert.assertTrue;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAna implements IRetryAnalyzer {

	int min= 0 ;
	int max= 5 ;

	@Override
	public boolean retry(ITestResult result) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}
	
	


	
	


}
