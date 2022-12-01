package com.java.commonutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4J {



	public static Logger loadLog(Class<?> className) {
		Logger log  = LoggerFactory.getLogger(className);
		return log;

	}





}
