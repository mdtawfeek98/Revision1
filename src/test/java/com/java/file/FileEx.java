package com.java.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.java.commonutils.SLF4J;

public class FileEx extends SLF4J {

	//	public static String  fileMethod(String location) throws IOException {

	//		File f1 = new File(location);
	//		if(f1.exists()) {
	//			System.out.println("Already we have a file");
	//		}
	//		else {
	//			f1.createNewFile();
	//		}
	//		FileReader fr = new FileReader(f1);
	//		BufferedReader br = new BufferedReader(fr);
	//		String st;
	//		while((st=br.readLine())!=null) {
	//			System.out.println(st);
	//		}
	//		return st;
	//	}

	public static void main(String[] args) throws IOException {

				Logger log = LoggerFactory.getLogger(FileEx.class);
		
				File f1 = new File("./prj.file");
				if(f1.exists()) {
					log.info("Already we have a file");
				}
				else {
					f1.createNewFile();
				}

				FileReader fr = new FileReader(f1);                    //File Reader
				BufferedReader br = new BufferedReader(fr);
				int count = 1;
				String st;
				
				while((st=br.readLine())!=null) {
					if(count%2==0) {
					System.out.println(st);
				}
					count++;
				}
				
				
				
		//		List<String> li = FileUtils.readLines(f1);            //File Writer
		//		li.add(1,"dd");
		//		FileUtils.writeLines(f1, li);


		
	}
}




















