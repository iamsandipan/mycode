package com.interview.algorithms.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.interview.algorithms.QuickSort;


public class JavaInterviewQuestions {
		
		public static void main(String [] args){
			JavaInterviewQuestions q = new JavaInterviewQuestions();
			int [] nums = {1,2,4,6,7};
			System.out.println(q.isPalindrome("aba"));
			//q.matrixSearch();
		}
	
		
		
		
		public static String longestPalindrome1(String s) {
			int maxPalinLength = 0;
			String longestPalindrome = null;
			int length = s.length();
			// check all possible sub strings
			for (int i = 0; i < length; i++) {
				for (int j = i + 1; j < length; j++) {
					int len = j - i;
					String curr = s.substring(i, j + 1);
					System.out.println(curr);
					if (isPalindrome(curr)) {
						if (len > maxPalinLength) {
							longestPalindrome = curr;
							maxPalinLength = len;
						}
					}
				}
			}
		 
			return longestPalindrome;
		}
		 
		public static boolean isPalindrome(String s) {
			if(s == null){
				return false;
			}
			int i = 0;
			int j = s.length() - 1;
			int lastIndex = j;
			while(i < j){
				if (s.charAt(i) != s.charAt(lastIndex - i)) {
					return false;
				}
				i++;
				j--;
			}
			return true;
		}
		
		
		public void matrixSearch(){
			int [] []  sortedMatrix  = new int[][]{
					{1,2,3},
					{4,5,6},
			};
			
			Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
			int [] lastIndexNumbers = new int[sortedMatrix.length];
			//build array with boundaries
			int i = 0;
			for(int [] rows :  sortedMatrix){
				indexMap.put(i, rows[rows.length - 1]) ;
				lastIndexNumbers[i++] = rows[rows.length - 1];
			}
			
			int rowToSearch = findRow(lastIndexNumbers, 0, lastIndexNumbers.length, 4);
			int [] searchRow = sortedMatrix[rowToSearch];
			//return 
			//System.out.println(indexMap);
			
			
		}
		
		public int findRow(int [] numbers, int start, int end, int number){
			System.out.println("Start  : " + start + " End :  " + end);
			/*if (start >= end){
	            return start;
			}*/
			
			int index = start + (end - start)/2;
			
			if(numbers[index] <= number && numbers[index+1] >= number ){
				return number;
			}
			
			if(number > numbers[index] ){
				findRow(numbers, index + 1, end, number);
			}else if(number < numbers[index]){
				findRow(numbers, start, index , number);
			}
			
			return -1;
			
		}
		
		public int binarySearch(int [] numbers, int start, int end, int number){
			
			int index = start + (end - start)/2;
			
			if(numbers[index] == number){
				return number;
			}
			
			if(number > numbers[index] ){
				findRow(numbers, index + 1, end, number);
			}else if(number < numbers[index]){
				findRow(numbers, start, index , number);
			}
			
			return -1;
			
		}
		
		public int [] removeDuplicatesFromSortedArray(int [] array){
			
			//Input vlidations
			
			int [] newAray = new int[array.length];
			newAray[0] = array[0];
			int index = 0;
			for(int i = 1; i < array.length; i ++){
				if(array[i] == newAray[index]){
					continue;
				}else{
					index++;
					newAray[index] = array[i];
				}
			}
			
			return newAray;
		}
	

		public List<String> createSubStrings(String str){
			List<String> substrings = new ArrayList<String>();
			for(int i = 0; i < str.length(); i ++){
				String subStr = str.substring(i);
				substrings.add(subStr);
			}
			return substrings;
		}
		
		//O (n2)
		public int [] removeDuplicatesFromUnSortedArray(int [] array){
			
			//Input vlidations
			
			int [] newAray = new int[array.length];
			newAray[0] = array[0];
			int index = 0;
			for(int i = 1; i < array.length; i ++){
				if(isElementPresentInArray(newAray, array[i])){
					continue;
				}else{
					index++;
					newAray[index] = array[i];
				}
			}
			
			return newAray;
		}
		
		private boolean isElementPresentInArray(int [] array, int element){
			for(int i = 0; i < array.length; i ++){
				if(array[i] == element){
					return true;
				}else{
					continue;
				}
			}
			return false;
			
		}
		
		public int findMinSumInGraph(int [][] array){
			//Sort all rows first, then add the zeroth indexes
			/*	[
			     [2],
			    [3,4],array
			   [6,5,7],
			  [4,1,8,3]
			]*/
			int rowCount = array.length ;
			QuickSort q = new QuickSort();
			int sum = 0;
			for(int i = 0; i < rowCount   ; i++ ){
				q.quickSort(array[i], 0, array[i].length -1);
				sum += array[i][0];
			}
			
			return sum;
		}
		
		public int  findLongestSubstring(String str){
			//Assuming ony abcd are present
			int charSeqDeterminer = Math.max(26, str.length());
			char [] charSeq = new char[charSeqDeterminer];
			int length = 1;
			int maxLength = 1;
			charSeq[0] = str.charAt(0);
			for(int i = 1; i < str.length(); i ++){
				char nextChar = str.charAt(i);
				boolean isCharPresentInArray = findCharInCurrentSeq(charSeq, nextChar);
				if(isCharPresentInArray){
					if(length > maxLength  ){
						maxLength = length;
					}
					length = 1;
					charSeq = new char[charSeqDeterminer];
				}else{
					length++;
					charSeq[length - 1] = nextChar; 
					
				}
				
			}
			
			if(length > maxLength  ){
				maxLength = length;
			}
			return maxLength;
		}
		///Improve by binary search
		
		public boolean findCharInCurrentSeq(char[] str, char ch){
			for(int i = 0; i < str.length ; i++){
				if(ch == str[i]){
					return true;
				}
			}
			return false;
		}
		
		public List<Integer []> findSumN(int [] array, int desiredNumber){
			
			//Quicksort the array
			QuickSort q = new QuickSort();
			q.quickSort(array, 0, array.length - 1);
			List<Integer []> subArray = new ArrayList<Integer []>();
			int count = 0;
			for(int i = 0; i < array.length; i++){
				for(int j = i + 1; j < array.length ; j++){
					for(int k = i + 2; k < array.length ; k++){
						System.out.println( "Count" + ++count);
						int sum = array[i] + array[j] + array[k];
						if(sum == desiredNumber){
							System.out.println( array[i] + " : " + array[j] + " : " + array[k]);
						}
						if(sum > desiredNumber){
							break;
						}
					}
				}
			}
			
			return subArray;
		}
}
