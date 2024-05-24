package com.oops;

/**
 Simple program to demonstrate the use of throws keyword
 Practical 18 from OOPS concept practicals 
 @author Mashuk Patel
 */
public class ThrowsKeyword {

	/**
	 This method to check condition and throw an exception if necessary
	 * @param number The number to be processed
	 * @throws NumberFormatException If the number is equal to 0
	 */
	public static void calculate(int number) throws NumberFormatException,ArithmeticException {
		if(number == 0) {
			throw new NumberFormatException("Number must be greater than 0.");
		} else {
			System.out.println("Number is valid.");
		}
	}
	
	public static void main(String[] args) {
		try {
			calculate(0);
		} catch(Exception ex) {
			System.out.println(ex);
		}
		
		System.out.println("After exception");   // printing a statement after exception occurred
	}
	
}
