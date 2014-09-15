package com.interview.designpatterns.singleton;

public class ThreadSafeSingleTon {

	private ThreadSafeSingleTon(){};
	private static ThreadSafeSingleTon singleTon;
	private void swap(int[] a){
		//a[0] = 7, a[1] = 8
		a[0] = a[0] + a[1];  //a[0] = 15  
		a[1] = a[0] - a[1];  //a[1] = 15 -8 = 7
		a[0] = a[0] - a[1];  //a[0] = 15 -7 = 8 
	}
	
	void findLargestSeq(int [] arr){
		long largestSum = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 1; j < arr.length; j ++){
				//
				int sum = 0;
				for(int k = i; k <= j; k ++){
					 sum += arr[k] ;
				}
				largestSum = Math.max(sum , largestSum);
			}
		}
		
		
	}

	public static ThreadSafeSingleTon getInstance(){
		
		if(singleTon == null){
			synchronized(ThreadSafeSingleTon.class){
				if(singleTon == null){
					System.out.println("One");
					singleTon = new ThreadSafeSingleTon();
				}
			}
		}
		return singleTon;
	}
	
	public static void main(String [] args){
		ThreadSafeSingleTon singleton;
		for(int i = 0 ; i < 1000; i ++){
				singleton =  ThreadSafeSingleTon.getInstance();
		}
		
		
	}
	
}
