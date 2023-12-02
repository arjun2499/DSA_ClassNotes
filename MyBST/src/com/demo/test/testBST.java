package com.demo.test;

import com.demo.beans.BST;

public class testBST {

	public static void main(String[] args) {
		BST swara=new BST();
		swara.insert(10);
		swara.insert(30);
		swara.insert(50);
		swara.insert(12);
		swara.insert(18);
		swara.inorder();
		System.out.println("--------");
		swara.Postorder();
		System.out.println();
		System.out.println("--------");
		swara.preorder();
	
		
	}

}
