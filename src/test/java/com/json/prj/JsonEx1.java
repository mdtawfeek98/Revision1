package com.json.prj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonEx1 {

	public static void main(String[] args) throws IOException, ParseException {
		
		File f1 = new File("./file1.json");
		FileReader fr = new FileReader(f1);
		JSONParser json = new JSONParser();
		Object obj = json.parse(fr);
		JSONObject jobj = (JSONObject) obj;
		Object ob1 = jobj.get("pageInfo");
		JSONObject jobj1 = (JSONObject) ob1;
		Object ob2 = jobj1.get("pageName");
		String na = (String) ob2;
		System.out.println(na);
		
		
		
	}
	
}
