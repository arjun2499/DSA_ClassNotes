package com.demo.test;

import java.util.Scanner;

public class BinaryRecurssion {
	
	private static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+(i+1)+ "  Element :");
			arr[i]=sc.nextInt();
		}
	}
	private static int binarySearchRecurssion(int first, int last, int search, int[] arr) {
		if(first>last)
			return -1;
		else {
			int mid=(first+last)/2;
			if(arr[mid]==search) {
			return mid;
			}else if(arr[mid]<search) {
				System.out.println(first+","+last+","+mid+","+search);
				return binarySearchRecurssion(mid+1,last,search,arr); 
			}else {
				System.out.println(first+","+last+","+mid+","+search);
				return binarySearchRecurssion(first,mid-1,search,arr);
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n=sc.nextInt();
		int [] arr= new int[n];
		acceptData(arr);
		
		System.out.println("Enter element to search :");
		int search=sc.nextInt();
		
		int pos=binarySearchRecurssion(0,arr.length-1,search,arr);
		if(pos!= -1) {
			System.out.println("Number found at "+pos);
		}
		else {
			System.out.println("Number not found !");
		}
				
	}
	
	
	
}
