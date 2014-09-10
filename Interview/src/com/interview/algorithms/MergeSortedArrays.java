package com.interview.algorithms;

public class MergeSortedArrays<T extends Comparable<T>> {

	public static void main(String[] args){
		Integer [] a = new Integer [10];
		Integer [] b = new Integer [5];
		Integer [] c = new Integer [15];

		MergeSortedArrays.mergeArrays(a, b, c );
		
	}
	
	public static <T extends Comparable<T>> void mergeArrays(T [] a, T [] b, T [] merged){

		int minLength = Math.min(a.length, b.length);
		int k = 0;
		int insertPos = 0;
		for(int i = 0; i<minLength; i++){
			
			if(a[i].equals(b[k])){
				merged[insertPos] = a[i];
				merged[insertPos + 1] = a[i];
				insertPos = insertPos + 2;
				k++;
			}else if(a[i].compareTo(b[k]) > 1){
				merged[i] = b[k];
				i = i -1;
				k++;
			}else{
				merged[i] = a[i];
			}
		}
		
		if(a.length > b.length){
			int moretoGo = b.length - a.length;
			
			
		}else if (a.length < b.length){
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
}
