package com.demo.beans;

public class SingleLinkedList {
	
	private ListNode head;

	public SingleLinkedList() {
		super();
		this.head = null;
	}
	
	class ListNode{
		
		private int data;
		private ListNode next;
		public ListNode(int d) {
			super();
			this.data = d;
			this.next = null;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public ListNode getNext() {
			return next;
		}
		public void setNext(ListNode next) {
			this.next = next;
		}
		
		
	}

	public ListNode getHead() {
		return head;
	}

	public void setHead(ListNode head) {
		this.head = head;
	}

	public void insertLast(int d) {
		
		ListNode newnode = new ListNode(d);
		
		if(head==null)
		{
			head = newnode;
			
		}
		
		ListNode iter = head;
		
		while(iter.getNext()!=null)
		{
			iter = iter.getNext();
		}
		
		iter.setNext(newnode);
		
		
	}

	public void insertFirst(int d) {
		
		ListNode newnode = new ListNode(d);
		
		newnode.setNext(head);
		head= newnode;
		
	}

	public void displayAll() {
		
		String str = new String();
		
		ListNode iter = head;
		
		if(head==null)
		{
			System.out.println("Linked List Is Empty");
		}
		while(iter!=null)
		{
			//str = " "+str;
			str = str + iter.getData();
			iter = iter.getNext();
		}
		
		System.out.println(str);
	}

	public void insertByPosition(int d, int p) {
		
		ListNode newnode = new ListNode(d);
		
		if(head==null)
		{
			head=newnode;
		}
		if(p==1)
		{
			newnode.setNext(head);
			head= newnode;
		}
		
		ListNode iter = head;
		
		for(int i = 1;i<p-1 && iter.getNext()!=null;i++)
		{
			iter = iter.getNext();
		}
		
		newnode.setNext(iter.getNext());
		iter.setNext(newnode);
		return;
		
	}

	public int deleteFirst() {
		
		ListNode deletable;
		if(head==null)
		{
			System.out.println("Linked List Is Empty ");
		}
		
		if(head.getNext()==null)
		{
			deletable = head;
			int d = head.getData();
			head = head.getNext();
			deletable = null;
			
			return d;
		}
		return -1;
	}

	public int deleteLast() {
		
		ListNode deletable;
		if(head==null)
		{
			System.out.println("Linked List Is Empty ");
		}
		
		if(head.getNext()==null) // First Position 
		{
			deletable = head;
			int d = head.getData();
			head = head.getNext();
			deletable = null;
			
			return d;
		}
		
		ListNode iter = head;
		
		while(iter.getNext().getNext()!=null)
		{
			iter = iter.getNext();
		}
		
		deletable = iter.getNext();
		int d= iter.getNext().getData();
		iter.setNext(null);
		deletable = null;
		return d;
	}

	public int deleteByPosition(int p) {
		
		ListNode deletable;
		if(head==null)
		{
			System.out.println("Linked List Is Empty ");
		}
		
		if(head.getNext()==null) // First Position 
		{
			deletable = head;
			int d = head.getData();
			head = head.getNext();
			deletable = null;
			
			return d;
		}
		
		ListNode iter = head;
		for(int i=1; i<p-1 && iter.getNext()!=null;i++)
		{
			iter = iter.getNext();
		}
		if(iter.getNext()==null)
		{
			deletable = iter.getNext();
			int d = iter.getData();
			iter.setNext(iter.getNext().getNext());
			deletable = null;
			return d;	
		}
		else
		{
			System.out.println("Invalid Position ");
			return -1;
		}
		
	}

	public int countNode() {
		int count=0;
		if(head==null)
		{
			System.out.println("Linked List Is Empty");
		}
		
		ListNode iter = head;
		
		while(iter!=null)
		{
			iter=iter.getNext();
			count++;
		}
		return count;
	}

	public void insertSorted(int d) {
		
		ListNode newnode = new ListNode(d);
		
		if(head==null || d<head.getData())
		{
			newnode.setNext(head);
			head = newnode;	
		}
		
		ListNode iter = head;
		
		while(iter.getNext()!=null || iter.getNext().getData()<d)
		{
			iter = iter.getNext();
		}
		
		newnode.setNext(iter.getNext());
		iter.setNext(newnode);
	}

	public void insertBefore(int d, int b) {
		
		ListNode newnode = new ListNode(d);
		
		if(head==null || d<head.getData())
		{
			newnode.setNext(head);
			head = newnode;	
		}
		
		ListNode iter = head;
		
		while(iter.getNext()!=null || iter.getNext().getData()!=b)
		{
			iter = iter.getNext();
		}
		
		newnode.setNext(iter.getNext());
		iter.setNext(newnode);
	}

	public int searchData(int d) {
		int pos=0;
		ListNode iter = head;
		
		while(iter!=null)
		{
			if(iter.getData()==d)
				break;
			
			pos++;
			iter = iter.getNext();
		}

	
		return pos;
	}
		
		
}
	
	


