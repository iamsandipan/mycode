package com.interview.algorithms.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.interview.algorithms.models.comparator.NaturalComparator;

public class Box  extends Object implements Comparable<Box>{
	private int i ;
	public Box(int i){
		this.i = i;
	}
	public static void main(String [] args){
		List<Box> list = new ArrayList<Box>();
		for(int i = 0; i < 10; i++){
			Box b = new Box(i);
			list.add(b);
		}
		NaturalComparator<Box> natcomp = new NaturalComparator<Box>();
		System.out.println(list.size());
		Comparator<? super Object> y = null;
		//Arrays.sort(list.toArray(), natcomp);

	}
	@Override
	public int compareTo(Box o) {
		// TODO Auto-generated method stub
		if(this.i == o.i){
			return 0;
		}else if(this.i > o.i){
			return 1;
		}else{
			return -1;
		}
	}
	
	
	
}
