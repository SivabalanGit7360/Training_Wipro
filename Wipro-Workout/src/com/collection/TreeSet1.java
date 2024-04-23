package com.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

public static void main(String[] args) {
		
		List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 2, 8, 6);
		System.out.println(listNumbers);
		
		Set<Integer> uniqueNumbers = new TreeSet(listNumbers);
		System.out.println(uniqueNumbers);
		
		//Add an element
		
		Set<String> names = new TreeSet<>();
		names.add("Tom");
		names.add("Mary");
		
		if(names.add("Peter")) {
			System.out.println("Peter is added to the set");
		}
		if(!names.add("Tom")) {
			System.out.println("Tom is already added to the set");
		}
		// Traverse all elements
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		// Search an element
		if(names.contains("Mary")) {
			System.out.println("Fount Mary");
		}
	}

}
