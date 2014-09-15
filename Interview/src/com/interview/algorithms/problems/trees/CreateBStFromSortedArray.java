package com.interview.algorithms.problems.trees;

import java.util.Deque;
import java.util.LinkedList;

import com.interview.algorithms.models.TreeNode;

public class CreateBStFromSortedArray {

	public TreeNode createBst(int[] array, int start, int end) {
		if(array.length == 0){
			return null;
		}
		if(start > end){
			return  null;
		}
		int mid = start + (end - start) / 2;
		TreeNode newNode = new TreeNode(array[mid]);
		newNode.setRight(createBst(array, mid + 1, end));
		newNode.setLeft(createBst(array, start, mid - 1));
		return newNode;
	}
	
	public static void main(String [] args){
		int [] arrray = {1,2,3,4,5,6,7};
		CreateBStFromSortedArray bst = new CreateBStFromSortedArray();
		TreeNode node = bst.createBst(arrray, 0 , 6);
		//System.out.println(bst.findTreeHeight(node) + "SSSS");
		bst.traverseBtree1(node);
		
	}
	
	public int findTreeHeight(TreeNode node){
		if(node == null){
			return 0;
		}
		return 1 + Math.max(findTreeHeight(node.getLeft()) , findTreeHeight(node.getRight())); 
	}
	
	public void traverseBTree(TreeNode p){
		if(p != null){
			traverseBTree(p.getRight());
			traverseBTree(p.getLeft());
		}
	}
	
	
	public void traverseBtree1(TreeNode root){
		int count = 0;
		
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		stack.add(root);
		while(!stack.isEmpty()){
			count ++;
			TreeNode visitingNode = stack.removeFirst();
			visitingNode.setVisited(true);
			//System.out.println(visitingNode.getValue());
			TreeNode rightNode = visitingNode.getRight();
			if((rightNode != null ) && (!rightNode.isVisited())){
				stack.addLast(visitingNode.getRight());
			}
			
			TreeNode leftNode = visitingNode.getLeft();
			if((leftNode != null)&& (!leftNode.isVisited())){
				stack.addLast(visitingNode.getLeft());
			}
		}
		System.out.println("Count of Nodes " + count);
	}
	

}
