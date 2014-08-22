package com.interview.algorithms;

public class BinarySearch {

	public static void main(String [] args){
		BinarySearch q = new BinarySearch();
		int arr[] = new int[] { 1,2,3,20,52,65};
		int j = q.binarySearch(arr, 52, 0, arr.length -1 );
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
}
