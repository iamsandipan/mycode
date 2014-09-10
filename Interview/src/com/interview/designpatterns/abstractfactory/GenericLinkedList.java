package com.interview.designpatterns.abstractfactory;

import java.lang.reflect.Array;
import java.util.List;

public class GenericLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int count;
	
	
	
	
	
	
	class Node<T>{
		private Node<T> prev ;
		private Node<T> next;
		private T val;
		public  Node(Node<T> prev, Node<T> next, T val){
			this.prev = prev;
			this.next = next;
			this.val = val;
		}
		
	}

}


class Box<T extends List<String>>{
	
	public static <T> T getBox2(T [] t){
		return null;
		
	}
	
	public void getBox(Box<? extends List<String>> t){
		
	}
	
	public void getBox1(Box<? extends List<String>> t){
		
	}
	
	public static <T> int count(T[] anArray, T elem) {
	    int cnt = 0;
	    for (T e : anArray)
	        if (e.equals(elem))
	            ++cnt;
	        return cnt;
	}
	
}


