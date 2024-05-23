package com.oops;

import java.util.ArrayList;
import java.util.Collections;

/**
 Program to demonstrate the use of comparable interface
 Practical 23 from OOPS concept practical
 @author Mashuk Patel
 */

/**
 class contain employee details and implements comparable 
 comparable interface override compareTo() method
 */
class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	String desg;
	
	public Employee(int id, String name, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
	}

	@Override
	public int compareTo(Employee o) {
		return id - o.id;
	}
	
}

public class ComparableInterface {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Aman", "HR"));
		list.add(new Employee(10, "Ram", "Java Developer"));
		list.add(new Employee(5, "Lakhan", ".NET Developer"));
		list.add(new Employee(13, "Milan", "Mobile Developer"));
		list.add(new Employee(11, "Rocky", "Bussiness Analyst"));
		Collections.sort(list);
		for(Employee emp : list) {
			System.out.println(emp.id + " " + emp.name + " " + emp.desg);
		}
	}
	
}

