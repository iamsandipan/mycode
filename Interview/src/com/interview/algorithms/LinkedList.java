package com.interview.algorithms;

public class LinkedList<T> {
	private LinkedListNode<T> headNode;
	private int count;
	public LinkedList(){
		
	}
	
	public static void main(String [] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.printList();
		//list.removeNode();
		list.printList();
		System.out.println("Size of list " + list.size());
		LinkedList<Integer> revlist = reverseList(list);
		revlist.printList();
	}

	private static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
		LinkedList<Integer> revlist = new LinkedList<Integer>();
		while(!list.isEmpty()){
			Integer node = list.removeNode();
			revlist.addNode(node);
		}
		return revlist;
	}
	
	public boolean isEmpty(){
		return count == 0;
	}
	
	public int size(){
		return count;
	}
	
	public T removeNode(){
		
		if(headNode == null){
			return null;
		}
		count--;
		LinkedListNode<T> tempNode = headNode;
		headNode = headNode.getNextNode();
		return tempNode.getValue();
	}
	
	
	public void addNode(T t){
		LinkedListNode<T> node = new LinkedListNode<T>(t);
		count++;
		if(headNode == null){
			headNode = node;
			return;
		}
		node.setNextNode(headNode);
		headNode = node;
	}
	
	public void printList(){
		LinkedListNode<T> nextNode = headNode;
		while(nextNode != null){
			System.out.println(nextNode.getValue());
			nextNode = nextNode.getNextNode();
			
		}
	}
	
}


class LinkedListNode<T>{
	private LinkedListNode<T> nextNode;
	private T t;
	public LinkedListNode(T t){
		this.t = t;
	}
	
	public void setNextNode(LinkedListNode<T> nextNode){
		this.nextNode = nextNode;
	}
	
	public LinkedListNode<T> getNextNode(){
		return this.nextNode;
	}
	
	public T getValue(){
		return t;
	}
	
}