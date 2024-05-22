package com.main;

import java.math.BigDecimal;

/**
 Simple program to compare == and .equals for string, integer and big decimal
 Practical 10A from core java practicals
 @author Mashuk Patel
 */
public class Comparison {
	
	/**
	 method to compare int and Integer with == operator 
	 */
	public static void intValueComparison() {
		//for integer we use == operator to compare primitive data or object
		int a = 10;
		int b = 10;
		Integer c = new Integer(10);
		boolean result1 = a == b; // comparing two primitive data type (int) will work
		System.out.println(result1);
		boolean result2 = b == c; // comparing primitive data type (int) with wrapper class using == operator will work
		System.out.println(result2);
	}
	
	/**
	 method to compare string using == operator and equals() method
	 */
	public static void stringComparison() {
		//for string
		String s1="Mashuk";
		String s2="Mashuk";
		String s3 = new String("Mashuk");
		boolean result3 = s1 == s2; // comparing two primitive data type with == operator will work
		System.out.println(result3); 
		boolean result4 = s1 == s3; // comparing primitive data type with wrapper class using == operator will not work
		System.out.println(result4);
		boolean result5 = s1.equals(s3); // comparing primitive data type with wrapper class using equals() method will work
		System.out.println(result5);
	}
	
	/**
	 method to compare bigdecimal using equals() method
	 */
	public static void bigDecimalComparison() {
		//for big decimal we use equals() method for comparison == operator will not work
		BigDecimal bd1 = new BigDecimal("100.10");
		BigDecimal bd2 = new BigDecimal("100.10");
		boolean result6 = bd1.equals(bd2);
		System.out.println(result6);
	}
	
	public static void main(String[] args) {
		intValueComparison();
		stringComparison();
		bigDecimalComparison();
	}
	
}
