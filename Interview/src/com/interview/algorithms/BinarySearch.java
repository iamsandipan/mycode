package com.interview.algorithms;

public class BinarySearch {

	public static void main(String [] args){
		BinarySearch q = new BinarySearch();
		int arr[] = new int[] { 1,2,3,20,52,65};
		int j = q. binarySearchANumberWhichIsGreaterThanAGivenNumber(arr, 15, 0, arr.length -1 );
		System.out.println(arr);
	}
	
	private int binarySearch(int[] array, int value, int left, int right) {

	      if (left > right){
	            return -1;
	      }

	      int middle = (left + right) / 2;

	      if (array[middle] == value){
	            return middle;
	      }else if (array[middle] > value){
	            return binarySearch(array, value, left, middle - 1);
	      }else{
	            return binarySearch(array, value, middle + 1, right);  
	      }
	}
	
	private int binarySearchANumberWhichIsGreaterThanAGivenNumber(int[] array, int value, int left, int right) {

	      if (left > right){
	    	  	System.out.println("Left" + left);
	    	  	System.out.println("Right" + right);
	            return left;
	      }

	      int middle = (left + right) / 2;

	      if (array[middle] == value){
	            return middle;
	      }else if (array[middle] > value){
	            return binarySearchANumberWhichIsGreaterThanAGivenNumber(array, value, left, middle - 1);
	      }else{
	            return binarySearchANumberWhichIsGreaterThanAGivenNumber(array, value, middle + 1, right);  
	      }
	}

}
