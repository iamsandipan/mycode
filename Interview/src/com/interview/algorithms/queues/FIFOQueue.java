package com.interview.algorithms.queues;

import java.util.Comparator;

public class FIFOQueue<T> {
	public static void main(String [] args){
		FIFOQueue<Integer> integerStack = new  FIFOQueue<Integer>();
		integerStack.enqueue(10);
		integerStack.enqueue(11);
		integerStack.enqueue(12);
		integerStack.enqueue(13);
		System.out.println(integerStack.getSize());
		System.out.println(integerStack.dequeue());
		System.out.println(integerStack.dequeue());
		System.out.println(integerStack.dequeue());
		System.out.println(integerStack.dequeue());
		System.out.println(integerStack.getSize());

	}
	private FifoNode<T> minQueueHead;
	private FifoNode<T> head;
	private FifoNode<T> end;
	private int count;
	public T dequeue(){
		FifoNode<T> newNode = head;
		head = newNode.getNext();
		count--;
		return newNode.getValue();
		
	}
	
	
	private int enqueueMinStack(T t ){
		
		FifoNode<T> newNode = new FifoNode<T>(null, null, t);
		if(minQueueHead == null){
			minQueueHead = newNode;
		}else{

		}

		return count;
	}

	
	
	public int enqueue(T t ){
		
		FifoNode<T> newNode = new FifoNode<T>(end, null, t);
		if(end != null){
			end.setNext(newNode);
		}
		end = newNode;
		if(count <= 0){
			head = newNode;
		}
		count++;
		return count;
	}
	
	public boolean isEmpty(){
		return count <= 0;
	}
	
	public int getSize() {
		return count;
	}
}


final class FifoNode<T>{
	private FifoNode<T> prev;
	private FifoNode<T> next;
	private T value;
	
	public FifoNode(FifoNode<T> prev, FifoNode<T> next, T value){
		this.prev = prev;
		this.next = next;
		this.value = value;
	}
	
	public FifoNode<T> getPrev(){
		return this.prev;
	}
	
	public FifoNode<T> getNext(){
		return this.next;
	}

	public void setNext(FifoNode<T>  next){
		this.next = next;
	}

	public void setPrev(FifoNode<T>  prev){
		this.prev = prev;
	}

	public T getValue(){
		return value;
	}
	
	
}

