package com.oops;

/**
 Simple program to demonstrate use of encapsulation
 Practical 14 from OOPS concept practicals
 @author Mashuk Patel
 */
class EncapsulatedClass {
	
	private String name;
	
	/**
	 Getter method
	 @return String value that is set
	 */
	public String getName() {
		return name;
	}
	
	/**
	 Setter method
	 @param name It takes input name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
public class Encapsulation {
	
	public static void main(String[] args) {
		EncapsulatedClass demo = new EncapsulatedClass();
		
		demo.setName("Mashuk Patel");    // set value to string variable 
		System.out.println(demo.getName());  // getting value from string variable and printing
	}

}
