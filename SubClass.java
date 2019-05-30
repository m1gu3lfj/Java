package com.examples.java;

public class SubClass extends SuperClass {
	public char field3;

	public SubClass(int f1, String f2) {
		super(f1, f2);
	}
	
	//Overrides SuperClass method1()
	public void method1() {
		System.out.println("SubClass method1()");
	}
	
	public void method1bis() {
		super.method1();
	}
	
	public void method3(char c) {
		this.field3 = c;
		System.out.println(this.field3);
	}

	public static void main(String[] args) {
		//SuperClass object
		SuperClass oSuper = new SuperClass(1,"ABC");
		oSuper.method1(); //SuperClass method1()
		oSuper.method2(); //SuperClass method2() field1=1 field2=ABC
		
		//SubClass object
		SubClass oSub = new SubClass(2,"DEF");
		oSub.method1(); //SubClass method1()
		oSub.method1bis(); //SuperClass method1()
		oSub.method2(); //SuperClass method2() field1=2 field2=DEF
		oSub.method3('Z'); //Z
	}
}
