package com.interview.algorithms.problems;

public class Fibonacci {

	public void fibonacci(){
		long tn = 1;
		long tn_1 = 1;
		int count = 1;
		System.out.println("Fibonacci start");
		System.out.print("" + tn + "," + tn_1);
		fibonacci(tn, tn_1, count);
		
	}


	private void fibonacci(long tn, long tn_1, int count) {
		if(count >= 50){
			return;
		}
		long tn_2 = tn + tn_1;
		System.out.print(", " + tn_2);
		count ++;
		fibonacci(tn_2, tn, count );
	}
}
