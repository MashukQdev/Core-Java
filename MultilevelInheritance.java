package com.oops;

/**
 Simple program to use multi-level inheritance
 Practical 15 from OOPS concept practicals
 @author Mashuk Patel
 */

/**
 This class contain method which print a message on console 
 */
class GrandParent {      // grandparent class
	
	/**
	 This method print a message to show that it is grandparent class 
	 */
	public void grandparentmethod() {
		System.out.println("This is a grandparent class.");
	}
	
}

/**
 This class extend the class GrandParent 
 It contain method which print a message on console
*/
class OneParent extends GrandParent {      // parent class
	
	/**
	 This method print a message to show that it is parent class for class OneChild and child class for class GrandParent
	 */
	public void parentmethod() {
		System.out.println("This is a parent class.");
	}
	
}

/**
 This class extend the class OneParent 
 It contain method which print a message on console
*/
class OneChild extends OneParent {       // child class
	
	/**
	 This method print a message to show it is child class for class Oneparent 
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
