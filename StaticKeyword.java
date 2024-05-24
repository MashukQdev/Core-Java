package com.main;

/**
 Simple program to demonstrate the use of static keyword with variable, method and block
 Practical 12 from core java practicals 
 @author Mashuk Patel
 */

/**
 This class contain static variable and static method 
 Static variable 'number' is assigned with value 10
 */
class Demo {
	
	private static int number = 10;
	
	/**
	 Constructor of class Demo
	 It adds 10 to the 'number' variable and print it on console 
	 */
	public Demo() {
		number += 10;
		System.out.println(number);
	}
	
	/**
	 This static method adds 20 to the given parameter
	 * @param a The input parameter to which 20 will be added
	 * @return The value of 'a' after adding 20 to it
	 */
	public static int calculate(int a) {
		return a += 20;
	}

}

public class StaticKeyword {

	/**
	 This static block is executed before main method while class loading
	 */
	static {
		System.out.println("This is a static block.");
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method start.");  
		
		Demo d1 = new Demo(); // number = 10 and then plus 10 in it so output will be 20 
		System.out.println(d1.calculate(2));
		
		Demo d2 = new Demo(); // but this time number = 20 as we use static variable and plus 10 so output will be 30 
		System.out.println(d2.calculate(2));
	}
	
}
