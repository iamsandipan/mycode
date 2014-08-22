package com.interview.algorithms;

public class SquareRoot {
	private double PRECISION = 0.0001;
	public double sqrt(double val){
		return recurse(val, val/2, 1.0);
	}

	private double recurse(double val, double half, double pres) {
		if(pres < PRECISION  ){
			return half;
		}
		pres = pres/10;
		double half1 = recurseUppre(val, half);
		half1 = recurseLower(val, half1);
		return recurse(val, half, pres);
	}

	private double recurseUppre(double val, double half) {
		if(half*half > val){
			half -= 1;
			return recurseUppre(val, half);
		}
		return half;
	}
	
	private double recurseLower(double val, double half) {
		if(half*half < val){
			half += 0.1;
			return recurseLower(val, half);
		}
		return half;
	}
	
}

