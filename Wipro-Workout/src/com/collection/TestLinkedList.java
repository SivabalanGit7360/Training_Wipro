package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkedList<Integer> list3 = new LinkedList<Integer>();
		
		list1.add(2);
		list1.add(56);
		list1.add(24);
		list1.add(10);
		//list1.add(null);
		list1.add(5);
		
		int sum = 0;
		
		
		System.out.println("Linked list elements are :"+list1);
		
		for(Integer elements : list1) {
			
			System.out.print(elements +" ");
			
		}
		
		System.out.println();
		
		for(Integer element : list1) {
		
			sum += element;
		}
		System.out.print("After add all elements in Linked list are :" + sum);
		
		
		
		
			
					
			
					
			


	}

}
