package com.demo.beans;

public class MyCircularQueue {

	private int [] qarr;
	private int front;
	private int rear;
	
	
	public MyCircularQueue() {
		super();
		this.qarr = new int[5];
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isFull()
	{
		if((front==0) && (rear==qarr.length-1)|| (front==rear+1))
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
			if(rear==qarr.length-1)
				rear=0;
			else
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
			
			if(front==rear)
				front=rear=-1;
			else if(front==qarr.length-1)
				front=0;
			else
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
		int i=front;
		if(front<rear)
		{
			while(i<=rear)
			{
				System.out.println(qarr[i]);
				i++;
			}
		}
		else
		{
			while(i<=qarr.length-1)
			{
				System.out.println(qarr[i]);
				i++;
			}
			front=0;
			while(i<=rear)
				{
				System.out.println(qarr[i]);
				i++;
				}
		}
			
	}
}
