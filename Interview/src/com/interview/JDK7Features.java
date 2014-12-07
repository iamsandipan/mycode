package com.interview;

public class JDK7Features {
	
	
	public static void main(String [] args){
		stringInCaseStatement();
		literals();
	}

	private static void literals() {
		int index = 100_200;
		System.out.println(index);
	}
	
	private static void stringInCaseStatement() {
		String s = "L";
		switch(s){
			case "M" :
				System.out.println("Hello1");
			case "L":
				System.out.println("Hello");
		}
	}

}
