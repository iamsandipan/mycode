package com.interview.algorithms.problems;

public class JavaFundamentls {
	public static void main(String [] args){
		JavaFundamentls fund = new JavaFundamentls();
		fund.rightShift(16);
		fund.rightShift(-16);
		fund.unsignedRightShift(-16);
		
		fund.leftShift(16);
	}
	
	
	
	
	public void rightShift(int i){
		 System.out.println(i>>1);
	}
	public void leftShift(int i){
		 System.out.println(i<<1);
	}
	
	public void unsignedRightShift(int i){
		 System.out.println(i>>>1);
	}

}
