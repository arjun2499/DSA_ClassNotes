package com.demo.Beans;

public class BinarySearchTree {
	class Node{
		int data;
		Node left,right;
		public Node(int d) {
			data=d;
			left=null;
			right=null;
		}
	}
		private Node root;
		public BinarySearchTree() {
		root=null;
	}
	public void insert (int key ) {
		root=insertRecord(root,key);
	}
	private Node insertRecord(Node root, int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}if(key<root.data) {
			root.left=insertRecord(root.left, key);
		}else {
			root.right=insertRecord(root.right, key);
		}
		return root;
	}
	
	public void inorder() {
		inorderTraaversal(root);
	}
	private void inorderTraaversal(Node root) {
		if(root!=null) {
		inorderTraaversal(root.left);
		System.out.println(root.data + ", ");
		inorderTraaversal(root.right);
		}
	}
	
	public void preorder() {
		preorderTreversal(root);
	}
	private void preorderTreversal(Node root) {
		if(root!=null) {
		System.out.println(root.data + ",");
		preorderTreversal(root.left);
		preorderTreversal(root.right);
		}
	}
	public void postorder() {
		postorderTraversal(root);
	}
	private void postorderTraversal(Node root) {
		if(root!=null) {
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.println(root.data + ",");
	}
	}
	}

