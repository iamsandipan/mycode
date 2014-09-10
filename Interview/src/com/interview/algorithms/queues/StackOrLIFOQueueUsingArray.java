package com.interview.algorithms.queues;

import java.util.Arrays;


public class StackOrLIFOQueueUsingArray<T> {
	private int limit = 1; 
	private T [] array = (T[]) new Object[limit];
	private int endIndex = -1;
	public static void main(String [] args){
		StackOrLIFOQueueUsingArray<Integer> fifo = new StackOrLIFOQueueUsingArray<Integer>();

		fifo.push(10);
		fifo.push(11);
		fifo.push(12);
		System.out.println(fifo.pop());
		System.out.println(fifo.pop());
		System.out.println(fifo.pop());

	}
	
	private void push(T t ){
		endIndex++;
		if(endIndex == limit){
			limit = 2*endIndex;
			array = (T[])Arrays.copyOf(array, limit);
		}
		array[endIndex] = t;
	}
	
	private T pop(){
		T t =  array[endIndex] ;
		array[endIndex] = null;
		if(endIndex < limit/2){
			limit = limit/2;
			array = (T[])Arrays.copyOf(array, limit/2);
		}
		endIndex--;
		return t;
	}

}
