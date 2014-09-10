package com.interview.algorithms.problems.trees;

import com.interview.algorithms.models.TreeNode;

public class FindHeightOfTree {
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node3 = new TreeNode(2);
		node1.setRight(node2);
		node1.setLeft(node3);
		node3.setRight(node4);
		System.out.println(isBalanced(node1));
		System.out.println(minDepth(node1));

	}

	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
	}

	public static int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.min(minDepth(root.getLeft()), minDepth(root.getRight()));
	}

	public static boolean isBalanced(TreeNode root) {
		return (maxDepth(root) - minDepth(root) <= 1);
	}
}
