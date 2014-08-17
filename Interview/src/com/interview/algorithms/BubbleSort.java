package com.interview.algorithms;

public class BubbleSort {
	public static void main(String [] args){
		BubbleSort q = new BubbleSort();
		int arr[] = new int[] { 2,1,1,2,1,4,3,5,8,9,3};
		q.bubbleSort(arr);
		
	}
	
	
	public void bubbleSort(int arr[]){
		
		for(int i = 0; i < arr.length; i++ ){
			for(int j = i; j <arr.length -1 ; j++ ){
				if(arr[j] > arr[j+1]){
					swap(arr, j, j+1);
				}
				for(int num : arr){
					System.out.print(num + ",");
				}
				System.out.println(" ");
				
			}
			
			System.out.println("#####");
			
		}
		
	}
	
	public void swap(int arr[], int i, int j ){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
