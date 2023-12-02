package com.demo.beans;

public class MyStringStack {
	private char[] arr;
	private int size;
	private int top;
	
	public MyStringStack() {
		arr=new char[10];
		size=10;
		top=-1;
	}
	public MyStringStack(int n) {
		arr=new char[n];
		size=n;
		top=-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	public boolean push(char n) {
		if(isFull()) {
			System.out.println("Stack overflow");
			return false;
		}else {
			top++;
			arr[top]=n;
			return true;	
		}	
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return '#';
		}else {
			char ch=arr[top];
			top--;
			return ch;
			
			
		}
	}
	}


