package com.json.prj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class MGOS {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		File f= new File("./file2.json");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		Gson gs = new Gson();
		RootEx eg = gs.fromJson(br, RootEx.class);
		
		String na = eg.getWorklfow().getId();
		System.out.println(na);
		
		
		
	}
	
}
