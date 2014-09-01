package com.interview.algorithms.problems;

public class ReverseAString {

	public static void main(String[] args){
		ReverseAString lsr = new ReverseAString();
		System.out.println("Index is " + lsr.reverse("abcd"));
	}

	public String reverse(String s){
		StringBuilder reverse = new StringBuilder();
		for(int i = s.length() - 1 ; i >= 0; i --){
			reverse.append(s.charAt(i));
		}
		return reverse.toString();
	}
}
