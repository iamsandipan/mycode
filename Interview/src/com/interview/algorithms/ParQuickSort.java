package com.interview.algorithms;

import java.util.ArrayList;
import java.util.List;

public class ParQuickSort {

	public static void main(String [] args){
		ParQuickSort q = new ParQuickSort();
		int arr[] = new int[] { 1,2,1};
		q.quickSort(arr, 0, arr.length -1 );
		System.out.println(arr);
	}
	
	private List<Range> partition(int arr[], Range range)

	{
		List<Range> ranges = new ArrayList<Range>();
		int i = range.getI(), j = range.getJ();

		int tmp;

		int pivot = arr[(range.getI() + range.getJ()) / 2];

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
		Range r1 = new Range(range.getI(), i);
		Range r2 = new Range(i, range.getJ());
		ranges.add(r1);
		ranges.add(r2);
		
		
		return ranges;

	}

	private void quickSort(int arr[], int left, int right) {

		List<Range> ranges = new ArrayList<Range>();
		ranges.add(new Range(left, right));
		
		for(;;){
			Range r = ranges.get(0);
			ranges.remove(0);
			List<Range> ranges1 =  partition(arr, r);
			if(ranges1.size() != 0){
				ranges.addAll(ranges1);
			}
			if(ranges.size() == 0){
				break;
			}
			
			
		}
		
	}
}