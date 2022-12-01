package com.java.file;

import java.io.IOException;

import com.java.commonutils.CommonUtils;

public class SeleniumEx extends CommonUtils implements IPropertiesEx {

	public static void main(String[] args) throws IOException {
		
		CommonUtils.browserLaunch("chrome");
		CommonUtils.browserMax();
		CommonUtils.urlLaunch(CommonUtils.getProperty("./pro1.properties", BROWSER));
		
		
		
		
	}
	
}
