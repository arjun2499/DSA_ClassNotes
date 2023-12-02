package com.demo.beans;

public class MyQueue{
	
	private int [] qarr;
	private int front;
	private int rear;
	
	
	public MyQueue() {
		super();
		this.qarr = new int[5];
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isFull()
	{
		if(rear==qarr.length)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(front==-1)
			return true;
		else
			return false;
	}
	
	public void insert(int n)
	{
		if(!isFull())
		{
			if(front==-1)
				front=0;
			rear=rear+1;
			qarr[rear]=n;
			
		}
		else
			System.out.println("Queue Is Full ");
	}
	
	public int remove()
	{
		if(!isEmpty())
		{
			int x = qarr[front];
			front = front+1;
			
			return x;
		}
		return -1;
	}
	
	public int peek()
	{
		if(!isEmpty())
		{
			int x = qarr[front];
			
			
			return x;
		}
		return -1;
	}
	
	public void displayAll()
	{
		for(int i = front; i<=rear;i++)
		{
			System.out.println(qarr[i]);
		}
	}
	
}
