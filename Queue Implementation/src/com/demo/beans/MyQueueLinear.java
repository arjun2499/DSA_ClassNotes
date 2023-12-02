package com.demo.beans;

import java.util.Arrays;

public class MyQueueLinear {
	private int[] quearr;
	private int front;
	private int rear;
	private int size;
	
	public MyQueueLinear() { //default constructor
		size=10;
		quearr=new int[size];
		front=0;
		rear=-1;
	}
	public MyQueueLinear(int s) {
		size=s;
		quearr=new int[size]; //parameterized constructor
		front=0;
		rear=-1;	
	}
	
	public boolean isFull() {
		if(rear==size-1) //pointing to last index of array
			return true;
		else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(front>rear) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void enque(int n){   //addition
		if(isFull()) {
			System.out.println("Queue is full...Cannot add!");
		}
		else {
			rear++;
			quearr[rear]=n;
			System.out.println(n+ " added in queue");
		}
	}
	
	public int deque() {    //deletion
		if(isEmpty()) {
			System.out.println("Queue is Empty...Cannot delete!");
			return -1;
		}
		else {
			int n=quearr[front];
			System.out.println("Removed value"+front);
			front++;
			return n;
		}
	}
	public String toString() {
		return Arrays.toString(quearr)+" front :"+front+" rear: "+rear;
	}
}
