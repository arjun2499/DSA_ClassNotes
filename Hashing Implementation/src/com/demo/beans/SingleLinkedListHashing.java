package com.demo.beans;

public class SingleLinkedListHashing {
	private Node head;
	class Node{
		int n;
		Node next;
		Node(int d){
			n=d;
			next=null;
		}
	}

 public SingleLinkedListHashing() {
	 head=null;
 }
 
 public void AddatStart(int value) {
	 //create a node to add value
	 Node newnode= new Node(value); 
	 if(head == null) {
		 head=newnode;
	 }else {
		 newnode.next=head;
		 head=newnode;
	 }
 }
public boolean Search(int n) {
	Node temp=head;
	while(temp!=null) {
		if(n==temp.n)
			return true;
		temp=temp.next; 
	}
	return false;
}
public void DisplayData() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.n+ " , ");
		temp=temp.next;
	}
	System.out.println();
}
}