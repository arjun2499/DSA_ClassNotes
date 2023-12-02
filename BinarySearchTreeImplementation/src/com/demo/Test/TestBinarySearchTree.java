package com.demo.Test;

import com.demo.Beans.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree bst= new BinarySearchTree();
		bst.insert(10);
		bst.insert(20);
		bst.insert(32);
		bst.insert(24);
		bst.insert(51);
		bst.inorder();
		System.out.println();
		System.out.println("----------------");
		bst.preorder();
		System.out.println();
		System.out.println("----------------");
		bst.postorder();
		System.out.println();
		System.out.println("-----------------");
		

	}

}
