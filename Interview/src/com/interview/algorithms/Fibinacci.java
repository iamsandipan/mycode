package com.interview.algorithms;

public class Fibinacci {
	boolean isFibonacci ;
	boolean isGp ;
	boolean isAp ;
	
	public static void main(String [] args){
		int i;
		
		Fibinacci q = new Fibinacci();
		
		int j = q. fibonacci(2, 3, 0, 5);

	}
	
	
	public void testSeries(int [] arr){
		//input validations
		 if(arr.length == 0 ){
			 return;
		 }
		
		
		 isFibonacci = true;
		 isGp = true;
		 isAp = true;
		
		
		
		for(int index = 0; index < arr.length; index++){
			int firsNum = arr[0];
			int secondNum = arr[1];
			int thirdNum = arr[2];
			if(isFibonacci){
				int nectNumFib = fibonacci(firsNum, secondNum, 0, arr.length);
				isFibonacci = (nectNumFib == thirdNum);
			}
			
			if(isGp){
				int nectNumGP = geomProgresion(firsNum, secondNum, 0, arr.length);
				
				isGp = (nectNumGP == thirdNum);
			}

			if(isAp){
				int nextNumAP = arithmaticProgresion(firsNum, secondNum, 0, arr.length);
				isAp = (nextNumAP == thirdNum);
			}

		}
		
		
		
	}
	
	public int geomProgresion(int firstNum, int secondNum, int count, int limit){
		if(count > limit){
			return -1;
		}
		
		int nextNum =  (secondNum*secondNum/firstNum)   ; 
		System.out.print(nextNum + ",");
		count ++;
		return arithmaticProgresion(secondNum, nextNum, count, limit);
	}
	
	
	/*
	 * @param firstNum First number
	 * @param secondNum 
	 * @param count
	 * @param  the max number of numbers o be printed
	 * 
	 * @return int the next number
	 * 
	 */
	
	public int fibonacci(int firstNum, int secondNum, int count, int limit){
		if(count > limit){
			return -1;
		}
		int nextNum = firstNum + secondNum;
		System.out.print(nextNum + ",");
		count ++;
		return fibonacci(secondNum, nextNum, count, limit);
	}
	
	public int arithmaticProgresion(int firstNum, int secondNum, int count, int limit){
		if(count > limit){
			return -1;
		}
		
		int nextNum =  2*secondNum - firstNum  ; 
		System.out.print(nextNum + ",");
		count ++;
		return arithmaticProgresion(secondNum, nextNum, count, limit);
	}
}
