package com.day03.tree;

import java.util.Stack;

public class PreorderTraversal {

	public static void preOrder(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> nodes = new Stack<>();
		nodes.push(root);
		while (!nodes.isEmpty()) {
			Node currentNode = nodes.pop();
			System.out.println(currentNode.data + " ");

			if (currentNode.right != null) {
				nodes.push(currentNode.right);
			}
			
			if (currentNode.left != null) {
				nodes.push(currentNode.left);
			}
			

		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);

	    root.left = new Node(2);
	    root.right = new Node(3);

	    root.left.left = new Node(4);
	    root.left.right = new Node(5);

	    root.right.left = new Node(6);
	    root.right.right = new Node(7);

	    System.out.println("Preorder Traversal:");

	    preOrder(root);

	}

}
