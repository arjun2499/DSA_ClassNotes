package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyQueue;

public class TestQueue {
	
	public static void main(String[] args) {
		
		MyQueue mq = new MyQueue();
		
		Scanner sc = new Scanner(System.in);
		int ch ;
		do {
			System.out.println("1. Insert \n2. Remove \n3. Peek \n4. DisplayAll \n5. Exit");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter Element You Want Insert In Queue ");
				int x = sc.nextInt();
				mq.insert(x);
				break;
				
			case 2:
				x= mq.remove();
				System.out.println("Element Remove From Queue is :"+x);
				break;	
				
			case 3:
				x= mq.peek();
				System.out.println("Top Most Element From Queue is :"+x);
				break;
			case 4:
				mq.displayAll();
				break;
				
			case 5:
				System.out.println("Thank You.....!!!!");
				break;
				
			default :
				System.out.println("Wrong Choice ....!!!");
				break;
			}
		}while(ch!=5);
		
		sc.close();
	}

	

}
