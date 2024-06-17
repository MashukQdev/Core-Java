package com.main;

/**
 Simple program to demonstrate use of this keyword
 Practical 11 from core java practicals
 @author Mashuk Patel 
 */
public class ThisKeyword {

	private String name;
	private int id;
	
	/**
	 Constructor of class ThisKeyword
	 Initializes the instance variables 'name' and 'id' using constructor parameters with the same names
	 @param name Name of object
	 @param id Id of object
	 */
	public ThisKeyword(String name, int id) {
		// we use this keyword when parameters and instance variable are same 
		this.name=name;
		this.id=id;
	}
	
	public static void main(String[] args) {
		ThisKeyword keyword = new ThisKeyword("Mashuk", 7);
		
		System.out.println(keyword.name);   // print name of object
		
		System.out.println(keyword.id);     // print id of object
	}									
	
}
