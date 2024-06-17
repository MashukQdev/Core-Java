package com.main;

/**
 Simple program to use super keyword
 Practical 11 from core java practicals
 @author Mashuk Patel
 */

/**
 This class initialize an integer variable and sets its value to 7.
 */
class First {
	
	int number;
	
	/**
	 Constructor of class First
	 It assign value 7 to variable number
	 */
	public First() {
		number = 7;
	}
	
}

/**
This class extends the First class 
It initialize an integer variable 'number' and override the parent class variable
It demonstrate the use of super keyword by accessing parent class variable value 
 */
class Second extends First {
	
	int number = 19;
	
	/**
	 Constructor of class Second
	 Prints the value of 'number' variable of this class and it's parent class also 
	 */
	public Second() {
		System.out.println(number);
		System.out.println(super.number); // super keyword is used to access the reference of parent class
	}
	
}

public class SuperKeyword {

	public static void main(String[] args) {
		Second second = new Second();
	}
	
}
