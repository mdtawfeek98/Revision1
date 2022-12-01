package com.json.prj;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonEx {

	public static void main(String[] args) throws IOException, ParseException {

		//		File f1 = new File("./file.json");
		//		FileReader fr = new FileReader(f1);
		//		JSONParser json = new JSONParser();
		//		
		//		Object obj = json.parse(fr);
		//		JSONObject jobj = (JSONObject) obj;
		//		Object obj1 = jobj.get("companyname");
		//	    String na = (String) obj1;
		//	    System.out.println(na);
		//		
		//		Object obj2 = jobj.get("interview");
		//		JSONArray jobj1 = (JSONArray) obj2;
		//		Object obj3 = jobj1.get(0);
		//		JSONObject jn = (JSONObject) obj3;
		//		
		//		Object obj4 = jn.get("name");
		//		 String na1 = (String) obj4;
		//		 System.out.println(na1);
		//		 
		//		 Object ob2 = jn.get("Experience");
		//		 JSONArray ja = (JSONArray) ob2;
		//		 Object k = ja.get(0);
		//		 JSONObject kl = (JSONObject) k;
		//		 Object o =  kl.get("companyname");
		//		 String nn = (String) o;
		//		 System.out.println(nn);
		//		 
		//		Object c =  kl.get("totalexp");
		//	
		//		String ff = (String) c ;
		//		System.out.println(ff);



		File f1 = new File("./file.json");
		FileReader fr = new FileReader(f1);
		JSONParser js = new JSONParser();
		Object obj = js.parse(fr);
		JSONObject jobj =  (JSONObject) obj;
		Object obj1 = jobj.get("intitutename");
		String na = (String) obj1;
		System.out.println("InstituteName: "+na);

		Object obj2 = jobj.get("batch");
		JSONArray jar = (JSONArray) obj2;
       
		Object j1 = jar.get(0);

		JSONObject jb = (JSONObject) j1;
		Object obj11 = jb.get("BatchNumber");
		String na1 = (String) obj11;
		System.out.println("BatchNumber: "+na1);

		Object obj4 = jb.get("StudentList");
		JSONArray jar5 = (JSONArray) obj4;
		 for(int j=0;j<jar5.size();j++) {
		Object jk = jar5.get(j);

		JSONObject jj = (JSONObject) jk;
		Object vv = jj.get("studentname");
		String d = (String) vv;
		System.out.println("StudentName: " + d);
		

		Object n = jj.get("StudentPhonenumber");
		JSONArray ja = (JSONArray) n;
		 for(int k=0;k<ja.size();k++) {
		Object cc = ja.get(k);

		JSONObject cc1 = (JSONObject) cc;
		Object b = cc1.get("primarynumber");
		String v = (String) b;
		System.out.println("PrimaryNumber: " +v);

		Object bb = cc1.get("secondnumber");
		String nk = (String) bb;
		System.out.println("SecondNumber: " + nk);

		 }
		 
        }





	}

}
