package com.oops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 Program to remove duplicates from list
 Practical 22 from OOPS concept practicals
 @author Mashuk Patel
 */
public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('A');
		list.add('C');
		list.add('E');
		list.add('E');
		list.add('E');
		System.out.println("List elements are : " + list);
		HashSet<Character> set = new HashSet<Character>();
		Iterator<Character> itr = list.iterator();
		while(itr.hasNext()) {
			set.add(itr.next());
		}
		System.out.println("List elements after removing duplicates are : " + set);
	}
	
}

