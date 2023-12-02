package com.demo.beans;

import com.demo.beans.SingleLinkedList.ListNode;

public class QueueUsingLL {
	
	private ListNode front,rear;
	
	
	
	public void QueueUsingLL()
	{
		front = rear = null; 
	}

	public void insert(int d) {
		
		SingleLinkedList ob = new SingleLinkedList();
		ListNode newnode =ob.new ListNode(d);
		
		if(front==null)
		{
			front = newnode;
		}
		else
			rear.setNext(newnode);
		
		rear= newnode;
		
	}

	public int remove() {
		
		int data;
		if(!isEmpty())
		{
			data = front.getData();
			front = front.getNext();
			
			return data;
		}
		return -1;
	}

	private boolean isEmpty() {
		
		if(front==null)
			return true;
		else
			return false;
		
	}

	public int peek() {
		
		int data;
		if(!isEmpty())
		{
			data = front.getData();
			
			return data;
		}
		return -1;

	}

	public String displayAll() {
		
		String str = new String();
		
		ListNode iter = front;
		
		while(iter!=null)
		{
			str = str + iter.getData();
			iter = iter.getNext();
			
			
		}
		return str;
	}
	
	

}
