package com.main;

/**
 Simple program to use super keyword
 Practical 11 from core java practicals
 @author Mashuk Patel
 */

/**
 In this class I declare int variable number and assigned value to it 
 */
class First {
	
	int number;
	
	public First() {
		number = 7;
	}
	
}

/**
 This class contain the use of super keyword
 First class is extended  
 */
class Second extends First {
	
	int number = 19;
	
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
