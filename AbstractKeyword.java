package com.main;

/**
 Simple programe to demonstrate use of abstract keyword
 Practical 13 from OOPS concept practicals 
 @author Mashuk Patel
 */

/**
 it is abstract class containe 1 variable and an abstract method
 As we cannot create object of abstract method so we must extend it into child class
 */
abstract class AbstractClass {
	
	 int number = 10;
	
	 /*
	  abstract method and it is override into child class
	  */
	abstract void printHello();
	
}

class NonAbstractClass extends AbstractClass {

	@Override
	/**
	 this method is abstract method just to print message.
	 */
	void printHello() {
		System.out.println("This is a abstract method declare in parent class.");
	}
	
}

public class AbstractKeyword {

	public static void main(String[] args) {
		NonAbstractClass test = new NonAbstractClass();
		test.printHello();
		System.out.println("Printing variable that is declare in abstract class through child class : " + test.number);
	}
	
}
