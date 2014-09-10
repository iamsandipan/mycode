package com.interview.algorithms.queues;

public class Stack<T> {
	
	public static void main(String [] args){
		Stack<Integer> integerStack = new  Stack<Integer>();
		integerStack.push(10);
		integerStack.push(11);
		integerStack.push(12);
		System.out.println(integerStack.isEmpty());
		System.out.println(integerStack.pop());
		System.out.println(integerStack.pop());
		System.out.println(integerStack.pop());
		System.out.println(integerStack.pop());
		System.out.println(integerStack.isEmpty());
	}
	
	
	private int count;
	
	private StackNode<T> top;

	public void push(T t){
		StackNode<T> nectStackNode = new StackNode<T>(top, t);
		top = nectStackNode;
		count++;
	}
	
	public T pop(){
		if(isEmpty()){
			return null;
		}
		StackNode<T> nectStackNode = top; 
		top = top.getStackNode();
		count--;
		return nectStackNode.getValue();
	}
	
	
	public boolean isEmpty(){
		return (count <= 0);
	}

}
final class StackNode<T>{
	private StackNode<T> nectStackNode;
	private T value;
	public StackNode(StackNode<T> nextNode, T val){
		this.value = val;
		this.nectStackNode = nextNode;
	}
	
	public StackNode<T> getStackNode(){
		return nectStackNode;
	}
	
	public T getValue(){
		return value;
	}
}