package com.oops;

/**
 Simple programe to demonstrate use of abstract keyword
 Practical 13 from OOPS concept practicals 
 @author Mashuk Patel
 */

/**
 This abstract class contain one integer variable and an abstract method
 */
abstract class AbstractClass {
	
	 int number = 10;
	
	 /*
	  abstract method and it is override into child class
	  */
	abstract void printHello();
	
}

/**
 This class extend the abstract class AbstractClass and implements its abstract method
 */
class NonAbstractClass extends AbstractClass {

	@Override
	/**
	 This method is an abstract method override from the parent class just to print message.
	 */
	void printHello() {
		System.out.println("This is a abstract method declare in parent class.");
	}
	
}

public class AbstractKeyword {

	public static void main(String[] args) {
		NonAbstractClass test = new NonAbstractClass();
		test.printHello();
		
		System.out.println("Printing variable that is declare in abstract class through child class : " + test.number);   // print abstract class variable
	}
	
}
