package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
		hm.put("a", 100);
		hm.put("b", 600);
		hm.put("c", 300);
		hm.put("d", 400);
		
		Set<Map.Entry<String, Integer>> st = hm.entrySet();
		for(Map.Entry<String, Integer> me: st)
		{
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		*/
		System.out.println("***************************");
		
		System.out.println(" Display data using LinkedHashMap");
		
		LinkedHashMap<String, Integer> lm = new LinkedHashMap<String, Integer>();
		lm.put("a", 100);
		lm.put("b", 600);
		lm.put("c", 300);
		lm.put("d", 400);
		
		Set<Map.Entry<String, Integer>> set = lm.entrySet();
		for(Map.Entry<String, Integer> me: set)
		{
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}

	}

}
