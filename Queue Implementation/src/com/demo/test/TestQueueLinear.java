package com.demo.test;

import com.demo.beans.MyQueueLinear;

public class TestQueueLinear {

	public static void main(String[] args) {
		MyQueueLinear ob=new MyQueueLinear(5);
		ob.enque(10);
		ob.enque(20);
		ob.enque(30);
		ob.enque(40);
		ob.enque(80);
		System.out.println(ob);
		ob.deque();
		ob.deque();
		System.out.println(ob);
		
		
		
		

	}

}
