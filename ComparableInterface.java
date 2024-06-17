package com.oops;

import java.util.ArrayList;
import java.util.Collections;

/**
 Program to demonstrate the use of comparable interface
 Practical 23 from OOPS concept practical
 @author Mashuk Patel
 */

/**
 This class contain employee details and implements comparable interface
 Comparable interface override compareTo() method
 */
class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	String designation;
	
	/**
	 Constructor of class Employee
	 * @param id The id of the employee
	 * @param name The name of the employee
	 * @param designation The designation of the employee
	 */
	public Employee(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	
	@Override
	/**
	 Compares this employee with the specified employee based on their IDs
	 @param o The employee to be compared
	 @return A negative integer, zero, or a positive integer if this employee's ID is less than, equal to, or greater than the specified employee's ID.
	 */
	public int compareTo(Employee o) {
		return id - o.id;
	}
	
}

public class ComparableInterface {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();     // initialize list
		list.add(new Employee(1, "Aman", "HR"));
		list.add(new Employee(10, "Ram", "Java Developer"));
		list.add(new Employee(5, "Lakhan", ".NET Developer"));
		list.add(new Employee(13, "Milan", "Mobile Developer"));
		list.add(new Employee(11, "Rocky", "Bussiness Analyst"));
		
		Collections.sort(list);    // sort collection
		
		for(Employee emp : list) {
			System.out.println(emp.id + " " + emp.name + " " + emp.designation);   // printing collections data
		}
	}
	
}
