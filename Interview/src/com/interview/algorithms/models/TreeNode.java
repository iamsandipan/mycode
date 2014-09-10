package com.interview.algorithms.models;

public class TreeNode {
	private int value;
	private TreeNode left;
	private  TreeNode right;
	private boolean visited;

	public TreeNode(int value) {
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public TreeNode getUnvisitedNextNode(){
		
		if(this.left != null && this.left.visited == false){
			return this.left;
		}
		
		if((this.left == null) && (this.right != null) && this.right.visited == false){
			return this.right;
		}
		
		return null;
	}
	

}
