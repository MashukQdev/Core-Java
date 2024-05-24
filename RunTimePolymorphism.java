package com.oops;

/**
 Simple program to demonstrate use of runtime polymorphism
 Practical 16 from OOPS concept practicals
 @author Mashuk Patel
 */

/**
 This class contain a method to display a message on console 
 */
class Electronics {
	
	/**
	 It display a statement showing electronic computer name
	 @param name The name of the computer
	 */
	public void computer(String name) {
		System.out.println("Electronic Computer name is : " + name);
	}
	
}

/**
 This class contain a method to display a message on console
*/
class Appliances extends Electronics{
	
	/**
	 It display a statement showing appliances computer name
	 @param name The name of the computer
	 */
	public void computer(String name) {
		System.out.println("Appliances computer name is : " + name);
	}
	
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Electronics e1 = new Appliances();
		e1.computer("Mac");
	}
	
}
