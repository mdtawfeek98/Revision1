package com.java.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



import org.slf4j.Logger;


import com.java.commonutils.SLF4J;

public class PropertiesEx extends SLF4J{

	static String getProperty(String path, String property) throws IOException {
		File f1 = new File(path);
		if(f1.exists()) {
		  log.info("already have a file");
		}
		else{
			f1.createNewFile();
		log.info("created");
		}
		
		FileReader fr = new FileReader(f1);
	    Properties pr = new Properties();
	    pr.load(fr);
	    String st =  pr.getProperty(property);
	    System.out.println(st);
		return st;
	}
	
	static Logger log  = loadLog(Properties.class);
	
	public static void main(String[] args) throws IOException {
		
//		File f1 = new File("./pro.properties");
//		if(f1.exists()) {
//		  log.info("already have a file");
//		}
//		else{
//			f1.createNewFile();
//		log.info("created");
//		}
//		
//		FileReader fr = new FileReader(f1);
//	    Properties pr = new Properties();
//	    pr.load(fr);
//	    String st =  pr.getProperty("name1");
//	    System.out.println(st);
	    
	    
		PropertiesEx.getProperty("./pro.properties", "name1");
		
		
		
		
		
	}
	
}
