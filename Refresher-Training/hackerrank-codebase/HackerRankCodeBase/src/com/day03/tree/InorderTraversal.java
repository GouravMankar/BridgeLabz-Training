package com.day03.tree;

import java.util.Stack;

public class InorderTraversal {

	public static void inorder(Node root) {
		if (root==null) {
			return ;
		}
		Stack<Node>nodes=new Stack<>();
		Node currentNode=root;
		while (currentNode!=null||!nodes.isEmpty()) {
			while(currentNode!=null) {
				nodes.push(currentNode);
				currentNode=currentNode.left;
			}
			currentNode=nodes.pop();
			System.out.println(currentNode.data+" ");
			currentNode=currentNode.right;
			
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

	    inorder(root);

	}

}
