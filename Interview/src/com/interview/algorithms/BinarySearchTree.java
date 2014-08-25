package com.interview.algorithms;

import com.interview.algorithms.models.TreeNode;

public class BinarySearchTree {
	public TreeNode root;

	public void insert(int value) {
		TreeNode node = new TreeNode(value);

		if (root == null) {
			root = node;
			return;
		}
		insertRec(root, node);
	}

	private void insertRec(TreeNode latestRoot, TreeNode node) {
		if (latestRoot.getValue() > node.getValue()) {
			if (latestRoot.getLeft() == null) {
				latestRoot.setLeft(node);
				return;
			} else {
				insertRec(latestRoot.getLeft(), node);
			}
		} else {
			if (latestRoot.getRight() == null) {
				latestRoot.setRight(node);
				return;
			} else {
				insertRec(latestRoot.getRight(), node);
			}
		}
	}
	
	public static void main(String [] args){
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(10);
		tree.insert(11);
		tree.insert(9);
		tree.printPreorder() ;
		tree.printPostorder();
	}
	
	public void printPreorder() {
		  printPreOrderRec(root);
		  System.out.println("");
	}
		
	public void printPostorder() {
		 printPostOrderRec(root);
		 System.out.println("");
	}
		/**
		 * Helper method to recursively print the contents in a Preorder way
		 */
	private void printPreOrderRec(TreeNode currRoot) {
		  if (currRoot == null) {
		    return;
		  }
		  System.out.print(currRoot.getValue() + ", ");
		  printPreOrderRec(currRoot.getLeft());
		  printPreOrderRec(currRoot.getRight());
	}
	

	private void printPostOrderRec(TreeNode currRoot) {
	  if (currRoot == null) {
		    return;
		  }
		  printPostOrderRec(currRoot.getLeft());
		  printPostOrderRec(currRoot.getRight());
		  System.out.print(currRoot.getValue() + ", ");
	}


}

