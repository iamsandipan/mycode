package com.interview.algorithms;

public class QuickSort {

	public static void main(String [] args){
		QuickSort q = new QuickSort();
		int arr[] = new int[] { 1,2,1};
		q.quickSort(arr, 0, arr.length -1 );
		System.out.println(arr);
	}
	
	private int partition(int arr[], int left, int right)

	{

		int i = left, j = right;

		int tmp;

		int pivot = arr[(left + right) / 2];

		while (i <= j) {

			while (arr[i] < pivot){
				i++;
			}

			while (arr[j] > pivot){
				j--;
			}

			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}

		}
		return i;

	}

	private void quickSort(int arr[], int left, int right) {

		int index = partition(arr, left, right);

		if (left < index - 1){

			quickSort(arr, left, index - 1);
		}

		if (index < right){

			quickSort(arr, index, right);
		}
		System.out.println("Index is " + index);
	}
}