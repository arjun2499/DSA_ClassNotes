package com.demo.test;

import java.util.Scanner;

import com.demo.beans.QueueUsingLL;
import com.demo.beans.SingleLinkedList;

public class TestQueueUsingLL {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch;
		
		QueueUsingLL qu = new QueueUsingLL();
		
		
		do {
			System.out.println("1. Insert \n2. Remove \n3. Peek \n4. Display \n5. Exit \nChoice :");
			ch= sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter Data To Enter In Linked List :");
				int d = sc.nextInt();
				qu.insert(d);
				break;
				
			case 2:
				d  = qu.remove();
				System.out.println("Deleted Element Is :" + d);
				break;
				
			case 3:
				d  = qu.peek();
				System.out.println("Deleted Element Is :" + d);
				break;	
				
			case 4:
				String str  = qu.displayAll();
				System.out.println(str);
				break;
				
			case 5:
				System.out.println("Thank You......!!!!!");
				break;
				
			default :
				System.out.println("Wrong Choice....!!!!!");
				break;
				
			}
		}while(ch!=5);

	}

}
