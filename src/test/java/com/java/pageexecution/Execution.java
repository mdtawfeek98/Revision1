package com.java.pageexecution;

import org.testng.annotations.Test;

import com.java.commonutils.CommonUtils;

public class Execution extends HomePageExecution{

    
//	public static void main(String[] args) {
//		
//		Execution e = new Execution();
//		CommonUtils.browserLaunch("chrome");
//		CommonUtils.browserMax();
//		CommonUtils.urlLaunch("https://www.facebook.com/");
//		e.userName("tawfeek37988@gmail.com");
//		e.password("feekoshayo3798");
//		e.login();
//		
//		
//	}
	
	
	@Test
	public void test01() {
		Execution e = new Execution();
		CommonUtils.browserLaunch("chrome");
		CommonUtils.browserMax();
		CommonUtils.urlLaunch("https://www.facebook.com/");
		e.userName("tawfeek37988@gmail.com");
		e.password("feekoshayo3798");
		e.login();
	}
	
	
	
	
	
	
}
