package com.examples.java;

public class ControlFlowStatements {

	public ControlFlowStatements() {
	}

	public static void main(String[] args) {
		int var1 = 1;
		int var2 = 2;
		
		//The if-then Statement
		if (var1 == 1) {
			System.out.println("if block");
		}
		
		//The if-then-else Statement
		if (var2 == 1) {
			System.out.println("if block");
		}
		else {
			System.out.println("else block");
		}
		
		//The switch Statement
		int monthId = 10;
		String month = "";
		switch (monthId) {
			case 1:  month = "January"; break;
			case 2:  month = "February"; break;
			case 3:  month = "March"; break;
			case 4:  month = "April"; break;
			case 5:  month = "May"; break;
			case 6:  month = "June"; break;
			case 7:  month = "July"; break;
			case 8:  month = "August"; break;
			case 9:  month = "September"; break;
			case 10: month = "October"; break;
			case 11: month = "November"; break;
			case 12: month = "December"; break;
			default: month = "Invalid month"; break;
		}
		System.out.println("Month: " + month);
		
		//The while and do-while Statements
		while (var1 < 5) {
			System.out.println("while [" + var1 + "]");
			var1++;
		}
		
		do {
			System.out.println("do while [" + var2 + "]");
			var2++;
		} while (var2 < 5);
		
		//The for Statement
		for (int i = 0; i < 10; i++) {
			System.out.println("for [" + i + "]");
		}
		
		//The continue and break Statements
		int var = 0;
		while (var <= 10) {
			var++;
			System.out.println("begin loop [" + var + "]");
			if (var == 5) continue; 
			if (var == 6) break;
			System.out.println("end loop [" + var + "]");			
		}		
	}
}
