package com.main;

/**
 Simple program to compare variables of wrapper class
 Practical 9 from core java practicals
 @author Mashuk Patel
 */
public class WrapperClass {

	public static void main(String[] args) {
		Integer a=new Integer(30);
		Integer b=new Integer(30);
		if(a.equals(b)) {
			System.out.println("Both the variables are same.");
		}
		else {
			System.out.println("Both the variables are not same.");
		}
	}
	
}
