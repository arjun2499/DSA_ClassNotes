package com.demo.test;

import java.util.Scanner;

import com.demo.beans.StackUsingLL;

public class TestStackUsingLL {

	public static void main(String[] args) {
		int ch;
		StackUsingLL sl = new StackUsingLL();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Push \n2. Pop \n3. Peek \n4. Display \n5. Exit \nChoice :");
			ch= sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter Data To Enter In Linked List :");
				int d = sc.nextInt();
				sl.push(d);
				break;
				
			case 2:
				d  = sl.pop();
				System.out.println("Deleted Element Is :" + d);
				break;
				
			case 3:
				d  = sl.peek();
				System.out.println("Deleted Element Is :" + d);
				break;	
				
			case 4:
				String str  = sl.displayAll();
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
