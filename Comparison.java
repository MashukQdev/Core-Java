package com.main;

import java.math.BigDecimal;

/**
 Simple program to compare == and .equals for string, integer and big decimal
 Practical 10A from core java practicals
 @author Mashuk Patel
 */
public class Comparison {
	
	/**
	 Method to compare int and Integer values with == operator 
	 @return Nothing, print comparison results to the console
	 */
	public static void intValueComparison() {
		//for integer we use == operator to compare primitive data or object
		int firstValue = 10;
		int secondValue = 10;
		Integer thirdValue = new Integer(10);
		
		boolean result1 = firstValue == secondValue; // comparing two primitive data type (int) will work
		System.out.println(result1);
		
		boolean result2 = secondValue == thirdValue; // comparing primitive data type (int) with wrapper class using == operator will work
		System.out.println(result2);
	}
	
	/**
	 Method to compare string using == operator and equals() method
	 @return Nothing, print comparison results to the console
	 */
	public static void stringComparison() {
		//for string
		String firstString = "Mashuk";
		String secondString = "Mashuk";
		String thirdString = new String("Mashuk");
		
		boolean result3 = firstString == secondString; // comparing two primitive data type with == operator will work
		System.out.println(result3); 
		
		boolean result4 = firstString == thirdString; // comparing primitive data type with wrapper class using == operator will not work
		System.out.println(result4);
		
		boolean result5 = firstString.equals(thirdString); // comparing primitive data type with wrapper class using equals() method will work
		System.out.println(result5);
	}
	
	/**
	 Method to compare bigdecimal value using equals() method
	 @return Nothing, print comparison results to the console
	 */
	public static void bigDecimalComparison() {
		//for big decimal we use equals() method for comparison == operator will not work
		BigDecimal firstBigDecimalValue = new BigDecimal("100.10");
		BigDecimal secondBigDecimalValue = new BigDecimal("100.10");
		
		boolean result6 = firstBigDecimalValue.equals(secondBigDecimalValue);
		System.out.println(result6);
	}
	
	public static void main(String[] args) {
		intValueComparison();
		stringComparison();
		bigDecimalComparison();
	}
	
}
