package com.demo.beans;

public class MyStack {
	
	private int [] arr ;
	private int top;
	
	public MyStack()
	{
		arr = new int[10];
		top = -1;
	}
	
	public void push(int x)
	{
		if(!isFull())
		{
			top = top+1;
			arr[top]=x;
		}
		else
			System.out.println("Stack Is Full");
	}

	private boolean isFull() {
		
		if(top==arr.length-1)
			return true;
		else 
		return false;
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int x = arr[top];
			top=top-1;
			
			return x;
		}
		return -1;
		
	}

	private boolean isEmpty() {
		
		if(top==-1)
			return true;
		else
			return false;
		
	}
	
	public int peek()
	{
		if(!isEmpty())
		{
			int x = arr[top];
			
			return x;
		}
		return -1;
	}
	
	public void displayAll()
	{
		System.out.println("Elements In Stack are : ");
		for(int i =top;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
