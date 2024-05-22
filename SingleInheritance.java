package com.main;

/**
 Simple program to demonstrate use of single inheritance
 Practical 15 from OOPS concept practical
 @author Mashuk Patel
 */

/**
 simple class which contain print statement and it is parent class
 */
class Parent {  // parent class here one parent have only one child
	
	/**
	 simple method to print statement
	 */
	public void print() {
		System.out.println("This is a parent class.");
	}
	
}

/**
 simple class which contain print statement and it is child class for parent class
 */
class Child extends Parent {   // child class

	/**
	 simple method to print statement
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
