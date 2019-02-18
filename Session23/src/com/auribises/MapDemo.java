package com.auribises;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		// HashMap works on Hashing technique
		// Key, Value Pair
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(111, "John"); // map.put(new Integer(111), "John");
		map.put(123, "Sia");
		map.put(77, "Kim");
		map.put(678, "Leo");
		map.put(999, "Mike");
		
		// Key is always unique
		map.put(77, "Jennie"); // updating the data in HashMap
		
		map.put(333, "Leo");
		
		map.put(null, "Harry");
		
		map.put(454, null);
		map.put(455, null);
		
		map.put(null, "George");
		
		System.out.println("map is: "+map);
		
		String value = map.get(111);
		System.out.println("Value at 111 is: "+value);
		map.remove(111);
		
		System.out.println("Map now is: "+map);
		System.out.println("map size is: "+map.size());
		
		if(map.containsKey(77)){
			System.out.println("Yes map contains a key 77");
		}
		
		if(map.containsValue("Leo")){
			System.out.println("Yes map contains value Leo");
		}
		
		// Iterating in HashMap
		Set<Integer> keys = map.keySet();
		System.out.println("keys: "+keys);
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String val = map.get(key);
			System.out.println("Key is: "+key+" Value is: "+val);
		}
		
		// Explore : What is EntrySet in HashMap ?
		
		// Thread-Safe or Synchronized
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(111, "John"); 
		table.put(123, "Sia");
		table.put(77, "Kim");
		table.put(678, "Leo");
		table.put(999, "Mike");
		//table.put(null, "Mike"); // no null key
		//table.put(112, null);	   // no null values
		
		System.out.println("table is: "+table);
	}

}
