package com.interview.algorithms.problems;

import java.util.StringTokenizer;

public class FindLargestSequenceinString {
		public static void main(String[] args){
			FindLargestSequenceinString lsr = new FindLargestSequenceinString();
			System.out.println("Index is " + lsr.findLargestSequenceIndex("aaaabbbbbcccccc"));
			
		}
		
		
		private int findLargestSequenceIndexUsingToenizer(String inputStr){
			StringTokenizer strtok = new StringTokenizer(inputStr, "c");
			while(strtok.hasMoreTokens() ){
				System.out.println(strtok.nextToken());
			}
			return 0;
		}
		
		
		private int findLargestSequenceIndex(String inputStr){
			char maxBucketChar = inputStr.charAt(0);
			int maxCount = 1;
			char bucketChar = inputStr.charAt(0);
			int charCount = 1;
			int maxSeqIndex = 0;
			
			for(int i = 1 ; i < inputStr.length(); i++){
				char nextChar = inputStr.charAt(i);
				
				if(nextChar == bucketChar){
					charCount ++;
					System.out.println("Char Count is " + charCount);
				}else{
					if(charCount > maxCount){
						maxCount = charCount;
						maxBucketChar = bucketChar;
						maxSeqIndex = i -  charCount;
					}
					charCount = 1;
				}
				bucketChar = nextChar;
			}
			if(charCount > maxCount){
				maxCount = charCount;
				maxBucketChar = bucketChar;
				maxSeqIndex = inputStr.length() -  charCount;
			}

			
			return maxSeqIndex;
		}
}
