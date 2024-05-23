package com.oops;

import java.util.HashSet;
import java.util.Iterator;

/**
 Simple program to demonstarte the use of set
 Practical 21 from OOPS concept practicals 
 @author Mashuk Patel
 */
public class SetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("Mashuk");
		set.add("Ahmedabad");
		set.add("QDev");
		set.add("QDev");   // set does not allow duplicate vlaues 
		set.remove("World");   // set allows to remove elements by its value only
		System.out.println("Printing all elemets from set using iterator : ");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Search in set is Ahmedabad present? " + set.contains("Ahmedabad"));
	}
	
}
