package com.interview.algorithms.problems.trees;

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

}
