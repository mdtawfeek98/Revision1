package com.java.pageexecution;

import org.testng.annotations.Test;

import com.java.commonutils.CommonUtils;

public class ExecutionWithPF extends HomeWithPFExecution {

	@Test
	public void test01() {
		ExecutionWithPF e = new ExecutionWithPF();
		CommonUtils.browserLaunch("chrome");
		CommonUtils.browserMax();
		CommonUtils.urlLaunch("https://www.facebook.com/");
		e.username("tawfeek37988@gmail.com");
		e.password("feekoshayo3798");
		e.login();
	}
	
}
