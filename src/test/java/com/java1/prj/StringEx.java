package com.java1.prj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import org.apache.hc.client5.http.auth.AuthenticationException;

public class StringEx {

	String name= "tawfeek";

	StringEx(){
		System.out.println("Normal Constructor");
	}

	StringEx(String name){
		System.out.println(name);
	}

	@SuppressWarnings("null")
	public static void main(String[] args) throws AuthenticationException {



		//		String name= "tawfeek";                //Non-primitive
		//		
		//		String hisName = new String("mohamed tawfeek");
		//		
		//		for(int i=0;i<hisName.length();i++) {
		//			System.out.println(hisName.charAt(i));
		//		}


		//		StringBuffer sb = new StringBuffer("Mohamed");  //thread safe and sync 
		//		System.out.println(sb.append("tawfeek"));
		//		System.out.println(sb.reverse());
		//		
		//		StringBuilder sl = new StringBuilder("tawfeek");  //non theread safe


		//		int[] arr = new int[4];
		//		arr[0] = 1;
		//		arr[2] = 3;
		//		
		//		System.out.println(Arrays.toString(arr));
		//		
		//		for(int i=0;i<arr.length;i++) {
		//			System.out.println(arr[i]);
		//		}


		//		String [] str = new String[4];
		//		str[0] = "tawd";
		//		str[1] = "md";
		//		
		//		System.out.println(Arrays.toString(str));


		//		int [][] arr = new int [2][2];
		//		
		//		arr[0][0] = 12;
		//	    arr[0][1] = 22;
		//		arr[1][0] = 33;
		//		arr[1][1] = 6;
		//		
		//	   System.out.println(Arrays.deepToString(arr));
		//
		//       String [] s = {"taw","ss",""};
		//       System.out.println(Arrays.toString(s));


		//		int a=10;
		//		
		//		Integer b=a;
		//		int c=b;


		//		int value = 1980;
		//		String number = "1980";

		//int changedNumber = Integer.parseInt(number);
		//		
		//		System.out.println(value+10); //1990
		//		System.out.println(number+10); //198010

		//		Scanner sc = new Scanner(System.in);
		//		String ptr = null;
		//		String name = "Azhar";
		//
		//		int[] arr = {10,20,30};
		//
		//		List<Integer> list = new ArrayList<Integer>();
		//		list.add(15);
		//		list.add(25);
		//		list.add(35);
		//
		//		System.out.println("Start");
		//
		//		if (ptr.equals("gfg"))                             //NullPointerException
		//			System.out.print("Same");
		//		else
		//			System.out.print("Not Same");
		//
		//
		//		System.out.println(10/0);                           //ArithmeticException
		//	    System.out.println(name.charAt(6));                 //StringIndexOutOfBoundsException
		//		System.out.println(arr[5]);                         //ArrayIndexOutOfBoundsException
		//
		//		System.out.println(list.get(5));                    //IndexOutOfBoundsException
		//
		//		int value1 = Integer.parseInt("Twenty two");                  //NumberFormatException
		//		System.out.println(value1);
		//
		//		System.out.println("Please enter your age: ");      //InputMismatchException
		//		int initial = sc.nextInt();
		//
		//		


		//		try {
		//			System.out.println("s");
		//		}
		//		catch(Exception e) {
		//			System.out.println("ss");
		//		}

		//		String user = "m";
		//		
		//		if(user.equalsIgnoreCase("Admin")) {
		//			System.out.println("Allowed");
		//		}
		//		else {
		//			   throw new AuthenticationException();
		//		}


		List<Integer> li = new LinkedList<Integer>();
		li.add(1);
		li.add(1);
		li.add(2);

		//		for(Integer en : li) {
		//			System.out.println(en);
		//		
		//		}

		//		Set<Integer> se1 = new HashSet<Integer>();
		//		for(Integer tt : li) {
		//			se1.add(tt);
		//		}
		//		System.out.println(se1);

		//		Set<String> se = new HashSet<String>();
		//		se.add("tafw");
		//		se.add("tafw");
		//		se.add("md");
		//		
		//		System.out.println(se);


		//		Map<Integer, String> mp = new HashMap<Integer,String>();
		//		mp.put(1, "tawf");
		//		mp.put(2, "ra");
		//		mp.put(2, "tawf");
		//		
		//		
		//		System.out.println(mp);



		//		int a = 11;
		//		if (a % 2 == 0) {
		//			System.out.println("Even number");
		//		} else {
		//			System.out.println("Odd num");
		//		}	



		//Reverse

		//				String name = "this is a beautiful place";
		//				String rev = "";
		//				
		//				for(int i= name.length()- 1; i>=0; i--  ) {
		//				char ch = name.charAt(i);
		//				rev = rev +ch;
		//					
		//				}

		//			System.out.println(rev);
		//		


		//		String name = "mohamed";
		//		String rev = "";
		//		
		//		for(int i=name.length()-1; i>=0; i--) {
		//			char ch = name.charAt(i);
		//			rev = rev + ch;
		//		}
		//		
		//		System.out.println(rev);



		//even no.

		//		int i=11;
		//		
		//		if(i%2==0) {
		//			System.out.println("even no.");
		//		}
		//		else {
		//			System.out.println("odd no.");
		//		}

		//even from 1 to 100


		//		for(int i=1;i<=100;i++) {
		//			if(i%2==0) {
		//				System.out.print(i+" ");
		//			}
		//		}


		//odd from 1 to 500

		//		for(int i=0;i<=500;i++) {
		//			if(i%2==1) {
		//				System.out.print(i+" ");
		//			}
		//		}


		// reverse the string 

		//		String name = "Halija Banu";
		//		String rev = " ";
		//
		//		for(int i=name.length()-1; i>=0; i--) {
		//			char ch = name.charAt(i);
		//			rev = rev + ch;   	
		//		}
		//
		//		System.out.println(rev);


		//		int a =10;
		//		int b = 20;
		//		int temp   ;
		//
		//        temp = a;
		//        a = b;
		//        b = temp;
		//        
		//        System.out.println("a="+a);
		//        System.out.println("b="+b);


		//		int a =10;
		//		int b = 20;
		//           
		//		a = a+b;
		//		b = a-b;
		//		a = a-b;
		//
		//		System.out.println("a="+a);
		//        System.out.println("b="+b);



		//factorial

		//		int fact = 1;
		//		
		//		for(int i=1;i<=5;i++) {
		//			fact= fact*i;
		//		}
		//
		//          System.out.println(fact);


		//palindrome

		String name = " madam";
		String rev = " ";

		for(int i=name.length()-1; i>=0; i--) {
			char ch = name.charAt(i);
			rev = rev + ch;   	
		}

//		String name = "madam";
//		String rev = "";
//		for (int i = name.length() - 1; i >= 0; i--) {
//			char ch = name.charAt(i);
//			rev = rev + ch;
//		}

		if (rev.equals(name)) {
			System.out.println("Palindrome string");
		} else {
			System.out.println("Not palindrome string");
		}









	}



}


