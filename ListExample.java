package com.oops;

import java.util.ArrayList;
import java.util.Iterator;

/**
 Simple program to add values in the list and print all values using iterator
 Practical 20 from OOPS concept practicals
 @author Mashuk Patel 
 */
public class ListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("Mashuk");
		list.add("Welcome");
		list.add("QDev");
		list.add("Ahmedabad");
		list.remove("Hello");   // remove using value
		list.remove(4);         // remove using index
		list.add(0,"Patel");    // add at start of list 
		System.out.println("Printing all elements of list using iterator : ");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Get 2 element from list and printing : " + list.get(1)); // get element from list by giving index
	}
	
}
