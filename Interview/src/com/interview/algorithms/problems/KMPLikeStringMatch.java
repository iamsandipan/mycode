package com.interview.algorithms.problems;

import java.util.ArrayList;
import java.util.List;

public class KMPLikeStringMatch {

	public static void main(String[] args){
		
		KMPLikeStringMatch matchString = new KMPLikeStringMatch();
		matchString.match("abcabfffrdabab", "ab");
		
	}
	
	
	public void match(String str, String pattern){
		int k = 0;
		List<Integer> matchingIndex = new ArrayList<Integer>();
		
		int paternLength = pattern.length();
		
		for(int i = 0; i < str.length(); i ++){
			char ch = str.charAt(i);
			for(int j = 0; j < pattern.length(); j ++ ){
				char patch = pattern.charAt(j);
				if(ch != patch){
					if(j == paternLength -1){
						matchingIndex.add(i);
					}
					break;
				}
				System.out.println("Hello");
			}
			System.out.println("Outerloop");
		}
		
		for(int i :  matchingIndex){
			System.out.println(i);
			
		}
		
	}
	
}
