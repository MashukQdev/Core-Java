package com.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 Program to demonstrate the use of comparator interface 
 Practical 23 from OOPS concept practical
 @author Mashuk Patel
 */

/**
 class contain details of staff members
 */
class Staff {
	
	int id;
	String name;
	String post;
	
	public Staff(int id, String name, String post) {
		super();
		this.id = id;
		this.name = name;
		this.post = post;
	}
	
}

/**
 Comparator interface is implemented to the class for id comparison
 method of the interface is override
 */
class IdComparison implements Comparator<Staff> {

	@Override
	public int compare(Staff s1, Staff s2) {
		if(s1.id > s2.id) {
			return 1;
		}
		else if(s1.id < s2.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}

/**
Comparator interface is implemented to the class for name comparison
method of the interface is override
*/
class NameComparison implements Comparator<Staff>{

	@Override
	public int compare(Staff s1, Staff s2) {
		return s1.name.compareTo(s2.name);
	}
	
}

public class ComparatorInterface {

	public static void main(String[] args) {
		ArrayList<Staff> list = new ArrayList<Staff>();
		list.add(new Staff(3, "Ram", "Teacher"));
		list.add(new Staff(1, "Shyam", "Manager"));
		list.add(new Staff(10, "Lakhan", "Guide"));
		list.add(new Staff(5,"Mann","Teacher"));
		System.out.println("Comparision by id :");
		Collections.sort(list, new IdComparison());     //comparision by id
		for(Staff st : list) {
			System.out.println(st.id + " " + st.name + " " + st.post + " ");
		}
		System.out.println();
		System.out.println("Comparision by name :");
		Collections.sort(list, new NameComparison());   // comparision by name
		for(Staff st : list) {
			System.out.println(st.id + " " + st.name + " " + st.post + " ");
		}
	}
	
}

