package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyStack;

public class TestStack {
	
	public static void main(String[] args) {
		
		MyStack s = new MyStack();
		Scanner sc = new Scanner(System.in);
		int ch ;
		do {
			System.out.println("1. Push \n2. Pop \n3. Peek \n4. DisplayAll \n5. Exit");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter Element You Want Push In Stack ");
				int x = sc.nextInt();
				s.push(x);
				break;
				
			case 2:
				x= s.pop();
				System.out.println("Element Poped From Stack is :"+x);
				break;	
				
			case 3:
				x= s.peek();
				System.out.println("Top Most Element From Stack is :"+x);
				break;
			case 4:
				s.displayAll();
				break;
				
			case 5:
				System.out.println("Thank You.....!!!!");
				break;
				
			default :
				System.out.println("Wrong Choice ....!!!");
				break;
			}
		}while(ch!=5);
		
	}

}
