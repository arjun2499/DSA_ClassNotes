package com.demo.test;

import java.util.Scanner;

import com.demo.beans.SingleLinkedList;

public class TestSingleLinkedList {

	public static void main(String[] args) {
		
		int ch;
		SingleLinkedList sl = new SingleLinkedList();
		
		Scanner sc = new Scanner(System.in);
	
		do {
			System.out.println("1. Insert Last \n2. Insert First \n3. Insert By Position "
					+ "\n4. Delete First \n5. Delete Last \n6. Delete By Position "
					+ "\n7. Count Number Of Nodes \n8. Insert Sorted "
					+ "\n9. Insert Before \n10. Search By Data \n11. Display Linked List"
					+ "\n12. Exit \nChoice : ");
			
			ch = sc.nextInt();
			
			switch(ch)
			{
			
			case 1:
				System.out.println("Enter Data To Enter In Linked List :");
				int d = sc.nextInt();
				sl.insertLast(d);
				break;
				
			case 2:
				System.out.println("Enter Data To Enter In Linked List :");
				d = sc.nextInt();
				sl.insertFirst(d);
				break;
				
			case 3:
				System.out.println("Enter Data To Enter In Linked List :");
				d = sc.nextInt();
				System.out.println("Enter position To Enter Data In Linked List :");
				int p = sc.nextInt();
				sl.insertByPosition(d,p);
				break;
				
			case 4:
				d = sl.deleteFirst();
				System.out.println(d + "Is Deleted From LinkedList");
				break;
				
			case 5:
				d = sl.deleteLast();
				System.out.println(d + "Is Deleted From LinkedList");
				break;
				
			case 6:
				System.out.println("Enter position To Delete Data From Linked List :");
				p = sc.nextInt();
				d = sl. deleteByPosition(p);
				System.out.println(d + "Is Deleted From LinkedList");
				break;
				
			case 7:
				int n = sl.countNode();
				System.out.println(n + "Nodes In  LinkedList");
				break;
				
			case 8:
				System.out.println("Enter Data To Enter In Linked List :");
				d = sc.nextInt();
				sl.insertSorted(d);
				break;
				
			case 9:
				System.out.println("Enter Data To Enter In Linked List :");
				d = sc.nextInt();
				System.out.println("Enter position To Enter Data In Linked List :");
				int b = sc.nextInt();
				sl.insertBefore(d,b);
				break;
				
			case 10:
				System.out.println("Enter Data To Search  In Linked List :");
				d = sc.nextInt();
				p = sl.searchData(d);
				System.out.println("Found Data At Position : " +p );
				break;
				
			case 11:
				System.out.println("Linked List Is :");
				sl.displayAll();
				break;
				
			case 12:
				System.out.println("Thank You......!!!!");
				break;
				
			default:
				System.out.println("Wrong Choice .....!!!");
				break;	
			}
		}while(ch!=12);

	}

}
