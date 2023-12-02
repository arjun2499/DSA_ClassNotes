package com.demo.beans;

import com.demo.beans.SingleLinkedList.ListNode;

public class StackUsingLL {
	

	private ListNode top;

	public StackUsingLL() {
		super();
		this.top = null;
	}
	
	

	public ListNode getTop() {
		return top;
	}



	public void setTop(ListNode top) {
		this.top = top;
	}



	public void push(int d) {
      
		SingleLinkedList sl = new SingleLinkedList();
		ListNode newnode = sl.new ListNode(d);
		
		newnode.setNext(top);
		top = newnode;
		
	}

	public int pop() {
		int data;
		
		if(!isEmpty())
		{
			data = top.getData();
			top=top.getNext();
			
			return data;
		}
		return -1;
	}

	private boolean isEmpty() {
		
		if(top==null)
			return true;
		else
			return false;
		
	}



	public int peek() {
		
		int data;
		
		if(!isEmpty())
		{
			data = top.getData();
			
			return data;
		}
		return -1;
	}



	public String displayAll() {
		
		ListNode iter = top;
		
		String str = new String();
		while(iter.getNext()!=null)
		{
			 str = str + iter.getData();
			 iter=iter.getNext();
			 
			 return str; 
		}
		return null;
	}
	
	
	
	
}
