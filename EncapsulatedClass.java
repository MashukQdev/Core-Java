package com.main;

/**
 Simple program to demonstrate use of encapsulation
 Practical 14 from OOPS concept practicals
 @author Mashuk Patel
 */
class EncapsulatedClass {
	
	private String name;
	
	/**
	 getter method
	 @return string value that is set
	 */
	public String getName() {
		return name;
	}
	
	/**
	 setter method
	 @param name it takes input name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		EncapsulatedClass demo = new EncapsulatedClass();
		demo.setName("Mashuk Patel");
		System.out.println(demo.getName());
	}
	
}
