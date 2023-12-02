package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyCircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		
		MyCircularQueue cq = new MyCircularQueue();
		
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
				cq.insert(x);
				break;
				
			case 2:
				x= cq.remove();
				System.out.println("Element Remove From Queue is :"+x);
				break;	
				
			case 3:
				x= cq.peek();
				System.out.println("Top Most Element From Queue is :"+x);
				break;
			case 4:
				cq.displayAll();
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
