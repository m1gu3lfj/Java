package com.examples.java;

public class Operators {

	public Operators() {
	}

	public static void main(String[] args) {				
		//The Simple Assignment Operator
		System.out.println("Simple Assignment Operator:");
		int a = 3;
		int b = 2;
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println();
		
		//The Arithmetic Operators
		System.out.println("Arithmetic Operators:");
		int result = 0;
		result = a + b; // 5
		System.out.println("a + b = " + result);
		result = a - b; // 1
		System.out.println("a - b = " + result);
		result = a * b; // 6
		System.out.println("a * b = " + result);
		result = a / b; // 1
		System.out.println("a / b = " + result);
		result = a % b; // 1
		System.out.println("a % b = " + result);
		System.out.println();		
		
		//The Unary Operators
		System.out.println("Unary Operators:");
		result = +1; // 1
		System.out.println(result);
		result--; // 0
		System.out.println(result);
		result++; // 1
		System.out.println(result);
		result = -result; // -1
		System.out.println(result);

		boolean success = true; 
		System.out.println(success); // true
		System.out.println(!success); // false
        
		int i = 3;
		i++;
		System.out.println(i); // 4
		++i;			   
		System.out.println(i); // 5
		System.out.println(++i); // 6
		System.out.println(i++); // 6
		System.out.println(i); // 7
		System.out.println();
		
		//Equality, Relational, and Conditional Operators
		System.out.println("Equality and Relational Operators:");
		int va = 1;
		int va_ = 1;
		int vb = 2;
		if(va == va_)
			System.out.println("va == va_");
		if(va != vb)
			System.out.println("va != vb");
		if(vb > va)
			System.out.println("vb > va");
		if(va < vb)
			System.out.println("va < vb");
		if(va <= vb)
			System.out.println("va <= vc");
		if(vb >= va)
			System.out.println("vc >= va");
		System.out.println();
		
		System.out.println("Conditional Operators:");
		if((va == 1) && (vb == 2))
			System.out.println("va == 1 AND vc == 2");
		if((va == 1) || (vb == 1))
			System.out.println("va == 1 OR vc == 1");
		System.out.println();

		//Type Comparison Operator
		System.out.println("Type Comparison Operator:");		
		String s1 = "String1";
		boolean io = s1 instanceof String;
		System.out.println("s1 instanceof String \n" + io);
		System.out.println();
		
		//Bitwise and Bit Shift Operators
		System.out.println("Bitwise and Bit Shift Operators:");
		System.out.println(~1); // -2
		System.out.println(32 << 1); // 64
		System.out.println(32 >> 1); // 16
		System.out.println(32 >>> 1); // 16
		
		int val = 0xF;
		int bitmask = 0x1;
		System.out.println(val & bitmask); // 1
		System.out.println(val | bitmask); // 15
		System.out.println(val ^ bitmask); // 14
		System.out.println();
		
		//Ternary Operator
		System.out.println("Ternary Operator:");
		result = success ? va : vb;
		System.out.println("success ? va : vb \n" + result); //va
		result = !success ? va : vb;
		System.out.println("!success ? va : vb \n" + result); //vb		
		System.out.println();
	}
}
