package com.main;

/**
 Simple program to use multi-level inheritance
 Practical 15 from OOPS concept practicals
 @author Mashuk Patel
 */

/**
 Simple class which contain print statement method 
 */
class GrandParent {      // grandparent class
	
	/**
	 method to print a simple statement 
	 */
	public void grandparentmethod() {
		System.out.println("This is a grandparent class.");
	}
	
}

/**
Simple class which contain print statement method 
*/
class OneParent extends GrandParent {      // parent class
	
	/**
	 method to print a simple statement 
	 */
	public void parentmethod() {
		System.out.println("This is a parent class.");
	}
	
}

/**
Simple class which contain print statement method 
*/
class OneChild extends OneParent {       // child class
	
	/**
	 method to print a simple statement 
	 */
	public void childmethod() {
		 System.out.println("This is a child class.");
	}
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		OneChild c1 = new OneChild();
		c1.grandparentmethod();
		c1.parentmethod();
		c1.childmethod();
	}
	
}
