package com.demo.test;

import java.util.Scanner;

public class LinearSearchArray {
	
	private static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "  +(i+1)+  " Element");
			arr[i]=sc.nextInt();
		}
		
	}
	
	private static void SearchData(int[] arr, int search) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("Element found at "+i+ "position");
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		acceptData(arr);
		
		System.out.println("Enter element to search : " );
		int search=sc.nextInt();
		SearchData(arr,search);
		
		
	


	}

	

}
