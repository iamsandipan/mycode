package com.interview.algorithms;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ParallelQuickSort extends Thread{
	final int MAX_THREADS = Runtime.getRuntime().availableProcessors();

	public static void main(String [] args){
		int arr[] = new int[] { 2,1,1,2,1,4,3,5,8,9,3};
		CountDownLatch latch = new CountDownLatch(2);
		ParallelQuickSort sort = new ParallelQuickSort(latch, arr, 0, arr.length);
		sort.start();
	}
	
    CountDownLatch doneSignal;
    static int num_threads = 1;

    int[] my_array;
    int start, end;

    public ParallelQuickSort(CountDownLatch doneSignal, int[] array, int start, int end) {
        this.my_array = array;
        this.start = start;
        this.end = end;
        this.doneSignal = doneSignal;
    }

    public static void reset() {
        num_threads = 1;
    }

    public void run() {
        quicksort(my_array, start, end);
        doneSignal.countDown();
        num_threads--;
    }

    public void quicksort(int[] array, int start, int end) {
        int len = end-start+1;

        if (len <= 1)
            return;

        int pivot_index = medianOfThree(array, start, end);
        int pivotValue = array[pivot_index];

        swap(array, pivot_index, end);

        int storeIndex = start;
        for (int i = start; i < end; i++) {
           if (array[i] <= pivotValue) {
               swap(array, i, storeIndex);
               storeIndex++;
           }
        }

        swap(array, storeIndex, end);

        if (num_threads < MAX_THREADS) {
            num_threads++;

            CountDownLatch completionSignal = new CountDownLatch(1);

            new ParallelQuickSort(completionSignal, array, start, storeIndex - 1).start();
            quicksort(array, storeIndex + 1, end);

            try {
                completionSignal.await(1000, TimeUnit.SECONDS);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        } else {
            quicksort(array, start, storeIndex - 1);
            quicksort(array, storeIndex + 1, end);
        }
    }
    
    public int medianOfThree(int [] arr, int start, int end){
    	return start + (end - start)/2;
    }
    
    public void swap(int [] arr, int i, int j){
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
}
