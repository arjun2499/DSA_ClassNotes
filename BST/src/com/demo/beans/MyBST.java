package com.demo.beans;

public class MyBST {
	class Node{
		int data;
		Node left,right;
	public Node(int d) {
		data=d;
		left=null;
		right=null;
	}
   private Node root;
   public Node() {
	root=null;
}
	public void insert(int key) {
		root=insertRecord(root,key);
		
	}
	private Node insertRecord(Node root, int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}if(key<root.data) {
			root.left=insertRecord(root.left,key);
		}else {
			root.right=insertRecord(root.right,key);
		}
		return root;
	} 
	public void inorder() {
		inorderTraversal(root,node);
	}
	}
	}


