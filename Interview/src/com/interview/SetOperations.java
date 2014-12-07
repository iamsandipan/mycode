package com.interview;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String [] args){
		Set <Integer> set1 = new HashSet<Integer>();
		createSet1(set1);
		
		Set <Integer> set2 = new HashSet<Integer>();
		createSet2(set2);

		
		//Do intersection
		set1.retainAll(set2);
		System.out.println(set1);
		
		set1.clear();set2.clear();
		createSet1(set1);
		createSet2(set2);

		//Do union
		set1.addAll(set2);
		System.out.println(set1);
		
	}

	private static void createSet2(Set<Integer> set2) {
		set2.add(1);
		set2.add(3);
	}

	private static void createSet1(Set<Integer> set1) {
		set1.add(1);
		set1.add(2);
	}
   
}
