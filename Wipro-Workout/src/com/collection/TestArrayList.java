package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		list1.add("ONE");
		list1.add("TWO");
		list1.add("THREE");
		list1.add("FOUR");
		list1.add(null);
		list1.add("FIVE");
		
		// Approach 1:
		System.out.println("Travese element using for loop :");
		
		for(int i=0; i<6; i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		// Approach 2:
		System.out.println("Travese element using for each loop :");
		
		for(String num: list1) {
			System.out.println(num);
		}
		
		System.out.println();
		// Approach 3:
		System.out.println("Travese element using iterator :");
		
		Iterator<String> iterat = list1.iterator();
		while(iterat.hasNext()) {
			
			System.out.println("The element is : " + iterat.next());
		}
		
		// Approach 4: To reverse the collection elements
		
		System.out.println("Travese element using Listiterator :");
		
		ListIterator<String> literat = list1.listIterator();
		
		while(literat.hasNext()) {
			
			System.out.println("The next element is : " + literat.next());
		}
		
		while(literat.hasPrevious()){
			
			System.out.println("The Previous element is : " + literat.previous());
		}
		
		// find the number of elements present in an ArrayList
		
		System.out.println(list1.size());
		list1.ensureCapacity(20);
		
		//Check empty
		
		System.out.println(list1.isEmpty()); // true or false
		
		//check position
		
		System.out.println(list1.indexOf("ONE"));
		System.out.println(list1.lastIndexOf("ONE"));
		
		//Get element in particular position
		
		System.out.println(list1.get(3));
		
		// Remove an element
		
		list1.remove(2);
		System.out.println(list1);
		
		//Join two arrayList
		
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("555");
		list4.add("666");
		list4.add("777");
		list4.add("888");
		list4.addAll(list1);
		list1.addAll(2, list4);
		
		System.out.println("Watch: "+list1); // inserting all elements of list4 at index2 of list1
		

	}

}
