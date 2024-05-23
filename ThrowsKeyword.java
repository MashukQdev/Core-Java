package com.main;

/**
 Simple program to demonstrate the use of throws keyword
 Practical 18 from OOPS concept practicals 
 @author Mashuk Patel
 */
public class ThrowsKeyword {

	/**
	 method to check condition and throw an exception if necessary
	 * @param number
	 * @throws NumberFormatException
	 */
	public static void calculate(int number) throws NumberFormatException,ArithmeticException {
		if(number == 0) {
			throw new NumberFormatException("Number must be greater than 0.");
		}
		else {
			System.out.println("Number is valid.");
		}
	}
	
	public static void main(String[] args) {
		try {
			calculate(0);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println("After exception");
	}
	
}
