package com.main;

/**
 Simple program to demonstrate the use of static keyword with variable, method and block
 Practical 12 from core java practicals 
 @author Mashuk Patel
 */

/**
 class contain static variable and static method to demonstarte use of static keyword 
 */
class Demo {
	
	private static int number = 10;
	
	public Demo() {
		number += 10;
		System.out.println(number);
	}
	
	/**
	 This static method just add 20 to the given parameter
	 * @param a a is input parameter
	 * @return value of a after adding 20 to it
	 */
	public static int calculate(int a) {
		return a += 20;
	}

}

public class StaticKeyword {

	/**
	 this static block is executed before main method while class loading
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
