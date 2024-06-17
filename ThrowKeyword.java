package com.oops;

/**
 Simple program to demonstrate the use of throw keyword
 Practical 18 from OOPS concept practicals
 @author Mashuk Patel
 */
public class ThrowKeyword {

	/**
	 This method check the condition and throw an exception if necessary
	 @param number The number to be processed
	 @throws NumberFormatException If the number is equal to 0
	 */
	public static void calculate(int number) {
		if(number == 0) {
			throw new NumberFormatException("Number should be greater than 0.");
		} else {
			System.out.println("Number is greater than 0.");
		}
	}
	
	public static void main(String[] args) {
		calculate(0);
		
		System.out.println("Text printed after exception occured."); 
	}
	
}
