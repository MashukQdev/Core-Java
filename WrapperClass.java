package com.main;

/**
 Simple program to compare variables of wrapper class
 Practical 9 from core java practicals
 @author Mashuk Patel
 */
public class WrapperClass {

	public static void main(String[] args) {        
		Integer First = new Integer(30);   
		Integer Second = new Integer(30);
		if(First.equals(Second)) {
			System.out.println("Both the variables are same.");
		} else {
			System.out.println("Both the variables are not same.");
		}
	}
	
}
