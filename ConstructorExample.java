package com.main;

/**
 Simple program to demonstrate the use of default / parameterized constructor
 Practical 7 from core java practicals
 @author Mashuk Patel
 */
public class ConstructorExample {
	
	//default constructor
	public ConstructorExample() {
		System.out.println("This is a default constructor.");
	}
	
	//parameterized constructor
  public ConstructorExample(int length, int breadth) {
		System.out.println("Area of rectangle is : "+(length * breadth));
	}
	
	public static void main(String[] args) {
		ConstructorExample defaultconstructor=new ConstructorExample();
		ConstructorExample parameterizedconstructor=new ConstructorExample(10,20);
	}
	
}
