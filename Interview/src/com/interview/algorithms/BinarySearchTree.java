package com.interview.algorithms;

import java.util.Stack;

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

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(10);
		tree.insert(11);
		tree.insert(9);
		tree.printPreorder();
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

	private TreeNode findMinElementInABSTFromRootNode(TreeNode rooTNode) {
		TreeNode leftNode = rooTNode.getLeft();
		if (leftNode != null) {
			// Do recursively traverse the Tree
			return findMinElementInABSTFromRootNode(leftNode);
		} else {
			return rooTNode;
		}
	}

	private TreeNode findKthMinElementInABSTFromRootNode(TreeNode rooTNode) {
		Stack<TreeNode> stackOfNodes = new Stack<TreeNode>();
		Stack<TreeNode> poppedOfNodes = new Stack<TreeNode>();
		int counter = 0;

		stackOfNodes.push(rooTNode);

		while (!stackOfNodes.isEmpty()) {
			TreeNode treenode = stackOfNodes.peek();
			treenode.setVisited(true);
			TreeNode leftNode = treenode.getLeft();

			if (leftNode != null && leftNode.getLeft().isVisited() == false) {
				stackOfNodes.push(leftNode);

			} else  {
				TreeNode rightNode = treenode.getRight();
				
				if (rightNode != null && rightNode.getRight().isVisited() == false) {
					stackOfNodes.push(rightNode);
				}
				stackOfNodes.pop();
				counter++;
			}

			
		}
		return null;

	}
}
