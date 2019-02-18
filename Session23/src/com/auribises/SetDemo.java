package com.auribises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		// works using indexing
		ArrayList<String> list = new ArrayList<String>();
		list.add("John"); //0
		list.add("Alice");//1
		list.add("Jennie");//2
		list.add("John");//3
		list.add("Fionna");//4
		
		System.out.println("List is: "+list);
		
		// works using Hashing technique -> Unordered
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("John");
		set.add("Alice");
		set.add("Jennie");
		set.add("John");
		set.add("Fionna");
		
		System.out.println("set is: "+set);
		System.out.println("set size is: "+set.size());
		if(set.contains("Alice")){
			System.out.println("Alice is in the set");
		}
		
		set.remove("Fionna");
		System.out.println("set now is: "+set);
		
		HashSet<String> names = new HashSet<String>();
		names.add("Leo");
		names.add("Mike");
		names.add("Sia");
		
		set.addAll(names);
		System.out.println("set now is: "+set);

		System.out.println("==Iterator==");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(name);
		}
		
		// ArrayList Sorting -> Explore
		// API's : Collections.sort() , Comparator and Comparable !!
		
	}

}
