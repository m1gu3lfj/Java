package com.examples.java;

public class Primitives {

	public Primitives() {
	}

	public static void main(String[] args) {
		//Default Values
		System.out.println("Default Values:");
		byte vd1 = 0;       System.out.println(vd1);
		short vd2 =	0;      System.out.println(vd2);
		int vd3 = 0;        System.out.println(vd3);
		long vd4 = 0L;      System.out.println(vd4);
		float vf1 = 0.0f;   System.out.println(vf1);
		double vf2 = 0.0d;  System.out.println(vf2);
		char vc = '\u0000'; System.out.println(vc);
		String vs = null;   System.out.println(vs);
		boolean	vb = false; System.out.println(vb);
		System.out.println();
		
		//Literals
		System.out.println("Literals:");
		boolean result = true; System.out.println(result);	
		char capitalC = 'C';   System.out.println(capitalC);
		byte b = 100;          System.out.println(b); 
		short s = 10000;       System.out.println(s);
		int i = 100000;        System.out.println(i);
		System.out.println();
		
		//Integer Literals
		System.out.println("Integer Literals:");
		int decVal = 26;       System.out.println(decVal);
		int hexVal = 0x1a;     System.out.println(hexVal);
		int binVal = 0b11010;  System.out.println(binVal);
		System.out.println();
		
		//Floating-Point Literals
		System.out.println("Floating-Point Literals:");
		double d1 = 123.4;     System.out.println(d1);
		double d2 = 1.234e2;   System.out.println(d2);
		float f1  = 123.4f;    System.out.println(f1);
		System.out.println();
		
		//Character and String Literals
		System.out.println("Character and String Literals:");
		char circumflexC = '\u0108';                 System.out.println(circumflexC);
		String s1 = "S\u00ED Se\u00F1or";            System.out.println(s1);
		String escapes = "\b \t \n \f \r \" \' \\";  System.out.println(escapes);
		System.out.println();
		
		//Using Underscore Characters in Numeric Literals
		System.out.println("Using Underscore Characters in Numeric Literals:");
		long creditCardNumber = 1234_5678_9012_3456L;        System.out.println(creditCardNumber);
		long socialSecurityNumber = 999_99_9999L;            System.out.println(socialSecurityNumber); 
		float pi =  3.14_15F;                                System.out.println(pi);  
		long hexBytes = 0xFF_EC_DE_5E;                       System.out.println(hexBytes);
		long hexWords = 0xCAFE_BABE;                         System.out.println(hexWords); 
		long maxLong = 0x7fff_ffff_ffff_ffffL;               System.out.println(maxLong); 
		byte nybbles = 0b0010_0101;                          System.out.println(nybbles);
		long bytes = 0b11010010_01101001_10010100_10010010;  System.out.println(bytes);
		System.out.println();
	}
}
