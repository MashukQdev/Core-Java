package com.main;

/**
 Simple program to demonstrate use of this keyword
 Practical 11 from core java practicals
 @author Mashuk Patel 
 */
public class ThisKeyword {

	private String name;
	private int id;
	
	public ThisKeyword(String name, int id) {
		// we use this keyword when parameters and instance variable are same 
		this.name=name;
		this.id=id;
	}
	
	public static void main(String[] args) {
		ThisKeyword keyword = new ThisKeyword("Mashuk", 7);
		System.out.println(keyword.name);
		System.out.println(keyword.id);
	}									
	
}
