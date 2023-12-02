package com.demo.test;

import com.demo.beans.SingleLinkedListHashing;

public class TestSingleLinkedListHashing {

	public static void main(String[] args) {
		SingleLinkedListHashing [] Hashtable =new SingleLinkedListHashing [5];
		for(int i=0;i<Hashtable.length;i++) {
			Hashtable[i]=new SingleLinkedListHashing();
		}
		int[] arr= {25,12,14,45,1,3,8,9};
		for(int i=0;i<arr.length;i++) {
			int pos=arr[i]%Hashtable.length;
			Hashtable[pos].AddatStart(arr[i]);
		}
		for(int i=0;i<Hashtable.length;i++) {
			Hashtable[i].DisplayData();
		}
		int searchNumber=24;
		int pos=searchNumber%Hashtable.length;
		System.out.println("Search number "+ pos);
		if(Hashtable[pos].Search(searchNumber)) {
			System.out.println("Number existis :" + searchNumber);
		}
		else {
			System.out.println("Number does not exists !");
		}
	}

}
