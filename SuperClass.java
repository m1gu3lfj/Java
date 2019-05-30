package com.examples.java;

public class SuperClass {
	public int field1;
	public String field2;

	public SuperClass(int f1, String f2) {
		this.field1 = f1;
		this.field2 = f2;
	}
	
	public void method1() {
		System.out.println("SuperClass method1()");
	}
	
	public void method2() {
		System.out.printf("SuperClass method2() field1=%d field2=%s%n", this.field1, this.field2);
	}
}
