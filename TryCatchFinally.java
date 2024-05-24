package com.oops;

/**
 Simple program to demonstrate use of try, catch and finally block
 Practical 18 from OOPS concept practicals
 @author Mashuk patel
 */
public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			System.out.println("Before exception in try block.");    // print statement to indicate its execution befor exception
			
			int a = 10 / 0;
			System.out.println(a);
			
			System.out.println("After exception in try block.");    // print statement to indicate its execution after exception
		} catch(NumberFormatException ex) {
			System.out.println(ex);
		} finally {
			System.out.println("This is finally block and it will execute whether exception occured or not.");   // print statement to indicate finally block execution
		}
	}
	
}
