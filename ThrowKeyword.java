package com.main;

/**
 Simple program to demonstrate the use of throw keyword
 Practical 18 from OOPS concept practicals
 @author Mashuk Patel
 */
public class ThrowKeyword {

	/**
	 this method check the condition and throw exception if necessary
	 @param number number is taken as input
	 */
	public static void calculate(int number) {
		if(number == 0) {
			throw new NumberFormatException("Number should be greater than 0.");
		}
		else {
			System.out.println("Number is greater than 0.");
		}
	}
	
	public static void main(String[] args) {
		calculate(0);
		System.out.println("Text printed after exception occured.");
	}
	
}
