package com.java.prj;

public class JavaEx1 extends JavaEx {
	
	@Override
	void method1() {
		System.out.println("Method 2");
	}
	

	void method3(){
		JavaEx1.method4();
		System.out.println("method3");
	}

	static void method4(){
		System.out.println("method4");
	}

	public static void main(String[] args) {

		JavaEx1 m = new JavaEx1();
		m.method3();


	}

}
