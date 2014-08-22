package com.interview.algorithms;

public class SmallestDivisor {

	
    /*
     * Compute r the square root of n
     * 
     * Initialize divisor d to 3;
     * 
     * While not an exact divisor and square root limit not reached 
     * do: generate next number in the odd sequence.
     * 
     * If the current odd value ‘d’ is an exact divisor 
     * then return it as the smallest divisor, 
     * else return 1 as the smallest divisor.
    
    */
	 public long getDivisor(long val){
		if(val%2 == 0){
			return 2;
		}
		long sqrt = (int)Math.sqrt(val);
		int divisor = 3;
		while(divisor <= sqrt){
			if(val % divisor  == 0){
				return divisor;
			}
			divisor += 2;
		}
		return 1;
	}
}
