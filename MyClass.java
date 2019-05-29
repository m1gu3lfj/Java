package com.examples.java;

public class MyClass implements MyInterface {
	public double field = CONSTANT;
	
	public MyClass() {
	}

	@Override
	public void method1(int a, String b) {
		System.out.println("a is " + a + ", b is " + b);
	}

	@Override
	public int method2(String s) {
		return s.length();
	}

	public static void main(String[] args) {
		MyClass object = new MyClass();
		object.method1(1, "ABC"); //a is 1, b is ABC
		int len = object.method2("1234567890");
		System.out.println("The length is: " + len); //The length is: 10
	}
}