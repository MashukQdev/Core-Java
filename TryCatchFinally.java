package com.main;

/**
 Simple program to demonstrate use of try, catch and finally block
 Practical 18 from OOPS concept practicals
 @author Mashuk patel
 */
public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			System.out.println("Before exception in try block.");
			int a = 10 / 0;
			System.out.println(a);
			System.out.println("After exception in try block.");
		}
		catch(NumberFormatException ex) {
			System.out.println(ex);
		}
		finally {
			System.out.println("This is finally block and it will execute whether exception occured or not.");
		}
	}
	
}

