package com.oops;

/**
 Simple program to demonstrate use of single inheritance
 Practical 15 from OOPS concept practical
 @author Mashuk Patel
 */

/**
This class contain method which print a message on console
 */
class Parent {  // parent class here one parent have only one child
	
	/**
	 It print a message to show that it is parent class
	 */
	public void print() {
		System.out.println("This is a parent class.");
	}
	
}

/**
 This class extend the class Parent 
 It contain method which print a message on console
 */
class Child extends Parent {   // child class

	/**
	 It print a message to show that it is child class for class Parent
	 */
	public void printStatement() {
		System.out.println("This is a child class.");
	}
	
}

public class SingleInheritance {
	
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.print();    
		c1.printStatement();
	}
	
}
