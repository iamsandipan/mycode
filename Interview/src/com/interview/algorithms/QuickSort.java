package com.interview.algorithms;

public class QuickSort {

	public static void main(String [] args){
		QuickSort q = new QuickSort();
		int arr[] = new int[] {1,2,4,3,5,9,8,15,12,10,11};
		q.quickSortFinkKthSmallest(arr, 0, arr.length -1,2 );
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");

		}
	}
	
	private int partition(int arr[], int left, int right)

	{
		
		int pivot = arr[(left + right) / 2];

		while (left < right) {

			while (isPivotMore(arr, left, pivot)){
				left++;
			}

			while (isPivotLess(arr, right, pivot)){
				right--;
			}

			if (left <= right) {
				swap(arr , left, right);
				left++;
				right--;
				
			}

		}
		return left;

	}
	
	public void swap(int [] arr, int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		
	}

	private boolean isPivotLess(int[] arr, int j, int pivot) {
		return arr[j] > pivot;
	}

	private boolean isPivotMore(int[] arr, int i, int pivot) {
		return arr[i] < pivot;
	}

	public void quickSort(int arr[], int left, int right) {
		
		
		int index = partition(arr, left, right);

		if (left < index - 1){
			quickSort(arr, left, index - 1);
		}

		if (index < right){
			quickSort(arr, index, right);
		}
		System.out.println("Index is " + index);
	}
	
	private void quickSortFinkKthSmallest(int arr[], int left, int right, int k) {
		int index = partition(arr, left, right);
		if(k > left && k < right){
			if (left < index - 1 ){
				quickSort(arr, left, index - 1);
			}
	
			if (index < right){
				quickSort(arr, index, right);
			}
		}
		System.out.println("Index is " + index);
	}

}