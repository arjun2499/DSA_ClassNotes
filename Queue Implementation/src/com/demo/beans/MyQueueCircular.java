package com.demo.beans;

public class MyQueueCircular {
	private int[] queuearr;
	private int front;
	private int last;
	private int size;
	
	public MyQueueCircular() {
		size=10;
		queuearr = new int[size];
	}
}
