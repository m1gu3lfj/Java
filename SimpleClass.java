package com.examples.java;

public class SimpleClass {
	public int field1; // field or instance variable
	public String field2; // field or instance variable
	public static int field3; //static field or class variable
	public static final double CTE = 0.0; //Constant

	//Constructor
	public SimpleClass() {
		this(0,"");
	}
	
	//Constructor with parameters
	public SimpleClass(int par1, String par2) {
		this.field1 = par1;
		this.field2 = par2;
	}
	
	//Class Method
	public void setField1(int f1) {
		this.field1 = f1;
	}
	
	//Overload Class Method
	public void setField1() {
		this.field1 = 0;
	}
	
	//Class Method
	public void setField2(String f2) {
		this.field2 = f2;
	}
	
	//Overload Class Method
	public void setField2() {
		this.field2 = "";
	}
	
	//Static Method
	public static void addField3() {
		field3++;
	}
	
	//Returning values
	public static int getField3() {
		return field3;
	}

	public static void main(String[] args) {
		//Creating objects
		SimpleClass object1 = new SimpleClass();
		SimpleClass object2 = new SimpleClass(1, "ABC");
				
		//Using objects
		System.out.println("object1.field1 = " + object1.field1); //object1.field1 = 0
		System.out.println("object1.field2 = " + object1.field2); //object1.field2 = 
		System.out.println("object2.field1 = " + object2.field1); //object2.field1 = 1
		System.out.println("object2.field2 = " + object2.field2); //object2.field2 = ABC
		object1.setField1(2);
		object1.setField2("XYZ");
		System.out.println("object1.field1 = " + object1.field1); //object1.field1 = 2
		System.out.println("object1.field2 = " + object1.field2); //object1.field2 = XYZ

		//Using class variables
		System.out.println("SimpleClass.field3 = " + SimpleClass.field3); //SimpleClass.field3 = 0
		SimpleClass.addField3();
		System.out.println("SimpleClass.field3 = " + SimpleClass.field3); //SimpleClass.field3 = 1
	}
}
