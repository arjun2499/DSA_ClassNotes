package com.demo.test;

import java.util.Scanner;

public class BinarySearch {
	
	private static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter " +(i+1)+ " element");
			arr[i]=sc.nextInt();
		}
		
	}
	
	private static int searchNumber(int[] arr, int search) {
		int first=0,last=arr.length-1;
		int count=0;
		while(first<=last) {
			int mid=(first+last)/2;
			count++;
			if(arr[mid]==search) { 
				System.out.println("comparisons are :"+count);
				return mid;
			}
			else if(arr[mid]<search) {
				first=mid+1;
			}else {
				last=mid-1;
			}
	}
		System.out.println("Comparisons are : "+count);
		return -1;
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int sms=sc.nextInt();
		int [] arr= new int[sms];
		 acceptData(arr);
		 
		 System.out.println("Enter number to search :");
		 int search=sc.nextInt();
		 searchNumber(arr,search);
	}


	

	

}
