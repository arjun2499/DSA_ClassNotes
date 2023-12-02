package com.demo.test;

import java.util.Scanner;

import com.demo.beans.SingleLinkedList;

public class TestSingleLinkedList {
	

	public static void main(String[] args) {
		SingleLinkedList ob=new SingleLinkedList();
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println(" 1.addAtend \n 2.addByPosition \n 3.deletebyValue \n 4.deletebyPos\n 5.displayData \n 6.Exit");
			ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter element you want to add at end :");
			int s=sc.nextInt();
			ob.addAtEnd(s);
			break;
		case 2:
			System.out.println("Enter value and Enter position respectively :");
			int q=sc.nextInt();
			int r=sc.nextInt();
			ob.addByPosition(q,r);
			break;
		case 3:
			System.out.println("Enter element you want to delete :");
			int v=sc.nextInt();
			ob.deleteByValue(v);
			break;
		case 4:
			System.out.println("Enter position of element you want to delete :");
			int T=sc.nextInt();
			ob.deletebyPos(T);
			break;
		case 5:
			ob.displayData();
			break;
		case 6:
			System.out.println("Thankyou...");
			break;
		default:
			System.out.println("Please enter a valid choice...!");
		}
	
		}while(ch!=6);
		sc.close();
	}
}
		
